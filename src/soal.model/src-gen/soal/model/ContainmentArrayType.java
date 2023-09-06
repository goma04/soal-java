/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Containment Array Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.ContainmentArrayType#getInnerType <em>Inner
 * Type</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getContainmentArrayType()
 * @model
 * @generated
 */
public interface ContainmentArrayType extends ArrayType {
	/**
	 * Returns the value of the '<em><b>Inner Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inner Type</em>' containment reference.
	 * @see #setInnerType(Type)
	 * @see soal.model.SoalModelPackage#getContainmentArrayType_InnerType()
	 * @model containment="true"
	 * @generated
	 */
	Type getInnerType();

	/**
	 * Sets the value of the '{@link soal.model.ContainmentArrayType#getInnerType
	 * <em>Inner Type</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Inner Type</em>' containment
	 *              reference.
	 * @see #getInnerType()
	 * @generated
	 */
	void setInnerType(Type value);

} // ContainmentArrayType
