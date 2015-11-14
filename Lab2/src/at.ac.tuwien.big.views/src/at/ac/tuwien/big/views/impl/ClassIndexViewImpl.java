/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.ClassIndexView;
import at.ac.tuwien.big.views.NamedElement;
import at.ac.tuwien.big.views.View;
import at.ac.tuwien.big.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Index View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl#isStartView <em>Start View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassIndexViewImpl extends LinkableElementImpl implements ClassIndexView {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected at.ac.tuwien.big.views.Class class_;

	/**
	 * The default value of the '{@link #isStartView() <em>Start View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartView() <em>Start View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartView()
	 * @generated
	 * @ordered
	 */
	protected boolean startView = START_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassIndexViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS_INDEX_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_INDEX_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_INDEX_VIEW__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.ac.tuwien.big.views.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (at.ac.tuwien.big.views.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS_INDEX_VIEW__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.ac.tuwien.big.views.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(at.ac.tuwien.big.views.Class newClass) {
		at.ac.tuwien.big.views.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_INDEX_VIEW__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartView() {
		return startView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartView(boolean newStartView) {
		boolean oldStartView = startView;
		startView = newStartView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_INDEX_VIEW__START_VIEW, oldStartView, startView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CLASS_INDEX_VIEW__NAME:
				return getName();
			case ViewsPackage.CLASS_INDEX_VIEW__HEADER:
				return getHeader();
			case ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION:
				return getDescription();
			case ViewsPackage.CLASS_INDEX_VIEW__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case ViewsPackage.CLASS_INDEX_VIEW__START_VIEW:
				return isStartView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.CLASS_INDEX_VIEW__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__HEADER:
				setHeader((String)newValue);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__CLASS:
				setClass((at.ac.tuwien.big.views.Class)newValue);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__START_VIEW:
				setStartView((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.CLASS_INDEX_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__CLASS:
				setClass((at.ac.tuwien.big.views.Class)null);
				return;
			case ViewsPackage.CLASS_INDEX_VIEW__START_VIEW:
				setStartView(START_VIEW_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.CLASS_INDEX_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.CLASS_INDEX_VIEW__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ViewsPackage.CLASS_INDEX_VIEW__CLASS:
				return class_ != null;
			case ViewsPackage.CLASS_INDEX_VIEW__START_VIEW:
				return startView != START_VIEW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.CLASS_INDEX_VIEW__NAME: return ViewsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == View.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.CLASS_INDEX_VIEW__HEADER: return ViewsPackage.VIEW__HEADER;
				case ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION: return ViewsPackage.VIEW__DESCRIPTION;
				case ViewsPackage.CLASS_INDEX_VIEW__CLASS: return ViewsPackage.VIEW__CLASS;
				case ViewsPackage.CLASS_INDEX_VIEW__START_VIEW: return ViewsPackage.VIEW__START_VIEW;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ViewsPackage.NAMED_ELEMENT__NAME: return ViewsPackage.CLASS_INDEX_VIEW__NAME;
				default: return -1;
			}
		}
		if (baseClass == View.class) {
			switch (baseFeatureID) {
				case ViewsPackage.VIEW__HEADER: return ViewsPackage.CLASS_INDEX_VIEW__HEADER;
				case ViewsPackage.VIEW__DESCRIPTION: return ViewsPackage.CLASS_INDEX_VIEW__DESCRIPTION;
				case ViewsPackage.VIEW__CLASS: return ViewsPackage.CLASS_INDEX_VIEW__CLASS;
				case ViewsPackage.VIEW__START_VIEW: return ViewsPackage.CLASS_INDEX_VIEW__START_VIEW;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", header: ");
		result.append(header);
		result.append(", description: ");
		result.append(description);
		result.append(", startView: ");
		result.append(startView);
		result.append(')');
		return result.toString();
	}

} //ClassIndexViewImpl
