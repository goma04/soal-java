/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple
 * Type Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.SimpleTypeReference#getReferencedType <em>Referenced
 * Type</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getSimpleTypeReference()
 * @model
 * @generated
 */
public interface SimpleTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referenced Type</em>' reference.
	 * @see #setReferencedType(Type)
	 * @see soal.model.SoalModelPackage#getSimpleTypeReference_ReferencedType()
	 * @model
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * Sets the value of the
	 * '{@link soal.model.SimpleTypeReference#getReferencedType <em>Referenced
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Referenced Type</em>' reference.
	 * @see #getReferencedType()
	 * @generated
	 */
	void setReferencedType(Type value);

} // SimpleTypeReference
