package metadslx.languages.soal;

import metadslx.core.ModelFactory;
import metadslx.core.ModelObject;
import metadslx.core.ModelPropertyInitializer;

/**
 * Factory class for creating instances of model elements.
 */
public class SoalFactory extends ModelFactory {
    private static SoalFactory instance = new SoalFactory();

	private SoalFactory()
	{
	}

    /**
     * The singleton instance of the factory.
     */
    public static SoalFactory instance() {
        return SoalFactory.instance;
    }

    /**
     * Creates a new instance of Annotation.
     */
    public Annotation createAnnotation() {
		return this.createAnnotation(null);
	}
    /**
     * Creates a new instance of Annotation.
     */
    public Annotation createAnnotation(Iterable<ModelPropertyInitializer> initializers) {
		Annotation result = new metadslx.languages.soal.AnnotationImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of AnnotationProperty.
     */
    public AnnotationProperty createAnnotationProperty() {
		return this.createAnnotationProperty(null);
	}
    /**
     * Creates a new instance of AnnotationProperty.
     */
    public AnnotationProperty createAnnotationProperty(Iterable<ModelPropertyInitializer> initializers) {
		AnnotationProperty result = new metadslx.languages.soal.AnnotationPropertyImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Namespace.
     */
    public Namespace createNamespace() {
		return this.createNamespace(null);
	}
    /**
     * Creates a new instance of Namespace.
     */
    public Namespace createNamespace(Iterable<ModelPropertyInitializer> initializers) {
		Namespace result = new metadslx.languages.soal.NamespaceImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of ArrayType.
     */
    public ArrayType createArrayType() {
		return this.createArrayType(null);
	}
    /**
     * Creates a new instance of ArrayType.
     */
    public ArrayType createArrayType(Iterable<ModelPropertyInitializer> initializers) {
		ArrayType result = new metadslx.languages.soal.ArrayTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of NullableType.
     */
    public NullableType createNullableType() {
		return this.createNullableType(null);
	}
    /**
     * Creates a new instance of NullableType.
     */
    public NullableType createNullableType(Iterable<ModelPropertyInitializer> initializers) {
		NullableType result = new metadslx.languages.soal.NullableTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of NonNullableType.
     */
    public NonNullableType createNonNullableType() {
		return this.createNonNullableType(null);
	}
    /**
     * Creates a new instance of NonNullableType.
     */
    public NonNullableType createNonNullableType(Iterable<ModelPropertyInitializer> initializers) {
		NonNullableType result = new metadslx.languages.soal.NonNullableTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of PrimitiveType.
     */
    public PrimitiveType createPrimitiveType() {
		return this.createPrimitiveType(null);
	}
    /**
     * Creates a new instance of PrimitiveType.
     */
    public PrimitiveType createPrimitiveType(Iterable<ModelPropertyInitializer> initializers) {
		PrimitiveType result = new metadslx.languages.soal.PrimitiveTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Enum.
     */
    public Enum createEnum() {
		return this.createEnum(null);
	}
    /**
     * Creates a new instance of Enum.
     */
    public Enum createEnum(Iterable<ModelPropertyInitializer> initializers) {
		Enum result = new metadslx.languages.soal.EnumImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of EnumLiteral.
     */
    public EnumLiteral createEnumLiteral() {
		return this.createEnumLiteral(null);
	}
    /**
     * Creates a new instance of EnumLiteral.
     */
    public EnumLiteral createEnumLiteral(Iterable<ModelPropertyInitializer> initializers) {
		EnumLiteral result = new metadslx.languages.soal.EnumLiteralImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Property.
     */
    public Property createProperty() {
		return this.createProperty(null);
	}
    /**
     * Creates a new instance of Property.
     */
    public Property createProperty(Iterable<ModelPropertyInitializer> initializers) {
		Property result = new metadslx.languages.soal.PropertyImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Struct.
     */
    public Struct createStruct() {
		return this.createStruct(null);
	}
    /**
     * Creates a new instance of Struct.
     */
    public Struct createStruct(Iterable<ModelPropertyInitializer> initializers) {
		Struct result = new metadslx.languages.soal.StructImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Interface.
     */
    public Interface createInterface() {
		return this.createInterface(null);
	}
    /**
     * Creates a new instance of Interface.
     */
    public Interface createInterface(Iterable<ModelPropertyInitializer> initializers) {
		Interface result = new metadslx.languages.soal.InterfaceImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Database.
     */
    public Database createDatabase() {
		return this.createDatabase(null);
	}
    /**
     * Creates a new instance of Database.
     */
    public Database createDatabase(Iterable<ModelPropertyInitializer> initializers) {
		Database result = new metadslx.languages.soal.DatabaseImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Operation.
     */
    public Operation createOperation() {
		return this.createOperation(null);
	}
    /**
     * Creates a new instance of Operation.
     */
    public Operation createOperation(Iterable<ModelPropertyInitializer> initializers) {
		Operation result = new metadslx.languages.soal.OperationImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of InputParameter.
     */
    public InputParameter createInputParameter() {
		return this.createInputParameter(null);
	}
    /**
     * Creates a new instance of InputParameter.
     */
    public InputParameter createInputParameter(Iterable<ModelPropertyInitializer> initializers) {
		InputParameter result = new metadslx.languages.soal.InputParameterImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of OutputParameter.
     */
    public OutputParameter createOutputParameter() {
		return this.createOutputParameter(null);
	}
    /**
     * Creates a new instance of OutputParameter.
     */
    public OutputParameter createOutputParameter(Iterable<ModelPropertyInitializer> initializers) {
		OutputParameter result = new metadslx.languages.soal.OutputParameterImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Component.
     */
    public Component createComponent() {
		return this.createComponent(null);
	}
    /**
     * Creates a new instance of Component.
     */
    public Component createComponent(Iterable<ModelPropertyInitializer> initializers) {
		Component result = new metadslx.languages.soal.ComponentImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Composite.
     */
    public Composite createComposite() {
		return this.createComposite(null);
	}
    /**
     * Creates a new instance of Composite.
     */
    public Composite createComposite(Iterable<ModelPropertyInitializer> initializers) {
		Composite result = new metadslx.languages.soal.CompositeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Assembly.
     */
    public Assembly createAssembly() {
		return this.createAssembly(null);
	}
    /**
     * Creates a new instance of Assembly.
     */
    public Assembly createAssembly(Iterable<ModelPropertyInitializer> initializers) {
		Assembly result = new metadslx.languages.soal.AssemblyImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Wire.
     */
    public Wire createWire() {
		return this.createWire(null);
	}
    /**
     * Creates a new instance of Wire.
     */
    public Wire createWire(Iterable<ModelPropertyInitializer> initializers) {
		Wire result = new metadslx.languages.soal.WireImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Port.
     */
    public Port createPort() {
		return this.createPort(null);
	}
    /**
     * Creates a new instance of Port.
     */
    public Port createPort(Iterable<ModelPropertyInitializer> initializers) {
		Port result = new metadslx.languages.soal.PortImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Service.
     */
    public Service createService() {
		return this.createService(null);
	}
    /**
     * Creates a new instance of Service.
     */
    public Service createService(Iterable<ModelPropertyInitializer> initializers) {
		Service result = new metadslx.languages.soal.ServiceImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Reference.
     */
    public Reference createReference() {
		return this.createReference(null);
	}
    /**
     * Creates a new instance of Reference.
     */
    public Reference createReference(Iterable<ModelPropertyInitializer> initializers) {
		Reference result = new metadslx.languages.soal.ReferenceImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Implementation.
     */
    public Implementation createImplementation() {
		return this.createImplementation(null);
	}
    /**
     * Creates a new instance of Implementation.
     */
    public Implementation createImplementation(Iterable<ModelPropertyInitializer> initializers) {
		Implementation result = new metadslx.languages.soal.ImplementationImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Language.
     */
    public Language createLanguage() {
		return this.createLanguage(null);
	}
    /**
     * Creates a new instance of Language.
     */
    public Language createLanguage(Iterable<ModelPropertyInitializer> initializers) {
		Language result = new metadslx.languages.soal.LanguageImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Deployment.
     */
    public Deployment createDeployment() {
		return this.createDeployment(null);
	}
    /**
     * Creates a new instance of Deployment.
     */
    public Deployment createDeployment(Iterable<ModelPropertyInitializer> initializers) {
		Deployment result = new metadslx.languages.soal.DeploymentImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Environment.
     */
    public Environment createEnvironment() {
		return this.createEnvironment(null);
	}
    /**
     * Creates a new instance of Environment.
     */
    public Environment createEnvironment(Iterable<ModelPropertyInitializer> initializers) {
		Environment result = new metadslx.languages.soal.EnvironmentImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Runtime.
     */
    public Runtime createRuntime() {
		return this.createRuntime(null);
	}
    /**
     * Creates a new instance of Runtime.
     */
    public Runtime createRuntime(Iterable<ModelPropertyInitializer> initializers) {
		Runtime result = new metadslx.languages.soal.RuntimeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Binding.
     */
    public Binding createBinding() {
		return this.createBinding(null);
	}
    /**
     * Creates a new instance of Binding.
     */
    public Binding createBinding(Iterable<ModelPropertyInitializer> initializers) {
		Binding result = new metadslx.languages.soal.BindingImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of Endpoint.
     */
    public Endpoint createEndpoint() {
		return this.createEndpoint(null);
	}
    /**
     * Creates a new instance of Endpoint.
     */
    public Endpoint createEndpoint(Iterable<ModelPropertyInitializer> initializers) {
		Endpoint result = new metadslx.languages.soal.EndpointImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of HttpTransportBindingElement.
     */
    public HttpTransportBindingElement createHttpTransportBindingElement() {
		return this.createHttpTransportBindingElement(null);
	}
    /**
     * Creates a new instance of HttpTransportBindingElement.
     */
    public HttpTransportBindingElement createHttpTransportBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		HttpTransportBindingElement result = new metadslx.languages.soal.HttpTransportBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of RestTransportBindingElement.
     */
    public RestTransportBindingElement createRestTransportBindingElement() {
		return this.createRestTransportBindingElement(null);
	}
    /**
     * Creates a new instance of RestTransportBindingElement.
     */
    public RestTransportBindingElement createRestTransportBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		RestTransportBindingElement result = new metadslx.languages.soal.RestTransportBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of WebSocketTransportBindingElement.
     */
    public WebSocketTransportBindingElement createWebSocketTransportBindingElement() {
		return this.createWebSocketTransportBindingElement(null);
	}
    /**
     * Creates a new instance of WebSocketTransportBindingElement.
     */
    public WebSocketTransportBindingElement createWebSocketTransportBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		WebSocketTransportBindingElement result = new metadslx.languages.soal.WebSocketTransportBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of SoapEncodingBindingElement.
     */
    public SoapEncodingBindingElement createSoapEncodingBindingElement() {
		return this.createSoapEncodingBindingElement(null);
	}
    /**
     * Creates a new instance of SoapEncodingBindingElement.
     */
    public SoapEncodingBindingElement createSoapEncodingBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		SoapEncodingBindingElement result = new metadslx.languages.soal.SoapEncodingBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of XmlEncodingBindingElement.
     */
    public XmlEncodingBindingElement createXmlEncodingBindingElement() {
		return this.createXmlEncodingBindingElement(null);
	}
    /**
     * Creates a new instance of XmlEncodingBindingElement.
     */
    public XmlEncodingBindingElement createXmlEncodingBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		XmlEncodingBindingElement result = new metadslx.languages.soal.XmlEncodingBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of JsonEncodingBindingElement.
     */
    public JsonEncodingBindingElement createJsonEncodingBindingElement() {
		return this.createJsonEncodingBindingElement(null);
	}
    /**
     * Creates a new instance of JsonEncodingBindingElement.
     */
    public JsonEncodingBindingElement createJsonEncodingBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		JsonEncodingBindingElement result = new metadslx.languages.soal.JsonEncodingBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of WsAddressingBindingElement.
     */
    public WsAddressingBindingElement createWsAddressingBindingElement() {
		return this.createWsAddressingBindingElement(null);
	}
    /**
     * Creates a new instance of WsAddressingBindingElement.
     */
    public WsAddressingBindingElement createWsAddressingBindingElement(Iterable<ModelPropertyInitializer> initializers) {
		WsAddressingBindingElement result = new metadslx.languages.soal.WsAddressingBindingElementImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}
}


