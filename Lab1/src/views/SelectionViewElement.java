/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.SelectionViewElement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getSelectionViewElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correctType='self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)'"
 * @generated
 */
public interface SelectionViewElement extends ViewPropertyElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference.
	 * @see #setValues(Enumeration)
	 * @see views.ViewsPackage#getSelectionViewElement_Values()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getValues();

	/**
	 * Sets the value of the '{@link views.SelectionViewElement#getValues <em>Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Enumeration value);

} // SelectionViewElement
