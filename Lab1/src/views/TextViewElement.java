/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.TextViewElement#getLength <em>Length</em>}</li>
 *   <li>{@link views.TextViewElement#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getTextViewElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correctType='self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)'"
 * @generated
 */
public interface TextViewElement extends ViewPropertyElement {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The literals are from the enumeration {@link views.TextLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see views.TextLength
	 * @see #setLength(TextLength)
	 * @see views.ViewsPackage#getTextViewElement_Length()
	 * @model
	 * @generated
	 */
	TextLength getLength();

	/**
	 * Sets the value of the '{@link views.TextViewElement#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see views.TextLength
	 * @see #getLength()
	 * @generated
	 */
	void setLength(TextLength value);

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
	 * @see views.ViewsPackage#getTextViewElement_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link views.TextViewElement#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // TextViewElement
