/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Service</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.Service#getInterface <em>Interface</em>}</li>
 * <li>{@link soal.model.Service#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Declaration {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see soal.model.SoalModelPackage#getService_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link soal.model.Service#getInterface
	 * <em>Interface</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute. The literals
	 * are from the enumeration {@link soal.model.BindingKind}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see soal.model.BindingKind
	 * @see #setBinding(BindingKind)
	 * @see soal.model.SoalModelPackage#getService_Binding()
	 * @model unique="false"
	 * @generated
	 */
	BindingKind getBinding();

	/**
	 * Sets the value of the '{@link soal.model.Service#getBinding
	 * <em>Binding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see soal.model.BindingKind
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingKind value);

} // Service
