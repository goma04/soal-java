/**
 */
package soal.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import soal.model.DocumentationTag;
import soal.model.DocumentationTagKind;
import soal.model.SoalModelPackage;
import soal.model.SoalModelUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Documentation Tag</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link soal.model.impl.DocumentationTagImpl#getKind <em>Kind</em>}</li>
 * <li>{@link soal.model.impl.DocumentationTagImpl#getName <em>Name</em>}</li>
 * <li>{@link soal.model.impl.DocumentationTagImpl#getLines <em>Lines</em>}</li>
 * <li>{@link soal.model.impl.DocumentationTagImpl#getHtmlLazy <em>Html
 * Lazy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationTagImpl extends MinimalEObjectImpl.Container implements DocumentationTag {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentationTagKind KIND_EDEFAULT = DocumentationTagKind.UNKNOWN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DocumentationTagKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lines;

	/**
	 * The default value of the '{@link #getHtmlLazy() <em>Html Lazy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHtmlLazy()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_LAZY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHtmlLazy() <em>Html Lazy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHtmlLazy()
	 * @generated
	 * @ordered
	 */
	protected String htmlLazy = HTML_LAZY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentationTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoalModelPackage.Literals.DOCUMENTATION_TAG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DocumentationTagKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setKind(DocumentationTagKind newKind) {
		DocumentationTagKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.DOCUMENTATION_TAG__KIND, oldKind,
					kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.DOCUMENTATION_TAG__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<String> getLines() {
		if (lines == null) {
			lines = new EDataTypeEList<String>(String.class, this, SoalModelPackage.DOCUMENTATION_TAG__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHtmlLazy() {
		return htmlLazy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHtmlLazy(String newHtmlLazy) {
		String oldHtmlLazy = htmlLazy;
		htmlLazy = newHtmlLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoalModelPackage.DOCUMENTATION_TAG__HTML_LAZY,
					oldHtmlLazy, htmlLazy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHtml() {
		String _htmlLazy = this.getHtmlLazy();
		boolean _tripleEquals = (_htmlLazy == null);
		if (_tripleEquals) {
			this.setHtmlLazy(SoalModelUtils.getHtml(this));
		}
		return this.getHtmlLazy();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoalModelPackage.DOCUMENTATION_TAG__KIND:
			return getKind();
		case SoalModelPackage.DOCUMENTATION_TAG__NAME:
			return getName();
		case SoalModelPackage.DOCUMENTATION_TAG__LINES:
			return getLines();
		case SoalModelPackage.DOCUMENTATION_TAG__HTML_LAZY:
			return getHtmlLazy();
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
		case SoalModelPackage.DOCUMENTATION_TAG__KIND:
			setKind((DocumentationTagKind) newValue);
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__NAME:
			setName((String) newValue);
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__LINES:
			getLines().clear();
			getLines().addAll((Collection<? extends String>) newValue);
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__HTML_LAZY:
			setHtmlLazy((String) newValue);
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
		case SoalModelPackage.DOCUMENTATION_TAG__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__LINES:
			getLines().clear();
			return;
		case SoalModelPackage.DOCUMENTATION_TAG__HTML_LAZY:
			setHtmlLazy(HTML_LAZY_EDEFAULT);
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
		case SoalModelPackage.DOCUMENTATION_TAG__KIND:
			return kind != KIND_EDEFAULT;
		case SoalModelPackage.DOCUMENTATION_TAG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoalModelPackage.DOCUMENTATION_TAG__LINES:
			return lines != null && !lines.isEmpty();
		case SoalModelPackage.DOCUMENTATION_TAG__HTML_LAZY:
			return HTML_LAZY_EDEFAULT == null ? htmlLazy != null : !HTML_LAZY_EDEFAULT.equals(htmlLazy);
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
		case SoalModelPackage.DOCUMENTATION_TAG___GET_HTML:
			return getHtml();
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
		result.append(", name: ");
		result.append(name);
		result.append(", lines: ");
		result.append(lines);
		result.append(", htmlLazy: ");
		result.append(htmlLazy);
		result.append(')');
		return result.toString();
	}

} // DocumentationTagImpl
