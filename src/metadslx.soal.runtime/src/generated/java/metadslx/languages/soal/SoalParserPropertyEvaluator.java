package metadslx.languages.soal;

import metadslx.compiler.MetaCompiler;
import metadslx.compiler.MetaCompilerPropertyEvaluator;
import metadslx.core.Lazy;


import metadslx.core.ResolutionLocation;


@SuppressWarnings("unused")
class SoalParserPropertyEvaluator extends MetaCompilerPropertyEvaluator implements SoalParserVisitor<Object>
{
    public SoalParserPropertyEvaluator(MetaCompiler compiler)
    {
            super(compiler);
    }
    
    public Object visitMain(SoalParser.MainContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedName(SoalParser.QualifiedNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifierList(SoalParser.IdentifierListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedNameList(SoalParser.QualifiedNameListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationList(SoalParser.AnnotationListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnAnnotationList(SoalParser.ReturnAnnotationListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotation(SoalParser.AnnotationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnAnnotation(SoalParser.ReturnAnnotationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationBody(SoalParser.AnnotationBodyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationProperties(SoalParser.AnnotationPropertiesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationPropertyList(SoalParser.AnnotationPropertyListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationProperty(SoalParser.AnnotationPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationPropertyValue(SoalParser.AnnotationPropertyValueContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNamespaceDeclaration(SoalParser.NamespaceDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDeclaration(SoalParser.DeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumDeclaration(SoalParser.EnumDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumLiterals(SoalParser.EnumLiteralsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumLiteral(SoalParser.EnumLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitStructDeclaration(SoalParser.StructDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPropertyDeclaration(SoalParser.PropertyDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDatabaseDeclaration(SoalParser.DatabaseDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEntityReference(SoalParser.EntityReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitInterfaceDeclaration(SoalParser.InterfaceDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOperationDeclaration(SoalParser.OperationDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParameterList(SoalParser.ParameterListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParameter(SoalParser.ParameterContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOperationResult(SoalParser.OperationResultContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentDeclaration(SoalParser.ComponentDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentElements(SoalParser.ComponentElementsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentElement(SoalParser.ComponentElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentService(SoalParser.ComponentServiceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentReference(SoalParser.ComponentReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentServiceOrReferenceBody(SoalParser.ComponentServiceOrReferenceBodyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentServiceOrReferenceElement(SoalParser.ComponentServiceOrReferenceElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentProperty(SoalParser.ComponentPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentImplementation(SoalParser.ComponentImplementationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComponentLanguage(SoalParser.ComponentLanguageContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCompositeDeclaration(SoalParser.CompositeDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssemblyDeclaration(SoalParser.AssemblyDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCompositeElements(SoalParser.CompositeElementsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCompositeElement(SoalParser.CompositeElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCompositeComponent(SoalParser.CompositeComponentContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCompositeWire(SoalParser.CompositeWireContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitWireSource(SoalParser.WireSourceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitWireTarget(SoalParser.WireTargetContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDeploymentDeclaration(SoalParser.DeploymentDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDeploymentElements(SoalParser.DeploymentElementsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDeploymentElement(SoalParser.DeploymentElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnvironmentDeclaration(SoalParser.EnvironmentDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuntimeDeclaration(SoalParser.RuntimeDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuntimeReference(SoalParser.RuntimeReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssemblyReference(SoalParser.AssemblyReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDatabaseReference(SoalParser.DatabaseReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBindingDeclaration(SoalParser.BindingDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBindingLayers(SoalParser.BindingLayersContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTransportLayer(SoalParser.TransportLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitHttpTransportLayer(SoalParser.HttpTransportLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRestTransportLayer(SoalParser.RestTransportLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitWebSocketTransportLayer(SoalParser.WebSocketTransportLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitHttpTransportLayerProperties(SoalParser.HttpTransportLayerPropertiesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitHttpSslProperty(SoalParser.HttpSslPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitHttpClientAuthenticationProperty(SoalParser.HttpClientAuthenticationPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEncodingLayer(SoalParser.EncodingLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSoapEncodingLayer(SoalParser.SoapEncodingLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitXmlEncodingLayer(SoalParser.XmlEncodingLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitJsonEncodingLayer(SoalParser.JsonEncodingLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSoapEncodingProperties(SoalParser.SoapEncodingPropertiesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSoapVersionProperty(SoalParser.SoapVersionPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSoapMtomProperty(SoalParser.SoapMtomPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSoapStyleProperty(SoalParser.SoapStylePropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitProtocolLayer(SoalParser.ProtocolLayerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitProtocolLayerKind(SoalParser.ProtocolLayerKindContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEndpointDeclaration(SoalParser.EndpointDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEndpointProperties(SoalParser.EndpointPropertiesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEndpointProperty(SoalParser.EndpointPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEndpointBindingProperty(SoalParser.EndpointBindingPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEndpointAddressProperty(SoalParser.EndpointAddressPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnType(SoalParser.ReturnTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeReference(SoalParser.TypeReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSimpleType(SoalParser.SimpleTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNulledType(SoalParser.NulledTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReferenceType(SoalParser.ReferenceTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitObjectType(SoalParser.ObjectTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitValueType(SoalParser.ValueTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitVoidType(SoalParser.VoidTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOnewayType(SoalParser.OnewayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullableType(SoalParser.NullableTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNonNullableType(SoalParser.NonNullableTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNonNullableArrayType(SoalParser.NonNullableArrayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitArrayType(SoalParser.ArrayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSimpleArrayType(SoalParser.SimpleArrayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNulledArrayType(SoalParser.NulledArrayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConstantValue(SoalParser.ConstantValueContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeofValue(SoalParser.TypeofValueContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifier(SoalParser.IdentifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteral(SoalParser.LiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullLiteral(SoalParser.NullLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBooleanLiteral(SoalParser.BooleanLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIntegerLiteral(SoalParser.IntegerLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDecimalLiteral(SoalParser.DecimalLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitScientificLiteral(SoalParser.ScientificLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitStringLiteral(SoalParser.StringLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitContextualKeywords(SoalParser.ContextualKeywordsContext ctx)
    {
        return this.visitChildren(ctx);
    }
}

