/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ViewElement#getLabel <em>Label</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.ViewElement#getElementID <em>Element ID</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getViewElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ElementIdIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ElementIdIsUnique='\n\t\t\tViewElement.allInstances() -> select(e | e.elementID = self.elementID) -> excluding(self) ->isEmpty()'"
 * @generated
 */
public interface ViewElement extends ConditionalElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getViewElement_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ViewElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getViewElement_ElementID()
	 * @model required="true"
	 * @generated
	 */
	String getElementID();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ViewElement#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(String value);

} // ViewElement
