/**
 */
package soal.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import soal.model.BuiltInType;
import soal.model.GlobalSoalModel;
import soal.model.SoalModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Global
 * Soal Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getErrorType <em>Error
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getAnyType <em>Any
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getVoidType <em>Void
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getObjectType <em>Object
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getBinaryType <em>Binary
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getBoolType <em>Bool
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getStringType <em>String
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getIntType <em>Int
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getLongType <em>Long
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getFloatType <em>Float
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getDoubleType <em>Double
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getDateType <em>Date
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getTimeType <em>Time
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getDateTimeType <em>Date Time
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getDurationType <em>Duration
 * Type</em>}</li>
 * <li>{@link soal.model.impl.GlobalSoalModelImpl#getBuiltInTypes <em>Built In
 * Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalSoalModelImpl extends MinimalEObjectImpl.Container implements GlobalSoalModel {
	/**
	 * The cached value of the '{@link #getErrorType() <em>Error Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType errorType;

	/**
	 * The cached value of the '{@link #getAnyType() <em>Any Type</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnyType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType anyType;

	/**
	 * The cached value of the '{@link #getVoidType() <em>Void Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVoidType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType voidType;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType objectType;

	/**
	 * The cached value of the '{@link #getBinaryType() <em>Binary Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBinaryType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType binaryType;

	/**
	 * The cached value of the '{@link #getBoolType() <em>Bool Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBoolType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType boolType;

	/**
	 * The cached value of the '{@link #getStringType() <em>String Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStringType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType stringType;

	/**
	 * The cached value of the '{@link #getIntType() <em>Int Type</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIntType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType intType;

	/**
	 * The cached value of the '{@link #getLongType() <em>Long Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLongType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType longType;

	/**
	 * The cached value of the '{@link #getFloatType() <em>Float Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFloatType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType floatType;

	/**
	 * The cached value of the '{@link #getDoubleType() <em>Double Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDoubleType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType doubleType;

	/**
	 * The cached value of the '{@link #getDateType() <em>Date Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDateType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType dateType;

	/**
	 * The cached value of the '{@link #getTimeType() <em>Time Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType timeType;

	/**
	 * The cached value of the '{@link #getDateTimeType() <em>Date Time Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDateTimeType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType dateTimeType;

	/**
	 * The cached value of the '{@link #getDurationType() <em>Duration Type</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDurationType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType durationType;

	/**
	 * The cached value of the '{@link #getBuiltInTypes() <em>Built In Types</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBuiltInTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BuiltInType> builtInTypes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GlobalSoalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.GLOBAL_SOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getErrorType() {
		return errorType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetErrorType(BuiltInType newErrorType, NotificationChain msgs) {
		BuiltInType oldErrorType = errorType;
		errorType = newErrorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE, oldErrorType, newErrorType);
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
	public void setErrorType(BuiltInType newErrorType) {
		if (newErrorType != errorType) {
			NotificationChain msgs = null;
			if (errorType != null)
				msgs = ((InternalEObject) errorType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE, null, msgs);
			if (newErrorType != null)
				msgs = ((InternalEObject) newErrorType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE, null, msgs);
			msgs = basicSetErrorType(newErrorType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE,
					newErrorType, newErrorType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getAnyType() {
		return anyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnyType(BuiltInType newAnyType, NotificationChain msgs) {
		BuiltInType oldAnyType = anyType;
		anyType = newAnyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE, oldAnyType, newAnyType);
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
	public void setAnyType(BuiltInType newAnyType) {
		if (newAnyType != anyType) {
			NotificationChain msgs = null;
			if (anyType != null)
				msgs = ((InternalEObject) anyType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE, null, msgs);
			if (newAnyType != null)
				msgs = ((InternalEObject) newAnyType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE, null, msgs);
			msgs = basicSetAnyType(newAnyType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE,
					newAnyType, newAnyType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getVoidType() {
		return voidType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVoidType(BuiltInType newVoidType, NotificationChain msgs) {
		BuiltInType oldVoidType = voidType;
		voidType = newVoidType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE, oldVoidType, newVoidType);
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
	public void setVoidType(BuiltInType newVoidType) {
		if (newVoidType != voidType) {
			NotificationChain msgs = null;
			if (voidType != null)
				msgs = ((InternalEObject) voidType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE, null, msgs);
			if (newVoidType != null)
				msgs = ((InternalEObject) newVoidType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE, null, msgs);
			msgs = basicSetVoidType(newVoidType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE,
					newVoidType, newVoidType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetObjectType(BuiltInType newObjectType, NotificationChain msgs) {
		BuiltInType oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE, oldObjectType, newObjectType);
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
	public void setObjectType(BuiltInType newObjectType) {
		if (newObjectType != objectType) {
			NotificationChain msgs = null;
			if (objectType != null)
				msgs = ((InternalEObject) objectType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE, null, msgs);
			if (newObjectType != null)
				msgs = ((InternalEObject) newObjectType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE, null, msgs);
			msgs = basicSetObjectType(newObjectType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE,
					newObjectType, newObjectType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getBinaryType() {
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBinaryType(BuiltInType newBinaryType, NotificationChain msgs) {
		BuiltInType oldBinaryType = binaryType;
		binaryType = newBinaryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE, oldBinaryType, newBinaryType);
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
	public void setBinaryType(BuiltInType newBinaryType) {
		if (newBinaryType != binaryType) {
			NotificationChain msgs = null;
			if (binaryType != null)
				msgs = ((InternalEObject) binaryType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE, null, msgs);
			if (newBinaryType != null)
				msgs = ((InternalEObject) newBinaryType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE, null, msgs);
			msgs = basicSetBinaryType(newBinaryType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE,
					newBinaryType, newBinaryType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getBoolType() {
		return boolType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBoolType(BuiltInType newBoolType, NotificationChain msgs) {
		BuiltInType oldBoolType = boolType;
		boolType = newBoolType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE, oldBoolType, newBoolType);
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
	public void setBoolType(BuiltInType newBoolType) {
		if (newBoolType != boolType) {
			NotificationChain msgs = null;
			if (boolType != null)
				msgs = ((InternalEObject) boolType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE, null, msgs);
			if (newBoolType != null)
				msgs = ((InternalEObject) newBoolType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE, null, msgs);
			msgs = basicSetBoolType(newBoolType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE,
					newBoolType, newBoolType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getStringType() {
		return stringType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStringType(BuiltInType newStringType, NotificationChain msgs) {
		BuiltInType oldStringType = stringType;
		stringType = newStringType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE, oldStringType, newStringType);
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
	public void setStringType(BuiltInType newStringType) {
		if (newStringType != stringType) {
			NotificationChain msgs = null;
			if (stringType != null)
				msgs = ((InternalEObject) stringType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE, null, msgs);
			if (newStringType != null)
				msgs = ((InternalEObject) newStringType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE, null, msgs);
			msgs = basicSetStringType(newStringType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE,
					newStringType, newStringType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getIntType() {
		return intType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIntType(BuiltInType newIntType, NotificationChain msgs) {
		BuiltInType oldIntType = intType;
		intType = newIntType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE, oldIntType, newIntType);
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
	public void setIntType(BuiltInType newIntType) {
		if (newIntType != intType) {
			NotificationChain msgs = null;
			if (intType != null)
				msgs = ((InternalEObject) intType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE, null, msgs);
			if (newIntType != null)
				msgs = ((InternalEObject) newIntType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE, null, msgs);
			msgs = basicSetIntType(newIntType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE,
					newIntType, newIntType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getLongType() {
		return longType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLongType(BuiltInType newLongType, NotificationChain msgs) {
		BuiltInType oldLongType = longType;
		longType = newLongType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE, oldLongType, newLongType);
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
	public void setLongType(BuiltInType newLongType) {
		if (newLongType != longType) {
			NotificationChain msgs = null;
			if (longType != null)
				msgs = ((InternalEObject) longType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE, null, msgs);
			if (newLongType != null)
				msgs = ((InternalEObject) newLongType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE, null, msgs);
			msgs = basicSetLongType(newLongType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE,
					newLongType, newLongType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getFloatType() {
		return floatType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFloatType(BuiltInType newFloatType, NotificationChain msgs) {
		BuiltInType oldFloatType = floatType;
		floatType = newFloatType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE, oldFloatType, newFloatType);
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
	public void setFloatType(BuiltInType newFloatType) {
		if (newFloatType != floatType) {
			NotificationChain msgs = null;
			if (floatType != null)
				msgs = ((InternalEObject) floatType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE, null, msgs);
			if (newFloatType != null)
				msgs = ((InternalEObject) newFloatType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE, null, msgs);
			msgs = basicSetFloatType(newFloatType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE,
					newFloatType, newFloatType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getDoubleType() {
		return doubleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDoubleType(BuiltInType newDoubleType, NotificationChain msgs) {
		BuiltInType oldDoubleType = doubleType;
		doubleType = newDoubleType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE, oldDoubleType, newDoubleType);
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
	public void setDoubleType(BuiltInType newDoubleType) {
		if (newDoubleType != doubleType) {
			NotificationChain msgs = null;
			if (doubleType != null)
				msgs = ((InternalEObject) doubleType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE, null, msgs);
			if (newDoubleType != null)
				msgs = ((InternalEObject) newDoubleType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE, null, msgs);
			msgs = basicSetDoubleType(newDoubleType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE,
					newDoubleType, newDoubleType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getDateType() {
		return dateType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDateType(BuiltInType newDateType, NotificationChain msgs) {
		BuiltInType oldDateType = dateType;
		dateType = newDateType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE, oldDateType, newDateType);
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
	public void setDateType(BuiltInType newDateType) {
		if (newDateType != dateType) {
			NotificationChain msgs = null;
			if (dateType != null)
				msgs = ((InternalEObject) dateType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE, null, msgs);
			if (newDateType != null)
				msgs = ((InternalEObject) newDateType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE, null, msgs);
			msgs = basicSetDateType(newDateType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE,
					newDateType, newDateType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getTimeType() {
		return timeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTimeType(BuiltInType newTimeType, NotificationChain msgs) {
		BuiltInType oldTimeType = timeType;
		timeType = newTimeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE, oldTimeType, newTimeType);
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
	public void setTimeType(BuiltInType newTimeType) {
		if (newTimeType != timeType) {
			NotificationChain msgs = null;
			if (timeType != null)
				msgs = ((InternalEObject) timeType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE, null, msgs);
			if (newTimeType != null)
				msgs = ((InternalEObject) newTimeType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE, null, msgs);
			msgs = basicSetTimeType(newTimeType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE,
					newTimeType, newTimeType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getDateTimeType() {
		return dateTimeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDateTimeType(BuiltInType newDateTimeType, NotificationChain msgs) {
		BuiltInType oldDateTimeType = dateTimeType;
		dateTimeType = newDateTimeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE, oldDateTimeType, newDateTimeType);
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
	public void setDateTimeType(BuiltInType newDateTimeType) {
		if (newDateTimeType != dateTimeType) {
			NotificationChain msgs = null;
			if (dateTimeType != null)
				msgs = ((InternalEObject) dateTimeType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE, null, msgs);
			if (newDateTimeType != null)
				msgs = ((InternalEObject) newDateTimeType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE, null, msgs);
			msgs = basicSetDateTimeType(newDateTimeType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE,
					newDateTimeType, newDateTimeType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BuiltInType getDurationType() {
		return durationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDurationType(BuiltInType newDurationType, NotificationChain msgs) {
		BuiltInType oldDurationType = durationType;
		durationType = newDurationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE, oldDurationType, newDurationType);
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
	public void setDurationType(BuiltInType newDurationType) {
		if (newDurationType != durationType) {
			NotificationChain msgs = null;
			if (durationType != null)
				msgs = ((InternalEObject) durationType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE, null, msgs);
			if (newDurationType != null)
				msgs = ((InternalEObject) newDurationType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE, null, msgs);
			msgs = basicSetDurationType(newDurationType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE,
					newDurationType, newDurationType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BuiltInType> getBuiltInTypes() {
		if (builtInTypes == null) {
			builtInTypes = new EObjectResolvingEList<BuiltInType>(BuiltInType.class, this,
					SoalModelPackage.GLOBAL_SOAL_MODEL__BUILT_IN_TYPES);
		}
		return builtInTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE:
			return basicSetErrorType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE:
			return basicSetAnyType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE:
			return basicSetVoidType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE:
			return basicSetObjectType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE:
			return basicSetBinaryType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE:
			return basicSetBoolType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE:
			return basicSetStringType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE:
			return basicSetIntType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE:
			return basicSetLongType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE:
			return basicSetFloatType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE:
			return basicSetDoubleType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE:
			return basicSetDateType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE:
			return basicSetTimeType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE:
			return basicSetDateTimeType(null, msgs);
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE:
			return basicSetDurationType(null, msgs);
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
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE:
			return getErrorType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE:
			return getAnyType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE:
			return getVoidType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE:
			return getObjectType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE:
			return getBinaryType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE:
			return getBoolType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE:
			return getStringType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE:
			return getIntType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE:
			return getLongType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE:
			return getFloatType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE:
			return getDoubleType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE:
			return getDateType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE:
			return getTimeType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE:
			return getDateTimeType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE:
			return getDurationType();
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BUILT_IN_TYPES:
			return getBuiltInTypes();
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
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE:
			setErrorType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE:
			setAnyType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE:
			setVoidType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE:
			setObjectType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE:
			setBinaryType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE:
			setBoolType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE:
			setStringType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE:
			setIntType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE:
			setLongType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE:
			setFloatType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE:
			setDoubleType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE:
			setDateType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE:
			setTimeType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE:
			setDateTimeType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE:
			setDurationType((BuiltInType) newValue);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BUILT_IN_TYPES:
			getBuiltInTypes().clear();
			getBuiltInTypes().addAll((Collection<? extends BuiltInType>) newValue);
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
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE:
			setErrorType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE:
			setAnyType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE:
			setVoidType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE:
			setObjectType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE:
			setBinaryType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE:
			setBoolType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE:
			setStringType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE:
			setIntType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE:
			setLongType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE:
			setFloatType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE:
			setDoubleType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE:
			setDateType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE:
			setTimeType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE:
			setDateTimeType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE:
			setDurationType((BuiltInType) null);
			return;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BUILT_IN_TYPES:
			getBuiltInTypes().clear();
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
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ERROR_TYPE:
			return errorType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__ANY_TYPE:
			return anyType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__VOID_TYPE:
			return voidType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__OBJECT_TYPE:
			return objectType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BINARY_TYPE:
			return binaryType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BOOL_TYPE:
			return boolType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__STRING_TYPE:
			return stringType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__INT_TYPE:
			return intType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__LONG_TYPE:
			return longType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__FLOAT_TYPE:
			return floatType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DOUBLE_TYPE:
			return doubleType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TYPE:
			return dateType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__TIME_TYPE:
			return timeType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DATE_TIME_TYPE:
			return dateTimeType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__DURATION_TYPE:
			return durationType != null;
		case SoalModelPackage.GLOBAL_SOAL_MODEL__BUILT_IN_TYPES:
			return builtInTypes != null && !builtInTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GlobalSoalModelImpl
