/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ViewGroup#getViews <em>Views</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getViewGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneStartViewExistsWithinAViewGroup OneWelcomeGroupExists'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneStartViewExistsWithinAViewGroup='\n\t\t\tself.views -> select(v | v.startView = true) -> size() = 1' OneWelcomeGroupExists='\n\t\t\tViewGroup.allInstances() -> select(v | v.welcomeViewGroup = true) -> size() = 1'"
 * @generated
 */
public interface ViewGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getViewGroup_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Welcome View Group</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome View Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome View Group</em>' attribute.
	 * @see #setWelcomeViewGroup(boolean)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getViewGroup_WelcomeViewGroup()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isWelcomeViewGroup();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome View Group</em>' attribute.
	 * @see #isWelcomeViewGroup()
	 * @generated
	 */
	void setWelcomeViewGroup(boolean value);

} // ViewGroup
