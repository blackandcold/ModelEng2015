/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ViewModel#getViewGroups <em>View Groups</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getViewModel()
 * @model
 * @generated
 */
public interface ViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>View Groups</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.ViewGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Groups</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getViewModel_ViewGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewGroup> getViewGroups();

} // ViewModel
