/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.View;
import at.ac.tuwien.big.views.ViewGroup;
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
 * An implementation of the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.ViewGroupImpl#getViews <em>Views</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ViewGroupImpl#isWelcomeViewGroup <em>Welcome View Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewGroupImpl extends NamedElementImpl implements ViewGroup {
	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The default value of the '{@link #isWelcomeViewGroup() <em>Welcome View Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWelcomeViewGroup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WELCOME_VIEW_GROUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWelcomeViewGroup() <em>Welcome View Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWelcomeViewGroup()
	 * @generated
	 * @ordered
	 */
	protected boolean welcomeViewGroup = WELCOME_VIEW_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, ViewsPackage.VIEW_GROUP__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWelcomeViewGroup() {
		return welcomeViewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeViewGroup(boolean newWelcomeViewGroup) {
		boolean oldWelcomeViewGroup = welcomeViewGroup;
		welcomeViewGroup = newWelcomeViewGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_GROUP__WELCOME_VIEW_GROUP, oldWelcomeViewGroup, welcomeViewGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.VIEW_GROUP__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.VIEW_GROUP__VIEWS:
				return getViews();
			case ViewsPackage.VIEW_GROUP__WELCOME_VIEW_GROUP:
				return isWelcomeViewGroup();
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
			case ViewsPackage.VIEW_GROUP__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case ViewsPackage.VIEW_GROUP__WELCOME_VIEW_GROUP:
				setWelcomeViewGroup((Boolean)newValue);
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
			case ViewsPackage.VIEW_GROUP__VIEWS:
				getViews().clear();
				return;
			case ViewsPackage.VIEW_GROUP__WELCOME_VIEW_GROUP:
				setWelcomeViewGroup(WELCOME_VIEW_GROUP_EDEFAULT);
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
			case ViewsPackage.VIEW_GROUP__VIEWS:
				return views != null && !views.isEmpty();
			case ViewsPackage.VIEW_GROUP__WELCOME_VIEW_GROUP:
				return welcomeViewGroup != WELCOME_VIEW_GROUP_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (welcomeViewGroup: ");
		result.append(welcomeViewGroup);
		result.append(')');
		return result.toString();
	}

} //ViewGroupImpl
