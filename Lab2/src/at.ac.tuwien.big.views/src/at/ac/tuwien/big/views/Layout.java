/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.Layout#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.views.LayoutStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see at.ac.tuwien.big.views.LayoutStyle
	 * @see #setAlignment(LayoutStyle)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getLayout_Alignment()
	 * @model
	 * @generated
	 */
	LayoutStyle getAlignment();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Layout#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see at.ac.tuwien.big.views.LayoutStyle
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(LayoutStyle value);

} // Layout
