/**
 */
package soal.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import soal.model.ArrayType;
import soal.model.SoalModelPackage;
import soal.model.Type;
import soal.model.TypeReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Array
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ArrayTypeImpl extends TypeReferenceImpl implements ArrayType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.ARRAY_TYPE;
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
	public Type getInnerType() {
		return null;
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
				return SoalModelPackage.ARRAY_TYPE___GET_REFERENCED_TYPE;
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
		case SoalModelPackage.ARRAY_TYPE___GET_REFERENCED_TYPE:
			return getReferencedType();
		case SoalModelPackage.ARRAY_TYPE___GET_INNER_TYPE:
			return getInnerType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ArrayTypeImpl
