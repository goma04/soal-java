package soal.generator.rest

import soal.generator.InterfaceKind
import soal.model.ArrayType
import soal.model.BuiltInType
import soal.model.BuiltInTypeKind
import soal.model.EnumType
import soal.model.NullableType
import soal.model.RootSoalModel
import soal.model.SimpleTypeReference
import soal.model.StructType
import soal.model.Type
import soal.model.TypeReference

class OpenApiGenerator_3_1 extends OpenApiGenerator_3 {

    new (RootSoalModel model, InterfaceKind interfaceKind) {
        super(model, interfaceKind)
    }

    override generateOpenApiVersion() {
        '''3.1.0'''
    }

    override generateTypeRef(Type type) {
        generateTypeRef(type, false)
    }

    override generateSchema() {
        val enums = declarations.filter(EnumType)
        val structs = declarations.filter(StructType)
        if (enums.size == 0 && structs.size == 0) return '''''';
        '''
        components:
          schemas:
            «FOR enm: enums»
            «generateEnum(enm)»
            «ENDFOR»
            «FOR struct: structs»
            «generateStruct(struct)»
            «ENDFOR»
        '''
    }

    def generateEnum(EnumType type) {
        '''
        «type.name»:
          type: string
          enum:
          «FOR el: type.literals»
          - «el.name»
          «ENDFOR»
        '''
    }

    def generateStruct(StructType type) {
        '''
        «type.name»:
          «IF type.baseType !== null»
          allOf:
          - $ref: '#/components/schemas/«type.baseType.name»'
          - type: object
            «generateProperties(type.fields, false)»
          «ELSE»
          type: object
          «generateProperties(type.fields, true)»
          «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(TypeReference typeRef, boolean dashPrefix) {
        '''
        ERROR: unhandled TypeReference: «typeRef.class»
        '''
    }

    def dispatch String generateTypeRef(SimpleTypeReference typeRef, boolean dashPrefix) {
        '''
        «generateTypeRef(typeRef.referencedType, dashPrefix)»
        '''
    }

    def dispatch String generateTypeRef(Type type, boolean dashPrefix) {
        '''
        ERROR: unhandled Type: «type.class»
        '''
    }

    def dispatch String generateTypeRef(BuiltInType type, boolean dashPrefix) {
        val prefix = getPrefix(dashPrefix)
        '''
        «""»
        «IF type.kind == BuiltInTypeKind.OBJECT»
        «prefix»type: object
        «ELSEIF type.kind == BuiltInTypeKind.BINARY»
        «prefix»type: string
          format: byte
        «ELSEIF type.kind == BuiltInTypeKind.BOOL»
        «prefix»type: boolean
        «ELSEIF type.kind == BuiltInTypeKind.STRING»
        «prefix»type: string
        «ELSEIF type.kind == BuiltInTypeKind.INT»
        «prefix»type: integer
          format: int32
        «ELSEIF type.kind == BuiltInTypeKind.LONG»
        «prefix»type: integer
          format: int64
        «ELSEIF type.kind == BuiltInTypeKind.FLOAT»
        «prefix»type: number
          format: float
        «ELSEIF type.kind == BuiltInTypeKind.DOUBLE»
        «prefix»type: number
          format: double
        «ELSEIF type.kind == BuiltInTypeKind.DATE»
        «prefix»type: string
          format: date
        «ELSEIF type.kind == BuiltInTypeKind.TIME»
        «prefix»type: string
          format: time
        «ELSEIF type.kind == BuiltInTypeKind.DATETIME»
        «prefix»type: string
          format: date-time
        «ELSEIF type.kind == BuiltInTypeKind.DURATION»
        «prefix»type: string
          format: duration
        «ELSE»
        «prefix»ERROR: invalid built-in type: «type.kind»
        «ENDIF»
        «""»
        '''
    }

    def dispatch String generateTypeRef(EnumType type, boolean dashPrefix) {
        val prefix = getPrefix(dashPrefix)
        '''
        «""»
        «prefix»$ref: '#/components/schemas/«type.name»'
        «""»
        '''
    }

    def dispatch String generateTypeRef(StructType type, boolean dashPrefix) {
        val prefix = getPrefix(dashPrefix)
        val descendants = typeAnalysis.getDescendantTypes(type)
        '''
        «""»
        «IF descendants.size > 0»
        «prefix»oneOf:
          - $ref: '#/components/schemas/«type.name»'
          «FOR descendant: descendants»
          - $ref: '#/components/schemas/«descendant.name»'
          «ENDFOR»
        discriminator:
          propertyName: _type
        «ELSE»
        «prefix»$ref: '#/components/schemas/«type.name»'
        «""»
        «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(ArrayType typeRef, boolean dashPrefix) {
        val prefix = getPrefix(dashPrefix)
        '''
        «""»
        «prefix»type: array
          items:
          «generateTypeRef(typeRef.innerType, false)»
        «""»
        '''
    }

    def dispatch String generateTypeRef(NullableType typeRef, boolean dashPrefix) {
        val prefix = getPrefix(dashPrefix)
        '''
        «prefix»oneOf:
          - type: 'null'
          «generateTypeRef(typeRef.innerType, true)»
        '''
    }

    def private getPrefix(boolean dashPrefix) {
        dashPrefix ? "- " : "  "
    }

}