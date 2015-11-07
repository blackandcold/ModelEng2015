/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.CompositeCondition#getOperatorType <em>Operator Type</em>}</li>
 *   <li>{@link views.CompositeCondition#getCond1 <em>Cond1</em>}</li>
 *   <li>{@link views.CompositeCondition#getCond2 <em>Cond2</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getCompositeCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='diffConditions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot diffConditions='self.cond1 <> self.cond2'"
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link views.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Type</em>' attribute.
	 * @see views.Operator
	 * @see #setOperatorType(Operator)
	 * @see views.ViewsPackage#getCompositeCondition_OperatorType()
	 * @model
	 * @generated
	 */
	Operator getOperatorType();

	/**
	 * Sets the value of the '{@link views.CompositeCondition#getOperatorType <em>Operator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Type</em>' attribute.
	 * @see views.Operator
	 * @see #getOperatorType()
	 * @generated
	 */
	void setOperatorType(Operator value);

	/**
	 * Returns the value of the '<em><b>Cond1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond1</em>' containment reference.
	 * @see #setCond1(Condition)
	 * @see views.ViewsPackage#getCompositeCondition_Cond1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCond1();

	/**
	 * Sets the value of the '{@link views.CompositeCondition#getCond1 <em>Cond1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond1</em>' containment reference.
	 * @see #getCond1()
	 * @generated
	 */
	void setCond1(Condition value);

	/**
	 * Returns the value of the '<em><b>Cond2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond2</em>' containment reference.
	 * @see #setCond2(Condition)
	 * @see views.ViewsPackage#getCompositeCondition_Cond2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCond2();

	/**
	 * Sets the value of the '{@link views.CompositeCondition#getCond2 <em>Cond2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond2</em>' containment reference.
	 * @see #getCond2()
	 * @generated
	 */
	void setCond2(Condition value);

} // CompositeCondition
