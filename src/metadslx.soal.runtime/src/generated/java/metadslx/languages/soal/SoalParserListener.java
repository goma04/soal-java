// Generated from SoalParser.g4 by ANTLR 4.5.1
package metadslx.languages.soal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoalParser}.
 */
public interface SoalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SoalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SoalParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SoalParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SoalParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SoalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SoalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SoalParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SoalParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(SoalParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(SoalParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#returnAnnotationList}.
	 * @param ctx the parse tree
	 */
	void enterReturnAnnotationList(SoalParser.ReturnAnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#returnAnnotationList}.
	 * @param ctx the parse tree
	 */
	void exitReturnAnnotationList(SoalParser.ReturnAnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SoalParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SoalParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#returnAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterReturnAnnotation(SoalParser.ReturnAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#returnAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitReturnAnnotation(SoalParser.ReturnAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationBody(SoalParser.AnnotationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationBody(SoalParser.AnnotationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationProperties}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationProperties(SoalParser.AnnotationPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationProperties}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationProperties(SoalParser.AnnotationPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationPropertyList(SoalParser.AnnotationPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationPropertyList(SoalParser.AnnotationPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationProperty}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationProperty(SoalParser.AnnotationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationProperty}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationProperty(SoalParser.AnnotationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#annotationPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationPropertyValue(SoalParser.AnnotationPropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#annotationPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationPropertyValue(SoalParser.AnnotationPropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(SoalParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(SoalParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SoalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SoalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SoalParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SoalParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#enumLiterals}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiterals(SoalParser.EnumLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#enumLiterals}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiterals(SoalParser.EnumLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteral(SoalParser.EnumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteral(SoalParser.EnumLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(SoalParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(SoalParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(SoalParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(SoalParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseDeclaration(SoalParser.DatabaseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseDeclaration(SoalParser.DatabaseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#entityReference}.
	 * @param ctx the parse tree
	 */
	void enterEntityReference(SoalParser.EntityReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#entityReference}.
	 * @param ctx the parse tree
	 */
	void exitEntityReference(SoalParser.EntityReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(SoalParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(SoalParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#operationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperationDeclaration(SoalParser.OperationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#operationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperationDeclaration(SoalParser.OperationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SoalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SoalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SoalParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SoalParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#operationResult}.
	 * @param ctx the parse tree
	 */
	void enterOperationResult(SoalParser.OperationResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#operationResult}.
	 * @param ctx the parse tree
	 */
	void exitOperationResult(SoalParser.OperationResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(SoalParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(SoalParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentElements}.
	 * @param ctx the parse tree
	 */
	void enterComponentElements(SoalParser.ComponentElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentElements}.
	 * @param ctx the parse tree
	 */
	void exitComponentElements(SoalParser.ComponentElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentElement(SoalParser.ComponentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentElement(SoalParser.ComponentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentService}.
	 * @param ctx the parse tree
	 */
	void enterComponentService(SoalParser.ComponentServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentService}.
	 * @param ctx the parse tree
	 */
	void exitComponentService(SoalParser.ComponentServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentReference}.
	 * @param ctx the parse tree
	 */
	void enterComponentReference(SoalParser.ComponentReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentReference}.
	 * @param ctx the parse tree
	 */
	void exitComponentReference(SoalParser.ComponentReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentServiceOrReferenceBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentServiceOrReferenceBody(SoalParser.ComponentServiceOrReferenceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentServiceOrReferenceBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentServiceOrReferenceBody(SoalParser.ComponentServiceOrReferenceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentServiceOrReferenceElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentServiceOrReferenceElement(SoalParser.ComponentServiceOrReferenceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentServiceOrReferenceElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentServiceOrReferenceElement(SoalParser.ComponentServiceOrReferenceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(SoalParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(SoalParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentImplementation}.
	 * @param ctx the parse tree
	 */
	void enterComponentImplementation(SoalParser.ComponentImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentImplementation}.
	 * @param ctx the parse tree
	 */
	void exitComponentImplementation(SoalParser.ComponentImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#componentLanguage}.
	 * @param ctx the parse tree
	 */
	void enterComponentLanguage(SoalParser.ComponentLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#componentLanguage}.
	 * @param ctx the parse tree
	 */
	void exitComponentLanguage(SoalParser.ComponentLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#compositeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompositeDeclaration(SoalParser.CompositeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#compositeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompositeDeclaration(SoalParser.CompositeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#assemblyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyDeclaration(SoalParser.AssemblyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#assemblyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyDeclaration(SoalParser.AssemblyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#compositeElements}.
	 * @param ctx the parse tree
	 */
	void enterCompositeElements(SoalParser.CompositeElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#compositeElements}.
	 * @param ctx the parse tree
	 */
	void exitCompositeElements(SoalParser.CompositeElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#compositeElement}.
	 * @param ctx the parse tree
	 */
	void enterCompositeElement(SoalParser.CompositeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#compositeElement}.
	 * @param ctx the parse tree
	 */
	void exitCompositeElement(SoalParser.CompositeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#compositeComponent}.
	 * @param ctx the parse tree
	 */
	void enterCompositeComponent(SoalParser.CompositeComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#compositeComponent}.
	 * @param ctx the parse tree
	 */
	void exitCompositeComponent(SoalParser.CompositeComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#compositeWire}.
	 * @param ctx the parse tree
	 */
	void enterCompositeWire(SoalParser.CompositeWireContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#compositeWire}.
	 * @param ctx the parse tree
	 */
	void exitCompositeWire(SoalParser.CompositeWireContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#wireSource}.
	 * @param ctx the parse tree
	 */
	void enterWireSource(SoalParser.WireSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#wireSource}.
	 * @param ctx the parse tree
	 */
	void exitWireSource(SoalParser.WireSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#wireTarget}.
	 * @param ctx the parse tree
	 */
	void enterWireTarget(SoalParser.WireTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#wireTarget}.
	 * @param ctx the parse tree
	 */
	void exitWireTarget(SoalParser.WireTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#deploymentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeploymentDeclaration(SoalParser.DeploymentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#deploymentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeploymentDeclaration(SoalParser.DeploymentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#deploymentElements}.
	 * @param ctx the parse tree
	 */
	void enterDeploymentElements(SoalParser.DeploymentElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#deploymentElements}.
	 * @param ctx the parse tree
	 */
	void exitDeploymentElements(SoalParser.DeploymentElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#deploymentElement}.
	 * @param ctx the parse tree
	 */
	void enterDeploymentElement(SoalParser.DeploymentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#deploymentElement}.
	 * @param ctx the parse tree
	 */
	void exitDeploymentElement(SoalParser.DeploymentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDeclaration(SoalParser.EnvironmentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDeclaration(SoalParser.EnvironmentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#runtimeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeDeclaration(SoalParser.RuntimeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#runtimeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeDeclaration(SoalParser.RuntimeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#runtimeReference}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeReference(SoalParser.RuntimeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#runtimeReference}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeReference(SoalParser.RuntimeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#assemblyReference}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyReference(SoalParser.AssemblyReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#assemblyReference}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyReference(SoalParser.AssemblyReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#databaseReference}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseReference(SoalParser.DatabaseReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#databaseReference}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseReference(SoalParser.DatabaseReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#bindingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBindingDeclaration(SoalParser.BindingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#bindingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBindingDeclaration(SoalParser.BindingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#bindingLayers}.
	 * @param ctx the parse tree
	 */
	void enterBindingLayers(SoalParser.BindingLayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#bindingLayers}.
	 * @param ctx the parse tree
	 */
	void exitBindingLayers(SoalParser.BindingLayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#transportLayer}.
	 * @param ctx the parse tree
	 */
	void enterTransportLayer(SoalParser.TransportLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#transportLayer}.
	 * @param ctx the parse tree
	 */
	void exitTransportLayer(SoalParser.TransportLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#httpTransportLayer}.
	 * @param ctx the parse tree
	 */
	void enterHttpTransportLayer(SoalParser.HttpTransportLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#httpTransportLayer}.
	 * @param ctx the parse tree
	 */
	void exitHttpTransportLayer(SoalParser.HttpTransportLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#restTransportLayer}.
	 * @param ctx the parse tree
	 */
	void enterRestTransportLayer(SoalParser.RestTransportLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#restTransportLayer}.
	 * @param ctx the parse tree
	 */
	void exitRestTransportLayer(SoalParser.RestTransportLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#webSocketTransportLayer}.
	 * @param ctx the parse tree
	 */
	void enterWebSocketTransportLayer(SoalParser.WebSocketTransportLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#webSocketTransportLayer}.
	 * @param ctx the parse tree
	 */
	void exitWebSocketTransportLayer(SoalParser.WebSocketTransportLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#httpTransportLayerProperties}.
	 * @param ctx the parse tree
	 */
	void enterHttpTransportLayerProperties(SoalParser.HttpTransportLayerPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#httpTransportLayerProperties}.
	 * @param ctx the parse tree
	 */
	void exitHttpTransportLayerProperties(SoalParser.HttpTransportLayerPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#httpSslProperty}.
	 * @param ctx the parse tree
	 */
	void enterHttpSslProperty(SoalParser.HttpSslPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#httpSslProperty}.
	 * @param ctx the parse tree
	 */
	void exitHttpSslProperty(SoalParser.HttpSslPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#httpClientAuthenticationProperty}.
	 * @param ctx the parse tree
	 */
	void enterHttpClientAuthenticationProperty(SoalParser.HttpClientAuthenticationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#httpClientAuthenticationProperty}.
	 * @param ctx the parse tree
	 */
	void exitHttpClientAuthenticationProperty(SoalParser.HttpClientAuthenticationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#encodingLayer}.
	 * @param ctx the parse tree
	 */
	void enterEncodingLayer(SoalParser.EncodingLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#encodingLayer}.
	 * @param ctx the parse tree
	 */
	void exitEncodingLayer(SoalParser.EncodingLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#soapEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void enterSoapEncodingLayer(SoalParser.SoapEncodingLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#soapEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void exitSoapEncodingLayer(SoalParser.SoapEncodingLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#xmlEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void enterXmlEncodingLayer(SoalParser.XmlEncodingLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#xmlEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void exitXmlEncodingLayer(SoalParser.XmlEncodingLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#jsonEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void enterJsonEncodingLayer(SoalParser.JsonEncodingLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#jsonEncodingLayer}.
	 * @param ctx the parse tree
	 */
	void exitJsonEncodingLayer(SoalParser.JsonEncodingLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#soapEncodingProperties}.
	 * @param ctx the parse tree
	 */
	void enterSoapEncodingProperties(SoalParser.SoapEncodingPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#soapEncodingProperties}.
	 * @param ctx the parse tree
	 */
	void exitSoapEncodingProperties(SoalParser.SoapEncodingPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#soapVersionProperty}.
	 * @param ctx the parse tree
	 */
	void enterSoapVersionProperty(SoalParser.SoapVersionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#soapVersionProperty}.
	 * @param ctx the parse tree
	 */
	void exitSoapVersionProperty(SoalParser.SoapVersionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#soapMtomProperty}.
	 * @param ctx the parse tree
	 */
	void enterSoapMtomProperty(SoalParser.SoapMtomPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#soapMtomProperty}.
	 * @param ctx the parse tree
	 */
	void exitSoapMtomProperty(SoalParser.SoapMtomPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#soapStyleProperty}.
	 * @param ctx the parse tree
	 */
	void enterSoapStyleProperty(SoalParser.SoapStylePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#soapStyleProperty}.
	 * @param ctx the parse tree
	 */
	void exitSoapStyleProperty(SoalParser.SoapStylePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#protocolLayer}.
	 * @param ctx the parse tree
	 */
	void enterProtocolLayer(SoalParser.ProtocolLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#protocolLayer}.
	 * @param ctx the parse tree
	 */
	void exitProtocolLayer(SoalParser.ProtocolLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#protocolLayerKind}.
	 * @param ctx the parse tree
	 */
	void enterProtocolLayerKind(SoalParser.ProtocolLayerKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#protocolLayerKind}.
	 * @param ctx the parse tree
	 */
	void exitProtocolLayerKind(SoalParser.ProtocolLayerKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#endpointDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEndpointDeclaration(SoalParser.EndpointDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#endpointDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEndpointDeclaration(SoalParser.EndpointDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#endpointProperties}.
	 * @param ctx the parse tree
	 */
	void enterEndpointProperties(SoalParser.EndpointPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#endpointProperties}.
	 * @param ctx the parse tree
	 */
	void exitEndpointProperties(SoalParser.EndpointPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#endpointProperty}.
	 * @param ctx the parse tree
	 */
	void enterEndpointProperty(SoalParser.EndpointPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#endpointProperty}.
	 * @param ctx the parse tree
	 */
	void exitEndpointProperty(SoalParser.EndpointPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#endpointBindingProperty}.
	 * @param ctx the parse tree
	 */
	void enterEndpointBindingProperty(SoalParser.EndpointBindingPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#endpointBindingProperty}.
	 * @param ctx the parse tree
	 */
	void exitEndpointBindingProperty(SoalParser.EndpointBindingPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#endpointAddressProperty}.
	 * @param ctx the parse tree
	 */
	void enterEndpointAddressProperty(SoalParser.EndpointAddressPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#endpointAddressProperty}.
	 * @param ctx the parse tree
	 */
	void exitEndpointAddressProperty(SoalParser.EndpointAddressPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(SoalParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(SoalParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(SoalParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(SoalParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(SoalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(SoalParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nulledType}.
	 * @param ctx the parse tree
	 */
	void enterNulledType(SoalParser.NulledTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nulledType}.
	 * @param ctx the parse tree
	 */
	void exitNulledType(SoalParser.NulledTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(SoalParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(SoalParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(SoalParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(SoalParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(SoalParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(SoalParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(SoalParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(SoalParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#onewayType}.
	 * @param ctx the parse tree
	 */
	void enterOnewayType(SoalParser.OnewayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#onewayType}.
	 * @param ctx the parse tree
	 */
	void exitOnewayType(SoalParser.OnewayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(SoalParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(SoalParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nonNullableType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullableType(SoalParser.NonNullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nonNullableType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullableType(SoalParser.NonNullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nonNullableArrayType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullableArrayType(SoalParser.NonNullableArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nonNullableArrayType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullableArrayType(SoalParser.NonNullableArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SoalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SoalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#simpleArrayType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArrayType(SoalParser.SimpleArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#simpleArrayType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArrayType(SoalParser.SimpleArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nulledArrayType}.
	 * @param ctx the parse tree
	 */
	void enterNulledArrayType(SoalParser.NulledArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nulledArrayType}.
	 * @param ctx the parse tree
	 */
	void exitNulledArrayType(SoalParser.NulledArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#constantValue}.
	 * @param ctx the parse tree
	 */
	void enterConstantValue(SoalParser.ConstantValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#constantValue}.
	 * @param ctx the parse tree
	 */
	void exitConstantValue(SoalParser.ConstantValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#typeofValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeofValue(SoalParser.TypeofValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#typeofValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeofValue(SoalParser.TypeofValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SoalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SoalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SoalParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SoalParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SoalParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SoalParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SoalParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SoalParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SoalParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SoalParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SoalParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SoalParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void enterScientificLiteral(SoalParser.ScientificLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void exitScientificLiteral(SoalParser.ScientificLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SoalParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SoalParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoalParser#contextualKeywords}.
	 * @param ctx the parse tree
	 */
	void enterContextualKeywords(SoalParser.ContextualKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoalParser#contextualKeywords}.
	 * @param ctx the parse tree
	 */
	void exitContextualKeywords(SoalParser.ContextualKeywordsContext ctx);
}