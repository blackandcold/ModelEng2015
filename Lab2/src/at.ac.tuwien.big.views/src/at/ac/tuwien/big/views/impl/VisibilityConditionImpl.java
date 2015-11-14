/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.ViewsPackage;
import at.ac.tuwien.big.views.VisibilityCondition;
import at.ac.tuwien.big.views.VisibilityConditionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.VisibilityConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.VisibilityConditionImpl#getConditionID <em>Condition ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VisibilityConditionImpl extends ConditionImpl implements VisibilityCondition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityConditionType TYPE_EDEFAULT = VisibilityConditionType.HIDE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VisibilityConditionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected String conditionID = CONDITION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VISIBILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityConditionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VisibilityConditionType newType) {
		VisibilityConditionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VISIBILITY_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionID() {
		return conditionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionID(String newConditionID) {
		String oldConditionID = conditionID;
		conditionID = newConditionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID, oldConditionID, conditionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.VISIBILITY_CONDITION__TYPE:
				return getType();
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				return getConditionID();
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
			case ViewsPackage.VISIBILITY_CONDITION__TYPE:
				setType((VisibilityConditionType)newValue);
				return;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				setConditionID((String)newValue);
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
			case ViewsPackage.VISIBILITY_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				setConditionID(CONDITION_ID_EDEFAULT);
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
			case ViewsPackage.VISIBILITY_CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
			case ViewsPackage.VISIBILITY_CONDITION__CONDITION_ID:
				return CONDITION_ID_EDEFAULT == null ? conditionID != null : !CONDITION_ID_EDEFAULT.equals(conditionID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", conditionID: ");
		result.append(conditionID);
		result.append(')');
		return result.toString();
	}

} //VisibilityConditionImpl
