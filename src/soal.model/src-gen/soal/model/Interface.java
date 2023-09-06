/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Interface</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.Interface#getResources <em>Resources</em>}</li>
 * <li>{@link soal.model.Interface#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Declaration {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference
	 * list. The list contents are of type {@link soal.model.Resource}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getInterface_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference
	 * list. The list contents are of type {@link soal.model.Operation}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getInterface_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Interface
