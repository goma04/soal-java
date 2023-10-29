package soal.generator.csharp

import soal.model.RootSoalModel
import java.util.List
import soal.generator.GeneratedFile
import soal.model.Service

class CsharpClientGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		for (service : services) {
			result.add(new GeneratedFile(parentName + "", service.name + ".cs", generateClient(service), true))
			result.add(
				new GeneratedFile(parentName + "", service.name + "ClientFactory.cs", generateClientFactory(service),
					false))
		}
		return result
	}

	def generateClient(Service service) {
		'''
			using «parentName».Common
			
			
			namespace «parentName».Client
			{
				public class «service.name» : «service.interface.name» {
				   private «service.interface.name» _client;
				
				    public Hello()
				    {
				         client = new «service.name»ClientFactory().Create();
				    }
				
					 «FOR op : typeAnalysis.getOperations(service.interface)»
					 	public async «generateAsyncOperationSignature(service.interface, op)» {
					 	    «IF op.hasResponseParameters»
					 	    	return await client.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
					 	    «ELSE»
					 	    	client.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
					 	    «ENDIF»
					 	}				 	
				«ENDFOR»				 
				}
			}
		'''
	}

	def generateClientFactory(Service service) {
		'''
			using «parentName».Common.«service.interface.name»;
			using «parentName»Rest.Client.«service.name»Client;
			
			namespace «parentName».Client
			{
			    class «service.name»ClientFactory : «service.interface.name»Factory {
			
			    public «service.interface.name» Create() {
			        return new «service.name»Client("http://localhost:8080");
			    }
			
			}
			}
			
		'''
	}

}
