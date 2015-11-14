/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.DomainModel#getDomainModelElements <em>Domain Model Elements</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.DomainModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getDomainModel_DomainModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainModelElement> getDomainModelElements();

} // DomainModel
