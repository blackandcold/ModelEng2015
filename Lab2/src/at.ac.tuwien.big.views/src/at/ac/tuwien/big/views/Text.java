/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.Text#getFormat <em>Format</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.Text#isLong <em>Long</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getText()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PropertyTypeOfTextIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PropertyTypeOfTextIsValid='\n\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)'"
 * @generated
 */
public interface Text extends PropertyElement {
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
	 * @see at.ac.tuwien.big.views.ViewsPackage#getText_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Text#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(boolean)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getText_Long()
	 * @model required="true"
	 * @generated
	 */
	boolean isLong();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Text#isLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #isLong()
	 * @generated
	 */
	void setLong(boolean value);

} // Text
