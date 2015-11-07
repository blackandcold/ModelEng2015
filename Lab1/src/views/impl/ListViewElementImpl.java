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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.Link;
import views.ListEntrySet;
import views.ListViewElement;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ListViewElementImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link views.impl.ListViewElementImpl#getEntrySet <em>Entry Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListViewElementImpl extends ViewAssociationElementImpl implements ListViewElement {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getEntrySet() <em>Entry Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySet()
	 * @generated
	 * @ordered
	 */
	protected ListEntrySet entrySet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.LIST_VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ViewsPackage.LIST_VIEW_ELEMENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntrySet getEntrySet() {
		if (entrySet != null && entrySet.eIsProxy()) {
			InternalEObject oldEntrySet = (InternalEObject)entrySet;
			entrySet = (ListEntrySet)eResolveProxy(oldEntrySet);
			if (entrySet != oldEntrySet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET, oldEntrySet, entrySet));
			}
		}
		return entrySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntrySet basicGetEntrySet() {
		return entrySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrySet(ListEntrySet newEntrySet) {
		ListEntrySet oldEntrySet = entrySet;
		entrySet = newEntrySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET, oldEntrySet, entrySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.LIST_VIEW_ELEMENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.LIST_VIEW_ELEMENT__LINKS:
				return getLinks();
			case ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET:
				if (resolve) return getEntrySet();
				return basicGetEntrySet();
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
			case ViewsPackage.LIST_VIEW_ELEMENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET:
				setEntrySet((ListEntrySet)newValue);
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
			case ViewsPackage.LIST_VIEW_ELEMENT__LINKS:
				getLinks().clear();
				return;
			case ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET:
				setEntrySet((ListEntrySet)null);
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
			case ViewsPackage.LIST_VIEW_ELEMENT__LINKS:
				return links != null && !links.isEmpty();
			case ViewsPackage.LIST_VIEW_ELEMENT__ENTRY_SET:
				return entrySet != null;
		}
		return super.eIsSet(featureID);
	}

} //ListViewElementImpl
