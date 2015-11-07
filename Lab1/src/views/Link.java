/**
 */
package views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Link#getInstance <em>Instance</em>}</li>
 *   <li>{@link views.Link#getView <em>View</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends ViewElement {
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
	 * @see views.ViewsPackage#getLink_Instance()
	 * @model
	 * @generated
	 */
	views.Class getInstance();

	/**
	 * Sets the value of the '{@link views.Link#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(views.Class value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(ClassOperationView)
	 * @see views.ViewsPackage#getLink_View()
	 * @model
	 * @generated
	 */
	ClassOperationView getView();

	/**
	 * Sets the value of the '{@link views.Link#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(ClassOperationView value);

} // Link
