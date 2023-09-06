/**
 */
package soal.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import soal.model.SoalModelPackage;
import soal.model.Type;
import soal.model.TypeReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Type
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeReferenceImpl extends TypeImpl implements TypeReference {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getReferencedType() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SoalModelPackage.TYPE_REFERENCE___GET_REFERENCED_TYPE:
			return getReferencedType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // TypeReferenceImpl
