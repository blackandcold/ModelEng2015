/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.Selection;
import at.ac.tuwien.big.views.SelectionItem;
import at.ac.tuwien.big.views.ViewsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.SelectionImpl#getSelectionItems <em>Selection Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends PropertyElementImpl implements Selection {
	/**
	 * The cached value of the '{@link #getSelectionItems() <em>Selection Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionItems()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionItem> selectionItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionItem> getSelectionItems() {
		if (selectionItems == null) {
			selectionItems = new EObjectContainmentEList<SelectionItem>(SelectionItem.class, this, ViewsPackage.SELECTION__SELECTION_ITEMS);
		}
		return selectionItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.SELECTION__SELECTION_ITEMS:
				return ((InternalEList<?>)getSelectionItems()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.SELECTION__SELECTION_ITEMS:
				return getSelectionItems();
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
			case ViewsPackage.SELECTION__SELECTION_ITEMS:
				getSelectionItems().clear();
				getSelectionItems().addAll((Collection<? extends SelectionItem>)newValue);
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
			case ViewsPackage.SELECTION__SELECTION_ITEMS:
				getSelectionItems().clear();
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
			case ViewsPackage.SELECTION__SELECTION_ITEMS:
				return selectionItems != null && !selectionItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionImpl
