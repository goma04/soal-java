package metadslx.languages.soal;

public final class SoalDescriptor {
    static {
        AnnotatedElement.staticInit();
        Annotation.staticInit();
        AnnotationProperty.staticInit();
        NamedElement.staticInit();
        TypedElement.staticInit();
        SoalType.staticInit();
        Namespace.staticInit();
        Declaration.staticInit();
        ArrayType.staticInit();
        NullableType.staticInit();
        NonNullableType.staticInit();
        PrimitiveType.staticInit();
        Enum.staticInit();
        EnumLiteral.staticInit();
        Property.staticInit();
        Struct.staticInit();
        Interface.staticInit();
        Database.staticInit();
        Operation.staticInit();
        InputParameter.staticInit();
        OutputParameter.staticInit();
        Component.staticInit();
        Composite.staticInit();
        Assembly.staticInit();
        Wire.staticInit();
        Port.staticInit();
        Service.staticInit();
        Reference.staticInit();
        Implementation.staticInit();
        Language.staticInit();
        Deployment.staticInit();
        Environment.staticInit();
        Runtime.staticInit();
        Binding.staticInit();
        Endpoint.staticInit();
        BindingElement.staticInit();
        TransportBindingElement.staticInit();
        EncodingBindingElement.staticInit();
        ProtocolBindingElement.staticInit();
        HttpTransportBindingElement.staticInit();
        RestTransportBindingElement.staticInit();
        WebSocketTransportBindingElement.staticInit();
        SoapEncodingBindingElement.staticInit();
        XmlEncodingBindingElement.staticInit();
        JsonEncodingBindingElement.staticInit();
        WsProtocolBindingElement.staticInit();
        WsAddressingBindingElement.staticInit();
    }

    static void staticInit() {}

