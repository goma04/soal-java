// Generated from SoalParser.g4 by ANTLR 4.5.1
package metadslx.languages.soal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SoalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SoalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SoalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SoalParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SoalParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SoalParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(SoalParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(SoalParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#returnAnnotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAnnotationList(SoalParser.ReturnAnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SoalParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#returnAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAnnotation(SoalParser.ReturnAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationBody(SoalParser.AnnotationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationProperties(SoalParser.AnnotationPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationPropertyList(SoalParser.AnnotationPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationProperty(SoalParser.AnnotationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#annotationPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationPropertyValue(SoalParser.AnnotationPropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(SoalParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SoalParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(SoalParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#enumLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiterals(SoalParser.EnumLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#enumLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiteral(SoalParser.EnumLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(SoalParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(SoalParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseDeclaration(SoalParser.DatabaseDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#entityReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityReference(SoalParser.EntityReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(SoalParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#operationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDeclaration(SoalParser.OperationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SoalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SoalParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#operationResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationResult(SoalParser.OperationResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(SoalParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentElements(SoalParser.ComponentElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentElement(SoalParser.ComponentElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentService}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentService(SoalParser.ComponentServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentReference(SoalParser.ComponentReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentServiceOrReferenceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentServiceOrReferenceBody(SoalParser.ComponentServiceOrReferenceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentServiceOrReferenceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentServiceOrReferenceElement(SoalParser.ComponentServiceOrReferenceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(SoalParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentImplementation(SoalParser.ComponentImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#componentLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentLanguage(SoalParser.ComponentLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#compositeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeDeclaration(SoalParser.CompositeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#assemblyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyDeclaration(SoalParser.AssemblyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#compositeElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeElements(SoalParser.CompositeElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#compositeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeElement(SoalParser.CompositeElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#compositeComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeComponent(SoalParser.CompositeComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#compositeWire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeWire(SoalParser.CompositeWireContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#wireSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWireSource(SoalParser.WireSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#wireTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWireTarget(SoalParser.WireTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#deploymentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploymentDeclaration(SoalParser.DeploymentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#deploymentElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploymentElements(SoalParser.DeploymentElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#deploymentElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeploymentElement(SoalParser.DeploymentElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#environmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDeclaration(SoalParser.EnvironmentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#runtimeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeDeclaration(SoalParser.RuntimeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#runtimeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeReference(SoalParser.RuntimeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#assemblyReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyReference(SoalParser.AssemblyReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#databaseReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseReference(SoalParser.DatabaseReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#bindingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingDeclaration(SoalParser.BindingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#bindingLayers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingLayers(SoalParser.BindingLayersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#transportLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransportLayer(SoalParser.TransportLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#httpTransportLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpTransportLayer(SoalParser.HttpTransportLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#restTransportLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestTransportLayer(SoalParser.RestTransportLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#webSocketTransportLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebSocketTransportLayer(SoalParser.WebSocketTransportLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#httpTransportLayerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpTransportLayerProperties(SoalParser.HttpTransportLayerPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#httpSslProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpSslProperty(SoalParser.HttpSslPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#httpClientAuthenticationProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpClientAuthenticationProperty(SoalParser.HttpClientAuthenticationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#encodingLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodingLayer(SoalParser.EncodingLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#soapEncodingLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoapEncodingLayer(SoalParser.SoapEncodingLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#xmlEncodingLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlEncodingLayer(SoalParser.XmlEncodingLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#jsonEncodingLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonEncodingLayer(SoalParser.JsonEncodingLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#soapEncodingProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoapEncodingProperties(SoalParser.SoapEncodingPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#soapVersionProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoapVersionProperty(SoalParser.SoapVersionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#soapMtomProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoapMtomProperty(SoalParser.SoapMtomPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#soapStyleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoapStyleProperty(SoalParser.SoapStylePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#protocolLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolLayer(SoalParser.ProtocolLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#protocolLayerKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolLayerKind(SoalParser.ProtocolLayerKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#endpointDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointDeclaration(SoalParser.EndpointDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#endpointProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointProperties(SoalParser.EndpointPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#endpointProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointProperty(SoalParser.EndpointPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#endpointBindingProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointBindingProperty(SoalParser.EndpointBindingPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#endpointAddressProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointAddressProperty(SoalParser.EndpointAddressPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(SoalParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(SoalParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(SoalParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nulledType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulledType(SoalParser.NulledTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(SoalParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(SoalParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(SoalParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(SoalParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#onewayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnewayType(SoalParser.OnewayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(SoalParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nonNullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullableType(SoalParser.NonNullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nonNullableArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullableArrayType(SoalParser.NonNullableArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SoalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#simpleArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrayType(SoalParser.SimpleArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nulledArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulledArrayType(SoalParser.NulledArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#constantValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(SoalParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#typeofValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofValue(SoalParser.TypeofValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SoalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SoalParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SoalParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SoalParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SoalParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SoalParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#scientificLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificLiteral(SoalParser.ScientificLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SoalParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoalParser#contextualKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextualKeywords(SoalParser.ContextualKeywordsContext ctx);
}