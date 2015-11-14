/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.ComparisonCondition;
import at.ac.tuwien.big.views.ComparisonConditionType;
import at.ac.tuwien.big.views.PropertyElement;
import at.ac.tuwien.big.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.ComparisonConditionImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ComparisonConditionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.ComparisonConditionImpl#getComparisonType <em>Comparison Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonConditionImpl extends VisibilityConditionImpl implements ComparisonCondition {
	/**
	 * The default value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected String comparisonValue = COMPARISON_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyElement property;

	/**
	 * The default value of the '{@link #getComparisonType() <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonType()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonConditionType COMPARISON_TYPE_EDEFAULT = ComparisonConditionType.EQUAL;

	/**
	 * The cached value of the '{@link #getComparisonType() <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonType()
	 * @generated
	 * @ordered
	 */
	protected ComparisonConditionType comparisonType = COMPARISON_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.COMPARISON_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(String newComparisonValue) {
		String oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITION__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyElement getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (PropertyElement)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.COMPARISON_CONDITION__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyElement basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyElement newProperty) {
		PropertyElement oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITION__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonConditionType getComparisonType() {
		return comparisonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonType(ComparisonConditionType newComparisonType) {
		ComparisonConditionType oldComparisonType = comparisonType;
		comparisonType = newComparisonType == null ? COMPARISON_TYPE_EDEFAULT : newComparisonType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPARISON_CONDITION__COMPARISON_TYPE, oldComparisonType, comparisonType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_VALUE:
				return getComparisonValue();
			case ViewsPackage.COMPARISON_CONDITION__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_TYPE:
				return getComparisonType();
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
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_VALUE:
				setComparisonValue((String)newValue);
				return;
			case ViewsPackage.COMPARISON_CONDITION__PROPERTY:
				setProperty((PropertyElement)newValue);
				return;
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_TYPE:
				setComparisonType((ComparisonConditionType)newValue);
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
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case ViewsPackage.COMPARISON_CONDITION__PROPERTY:
				setProperty((PropertyElement)null);
				return;
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_TYPE:
				setComparisonType(COMPARISON_TYPE_EDEFAULT);
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
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case ViewsPackage.COMPARISON_CONDITION__PROPERTY:
				return property != null;
			case ViewsPackage.COMPARISON_CONDITION__COMPARISON_TYPE:
				return comparisonType != COMPARISON_TYPE_EDEFAULT;
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
		result.append(" (comparisonValue: ");
		result.append(comparisonValue);
		result.append(", comparisonType: ");
		result.append(comparisonType);
		result.append(')');
		return result.toString();
	}

} //ComparisonConditionImpl
