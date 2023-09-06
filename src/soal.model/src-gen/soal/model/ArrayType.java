/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Array
 * Type</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see soal.model.SoalModelPackage#getArrayType()
 * @model abstract="true"
 * @generated
 */
public interface ArrayType extends TypeReference {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Type getInnerType();

} // ArrayType
