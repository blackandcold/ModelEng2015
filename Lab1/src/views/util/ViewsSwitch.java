/**
 */
package views.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import views.Association;
import views.ClassIndexView;
import views.ClassOperationView;
import views.Column;
import views.ColumnSet;
import views.ComparisonCondition;
import views.CompositeCondition;
import views.Condition;
import views.DataType;
import views.DateTimePickerViewElement;
import views.DomainModel;
import views.EnumLiteral;
import views.Enumeration;
import views.Link;
import views.ListEntry;
import views.ListEntrySet;
import views.ListViewElement;
import views.Model;
import views.Property;
import views.SelectionViewElement;
import views.TableViewElement;
import views.TextViewElement;
import views.Type;
import views.View;
import views.ViewAssociationElement;
import views.ViewElement;
import views.ViewElementGroup;
import views.ViewGroup;
import views.ViewModel;
import views.ViewPropertyElement;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T1 result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TYPE: {
				Type type = (Type)theEObject;
				T1 result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS: {
				views.Class class_ = (views.Class)theEObject;
				T1 result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T1 result = caseEnumLiteral(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T1 result = caseEnumeration(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T1 result = caseAssociation(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T1 result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.MODEL: {
				Model model = (Model)theEObject;
				T1 result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_MODEL: {
				ViewModel viewModel = (ViewModel)theEObject;
				T1 result = caseViewModel(viewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_GROUP: {
				ViewGroup viewGroup = (ViewGroup)theEObject;
				T1 result = caseViewGroup(viewGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW: {
				View view = (View)theEObject;
				T1 result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_INDEX_VIEW: {
				ClassIndexView<?> classIndexView = (ClassIndexView<?>)theEObject;
				T1 result = caseClassIndexView(classIndexView);
				if (result == null) result = caseView(classIndexView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_OPERATION_VIEW: {
				ClassOperationView classOperationView = (ClassOperationView)theEObject;
				T1 result = caseClassOperationView(classOperationView);
				if (result == null) result = caseView(classOperationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T1 result = caseViewElement(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_ELEMENT_GROUP: {
				ViewElementGroup viewElementGroup = (ViewElementGroup)theEObject;
				T1 result = caseViewElementGroup(viewElementGroup);
				if (result == null) result = caseViewElement(viewElementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_PROPERTY_ELEMENT: {
				ViewPropertyElement viewPropertyElement = (ViewPropertyElement)theEObject;
				T1 result = caseViewPropertyElement(viewPropertyElement);
				if (result == null) result = caseViewElement(viewPropertyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_ASSOCIATION_ELEMENT: {
				ViewAssociationElement viewAssociationElement = (ViewAssociationElement)theEObject;
				T1 result = caseViewAssociationElement(viewAssociationElement);
				if (result == null) result = caseViewElement(viewAssociationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TEXT_VIEW_ELEMENT: {
				TextViewElement textViewElement = (TextViewElement)theEObject;
				T1 result = caseTextViewElement(textViewElement);
				if (result == null) result = caseViewPropertyElement(textViewElement);
				if (result == null) result = caseViewElement(textViewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DATE_TIME_PICKER_VIEW_ELEMENT: {
				DateTimePickerViewElement dateTimePickerViewElement = (DateTimePickerViewElement)theEObject;
				T1 result = caseDateTimePickerViewElement(dateTimePickerViewElement);
				if (result == null) result = caseViewPropertyElement(dateTimePickerViewElement);
				if (result == null) result = caseViewElement(dateTimePickerViewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SELECTION_VIEW_ELEMENT: {
				SelectionViewElement selectionViewElement = (SelectionViewElement)theEObject;
				T1 result = caseSelectionViewElement(selectionViewElement);
				if (result == null) result = caseViewPropertyElement(selectionViewElement);
				if (result == null) result = caseViewElement(selectionViewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LIST_VIEW_ELEMENT: {
				ListViewElement listViewElement = (ListViewElement)theEObject;
				T1 result = caseListViewElement(listViewElement);
				if (result == null) result = caseViewAssociationElement(listViewElement);
				if (result == null) result = caseViewElement(listViewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LIST_ENTRY_SET: {
				ListEntrySet listEntrySet = (ListEntrySet)theEObject;
				T1 result = caseListEntrySet(listEntrySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T1 result = caseListEntry(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE_VIEW_ELEMENT: {
				TableViewElement tableViewElement = (TableViewElement)theEObject;
				T1 result = caseTableViewElement(tableViewElement);
				if (result == null) result = caseViewAssociationElement(tableViewElement);
				if (result == null) result = caseViewElement(tableViewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COLUMN_SET: {
				ColumnSet columnSet = (ColumnSet)theEObject;
				T1 result = caseColumnSet(columnSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COLUMN: {
				Column column = (Column)theEObject;
				T1 result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T1 result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COMPARISON_CONDITION: {
				ComparisonCondition comparisonCondition = (ComparisonCondition)theEObject;
				T1 result = caseComparisonCondition(comparisonCondition);
				if (result == null) result = caseCondition(comparisonCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COMPOSITE_CONDITION: {
				CompositeCondition compositeCondition = (CompositeCondition)theEObject;
				T1 result = caseCompositeCondition(compositeCondition);
				if (result == null) result = caseCondition(compositeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LINK: {
				Link link = (Link)theEObject;
				T1 result = caseLink(link);
				if (result == null) result = caseViewElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClass(views.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewModel(ViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewGroup(ViewGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Index View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Index View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends views.Class> T1 caseClassIndexView(ClassIndexView<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operation View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassOperationView(ClassOperationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewElementGroup(ViewElementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Property Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Property Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewPropertyElement(ViewPropertyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Association Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Association Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseViewAssociationElement(ViewAssociationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextViewElement(TextViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Picker View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Picker View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDateTimePickerViewElement(DateTimePickerViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSelectionViewElement(SelectionViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListViewElement(ListViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListEntrySet(ListEntrySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListEntry(ListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTableViewElement(TableViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumnSet(ColumnSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComparisonCondition(ComparisonCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeCondition(CompositeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
