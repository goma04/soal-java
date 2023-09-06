/**
 */
package soal.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import soal.model.ArrayType;
import soal.model.BindingKind;
import soal.model.BuiltInType;
import soal.model.BuiltInTypeKind;
import soal.model.ContainmentArrayType;
import soal.model.Declaration;
import soal.model.Documentation;
import soal.model.DocumentationTag;
import soal.model.DocumentationTagKind;
import soal.model.Element;
import soal.model.EnumLiteral;
import soal.model.EnumType;
import soal.model.GlobalSoalModel;
import soal.model.Interface;
import soal.model.NamedElement;
import soal.model.NamedType;
import soal.model.NullableType;
import soal.model.Operation;
import soal.model.OperationKind;
import soal.model.Parameter;
import soal.model.ParameterList;
import soal.model.Property;
import soal.model.ReferenceArrayType;
import soal.model.Resource;
import soal.model.RootSoalModel;
import soal.model.Service;
import soal.model.SimpleTypeReference;
import soal.model.SoalModel;
import soal.model.SoalModelFactory;
import soal.model.SoalModelPackage;
import soal.model.StructType;
import soal.model.Type;
import soal.model.TypeReference;
import soal.model.TypedElement;
import soal.model.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SoalModelPackageImpl extends EPackageImpl implements SoalModelPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass globalSoalModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass soalModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentationTagEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builtInTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass simpleTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass referenceArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass containmentArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nullableTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass structTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum operationKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum documentationTagKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum builtInTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum bindingKindEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType rootSoalModelEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method
	 * {@link #init init()}, which also performs initialization of the package, or
	 * returns the registered package, if one already exists. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see soal.model.SoalModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoalModelPackageImpl() {
		super(eNS_URI, SoalModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link SoalModelPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoalModelPackage init() {
		if (isInited)
			return (SoalModelPackage) EPackage.Registry.INSTANCE.getEPackage(SoalModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSoalModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SoalModelPackageImpl theSoalModelPackage = registeredSoalModelPackage instanceof SoalModelPackageImpl
				? (SoalModelPackageImpl) registeredSoalModelPackage
				: new SoalModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSoalModelPackage.createPackageContents();

		// Initialize created meta-data
		theSoalModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoalModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoalModelPackage.eNS_URI, theSoalModelPackage);
		return theSoalModelPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getGlobalSoalModel() {
		return globalSoalModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_ErrorType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_AnyType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_VoidType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_ObjectType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_BinaryType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_BoolType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_StringType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_IntType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_LongType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_FloatType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_DoubleType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_DateType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_TimeType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_DateTimeType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_DurationType() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getGlobalSoalModel_BuiltInTypes() {
		return (EReference) globalSoalModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getSoalModel() {
		return soalModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getSoalModel_RootModelLazy() {
		return (EAttribute) soalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSoalModel_Imports() {
		return (EReference) soalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSoalModel_Declarations() {
		return (EReference) soalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getSoalModel_RootModel() {
		return (EAttribute) soalModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getSoalModel__GetGlobals() {
		return soalModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getDocumentation_Tags() {
		return (EReference) documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDocumentationTag() {
		return documentationTagEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDocumentationTag_Kind() {
		return (EAttribute) documentationTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDocumentationTag_Name() {
		return (EAttribute) documentationTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDocumentationTag_Lines() {
		return (EAttribute) documentationTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDocumentationTag_HtmlLazy() {
		return (EAttribute) documentationTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getDocumentationTag__GetHtml() {
		return documentationTagEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getNamedElement_DocumentationLazy() {
		return (EReference) namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getNamedElement__GetUniqueName() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getNamedElement__GetDocumentation() {
		return namedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getNamedElement__GetHoverDocumentation() {
		return namedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getTypedElement_TypeReference() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getTypedElement__GetType() {
		return typedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNamedType() {
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBuiltInType() {
		return builtInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBuiltInType_Kind() {
		return (EAttribute) builtInTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getTypeReference__GetReferencedType() {
		return typeReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getSimpleTypeReference() {
		return simpleTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getSimpleTypeReference_ReferencedType() {
		return (EReference) simpleTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getArrayType__GetReferencedType() {
		return arrayTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getArrayType__GetInnerType() {
		return arrayTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getReferenceArrayType() {
		return referenceArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getReferenceArrayType_InnerType() {
		return (EReference) referenceArrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getContainmentArrayType() {
		return containmentArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getContainmentArrayType_InnerType() {
		return (EReference) containmentArrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNullableType() {
		return nullableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getNullableType_InnerType() {
		return (EReference) nullableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getNullableType__GetReferencedType() {
		return nullableTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEnumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEnumType_Literals() {
		return (EReference) enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEnumLiteral_Enum() {
		return (EReference) enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStructType() {
		return structTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStructType_BaseType() {
		return (EReference) structTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getStructType_Fields() {
		return (EReference) structTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInterface_Resources() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getInterface_Operations() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getResource_Readonly() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getResource_Entity() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getResource_Exceptions() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getResource__GetName() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Kind() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Async() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getOperation_RequestParameters() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getOperation_ResponseParameters() {
		return (EReference) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getOperation_Resource() {
		return (EReference) operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getOperation_Exceptions() {
		return (EReference) operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__HasRequestParameters() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__HasResponseParameters() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__HasManyRequestParameters() {
		return operationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__HasSingleResponseParameter() {
		return operationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__HasManyResponseParameters() {
		return operationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EOperation getOperation__SingleReturnType() {
		return operationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getParameterList_Parameters() {
		return (EReference) parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getService_Interface() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getService_Binding() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getOperationKind() {
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getDocumentationTagKind() {
		return documentationTagKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getBuiltInTypeKind() {
		return builtInTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getBindingKind() {
		return bindingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getRootSoalModel() {
		return rootSoalModelEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SoalModelFactory getSoalModelFactory() {
		return (SoalModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		globalSoalModelEClass = createEClass(GLOBAL_SOAL_MODEL);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__ERROR_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__ANY_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__VOID_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__OBJECT_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__BINARY_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__BOOL_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__STRING_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__INT_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__LONG_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__FLOAT_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__DOUBLE_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__DATE_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__TIME_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__DATE_TIME_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__DURATION_TYPE);
		createEReference(globalSoalModelEClass, GLOBAL_SOAL_MODEL__BUILT_IN_TYPES);

		soalModelEClass = createEClass(SOAL_MODEL);
		createEAttribute(soalModelEClass, SOAL_MODEL__ROOT_MODEL_LAZY);
		createEReference(soalModelEClass, SOAL_MODEL__IMPORTS);
		createEReference(soalModelEClass, SOAL_MODEL__DECLARATIONS);
		createEAttribute(soalModelEClass, SOAL_MODEL__ROOT_MODEL);
		createEOperation(soalModelEClass, SOAL_MODEL___GET_GLOBALS);

		documentationEClass = createEClass(DOCUMENTATION);
		createEReference(documentationEClass, DOCUMENTATION__TAGS);

		documentationTagEClass = createEClass(DOCUMENTATION_TAG);
		createEAttribute(documentationTagEClass, DOCUMENTATION_TAG__KIND);
		createEAttribute(documentationTagEClass, DOCUMENTATION_TAG__NAME);
		createEAttribute(documentationTagEClass, DOCUMENTATION_TAG__LINES);
		createEAttribute(documentationTagEClass, DOCUMENTATION_TAG__HTML_LAZY);
		createEOperation(documentationTagEClass, DOCUMENTATION_TAG___GET_HTML);

		elementEClass = createEClass(ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__DOCUMENTATION_LAZY);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_UNIQUE_NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_DOCUMENTATION);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_HOVER_DOCUMENTATION);

		typeEClass = createEClass(TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE_REFERENCE);
		createEOperation(typedElementEClass, TYPED_ELEMENT___GET_TYPE);

		declarationEClass = createEClass(DECLARATION);

		namedTypeEClass = createEClass(NAMED_TYPE);

		builtInTypeEClass = createEClass(BUILT_IN_TYPE);
		createEAttribute(builtInTypeEClass, BUILT_IN_TYPE__KIND);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEOperation(typeReferenceEClass, TYPE_REFERENCE___GET_REFERENCED_TYPE);

		simpleTypeReferenceEClass = createEClass(SIMPLE_TYPE_REFERENCE);
		createEReference(simpleTypeReferenceEClass, SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEOperation(arrayTypeEClass, ARRAY_TYPE___GET_REFERENCED_TYPE);
		createEOperation(arrayTypeEClass, ARRAY_TYPE___GET_INNER_TYPE);

		referenceArrayTypeEClass = createEClass(REFERENCE_ARRAY_TYPE);
		createEReference(referenceArrayTypeEClass, REFERENCE_ARRAY_TYPE__INNER_TYPE);

		containmentArrayTypeEClass = createEClass(CONTAINMENT_ARRAY_TYPE);
		createEReference(containmentArrayTypeEClass, CONTAINMENT_ARRAY_TYPE__INNER_TYPE);

		nullableTypeEClass = createEClass(NULLABLE_TYPE);
		createEReference(nullableTypeEClass, NULLABLE_TYPE__INNER_TYPE);
		createEOperation(nullableTypeEClass, NULLABLE_TYPE___GET_REFERENCED_TYPE);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEReference(enumTypeEClass, ENUM_TYPE__LITERALS);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEReference(enumLiteralEClass, ENUM_LITERAL__ENUM);

		structTypeEClass = createEClass(STRUCT_TYPE);
		createEReference(structTypeEClass, STRUCT_TYPE__BASE_TYPE);
		createEReference(structTypeEClass, STRUCT_TYPE__FIELDS);

		variableEClass = createEClass(VARIABLE);

		propertyEClass = createEClass(PROPERTY);

		parameterEClass = createEClass(PARAMETER);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__RESOURCES);
		createEReference(interfaceEClass, INTERFACE__OPERATIONS);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__READONLY);
		createEReference(resourceEClass, RESOURCE__ENTITY);
		createEReference(resourceEClass, RESOURCE__EXCEPTIONS);
		createEOperation(resourceEClass, RESOURCE___GET_NAME);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__KIND);
		createEAttribute(operationEClass, OPERATION__ASYNC);
		createEReference(operationEClass, OPERATION__REQUEST_PARAMETERS);
		createEReference(operationEClass, OPERATION__RESPONSE_PARAMETERS);
		createEReference(operationEClass, OPERATION__RESOURCE);
		createEReference(operationEClass, OPERATION__EXCEPTIONS);
		createEOperation(operationEClass, OPERATION___HAS_REQUEST_PARAMETERS);
		createEOperation(operationEClass, OPERATION___HAS_RESPONSE_PARAMETERS);
		createEOperation(operationEClass, OPERATION___HAS_MANY_REQUEST_PARAMETERS);
		createEOperation(operationEClass, OPERATION___HAS_SINGLE_RESPONSE_PARAMETER);
		createEOperation(operationEClass, OPERATION___HAS_MANY_RESPONSE_PARAMETERS);
		createEOperation(operationEClass, OPERATION___SINGLE_RETURN_TYPE);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__INTERFACE);
		createEAttribute(serviceEClass, SERVICE__BINDING);

		// Create enums
		operationKindEEnum = createEEnum(OPERATION_KIND);
		documentationTagKindEEnum = createEEnum(DOCUMENTATION_TAG_KIND);
		builtInTypeKindEEnum = createEEnum(BUILT_IN_TYPE_KIND);
		bindingKindEEnum = createEEnum(BINDING_KIND);

		// Create data types
		rootSoalModelEDataType = createEDataType(ROOT_SOAL_MODEL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		soalModelEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getElement());
		declarationEClass.getESuperTypes().add(this.getNamedElement());
		namedTypeEClass.getESuperTypes().add(this.getType());
		namedTypeEClass.getESuperTypes().add(this.getDeclaration());
		builtInTypeEClass.getESuperTypes().add(this.getNamedType());
		typeReferenceEClass.getESuperTypes().add(this.getType());
		simpleTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		arrayTypeEClass.getESuperTypes().add(this.getTypeReference());
		referenceArrayTypeEClass.getESuperTypes().add(this.getArrayType());
		containmentArrayTypeEClass.getESuperTypes().add(this.getArrayType());
		nullableTypeEClass.getESuperTypes().add(this.getTypeReference());
		enumTypeEClass.getESuperTypes().add(this.getNamedType());
		enumLiteralEClass.getESuperTypes().add(this.getNamedElement());
		structTypeEClass.getESuperTypes().add(this.getNamedType());
		variableEClass.getESuperTypes().add(this.getDeclaration());
		variableEClass.getESuperTypes().add(this.getTypedElement());
		propertyEClass.getESuperTypes().add(this.getVariable());
		parameterEClass.getESuperTypes().add(this.getVariable());
		interfaceEClass.getESuperTypes().add(this.getDeclaration());
		resourceEClass.getESuperTypes().add(this.getDeclaration());
		operationEClass.getESuperTypes().add(this.getDeclaration());
		serviceEClass.getESuperTypes().add(this.getDeclaration());

		// Initialize classes, features, and operations; add parameters
		initEClass(globalSoalModelEClass, GlobalSoalModel.class, "GlobalSoalModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalSoalModel_ErrorType(), this.getBuiltInType(), null, "errorType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_AnyType(), this.getBuiltInType(), null, "anyType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_VoidType(), this.getBuiltInType(), null, "voidType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_ObjectType(), this.getBuiltInType(), null, "objectType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_BinaryType(), this.getBuiltInType(), null, "binaryType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_BoolType(), this.getBuiltInType(), null, "boolType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_StringType(), this.getBuiltInType(), null, "stringType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_IntType(), this.getBuiltInType(), null, "intType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_LongType(), this.getBuiltInType(), null, "longType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_FloatType(), this.getBuiltInType(), null, "floatType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_DoubleType(), this.getBuiltInType(), null, "doubleType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_DateType(), this.getBuiltInType(), null, "dateType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_TimeType(), this.getBuiltInType(), null, "timeType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_DateTimeType(), this.getBuiltInType(), null, "dateTimeType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_DurationType(), this.getBuiltInType(), null, "durationType", null, 0, 1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalSoalModel_BuiltInTypes(), this.getBuiltInType(), null, "builtInTypes", null, 0, -1,
				GlobalSoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soalModelEClass, SoalModel.class, "SoalModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoalModel_RootModelLazy(), this.getRootSoalModel(), "rootModelLazy", null, 0, 1,
				SoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSoalModel_Imports(), this.getSoalModel(), null, "imports", null, 0, -1, SoalModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoalModel_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1,
				SoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoalModel_RootModel(), this.getRootSoalModel(), "rootModel", null, 0, 1, SoalModel.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSoalModel__GetGlobals(), this.getGlobalSoalModel(), "getGlobals", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentation_Tags(), this.getDocumentationTag(), null, "Tags", null, 0, -1,
				Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationTagEClass, DocumentationTag.class, "DocumentationTag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentationTag_Kind(), this.getDocumentationTagKind(), "kind", null, 0, 1,
				DocumentationTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentationTag_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
				DocumentationTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentationTag_Lines(), theEcorePackage.getEString(), "lines", null, 0, -1,
				DocumentationTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentationTag_HtmlLazy(), theEcorePackage.getEString(), "htmlLazy", null, 0, 1,
				DocumentationTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getDocumentationTag__GetHtml(), theEcorePackage.getEString(), "getHtml", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNamedElement_DocumentationLazy(), this.getDocumentation(), null, "documentationLazy", null, 0,
				1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNamedElement__GetUniqueName(), theEcorePackage.getEString(), "getUniqueName", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamedElement__GetDocumentation(), this.getDocumentation(), "getDocumentation", 0, 1,
				!IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamedElement__GetHoverDocumentation(), theEcorePackage.getEString(), "getHoverDocumentation",
				0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_TypeReference(), this.getTypeReference(), null, "typeReference", null, 0, 1,
				TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTypedElement__GetType(), this.getType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedTypeEClass, NamedType.class, "NamedType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInTypeEClass, BuiltInType.class, "BuiltInType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuiltInType_Kind(), this.getBuiltInTypeKind(), "kind", null, 0, 1, BuiltInType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeReference__GetReferencedType(), this.getType(), "getReferencedType", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(simpleTypeReferenceEClass, SimpleTypeReference.class, "SimpleTypeReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTypeReference_ReferencedType(), this.getType(), null, "referencedType", null, 0, 1,
				SimpleTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArrayType__GetReferencedType(), this.getType(), "getReferencedType", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getArrayType__GetInnerType(), this.getType(), "getInnerType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(referenceArrayTypeEClass, ReferenceArrayType.class, "ReferenceArrayType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceArrayType_InnerType(), this.getType(), null, "innerType", null, 0, 1,
				ReferenceArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentArrayTypeEClass, ContainmentArrayType.class, "ContainmentArrayType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentArrayType_InnerType(), this.getType(), null, "innerType", null, 0, 1,
				ContainmentArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullableTypeEClass, NullableType.class, "NullableType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNullableType_InnerType(), this.getType(), null, "innerType", null, 0, 1, NullableType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNullableType__GetReferencedType(), this.getType(), "getReferencedType", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumType_Literals(), this.getEnumLiteral(), this.getEnumLiteral_Enum(), "literals", null, 0,
				-1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteral_Enum(), this.getEnumType(), this.getEnumType_Literals(), "enum", null, 0, 1,
				EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructType_BaseType(), this.getStructType(), null, "baseType", null, 0, 1, StructType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType_Fields(), this.getProperty(), null, "fields", null, 0, -1, StructType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Resources(), this.getResource(), null, "resources", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Operations(), this.getOperation(), null, "operations", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResource_Entity(), this.getStructType(), null, "entity", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Exceptions(), this.getStructType(), null, "exceptions", null, 0, -1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResource__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Kind(), this.getOperationKind(), "kind", null, 0, 1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Async(), theEcorePackage.getEBoolean(), "async", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperation_RequestParameters(), this.getParameterList(), null, "requestParameters", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ResponseParameters(), this.getParameterList(), null, "responseParameters", null, 0,
				1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Resource(), this.getResource(), null, "resource", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Exceptions(), this.getStructType(), null, "exceptions", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperation__HasRequestParameters(), theEcorePackage.getEBoolean(), "hasRequestParameters", 0,
				1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__HasResponseParameters(), theEcorePackage.getEBoolean(), "hasResponseParameters", 0,
				1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__HasManyRequestParameters(), theEcorePackage.getEBoolean(),
				"hasManyRequestParameters", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__HasSingleResponseParameter(), theEcorePackage.getEBoolean(),
				"hasSingleResponseParameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__HasManyResponseParameters(), theEcorePackage.getEBoolean(),
				"hasManyResponseParameters", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__SingleReturnType(), this.getType(), "singleReturnType", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterList_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Interface(), this.getInterface(), null, "interface", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Binding(), this.getBindingKind(), "binding", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operationKindEEnum, OperationKind.class, "OperationKind");
		addEEnumLiteral(operationKindEEnum, OperationKind.RPC);
		addEEnumLiteral(operationKindEEnum, OperationKind.GET_ALL);
		addEEnumLiteral(operationKindEEnum, OperationKind.GET);
		addEEnumLiteral(operationKindEEnum, OperationKind.INSERT);
		addEEnumLiteral(operationKindEEnum, OperationKind.UPDATE);
		addEEnumLiteral(operationKindEEnum, OperationKind.DELETE);

		initEEnum(documentationTagKindEEnum, DocumentationTagKind.class, "DocumentationTagKind");
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.UNKNOWN);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.VERSION);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.ALPHA);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.BETA);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.DEPRECATED);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.TEST);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.INTERNAL);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.SUMMARY);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.DEFAULT_VALUE);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.PARAM);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.RETURNS);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.THROWS);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.LABEL);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.EXAMPLE);
		addEEnumLiteral(documentationTagKindEEnum, DocumentationTagKind.REMARKS);

		initEEnum(builtInTypeKindEEnum, BuiltInTypeKind.class, "BuiltInTypeKind");
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.ERROR);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.ANY);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.VOID);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.OBJECT);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.BINARY);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.BOOL);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.STRING);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.INT);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.LONG);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.FLOAT);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.DOUBLE);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.DATE);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.TIME);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.DATETIME);
		addEEnumLiteral(builtInTypeKindEEnum, BuiltInTypeKind.DURATION);

		initEEnum(bindingKindEEnum, BindingKind.class, "BindingKind");
		addEEnumLiteral(bindingKindEEnum, BindingKind.SOAP);
		addEEnumLiteral(bindingKindEEnum, BindingKind.REST);

		// Initialize data types
		initEDataType(rootSoalModelEDataType, RootSoalModel.class, "RootSoalModel", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // SoalModelPackageImpl
