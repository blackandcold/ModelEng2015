/**
 */
package views;

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
 *   <li>{@link views.ViewModel#getViewGroups <em>View Groups</em>}</li>
 *   <li>{@link views.ViewModel#getWelcomeViewGroup <em>Welcome View Group</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getViewModel()
 * @model
 * @generated
 */
public interface ViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>View Groups</b></em>' containment reference list.
	 * The list contents are of type {@link views.ViewGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Groups</em>' containment reference list.
	 * @see views.ViewsPackage#getViewModel_ViewGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewGroup> getViewGroups();

	/**
	 * Returns the value of the '<em><b>Welcome View Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome View Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome View Group</em>' reference.
	 * @see #setWelcomeViewGroup(ViewGroup)
	 * @see views.ViewsPackage#getViewModel_WelcomeViewGroup()
	 * @model
	 * @generated
	 */
	ViewGroup getWelcomeViewGroup();

	/**
	 * Sets the value of the '{@link views.ViewModel#getWelcomeViewGroup <em>Welcome View Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome View Group</em>' reference.
	 * @see #getWelcomeViewGroup()
	 * @generated
	 */
	void setWelcomeViewGroup(ViewGroup value);

} // ViewModel
