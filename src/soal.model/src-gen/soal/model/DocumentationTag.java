/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Documentation Tag</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.DocumentationTag#getKind <em>Kind</em>}</li>
 * <li>{@link soal.model.DocumentationTag#getName <em>Name</em>}</li>
 * <li>{@link soal.model.DocumentationTag#getLines <em>Lines</em>}</li>
 * <li>{@link soal.model.DocumentationTag#getHtmlLazy <em>Html Lazy</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getDocumentationTag()
 * @model
 * @generated
 */
public interface DocumentationTag extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. The literals are
	 * from the enumeration {@link soal.model.DocumentationTagKind}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see soal.model.DocumentationTagKind
	 * @see #setKind(DocumentationTagKind)
	 * @see soal.model.SoalModelPackage#getDocumentationTag_Kind()
	 * @model unique="false"
	 * @generated
	 */
	DocumentationTagKind getKind();

	/**
	 * Sets the value of the '{@link soal.model.DocumentationTag#getKind
	 * <em>Kind</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see soal.model.DocumentationTagKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DocumentationTagKind value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soal.model.SoalModelPackage#getDocumentationTag_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soal.model.DocumentationTag#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute list. The list
	 * contents are of type {@link java.lang.String}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Lines</em>' attribute list.
	 * @see soal.model.SoalModelPackage#getDocumentationTag_Lines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLines();

	/**
	 * Returns the value of the '<em><b>Html Lazy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Html Lazy</em>' attribute.
	 * @see #setHtmlLazy(String)
	 * @see soal.model.SoalModelPackage#getDocumentationTag_HtmlLazy()
	 * @model unique="false"
	 * @generated
	 */
	String getHtmlLazy();

	/**
	 * Sets the value of the '{@link soal.model.DocumentationTag#getHtmlLazy
	 * <em>Html Lazy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Html Lazy</em>' attribute.
	 * @see #getHtmlLazy()
	 * @generated
	 */
	void setHtmlLazy(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getHtml();

} // DocumentationTag
