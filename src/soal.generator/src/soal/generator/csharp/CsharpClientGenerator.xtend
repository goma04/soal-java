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
			package «parentName».client;
			
			import «parentName».common.«service.interface.name»;
			«FOR type : typeAnalysis.getUsedTypes(service.interface)»
				import «parentName».common.«generateTypeRef(type, false)»;
			«ENDFOR»
			
			public class «service.name» implements «service.interface.name», AutoCloseable {
			    private «service.interface.name» _client;
			
			    private synchronized «service.interface.name» getClient() {
			    if (_client == null) {
			        _client = new «service.name»ClientFactory().create();
			    }
			    return _client;
			    }
			
			    «FOR op : typeAnalysis.getOperations(service.interface)»
				@Override
				public «generateOperationSignature(service.interface, op)» {
				    «IF op.hasResponseParameters»
				    	return getClient().«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
				    «ELSE»
				    	getClient().«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
				    «ENDIF»
				}
			
			    «ENDFOR»
			    @Override
			    public void close() throws Exception {
			    if (_client != null) {
			        ((AutoCloseable)_client).close();
			    }
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
