/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Picker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.DateTimePicker#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getDateTimePicker()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PropertyTypeOfDateTimePickerIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PropertyTypeOfDateTimePickerIsValid='\n\t\t\tself.property.type.oclIsTypeOf(DataType) and\n\t\t\t(self.property.type.name = \'Date\' or \n\t\t\t self.property.type.name = \'Time\' or\n\t\t\t self.property.type.name = \'DateTime\'\n\t\t\t)'"
 * @generated
 */
public interface DateTimePicker extends PropertyElement {
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
	 * @see at.ac.tuwien.big.views.ViewsPackage#getDateTimePicker_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.DateTimePicker#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DateTimePicker
