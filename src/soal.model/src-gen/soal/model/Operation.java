/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.Operation#getKind <em>Kind</em>}</li>
 * <li>{@link soal.model.Operation#isAsync <em>Async</em>}</li>
 * <li>{@link soal.model.Operation#getRequestParameters <em>Request
 * Parameters</em>}</li>
 * <li>{@link soal.model.Operation#getResponseParameters <em>Response
 * Parameters</em>}</li>
 * <li>{@link soal.model.Operation#getResource <em>Resource</em>}</li>
 * <li>{@link soal.model.Operation#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Declaration {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. The literals are
	 * from the enumeration {@link soal.model.OperationKind}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see soal.model.OperationKind
	 * @see #setKind(OperationKind)
	 * @see soal.model.SoalModelPackage#getOperation_Kind()
	 * @model unique="false"
	 * @generated
	 */
	OperationKind getKind();

	/**
	 * Sets the value of the '{@link soal.model.Operation#getKind <em>Kind</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see soal.model.OperationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OperationKind value);

	/**
	 * Returns the value of the '<em><b>Async</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Async</em>' attribute.
	 * @see #setAsync(boolean)
	 * @see soal.model.SoalModelPackage#getOperation_Async()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAsync();

	/**
	 * Sets the value of the '{@link soal.model.Operation#isAsync <em>Async</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Async</em>' attribute.
	 * @see #isAsync()
	 * @generated
	 */
	void setAsync(boolean value);

	/**
	 * Returns the value of the '<em><b>Request Parameters</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Request Parameters</em>' containment reference.
	 * @see #setRequestParameters(ParameterList)
	 * @see soal.model.SoalModelPackage#getOperation_RequestParameters()
	 * @model containment="true"
	 * @generated
	 */
	ParameterList getRequestParameters();

	/**
	 * Sets the value of the '{@link soal.model.Operation#getRequestParameters
	 * <em>Request Parameters</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Request Parameters</em>' containment
	 *              reference.
	 * @see #getRequestParameters()
	 * @generated
	 */
	void setRequestParameters(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Response Parameters</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Response Parameters</em>' containment
	 *         reference.
	 * @see #setResponseParameters(ParameterList)
	 * @see soal.model.SoalModelPackage#getOperation_ResponseParameters()
	 * @model containment="true"
	 * @generated
	 */
	ParameterList getResponseParameters();

	/**
	 * Sets the value of the '{@link soal.model.Operation#getResponseParameters
	 * <em>Response Parameters</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Response Parameters</em>' containment
	 *              reference.
	 * @see #getResponseParameters()
	 * @generated
	 */
	void setResponseParameters(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see soal.model.SoalModelPackage#getOperation_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link soal.model.Operation#getResource
	 * <em>Resource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list. The
	 * list contents are of type {@link soal.model.StructType}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see soal.model.SoalModelPackage#getOperation_Exceptions()
	 * @model
	 * @generated
	 */
	EList<StructType> getExceptions();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	boolean hasRequestParameters();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	boolean hasResponseParameters();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	boolean hasManyRequestParameters();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	boolean hasSingleResponseParameter();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	boolean hasManyResponseParameters();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model unique="false"
	 * @generated
	 */
	Type singleReturnType();

} // Operation
