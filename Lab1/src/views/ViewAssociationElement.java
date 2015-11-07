/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Association Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ViewAssociationElement#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewAssociationElement()
 * @model abstract="true"
 * @generated
 */
public interface ViewAssociationElement extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' reference.
	 * @see #setClassRef(views.Class)
	 * @see views.ViewsPackage#getViewAssociationElement_ClassRef()
	 * @model required="true"
	 * @generated
	 */
	views.Class getClassRef();

	/**
	 * Sets the value of the '{@link views.ViewAssociationElement#getClassRef <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' reference.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(views.Class value);

} // ViewAssociationElement
