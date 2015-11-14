/**
 */
package at.ac.tuwien.big.views;

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
 *   <li>{@link at.ac.tuwien.big.views.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link at.ac.tuwien.big.views.Class#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueIdIsContainedOrInherited ClassPropertyTypeIsValid ClassPropertyBoundsAreValid IdBoundsAreValid NoCyclicInheritance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueIdIsContainedOrInherited='\n\t\t \tself.properties -> includes(self.id) \n\t\t \tor self.superClass.properties -> closure(superClass.properties) -> includes(self.id)' ClassPropertyTypeIsValid='\n\t\t\tself.properties -> \n\t\t\tforAll(p | p.type.oclIsTypeOf(DataType) xor p.type.oclIsTypeOf(Enumeration))' ClassPropertyBoundsAreValid='\n\t\t\tself.properties -> \n\t\t\tforAll(p | p.upperBound = 1 and (p.lowerBound = 0 xor p.lowerBound = 1))' IdBoundsAreValid='\n\t\t \tself.id.upperBound = 1 and self.id.lowerBound = 1' NoCyclicInheritance='\n\t\t\tself.superClass -> closure(superClass) -> excludes(self)'"
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getClass_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Class)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getClass_SuperClass()
	 * @model
	 * @generated
	 */
	Class getSuperClass();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Class#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Class value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(Property)
	 * @see at.ac.tuwien.big.views.ViewsPackage#getClass_Id()
	 * @model required="true"
	 * @generated
	 */
	Property getId();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.views.Class#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Property value);

} // Class
