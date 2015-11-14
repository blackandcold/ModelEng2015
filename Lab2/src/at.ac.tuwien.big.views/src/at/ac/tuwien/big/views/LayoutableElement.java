/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layoutable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.LayoutableElement#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getLayoutableElement()
 * @model abstract="true"
 * @generated
 */
public interface LayoutableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getLayoutableElement_Layout()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.LayoutableElement#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // LayoutableElement
