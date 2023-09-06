/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.Resource#isReadonly <em>Readonly</em>}</li>
 * <li>{@link soal.model.Resource#getEntity <em>Entity</em>}</li>
 * <li>{@link soal.model.Resource#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Declaration {
	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see soal.model.SoalModelPackage#getResource_Readonly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link soal.model.Resource#isReadonly
	 * <em>Readonly</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(StructType)
	 * @see soal.model.SoalModelPackage#getResource_Entity()
	 * @model
	 * @generated
	 */
	StructType getEntity();

	/**
	 * Sets the value of the '{@link soal.model.Resource#getEntity <em>Entity</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(StructType value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list. The
	 * list contents are of type {@link soal.model.StructType}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see soal.model.SoalModelPackage#getResource_Exceptions()
	 * @model
	 * @generated
	 */
	EList<StructType> getExceptions();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

} // Resource
