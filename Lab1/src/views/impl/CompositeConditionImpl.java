/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import views.CompositeCondition;
import views.Condition;
import views.Operator;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.CompositeConditionImpl#getOperatorType <em>Operator Type</em>}</li>
 *   <li>{@link views.impl.CompositeConditionImpl#getCond1 <em>Cond1</em>}</li>
 *   <li>{@link views.impl.CompositeConditionImpl#getCond2 <em>Cond2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionImpl implements CompositeCondition {
	/**
	 * The default value of the '{@link #getOperatorType() <em>Operator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorType()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_TYPE_EDEFAULT = Operator.AND;

	/**
	 * The cached value of the '{@link #getOperatorType() <em>Operator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorType()
	 * @generated
	 * @ordered
	 */
	protected Operator operatorType = OPERATOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCond1() <em>Cond1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond1()
	 * @generated
	 * @ordered
	 */
	protected Condition cond1;

	/**
	 * The cached value of the '{@link #getCond2() <em>Cond2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond2()
	 * @generated
	 * @ordered
	 */
	protected Condition cond2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperatorType() {
		return operatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorType(Operator newOperatorType) {
		Operator oldOperatorType = operatorType;
		operatorType = newOperatorType == null ? OPERATOR_TYPE_EDEFAULT : newOperatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITION__OPERATOR_TYPE, oldOperatorType, operatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCond1() {
		return cond1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond1(Condition newCond1, NotificationChain msgs) {
		Condition oldCond1 = cond1;
		cond1 = newCond1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITION__COND1, oldCond1, newCond1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond1(Condition newCond1) {
		if (newCond1 != cond1) {
			NotificationChain msgs = null;
			if (cond1 != null)
				msgs = ((InternalEObject)cond1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.COMPOSITE_CONDITION__COND1, null, msgs);
			if (newCond1 != null)
				msgs = ((InternalEObject)newCond1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.COMPOSITE_CONDITION__COND1, null, msgs);
			msgs = basicSetCond1(newCond1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITION__COND1, newCond1, newCond1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCond2() {
		return cond2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond2(Condition newCond2, NotificationChain msgs) {
		Condition oldCond2 = cond2;
		cond2 = newCond2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITION__COND2, oldCond2, newCond2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond2(Condition newCond2) {
		if (newCond2 != cond2) {
			NotificationChain msgs = null;
			if (cond2 != null)
				msgs = ((InternalEObject)cond2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.COMPOSITE_CONDITION__COND2, null, msgs);
			if (newCond2 != null)
				msgs = ((InternalEObject)newCond2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.COMPOSITE_CONDITION__COND2, null, msgs);
			msgs = basicSetCond2(newCond2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.COMPOSITE_CONDITION__COND2, newCond2, newCond2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.COMPOSITE_CONDITION__COND1:
				return basicSetCond1(null, msgs);
			case ViewsPackage.COMPOSITE_CONDITION__COND2:
				return basicSetCond2(null, msgs);
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
			case ViewsPackage.COMPOSITE_CONDITION__OPERATOR_TYPE:
				return getOperatorType();
			case ViewsPackage.COMPOSITE_CONDITION__COND1:
				return getCond1();
			case ViewsPackage.COMPOSITE_CONDITION__COND2:
				return getCond2();
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
			case ViewsPackage.COMPOSITE_CONDITION__OPERATOR_TYPE:
				setOperatorType((Operator)newValue);
				return;
			case ViewsPackage.COMPOSITE_CONDITION__COND1:
				setCond1((Condition)newValue);
				return;
			case ViewsPackage.COMPOSITE_CONDITION__COND2:
				setCond2((Condition)newValue);
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
			case ViewsPackage.COMPOSITE_CONDITION__OPERATOR_TYPE:
				setOperatorType(OPERATOR_TYPE_EDEFAULT);
				return;
			case ViewsPackage.COMPOSITE_CONDITION__COND1:
				setCond1((Condition)null);
				return;
			case ViewsPackage.COMPOSITE_CONDITION__COND2:
				setCond2((Condition)null);
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
			case ViewsPackage.COMPOSITE_CONDITION__OPERATOR_TYPE:
				return operatorType != OPERATOR_TYPE_EDEFAULT;
			case ViewsPackage.COMPOSITE_CONDITION__COND1:
				return cond1 != null;
			case ViewsPackage.COMPOSITE_CONDITION__COND2:
				return cond2 != null;
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
		result.append(" (operatorType: ");
		result.append(operatorType);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
