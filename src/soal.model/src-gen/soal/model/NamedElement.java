/**
 */
package soal.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Named
 * Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.NamedElement#getName <em>Name</em>}</li>
 * <li>{@link soal.model.NamedElement#getDocumentationLazy <em>Documentation
 * Lazy</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soal.model.SoalModelPackage#getNamedElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soal.model.NamedElement#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation Lazy</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Documentation Lazy</em>' containment reference.
	 * @see #setDocumentationLazy(Documentation)
	 * @see soal.model.SoalModelPackage#getNamedElement_DocumentationLazy()
	 * @model containment="true"
	 * @generated
	 */
	Documentation getDocumentationLazy();

	/**
	 * Sets the value of the '{@link soal.model.NamedElement#getDocumentationLazy
	 * <em>Documentation Lazy</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Documentation Lazy</em>' containment
	 *              reference.
	 * @see #getDocumentationLazy()
	 * @generated
	 */
	void setDocumentationLazy(Documentation value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Documentation getDocumentation();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getHoverDocumentation();

} // NamedElement
