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

class OpenApiGenerator_3_0 extends OpenApiGenerator_3 {

    new (RootSoalModel model, InterfaceKind interfaceKind) {
        super(model, interfaceKind)
    }

    override generateOpenApiVersion() {
        '''3.0.0'''
    }

    override generateTypeRef(Type type) {
        '''
        «""»
          «generateTypeRef(type, false)»
        «""»
        '''
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
        «IF typeAnalysis.nullableTypes.contains(type)»
        Nullable«type.name»:
          allOf:
          - $ref: '#/components/schemas/«type.name»'
          - type: string
            nullable: true
        «ENDIF»
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
        «IF typeAnalysis.nullableTypes.contains(type)»
        Nullable«type.name»:
          allOf:
          - $ref: '#/components/schemas/«type.name»'
          - type: object
            nullable: true
        «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(TypeReference typeRef, boolean nullable) {
        '''
        ERROR: unhandled TypeReference: «typeRef.class»
        '''
    }

    def dispatch String generateTypeRef(SimpleTypeReference typeRef, boolean nullable) {
        '''
        «generateTypeRef(typeRef.referencedType, nullable)»
        '''
    }

    def dispatch String generateTypeRef(Type type, boolean nullable) {
        '''
        ERROR: unhandled Type: «type.class»
        '''
    }

    def dispatch String generateTypeRef(BuiltInType type, boolean nullable) {
        '''
        «IF type.kind == BuiltInTypeKind.OBJECT»
        type: object
        «ELSEIF type.kind == BuiltInTypeKind.BINARY»
        type: string
        format: byte
        «ELSEIF type.kind == BuiltInTypeKind.BOOL»
        type: boolean
        «ELSEIF type.kind == BuiltInTypeKind.STRING»
        type: string
        «ELSEIF type.kind == BuiltInTypeKind.INT»
        type: integer
        format: int32
        «ELSEIF type.kind == BuiltInTypeKind.LONG»
        type: integer
        format: int64
        «ELSEIF type.kind == BuiltInTypeKind.FLOAT»
        type: number
        format: float
        «ELSEIF type.kind == BuiltInTypeKind.DOUBLE»
        type: number
        format: double
        «ELSEIF type.kind == BuiltInTypeKind.DATE»
        type: string
        format: date
        «ELSEIF type.kind == BuiltInTypeKind.TIME»
        type: string
        format: time
        «ELSEIF type.kind == BuiltInTypeKind.DATETIME»
        type: string
        format: date-time
        «ELSEIF type.kind == BuiltInTypeKind.DURATION»
        type: string
        format: duration
        «ELSE»
        ERROR: invalid built-in type: «type.kind»
        «ENDIF»
        «IF nullable»
        nullable: true
        «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(EnumType type, boolean nullable) {
        '''
        $ref: '#/components/schemas/«IF nullable»Nullable«ENDIF»«type.name»'
        '''
    }

    def dispatch String generateTypeRef(StructType type, boolean nullable) {
        val descendants = typeAnalysis.getDescendantTypes(type)
        '''
        «IF descendants.size > 0»
        oneOf:
        - $ref: '#/components/schemas/«IF nullable»Nullable«ENDIF»«type.name»'
        «FOR descendant: descendants»
        - $ref: '#/components/schemas/«IF nullable»Nullable«ENDIF»«descendant.name»'
        «ENDFOR»
        discriminator:
          propertyName: _type
        «ELSE»
        $ref: '#/components/schemas/«IF nullable»Nullable«ENDIF»«type.name»'
        «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(ArrayType typeRef, boolean nullable) {
        '''
        type: array
        «IF nullable»
        nullable: true
        «ENDIF»
        items:
          «generateTypeRef(typeRef.innerType, false)»
        '''
    }

    def dispatch String generateTypeRef(NullableType typeRef, boolean nullable) {
        '''
        «generateTypeRef(typeRef.innerType, true)»
        '''
    }
}
