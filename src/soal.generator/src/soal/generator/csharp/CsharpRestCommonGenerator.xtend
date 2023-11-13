package soal.generator.csharp

import java.util.List
import soal.generator.GeneratedFile
import soal.model.ArrayType
import soal.model.EnumType
import soal.model.Interface
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.StructType

class CsharpRestCommonGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		for (enumType : typeAnalysis.enumTypes) {
			result.add(new GeneratedFile(parentName, enumType.name + ".cs", generateEnumType(enumType), true))
		}
		for (structType : typeAnalysis.structTypes) {
			result.add(
				new GeneratedFile(parentName + "/rest/common", structType.name + ".cs", generateStructType(structType),
					true))
		}
		for (intf : interfaces) {
			for (op : typeAnalysis.getOperations(intf)) {
				result.add(
					new GeneratedFile(parentName, op.name + "Request.cs", generateOperationRequest(intf, op), true))
				result.add(
					new GeneratedFile(parentName, op.name + "Response.cs", generateOperationResponse(intf, op), true))
			}
		}
		return result
	}

	private def generateEnumType(EnumType type) {
		'''
			using System.Text.Json.Serialization;
			
			namespace «parentName»Rest.Common
			{
				[JsonConverter(typeof(JsonStringEnumConverter))]
				public enum «type.name» {
						«FOR lit : type.literals SEPARATOR ", "»«lit.name.toUpperCase»«ENDFOR»
				}
				
				public static class Extensions
				    {
				        public static «parentName».Common.«type.name»  ToCommon(this «type.name»  value)
				        {
				            switch (value)
				            {
				            	«FOR lit : type.literals»
				            		case «type.name».«lit.name.toUpperCase»:
				            			return «parentName».Common.«type.name».«lit.name.toUpperCase»;
				            	«ENDFOR»
				            	default:
				            	    throw new ArgumentException("Invalid enum value");
				            }
				        }
				
						public static «type.name»  FromCommon(this «parentName».Common.«type.name» value)
				        {
				            switch (value)
				            {
				            	«FOR lit : type.literals»
				            		case «parentName».Common.«type.name».«lit.name.toUpperCase»:
				            			return «type.name».«lit.name.toUpperCase»;
				            	«ENDFOR»
				            	default:
				            	    throw new ArgumentException("Invalid enum value");
				            }
				        }
				    }
			}
		'''
	}

	private def generateStructType(StructType type) {
		'''
			namespace «parentName»Rest.Common
			{
				public class «type.name»«IF type.baseType !== null» extends «generateTypeRef(type.baseType, false)»«ENDIF» {
					«generateProperties(type.fields)»
				
					public «parentName».Common.«type.name» ToCommon() {
					    «parentName».Common.«type.name» result = new «parentName».Common.«type.name»();
					    «FOR field : type.fields»
					    	«IF field.type instanceof ArrayType»
					    		result.«field.name.toPropertyName».AddRange(«field.name.toPropertyName»);
					    	«ELSE»
					    		result.«field.name.toPropertyName» = «field.name.toPropertyName»;
					    	«ENDIF»
					    «ENDFOR»
					    return result;
						}
						
					public static «type.name» FromCommon(«parentName».Common.«type.name» value) {
					   if (value == null) return null;
					   «type.name» result = new «type.name»();
					   «FOR field : type.fields»
					   	«IF field.type instanceof ArrayType»
					   		result.«field.name.toPropertyName».AddRange(value.«field.name.toPropertyName»);
					   	«ELSE»
					   		result.«field.name.toPropertyName» = value.«field.name.toPropertyName»;
					   	«ENDIF»
					   «ENDFOR»
					   return result;
					}
				}
			}
		'''
	}

	private def generateOperationRequest(Interface intf, Operation op) {
		'''
			namespace «parentName»Rest.Common
			{
				public class «op.name»Request {
					«IF op.hasRequestParameters»
						«generateProperties(op.requestParameters.parameters)»
					«ENDIF»
				}
			}
		'''
	}

	private def generateOperationResponse(Interface intf, Operation op) {
		'''
			namespace «parentName»Rest.Common
			{
				public class «op.name»Response {
					«IF op.hasResponseParameters»
						«generateProperties(op.responseParameters.parameters)»
					«ENDIF»
					}
			}
		'''
	}

}
