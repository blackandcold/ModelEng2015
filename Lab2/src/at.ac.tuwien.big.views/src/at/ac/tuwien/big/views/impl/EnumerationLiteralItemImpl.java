/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.EnumerationLiteral;
import at.ac.tuwien.big.views.EnumerationLiteralItem;
import at.ac.tuwien.big.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.impl.EnumerationLiteralItemImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralItemImpl extends SelectionItemImpl implements EnumerationLiteralItem {
	/**
	 * The cached value of the '{@link #getEnumerationLiteral() <em>Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral enumerationLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ENUMERATION_LITERAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getEnumerationLiteral() {
		if (enumerationLiteral != null && enumerationLiteral.eIsProxy()) {
			InternalEObject oldEnumerationLiteral = (InternalEObject)enumerationLiteral;
			enumerationLiteral = (EnumerationLiteral)eResolveProxy(oldEnumerationLiteral);
			if (enumerationLiteral != oldEnumerationLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL, oldEnumerationLiteral, enumerationLiteral));
			}
		}
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetEnumerationLiteral() {
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationLiteral(EnumerationLiteral newEnumerationLiteral) {
		EnumerationLiteral oldEnumerationLiteral = enumerationLiteral;
		enumerationLiteral = newEnumerationLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL, oldEnumerationLiteral, enumerationLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL:
				if (resolve) return getEnumerationLiteral();
				return basicGetEnumerationLiteral();
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
			case ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL:
				setEnumerationLiteral((EnumerationLiteral)newValue);
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
			case ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL:
				setEnumerationLiteral((EnumerationLiteral)null);
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
			case ViewsPackage.ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL:
				return enumerationLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationLiteralItemImpl
