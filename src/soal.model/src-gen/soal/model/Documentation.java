/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Documentation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.Documentation#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link soal.model.DocumentationTag}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getDocumentation_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentationTag> getTags();

} // Documentation
