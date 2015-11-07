/**
 */
package views;

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
 *   <li>{@link views.DomainModel#getClasses <em>Classes</em>}</li>
 *   <li>{@link views.DomainModel#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link views.DomainModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link views.DomainModel#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see views.ViewsPackage#getDomainModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueClassNames uniquedataTypeNames uniqueEnumerationNames uniqueAssociationNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueClassNames='self.classes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)' uniquedataTypeNames='self.dataTypes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)' uniqueEnumerationNames='Enumeration.allInstances()->isUnique(name)' uniqueAssociationNames='Association.allInstances()->isUnique(name)'"
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link views.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<views.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link views.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link views.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link views.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see views.ViewsPackage#getDomainModel_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // DomainModel
