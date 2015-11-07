/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Picker View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.DateTimePickerViewElement#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getDateTimePickerViewElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isDateThing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isDateThing='self.propertyRef.type.oclIsTypeOf(DataType) and \n\t\t\t(self.propertyRef.type.name = \'Date\' or self.propertyRef.type.name = \'Time\' or self.propertyRef.type.name = \'DateTime\')'"
 * @generated
 */
public interface DateTimePickerViewElement extends ViewPropertyElement {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see views.ViewsPackage#getDateTimePickerViewElement_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link views.DateTimePickerViewElement#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DateTimePickerViewElement
