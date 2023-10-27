package soal.generator.csharp

import soal.generator.GeneratorBase
import soal.model.ArrayType
import soal.model.BuiltInType
import soal.model.BuiltInTypeKind
import soal.model.EnumType
import soal.model.Interface
import soal.model.NullableType
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.SimpleTypeReference
import soal.model.StructType
import soal.model.Type
import soal.model.TypeReference
import soal.model.Variable

class CsharpGeneratorBase extends GeneratorBase{
	String _parentName
   	CsharpGeneratorConfiguration _configuration
    
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
        super(model, name)
        _parentName = name.toLowerCase
        _configuration = configuration
    }
    
    def getConfiguration() { _configuration }
    def getParentName() { _parentName }
    
    def static String toFieldName(String identifier) {
        if (identifier === null || identifier.length == 0) return identifier;
        return "_"+identifier.toCamelCase;
    }

    def static String toGetterName(String identifier) {
        if (identifier === null || identifier.length == 0) return identifier;
        return "get"+identifier.toPascalCase;
    }

    def static String toSetterName(String identifier) {
        if (identifier === null || identifier.length == 0) return identifier;
        return "set"+identifier.toPascalCase;
    }

    def static String toCamelCase(String identifier) {
        if (identifier === null || identifier.length == 0) return identifier;
        return identifier.substring(0, 1).toLowerCase+identifier.substring(1)
    }

    def static String toPascalCase(String identifier) {
        if (identifier === null || identifier.length == 0) return identifier;
        return identifier.substring(0, 1).toUpperCase+identifier.substring(1)
    }

    def dispatch String generateTypeRef(TypeReference typeRef, boolean nullable) {
        '''
        ERROR: unhandled TypeReference: «typeRef.class»
        '''
    }

    def dispatch String generateTypeRef(SimpleTypeReference typeRef, boolean nullable) {
        '''«generateTypeRef(typeRef.referencedType, nullable)»'''
    }

    def dispatch String generateTypeRef(Type type, boolean nullable) {
        '''
        ERROR: unhandled Type: «type.class»
        '''
    }

    def dispatch String generateTypeRef(BuiltInType type, boolean nullable) {
        if (type.kind == BuiltInTypeKind.OBJECT) return "Object"
        else if (type.kind == BuiltInTypeKind.BINARY) return "byte[]"
        else if (type.kind == BuiltInTypeKind.BOOL) return nullable ? "Boolean" : "boolean"
        else if (type.kind == BuiltInTypeKind.STRING) return "String"
        else if (type.kind == BuiltInTypeKind.INT) return nullable ? "Integer" : "int"
        else if (type.kind == BuiltInTypeKind.LONG) return nullable ? "Long" : "long"
        else if (type.kind == BuiltInTypeKind.FLOAT) return nullable ? "Float" : "float"
        else if (type.kind == BuiltInTypeKind.DOUBLE) return nullable ? "Double" : "double"
        else if (type.kind == BuiltInTypeKind.DATE) return "LocalDate"
        else if (type.kind == BuiltInTypeKind.TIME) return "LocalTime"
        else if (type.kind == BuiltInTypeKind.DATETIME) return "LocalDateTime"
        else if (type.kind == BuiltInTypeKind.DURATION) return "Duration"
        else return "ERROR: invalid built-in type: "+type.kind
    }

    def dispatch String generateTypeRef(EnumType type, boolean nullable) {
        '''«type.name»'''
    }

    def dispatch String generateTypeRef(StructType type, boolean nullable) {
        '''«type.name»'''
    }

    def dispatch String generateTypeRef(ArrayType typeRef, boolean nullable) {
        '''List<«generateTypeRef(typeRef.innerType, true)»>'''
    }

    def dispatch String generateTypeRef(NullableType typeRef, boolean nullable) {
        '''«generateTypeRef(typeRef.innerType, true)»'''
    }

    def generateOperationSignature(Interface type, Operation op) {
        '''«generateReturnType(type, op)» «op.name.toPascalCase»(«generateParameters(type, op)»)'''
    }

    def generateReturnType(Interface type, Operation op) {
        if (!op.hasResponseParameters) return "void"
        else if (op.hasSingleResponseParameter) return generateTypeRef(op.singleReturnType, false)
        else return op.name+"Return"
    }

    def generateParameters(Interface type, Operation op) {
        if (!op.hasRequestParameters) return ''''''
        else return '''«FOR param: op.requestParameters.parameters SEPARATOR ", "»«generateTypeRef(param.type, false)» «param.name.toCamelCase»«ENDFOR»'''
    }

    def generateArguments(Interface type, Operation op) {
        if (!op.hasRequestParameters) return ''''''
        else return '''«FOR param: op.requestParameters.parameters SEPARATOR ", "»«param.name.toCamelCase»«ENDFOR»'''
    }

    def generateFieldsAndAccessors(Iterable<? extends Variable> fields) {
        '''
        «FOR field: fields»
        «generateField(field.type, field.name ?: "result")»
        «ENDFOR»

        «FOR field: fields»
        «generateAccessors(field.type, field.name ?: "result")»
        «ENDFOR»
        '''
    }

    def generateField(Type type, String name) {
        '''private «generateTypeRef(type, false)» «name.toFieldName»;'''
    }

    def generateAccessors(Type type, String name) {
        '''
        «IF type instanceof ArrayType»
        public «generateTypeRef(type, false)» «name.toGetterName»() {
            if («name.toFieldName» == null) «name.toFieldName» = new Array«generateTypeRef(type, false)»();
            return «name.toFieldName»;
        }

        «ELSE»
        public «generateTypeRef(type, false)» «name.toGetterName»() {
            return «name.toFieldName»;
        }

        public void «name.toSetterName»(«generateTypeRef(type, false)» value) {
            «name.toFieldName» = value;
        }

        «ENDIF»
        '''
    }

    def static isCustomType(Type type) {
        return !(type instanceof BuiltInType)
    }
}