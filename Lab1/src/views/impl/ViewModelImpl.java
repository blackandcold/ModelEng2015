/**
 */
package views.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.ViewGroup;
import views.ViewModel;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ViewModelImpl#getViewGroups <em>View Groups</em>}</li>
 *   <li>{@link views.impl.ViewModelImpl#getWelcomeViewGroup <em>Welcome View Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewModelImpl extends MinimalEObjectImpl.Container implements ViewModel {
	/**
	 * The cached value of the '{@link #getViewGroups() <em>View Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewGroup> viewGroups;

	/**
	 * The cached value of the '{@link #getWelcomeViewGroup() <em>Welcome View Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeViewGroup()
	 * @generated
	 * @ordered
	 */
	protected ViewGroup welcomeViewGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewGroup> getViewGroups() {
		if (viewGroups == null) {
			viewGroups = new EObjectContainmentEList<ViewGroup>(ViewGroup.class, this, ViewsPackage.VIEW_MODEL__VIEW_GROUPS);
		}
		return viewGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroup getWelcomeViewGroup() {
		if (welcomeViewGroup != null && welcomeViewGroup.eIsProxy()) {
			InternalEObject oldWelcomeViewGroup = (InternalEObject)welcomeViewGroup;
			welcomeViewGroup = (ViewGroup)eResolveProxy(oldWelcomeViewGroup);
			if (welcomeViewGroup != oldWelcomeViewGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP, oldWelcomeViewGroup, welcomeViewGroup));
			}
		}
		return welcomeViewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroup basicGetWelcomeViewGroup() {
		return welcomeViewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeViewGroup(ViewGroup newWelcomeViewGroup) {
		ViewGroup oldWelcomeViewGroup = welcomeViewGroup;
		welcomeViewGroup = newWelcomeViewGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP, oldWelcomeViewGroup, welcomeViewGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.VIEW_MODEL__VIEW_GROUPS:
				return ((InternalEList<?>)getViewGroups()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.VIEW_MODEL__VIEW_GROUPS:
				return getViewGroups();
			case ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP:
				if (resolve) return getWelcomeViewGroup();
				return basicGetWelcomeViewGroup();
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
			case ViewsPackage.VIEW_MODEL__VIEW_GROUPS:
				getViewGroups().clear();
				getViewGroups().addAll((Collection<? extends ViewGroup>)newValue);
				return;
			case ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP:
				setWelcomeViewGroup((ViewGroup)newValue);
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
			case ViewsPackage.VIEW_MODEL__VIEW_GROUPS:
				getViewGroups().clear();
				return;
			case ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP:
				setWelcomeViewGroup((ViewGroup)null);
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
			case ViewsPackage.VIEW_MODEL__VIEW_GROUPS:
				return viewGroups != null && !viewGroups.isEmpty();
			case ViewsPackage.VIEW_MODEL__WELCOME_VIEW_GROUP:
				return welcomeViewGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewModelImpl
