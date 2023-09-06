/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enum
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.EnumType#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference
	 * list. The list contents are of type {@link soal.model.EnumLiteral}. It is
	 * bidirectional and its opposite is '{@link soal.model.EnumLiteral#getEnum
	 * <em>Enum</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getEnumType_Literals()
	 * @see soal.model.EnumLiteral#getEnum
	 * @model opposite="enum" containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // EnumType
