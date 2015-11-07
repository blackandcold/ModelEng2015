/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.TableViewElement#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getTableViewElement()
 * @model
 * @generated
 */
public interface TableViewElement extends ViewAssociationElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link views.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see views.ViewsPackage#getTableViewElement_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // TableViewElement
