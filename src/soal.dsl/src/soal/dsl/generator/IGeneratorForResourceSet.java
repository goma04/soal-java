package soal.dsl.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;

public interface IGeneratorForResourceSet extends IGenerator2 {
    void doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);
}
