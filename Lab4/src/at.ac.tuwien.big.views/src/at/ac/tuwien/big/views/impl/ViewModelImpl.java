/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.ViewGroup;
import at.ac.tuwien.big.views.ViewModel;
import at.ac.tuwien.big.views.ViewsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.ViewModelImpl#getViewGroups <em>View Groups</em>}</li>
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
		}
		return super.eIsSet(featureID);
	}

} //ViewModelImpl
