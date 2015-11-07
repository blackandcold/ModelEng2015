/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Operation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ClassOperationView#getInstance <em>Instance</em>}</li>
 *   <li>{@link views.ClassOperationView#getViewElements <em>View Elements</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClassOperationView()
 * @model
 * @generated
 */
public interface ClassOperationView extends View {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(views.Class)
	 * @see views.ViewsPackage#getClassOperationView_Instance()
	 * @model
	 * @generated
	 */
	views.Class getInstance();

	/**
	 * Sets the value of the '{@link views.ClassOperationView#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(views.Class value);

	/**
	 * Returns the value of the '<em><b>View Elements</b></em>' containment reference list.
	 * The list contents are of type {@link views.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Elements</em>' containment reference list.
	 * @see views.ViewsPackage#getClassOperationView_ViewElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElement> getViewElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	views.Class create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	views.Class read();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	views.Class update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	views.Class delete();

} // ClassOperationView
