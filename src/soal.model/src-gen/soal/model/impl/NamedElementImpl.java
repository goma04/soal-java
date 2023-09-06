/**
 */
package soal.model.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import soal.model.Documentation;
import soal.model.DocumentationTag;
import soal.model.DocumentationTagKind;
import soal.model.NamedElement;
import soal.model.SoalModelPackage;
import soal.model.SoalModelUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Named
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.NamedElementImpl#getName <em>Name</em>}</li>
 * <li>{@link soal.model.impl.NamedElementImpl#getDocumentationLazy
 * <em>Documentation Lazy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends ElementImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentationLazy() <em>Documentation
	 * Lazy</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getDocumentationLazy()
	 * @generated
	 * @ordered
	 */
	protected Documentation documentationLazy;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Documentation getDocumentationLazy() {
		return documentationLazy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDocumentationLazy(Documentation newDocumentationLazy, NotificationChain msgs) {
		Documentation oldDocumentationLazy = documentationLazy;
		documentationLazy = newDocumentationLazy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY, oldDocumentationLazy, newDocumentationLazy);
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
	public void setDocumentationLazy(Documentation newDocumentationLazy) {
		if (newDocumentationLazy != documentationLazy) {
			NotificationChain msgs = null;
			if (documentationLazy != null)
				msgs = ((InternalEObject) documentationLazy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY, null, msgs);
			if (newDocumentationLazy != null)
				msgs = ((InternalEObject) newDocumentationLazy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY, null, msgs);
			msgs = basicSetDocumentationLazy(newDocumentationLazy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY,
					newDocumentationLazy, newDocumentationLazy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getUniqueName() {
		return SoalModelUtils.getUniqueName(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Documentation getDocumentation() {
		Documentation _documentationLazy = this.getDocumentationLazy();
		boolean _tripleEquals = (_documentationLazy == null);
		if (_tripleEquals) {
			this.setDocumentationLazy(SoalModelUtils.getDocumentation(this));
		}
		return this.getDocumentationLazy();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHoverDocumentation() {
		Documentation _documentation = this.getDocumentation();
		EList<DocumentationTag> _tags = null;
		if (_documentation != null) {
			_tags = _documentation.getTags();
		}
		DocumentationTag _findFirst = null;
		if (_tags != null) {
			final Function1<DocumentationTag, Boolean> _function = new Function1<DocumentationTag, Boolean>() {
				public Boolean apply(final DocumentationTag it) {
					DocumentationTagKind _kind = it.getKind();
					return Boolean.valueOf(Objects.equal(_kind, DocumentationTagKind.SUMMARY));
				}
			};
			_findFirst = IterableExtensions.<DocumentationTag>findFirst(_tags, _function);
		}
		String _html = null;
		if (_findFirst != null) {
			_html = _findFirst.getHtml();
		}
		return _html;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY:
			return basicSetDocumentationLazy(null, msgs);
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
		case SoalModelPackage.NAMED_ELEMENT__NAME:
			return getName();
		case SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY:
			return getDocumentationLazy();
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
		case SoalModelPackage.NAMED_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY:
			setDocumentationLazy((Documentation) newValue);
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
		case SoalModelPackage.NAMED_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY:
			setDocumentationLazy((Documentation) null);
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
		case SoalModelPackage.NAMED_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoalModelPackage.NAMED_ELEMENT__DOCUMENTATION_LAZY:
			return documentationLazy != null;
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
		case SoalModelPackage.NAMED_ELEMENT___GET_UNIQUE_NAME:
			return getUniqueName();
		case SoalModelPackage.NAMED_ELEMENT___GET_DOCUMENTATION:
			return getDocumentation();
		case SoalModelPackage.NAMED_ELEMENT___GET_HOVER_DOCUMENTATION:
			return getHoverDocumentation();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // NamedElementImpl
