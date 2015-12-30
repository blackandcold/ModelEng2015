/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.views.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.views.ViewsPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TableColumnRefersToTargetViewClassProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TableColumnRefersToTargetViewClassProperty='\n\t\t\tself.association.navigableEnd.type -> selectByType(Class).properties ->\n\t\t\tunion(self.association.navigableEnd.type -> selectByType(Class) -> \n\t\t\tclosure(superClass).properties) -> includesAll(self.columns.property)'"
 * @generated
 */
public interface Table extends AssociationElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.views.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see at.ac.tuwien.big.views.ViewsPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Table
