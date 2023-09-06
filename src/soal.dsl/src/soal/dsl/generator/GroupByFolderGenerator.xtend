package soal.dsl.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import soal.model.RootSoalModel
import soal.model.SoalModel
import soal.model.SoalModelUtils

abstract class GroupByFolderGenerator implements IGeneratorForResourceSet {

    override doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val groups = input.resources.groupBy[it.URI.trimSegments(1)]
        for (folderURI : groups.keySet) {
            val inputModels = groups.get(folderURI).map(r|r.allContents.toIterable.filter(SoalModel)).flatten
            if (!inputModels.empty) {
                val globalModel = SoalModelUtils.getGlobalModel(input)
                val rootModel = new RootSoalModel(globalModel, inputModels)
                doGenerate(input, folderURI, rootModel, fsa, context)
            }
        }
    }

    override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
    }

    override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
    }

    override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
    }

    def void doGenerate(ResourceSet input, URI folderURI, RootSoalModel rootModel, IFileSystemAccess2 fsa, IGeneratorContext context);

}