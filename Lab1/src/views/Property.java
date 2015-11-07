/**
 */
package views;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Property#getName <em>Name</em>}</li>
 *   <li>{@link views.Property#getType <em>Type</em>}</li>
 *   <li>{@link views.Property#getMultiplicityLowerBound <em>Multiplicity Lower Bound</em>}</li>
 *   <li>{@link views.Property#getMultiplicityUpperBound <em>Multiplicity Upper Bound</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see views.ViewsPackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see views.ViewsPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link views.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Lower Bound</em>' attribute.
	 * @see #setMultiplicityLowerBound(BigInteger)
	 * @see views.ViewsPackage#getProperty_MultiplicityLowerBound()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMultiplicityLowerBound();

	/**
	 * Sets the value of the '{@link views.Property#getMultiplicityLowerBound <em>Multiplicity Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Lower Bound</em>' attribute.
	 * @see #getMultiplicityLowerBound()
	 * @generated
	 */
	void setMultiplicityLowerBound(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Upper Bound</em>' attribute.
	 * @see #setMultiplicityUpperBound(BigInteger)
	 * @see views.ViewsPackage#getProperty_MultiplicityUpperBound()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMultiplicityUpperBound();

	/**
	 * Sets the value of the '{@link views.Property#getMultiplicityUpperBound <em>Multiplicity Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Upper Bound</em>' attribute.
	 * @see #getMultiplicityUpperBound()
	 * @generated
	 */
	void setMultiplicityUpperBound(BigInteger value);

} // Property
