/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Nullable
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.NullableType#getInnerType <em>Inner Type</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getNullableType()
 * @model
 * @generated
 */
public interface NullableType extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Inner Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inner Type</em>' reference.
	 * @see #setInnerType(Type)
	 * @see soal.model.SoalModelPackage#getNullableType_InnerType()
	 * @model
	 * @generated
	 */
	Type getInnerType();

	/**
	 * Sets the value of the '{@link soal.model.NullableType#getInnerType <em>Inner
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Inner Type</em>' reference.
	 * @see #getInnerType()
	 * @generated
	 */
	void setInnerType(Type value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Type getReferencedType();

} // NullableType
