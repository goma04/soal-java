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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soal.model.Declaration;
import soal.model.GlobalSoalModel;
import soal.model.RootSoalModel;
import soal.model.SoalModel;
import soal.model.SoalModelPackage;
import soal.model.SoalModelUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soal
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.SoalModelImpl#getRootModelLazy <em>Root Model
 * Lazy</em>}</li>
 * <li>{@link soal.model.impl.SoalModelImpl#getImports <em>Imports</em>}</li>
 * <li>{@link soal.model.impl.SoalModelImpl#getDeclarations
 * <em>Declarations</em>}</li>
 * <li>{@link soal.model.impl.SoalModelImpl#getRootModel <em>Root
 * Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoalModelImpl extends NamedElementImpl implements SoalModel {
	/**
	 * The default value of the '{@link #getRootModelLazy() <em>Root Model
	 * Lazy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRootModelLazy()
	 * @generated
	 * @ordered
	 */
	protected static final RootSoalModel ROOT_MODEL_LAZY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootModelLazy() <em>Root Model
	 * Lazy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRootModelLazy()
	 * @generated
	 * @ordered
	 */
	protected RootSoalModel rootModelLazy = ROOT_MODEL_LAZY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<SoalModel> imports;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The default value of the '{@link #getRootModel() <em>Root Model</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRootModel()
	 * @generated
	 * @ordered
	 */
	protected static final RootSoalModel ROOT_MODEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SoalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.SOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public RootSoalModel getRootModelLazy() {
		return rootModelLazy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRootModelLazy(RootSoalModel newRootModelLazy) {
		RootSoalModel oldRootModelLazy = rootModelLazy;
		rootModelLazy = newRootModelLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.SOAL_MODEL__ROOT_MODEL_LAZY,
					oldRootModelLazy, rootModelLazy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<SoalModel> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<SoalModel>(SoalModel.class, this, SoalModelPackage.SOAL_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this,
					SoalModelPackage.SOAL_MODEL__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public RootSoalModel getRootModel() {
		RootSoalModel _rootModelLazy = this.getRootModelLazy();
		boolean _tripleEquals = (_rootModelLazy == null);
		if (_tripleEquals) {
			this.setRootModelLazy(SoalModelUtils.createRootSoalModel(this));
		}
		return this.getRootModelLazy();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public GlobalSoalModel getGlobals() {
		return SoalModelUtils.getGlobalModel(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoalModelPackage.SOAL_MODEL__DECLARATIONS:
			return ((InternalEList<?>) getDeclarations()).basicRemove(otherEnd, msgs);
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
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL_LAZY:
			return getRootModelLazy();
		case SoalModelPackage.SOAL_MODEL__IMPORTS:
			return getImports();
		case SoalModelPackage.SOAL_MODEL__DECLARATIONS:
			return getDeclarations();
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL:
			return getRootModel();
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
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL_LAZY:
			setRootModelLazy((RootSoalModel) newValue);
			return;
		case SoalModelPackage.SOAL_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends SoalModel>) newValue);
			return;
		case SoalModelPackage.SOAL_MODEL__DECLARATIONS:
			getDeclarations().clear();
			getDeclarations().addAll((Collection<? extends Declaration>) newValue);
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
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL_LAZY:
			setRootModelLazy(ROOT_MODEL_LAZY_EDEFAULT);
			return;
		case SoalModelPackage.SOAL_MODEL__IMPORTS:
			getImports().clear();
			return;
		case SoalModelPackage.SOAL_MODEL__DECLARATIONS:
			getDeclarations().clear();
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
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL_LAZY:
			return ROOT_MODEL_LAZY_EDEFAULT == null ? rootModelLazy != null
					: !ROOT_MODEL_LAZY_EDEFAULT.equals(rootModelLazy);
		case SoalModelPackage.SOAL_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		case SoalModelPackage.SOAL_MODEL__DECLARATIONS:
			return declarations != null && !declarations.isEmpty();
		case SoalModelPackage.SOAL_MODEL__ROOT_MODEL:
			return ROOT_MODEL_EDEFAULT == null ? getRootModel() != null : !ROOT_MODEL_EDEFAULT.equals(getRootModel());
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
		case SoalModelPackage.SOAL_MODEL___GET_GLOBALS:
			return getGlobals();
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
		result.append(" (rootModelLazy: ");
		result.append(rootModelLazy);
		result.append(')');
		return result.toString();
	}

} // SoalModelImpl
