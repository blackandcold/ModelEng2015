/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.VisibilityCondition#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.VisibilityCondition#getConditionID <em>Condition ID</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getVisibilityCondition()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConditionIdIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConditionIdIsUnique='\n\t\t\tVisibilityCondition.allInstances() -> select(c | c.conditionID = self.conditionID) -> excluding(self) -> isEmpty()'"
 * @generated
 */
public interface VisibilityCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.views.VisibilityConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.views.VisibilityConditionType
	 * @see #setType(VisibilityConditionType)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getVisibilityCondition_Type()
	 * @model required="true"
	 * @generated
	 */
	VisibilityConditionType getType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.VisibilityCondition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.views.VisibilityConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(VisibilityConditionType value);

	/**
	 * Returns the value of the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition ID</em>' attribute.
	 * @see #setConditionID(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getVisibilityCondition_ConditionID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getConditionID();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.VisibilityCondition#getConditionID <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition ID</em>' attribute.
	 * @see #getConditionID()
	 * @generated
	 */
	void setConditionID(String value);

} // VisibilityCondition
