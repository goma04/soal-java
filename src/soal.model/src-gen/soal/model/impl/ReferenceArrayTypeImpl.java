/**
 */
package soal.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soal.model.ReferenceArrayType;
import soal.model.SoalModelPackage;
import soal.model.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Reference Array Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.ReferenceArrayTypeImpl#getInnerType <em>Inner
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceArrayTypeImpl extends ArrayTypeImpl implements ReferenceArrayType {
	/**
	 * The cached value of the '{@link #getInnerType() <em>Inner Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	protected ReferenceArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.REFERENCE_ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getInnerType() {
		if (innerType != null && innerType.eIsProxy()) {
			InternalEObject oldInnerType = (InternalEObject) innerType;
			innerType = (Type) eResolveProxy(oldInnerType);
			if (innerType != oldInnerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE, oldInnerType, innerType));
			}
		}
		return innerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type basicGetInnerType() {
		return innerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInnerType(Type newInnerType) {
		Type oldInnerType = innerType;
		innerType = newInnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE,
					oldInnerType, innerType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE:
			if (resolve)
				return getInnerType();
			return basicGetInnerType();
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
		case SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE:
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
		case SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE:
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
		case SoalModelPackage.REFERENCE_ARRAY_TYPE__INNER_TYPE:
			return innerType != null;
		}
		return super.eIsSet(featureID);
	}

} // ReferenceArrayTypeImpl
