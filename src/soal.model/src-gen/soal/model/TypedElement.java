/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Typed
 * Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.TypedElement#getTypeReference <em>Type
 * Reference</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(TypeReference)
	 * @see soal.model.SoalModelPackage#getTypedElement_TypeReference()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link soal.model.TypedElement#getTypeReference
	 * <em>Type Reference</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type Reference</em>' containment
	 *              reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(TypeReference value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Type getType();

} // TypedElement
