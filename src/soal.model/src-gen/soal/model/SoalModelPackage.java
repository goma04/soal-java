/**
 */
package soal.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see soal.model.SoalModelFactory
 * @model kind="package"
 * @generated
 */
public interface SoalModelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "soal.model";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SoalModelPackage eINSTANCE = soal.model.impl.SoalModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link soal.model.impl.GlobalSoalModelImpl
	 * <em>Global Soal Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see soal.model.impl.GlobalSoalModelImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getGlobalSoalModel()
	 * @generated
	 */
	int GLOBAL_SOAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Error Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__ERROR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__ANY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Void Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__VOID_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Binary Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__BINARY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Bool Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__BOOL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>String Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__STRING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Int Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__INT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Long Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__LONG_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Float Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__FLOAT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Double Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__DOUBLE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Date Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__DATE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__TIME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Date Time Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__DATE_TIME_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Duration Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__DURATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Built In Types</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL__BUILT_IN_TYPES = 15;

	/**
	 * The number of structural features of the '<em>Global Soal Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Global Soal Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SOAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ElementImpl
	 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.ElementImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.NamedElementImpl <em>Named
	 * Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.NamedElementImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION_LAZY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_UNIQUE_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_DOCUMENTATION = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_HOVER_DOCUMENTATION = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link soal.model.impl.SoalModelImpl <em>Soal
	 * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.SoalModelImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getSoalModel()
	 * @generated
	 */
	int SOAL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__DOCUMENTATION_LAZY = NAMED_ELEMENT__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Root Model Lazy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__ROOT_MODEL_LAZY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Model</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL__ROOT_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Soal Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL___GET_UNIQUE_NAME = NAMED_ELEMENT___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL___GET_DOCUMENTATION = NAMED_ELEMENT___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL___GET_HOVER_DOCUMENTATION = NAMED_ELEMENT___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Globals</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL___GET_GLOBALS = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soal Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOAL_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.DocumentationImpl
	 * <em>Documentation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.DocumentationImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Documentation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.DocumentationTagImpl
	 * <em>Documentation Tag</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see soal.model.impl.DocumentationTagImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getDocumentationTag()
	 * @generated
	 */
	int DOCUMENTATION_TAG = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG__KIND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG__LINES = 2;

	/**
	 * The feature id for the '<em><b>Html Lazy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG__HTML_LAZY = 3;

	/**
	 * The number of structural features of the '<em>Documentation Tag</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Html</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG___GET_HTML = 0;

	/**
	 * The number of operations of the '<em>Documentation Tag</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TAG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.TypeImpl <em>Type</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.TypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.TypedElementImpl <em>Typed
	 * Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.TypedElementImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE_REFERENCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___GET_TYPE = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.DeclarationImpl
	 * <em>Declaration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.DeclarationImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOCUMENTATION_LAZY = NAMED_ELEMENT__DOCUMENTATION_LAZY;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION___GET_UNIQUE_NAME = NAMED_ELEMENT___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION___GET_DOCUMENTATION = NAMED_ELEMENT___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION___GET_HOVER_DOCUMENTATION = NAMED_ELEMENT___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Declaration</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.NamedTypeImpl <em>Named
	 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.NamedTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__DOCUMENTATION_LAZY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE___GET_UNIQUE_NAME = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE___GET_DOCUMENTATION = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE___GET_HOVER_DOCUMENTATION = TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link soal.model.impl.BuiltInTypeImpl <em>Built
	 * In Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.BuiltInTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getBuiltInType()
	 * @generated
	 */
	int BUILT_IN_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__DOCUMENTATION_LAZY = NAMED_TYPE__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE__KIND = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Built In Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE___GET_UNIQUE_NAME = NAMED_TYPE___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE___GET_DOCUMENTATION = NAMED_TYPE___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE___GET_HOVER_DOCUMENTATION = NAMED_TYPE___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Built In Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.TypeReferenceImpl <em>Type
	 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.TypeReferenceImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 11;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___GET_REFERENCED_TYPE = TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.SimpleTypeReferenceImpl
	 * <em>Simple Type Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see soal.model.impl.SimpleTypeReferenceImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getSimpleTypeReference()
	 * @generated
	 */
	int SIMPLE_TYPE_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type Reference</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE___GET_REFERENCED_TYPE = TYPE_REFERENCE___GET_REFERENCED_TYPE;

	/**
	 * The number of operations of the '<em>Simple Type Reference</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ArrayTypeImpl <em>Array
	 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.ArrayTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE___GET_REFERENCED_TYPE = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inner Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE___GET_INNER_TYPE = TYPE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link soal.model.impl.ReferenceArrayTypeImpl
	 * <em>Reference Array Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see soal.model.impl.ReferenceArrayTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getReferenceArrayType()
	 * @generated
	 */
	int REFERENCE_ARRAY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Inner Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARRAY_TYPE__INNER_TYPE = ARRAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Array Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARRAY_TYPE_FEATURE_COUNT = ARRAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARRAY_TYPE___GET_REFERENCED_TYPE = ARRAY_TYPE___GET_REFERENCED_TYPE;

	/**
	 * The operation id for the '<em>Get Inner Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARRAY_TYPE___GET_INNER_TYPE = ARRAY_TYPE___GET_INNER_TYPE;

	/**
	 * The number of operations of the '<em>Reference Array Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARRAY_TYPE_OPERATION_COUNT = ARRAY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ContainmentArrayTypeImpl
	 * <em>Containment Array Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see soal.model.impl.ContainmentArrayTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getContainmentArrayType()
	 * @generated
	 */
	int CONTAINMENT_ARRAY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Inner Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ARRAY_TYPE__INNER_TYPE = ARRAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containment Array Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ARRAY_TYPE_FEATURE_COUNT = ARRAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ARRAY_TYPE___GET_REFERENCED_TYPE = ARRAY_TYPE___GET_REFERENCED_TYPE;

	/**
	 * The operation id for the '<em>Get Inner Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ARRAY_TYPE___GET_INNER_TYPE = ARRAY_TYPE___GET_INNER_TYPE;

	/**
	 * The number of operations of the '<em>Containment Array Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ARRAY_TYPE_OPERATION_COUNT = ARRAY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.NullableTypeImpl
	 * <em>Nullable Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.NullableTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getNullableType()
	 * @generated
	 */
	int NULLABLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Inner Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULLABLE_TYPE__INNER_TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nullable Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULLABLE_TYPE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referenced Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULLABLE_TYPE___GET_REFERENCED_TYPE = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nullable Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULLABLE_TYPE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.EnumTypeImpl <em>Enum
	 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.EnumTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DOCUMENTATION_LAZY = NAMED_TYPE__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LITERALS = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE___GET_UNIQUE_NAME = NAMED_TYPE___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE___GET_DOCUMENTATION = NAMED_TYPE___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE___GET_HOVER_DOCUMENTATION = NAMED_TYPE___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.EnumLiteralImpl <em>Enum
	 * Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.EnumLiteralImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__DOCUMENTATION_LAZY = NAMED_ELEMENT__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__ENUM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL___GET_UNIQUE_NAME = NAMED_ELEMENT___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL___GET_DOCUMENTATION = NAMED_ELEMENT___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL___GET_HOVER_DOCUMENTATION = NAMED_ELEMENT___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.StructTypeImpl <em>Struct
	 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.StructTypeImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getStructType()
	 * @generated
	 */
	int STRUCT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__DOCUMENTATION_LAZY = NAMED_TYPE__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__BASE_TYPE = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__FIELDS = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Struct Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE___GET_UNIQUE_NAME = NAMED_TYPE___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE___GET_DOCUMENTATION = NAMED_TYPE___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE___GET_HOVER_DOCUMENTATION = NAMED_TYPE___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Struct Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.VariableImpl
	 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.VariableImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION_LAZY = DECLARATION__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_REFERENCE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_UNIQUE_NAME = DECLARATION___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_DOCUMENTATION = DECLARATION___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_HOVER_DOCUMENTATION = DECLARATION___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Type</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_TYPE = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.PropertyImpl
	 * <em>Property</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.PropertyImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOCUMENTATION_LAZY = VARIABLE__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE_REFERENCE = VARIABLE__TYPE_REFERENCE;

	/**
	 * The number of structural features of the '<em>Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_UNIQUE_NAME = VARIABLE___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_DOCUMENTATION = VARIABLE___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_HOVER_DOCUMENTATION = VARIABLE___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Type</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_TYPE = VARIABLE___GET_TYPE;

	/**
	 * The number of operations of the '<em>Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ParameterImpl
	 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.ParameterImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION_LAZY = VARIABLE__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_REFERENCE = VARIABLE__TYPE_REFERENCE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_UNIQUE_NAME = VARIABLE___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_DOCUMENTATION = VARIABLE___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_HOVER_DOCUMENTATION = VARIABLE___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Type</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_TYPE = VARIABLE___GET_TYPE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.InterfaceImpl
	 * <em>Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.InterfaceImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION_LAZY = DECLARATION__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE__RESOURCES = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_UNIQUE_NAME = DECLARATION___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_DOCUMENTATION = DECLARATION___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_HOVER_DOCUMENTATION = DECLARATION___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Interface</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ResourceImpl
	 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.ResourceImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION_LAZY = DECLARATION__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__READONLY = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENTITY = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXCEPTIONS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_UNIQUE_NAME = DECLARATION___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_DOCUMENTATION = DECLARATION___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_HOVER_DOCUMENTATION = DECLARATION___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Name</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_NAME = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soal.model.impl.OperationImpl
	 * <em>Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.OperationImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION_LAZY = DECLARATION__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__KIND = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASYNC = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Request Parameters</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQUEST_PARAMETERS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response Parameters</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESPONSE_PARAMETERS = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESOURCE = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXCEPTIONS = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_UNIQUE_NAME = DECLARATION___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_DOCUMENTATION = DECLARATION___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_HOVER_DOCUMENTATION = DECLARATION___GET_HOVER_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Has Request Parameters</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_REQUEST_PARAMETERS = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Response Parameters</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_RESPONSE_PARAMETERS = DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Many Request Parameters</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_MANY_REQUEST_PARAMETERS = DECLARATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Single Response Parameter</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_SINGLE_RESPONSE_PARAMETER = DECLARATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Many Response Parameters</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_MANY_RESPONSE_PARAMETERS = DECLARATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Single Return Type</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION___SINGLE_RETURN_TYPE = DECLARATION_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link soal.model.impl.ParameterListImpl
	 * <em>Parameter List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see soal.model.impl.ParameterListImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 26;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soal.model.impl.ServiceImpl
	 * <em>Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.impl.ServiceImpl
	 * @see soal.model.impl.SoalModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION_LAZY = DECLARATION__DOCUMENTATION_LAZY;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__INTERFACE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__BINDING = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Unique Name</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_UNIQUE_NAME = DECLARATION___GET_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_DOCUMENTATION = DECLARATION___GET_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get Hover Documentation</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_HOVER_DOCUMENTATION = DECLARATION___GET_HOVER_DOCUMENTATION;

	/**
	 * The number of operations of the '<em>Service</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soal.model.OperationKind <em>Operation
	 * Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.OperationKind
	 * @see soal.model.impl.SoalModelPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 28;

	/**
	 * The meta object id for the '{@link soal.model.DocumentationTagKind
	 * <em>Documentation Tag Kind</em>}' enum. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see soal.model.DocumentationTagKind
	 * @see soal.model.impl.SoalModelPackageImpl#getDocumentationTagKind()
	 * @generated
	 */
	int DOCUMENTATION_TAG_KIND = 29;

	/**
	 * The meta object id for the '{@link soal.model.BuiltInTypeKind <em>Built In
	 * Type Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.BuiltInTypeKind
	 * @see soal.model.impl.SoalModelPackageImpl#getBuiltInTypeKind()
	 * @generated
	 */
	int BUILT_IN_TYPE_KIND = 30;

	/**
	 * The meta object id for the '{@link soal.model.BindingKind <em>Binding
	 * Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.BindingKind
	 * @see soal.model.impl.SoalModelPackageImpl#getBindingKind()
	 * @generated
	 */
	int BINDING_KIND = 31;

	/**
	 * The meta object id for the '<em>Root Soal Model</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see soal.model.RootSoalModel
	 * @see soal.model.impl.SoalModelPackageImpl#getRootSoalModel()
	 * @generated
	 */
	int ROOT_SOAL_MODEL = 32;

	/**
	 * Returns the meta object for class '{@link soal.model.GlobalSoalModel
	 * <em>Global Soal Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Global Soal Model</em>'.
	 * @see soal.model.GlobalSoalModel
	 * @generated
	 */
	EClass getGlobalSoalModel();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getErrorType <em>Error Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Error Type</em>'.
	 * @see soal.model.GlobalSoalModel#getErrorType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_ErrorType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getAnyType <em>Any Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Any Type</em>'.
	 * @see soal.model.GlobalSoalModel#getAnyType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_AnyType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getVoidType <em>Void Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Void Type</em>'.
	 * @see soal.model.GlobalSoalModel#getVoidType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_VoidType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getObjectType <em>Object Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Object Type</em>'.
	 * @see soal.model.GlobalSoalModel#getObjectType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_ObjectType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getBinaryType <em>Binary Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Binary Type</em>'.
	 * @see soal.model.GlobalSoalModel#getBinaryType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_BinaryType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getBoolType <em>Bool Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bool Type</em>'.
	 * @see soal.model.GlobalSoalModel#getBoolType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_BoolType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getStringType <em>String Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>String Type</em>'.
	 * @see soal.model.GlobalSoalModel#getStringType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_StringType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getIntType <em>Int Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Int Type</em>'.
	 * @see soal.model.GlobalSoalModel#getIntType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_IntType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getLongType <em>Long Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Long Type</em>'.
	 * @see soal.model.GlobalSoalModel#getLongType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_LongType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getFloatType <em>Float Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Float Type</em>'.
	 * @see soal.model.GlobalSoalModel#getFloatType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_FloatType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getDoubleType <em>Double Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Double Type</em>'.
	 * @see soal.model.GlobalSoalModel#getDoubleType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_DoubleType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getDateType <em>Date Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Date Type</em>'.
	 * @see soal.model.GlobalSoalModel#getDateType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_DateType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getTimeType <em>Time Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Time Type</em>'.
	 * @see soal.model.GlobalSoalModel#getTimeType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_TimeType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getDateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Date Time
	 *         Type</em>'.
	 * @see soal.model.GlobalSoalModel#getDateTimeType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_DateTimeType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.GlobalSoalModel#getDurationType <em>Duration Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Duration
	 *         Type</em>'.
	 * @see soal.model.GlobalSoalModel#getDurationType()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_DurationType();

	/**
	 * Returns the meta object for the reference list
	 * '{@link soal.model.GlobalSoalModel#getBuiltInTypes <em>Built In Types</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Built In Types</em>'.
	 * @see soal.model.GlobalSoalModel#getBuiltInTypes()
	 * @see #getGlobalSoalModel()
	 * @generated
	 */
	EReference getGlobalSoalModel_BuiltInTypes();

	/**
	 * Returns the meta object for class '{@link soal.model.SoalModel <em>Soal
	 * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Soal Model</em>'.
	 * @see soal.model.SoalModel
	 * @generated
	 */
	EClass getSoalModel();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.SoalModel#getRootModelLazy <em>Root Model Lazy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Root Model Lazy</em>'.
	 * @see soal.model.SoalModel#getRootModelLazy()
	 * @see #getSoalModel()
	 * @generated
	 */
	EAttribute getSoalModel_RootModelLazy();

	/**
	 * Returns the meta object for the reference list
	 * '{@link soal.model.SoalModel#getImports <em>Imports</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see soal.model.SoalModel#getImports()
	 * @see #getSoalModel()
	 * @generated
	 */
	EReference getSoalModel_Imports();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.SoalModel#getDeclarations <em>Declarations</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Declarations</em>'.
	 * @see soal.model.SoalModel#getDeclarations()
	 * @see #getSoalModel()
	 * @generated
	 */
	EReference getSoalModel_Declarations();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.SoalModel#getRootModel <em>Root Model</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Root Model</em>'.
	 * @see soal.model.SoalModel#getRootModel()
	 * @see #getSoalModel()
	 * @generated
	 */
	EAttribute getSoalModel_RootModel();

	/**
	 * Returns the meta object for the '{@link soal.model.SoalModel#getGlobals()
	 * <em>Get Globals</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Get Globals</em>' operation.
	 * @see soal.model.SoalModel#getGlobals()
	 * @generated
	 */
	EOperation getSoalModel__GetGlobals();

	/**
	 * Returns the meta object for class '{@link soal.model.Documentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see soal.model.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.Documentation#getTags <em>Tags</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see soal.model.Documentation#getTags()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_Tags();

	/**
	 * Returns the meta object for class '{@link soal.model.DocumentationTag
	 * <em>Documentation Tag</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Documentation Tag</em>'.
	 * @see soal.model.DocumentationTag
	 * @generated
	 */
	EClass getDocumentationTag();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.DocumentationTag#getKind <em>Kind</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see soal.model.DocumentationTag#getKind()
	 * @see #getDocumentationTag()
	 * @generated
	 */
	EAttribute getDocumentationTag_Kind();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.DocumentationTag#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soal.model.DocumentationTag#getName()
	 * @see #getDocumentationTag()
	 * @generated
	 */
	EAttribute getDocumentationTag_Name();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link soal.model.DocumentationTag#getLines <em>Lines</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see soal.model.DocumentationTag#getLines()
	 * @see #getDocumentationTag()
	 * @generated
	 */
	EAttribute getDocumentationTag_Lines();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.DocumentationTag#getHtmlLazy <em>Html Lazy</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Html Lazy</em>'.
	 * @see soal.model.DocumentationTag#getHtmlLazy()
	 * @see #getDocumentationTag()
	 * @generated
	 */
	EAttribute getDocumentationTag_HtmlLazy();

	/**
	 * Returns the meta object for the '{@link soal.model.DocumentationTag#getHtml()
	 * <em>Get Html</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Html</em>' operation.
	 * @see soal.model.DocumentationTag#getHtml()
	 * @generated
	 */
	EOperation getDocumentationTag__GetHtml();

	/**
	 * Returns the meta object for class '{@link soal.model.Element
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element</em>'.
	 * @see soal.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link soal.model.NamedElement <em>Named
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see soal.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.NamedElement#getName <em>Name</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soal.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.NamedElement#getDocumentationLazy <em>Documentation
	 * Lazy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Documentation
	 *         Lazy</em>'.
	 * @see soal.model.NamedElement#getDocumentationLazy()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_DocumentationLazy();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.NamedElement#getUniqueName() <em>Get Unique Name</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Unique Name</em>' operation.
	 * @see soal.model.NamedElement#getUniqueName()
	 * @generated
	 */
	EOperation getNamedElement__GetUniqueName();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.NamedElement#getDocumentation() <em>Get
	 * Documentation</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Documentation</em>' operation.
	 * @see soal.model.NamedElement#getDocumentation()
	 * @generated
	 */
	EOperation getNamedElement__GetDocumentation();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.NamedElement#getHoverDocumentation() <em>Get Hover
	 * Documentation</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Hover Documentation</em>' operation.
	 * @see soal.model.NamedElement#getHoverDocumentation()
	 * @generated
	 */
	EOperation getNamedElement__GetHoverDocumentation();

	/**
	 * Returns the meta object for class '{@link soal.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see soal.model.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link soal.model.TypedElement <em>Typed
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see soal.model.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.TypedElement#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type
	 *         Reference</em>'.
	 * @see soal.model.TypedElement#getTypeReference()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_TypeReference();

	/**
	 * Returns the meta object for the '{@link soal.model.TypedElement#getType()
	 * <em>Get Type</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see soal.model.TypedElement#getType()
	 * @generated
	 */
	EOperation getTypedElement__GetType();

	/**
	 * Returns the meta object for class '{@link soal.model.Declaration
	 * <em>Declaration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see soal.model.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link soal.model.NamedType <em>Named
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see soal.model.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for class '{@link soal.model.BuiltInType <em>Built In
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Built In Type</em>'.
	 * @see soal.model.BuiltInType
	 * @generated
	 */
	EClass getBuiltInType();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.BuiltInType#getKind <em>Kind</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see soal.model.BuiltInType#getKind()
	 * @see #getBuiltInType()
	 * @generated
	 */
	EAttribute getBuiltInType_Kind();

	/**
	 * Returns the meta object for class '{@link soal.model.TypeReference <em>Type
	 * Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see soal.model.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.TypeReference#getReferencedType() <em>Get Referenced
	 * Type</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Referenced Type</em>' operation.
	 * @see soal.model.TypeReference#getReferencedType()
	 * @generated
	 */
	EOperation getTypeReference__GetReferencedType();

	/**
	 * Returns the meta object for class '{@link soal.model.SimpleTypeReference
	 * <em>Simple Type Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Simple Type Reference</em>'.
	 * @see soal.model.SimpleTypeReference
	 * @generated
	 */
	EClass getSimpleTypeReference();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.SimpleTypeReference#getReferencedType <em>Referenced
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Referenced Type</em>'.
	 * @see soal.model.SimpleTypeReference#getReferencedType()
	 * @see #getSimpleTypeReference()
	 * @generated
	 */
	EReference getSimpleTypeReference_ReferencedType();

	/**
	 * Returns the meta object for class '{@link soal.model.ArrayType <em>Array
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see soal.model.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.ArrayType#getReferencedType() <em>Get Referenced
	 * Type</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Referenced Type</em>' operation.
	 * @see soal.model.ArrayType#getReferencedType()
	 * @generated
	 */
	EOperation getArrayType__GetReferencedType();

	/**
	 * Returns the meta object for the '{@link soal.model.ArrayType#getInnerType()
	 * <em>Get Inner Type</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Inner Type</em>' operation.
	 * @see soal.model.ArrayType#getInnerType()
	 * @generated
	 */
	EOperation getArrayType__GetInnerType();

	/**
	 * Returns the meta object for class '{@link soal.model.ReferenceArrayType
	 * <em>Reference Array Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Reference Array Type</em>'.
	 * @see soal.model.ReferenceArrayType
	 * @generated
	 */
	EClass getReferenceArrayType();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.ReferenceArrayType#getInnerType <em>Inner Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Inner Type</em>'.
	 * @see soal.model.ReferenceArrayType#getInnerType()
	 * @see #getReferenceArrayType()
	 * @generated
	 */
	EReference getReferenceArrayType_InnerType();

	/**
	 * Returns the meta object for class '{@link soal.model.ContainmentArrayType
	 * <em>Containment Array Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Containment Array Type</em>'.
	 * @see soal.model.ContainmentArrayType
	 * @generated
	 */
	EClass getContainmentArrayType();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.ContainmentArrayType#getInnerType <em>Inner Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Inner Type</em>'.
	 * @see soal.model.ContainmentArrayType#getInnerType()
	 * @see #getContainmentArrayType()
	 * @generated
	 */
	EReference getContainmentArrayType_InnerType();

	/**
	 * Returns the meta object for class '{@link soal.model.NullableType
	 * <em>Nullable Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Nullable Type</em>'.
	 * @see soal.model.NullableType
	 * @generated
	 */
	EClass getNullableType();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.NullableType#getInnerType <em>Inner Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Inner Type</em>'.
	 * @see soal.model.NullableType#getInnerType()
	 * @see #getNullableType()
	 * @generated
	 */
	EReference getNullableType_InnerType();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.NullableType#getReferencedType() <em>Get Referenced
	 * Type</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Referenced Type</em>' operation.
	 * @see soal.model.NullableType#getReferencedType()
	 * @generated
	 */
	EOperation getNullableType__GetReferencedType();

	/**
	 * Returns the meta object for class '{@link soal.model.EnumType <em>Enum
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see soal.model.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.EnumType#getLiterals <em>Literals</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Literals</em>'.
	 * @see soal.model.EnumType#getLiterals()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Literals();

	/**
	 * Returns the meta object for class '{@link soal.model.EnumLiteral <em>Enum
	 * Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see soal.model.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the container reference
	 * '{@link soal.model.EnumLiteral#getEnum <em>Enum</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see soal.model.EnumLiteral#getEnum()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EReference getEnumLiteral_Enum();

	/**
	 * Returns the meta object for class '{@link soal.model.StructType <em>Struct
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see soal.model.StructType
	 * @generated
	 */
	EClass getStructType();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.StructType#getBaseType <em>Base Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see soal.model.StructType#getBaseType()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_BaseType();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.StructType#getFields <em>Fields</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see soal.model.StructType#getFields()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Fields();

	/**
	 * Returns the meta object for class '{@link soal.model.Variable
	 * <em>Variable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see soal.model.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link soal.model.Property
	 * <em>Property</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see soal.model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link soal.model.Parameter
	 * <em>Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see soal.model.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link soal.model.Interface
	 * <em>Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see soal.model.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.Interface#getResources <em>Resources</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Resources</em>'.
	 * @see soal.model.Interface#getResources()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Resources();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.Interface#getOperations <em>Operations</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Operations</em>'.
	 * @see soal.model.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for class '{@link soal.model.Resource
	 * <em>Resource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see soal.model.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.Resource#isReadonly <em>Readonly</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see soal.model.Resource#isReadonly()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Readonly();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.Resource#getEntity <em>Entity</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see soal.model.Resource#getEntity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Entity();

	/**
	 * Returns the meta object for the reference list
	 * '{@link soal.model.Resource#getExceptions <em>Exceptions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see soal.model.Resource#getExceptions()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Exceptions();

	/**
	 * Returns the meta object for the '{@link soal.model.Resource#getName() <em>Get
	 * Name</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see soal.model.Resource#getName()
	 * @generated
	 */
	EOperation getResource__GetName();

	/**
	 * Returns the meta object for class '{@link soal.model.Operation
	 * <em>Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see soal.model.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.Operation#getKind <em>Kind</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see soal.model.Operation#getKind()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Kind();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.Operation#isAsync <em>Async</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see soal.model.Operation#isAsync()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Async();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.Operation#getRequestParameters <em>Request
	 * Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Request
	 *         Parameters</em>'.
	 * @see soal.model.Operation#getRequestParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RequestParameters();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link soal.model.Operation#getResponseParameters <em>Response
	 * Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Response
	 *         Parameters</em>'.
	 * @see soal.model.Operation#getResponseParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ResponseParameters();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.Operation#getResource <em>Resource</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see soal.model.Operation#getResource()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Resource();

	/**
	 * Returns the meta object for the reference list
	 * '{@link soal.model.Operation#getExceptions <em>Exceptions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see soal.model.Operation#getExceptions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Exceptions();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#hasRequestParameters() <em>Has Request
	 * Parameters</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Has Request Parameters</em>' operation.
	 * @see soal.model.Operation#hasRequestParameters()
	 * @generated
	 */
	EOperation getOperation__HasRequestParameters();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#hasResponseParameters() <em>Has Response
	 * Parameters</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Has Response Parameters</em>' operation.
	 * @see soal.model.Operation#hasResponseParameters()
	 * @generated
	 */
	EOperation getOperation__HasResponseParameters();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#hasManyRequestParameters() <em>Has Many Request
	 * Parameters</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Has Many Request Parameters</em>'
	 *         operation.
	 * @see soal.model.Operation#hasManyRequestParameters()
	 * @generated
	 */
	EOperation getOperation__HasManyRequestParameters();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#hasSingleResponseParameter() <em>Has Single
	 * Response Parameter</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Has Single Response Parameter</em>'
	 *         operation.
	 * @see soal.model.Operation#hasSingleResponseParameter()
	 * @generated
	 */
	EOperation getOperation__HasSingleResponseParameter();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#hasManyResponseParameters() <em>Has Many
	 * Response Parameters</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Has Many Response Parameters</em>'
	 *         operation.
	 * @see soal.model.Operation#hasManyResponseParameters()
	 * @generated
	 */
	EOperation getOperation__HasManyResponseParameters();

	/**
	 * Returns the meta object for the
	 * '{@link soal.model.Operation#singleReturnType() <em>Single Return Type</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Single Return Type</em>' operation.
	 * @see soal.model.Operation#singleReturnType()
	 * @generated
	 */
	EOperation getOperation__SingleReturnType();

	/**
	 * Returns the meta object for class '{@link soal.model.ParameterList
	 * <em>Parameter List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see soal.model.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link soal.model.ParameterList#getParameters <em>Parameters</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Parameters</em>'.
	 * @see soal.model.ParameterList#getParameters()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link soal.model.Service
	 * <em>Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Service</em>'.
	 * @see soal.model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference
	 * '{@link soal.model.Service#getInterface <em>Interface</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see soal.model.Service#getInterface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Interface();

	/**
	 * Returns the meta object for the attribute
	 * '{@link soal.model.Service#getBinding <em>Binding</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see soal.model.Service#getBinding()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Binding();

	/**
	 * Returns the meta object for enum '{@link soal.model.OperationKind
	 * <em>Operation Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see soal.model.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the meta object for enum '{@link soal.model.DocumentationTagKind
	 * <em>Documentation Tag Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Documentation Tag Kind</em>'.
	 * @see soal.model.DocumentationTagKind
	 * @generated
	 */
	EEnum getDocumentationTagKind();

	/**
	 * Returns the meta object for enum '{@link soal.model.BuiltInTypeKind <em>Built
	 * In Type Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Built In Type Kind</em>'.
	 * @see soal.model.BuiltInTypeKind
	 * @generated
	 */
	EEnum getBuiltInTypeKind();

	/**
	 * Returns the meta object for enum '{@link soal.model.BindingKind <em>Binding
	 * Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Binding Kind</em>'.
	 * @see soal.model.BindingKind
	 * @generated
	 */
	EEnum getBindingKind();

	/**
	 * Returns the meta object for data type '{@link soal.model.RootSoalModel
	 * <em>Root Soal Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Root Soal Model</em>'.
	 * @see soal.model.RootSoalModel
	 * @model instanceClass="soal.model.RootSoalModel"
	 * @generated
	 */
	EDataType getRootSoalModel();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoalModelFactory getSoalModelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soal.model.impl.GlobalSoalModelImpl
		 * <em>Global Soal Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see soal.model.impl.GlobalSoalModelImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getGlobalSoalModel()
		 * @generated
		 */
		EClass GLOBAL_SOAL_MODEL = eINSTANCE.getGlobalSoalModel();

		/**
		 * The meta object literal for the '<em><b>Error Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__ERROR_TYPE = eINSTANCE.getGlobalSoalModel_ErrorType();

		/**
		 * The meta object literal for the '<em><b>Any Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__ANY_TYPE = eINSTANCE.getGlobalSoalModel_AnyType();

		/**
		 * The meta object literal for the '<em><b>Void Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__VOID_TYPE = eINSTANCE.getGlobalSoalModel_VoidType();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__OBJECT_TYPE = eINSTANCE.getGlobalSoalModel_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Binary Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__BINARY_TYPE = eINSTANCE.getGlobalSoalModel_BinaryType();

		/**
		 * The meta object literal for the '<em><b>Bool Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__BOOL_TYPE = eINSTANCE.getGlobalSoalModel_BoolType();

		/**
		 * The meta object literal for the '<em><b>String Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__STRING_TYPE = eINSTANCE.getGlobalSoalModel_StringType();

		/**
		 * The meta object literal for the '<em><b>Int Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__INT_TYPE = eINSTANCE.getGlobalSoalModel_IntType();

		/**
		 * The meta object literal for the '<em><b>Long Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__LONG_TYPE = eINSTANCE.getGlobalSoalModel_LongType();

		/**
		 * The meta object literal for the '<em><b>Float Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__FLOAT_TYPE = eINSTANCE.getGlobalSoalModel_FloatType();

		/**
		 * The meta object literal for the '<em><b>Double Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__DOUBLE_TYPE = eINSTANCE.getGlobalSoalModel_DoubleType();

		/**
		 * The meta object literal for the '<em><b>Date Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__DATE_TYPE = eINSTANCE.getGlobalSoalModel_DateType();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__TIME_TYPE = eINSTANCE.getGlobalSoalModel_TimeType();

		/**
		 * The meta object literal for the '<em><b>Date Time Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__DATE_TIME_TYPE = eINSTANCE.getGlobalSoalModel_DateTimeType();

		/**
		 * The meta object literal for the '<em><b>Duration Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__DURATION_TYPE = eINSTANCE.getGlobalSoalModel_DurationType();

		/**
		 * The meta object literal for the '<em><b>Built In Types</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GLOBAL_SOAL_MODEL__BUILT_IN_TYPES = eINSTANCE.getGlobalSoalModel_BuiltInTypes();

		/**
		 * The meta object literal for the '{@link soal.model.impl.SoalModelImpl
		 * <em>Soal Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.SoalModelImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getSoalModel()
		 * @generated
		 */
		EClass SOAL_MODEL = eINSTANCE.getSoalModel();

		/**
		 * The meta object literal for the '<em><b>Root Model Lazy</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SOAL_MODEL__ROOT_MODEL_LAZY = eINSTANCE.getSoalModel_RootModelLazy();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOAL_MODEL__IMPORTS = eINSTANCE.getSoalModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SOAL_MODEL__DECLARATIONS = eINSTANCE.getSoalModel_Declarations();

		/**
		 * The meta object literal for the '<em><b>Root Model</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SOAL_MODEL__ROOT_MODEL = eINSTANCE.getSoalModel_RootModel();

		/**
		 * The meta object literal for the '<em><b>Get Globals</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation SOAL_MODEL___GET_GLOBALS = eINSTANCE.getSoalModel__GetGlobals();

		/**
		 * The meta object literal for the '{@link soal.model.impl.DocumentationImpl
		 * <em>Documentation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.DocumentationImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENTATION__TAGS = eINSTANCE.getDocumentation_Tags();

		/**
		 * The meta object literal for the '{@link soal.model.impl.DocumentationTagImpl
		 * <em>Documentation Tag</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see soal.model.impl.DocumentationTagImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getDocumentationTag()
		 * @generated
		 */
		EClass DOCUMENTATION_TAG = eINSTANCE.getDocumentationTag();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENTATION_TAG__KIND = eINSTANCE.getDocumentationTag_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENTATION_TAG__NAME = eINSTANCE.getDocumentationTag_Name();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENTATION_TAG__LINES = eINSTANCE.getDocumentationTag_Lines();

		/**
		 * The meta object literal for the '<em><b>Html Lazy</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENTATION_TAG__HTML_LAZY = eINSTANCE.getDocumentationTag_HtmlLazy();

		/**
		 * The meta object literal for the '<em><b>Get Html</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation DOCUMENTATION_TAG___GET_HTML = eINSTANCE.getDocumentationTag__GetHtml();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ElementImpl
		 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ElementImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link soal.model.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.NamedElementImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation Lazy</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAMED_ELEMENT__DOCUMENTATION_LAZY = eINSTANCE.getNamedElement_DocumentationLazy();

		/**
		 * The meta object literal for the '<em><b>Get Unique Name</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NAMED_ELEMENT___GET_UNIQUE_NAME = eINSTANCE.getNamedElement__GetUniqueName();

		/**
		 * The meta object literal for the '<em><b>Get Documentation</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NAMED_ELEMENT___GET_DOCUMENTATION = eINSTANCE.getNamedElement__GetDocumentation();

		/**
		 * The meta object literal for the '<em><b>Get Hover Documentation</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NAMED_ELEMENT___GET_HOVER_DOCUMENTATION = eINSTANCE.getNamedElement__GetHoverDocumentation();

		/**
		 * The meta object literal for the '{@link soal.model.impl.TypeImpl
		 * <em>Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.TypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.TypedElementImpl
		 * <em>Typed Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.TypedElementImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE_REFERENCE = eINSTANCE.getTypedElement_TypeReference();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TYPED_ELEMENT___GET_TYPE = eINSTANCE.getTypedElement__GetType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.DeclarationImpl
		 * <em>Declaration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.DeclarationImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link soal.model.impl.NamedTypeImpl
		 * <em>Named Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.NamedTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.BuiltInTypeImpl
		 * <em>Built In Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.BuiltInTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getBuiltInType()
		 * @generated
		 */
		EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILT_IN_TYPE__KIND = eINSTANCE.getBuiltInType_Kind();

		/**
		 * The meta object literal for the '{@link soal.model.impl.TypeReferenceImpl
		 * <em>Type Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see soal.model.impl.TypeReferenceImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Get Referenced Type</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TYPE_REFERENCE___GET_REFERENCED_TYPE = eINSTANCE.getTypeReference__GetReferencedType();

		/**
		 * The meta object literal for the
		 * '{@link soal.model.impl.SimpleTypeReferenceImpl <em>Simple Type
		 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.SimpleTypeReferenceImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getSimpleTypeReference()
		 * @generated
		 */
		EClass SIMPLE_TYPE_REFERENCE = eINSTANCE.getSimpleTypeReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE = eINSTANCE.getSimpleTypeReference_ReferencedType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ArrayTypeImpl
		 * <em>Array Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ArrayTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Get Referenced Type</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ARRAY_TYPE___GET_REFERENCED_TYPE = eINSTANCE.getArrayType__GetReferencedType();

		/**
		 * The meta object literal for the '<em><b>Get Inner Type</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ARRAY_TYPE___GET_INNER_TYPE = eINSTANCE.getArrayType__GetInnerType();

		/**
		 * The meta object literal for the
		 * '{@link soal.model.impl.ReferenceArrayTypeImpl <em>Reference Array
		 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ReferenceArrayTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getReferenceArrayType()
		 * @generated
		 */
		EClass REFERENCE_ARRAY_TYPE = eINSTANCE.getReferenceArrayType();

		/**
		 * The meta object literal for the '<em><b>Inner Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REFERENCE_ARRAY_TYPE__INNER_TYPE = eINSTANCE.getReferenceArrayType_InnerType();

		/**
		 * The meta object literal for the
		 * '{@link soal.model.impl.ContainmentArrayTypeImpl <em>Containment Array
		 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ContainmentArrayTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getContainmentArrayType()
		 * @generated
		 */
		EClass CONTAINMENT_ARRAY_TYPE = eINSTANCE.getContainmentArrayType();

		/**
		 * The meta object literal for the '<em><b>Inner Type</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINMENT_ARRAY_TYPE__INNER_TYPE = eINSTANCE.getContainmentArrayType_InnerType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.NullableTypeImpl
		 * <em>Nullable Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.NullableTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getNullableType()
		 * @generated
		 */
		EClass NULLABLE_TYPE = eINSTANCE.getNullableType();

		/**
		 * The meta object literal for the '<em><b>Inner Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NULLABLE_TYPE__INNER_TYPE = eINSTANCE.getNullableType_InnerType();

		/**
		 * The meta object literal for the '<em><b>Get Referenced Type</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NULLABLE_TYPE___GET_REFERENCED_TYPE = eINSTANCE.getNullableType__GetReferencedType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.EnumTypeImpl <em>Enum
		 * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.EnumTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENUM_TYPE__LITERALS = eINSTANCE.getEnumType_Literals();

		/**
		 * The meta object literal for the '{@link soal.model.impl.EnumLiteralImpl
		 * <em>Enum Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.EnumLiteralImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENUM_LITERAL__ENUM = eINSTANCE.getEnumLiteral_Enum();

		/**
		 * The meta object literal for the '{@link soal.model.impl.StructTypeImpl
		 * <em>Struct Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.StructTypeImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getStructType()
		 * @generated
		 */
		EClass STRUCT_TYPE = eINSTANCE.getStructType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRUCT_TYPE__BASE_TYPE = eINSTANCE.getStructType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRUCT_TYPE__FIELDS = eINSTANCE.getStructType_Fields();

		/**
		 * The meta object literal for the '{@link soal.model.impl.VariableImpl
		 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.VariableImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link soal.model.impl.PropertyImpl
		 * <em>Property</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.PropertyImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ParameterImpl
		 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ParameterImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link soal.model.impl.InterfaceImpl
		 * <em>Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.InterfaceImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INTERFACE__RESOURCES = eINSTANCE.getInterface_Resources();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ResourceImpl
		 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ResourceImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE__READONLY = eINSTANCE.getResource_Readonly();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE__ENTITY = eINSTANCE.getResource_Entity();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE__EXCEPTIONS = eINSTANCE.getResource_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation RESOURCE___GET_NAME = eINSTANCE.getResource__GetName();

		/**
		 * The meta object literal for the '{@link soal.model.impl.OperationImpl
		 * <em>Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.OperationImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION__KIND = eINSTANCE.getOperation_Kind();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION__ASYNC = eINSTANCE.getOperation_Async();

		/**
		 * The meta object literal for the '<em><b>Request Parameters</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__REQUEST_PARAMETERS = eINSTANCE.getOperation_RequestParameters();

		/**
		 * The meta object literal for the '<em><b>Response Parameters</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__RESPONSE_PARAMETERS = eINSTANCE.getOperation_ResponseParameters();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__RESOURCE = eINSTANCE.getOperation_Resource();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__EXCEPTIONS = eINSTANCE.getOperation_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Has Request Parameters</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___HAS_REQUEST_PARAMETERS = eINSTANCE.getOperation__HasRequestParameters();

		/**
		 * The meta object literal for the '<em><b>Has Response Parameters</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___HAS_RESPONSE_PARAMETERS = eINSTANCE.getOperation__HasResponseParameters();

		/**
		 * The meta object literal for the '<em><b>Has Many Request Parameters</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___HAS_MANY_REQUEST_PARAMETERS = eINSTANCE.getOperation__HasManyRequestParameters();

		/**
		 * The meta object literal for the '<em><b>Has Single Response
		 * Parameter</b></em>' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___HAS_SINGLE_RESPONSE_PARAMETER = eINSTANCE.getOperation__HasSingleResponseParameter();

		/**
		 * The meta object literal for the '<em><b>Has Many Response
		 * Parameters</b></em>' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___HAS_MANY_RESPONSE_PARAMETERS = eINSTANCE.getOperation__HasManyResponseParameters();

		/**
		 * The meta object literal for the '<em><b>Single Return Type</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OPERATION___SINGLE_RETURN_TYPE = eINSTANCE.getOperation__SingleReturnType();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ParameterListImpl
		 * <em>Parameter List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see soal.model.impl.ParameterListImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link soal.model.impl.ServiceImpl
		 * <em>Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.impl.ServiceImpl
		 * @see soal.model.impl.SoalModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SERVICE__INTERFACE = eINSTANCE.getService_Interface();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SERVICE__BINDING = eINSTANCE.getService_Binding();

		/**
		 * The meta object literal for the '{@link soal.model.OperationKind
		 * <em>Operation Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.OperationKind
		 * @see soal.model.impl.SoalModelPackageImpl#getOperationKind()
		 * @generated
		 */
		EEnum OPERATION_KIND = eINSTANCE.getOperationKind();

		/**
		 * The meta object literal for the '{@link soal.model.DocumentationTagKind
		 * <em>Documentation Tag Kind</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see soal.model.DocumentationTagKind
		 * @see soal.model.impl.SoalModelPackageImpl#getDocumentationTagKind()
		 * @generated
		 */
		EEnum DOCUMENTATION_TAG_KIND = eINSTANCE.getDocumentationTagKind();

		/**
		 * The meta object literal for the '{@link soal.model.BuiltInTypeKind <em>Built
		 * In Type Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.BuiltInTypeKind
		 * @see soal.model.impl.SoalModelPackageImpl#getBuiltInTypeKind()
		 * @generated
		 */
		EEnum BUILT_IN_TYPE_KIND = eINSTANCE.getBuiltInTypeKind();

		/**
		 * The meta object literal for the '{@link soal.model.BindingKind <em>Binding
		 * Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.BindingKind
		 * @see soal.model.impl.SoalModelPackageImpl#getBindingKind()
		 * @generated
		 */
		EEnum BINDING_KIND = eINSTANCE.getBindingKind();

		/**
		 * The meta object literal for the '<em>Root Soal Model</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see soal.model.RootSoalModel
		 * @see soal.model.impl.SoalModelPackageImpl#getRootSoalModel()
		 * @generated
		 */
		EDataType ROOT_SOAL_MODEL = eINSTANCE.getRootSoalModel();

	}

} // SoalModelPackage
