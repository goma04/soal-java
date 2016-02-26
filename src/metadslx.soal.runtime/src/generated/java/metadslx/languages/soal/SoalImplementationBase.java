package metadslx.languages.soal;

/**
 * Base class for implementing the behavior of the model elements.
 * This class has to be be overriden in SoalImplementation to provide custom
 * implementation for the constructors, operations and property values.
 */
abstract class SoalImplementationBase {
    /**
	 * Implements the constructor: AnnotatedElement()
    */
    public void AnnotatedElement(AnnotatedElement _this) {
    }

    /**
     * Implements the operation: AnnotatedElement.AddAnnotation()
     */
    public metadslx.languages.soal.Annotation AnnotatedElement_addAnnotation(metadslx.languages.soal.AnnotatedElement _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.HasAnnotation()
     */
    public boolean AnnotatedElement_hasAnnotation(metadslx.languages.soal.AnnotatedElement _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.GetAnnotation()
     */
    public metadslx.languages.soal.Annotation AnnotatedElement_getAnnotation(metadslx.languages.soal.AnnotatedElement _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.GetAnnotations()
     */
    public java.util.List<metadslx.languages.soal.Annotation> AnnotatedElement_getAnnotations(metadslx.languages.soal.AnnotatedElement _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.HasAnnotationProperty()
     */
    public boolean AnnotatedElement_hasAnnotationProperty(metadslx.languages.soal.AnnotatedElement _this, String annotationName, String propertyName) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.GetAnnotationPropertyValue()
     */
    public Object AnnotatedElement_getAnnotationPropertyValue(metadslx.languages.soal.AnnotatedElement _this, String annotationName, String propertyName) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: AnnotatedElement.SetAnnotationPropertyValue()
     */
    public metadslx.languages.soal.AnnotationProperty AnnotatedElement_setAnnotationPropertyValue(metadslx.languages.soal.AnnotatedElement _this, String annotationName, String propertyName, Object propertyValue) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: Annotation()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void Annotation(Annotation _this) {
        this.NamedElement(_this);
    }

    /**
     * Implements the operation: Annotation.HasProperty()
     */
    public boolean Annotation_hasProperty(metadslx.languages.soal.Annotation _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: Annotation.GetProperty()
     */
    public metadslx.languages.soal.AnnotationProperty Annotation_getProperty(metadslx.languages.soal.Annotation _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: Annotation.GetPropertyValue()
     */
    public Object Annotation_getPropertyValue(metadslx.languages.soal.Annotation _this, String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: Annotation.SetPropertyValue()
     */
    public metadslx.languages.soal.AnnotationProperty Annotation_setPropertyValue(metadslx.languages.soal.Annotation _this, String name, Object value) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: AnnotationProperty()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void AnnotationProperty(AnnotationProperty _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: NamedElement()
    */
    public void NamedElement(NamedElement _this) {
    }

    /**
	 * Implements the constructor: TypedElement()
    */
    public void TypedElement(TypedElement _this) {
    }

    /**
	 * Implements the constructor: SoalType()
    */
    public void SoalType(SoalType _this) {
    }

    /**
	 * Implements the constructor: Namespace()
	 * Direct superclasses: metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Namespace(Namespace _this) {
        this.Declaration(_this);
    }

    /**
     * Returns the value of the derived property: Namespace.FullName
     */
    public String Namespace_FullName(Namespace _this) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: Declaration()
	 * Direct superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Declaration(Declaration _this) {
        this.NamedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: ArrayType()
	 * Direct superclasses: metadslx.languages.soal.SoalType
	 * All superclasses: metadslx.languages.soal.SoalType
    */
    public void ArrayType(ArrayType _this) {
        this.SoalType(_this);
    }

    /**
	 * Implements the constructor: NullableType()
	 * Direct superclasses: metadslx.languages.soal.SoalType
	 * All superclasses: metadslx.languages.soal.SoalType
    */
    public void NullableType(NullableType _this) {
        this.SoalType(_this);
    }

    /**
	 * Implements the constructor: NonNullableType()
	 * Direct superclasses: metadslx.languages.soal.SoalType
	 * All superclasses: metadslx.languages.soal.SoalType
    */
    public void NonNullableType(NonNullableType _this) {
        this.SoalType(_this);
    }

    /**
	 * Implements the constructor: PrimitiveType()
	 * Direct superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void PrimitiveType(PrimitiveType _this) {
        this.SoalType(_this);
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Enum()
	 * Direct superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Enum(Enum _this) {
        this.SoalType(_this);
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: EnumLiteral()
	 * Direct superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void EnumLiteral(EnumLiteral _this) {
        this.NamedElement(_this);
        this.TypedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: Property()
	 * Direct superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Property(Property _this) {
        this.NamedElement(_this);
        this.TypedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: Struct()
	 * Direct superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Struct(Struct _this) {
        this.SoalType(_this);
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Interface()
	 * Direct superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Interface(Interface _this) {
        this.SoalType(_this);
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Database()
	 * Direct superclasses: metadslx.languages.soal.Interface
	 * All superclasses: metadslx.languages.soal.Interface, metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Database(Database _this) {
        this.Interface(_this);
    }

    /**
	 * Implements the constructor: Operation()
	 * Direct superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
     * Initializes the following readonly properties:
     *    Operation.Result
    */
    public void Operation(Operation _this) {
        this.NamedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: InputParameter()
	 * Direct superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void InputParameter(InputParameter _this) {
        this.NamedElement(_this);
        this.TypedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: OutputParameter()
	 * Direct superclasses: metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
	 * All superclasses: metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void OutputParameter(OutputParameter _this) {
        this.TypedElement(_this);
        this.AnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: Component()
	 * Direct superclasses: metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Component(Component _this) {
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Composite()
	 * Direct superclasses: metadslx.languages.soal.Component
	 * All superclasses: metadslx.languages.soal.Component, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Composite(Composite _this) {
        this.Component(_this);
    }

    /**
	 * Implements the constructor: Assembly()
	 * Direct superclasses: metadslx.languages.soal.Composite
	 * All superclasses: metadslx.languages.soal.Composite, metadslx.languages.soal.Component, metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Assembly(Assembly _this) {
        this.Composite(_this);
    }

    /**
	 * Implements the constructor: Wire()
    */
    public void Wire(Wire _this) {
    }

    /**
	 * Implements the constructor: Port()
    */
    public void Port(Port _this) {
    }

    /**
     * Returns the value of the derived property: Port.Name
     */
    public String Port_Name(Port _this) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: Service()
	 * Direct superclasses: metadslx.languages.soal.Port
	 * All superclasses: metadslx.languages.soal.Port
    */
    public void Service(Service _this) {
        this.Port(_this);
    }

    /**
	 * Implements the constructor: Reference()
	 * Direct superclasses: metadslx.languages.soal.Port
	 * All superclasses: metadslx.languages.soal.Port
    */
    public void Reference(Reference _this) {
        this.Port(_this);
    }

    /**
	 * Implements the constructor: Implementation()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void Implementation(Implementation _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: Language()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void Language(Language _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: Deployment()
	 * Direct superclasses: metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Deployment(Deployment _this) {
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Environment()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void Environment(Environment _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: Runtime()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void Runtime(Runtime _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: Binding()
	 * Direct superclasses: metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Binding(Binding _this) {
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: Endpoint()
	 * Direct superclasses: metadslx.languages.soal.Declaration
	 * All superclasses: metadslx.languages.soal.Declaration, metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
    */
    public void Endpoint(Endpoint _this) {
        this.Declaration(_this);
    }

    /**
	 * Implements the constructor: BindingElement()
	 * Direct superclasses: metadslx.languages.soal.NamedElement
	 * All superclasses: metadslx.languages.soal.NamedElement
    */
    public void BindingElement(BindingElement _this) {
        this.NamedElement(_this);
    }

    /**
	 * Implements the constructor: TransportBindingElement()
	 * Direct superclasses: metadslx.languages.soal.BindingElement
	 * All superclasses: metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void TransportBindingElement(TransportBindingElement _this) {
        this.BindingElement(_this);
    }

    /**
	 * Implements the constructor: EncodingBindingElement()
	 * Direct superclasses: metadslx.languages.soal.BindingElement
	 * All superclasses: metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void EncodingBindingElement(EncodingBindingElement _this) {
        this.BindingElement(_this);
    }

    /**
	 * Implements the constructor: ProtocolBindingElement()
	 * Direct superclasses: metadslx.languages.soal.BindingElement
	 * All superclasses: metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void ProtocolBindingElement(ProtocolBindingElement _this) {
        this.BindingElement(_this);
    }

    /**
	 * Implements the constructor: HttpTransportBindingElement()
	 * Direct superclasses: metadslx.languages.soal.TransportBindingElement
	 * All superclasses: metadslx.languages.soal.TransportBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void HttpTransportBindingElement(HttpTransportBindingElement _this) {
        this.TransportBindingElement(_this);
    }

    /**
	 * Implements the constructor: RestTransportBindingElement()
	 * Direct superclasses: metadslx.languages.soal.TransportBindingElement
	 * All superclasses: metadslx.languages.soal.TransportBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void RestTransportBindingElement(RestTransportBindingElement _this) {
        this.TransportBindingElement(_this);
    }

    /**
	 * Implements the constructor: WebSocketTransportBindingElement()
	 * Direct superclasses: metadslx.languages.soal.TransportBindingElement
	 * All superclasses: metadslx.languages.soal.TransportBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void WebSocketTransportBindingElement(WebSocketTransportBindingElement _this) {
        this.TransportBindingElement(_this);
    }

    /**
	 * Implements the constructor: SoapEncodingBindingElement()
	 * Direct superclasses: metadslx.languages.soal.EncodingBindingElement
	 * All superclasses: metadslx.languages.soal.EncodingBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void SoapEncodingBindingElement(SoapEncodingBindingElement _this) {
        this.EncodingBindingElement(_this);
    }

    /**
	 * Implements the constructor: XmlEncodingBindingElement()
	 * Direct superclasses: metadslx.languages.soal.EncodingBindingElement
	 * All superclasses: metadslx.languages.soal.EncodingBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void XmlEncodingBindingElement(XmlEncodingBindingElement _this) {
        this.EncodingBindingElement(_this);
    }

    /**
	 * Implements the constructor: JsonEncodingBindingElement()
	 * Direct superclasses: metadslx.languages.soal.EncodingBindingElement
	 * All superclasses: metadslx.languages.soal.EncodingBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void JsonEncodingBindingElement(JsonEncodingBindingElement _this) {
        this.EncodingBindingElement(_this);
    }

    /**
	 * Implements the constructor: WsProtocolBindingElement()
	 * Direct superclasses: metadslx.languages.soal.ProtocolBindingElement
	 * All superclasses: metadslx.languages.soal.ProtocolBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void WsProtocolBindingElement(WsProtocolBindingElement _this) {
        this.ProtocolBindingElement(_this);
    }

    /**
	 * Implements the constructor: WsAddressingBindingElement()
	 * Direct superclasses: metadslx.languages.soal.WsProtocolBindingElement
	 * All superclasses: metadslx.languages.soal.WsProtocolBindingElement, metadslx.languages.soal.ProtocolBindingElement, metadslx.languages.soal.BindingElement, metadslx.languages.soal.NamedElement
    */
    public void WsAddressingBindingElement(WsAddressingBindingElement _this) {
        this.WsProtocolBindingElement(_this);
    }



}


