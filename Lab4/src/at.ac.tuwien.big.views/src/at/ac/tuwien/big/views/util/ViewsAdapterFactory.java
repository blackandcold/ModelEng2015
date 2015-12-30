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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseDomainModelElement(DomainModelElement object) {
				return createDomainModelElementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseClass(at.ac.tuwien.big.views.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseViewModel(ViewModel object) {
				return createViewModelAdapter();
			}
			@Override
			public Adapter caseViewGroup(ViewGroup object) {
				return createViewGroupAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseClassIndexView(ClassIndexView object) {
				return createClassIndexViewAdapter();
			}
			@Override
			public Adapter caseClassOperationView(ClassOperationView object) {
				return createClassOperationViewAdapter();
			}
			@Override
			public Adapter caseCreateView(CreateView object) {
				return createCreateViewAdapter();
			}
			@Override
			public Adapter caseReadView(ReadView object) {
				return createReadViewAdapter();
			}
			@Override
			public Adapter caseUpdateView(UpdateView object) {
				return createUpdateViewAdapter();
			}
			@Override
			public Adapter caseDeleteView(DeleteView object) {
				return createDeleteViewAdapter();
			}
			@Override
			public Adapter caseElementGroup(ElementGroup object) {
				return createElementGroupAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseAssociationElement(AssociationElement object) {
				return createAssociationElementAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter casePropertyElement(PropertyElement object) {
				return createPropertyElementAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseDateTimePicker(DateTimePicker object) {
				return createDateTimePickerAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseVisibilityCondition(VisibilityCondition object) {
				return createVisibilityConditionAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseComparisonCondition(ComparisonCondition object) {
				return createComparisonConditionAdapter();
			}
			@Override
			public Adapter caseLayoutableElement(LayoutableElement object) {
				return createLayoutableElementAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseLinkableElement(LinkableElement object) {
				return createLinkableElementAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseSelectionItem(SelectionItem object) {
				return createSelectionItemAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteralItem(EnumerationLiteralItem object) {
				return createEnumerationLiteralItemAdapter();
			}
			@Override
			public Adapter caseConditionalElement(ConditionalElement object) {
				return createConditionalElementAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.DomainModelElement <em>Domain Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.DomainModelElement
	 * @generated
	 */
	public Adapter createDomainModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ViewModel
	 * @generated
	 */
	public Adapter createViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ViewGroup
	 * @generated
	 */
	public Adapter createViewGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ClassIndexView <em>Class Index View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ClassIndexView
	 * @generated
	 */
	public Adapter createClassIndexViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ClassOperationView <em>Class Operation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ClassOperationView
	 * @generated
	 */
	public Adapter createClassOperationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.CreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.CreateView
	 * @generated
	 */
	public Adapter createCreateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ReadView <em>Read View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ReadView
	 * @generated
	 */
	public Adapter createReadViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.UpdateView <em>Update View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.UpdateView
	 * @generated
	 */
	public Adapter createUpdateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.DeleteView <em>Delete View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.DeleteView
	 * @generated
	 */
	public Adapter createDeleteViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ElementGroup
	 * @generated
	 */
	public Adapter createElementGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.AssociationElement <em>Association Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.AssociationElement
	 * @generated
	 */
	public Adapter createAssociationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.PropertyElement <em>Property Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.PropertyElement
	 * @generated
	 */
	public Adapter createPropertyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.DateTimePicker <em>Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.DateTimePicker
	 * @generated
	 */
	public Adapter createDateTimePickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.VisibilityCondition <em>Visibility Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.VisibilityCondition
	 * @generated
	 */
	public Adapter createVisibilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ComparisonCondition
	 * @generated
	 */
	public Adapter createComparisonConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.LayoutableElement <em>Layoutable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.LayoutableElement
	 * @generated
	 */
	public Adapter createLayoutableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.LinkableElement
	 * @generated
	 */
	public Adapter createLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.SelectionItem <em>Selection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.SelectionItem
	 * @generated
	 */
	public Adapter createSelectionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.EnumerationLiteralItem <em>Enumeration Literal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.EnumerationLiteralItem
	 * @generated
	 */
	public Adapter createEnumerationLiteralItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.ConditionalElement <em>Conditional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.ConditionalElement
	 * @generated
	 */
	public Adapter createConditionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.views.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.views.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewsAdapterFactory
