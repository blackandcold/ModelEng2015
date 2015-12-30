/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.Association#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.Association#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.Association#getNavigableEnd <em>Navigable End</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssociationPropertyBoundsAreValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AssociationPropertyBoundsAreValid='\n\t\t \tself.associationEnds -> forAll(p | p.lowerBound >= 0 and (p.upperBound <> 0 or p.upperBound >= p.lowerBound or p.upperBound = -1))'"
 * @generated
 */
public interface Association extends DomainModelElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociation_IsComposition()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Association#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociation_AssociationEnds()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Property> getAssociationEnds();

	/**
	 * Returns the value of the '<em><b>Navigable End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable End</em>' reference.
	 * @see #setNavigableEnd(Property)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getAssociation_NavigableEnd()
	 * @model required="true"
	 * @generated
	 */
	Property getNavigableEnd();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Association#getNavigableEnd <em>Navigable End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable End</em>' reference.
	 * @see #getNavigableEnd()
	 * @generated
	 */
	void setNavigableEnd(Property value);

} // Association
