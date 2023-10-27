package soal.generator.csharp

import soal.model.RootSoalModel
import java.util.List
import soal.generator.GeneratedFile
import java.util.ArrayList
import soal.model.Service
import soal.model.OperationKind
import soal.model.Operation

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
			        private «parentName».Common.I«service.interface»Service _service;
			
			        public «service.name»Controller(«parentName».Common.«service.interface»Service service)
			        {
			            _service = service;
			        }
			
			        «FOR op : typeAnalysis.getOperations(service.interface)»
			        	«switch op.kind {
						  case OperationKind.INSERT : generatePostMethod()
						  case OperationKind.DELETE : generateDeleteMethod()
						  case OperationKind.GET : generateGetMethod()
						  case OperationKind.GET_ALL : generateGet_AllMethod()
						  case OperationKind.RPC : generateRpcMethod()
						  case OperationKind.UPDATE : generatePutMethod()
						  default : throw new Exception(op.kind.toString() + " is not known")
						}»
			        	@PostMapping(path = "/«op.name»", consumes = "application/json", produces = "application/json")
			        	public «op.name»Response «op.name.toCamelCase»(@RequestBody «op.name»Request __request) {
			        	    «IF op.hasRequestParameters»
			        	    	«FOR param: op.requestParameters.parameters»
			        	    		«generateTypeRef(param.type, false)» «param.name.toCamelCase» = __request.«param.name.toGetterName»();
			        	    	«ENDFOR»
			        	    «ENDIF»
			        	    «IF !op.hasResponseParameters»
			        	    	_service.«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
			        	    «ELSEIF op.hasSingleResponseParameter»
			        	    	«IF op.singleReturnType.isCustomType»«parentName».common.«ENDIF»«generateTypeRef(op.singleReturnType, false)» __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
			        	    	«op.name»Response __response = new «op.name»Response();
			        	    	«IF op.singleReturnType.isCustomType»
			        	    		__response.setResult(«generateTypeRef(op.singleReturnType, false)».fromCommon(__result));
			        	    	«ELSE»
			        	    		__response.setResult(__result);
			        	    	«ENDIF»
			        	    	return __response;
			        	    «ELSE»
			        	    	«op.name»Return __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
			        	    	«op.name»Response __response = new «op.name»Response();
			        	    	«FOR param: op.responseParameters.parameters»
			        	    		__response.«param.name.toSetterName»(__result.«param.name.toGetterName»());
			        	    	«ENDFOR»
			        	    	return __response;
			        	    «ENDIF»
			        	}
			        	
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
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generateGetMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generateDeleteMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def generatePostMethod(Operation op) {
		'''
			[Route("api/[controller]")]
						        	public «op.name»Response «op.name.toCamelCase»(@RequestBody «op.name»Request __request) {
						        	    «IF op.hasRequestParameters»
						        	    	«FOR param: op.requestParameters.parameters»
						        	    		«generateTypeRef(param.type, false)» «param.name.toCamelCase» = __request.«param.name.toGetterName»();
						        	    	«ENDFOR»
						        	    «ENDIF»
						        	    «IF !op.hasResponseParameters»
						        	    	_service.«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
						        	    «ELSEIF op.hasSingleResponseParameter»
						        	    	«IF op.singleReturnType.isCustomType»«parentName».common.«ENDIF»«generateTypeRef(op.singleReturnType, false)» __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
						        	    	«op.name»Response __response = new «op.name»Response();
						        	    	«IF op.singleReturnType.isCustomType»
						        	    		__response.setResult(«generateTypeRef(op.singleReturnType, false)».fromCommon(__result));
						        	    	«ELSE»
						        	    		__response.setResult(__result);
						        	    	«ENDIF»
						        	    	return __response;
						        	    «ELSE»
						        	    	«op.name»Return __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
						        	    	«op.name»Response __response = new «op.name»Response();
						        	    	«FOR param: op.responseParameters.parameters»
						        	    		__response.«param.name.toSetterName»(__result.«param.name.toGetterName»());
						        	    	«ENDFOR»
						        	    	return __response;
						        	    «ENDIF»
						        	}
						        	
		'''
	}

}
