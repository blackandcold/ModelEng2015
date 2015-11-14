/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.Selection#getSelectionItems <em>Selection Items</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getSelection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PropertyTypeOfSelectionIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PropertyTypeOfSelectionIsValid='\n\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)'"
 * @generated
 */
public interface Selection extends PropertyElement {
	/**
	 * Returns the value of the '<em><b>Selection Items</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.SelectionItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Items</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getSelection_SelectionItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectionItem> getSelectionItems();

} // Selection
