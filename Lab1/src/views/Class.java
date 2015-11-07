/**
 */
package views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link views.Class#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link views.Class#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link views.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link views.Class#getIsId <em>Is Id</em>}</li>
 *   <li>{@link views.Class#getAssociations <em>Associations</em>}</li>
 *   <li>{@link views.Class#getAssociationsNavigable <em>Associations Navigable</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lowerConstr upperConstr idConstr idMandatorySuperclass correctType noSelfSubclass noSelfSuperclass superNotSubclass'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot lowerConstr='self.properties\n\t\t\t\t\t-> forAll (p: Property | p.multiplicityLowerBound = 0 or p.multiplicityLowerBound = 1)' upperConstr='self.properties\n\t\t\t\t\t-> forAll (p: Property | p.multiplicityUpperBound = 1)' idConstr='if self.isId->notEmpty() then self.isId.multiplicityLowerBound = 1 and self.isId.multiplicityUpperBound = 1 else true endif' idMandatorySuperclass='if self.superclass->isEmpty() then self.properties -> includes(self.isId) else self.isId->isEmpty() endif' correctType=' self.properties \n\t\t\t\t\t-> forAll (p: Property | p.type.oclIsTypeOf(DataType) or p.type.oclIsTypeOf(Enumeration))' noSelfSubclass='self.subclass->excludes(self)' noSelfSuperclass='self.superclass->excludes(self)' superNotSubclass='self.superclass <> self.subclass'"
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(Class)
	 * @see views.ViewsPackage#getClass_Superclass()
	 * @model
	 * @generated
	 */
	Class getSuperclass();

	/**
	 * Sets the value of the '{@link views.Class#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(Class value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference list.
	 * The list contents are of type {@link views.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference list.
	 * @see views.ViewsPackage#getClass_Subclass()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Class.allInstances() -> select(superclass = self)'"
	 * @generated
	 */
	EList<Class> getSubclass();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link views.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see views.ViewsPackage#getClass_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Id</em>' reference.
	 * @see #setIsId(Property)
	 * @see views.ViewsPackage#getClass_IsId()
	 * @model
	 * @generated
	 */
	Property getIsId();

	/**
	 * Sets the value of the '{@link views.Class#getIsId <em>Is Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' reference.
	 * @see #getIsId()
	 * @generated
	 */
	void setIsId(Property value);

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link views.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see views.ViewsPackage#getClass_Associations()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Association.allInstances() -> select(begin.type = self)'"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>Associations Navigable</b></em>' reference list.
	 * The list contents are of type {@link views.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations Navigable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations Navigable</em>' reference list.
	 * @see views.ViewsPackage#getClass_AssociationsNavigable()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Association.allInstances() -> select(end.type = self)'"
	 * @generated
	 */
	EList<Association> getAssociationsNavigable();

} // Class
