package soal.generator.csharp

import java.util.List
import soal.generator.GeneratedFile
import soal.model.EnumType
import soal.model.Interface
import soal.model.RootSoalModel
import soal.model.StructType

class CsharpCommonGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		for (enumType : typeAnalysis.enumTypes) {
			result.add(new GeneratedFile(parentName + "", enumType.name + ".cs", generateEnumType(enumType), true))
		}
		for (structType : typeAnalysis.structTypes) {
			result.add(
				new GeneratedFile(parentName + "", structType.name + ".cs", generateStructType(structType), true))
		}
		for (intf : interfaces) {
			result.add(new GeneratedFile(parentName + "", intf.name + ".cs", generateInterfaceType(intf), true))
			result.add(
				new GeneratedFile(parentName + "", intf.name + "Factory.cs", generateFactoryInterfaceType(intf), true))
		}
		return result
	}

	private def generateEnumType(EnumType type) {
		'''
			namespace «parentName».Common
			{
				public enum «type.name» {
				    «FOR lit : type.literals SEPARATOR ", "»«lit.name.toUpperCase»«ENDFOR»
				}
			}
		'''
	}

	private def generateStructType(StructType type) {
		'''
			namespace «parentName».Common
			{
				public class «type.name»«IF type.baseType !== null» : «generateTypeRef(type.baseType, false)»«ENDIF» {
				    «generateProperties(type.fields)»
				}
			}
		'''
	}

	private def generateInterfaceType(Interface type) {
		''' 
			namespace «parentName».Common
			{
				public interface «type.name» {
				«FOR op : typeAnalysis.getOperations(type)»
					«generateOperationSignature(type, op)»;
				«ENDFOR»
			}
		'''
	}

	private def generateFactoryInterfaceType(Interface type) {
		'''
			namespace «parentName».Common
			{
				public interface «type.name»Factory {
				    «type.name» Create();
				}
			}
		'''
	}
}
