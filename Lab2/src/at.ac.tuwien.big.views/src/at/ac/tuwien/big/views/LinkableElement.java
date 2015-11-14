/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.LinkableElement#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getLinkableElement()
 * @model abstract="true"
 * @generated
 */
public interface LinkableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getLinkableElement_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // LinkableElement
