/**
 */
package soal.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soal.model.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SoalModelFactoryImpl extends EFactoryImpl implements SoalModelFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static SoalModelFactory init() {
		try {
			SoalModelFactory theSoalModelFactory = (SoalModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(SoalModelPackage.eNS_URI);
			if (theSoalModelFactory != null) {
				return theSoalModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoalModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public SoalModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SoalModelPackage.GLOBAL_SOAL_MODEL:
			return createGlobalSoalModel();
		case SoalModelPackage.SOAL_MODEL:
			return createSoalModel();
		case SoalModelPackage.DOCUMENTATION:
			return createDocumentation();
		case SoalModelPackage.DOCUMENTATION_TAG:
			return createDocumentationTag();
		case SoalModelPackage.BUILT_IN_TYPE:
			return createBuiltInType();
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE:
			return createSimpleTypeReference();
		case SoalModelPackage.REFERENCE_ARRAY_TYPE:
			return createReferenceArrayType();
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE:
			return createContainmentArrayType();
		case SoalModelPackage.NULLABLE_TYPE:
			return createNullableType();
		case SoalModelPackage.ENUM_TYPE:
			return createEnumType();
		case SoalModelPackage.ENUM_LITERAL:
			return createEnumLiteral();
		case SoalModelPackage.STRUCT_TYPE:
			return createStructType();
		case SoalModelPackage.VARIABLE:
			return createVariable();
		case SoalModelPackage.PROPERTY:
			return createProperty();
		case SoalModelPackage.PARAMETER:
			return createParameter();
		case SoalModelPackage.INTERFACE:
			return createInterface();
		case SoalModelPackage.RESOURCE:
			return createResource();
		case SoalModelPackage.OPERATION:
			return createOperation();
		case SoalModelPackage.PARAMETER_LIST:
			return createParameterList();
		case SoalModelPackage.SERVICE:
			return createService();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SoalModelPackage.OPERATION_KIND:
			return createOperationKindFromString(eDataType, initialValue);
		case SoalModelPackage.DOCUMENTATION_TAG_KIND:
			return createDocumentationTagKindFromString(eDataType, initialValue);
		case SoalModelPackage.BUILT_IN_TYPE_KIND:
			return createBuiltInTypeKindFromString(eDataType, initialValue);
		case SoalModelPackage.BINDING_KIND:
			return createBindingKindFromString(eDataType, initialValue);
		case SoalModelPackage.ROOT_SOAL_MODEL:
			return createRootSoalModelFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SoalModelPackage.OPERATION_KIND:
			return convertOperationKindToString(eDataType, instanceValue);
		case SoalModelPackage.DOCUMENTATION_TAG_KIND:
			return convertDocumentationTagKindToString(eDataType, instanceValue);
		case SoalModelPackage.BUILT_IN_TYPE_KIND:
			return convertBuiltInTypeKindToString(eDataType, instanceValue);
		case SoalModelPackage.BINDING_KIND:
			return convertBindingKindToString(eDataType, instanceValue);
		case SoalModelPackage.ROOT_SOAL_MODEL:
			return convertRootSoalModelToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public GlobalSoalModel createGlobalSoalModel() {
		GlobalSoalModelImpl globalSoalModel = new GlobalSoalModelImpl();
		return globalSoalModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SoalModel createSoalModel() {
		SoalModelImpl soalModel = new SoalModelImpl();
		return soalModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DocumentationTag createDocumentationTag() {
		DocumentationTagImpl documentationTag = new DocumentationTagImpl();
		return documentationTag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType createBuiltInType() {
		BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SimpleTypeReference createSimpleTypeReference() {
		SimpleTypeReferenceImpl simpleTypeReference = new SimpleTypeReferenceImpl();
		return simpleTypeReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ReferenceArrayType createReferenceArrayType() {
		ReferenceArrayTypeImpl referenceArrayType = new ReferenceArrayTypeImpl();
		return referenceArrayType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ContainmentArrayType createContainmentArrayType() {
		ContainmentArrayTypeImpl containmentArrayType = new ContainmentArrayTypeImpl();
		return containmentArrayType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NullableType createNullableType() {
		NullableTypeImpl nullableType = new NullableTypeImpl();
		return nullableType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationKind createOperationKindFromString(EDataType eDataType, String initialValue) {
		OperationKind result = OperationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentationTagKind createDocumentationTagKindFromString(EDataType eDataType, String initialValue) {
		DocumentationTagKind result = DocumentationTagKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDocumentationTagKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuiltInTypeKind createBuiltInTypeKindFromString(EDataType eDataType, String initialValue) {
		BuiltInTypeKind result = BuiltInTypeKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBuiltInTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BindingKind createBindingKindFromString(EDataType eDataType, String initialValue) {
		BindingKind result = BindingKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RootSoalModel createRootSoalModelFromString(EDataType eDataType, String initialValue) {
		return (RootSoalModel) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRootSoalModelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SoalModelPackage getSoalModelPackage() {
		return (SoalModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoalModelPackage getPackage() {
		return SoalModelPackage.eINSTANCE;
	}

} // SoalModelFactoryImpl
