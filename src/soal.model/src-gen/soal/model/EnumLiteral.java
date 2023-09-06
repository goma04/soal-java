/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enum
 * Literal</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.EnumLiteral#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' container reference. It is
	 * bidirectional and its opposite is '{@link soal.model.EnumType#getLiterals
	 * <em>Literals</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enum</em>' container reference.
	 * @see #setEnum(EnumType)
	 * @see soal.model.SoalModelPackage#getEnumLiteral_Enum()
	 * @see soal.model.EnumType#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	EnumType getEnum();

	/**
	 * Sets the value of the '{@link soal.model.EnumLiteral#getEnum <em>Enum</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Enum</em>' container reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(EnumType value);

} // EnumLiteral
