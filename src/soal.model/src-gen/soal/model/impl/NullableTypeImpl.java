/**
 */
package soal.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soal.model.NullableType;
import soal.model.SoalModelPackage;
import soal.model.Type;
import soal.model.TypeReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Nullable Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.NullableTypeImpl#getInnerType <em>Inner
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullableTypeImpl extends TypeReferenceImpl implements NullableType {
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
	protected NullableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.NULLABLE_TYPE;
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
							SoalModelPackage.NULLABLE_TYPE__INNER_TYPE, oldInnerType, innerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.NULLABLE_TYPE__INNER_TYPE,
					oldInnerType, innerType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getReferencedType() {
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoalModelPackage.NULLABLE_TYPE__INNER_TYPE:
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
		case SoalModelPackage.NULLABLE_TYPE__INNER_TYPE:
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
		case SoalModelPackage.NULLABLE_TYPE__INNER_TYPE:
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
		case SoalModelPackage.NULLABLE_TYPE__INNER_TYPE:
			return innerType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TypeReference.class) {
			switch (baseOperationID) {
			case SoalModelPackage.TYPE_REFERENCE___GET_REFERENCED_TYPE:
				return SoalModelPackage.NULLABLE_TYPE___GET_REFERENCED_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SoalModelPackage.NULLABLE_TYPE___GET_REFERENCED_TYPE:
			return getReferencedType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // NullableTypeImpl