	public static final String Uri = "http://MetaDslx.Soal/1.0";

    
    public static final class AnnotatedElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.AnnotatedElement; 
        }
    
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.Annotation.class, propertyName="AnnotatedElement")
        public static final metadslx.core.ModelProperty AnnotationsProperty =
            metadslx.core.ModelProperty.register("Annotations", metadslx.core.ModelList.class, metadslx.languages.soal.Annotation.class, metadslx.languages.soal.AnnotatedElement.class, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.AnnotatedElement_AnnotationsProperty, true));
        
    }
    
    public static final class Annotation {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Annotation; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.AnnotatedElement.class, propertyName="Annotations")
        public static final metadslx.core.ModelProperty AnnotatedElementProperty =
            metadslx.core.ModelProperty.register("AnnotatedElement", metadslx.languages.soal.AnnotatedElement.class, null, metadslx.languages.soal.Annotation.class, metadslx.languages.soal.SoalDescriptor.Annotation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Annotation_AnnotatedElementProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty PropertiesProperty =
            metadslx.core.ModelProperty.register("Properties", metadslx.core.ModelList.class, metadslx.languages.soal.AnnotationProperty.class, metadslx.languages.soal.Annotation.class, metadslx.languages.soal.SoalDescriptor.Annotation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Annotation_PropertiesProperty, true));
        
    }
    
    public static final class AnnotationProperty {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.AnnotationProperty; 
        }
    
        public static final metadslx.core.ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", Object.class, null, metadslx.languages.soal.AnnotationProperty.class, metadslx.languages.soal.SoalDescriptor.AnnotationProperty.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.AnnotationProperty_ValueProperty, true));
        
    }
    
    public static final class NamedElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.NamedElement; 
        }
    
        @metadslx.core.Name
        public static final metadslx.core.ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.languages.soal.NamedElement.class, metadslx.languages.soal.SoalDescriptor.NamedElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.NamedElement_NameProperty, true));
        
    }
    
    public static final class TypedElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.TypedElement; 
        }
    
        @metadslx.core.Type
        public static final metadslx.core.ModelProperty TypeProperty =
            metadslx.core.ModelProperty.register("Type", metadslx.languages.soal.SoalType.class, null, metadslx.languages.soal.TypedElement.class, metadslx.languages.soal.SoalDescriptor.TypedElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.TypedElement_TypeProperty, true));
        
    }
    
    public static final class SoalType {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.SoalType; 
        }
    
    }
    
    public static final class Namespace {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Namespace; 
        }
    
        public static final metadslx.core.ModelProperty UriProperty =
            metadslx.core.ModelProperty.register("Uri", String.class, null, metadslx.languages.soal.Namespace.class, metadslx.languages.soal.SoalDescriptor.Namespace.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Namespace_UriProperty, true));
        
        public static final metadslx.core.ModelProperty PrefixProperty =
            metadslx.core.ModelProperty.register("Prefix", String.class, null, metadslx.languages.soal.Namespace.class, metadslx.languages.soal.SoalDescriptor.Namespace.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Namespace_PrefixProperty, true));
        
        @metadslx.core.Readonly
        public static final metadslx.core.ModelProperty FullNameProperty =
            metadslx.core.ModelProperty.register("FullName", String.class, null, metadslx.languages.soal.Namespace.class, metadslx.languages.soal.SoalDescriptor.Namespace.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Namespace_FullNameProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.Declaration.class, propertyName="Namespace")
        public static final metadslx.core.ModelProperty DeclarationsProperty =
            metadslx.core.ModelProperty.register("Declarations", metadslx.core.ModelList.class, metadslx.languages.soal.Declaration.class, metadslx.languages.soal.Namespace.class, metadslx.languages.soal.SoalDescriptor.Namespace.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Namespace_DeclarationsProperty, true));
        
    }
    
    public static final class Declaration {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Declaration; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.Namespace.class, propertyName="Declarations")
        public static final metadslx.core.ModelProperty NamespaceProperty =
            metadslx.core.ModelProperty.register("Namespace", metadslx.languages.soal.Namespace.class, null, metadslx.languages.soal.Declaration.class, metadslx.languages.soal.SoalDescriptor.Declaration.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Declaration_NamespaceProperty, true));
        
    }
    
    public static final class ArrayType {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.ArrayType; 
        }
    
        public static final metadslx.core.ModelProperty InnerTypeProperty =
            metadslx.core.ModelProperty.register("InnerType", metadslx.languages.soal.SoalType.class, null, metadslx.languages.soal.ArrayType.class, metadslx.languages.soal.SoalDescriptor.ArrayType.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.ArrayType_InnerTypeProperty, true));
        
    }
    
    public static final class NullableType {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.NullableType; 
        }
    
        public static final metadslx.core.ModelProperty InnerTypeProperty =
            metadslx.core.ModelProperty.register("InnerType", metadslx.languages.soal.SoalType.class, null, metadslx.languages.soal.NullableType.class, metadslx.languages.soal.SoalDescriptor.NullableType.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.NullableType_InnerTypeProperty, true));
        
    }
    
    public static final class NonNullableType {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.NonNullableType; 
        }
    
        public static final metadslx.core.ModelProperty InnerTypeProperty =
            metadslx.core.ModelProperty.register("InnerType", metadslx.languages.soal.SoalType.class, null, metadslx.languages.soal.NonNullableType.class, metadslx.languages.soal.SoalDescriptor.NonNullableType.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.NonNullableType_InnerTypeProperty, true));
        
    }
    
    public static final class PrimitiveType {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.PrimitiveType; 
        }
    
        public static final metadslx.core.ModelProperty NullableProperty =
            metadslx.core.ModelProperty.register("Nullable", boolean.class, null, metadslx.languages.soal.PrimitiveType.class, metadslx.languages.soal.SoalDescriptor.PrimitiveType.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.PrimitiveType_NullableProperty, true));
        
    }
    
    public static final class Enum {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Enum; 
        }
    
        @metadslx.core.InheritedScope
        public static final metadslx.core.ModelProperty BaseTypeProperty =
            metadslx.core.ModelProperty.register("BaseType", metadslx.languages.soal.Enum.class, null, metadslx.languages.soal.Enum.class, metadslx.languages.soal.SoalDescriptor.Enum.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Enum_BaseTypeProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.EnumLiteral.class, propertyName="Enum")
        public static final metadslx.core.ModelProperty EnumLiteralsProperty =
            metadslx.core.ModelProperty.register("EnumLiterals", metadslx.core.ModelList.class, metadslx.languages.soal.EnumLiteral.class, metadslx.languages.soal.Enum.class, metadslx.languages.soal.SoalDescriptor.Enum.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Enum_EnumLiteralsProperty, true));
        
    }
    
    public static final class EnumLiteral {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.EnumLiteral; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.languages.soal.SoalDescriptor.Enum.class, propertyName="EnumLiterals")
        public static final metadslx.core.ModelProperty EnumProperty =
            metadslx.core.ModelProperty.register("Enum", metadslx.languages.soal.Enum.class, null, metadslx.languages.soal.EnumLiteral.class, metadslx.languages.soal.SoalDescriptor.EnumLiteral.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.EnumLiteral_EnumProperty, true));
        
    }
    
    public static final class Property {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Property; 
        }
    
    }
    
    public static final class Struct {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Struct; 
        }
    
        @metadslx.core.InheritedScope
        public static final metadslx.core.ModelProperty BaseTypeProperty =
            metadslx.core.ModelProperty.register("BaseType", metadslx.languages.soal.Struct.class, null, metadslx.languages.soal.Struct.class, metadslx.languages.soal.SoalDescriptor.Struct.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Struct_BaseTypeProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty PropertiesProperty =
            metadslx.core.ModelProperty.register("Properties", metadslx.core.ModelList.class, metadslx.languages.soal.Property.class, metadslx.languages.soal.Struct.class, metadslx.languages.soal.SoalDescriptor.Struct.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Struct_PropertiesProperty, true));
        
    }
    
    public static final class Interface {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Interface; 
        }
    
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty OperationsProperty =
            metadslx.core.ModelProperty.register("Operations", metadslx.core.ModelList.class, metadslx.languages.soal.Operation.class, metadslx.languages.soal.Interface.class, metadslx.languages.soal.SoalDescriptor.Interface.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Interface_OperationsProperty, true));
        
    }
    
    public static final class Database {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Database; 
        }
    
        @metadslx.core.ScopeEntry
        public static final metadslx.core.ModelProperty EntitiesProperty =
            metadslx.core.ModelProperty.register("Entities", metadslx.core.ModelList.class, metadslx.languages.soal.Struct.class, metadslx.languages.soal.Database.class, metadslx.languages.soal.SoalDescriptor.Database.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Database_EntitiesProperty, true));
        
    }
    
    public static final class Operation {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Operation; 
        }
    
        public static final metadslx.core.ModelProperty ActionProperty =
            metadslx.core.ModelProperty.register("Action", String.class, null, metadslx.languages.soal.Operation.class, metadslx.languages.soal.SoalDescriptor.Operation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Operation_ActionProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty ParametersProperty =
            metadslx.core.ModelProperty.register("Parameters", metadslx.core.ModelList.class, metadslx.languages.soal.InputParameter.class, metadslx.languages.soal.Operation.class, metadslx.languages.soal.SoalDescriptor.Operation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Operation_ParametersProperty, true));
        
        @metadslx.core.Readonly
        public static final metadslx.core.ModelProperty ResultProperty =
            metadslx.core.ModelProperty.register("Result", metadslx.languages.soal.OutputParameter.class, null, metadslx.languages.soal.Operation.class, metadslx.languages.soal.SoalDescriptor.Operation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Operation_ResultProperty, true));
        
        public static final metadslx.core.ModelProperty ExceptionsProperty =
            metadslx.core.ModelProperty.register("Exceptions", metadslx.core.ModelList.class, metadslx.languages.soal.Struct.class, metadslx.languages.soal.Operation.class, metadslx.languages.soal.SoalDescriptor.Operation.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Operation_ExceptionsProperty, true));
        
    }
    
    public static final class InputParameter {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.InputParameter; 
        }
    
    }
    
    public static final class OutputParameter {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.OutputParameter; 
        }
    
        public static final metadslx.core.ModelProperty IsOnewayProperty =
            metadslx.core.ModelProperty.register("IsOneway", boolean.class, null, metadslx.languages.soal.OutputParameter.class, metadslx.languages.soal.SoalDescriptor.OutputParameter.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.OutputParameter_IsOnewayProperty, true));
        
    }
    
    public static final class Component {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Component; 
        }
    
        @metadslx.core.InheritedScope
        public static final metadslx.core.ModelProperty BaseComponentProperty =
            metadslx.core.ModelProperty.register("BaseComponent", metadslx.languages.soal.Component.class, null, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_BaseComponentProperty, true));
        
        public static final metadslx.core.ModelProperty IsAbstractProperty =
            metadslx.core.ModelProperty.register("IsAbstract", boolean.class, null, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_IsAbstractProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty ServicesProperty =
            metadslx.core.ModelProperty.register("Services", metadslx.core.ModelList.class, metadslx.languages.soal.Service.class, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_ServicesProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty ReferencesProperty =
            metadslx.core.ModelProperty.register("References", metadslx.core.ModelList.class, metadslx.languages.soal.Reference.class, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_ReferencesProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty PropertiesProperty =
            metadslx.core.ModelProperty.register("Properties", metadslx.core.ModelList.class, metadslx.languages.soal.Property.class, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_PropertiesProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty ImplementationProperty =
            metadslx.core.ModelProperty.register("Implementation", metadslx.languages.soal.Implementation.class, null, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_ImplementationProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty LanguageProperty =
            metadslx.core.ModelProperty.register("Language", metadslx.languages.soal.Language.class, null, metadslx.languages.soal.Component.class, metadslx.languages.soal.SoalDescriptor.Component.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Component_LanguageProperty, true));
        
    }
    
    public static final class Composite {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Composite; 
        }
    
        @metadslx.core.ScopeEntry
        public static final metadslx.core.ModelProperty ComponentsProperty =
            metadslx.core.ModelProperty.register("Components", metadslx.core.ModelList.class, metadslx.languages.soal.Component.class, metadslx.languages.soal.Composite.class, metadslx.languages.soal.SoalDescriptor.Composite.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Composite_ComponentsProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty WiresProperty =
            metadslx.core.ModelProperty.register("Wires", metadslx.core.ModelList.class, metadslx.languages.soal.Wire.class, metadslx.languages.soal.Composite.class, metadslx.languages.soal.SoalDescriptor.Composite.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Composite_WiresProperty, true));
        
    }
    
    public static final class Assembly {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Assembly; 
        }
    
    }
    
    public static final class Wire {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Wire; 
        }
    
        public static final metadslx.core.ModelProperty SourceProperty =
            metadslx.core.ModelProperty.register("Source", metadslx.languages.soal.Port.class, null, metadslx.languages.soal.Wire.class, metadslx.languages.soal.SoalDescriptor.Wire.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Wire_SourceProperty, true));
        
        public static final metadslx.core.ModelProperty TargetProperty =
            metadslx.core.ModelProperty.register("Target", metadslx.languages.soal.Port.class, null, metadslx.languages.soal.Wire.class, metadslx.languages.soal.SoalDescriptor.Wire.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Wire_TargetProperty, true));
        
    }
    
    public static final class Port {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Port; 
        }
    
        @metadslx.core.Name
        @metadslx.core.Readonly
        public static final metadslx.core.ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.languages.soal.Port.class, metadslx.languages.soal.SoalDescriptor.Port.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Port_NameProperty, true));
        
        public static final metadslx.core.ModelProperty OptionalNameProperty =
            metadslx.core.ModelProperty.register("OptionalName", String.class, null, metadslx.languages.soal.Port.class, metadslx.languages.soal.SoalDescriptor.Port.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Port_OptionalNameProperty, true));
        
        public static final metadslx.core.ModelProperty InterfaceProperty =
            metadslx.core.ModelProperty.register("Interface", metadslx.languages.soal.Interface.class, null, metadslx.languages.soal.Port.class, metadslx.languages.soal.SoalDescriptor.Port.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Port_InterfaceProperty, true));
        
        public static final metadslx.core.ModelProperty BindingProperty =
            metadslx.core.ModelProperty.register("Binding", metadslx.languages.soal.Binding.class, null, metadslx.languages.soal.Port.class, metadslx.languages.soal.SoalDescriptor.Port.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Port_BindingProperty, true));
        
    }
    
    public static final class Service {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Service; 
        }
    
    }
    
    public static final class Reference {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Reference; 
        }
    
    }
    
    public static final class Implementation {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Implementation; 
        }
    
    }
    
    public static final class Language {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Language; 
        }
    
    }
    
    public static final class Deployment {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Deployment; 
        }
    
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty EnvironmentsProperty =
            metadslx.core.ModelProperty.register("Environments", metadslx.core.ModelList.class, metadslx.languages.soal.Environment.class, metadslx.languages.soal.Deployment.class, metadslx.languages.soal.SoalDescriptor.Deployment.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Deployment_EnvironmentsProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty WiresProperty =
            metadslx.core.ModelProperty.register("Wires", metadslx.core.ModelList.class, metadslx.languages.soal.Wire.class, metadslx.languages.soal.Deployment.class, metadslx.languages.soal.SoalDescriptor.Deployment.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Deployment_WiresProperty, true));
        
    }
    
    public static final class Environment {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Environment; 
        }
    
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty RuntimeProperty =
            metadslx.core.ModelProperty.register("Runtime", metadslx.languages.soal.Runtime.class, null, metadslx.languages.soal.Environment.class, metadslx.languages.soal.SoalDescriptor.Environment.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Environment_RuntimeProperty, true));
        
        public static final metadslx.core.ModelProperty DatabasesProperty =
            metadslx.core.ModelProperty.register("Databases", metadslx.core.ModelList.class, metadslx.languages.soal.Database.class, metadslx.languages.soal.Environment.class, metadslx.languages.soal.SoalDescriptor.Environment.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Environment_DatabasesProperty, true));
        
        public static final metadslx.core.ModelProperty AssembliesProperty =
            metadslx.core.ModelProperty.register("Assemblies", metadslx.core.ModelList.class, metadslx.languages.soal.Assembly.class, metadslx.languages.soal.Environment.class, metadslx.languages.soal.SoalDescriptor.Environment.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Environment_AssembliesProperty, true));
        
    }
    
    public static final class Runtime {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Runtime; 
        }
    
    }
    
    public static final class Binding {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Binding; 
        }
    
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty TransportProperty =
            metadslx.core.ModelProperty.register("Transport", metadslx.languages.soal.TransportBindingElement.class, null, metadslx.languages.soal.Binding.class, metadslx.languages.soal.SoalDescriptor.Binding.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Binding_TransportProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty EncodingsProperty =
            metadslx.core.ModelProperty.register("Encodings", metadslx.core.ModelList.class, metadslx.languages.soal.EncodingBindingElement.class, metadslx.languages.soal.Binding.class, metadslx.languages.soal.SoalDescriptor.Binding.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Binding_EncodingsProperty, true));
        
        @metadslx.core.Containment
        public static final metadslx.core.ModelProperty ProtocolsProperty =
            metadslx.core.ModelProperty.register("Protocols", metadslx.core.ModelList.class, metadslx.languages.soal.ProtocolBindingElement.class, metadslx.languages.soal.Binding.class, metadslx.languages.soal.SoalDescriptor.Binding.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Binding_ProtocolsProperty, true));
        
    }
    
    public static final class Endpoint {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.Endpoint; 
        }
    
        public static final metadslx.core.ModelProperty InterfaceProperty =
            metadslx.core.ModelProperty.register("Interface", metadslx.languages.soal.Interface.class, null, metadslx.languages.soal.Endpoint.class, metadslx.languages.soal.SoalDescriptor.Endpoint.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Endpoint_InterfaceProperty, true));
        
        public static final metadslx.core.ModelProperty BindingProperty =
            metadslx.core.ModelProperty.register("Binding", metadslx.languages.soal.Binding.class, null, metadslx.languages.soal.Endpoint.class, metadslx.languages.soal.SoalDescriptor.Endpoint.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Endpoint_BindingProperty, true));
        
        public static final metadslx.core.ModelProperty AddressProperty =
            metadslx.core.ModelProperty.register("Address", String.class, null, metadslx.languages.soal.Endpoint.class, metadslx.languages.soal.SoalDescriptor.Endpoint.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.Endpoint_AddressProperty, true));
        
    }
    
    public static final class BindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.BindingElement; 
        }
    
    }
    
    public static final class TransportBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.TransportBindingElement; 
        }
    
    }
    
    public static final class EncodingBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.EncodingBindingElement; 
        }
    
    }
    
    public static final class ProtocolBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.ProtocolBindingElement; 
        }
    
    }
    
    public static final class HttpTransportBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.HttpTransportBindingElement; 
        }
    
        public static final metadslx.core.ModelProperty SslProperty =
            metadslx.core.ModelProperty.register("Ssl", boolean.class, null, metadslx.languages.soal.HttpTransportBindingElement.class, metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.HttpTransportBindingElement_SslProperty, true));
        
        public static final metadslx.core.ModelProperty ClientAuthenticationProperty =
            metadslx.core.ModelProperty.register("ClientAuthentication", boolean.class, null, metadslx.languages.soal.HttpTransportBindingElement.class, metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.HttpTransportBindingElement_ClientAuthenticationProperty, true));
        
    }
    
    public static final class RestTransportBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.RestTransportBindingElement; 
        }
    
    }
    
    public static final class WebSocketTransportBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.WebSocketTransportBindingElement; 
        }
    
    }
    
    public static final class SoapEncodingBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.SoapEncodingBindingElement; 
        }
    
        public static final metadslx.core.ModelProperty StyleProperty =
            metadslx.core.ModelProperty.register("Style", metadslx.languages.soal.SoapEncodingStyle.class, null, metadslx.languages.soal.SoapEncodingBindingElement.class, metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.SoapEncodingBindingElement_StyleProperty, true));
        
        public static final metadslx.core.ModelProperty VersionProperty =
            metadslx.core.ModelProperty.register("Version", metadslx.languages.soal.SoapVersion.class, null, metadslx.languages.soal.SoapEncodingBindingElement.class, metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.SoapEncodingBindingElement_VersionProperty, true));
        
        public static final metadslx.core.ModelProperty MtomProperty =
            metadslx.core.ModelProperty.register("Mtom", boolean.class, null, metadslx.languages.soal.SoapEncodingBindingElement.class, metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.class, metadslx.core.Lazy.create(() -> metadslx.languages.soal.SoalInstance.SoapEncodingBindingElement_MtomProperty, true));
        
    }
    
    public static final class XmlEncodingBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.XmlEncodingBindingElement; 
        }
    
    }
    
    public static final class JsonEncodingBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.JsonEncodingBindingElement; 
        }
    
    }
    
    public static final class WsProtocolBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.WsProtocolBindingElement; 
        }
    
    }
    
    public static final class WsAddressingBindingElement {
        static void staticInit() {}
    
        static {
            metadslx.languages.soal.SoalDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.languages.soal.SoalInstance.WsAddressingBindingElement; 
        }
    
    }
}


