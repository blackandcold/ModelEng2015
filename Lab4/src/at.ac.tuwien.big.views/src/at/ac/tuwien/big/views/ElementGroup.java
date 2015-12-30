/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ElementGroup#getHeader <em>Header</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.ElementGroup#getViewElements <em>View Elements</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getElementGroup()
 * @model
 * @generated
 */
public interface ElementGroup extends LayoutableElement, ConditionalElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getElementGroup_Header()
	 * @model required="true"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ElementGroup#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>View Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getElementGroup_ViewElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElement> getViewElements();

} // ElementGroup
