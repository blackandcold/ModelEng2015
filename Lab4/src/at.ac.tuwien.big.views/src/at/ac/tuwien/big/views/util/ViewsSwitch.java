/**
 */
package at.ac.tuwien.big.views.util;

import at.ac.tuwien.big.views.Association;
import at.ac.tuwien.big.views.AssociationElement;
import at.ac.tuwien.big.views.ClassIndexView;
import at.ac.tuwien.big.views.ClassOperationView;
import at.ac.tuwien.big.views.Column;
import at.ac.tuwien.big.views.ComparisonCondition;
import at.ac.tuwien.big.views.CompositeCondition;
import at.ac.tuwien.big.views.Condition;
import at.ac.tuwien.big.views.ConditionalElement;
import at.ac.tuwien.big.views.CreateView;
import at.ac.tuwien.big.views.DataType;
import at.ac.tuwien.big.views.DateTimePicker;
import at.ac.tuwien.big.views.DeleteView;
import at.ac.tuwien.big.views.DomainModel;
import at.ac.tuwien.big.views.DomainModelElement;
import at.ac.tuwien.big.views.ElementGroup;
import at.ac.tuwien.big.views.Enumeration;
import at.ac.tuwien.big.views.EnumerationLiteral;
import at.ac.tuwien.big.views.EnumerationLiteralItem;
import at.ac.tuwien.big.views.Layout;
import at.ac.tuwien.big.views.LayoutableElement;
import at.ac.tuwien.big.views.Link;
import at.ac.tuwien.big.views.LinkableElement;
import at.ac.tuwien.big.views.List;
import at.ac.tuwien.big.views.MultiplicityElement;
import at.ac.tuwien.big.views.NamedElement;
import at.ac.tuwien.big.views.Property;
import at.ac.tuwien.big.views.PropertyElement;
import at.ac.tuwien.big.views.ReadView;
import at.ac.tuwien.big.views.Selection;
import at.ac.tuwien.big.views.SelectionItem;
import at.ac.tuwien.big.views.Table;
import at.ac.tuwien.big.views.Text;
import at.ac.tuwien.big.views.Type;
import at.ac.tuwien.big.views.UpdateView;
import at.ac.tuwien.big.views.View;
import at.ac.tuwien.big.views.ViewElement;
import at.ac.tuwien.big.views.ViewGroup;
import at.ac.tuwien.big.views.ViewModel;
import at.ac.tuwien.big.views.ViewsPackage;
import at.ac.tuwien.big.views.VisibilityCondition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see at.ac.tuwien.big.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DOMAIN_MODEL_ELEMENT: {
				DomainModelElement domainModelElement = (DomainModelElement)theEObject;
				T result = caseDomainModelElement(domainModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseDomainModelElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS: {
				at.ac.tuwien.big.views.Class class_ = (at.ac.tuwien.big.views.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseDomainModelElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseDomainModelElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseDomainModelElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseDomainModelElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_MODEL: {
				ViewModel viewModel = (ViewModel)theEObject;
				T result = caseViewModel(viewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_GROUP: {
				ViewGroup viewGroup = (ViewGroup)theEObject;
				T result = caseViewGroup(viewGroup);
				if (result == null) result = caseNamedElement(viewGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_INDEX_VIEW: {
				ClassIndexView classIndexView = (ClassIndexView)theEObject;
				T result = caseClassIndexView(classIndexView);
				if (result == null) result = caseLinkableElement(classIndexView);
				if (result == null) result = caseView(classIndexView);
				if (result == null) result = caseNamedElement(classIndexView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_OPERATION_VIEW: {
				ClassOperationView classOperationView = (ClassOperationView)theEObject;
				T result = caseClassOperationView(classOperationView);
				if (result == null) result = caseView(classOperationView);
				if (result == null) result = caseLayoutableElement(classOperationView);
				if (result == null) result = caseNamedElement(classOperationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CREATE_VIEW: {
				CreateView createView = (CreateView)theEObject;
				T result = caseCreateView(createView);
				if (result == null) result = caseClassOperationView(createView);
				if (result == null) result = caseView(createView);
				if (result == null) result = caseLayoutableElement(createView);
				if (result == null) result = caseNamedElement(createView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.READ_VIEW: {
				ReadView readView = (ReadView)theEObject;
				T result = caseReadView(readView);
				if (result == null) result = caseClassOperationView(readView);
				if (result == null) result = caseView(readView);
				if (result == null) result = caseLayoutableElement(readView);
				if (result == null) result = caseNamedElement(readView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.UPDATE_VIEW: {
				UpdateView updateView = (UpdateView)theEObject;
				T result = caseUpdateView(updateView);
				if (result == null) result = caseClassOperationView(updateView);
				if (result == null) result = caseView(updateView);
				if (result == null) result = caseLayoutableElement(updateView);
				if (result == null) result = caseNamedElement(updateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DELETE_VIEW: {
				DeleteView deleteView = (DeleteView)theEObject;
				T result = caseDeleteView(deleteView);
				if (result == null) result = caseClassOperationView(deleteView);
				if (result == null) result = caseView(deleteView);
				if (result == null) result = caseLayoutableElement(deleteView);
				if (result == null) result = caseNamedElement(deleteView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ELEMENT_GROUP: {
				ElementGroup elementGroup = (ElementGroup)theEObject;
				T result = caseElementGroup(elementGroup);
				if (result == null) result = caseLayoutableElement(elementGroup);
				if (result == null) result = caseConditionalElement(elementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T result = caseViewElement(viewElement);
				if (result == null) result = caseConditionalElement(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ASSOCIATION_ELEMENT: {
				AssociationElement associationElement = (AssociationElement)theEObject;
				T result = caseAssociationElement(associationElement);
				if (result == null) result = caseLinkableElement(associationElement);
				if (result == null) result = caseViewElement(associationElement);
				if (result == null) result = caseConditionalElement(associationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseAssociationElement(list);
				if (result == null) result = caseLinkableElement(list);
				if (result == null) result = caseViewElement(list);
				if (result == null) result = caseConditionalElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseAssociationElement(table);
				if (result == null) result = caseLinkableElement(table);
				if (result == null) result = caseViewElement(table);
				if (result == null) result = caseConditionalElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PROPERTY_ELEMENT: {
				PropertyElement propertyElement = (PropertyElement)theEObject;
				T result = casePropertyElement(propertyElement);
				if (result == null) result = caseViewElement(propertyElement);
				if (result == null) result = caseConditionalElement(propertyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = casePropertyElement(column);
				if (result == null) result = caseViewElement(column);
				if (result == null) result = caseConditionalElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = casePropertyElement(text);
				if (result == null) result = caseViewElement(text);
				if (result == null) result = caseConditionalElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DATE_TIME_PICKER: {
				DateTimePicker dateTimePicker = (DateTimePicker)theEObject;
				T result = caseDateTimePicker(dateTimePicker);
				if (result == null) result = casePropertyElement(dateTimePicker);
				if (result == null) result = caseViewElement(dateTimePicker);
				if (result == null) result = caseConditionalElement(dateTimePicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = casePropertyElement(selection);
				if (result == null) result = caseViewElement(selection);
				if (result == null) result = caseConditionalElement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.VISIBILITY_CONDITION: {
				VisibilityCondition visibilityCondition = (VisibilityCondition)theEObject;
				T result = caseVisibilityCondition(visibilityCondition);
				if (result == null) result = caseCondition(visibilityCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COMPOSITE_CONDITION: {
				CompositeCondition compositeCondition = (CompositeCondition)theEObject;
				T result = caseCompositeCondition(compositeCondition);
				if (result == null) result = caseVisibilityCondition(compositeCondition);
				if (result == null) result = caseCondition(compositeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.COMPARISON_CONDITION: {
				ComparisonCondition comparisonCondition = (ComparisonCondition)theEObject;
				T result = caseComparisonCondition(comparisonCondition);
				if (result == null) result = caseVisibilityCondition(comparisonCondition);
				if (result == null) result = caseCondition(comparisonCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LAYOUTABLE_ELEMENT: {
				LayoutableElement layoutableElement = (LayoutableElement)theEObject;
				T result = caseLayoutableElement(layoutableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LINKABLE_ELEMENT: {
				LinkableElement linkableElement = (LinkableElement)theEObject;
				T result = caseLinkableElement(linkableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SELECTION_ITEM: {
				SelectionItem selectionItem = (SelectionItem)theEObject;
				T result = caseSelectionItem(selectionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.ENUMERATION_LITERAL_ITEM: {
				EnumerationLiteralItem enumerationLiteralItem = (EnumerationLiteralItem)theEObject;
				T result = caseEnumerationLiteralItem(enumerationLiteralItem);
				if (result == null) result = caseSelectionItem(enumerationLiteralItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONDITIONAL_ELEMENT: {
				ConditionalElement conditionalElement = (ConditionalElement)theEObject;
				T result = caseConditionalElement(conditionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModelElement(DomainModelElement object) {
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
	public T caseType(Type object) {
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
	public T caseClass(at.ac.tuwien.big.views.Class object) {
		return null;
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
	public T caseDataType(DataType object) {
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
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
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
	public T caseAssociation(Association object) {
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
	public T caseProperty(Property object) {
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
	public T caseViewModel(ViewModel object) {
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
	public T caseViewGroup(ViewGroup object) {
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
	public T caseView(View object) {
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
	public T caseClassIndexView(ClassIndexView object) {
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
	public T caseClassOperationView(ClassOperationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateView(CreateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadView(ReadView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateView(UpdateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteView(DeleteView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementGroup(ElementGroup object) {
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
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationElement(AssociationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyElement(PropertyElement object) {
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
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimePicker(DateTimePicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityCondition(VisibilityCondition object) {
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
	public T caseCompositeCondition(CompositeCondition object) {
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
	public T caseComparisonCondition(ComparisonCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layoutable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layoutable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutableElement(LayoutableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkableElement(LinkableElement object) {
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
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionItem(SelectionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteralItem(EnumerationLiteralItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalElement(ConditionalElement object) {
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
	public T caseCondition(Condition object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
