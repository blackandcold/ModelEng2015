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
 *   <li>{@link views.TableViewElement#getColumnSet <em>Column Set</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Column Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Set</em>' reference.
	 * @see #setColumnSet(ColumnSet)
	 * @see views.ViewsPackage#getTableViewElement_ColumnSet()
	 * @model required="true"
	 * @generated
	 */
	ColumnSet getColumnSet();

	/**
	 * Sets the value of the '{@link views.TableViewElement#getColumnSet <em>Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Set</em>' reference.
	 * @see #getColumnSet()
	 * @generated
	 */
	void setColumnSet(ColumnSet value);

} // TableViewElement
