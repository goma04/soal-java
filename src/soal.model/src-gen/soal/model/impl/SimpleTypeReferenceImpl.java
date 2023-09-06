/**
 */
package soal.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soal.model.SimpleTypeReference;
import soal.model.SoalModelPackage;
import soal.model.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple
 * Type Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.SimpleTypeReferenceImpl#getReferencedType
 * <em>Referenced Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypeReferenceImpl extends TypeReferenceImpl implements SimpleTypeReference {
	/**
	 * The cached value of the '{@link #getReferencedType() <em>Referenced
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferencedType()
	 * @generated
	 * @ordered
	 */
	protected Type referencedType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SimpleTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.SIMPLE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getReferencedType() {
		if (referencedType != null && referencedType.eIsProxy()) {
			InternalEObject oldReferencedType = (InternalEObject) referencedType;
			referencedType = (Type) eResolveProxy(oldReferencedType);
			if (referencedType != oldReferencedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE, oldReferencedType,
							referencedType));
			}
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type basicGetReferencedType() {
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferencedType(Type newReferencedType) {
		Type oldReferencedType = referencedType;
		referencedType = newReferencedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE, oldReferencedType, referencedType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE:
			if (resolve)
				return getReferencedType();
			return basicGetReferencedType();
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
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE:
			setReferencedType((Type) newValue);
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
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE:
			setReferencedType((Type) null);
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
		case SoalModelPackage.SIMPLE_TYPE_REFERENCE__REFERENCED_TYPE:
			return referencedType != null;
		}
		return super.eIsSet(featureID);
	}

} // SimpleTypeReferenceImpl
