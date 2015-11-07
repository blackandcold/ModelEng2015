/**
 */
package views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Association#getName <em>Name</em>}</li>
 *   <li>{@link views.Association#isComposition <em>Composition</em>}</li>
 *   <li>{@link views.Association#getBegin <em>Begin</em>}</li>
 *   <li>{@link views.Association#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lowerConstrBegin upperConstrBegin lowerConstrEnd upperConstrEnd correctTypeBegin correctTypeEnd'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot lowerConstrBegin='self.begin.multiplicityLowerBound >= 0' upperConstrBegin='self.begin.multiplicityUpperBound = -1 \n\t\t\tor (self.begin.multiplicityLowerBound <= self.begin.multiplicityUpperBound and self.begin.multiplicityUpperBound > 0)' lowerConstrEnd='self.end.multiplicityLowerBound >= 0' upperConstrEnd='self.end.multiplicityUpperBound = -1 \n\t\t\tor (self.end.multiplicityLowerBound <= self.end.multiplicityUpperBound and self.end.multiplicityUpperBound > 0)' correctTypeBegin='self.begin.type.oclIsTypeOf(Class)' correctTypeEnd='self.end.type.oclIsTypeOf(Class)'"
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see views.ViewsPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link views.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' attribute.
	 * @see #setComposition(boolean)
	 * @see views.ViewsPackage#getAssociation_Composition()
	 * @model
	 * @generated
	 */
	boolean isComposition();

	/**
	 * Sets the value of the '{@link views.Association#isComposition <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' attribute.
	 * @see #isComposition()
	 * @generated
	 */
	void setComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Property)
	 * @see views.ViewsPackage#getAssociation_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getBegin();

	/**
	 * Sets the value of the '{@link views.Association#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Property value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Property)
	 * @see views.ViewsPackage#getAssociation_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link views.Association#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

} // Association
