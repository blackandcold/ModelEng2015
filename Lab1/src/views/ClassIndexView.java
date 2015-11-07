/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Index View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.ClassIndexView#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClassIndexView()
 * @model
 * @generated
 */
public interface ClassIndexView<T extends views.Class> extends View {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see views.ViewsPackage#getClassIndexView_Instances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<T> getInstances();

} // ClassIndexView
