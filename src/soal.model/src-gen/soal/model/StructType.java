/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Struct
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.StructType#getBaseType <em>Base Type</em>}</li>
 * <li>{@link soal.model.StructType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getStructType()
 * @model
 * @generated
 */
public interface StructType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBaseType(StructType)
	 * @see soal.model.SoalModelPackage#getStructType_BaseType()
	 * @model
	 * @generated
	 */
	StructType getBaseType();

	/**
	 * Sets the value of the '{@link soal.model.StructType#getBaseType <em>Base
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(StructType value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link soal.model.Property}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getStructType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getFields();

} // StructType
