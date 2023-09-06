/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Built In
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.BuiltInType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getBuiltInType()
 * @model
 * @generated
 */
public interface BuiltInType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. The literals are
	 * from the enumeration {@link soal.model.BuiltInTypeKind}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see soal.model.BuiltInTypeKind
	 * @see #setKind(BuiltInTypeKind)
	 * @see soal.model.SoalModelPackage#getBuiltInType_Kind()
	 * @model unique="false"
	 * @generated
	 */
	BuiltInTypeKind getKind();

	/**
	 * Sets the value of the '{@link soal.model.BuiltInType#getKind <em>Kind</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see soal.model.BuiltInTypeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BuiltInTypeKind value);

} // BuiltInType
