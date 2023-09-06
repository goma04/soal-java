/**
 */
package soal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soal.model.ContainmentArrayType;
import soal.model.SoalModelPackage;
import soal.model.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Containment Array Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.ContainmentArrayTypeImpl#getInnerType <em>Inner
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainmentArrayTypeImpl extends ArrayTypeImpl implements ContainmentArrayType {
	/**
	 * The cached value of the '{@link #getInnerType() <em>Inner Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInnerType()
	 * @generated
	 * @ordered
	 */
	protected Type innerType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContainmentArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.CONTAINMENT_ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getInnerType() {
		return innerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInnerType(Type newInnerType, NotificationChain msgs) {
		Type oldInnerType = innerType;
		innerType = newInnerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE, oldInnerType, newInnerType);
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
	public void setInnerType(Type newInnerType) {
		if (newInnerType != innerType) {
			NotificationChain msgs = null;
			if (innerType != null)
				msgs = ((InternalEObject) innerType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE, null, msgs);
			if (newInnerType != null)
				msgs = ((InternalEObject) newInnerType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE, null, msgs);
			msgs = basicSetInnerType(newInnerType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE,
					newInnerType, newInnerType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE:
			return basicSetInnerType(null, msgs);
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
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE:
			return getInnerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE:
			setInnerType((Type) newValue);
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
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE:
			setInnerType((Type) null);
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
		case SoalModelPackage.CONTAINMENT_ARRAY_TYPE__INNER_TYPE:
			return innerType != null;
		}
		return super.eIsSet(featureID);
	}

} // ContainmentArrayTypeImpl
