package soal.generator.doc

import soal.generator.GeneratorBase
import soal.model.ArrayType
import soal.model.BuiltInType
import soal.model.DocumentationTagKind
import soal.model.EnumLiteral
import soal.model.EnumType
import soal.model.Interface
import soal.model.NullableType
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.SimpleTypeReference
import soal.model.StructType
import soal.model.Type
import soal.model.TypeReference
import soal.model.Variable

class HtmlGenerator extends GeneratorBase {
    new (RootSoalModel model, String name) {
    	super(model, name)
    }

    def generate() {
    	'''
		<html>
			<head>
				<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
				<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
				<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
				<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
				<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
				<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js" integrity="sha512-6PM0qYu5KExuNcKt5bURAoT6KCThUmHRewN3zUFNaoI6Di7XJPTMoT6K0nsagZKk2OB4L7E3q1uQKHNHd4stIQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
				<style>
					.card-header .fa {
					  transition: .3s transform ease-in-out;
					}
					.card-header .collapsed .fa {
					  transform: rotate(90deg);
					}
				</style>    		
			</head>
			<body>
				<div class="m-5">
					<h1>«name»</h1>
					<h2>Services</h2>
					«FOR svc: services»
					«generateService(svc)»
					«ENDFOR»
					<h2>Interfaces</h2>
					«FOR intf: interfaces»
					«generateInterface(intf)»
					«ENDFOR»
					<h2>Data types</h2>
					«FOR type: model.declarations.filter(EnumType)»
					«generateEnumType(type)»
					«ENDFOR»
					«FOR type: model.declarations.filter(StructType)»
					«generateStructType(type)»
					«ENDFOR»
				</div>
			</body>
		</html>
    	'''
	}
	
	def generateService(Service svc) {
		val summary = svc.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
		val intf = svc.interface
		'''
		<div class="card">
			<div class="card-body">
				<h3 class="card-title" id="«svc.uniqueName»">«svc.name»«IF intf !== null»: <a href="#«intf.uniqueName»">«intf.name»</a>«ENDIF»</h3>
				<div class="card-text">
					«summary»
				</div>
			</div>
		</div>
		'''
	}	
	
	def generateInterface(Interface intf) {
		val summary = intf.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
		'''
		<div class="card">
			<div class="card-body">
				<h3 class="card-title" id="«intf.uniqueName»">«intf.name»</h3>
				<div class="card-text">
					«summary»
					«generateInterfaceOperations(intf)»
				</div>
			</div>
		</div>
		'''
	}	

    def generateInterfaceOperations(Interface intf) {
        '''
        <div id="accordion-«intf.uniqueName»" role="tablist" aria-multiselectable="true">
	        «FOR op: intf.operations»
			«generateOperation(intf, op)»
	        «ENDFOR»
	        «FOR res: intf.resources»
	            «FOR op: typeAnalysis.getOperations(res)»
			    «generateOperation(intf, op)»
	            «ENDFOR»
	        «ENDFOR»
        </div>
        '''
    }

    def generateOperation(Interface intf, Operation op) {
		val summary = op.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
        '''
		<div class="card">
			<h4 class="card-header" role="tab" id="header-«op.uniqueName»">
				<a data-toggle="collapse" data-parent="#accordion-«intf.uniqueName»" href="#body-«op.uniqueName»" aria-expanded="true" aria-controls="body-«op.uniqueName»" class="d-block">
				«op.name»
				    <i class="fa fa-chevron-down pull-right"></i>
				</a>
			</h4>
			<div id="body-«op.uniqueName»" class="collapse show" role="tabpanel" aria-labelledby="header-«op.uniqueName»">
				<div class="card-body">
					«summary»
					«generateVariables(op.requestParameters.parameters)»
			        «IF !op.async»
					    «generateVariables(op.responseParameters.parameters)»
			        «ENDIF»
				</div>
			</div>
		</div>
        '''
    }
	
	def generateEnumType(EnumType type) {
		val summary = type.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
		'''
		<h3 id="«type.uniqueName»">«type.name»</h3>
		«summary»
		<dl class="row">
			«FOR elit: type.literals»
			«generateEnumLiteral(elit)»: 
			«ENDFOR»
		</dl>
		'''
	}	
	
	def generateEnumLiteral(EnumLiteral elit) {
		val summary = elit.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
		'''
		<dt class="col-sm-3" id="«elit.uniqueName»">«elit.name»: </dt>
		<dd class="col-sm-9">
			«summary» 
		</dd>
		'''
	}	
	
	def generateStructType(StructType type) {
		val summary = type.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html
		'''
		<div class="card">
			<div class="card-body">
				<h3 class="card-title" id="«type.uniqueName»">«type.name»</h3>
				<div class="card-text">
					«summary»
					«generateVariables(type.fields)»
				</div>
			</div>
		</div>
		'''
	}	

    def generateVariables(Iterable<? extends Variable> properties) {
        '''
		<dl class="row">
	        «FOR prop: properties»
			«val propName = properties.size == 1 && prop.name === null ? "returns" : prop.name»
			«val summary = prop.documentation?.tags?.findFirst[it.kind == DocumentationTagKind.SUMMARY]?.html»
			<dt class="col-sm-3" id="«prop.uniqueName»">«propName»: «generateTypeRef(prop.type, propName, false, false)»</dt>
			<dd class="col-sm-9">
				«summary» 
			</dd>
	        «ENDFOR»
		</dl>
        '''
    }
    
    def dispatch String generateTypeRef(TypeReference typeRef, String propName, boolean nullable, boolean array) {
        '''
        ERROR: unhandled TypeReference: «typeRef.class»
        '''
    }

    def dispatch String generateTypeRef(SimpleTypeReference typeRef, String propName, boolean nullable, boolean array) {
        '''
        «generateTypeRef(typeRef.referencedType, propName, nullable, array)»
        '''
    }

    def dispatch String generateTypeRef(Type type, String propName, boolean nullable, boolean array) {
        '''
        ERROR: unhandled Type: «type.class»
        '''
    }

    def dispatch String generateTypeRef(BuiltInType type, String propName, boolean nullable, boolean array) {
        '''
        «type.name»«IF array»[]«ENDIF»«IF nullable»?«ENDIF»
        '''
    }

    def dispatch String generateTypeRef(EnumType type, String propName, boolean nullable, boolean array) {
        '''
        <a href="#«type.uniqueName»">«type.name»</a>«IF array»[]«ENDIF»«IF nullable»?«ENDIF»
        '''
    }

    def dispatch String generateTypeRef(StructType type, String propName, boolean nullable, boolean array) {
        '''
        <a href="#«type.uniqueName»">«type.name»</a>«IF array»[]«ENDIF»«IF nullable»?«ENDIF»
        '''
    }

    def dispatch String generateTypeRef(ArrayType typeRef, String propName, boolean nullable, boolean array) {
        '''
        «generateTypeRef(typeRef.innerType, propName, nullable, true)»
        '''
    }

    def dispatch String generateTypeRef(NullableType typeRef, String propName, boolean nullable, boolean array) {
        '''
        «generateTypeRef(typeRef.innerType, propName, true, array)»
        '''
    }
    
}