/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.Association;
import at.ac.tuwien.big.views.AssociationElement;
import at.ac.tuwien.big.views.Condition;
import at.ac.tuwien.big.views.ConditionalElement;
import at.ac.tuwien.big.views.ViewElement;
import at.ac.tuwien.big.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationElementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationElementImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.impl.AssociationElementImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationElementImpl extends LinkableElementImpl implements AssociationElement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected String elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ASSOCIATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION_ELEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION_ELEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.ASSOCIATION_ELEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION_ELEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION_ELEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(String newElementID) {
		String oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION:
				return basicSetCondition(null, msgs);
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
			case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION:
				return getCondition();
			case ViewsPackage.ASSOCIATION_ELEMENT__LABEL:
				return getLabel();
			case ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID:
				return getElementID();
			case ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
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
			case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION:
				setCondition((Condition)newValue);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID:
				setElementID((String)newValue);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION:
				setAssociation((Association)newValue);
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
			case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION:
				setCondition((Condition)null);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION:
				setAssociation((Association)null);
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
			case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION:
				return condition != null;
			case ViewsPackage.ASSOCIATION_ELEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case ViewsPackage.ASSOCIATION_ELEMENT__ASSOCIATION:
				return association != null;
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
		if (baseClass == ConditionalElement.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.ASSOCIATION_ELEMENT__CONDITION: return ViewsPackage.CONDITIONAL_ELEMENT__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == ViewElement.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.ASSOCIATION_ELEMENT__LABEL: return ViewsPackage.VIEW_ELEMENT__LABEL;
				case ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID: return ViewsPackage.VIEW_ELEMENT__ELEMENT_ID;
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
		if (baseClass == ConditionalElement.class) {
			switch (baseFeatureID) {
				case ViewsPackage.CONDITIONAL_ELEMENT__CONDITION: return ViewsPackage.ASSOCIATION_ELEMENT__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == ViewElement.class) {
			switch (baseFeatureID) {
				case ViewsPackage.VIEW_ELEMENT__LABEL: return ViewsPackage.ASSOCIATION_ELEMENT__LABEL;
				case ViewsPackage.VIEW_ELEMENT__ELEMENT_ID: return ViewsPackage.ASSOCIATION_ELEMENT__ELEMENT_ID;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", elementID: ");
		result.append(elementID);
		result.append(')');
		return result.toString();
	}

} //AssociationElementImpl
