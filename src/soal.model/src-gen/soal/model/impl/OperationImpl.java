/**
 */
package soal.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import soal.model.Operation;
import soal.model.OperationKind;
import soal.model.ParameterList;
import soal.model.Resource;
import soal.model.SoalModelPackage;
import soal.model.StructType;
import soal.model.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.OperationImpl#getKind <em>Kind</em>}</li>
 * <li>{@link soal.model.impl.OperationImpl#isAsync <em>Async</em>}</li>
 * <li>{@link soal.model.impl.OperationImpl#getRequestParameters <em>Request
 * Parameters</em>}</li>
 * <li>{@link soal.model.impl.OperationImpl#getResponseParameters <em>Response
 * Parameters</em>}</li>
 * <li>{@link soal.model.impl.OperationImpl#getResource <em>Resource</em>}</li>
 * <li>{@link soal.model.impl.OperationImpl#getExceptions
 * <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends DeclarationImpl implements Operation {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final OperationKind KIND_EDEFAULT = OperationKind.RPC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected OperationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsync() <em>Async</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsync() <em>Async</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected boolean async = ASYNC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestParameters() <em>Request
	 * Parameters</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRequestParameters()
	 * @generated
	 * @ordered
	 */
	protected ParameterList requestParameters;

	/**
	 * The cached value of the '{@link #getResponseParameters() <em>Response
	 * Parameters</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResponseParameters()
	 * @generated
	 * @ordered
	 */
	protected ParameterList responseParameters;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<StructType> exceptions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public OperationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKind(OperationKind newKind) {
		OperationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.OPERATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isAsync() {
		return async;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAsync(boolean newAsync) {
		boolean oldAsync = async;
		async = newAsync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.OPERATION__ASYNC, oldAsync, async));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ParameterList getRequestParameters() {
		return requestParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRequestParameters(ParameterList newRequestParameters, NotificationChain msgs) {
		ParameterList oldRequestParameters = requestParameters;
		requestParameters = newRequestParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.OPERATION__REQUEST_PARAMETERS, oldRequestParameters, newRequestParameters);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRequestParameters(ParameterList newRequestParameters) {
		if (newRequestParameters != requestParameters) {
			NotificationChain msgs = null;
			if (requestParameters != null)
				msgs = ((InternalEObject) requestParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.OPERATION__REQUEST_PARAMETERS, null, msgs);
			if (newRequestParameters != null)
				msgs = ((InternalEObject) newRequestParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.OPERATION__REQUEST_PARAMETERS, null, msgs);
			msgs = basicSetRequestParameters(newRequestParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.OPERATION__REQUEST_PARAMETERS,
					newRequestParameters, newRequestParameters));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ParameterList getResponseParameters() {
		return responseParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResponseParameters(ParameterList newResponseParameters, NotificationChain msgs) {
		ParameterList oldResponseParameters = responseParameters;
		responseParameters = newResponseParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.OPERATION__RESPONSE_PARAMETERS, oldResponseParameters, newResponseParameters);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setResponseParameters(ParameterList newResponseParameters) {
		if (newResponseParameters != responseParameters) {
			NotificationChain msgs = null;
			if (responseParameters != null)
				msgs = ((InternalEObject) responseParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.OPERATION__RESPONSE_PARAMETERS, null, msgs);
			if (newResponseParameters != null)
				msgs = ((InternalEObject) newResponseParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.OPERATION__RESPONSE_PARAMETERS, null, msgs);
			msgs = basicSetResponseParameters(newResponseParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.OPERATION__RESPONSE_PARAMETERS,
					newResponseParameters, newResponseParameters));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject) resource;
			resource = (Resource) eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoalModelPackage.OPERATION__RESOURCE,
							oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.OPERATION__RESOURCE, oldResource,
					resource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<StructType> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList<StructType>(StructType.class, this,
					SoalModelPackage.OPERATION__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean hasRequestParameters() {
		return ((this.getRequestParameters() != null) && (this.getRequestParameters().getParameters().size() > 0));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean hasResponseParameters() {
		return ((this.getResponseParameters() != null) && (this.getResponseParameters().getParameters().size() > 0));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean hasManyRequestParameters() {
		return ((this.getRequestParameters() != null) && (this.getRequestParameters().getParameters().size() > 1));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean hasSingleResponseParameter() {
		return ((this.getResponseParameters() != null) && (this.getResponseParameters().getParameters().size() == 1));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean hasManyResponseParameters() {
		return ((this.getResponseParameters() != null) && (this.getResponseParameters().getParameters().size() > 1));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type singleReturnType() {
		boolean _hasSingleResponseParameter = this.hasSingleResponseParameter();
		if (_hasSingleResponseParameter) {
			return this.getResponseParameters().getParameters().get(0).getType();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoalModelPackage.OPERATION__REQUEST_PARAMETERS:
			return basicSetRequestParameters(null, msgs);
		case SoalModelPackage.OPERATION__RESPONSE_PARAMETERS:
			return basicSetResponseParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoalModelPackage.OPERATION__KIND:
			return getKind();
		case SoalModelPackage.OPERATION__ASYNC:
			return isAsync();
		case SoalModelPackage.OPERATION__REQUEST_PARAMETERS:
			return getRequestParameters();
		case SoalModelPackage.OPERATION__RESPONSE_PARAMETERS:
			return getResponseParameters();
		case SoalModelPackage.OPERATION__RESOURCE:
			if (resolve)
				return getResource();
			return basicGetResource();
		case SoalModelPackage.OPERATION__EXCEPTIONS:
			return getExceptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoalModelPackage.OPERATION__KIND:
			setKind((OperationKind) newValue);
			return;
		case SoalModelPackage.OPERATION__ASYNC:
			setAsync((Boolean) newValue);
			return;
		case SoalModelPackage.OPERATION__REQUEST_PARAMETERS:
			setRequestParameters((ParameterList) newValue);
			return;
		case SoalModelPackage.OPERATION__RESPONSE_PARAMETERS:
			setResponseParameters((ParameterList) newValue);
			return;
		case SoalModelPackage.OPERATION__RESOURCE:
			setResource((Resource) newValue);
			return;
		case SoalModelPackage.OPERATION__EXCEPTIONS:
			getExceptions().clear();
			getExceptions().addAll((Collection<? extends StructType>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SoalModelPackage.OPERATION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case SoalModelPackage.OPERATION__ASYNC:
			setAsync(ASYNC_EDEFAULT);
			return;
		case SoalModelPackage.OPERATION__REQUEST_PARAMETERS:
			setRequestParameters((ParameterList) null);
			return;
		case SoalModelPackage.OPERATION__RESPONSE_PARAMETERS:
			setResponseParameters((ParameterList) null);
			return;
		case SoalModelPackage.OPERATION__RESOURCE:
			setResource((Resource) null);
			return;
		case SoalModelPackage.OPERATION__EXCEPTIONS:
			getExceptions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SoalModelPackage.OPERATION__KIND:
			return kind != KIND_EDEFAULT;
		case SoalModelPackage.OPERATION__ASYNC:
			return async != ASYNC_EDEFAULT;
		case SoalModelPackage.OPERATION__REQUEST_PARAMETERS:
			return requestParameters != null;
		case SoalModelPackage.OPERATION__RESPONSE_PARAMETERS:
			return responseParameters != null;
		case SoalModelPackage.OPERATION__RESOURCE:
			return resource != null;
		case SoalModelPackage.OPERATION__EXCEPTIONS:
			return exceptions != null && !exceptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SoalModelPackage.OPERATION___HAS_REQUEST_PARAMETERS:
			return hasRequestParameters();
		case SoalModelPackage.OPERATION___HAS_RESPONSE_PARAMETERS:
			return hasResponseParameters();
		case SoalModelPackage.OPERATION___HAS_MANY_REQUEST_PARAMETERS:
			return hasManyRequestParameters();
		case SoalModelPackage.OPERATION___HAS_SINGLE_RESPONSE_PARAMETER:
			return hasSingleResponseParameter();
		case SoalModelPackage.OPERATION___HAS_MANY_RESPONSE_PARAMETERS:
			return hasManyResponseParameters();
		case SoalModelPackage.OPERATION___SINGLE_RETURN_TYPE:
			return singleReturnType();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", async: ");
		result.append(async);
		result.append(')');
		return result.toString();
	}

} // OperationImpl
