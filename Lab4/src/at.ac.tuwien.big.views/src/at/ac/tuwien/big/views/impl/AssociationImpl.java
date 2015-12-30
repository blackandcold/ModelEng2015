/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.Association;
import at.ac.tuwien.big.views.NamedElement;
import at.ac.tuwien.big.views.Property;
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
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationImpl#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationImpl#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationImpl#getNavigableEnd <em>Navigable End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends DomainModelElementImpl implements Association {
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
	 * The default value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposition = IS_COMPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> associationEnds;

	/**
	 * The cached value of the '{@link #getNavigableEnd() <em>Navigable End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableEnd()
	 * @generated
	 * @ordered
	 */
	protected Property navigableEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposition() {
		return isComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposition(boolean newIsComposition) {
		boolean oldIsComposition = isComposition;
		isComposition = newIsComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__IS_COMPOSITION, oldIsComposition, isComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectContainmentEList<Property>(Property.class, this, ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS);
		}
		return associationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableEnd() {
		if (navigableEnd != null && navigableEnd.eIsProxy()) {
			InternalEObject oldNavigableEnd = (InternalEObject)navigableEnd;
			navigableEnd = (Property)eResolveProxy(oldNavigableEnd);
			if (navigableEnd != oldNavigableEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ASSOCIATION__NAVIGABLE_END, oldNavigableEnd, navigableEnd));
			}
		}
		return navigableEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetNavigableEnd() {
		return navigableEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigableEnd(Property newNavigableEnd) {
		Property oldNavigableEnd = navigableEnd;
		navigableEnd = newNavigableEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION__NAVIGABLE_END, oldNavigableEnd, navigableEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.ASSOCIATION__NAME:
				return getName();
			case ViewsPackage.ASSOCIATION__IS_COMPOSITION:
				return isIsComposition();
			case ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS:
				return getAssociationEnds();
			case ViewsPackage.ASSOCIATION__NAVIGABLE_END:
				if (resolve) return getNavigableEnd();
				return basicGetNavigableEnd();
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
			case ViewsPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.ASSOCIATION__IS_COMPOSITION:
				setIsComposition((Boolean)newValue);
				return;
			case ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends Property>)newValue);
				return;
			case ViewsPackage.ASSOCIATION__NAVIGABLE_END:
				setNavigableEnd((Property)newValue);
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
			case ViewsPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.ASSOCIATION__IS_COMPOSITION:
				setIsComposition(IS_COMPOSITION_EDEFAULT);
				return;
			case ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				return;
			case ViewsPackage.ASSOCIATION__NAVIGABLE_END:
				setNavigableEnd((Property)null);
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
			case ViewsPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.ASSOCIATION__IS_COMPOSITION:
				return isComposition != IS_COMPOSITION_EDEFAULT;
			case ViewsPackage.ASSOCIATION__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
			case ViewsPackage.ASSOCIATION__NAVIGABLE_END:
				return navigableEnd != null;
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
				case ViewsPackage.ASSOCIATION__NAME: return ViewsPackage.NAMED_ELEMENT__NAME;
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
				case ViewsPackage.NAMED_ELEMENT__NAME: return ViewsPackage.ASSOCIATION__NAME;
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
		result.append(", isComposition: ");
		result.append(isComposition);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
