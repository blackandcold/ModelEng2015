/**
 */
package views.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.Property;
import views.Type;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link views.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link views.impl.PropertyImpl#getMultiplicityLowerBound <em>Multiplicity Lower Bound</em>}</li>
 *   <li>{@link views.impl.PropertyImpl#getMultiplicityUpperBound <em>Multiplicity Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getMultiplicityLowerBound() <em>Multiplicity Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MULTIPLICITY_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityLowerBound() <em>Multiplicity Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityLowerBound()
	 * @generated
	 * @ordered
	 */
	protected BigInteger multiplicityLowerBound = MULTIPLICITY_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityUpperBound() <em>Multiplicity Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MULTIPLICITY_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityUpperBound() <em>Multiplicity Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityUpperBound()
	 * @generated
	 * @ordered
	 */
	protected BigInteger multiplicityUpperBound = MULTIPLICITY_UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMultiplicityLowerBound() {
		return multiplicityLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityLowerBound(BigInteger newMultiplicityLowerBound) {
		BigInteger oldMultiplicityLowerBound = multiplicityLowerBound;
		multiplicityLowerBound = newMultiplicityLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PROPERTY__MULTIPLICITY_LOWER_BOUND, oldMultiplicityLowerBound, multiplicityLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMultiplicityUpperBound() {
		return multiplicityUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityUpperBound(BigInteger newMultiplicityUpperBound) {
		BigInteger oldMultiplicityUpperBound = multiplicityUpperBound;
		multiplicityUpperBound = newMultiplicityUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PROPERTY__MULTIPLICITY_UPPER_BOUND, oldMultiplicityUpperBound, multiplicityUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PROPERTY__NAME:
				return getName();
			case ViewsPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ViewsPackage.PROPERTY__MULTIPLICITY_LOWER_BOUND:
				return getMultiplicityLowerBound();
			case ViewsPackage.PROPERTY__MULTIPLICITY_UPPER_BOUND:
				return getMultiplicityUpperBound();
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
			case ViewsPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.PROPERTY__TYPE:
				setType((Type)newValue);
				return;
			case ViewsPackage.PROPERTY__MULTIPLICITY_LOWER_BOUND:
				setMultiplicityLowerBound((BigInteger)newValue);
				return;
			case ViewsPackage.PROPERTY__MULTIPLICITY_UPPER_BOUND:
				setMultiplicityUpperBound((BigInteger)newValue);
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
			case ViewsPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.PROPERTY__TYPE:
				setType((Type)null);
				return;
			case ViewsPackage.PROPERTY__MULTIPLICITY_LOWER_BOUND:
				setMultiplicityLowerBound(MULTIPLICITY_LOWER_BOUND_EDEFAULT);
				return;
			case ViewsPackage.PROPERTY__MULTIPLICITY_UPPER_BOUND:
				setMultiplicityUpperBound(MULTIPLICITY_UPPER_BOUND_EDEFAULT);
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
			case ViewsPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.PROPERTY__TYPE:
				return type != null;
			case ViewsPackage.PROPERTY__MULTIPLICITY_LOWER_BOUND:
				return MULTIPLICITY_LOWER_BOUND_EDEFAULT == null ? multiplicityLowerBound != null : !MULTIPLICITY_LOWER_BOUND_EDEFAULT.equals(multiplicityLowerBound);
			case ViewsPackage.PROPERTY__MULTIPLICITY_UPPER_BOUND:
				return MULTIPLICITY_UPPER_BOUND_EDEFAULT == null ? multiplicityUpperBound != null : !MULTIPLICITY_UPPER_BOUND_EDEFAULT.equals(multiplicityUpperBound);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", multiplicityLowerBound: ");
		result.append(multiplicityLowerBound);
		result.append(", multiplicityUpperBound: ");
		result.append(multiplicityUpperBound);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
