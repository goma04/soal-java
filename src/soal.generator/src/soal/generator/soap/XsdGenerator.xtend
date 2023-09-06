package soal.generator.soap

import java.util.LinkedHashSet
import java.util.Set
import soal.model.ArrayType
import soal.model.BindingKind
import soal.model.BuiltInType
import soal.model.BuiltInTypeKind
import soal.model.EnumType
import soal.model.Interface
import soal.model.NamedType
import soal.model.NullableType
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.SimpleTypeReference
import soal.model.StructType
import soal.model.Type
import soal.model.TypeReference
import soal.model.Variable
import soal.model.analysis.TypeAnalysis

class XsdGenerator {
    RootSoalModel _model
    TypeAnalysis _typeAnalysis
    boolean _xmlPreamble
    String _targetNamespace
    String _targetPrefix
    Iterable<Service> _services
    Set<Interface> _interfaces

    new (RootSoalModel model, String name, boolean xmlPreamble) {
        _model = model
        _xmlPreamble = xmlPreamble
        _targetNamespace = "http://tempuri.org/TODO/"+name
        _targetPrefix = "tns"
        _typeAnalysis = _model.typeAnalysis
        _services = _model.declarations.filter(Service).filter[it.binding == BindingKind.SOAP]
        _interfaces = new LinkedHashSet<Interface>()
        _interfaces.addAll(_services.map[it.interface])
    }

    def generate() {
        '''
        «IF _xmlPreamble»
        <?xml version="1.0" encoding="utf-8"?>
        «ENDIF»
        <xs:schema targetNamespace="«_targetNamespace»"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:«_targetPrefix»="«_targetNamespace»"
                elementFormDefault="qualified">
            «FOR type: _model.declarations.filter(EnumType)»
            «generateEnumType(type)»
            «ENDFOR»
            «FOR type: _model.declarations.filter(StructType)»
            «generateStructType(type)»
            «ENDFOR»
            «FOR intf: _interfaces»
            «generateInterfaceOperations(intf)»
            «ENDFOR»
        </xs:schema>
        '''
    }

    def generateEnumType(EnumType type) {
        '''

        <xs:element name="«type.name»" type="«_targetPrefix»:«type.name»"/>
        <xs:simpleType name="«type.name»">
            <xs:restriction base="xs:string">
                «FOR elit: type.literals»
                <xs:enumeration value="«elit.name»"/>
                «ENDFOR»
            </xs:restriction>
        </xs:simpleType>
        '''
    }

    def generateStructType(StructType type) {
        '''

        <xs:element name="«type.name»" type="«_targetPrefix»:«type.name»"/>
        <xs:complexType name="«type.name»">
            «IF type.baseType !== null»
            <xs:complexContent>
                <xs:extension base="«_targetPrefix»:«type.baseType.name»">
                    «generateVariables(type.fields, null)»
                </xs:extension>
            </xs:complexContent>
            «ELSE»
            «generateVariables(type.fields, null)»
            «ENDIF»
        </xs:complexType>
        '''
    }

    def generateInterfaceOperations(Interface intf) {
        '''
        «FOR op: intf.operations»
        «generateOperation(intf, op)»
        «ENDFOR»
        «FOR res: intf.resources»
            «FOR op: _typeAnalysis.getOperations(res)»
            «generateOperation(intf, op)»
            «ENDFOR»
        «ENDFOR»
        '''
    }

    def generateOperation(Interface intf, Operation op) {
        '''

        <xs:element name="«op.name»" type="«_targetPrefix»:«op.name»"/>
        <xs:complexType name="«op.name»">
            «generateVariables(op.requestParameters.parameters, null)»
        </xs:complexType>
        «IF !op.async»

        <xs:element name="«op.name»Response" type="«_targetPrefix»:«op.name»Response"/>
        <xs:complexType name="«op.name»Response">
            «generateVariables(op.responseParameters.parameters, op.name+"Result")»
        </xs:complexType>
        «ENDIF»
        '''
    }

    def generateVariables(Iterable<? extends Variable> properties, String emptyName) {
        '''
        <xs:sequence>
            «FOR prop: properties»
            «val propName = properties.size == 1 && prop.name === null ? emptyName : prop.name»
            «generateTypeRef(prop.type, propName, false, false)»
            «ENDFOR»
        </xs:sequence>
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
        «IF type.kind == BuiltInTypeKind.OBJECT»
        <xs:element name="«propName»" type="xs:anyType" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.BINARY»
        <xs:element name="«propName»" type="xs:base64Binary" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.BOOL»
        <xs:element name="«propName»" type="xs:boolean" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.STRING»
        <xs:element name="«propName»" type="xs:string" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.INT»
        <xs:element name="«propName»" type="xs:int" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.LONG»
        <xs:element name="«propName»" type="xs:long" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.FLOAT»
        <xs:element name="«propName»" type="xs:float" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.DOUBLE»
        <xs:element name="«propName»" type="xs:double" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.DATE»
        <xs:element name="«propName»" type="xs:date" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.TIME»
        <xs:element name="«propName»" type="xs:time" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.DATETIME»
        <xs:element name="«propName»" type="xs:dateTime" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSEIF type.kind == BuiltInTypeKind.DURATION»
        <xs:element name="«propName»" type="xs:duration" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        «ELSE»
        ERROR: invalid built-in type: «type.kind»
        «ENDIF»
        '''
    }

    def dispatch String generateTypeRef(EnumType type, String propName, boolean nullable, boolean array) {
        '''
        <xs:element name="«propName»" type="«_targetPrefix»:«type.name»" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        '''
    }

    def dispatch String generateTypeRef(StructType type, String propName, boolean nullable, boolean array) {
        '''
        <xs:element name="«propName»" type="«_targetPrefix»:«type.name»" nillable="«nullable»"«IF array» minOccurs="0" maxOccurs="unbounded"«ENDIF»/>
        '''
    }

    def dispatch String generateTypeRef(ArrayType typeRef, String propName, boolean nullable, boolean array) {
        '''
        <xs:element name="«propName»" nillable="«nullable»">
            <xs:complexType>
                <xs:sequence>
                    «generateTypeRef(typeRef.innerType, getInnerTypeName(typeRef.innerType), false, true)»
                </xs:sequence>
            </xs:complexType>
        </xs:element>
        '''
    }

    def dispatch String generateTypeRef(NullableType typeRef, String propName, boolean nullable, boolean array) {
        '''
        «generateTypeRef(typeRef.innerType, propName, true, array)»
        '''
    }

    private def String getInnerTypeName(Type type) {
        if (type instanceof NamedType) {
            return type.name
        } else if (type instanceof NullableType) {
            return "Nullable"+getInnerTypeName(type.innerType)
        } else if (type instanceof ArrayType) {
            return "ArrayOf"+getInnerTypeName(type.innerType)
        } else if (type instanceof SimpleTypeReference) {
            getInnerTypeName(type.referencedType)
        } else {
            throw new IllegalStateException("Invalid type: "+type)
        }
    }
}