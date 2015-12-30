/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.ClassOperationView;
import at.ac.tuwien.big.views.ElementGroup;
import at.ac.tuwien.big.views.Layout;
import at.ac.tuwien.big.views.LayoutableElement;
import at.ac.tuwien.big.views.ViewsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Operation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassOperationViewImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ClassOperationViewImpl#getElementGroups <em>Element Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassOperationViewImpl extends ViewImpl implements ClassOperationView {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getElementGroups() <em>Element Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementGroup> elementGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOperationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS_OPERATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementGroup> getElementGroups() {
		if (elementGroups == null) {
			elementGroups = new EObjectContainmentEList<ElementGroup>(ElementGroup.class, this, ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS);
		}
		return elementGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				return basicSetLayout(null, msgs);
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS:
				return ((InternalEList<?>)getElementGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				return getLayout();
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS:
				return getElementGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS:
				getElementGroups().clear();
				getElementGroups().addAll((Collection<? extends ElementGroup>)newValue);
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
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				setLayout((Layout)null);
				return;
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS:
				getElementGroups().clear();
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
			case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT:
				return layout != null;
			case ViewsPackage.CLASS_OPERATION_VIEW__ELEMENT_GROUPS:
				return elementGroups != null && !elementGroups.isEmpty();
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
		if (baseClass == LayoutableElement.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT: return ViewsPackage.LAYOUTABLE_ELEMENT__LAYOUT;
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
		if (baseClass == LayoutableElement.class) {
			switch (baseFeatureID) {
				case ViewsPackage.LAYOUTABLE_ELEMENT__LAYOUT: return ViewsPackage.CLASS_OPERATION_VIEW__LAYOUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassOperationViewImpl
