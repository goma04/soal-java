package soal.generator.csharp

import java.util.List
import soal.generator.GeneratedFile
import soal.model.RootSoalModel
import soal.model.Service

class CsharpServiceGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		for (service : services) {
			result.add(new GeneratedFile(parentName, service.name + ".cs", generateService(service), false))
			result.add(
				new GeneratedFile(parentName, service.name + "ServiceFactory.cs", generateServiceFactory(service),
					false))
		}
		return result
	}

	def generateService(Service service) {
		'''
			using «parentName».Common;
			
			namespace «parentName».Service
			{
				public class «service.name» : «service.interface.name» {
				 «FOR op : typeAnalysis.getOperations(service.interface)»
				 	public async «generateAsyncOperationSignature(service.interface, op)» {
				 	    throw new NotSupportedException("This operation is not implemented.");
				 	}
				 «ENDFOR»				
				} 				
			}
		'''
	}

	def generateServiceFactory(Service service) {
		'''
			using «parentName».Common;
						
			namespace «parentName».Service
			{
				public class «service.name»ServiceFactory : «service.interface.name»Factory 
				{
			       public «service.interface.name» Create() {
			            return new «service.name»();
			       }
			    }		
			}
			
		'''
	}

}
