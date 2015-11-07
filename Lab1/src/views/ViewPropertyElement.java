/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Property Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ViewPropertyElement#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewPropertyElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isPropertyMemberOfClass'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isPropertyMemberOfClass='\n\t\t(self -> closure(o: ViewElement | o.oclContainer()) -> select(oclIsTypeOf(ClassOperationView)))\n\t\t -> forAll(cov: ClassOperationView | cov.instance.properties->includes(self.propertyRef))'"
 * @generated
 */
public interface ViewPropertyElement extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' reference.
	 * @see #setPropertyRef(Property)
	 * @see views.ViewsPackage#getViewPropertyElement_PropertyRef()
	 * @model required="true"
	 * @generated
	 */
	Property getPropertyRef();

	/**
	 * Sets the value of the '{@link views.ViewPropertyElement#getPropertyRef <em>Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' reference.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(Property value);

} // ViewPropertyElement
