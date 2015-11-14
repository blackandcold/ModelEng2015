/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.AssociationElement#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociationElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TargetViewOfAssociationElementLinksIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TargetViewOfAssociationElementLinksIsValid='\n\t\t\tself.link.targetView.class  -> includes(self.association.navigableEnd.type) or self.link -> isEmpty()'"
 * @generated
 */
public interface AssociationElement extends LinkableElement, ViewElement {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociationElement_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.AssociationElement#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // AssociationElement
