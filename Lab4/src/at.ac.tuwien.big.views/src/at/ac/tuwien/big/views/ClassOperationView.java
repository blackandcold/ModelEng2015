/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Operation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.ClassOperationView#getElementGroups <em>Element Groups</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getClassOperationView()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PropertyElementsReferToValidClassProperties AssociationElementsReferToValidClass PropertyElementOfComparisonConditionsIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PropertyElementsReferToValidClassProperties='\n\t\t\tself.class.properties -> union(self.class -> closure(superClass).properties) -> \n\t\t\tincludesAll(self.elementGroups.viewElements -> selectByKind(PropertyElement).property)' AssociationElementsReferToValidClass='\n\t\t\tself.elementGroups.viewElements -> selectByKind(AssociationElement) -> \n\t\t\tforAll(a | a.association.associationEnds -> excluding(a.association.navigableEnd).type \n\t\t\t-> includesAll(self.class -> union(self.class -> closure(superClass))))' PropertyElementOfComparisonConditionsIsValid='\n\t\t\tself.elementGroups.viewElements -> includesAll(\n\t\t\tself.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition) \n\t\t\t-> collect(v:CompositeCondition|v.composedConditions) -> selectByKind(ComparisonCondition).property \n\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(ComparisonCondition).property) \n\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition).composedConditions -> selectByKind(ComparisonCondition).property)\n\t\t\t-> asSet())'"
 * @generated
 */
public interface ClassOperationView extends View, LayoutableElement {
	/**
	 * Returns the value of the '<em><b>Element Groups</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.ElementGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Groups</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getClassOperationView_ElementGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementGroup> getElementGroups();

} // ClassOperationView
