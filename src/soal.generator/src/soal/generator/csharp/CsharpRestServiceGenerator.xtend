package soal.generator.csharp

import soal.model.RootSoalModel
import java.util.List
import soal.generator.GeneratedFile
import java.util.ArrayList
import soal.model.Service
import soal.model.OperationKind
import soal.model.Operation
import soal.model.Interface

class CsharpRestServiceGenerator extends CsharpRestGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = new ArrayList<GeneratedFile>()
		result.add(new GeneratedFile(parentName, "Program.cs", generateProgram(), false))
		for (service : services) {
			result.add(
				new GeneratedFile(parentName + "/rest/service", service.name + "Controller.cs",
					generateController(service), true))
			result.add(
				new GeneratedFile(parentName + "/rest/service", service.name + "Service.cs", generateService(service),
					true))
		}
		return result

	}

	private def generateProgram() {
		'''
			var builder = WebApplication.CreateBuilder(args);
			
			// Add services to the container.			
			builder.Services.AddControllers();
			builder.Services.AddSwaggerGen();
			
			
			var app = builder.Build();
			
			if (app.Environment.IsDevelopment())
			{
			    app.UseSwagger();
			    app.UseSwaggerUI();
			}
			
			// Configure the HTTP request pipeline.
			
			app.UseHttpsRedirection();
			
			app.UseAuthorization();
			
			app.MapControllers();
			
			app.Run();
			
		'''
	}

	def generateService(Service service) {
		'''
			using «parentName».Common;
			using «parentName».Service;
			
			namespace «parentName»Rest.Service
			{
			    public class «service.name»Service : «service.interface.name»
			    {
			        private «service.interface.name» _service;
			
			        public «service.name»Service()
			        {            
			            _service = new «service.name»ServiceFactory().Create();
			        }			        
			        
			        «FOR op : typeAnalysis.getOperations(service.interface)»
			        	public «generateOperationSignature(service.interface, op)» {
			        	    «IF op.hasResponseParameters»
			        	    	return _servcie.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
			        	    «ELSE»
			        	    	_servcie.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
			        	    «ENDIF»
			        	}
			        	
			        «ENDFOR»
			        
			   }
			}
		'''
	}

	def generateController(Service service) {
		'''
			using «parentName»Rest.Common;
			using «parentName»Rest.Service;
			using Microsoft.AspNetCore.Mvc;
			
			namespace «parentName»Rest.Service
			{
			    [Route("api/[controller]")]
			    public class «service.name»Controller
			    {
			        private «parentName».Common.I«service.name» _service;
			
			        public «service.name»Controller(«parentName».Common.I«service.name» service)
			        {
			            _service = service;
			        }
				
				       «FOR op : typeAnalysis.getOperations(service.interface)»
				       	«switch op.kind {
						  case OperationKind.INSERT : generatePostMethod(op, service)
						  case OperationKind.DELETE : generateDeleteMethod()
						  case OperationKind.GET : generateGetMethod()
						  case OperationKind.GET_ALL : generateGet_AllMethod()
						  case OperationKind.RPC : generatePostMethod(op, service)
						  case OperationKind.UPDATE : generatePutMethod()
						  default : throw new Exception(op.kind.toString() + " is not known")
						}»
				       «ENDFOR»
				    }
				}				
		'''
	}

	def generatePutMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generateRpcMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generateGet_AllMethod() {
		/*'''
			[HttpGet]
			public ActionResult<GetAll«op.name»Response> «op.name.toPascalCase»([FromBody] «op.name»Request request) {
				«IF op.hasRequestParameters»
					«FOR param: op.requestParameters.parameters»
						«generateTypeRef(param.type, false)» «param.name.toCamelCase» = request.«param.name.toPropertyName»;
					«ENDFOR»
				«ENDIF»	
				
				«IF !op.hasResponseParameters»
					service.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
				«ELSEIF op.hasSingleResponseParameter»
					«IF op.singleReturnType.isCustomType»«parentName».Common.«ENDIF»«generateTypeRef(op.singleReturnType, false)» result = _service.«op.name.toPascalCase»(«generateToCommonArguments(service.interface, op)»);
					«op.name»Response response = new «op.name»Response();
					«IF op.singleReturnType.isCustomType»
						response.Response = «generateTypeRef(op.singleReturnType, false)».FromCommon(result);
					«ELSE»
						response.Response = result;
					«ENDIF»
					return response;
				«ELSE»
					«op.name»Return result = _service.«op.name.toPascalCase»(«generateToCommonArguments(service.interface, op)»);
					«op.name»Response response = new «op.name»Response();
					«FOR param: op.responseParameters.parameters»
						response.«param.name.toPropertyName»(result.«param.name.toGetterName»());
					«ENDFOR»
					return response;
				«ENDIF»   
			}			        	
		'''*/
	}

	def generateGetMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generateDeleteMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generatePostMethod(Operation op, Service service) {
		'''
			[HttpPost("/«op.name»")]
			public ActionResult<«op.name»Response> «op.name.toPascalCase»([FromBody] «op.name»Request request) {
				«IF op.hasRequestParameters»
					«FOR param: op.requestParameters.parameters»
						«generateTypeRef(param.type, false)» «param.name.toCamelCase» = request.«param.name.toPropertyName»;
					«ENDFOR»
				«ENDIF»	
				
				«IF !op.hasResponseParameters»
					service.«op.name.toPascalCase»(«generateArguments(service.interface, op)»);
				«ELSEIF op.hasSingleResponseParameter»
					«IF op.singleReturnType.isCustomType»«parentName».Common.«ENDIF»«generateTypeRef(op.singleReturnType, false)» result = _service.«op.name.toPascalCase»(«generateToCommonArguments(service.interface, op)»);
					«op.name»Response response = new «op.name»Response();
					«IF op.singleReturnType.isCustomType»
						response.Result = «generateTypeRef(op.singleReturnType, false)».FromCommon(result);
					«ELSE»
						response.Result = result;
					«ENDIF»
					return response;
				«ELSE»
					«op.name»Return result = _service.«op.name.toPascalCase»(«generateToCommonArguments(service.interface, op)»);
					«op.name»Response response = new «op.name»Response();
					«FOR param: op.responseParameters.parameters»
						response.«param.name.toPropertyName»(result.«param.name.toGetterName»());
					«ENDFOR»
					return response;
				«ENDIF»   
			}			        	
		'''
	}
	
	def generateToCommonArguments(Interface type, Operation op) {
        if (!op.hasRequestParameters) return ''''''
        else return '''«FOR param: op.requestParameters.parameters SEPARATOR ", "»«param.name.toCamelCase»«IF param.type.isCustomType».ToCommon()«ENDIF»«ENDFOR»'''
    }

}
