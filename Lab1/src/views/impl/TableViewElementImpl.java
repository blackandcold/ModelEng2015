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

import views.ColumnSet;
import views.Link;
import views.TableViewElement;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.TableViewElementImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link views.impl.TableViewElementImpl#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableViewElementImpl extends ViewAssociationElementImpl implements TableViewElement {
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
	 * The cached value of the '{@link #getColumnSet() <em>Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSet()
	 * @generated
	 * @ordered
	 */
	protected ColumnSet columnSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TABLE_VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ViewsPackage.TABLE_VIEW_ELEMENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSet getColumnSet() {
		if (columnSet != null && columnSet.eIsProxy()) {
			InternalEObject oldColumnSet = (InternalEObject)columnSet;
			columnSet = (ColumnSet)eResolveProxy(oldColumnSet);
			if (columnSet != oldColumnSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET, oldColumnSet, columnSet));
			}
		}
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSet basicGetColumnSet() {
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSet(ColumnSet newColumnSet) {
		ColumnSet oldColumnSet = columnSet;
		columnSet = newColumnSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET, oldColumnSet, columnSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.TABLE_VIEW_ELEMENT__LINKS:
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
			case ViewsPackage.TABLE_VIEW_ELEMENT__LINKS:
				return getLinks();
			case ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET:
				if (resolve) return getColumnSet();
				return basicGetColumnSet();
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
			case ViewsPackage.TABLE_VIEW_ELEMENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET:
				setColumnSet((ColumnSet)newValue);
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
			case ViewsPackage.TABLE_VIEW_ELEMENT__LINKS:
				getLinks().clear();
				return;
			case ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET:
				setColumnSet((ColumnSet)null);
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
			case ViewsPackage.TABLE_VIEW_ELEMENT__LINKS:
				return links != null && !links.isEmpty();
			case ViewsPackage.TABLE_VIEW_ELEMENT__COLUMN_SET:
				return columnSet != null;
		}
		return super.eIsSet(featureID);
	}

} //TableViewElementImpl
