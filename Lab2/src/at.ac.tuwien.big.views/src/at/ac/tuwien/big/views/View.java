/**
 */
package at.ac.tuwien.big.views;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.View#getHeader <em>Header</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.View#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.View#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.View#isStartView <em>Start View</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View extends NamedElement {
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
	 * @see at.ac.tuwien.big.views.ViewsPackage#getView_Header()
	 * @model required="true"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.View#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getView_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.View#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(at.ac.tuwien.big.views.Class)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getView_Class()
	 * @model required="true"
	 * @generated
	 */
	at.ac.tuwien.big.views.Class getClass_();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.View#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(at.ac.tuwien.big.views.Class value);

	/**
	 * Returns the value of the '<em><b>Start View</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start View</em>' attribute.
	 * @see #setStartView(boolean)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getView_StartView()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStartView();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.View#isStartView <em>Start View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start View</em>' attribute.
	 * @see #isStartView()
	 * @generated
	 */
	void setStartView(boolean value);

} // View
