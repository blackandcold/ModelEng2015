/**
 */
package views.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import views.Association;
import views.Property;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getIsId <em>Is Id</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link views.impl.ClassImpl#getAssociationsNavigable <em>Associations Navigable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements views.Class {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected views.Class superclass;

	/**
	 * The cached setting delegate for the '{@link #getSubclass() <em>Subclass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SUBCLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ViewsPackage.Literals.CLASS__SUBCLASS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getIsId() <em>Is Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsId()
	 * @generated
	 * @ordered
	 */
	protected Property isId;

	/**
	 * The cached setting delegate for the '{@link #getAssociations() <em>Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ViewsPackage.Literals.CLASS__ASSOCIATIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociationsNavigable() <em>Associations Navigable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationsNavigable()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATIONS_NAVIGABLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ViewsPackage.Literals.CLASS__ASSOCIATIONS_NAVIGABLE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (views.Class)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(views.Class newSuperclass) {
		views.Class oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<views.Class> getSubclass() {
		return (EList<views.Class>)SUBCLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ViewsPackage.CLASS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getIsId() {
		if (isId != null && isId.eIsProxy()) {
			InternalEObject oldIsId = (InternalEObject)isId;
			isId = (Property)eResolveProxy(oldIsId);
			if (isId != oldIsId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CLASS__IS_ID, oldIsId, isId));
			}
		}
		return isId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetIsId() {
		return isId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsId(Property newIsId) {
		Property oldIsId = isId;
		isId = newIsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS__IS_ID, oldIsId, isId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAssociations() {
		return (EList<Association>)ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAssociationsNavigable() {
		return (EList<Association>)ASSOCIATIONS_NAVIGABLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.CLASS__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case ViewsPackage.CLASS__SUBCLASS:
				return getSubclass();
			case ViewsPackage.CLASS__PROPERTIES:
				return getProperties();
			case ViewsPackage.CLASS__IS_ID:
				if (resolve) return getIsId();
				return basicGetIsId();
			case ViewsPackage.CLASS__ASSOCIATIONS:
				return getAssociations();
			case ViewsPackage.CLASS__ASSOCIATIONS_NAVIGABLE:
				return getAssociationsNavigable();
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
			case ViewsPackage.CLASS__SUPERCLASS:
				setSuperclass((views.Class)newValue);
				return;
			case ViewsPackage.CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ViewsPackage.CLASS__IS_ID:
				setIsId((Property)newValue);
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
			case ViewsPackage.CLASS__SUPERCLASS:
				setSuperclass((views.Class)null);
				return;
			case ViewsPackage.CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case ViewsPackage.CLASS__IS_ID:
				setIsId((Property)null);
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
			case ViewsPackage.CLASS__SUPERCLASS:
				return superclass != null;
			case ViewsPackage.CLASS__SUBCLASS:
				return SUBCLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ViewsPackage.CLASS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ViewsPackage.CLASS__IS_ID:
				return isId != null;
			case ViewsPackage.CLASS__ASSOCIATIONS:
				return ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ViewsPackage.CLASS__ASSOCIATIONS_NAVIGABLE:
				return ASSOCIATIONS_NAVIGABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
