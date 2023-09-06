/**
 */
package soal.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import soal.model.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see soal.model.SoalModelPackage
 * @generated
 */
public class SoalModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static SoalModelPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public SoalModelSwitch() {
		if (modelPackage == null) {
			modelPackage = SoalModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a
	 * non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SoalModelPackage.GLOBAL_SOAL_MODEL: {
			GlobalSoalModel globalSoalModel = (GlobalSoalModel) theEObject;
			T result = caseGlobalSoalModel(globalSoalModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.SOAL_MODEL: {
			SoalModel soalModel = (SoalModel) theEObject;
			T result = caseSoalModel(soalModel);
			if (result == null)
				result = caseNamedElement(soalModel);
			if (result == null)
				result = caseElement(soalModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.DOCUMENTATION: {
			Documentation documentation = (Documentation) theEObject;
			T result = caseDocumentation(documentation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.DOCUMENTATION_TAG: {
			DocumentationTag documentationTag = (DocumentationTag) theEObject;
			T result = caseDocumentationTag(documentationTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.DECLARATION: {
			Declaration declaration = (Declaration) theEObject;
			T result = caseDeclaration(declaration);
			if (result == null)
				result = caseNamedElement(declaration);
			if (result == null)
				result = caseElement(declaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.NAMED_TYPE: {
			NamedType namedType = (NamedType) theEObject;
			T result = caseNamedType(namedType);
			if (result == null)
				result = caseType(namedType);
			if (result == null)
				result = caseDeclaration(namedType);
			if (result == null)
				result = caseNamedElement(namedType);
			if (result == null)
				result = caseElement(namedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.BUILT_IN_TYPE: {
			BuiltInType builtInType = (BuiltInType) theEObject;
			T result = caseBuiltInType(builtInType);
			if (result == null)
				result = caseNamedType(builtInType);
			if (result == null)
				result = caseType(builtInType);
			if (result == null)
				result = caseDeclaration(builtInType);
			if (result == null)
				result = caseNamedElement(builtInType);
			if (result == null)
				result = caseElement(builtInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.TYPE_REFERENCE: {
			TypeReference typeReference = (TypeReference) theEObject;
			T result = caseTypeReference(typeReference);
			if (result == null)
				result = caseType(typeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE: {
			SimpleTypeReference simpleTypeReference = (SimpleTypeReference) theEObject;
			T result = caseSimpleTypeReference(simpleTypeReference);
			if (result == null)
				result = caseTypeReference(simpleTypeReference);
			if (result == null)
				result = caseType(simpleTypeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.ARRAY_TYPE: {
			ArrayType arrayType = (ArrayType) theEObject;
			T result = caseArrayType(arrayType);
			if (result == null)
				result = caseTypeReference(arrayType);
			if (result == null)
				result = caseType(arrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.REFERENCE_ARRAY_TYPE: {
			ReferenceArrayType referenceArrayType = (ReferenceArrayType) theEObject;
			T result = caseReferenceArrayType(referenceArrayType);
			if (result == null)
				result = caseArrayType(referenceArrayType);
			if (result == null)
				result = caseTypeReference(referenceArrayType);
			if (result == null)
				result = caseType(referenceArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE: {
			ContainmentArrayType containmentArrayType = (ContainmentArrayType) theEObject;
			T result = caseContainmentArrayType(containmentArrayType);
			if (result == null)
				result = caseArrayType(containmentArrayType);
			if (result == null)
				result = caseTypeReference(containmentArrayType);
			if (result == null)
				result = caseType(containmentArrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.NULLABLE_TYPE: {
			NullableType nullableType = (NullableType) theEObject;
			T result = caseNullableType(nullableType);
			if (result == null)
				result = caseTypeReference(nullableType);
			if (result == null)
				result = caseType(nullableType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.ENUM_TYPE: {
			EnumType enumType = (EnumType) theEObject;
			T result = caseEnumType(enumType);
			if (result == null)
				result = caseNamedType(enumType);
			if (result == null)
				result = caseType(enumType);
			if (result == null)
				result = caseDeclaration(enumType);
			if (result == null)
				result = caseNamedElement(enumType);
			if (result == null)
				result = caseElement(enumType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.ENUM_LITERAL: {
			EnumLiteral enumLiteral = (EnumLiteral) theEObject;
			T result = caseEnumLiteral(enumLiteral);
			if (result == null)
				result = caseNamedElement(enumLiteral);
			if (result == null)
				result = caseElement(enumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.STRUCT_TYPE: {
			StructType structType = (StructType) theEObject;
			T result = caseStructType(structType);
			if (result == null)
				result = caseNamedType(structType);
			if (result == null)
				result = caseType(structType);
			if (result == null)
				result = caseDeclaration(structType);
			if (result == null)
				result = caseNamedElement(structType);
			if (result == null)
				result = caseElement(structType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseDeclaration(variable);
			if (result == null)
				result = caseTypedElement(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = caseElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseVariable(property);
			if (result == null)
				result = caseDeclaration(property);
			if (result == null)
				result = caseTypedElement(property);
			if (result == null)
				result = caseNamedElement(property);
			if (result == null)
				result = caseElement(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseVariable(parameter);
			if (result == null)
				result = caseDeclaration(parameter);
			if (result == null)
				result = caseTypedElement(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = caseElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseDeclaration(interface_);
			if (result == null)
				result = caseNamedElement(interface_);
			if (result == null)
				result = caseElement(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.RESOURCE: {
			Resource resource = (Resource) theEObject;
			T result = caseResource(resource);
			if (result == null)
				result = caseDeclaration(resource);
			if (result == null)
				result = caseNamedElement(resource);
			if (result == null)
				result = caseElement(resource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseDeclaration(operation);
			if (result == null)
				result = caseNamedElement(operation);
			if (result == null)
				result = caseElement(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.PARAMETER_LIST: {
			ParameterList parameterList = (ParameterList) theEObject;
			T result = caseParameterList(parameterList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoalModelPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseDeclaration(service);
			if (result == null)
				result = caseNamedElement(service);
			if (result == null)
				result = caseElement(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global
	 * Soal Model</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global
	 *         Soal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalSoalModel(GlobalSoalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soal
	 * Model</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soal
	 *         Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoalModel(SoalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Documentation</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Documentation Tag</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Documentation Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationTag(DocumentationTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Element</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named
	 * Element</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named
	 *         Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed
	 * Element</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed
	 *         Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Declaration</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInType(BuiltInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type
	 * Reference</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type
	 *         Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple
	 * Type Reference</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple
	 *         Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTypeReference(SimpleTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Reference Array Type</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Reference Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceArrayType(ReferenceArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Containment Array Type</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the
	 * switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Containment Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentArrayType(ContainmentArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nullable
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nullable
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullableType(NullableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum
	 * Literal</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum
	 *         Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructType(StructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Variable</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Property</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Parameter</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Interface</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Resource</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Operation</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Parameter List</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterList(ParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Service</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last
	 * case anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // SoalModelSwitch
