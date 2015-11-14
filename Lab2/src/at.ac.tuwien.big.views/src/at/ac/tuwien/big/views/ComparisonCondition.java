/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.ComparisonCondition#getProperty <em>Property</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonType <em>Comparison Type</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getComparisonCondition()
 * @model
 * @generated
 */
public interface ComparisonCondition extends VisibilityCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' attribute.
	 * @see #setComparisonValue(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getComparisonCondition_ComparisonValue()
	 * @model required="true"
	 * @generated
	 */
	String getComparisonValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(PropertyElement)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getComparisonCondition_Property()
	 * @model required="true"
	 * @generated
	 */
	PropertyElement getProperty();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ComparisonCondition#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyElement value);

	/**
	 * Returns the value of the '<em><b>Comparison Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.views.ComparisonConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Type</em>' attribute.
	 * @see at.ac.tuwien.big.views.ComparisonConditionType
	 * @see #setComparisonType(ComparisonConditionType)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getComparisonCondition_ComparisonType()
	 * @model required="true"
	 * @generated
	 */
	ComparisonConditionType getComparisonType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonType <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Type</em>' attribute.
	 * @see at.ac.tuwien.big.views.ComparisonConditionType
	 * @see #getComparisonType()
	 * @generated
	 */
	void setComparisonType(ComparisonConditionType value);

} // ComparisonCondition
