package soal.generator.csharp

import java.util.List
import soal.generator.GeneratedFile
import soal.model.RootSoalModel
import soal.model.Service

class CsharpRestClientGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		for (service : services) {
			result.add(new GeneratedFile(parentName, service.name + "Client.cs", generateClient(service), true))
		}
		return result
	}

	def generateClient(Service service) {
		'''        
			using «parentName».Common;
			using System.Net.Http.Headers;
			using System.Text;
			using System.Text.Json;
			
			namespace «parentName»Rest.Client
			{
				 public class «service.name»Client : «service.interface.name» {
				    private string _baseUri;
				    private HttpClient _client;
				
				    public «service.name»Client(String baseUri) {
				    	_client = new HttpClient()
				       {
				          BaseAddress = new Uri(baseUri),
				       };
				       _baseUri = baseUri;
				       _client.DefaultRequestHeaders.Accept.Clear();
				       _client.DefaultRequestHeaders.Accept.Add(
				          new MediaTypeWithQualityHeaderValue("application/json"));
				       }
						
			
			     «FOR op : typeAnalysis.getOperations(service.interface)»
			     	public async «generateAsyncOperationSignature(service.interface, op)» {
			     	    «parentName»Rest.Common.«op.name»Request __request = new «parentName»Rest.Common.«op.name»Request();
			     	    «IF op.hasRequestParameters»
			     	    	«FOR param: op.requestParameters.parameters»
			     	    		«IF param.type.isCustomType»
			     	    			«IF param.type.isEnumType»
			     	    			    __request.«param.name.toPropertyName» = «parentName»Rest.Common.Extensions.FromCommon(«param.name»);	     	    			
			     	    			«ELSE»
			     	    				__request.«param.name.toPropertyName» = «parentName»Rest.Common.«generateTypeRef(param.type, false)».FromCommon(«param.name»);	
			     	    			«ENDIF»
			     	    		«ELSE»
			     	    			__request.«param.name.toPropertyName» = «param.name»;
			     	    		«ENDIF»
			     	    	«ENDFOR»
			     	    «ENDIF»
			     	    string jsonBody = JsonSerializer.Serialize(__request);
			     	    HttpContent content = new StringContent(jsonBody, Encoding.UTF8, "application/json");
			     	    HttpResponseMessage __response = await _client.PostAsync($"{_baseUri}/«service.name»/«op.name»", content);
			     	    string responseBody = await __response.Content.ReadAsStringAsync();
			     	    var options = new JsonSerializerOptions
			     	     {
			     	        PropertyNameCaseInsensitive = true
			     	     };		     	                
			     	               
			     	    «IF !op.hasResponseParameters»
			     	    «ELSEIF op.hasSingleResponseParameter»
			     	    	«IF op.singleReturnType.isCustomType»
			     	    		«parentName»Rest.Common.«generateTypeRef(op.singleReturnType, false)» __result = JsonSerializer.Deserialize<«parentName»Rest.Common.«op.name»Response>(responseBody, options).Result;
			     	    		return __result.ToCommon();
			     	    	«ELSE»
			     	    		«generateTypeRef(op.singleReturnType, false)» __result = JsonSerializer.Deserialize<«parentName»Rest.Common.«op.name»Response>(responseBody, options).Result;
			     	    		return __result;
			     	    	«ENDIF»
			     	    «ELSE»
			     	    	TODO: Multiple return parameters.
			     	    «ENDIF»
			     	}
				
				«ENDFOR»
				}
			}
		'''
	}

}
