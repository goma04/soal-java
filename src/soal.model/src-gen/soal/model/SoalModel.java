/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Soal
 * Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.SoalModel#getRootModelLazy <em>Root Model
 * Lazy</em>}</li>
 * <li>{@link soal.model.SoalModel#getImports <em>Imports</em>}</li>
 * <li>{@link soal.model.SoalModel#getDeclarations <em>Declarations</em>}</li>
 * <li>{@link soal.model.SoalModel#getRootModel <em>Root Model</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getSoalModel()
 * @model
 * @generated
 */
public interface SoalModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Root Model Lazy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Model Lazy</em>' attribute.
	 * @see #setRootModelLazy(RootSoalModel)
	 * @see soal.model.SoalModelPackage#getSoalModel_RootModelLazy()
	 * @model unique="false" dataType="soal.model.RootSoalModel"
	 * @generated
	 */
	RootSoalModel getRootModelLazy();

	/**
	 * Sets the value of the '{@link soal.model.SoalModel#getRootModelLazy <em>Root
	 * Model Lazy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Root Model Lazy</em>' attribute.
	 * @see #getRootModelLazy()
	 * @generated
	 */
	void setRootModelLazy(RootSoalModel value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list. The list
	 * contents are of type {@link soal.model.SoalModel}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see soal.model.SoalModelPackage#getSoalModel_Imports()
	 * @model
	 * @generated
	 */
	EList<SoalModel> getImports();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference
	 * list. The list contents are of type {@link soal.model.Declaration}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getSoalModel_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Root Model</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Model</em>' attribute.
	 * @see soal.model.SoalModelPackage#getSoalModel_RootModel()
	 * @model unique="false" dataType="soal.model.RootSoalModel" transient="true"
	 *        changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	RootSoalModel getRootModel();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	GlobalSoalModel getGlobals();

} // SoalModel
