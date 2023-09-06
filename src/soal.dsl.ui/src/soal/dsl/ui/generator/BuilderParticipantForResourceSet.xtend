package soal.dsl.ui.generator

import com.google.inject.Inject
import java.util.List
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import soal.dsl.generator.IGeneratorForResourceSet

class BuilderParticipantForResourceSet extends BuilderParticipant {
    @Inject
    ResourceDescriptionsProvider resourceDescriptionsProvider;

    @Inject
    IContainer.Manager containerManager;

    @Inject(optional=true)
    IGeneratorForResourceSet generator;

    protected ThreadLocal<Boolean> buildSemaphor = new ThreadLocal<Boolean>();

    override void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
        buildSemaphor.set(false);
        super.build(context, monitor);
    }

    override void handleChangedContents(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
        super.handleChangedContents(delta, context, fileSystemAccess);
        if (!buildSemaphor.get() && generator !== null) {
            invokeGenerator(delta, context, fileSystemAccess);
        }
    }

    private def void invokeGenerator(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
        buildSemaphor.set(true);
        val Resource resource = context.getResourceSet().getResource(delta.getUri(), true);
        if (shouldGenerate(resource, context)) {
            val IResourceDescriptions index = resourceDescriptionsProvider.createResourceDescriptions();
            val IResourceDescription resDesc = index.getResourceDescription(resource.getURI());
            val List<IContainer> visibleContainers = containerManager.getVisibleContainers(resDesc, index);
            for (IContainer c : visibleContainers) {
                for (IResourceDescription rd : c.getResourceDescriptions()) {
                    context.getResourceSet().getResource(rd.getURI(), true);
                }
            }
            var generatorContext = new GeneratorContext();
            generator.doGenerate(context.getResourceSet(), fileSystemAccess as IFileSystemAccess2, generatorContext);
        }
    }
}
