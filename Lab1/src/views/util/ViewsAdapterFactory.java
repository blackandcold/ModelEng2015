/**
 */
package views.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see views.ViewsPackage
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
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseClass(views.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
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
			public <T extends views.Class> Adapter caseClassIndexView(ClassIndexView<T> object) {
				return createClassIndexViewAdapter();
			}
			@Override
			public Adapter caseClassOperationView(ClassOperationView object) {
				return createClassOperationViewAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseViewElementGroup(ViewElementGroup object) {
				return createViewElementGroupAdapter();
			}
			@Override
			public Adapter caseViewPropertyElement(ViewPropertyElement object) {
				return createViewPropertyElementAdapter();
			}
			@Override
			public Adapter caseViewAssociationElement(ViewAssociationElement object) {
				return createViewAssociationElementAdapter();
			}
			@Override
			public Adapter caseTextViewElement(TextViewElement object) {
				return createTextViewElementAdapter();
			}
			@Override
			public Adapter caseDateTimePickerViewElement(DateTimePickerViewElement object) {
				return createDateTimePickerViewElementAdapter();
			}
			@Override
			public Adapter caseSelectionViewElement(SelectionViewElement object) {
				return createSelectionViewElementAdapter();
			}
			@Override
			public Adapter caseListViewElement(ListViewElement object) {
				return createListViewElementAdapter();
			}
			@Override
			public Adapter caseListEntrySet(ListEntrySet object) {
				return createListEntrySetAdapter();
			}
			@Override
			public Adapter caseListEntry(ListEntry object) {
				return createListEntryAdapter();
			}
			@Override
			public Adapter caseTableViewElement(TableViewElement object) {
				return createTableViewElementAdapter();
			}
			@Override
			public Adapter caseColumnSet(ColumnSet object) {
				return createColumnSetAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseComparisonCondition(ComparisonCondition object) {
				return createComparisonConditionAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
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
	 * Creates a new adapter for an object of class '{@link views.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewModel
	 * @generated
	 */
	public Adapter createViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewGroup
	 * @generated
	 */
	public Adapter createViewGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ClassIndexView <em>Class Index View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ClassIndexView
	 * @generated
	 */
	public Adapter createClassIndexViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ClassOperationView <em>Class Operation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ClassOperationView
	 * @generated
	 */
	public Adapter createClassOperationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewElementGroup <em>View Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewElementGroup
	 * @generated
	 */
	public Adapter createViewElementGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewPropertyElement <em>View Property Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewPropertyElement
	 * @generated
	 */
	public Adapter createViewPropertyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ViewAssociationElement <em>View Association Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ViewAssociationElement
	 * @generated
	 */
	public Adapter createViewAssociationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.TextViewElement <em>Text View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.TextViewElement
	 * @generated
	 */
	public Adapter createTextViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.DateTimePickerViewElement <em>Date Time Picker View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.DateTimePickerViewElement
	 * @generated
	 */
	public Adapter createDateTimePickerViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.SelectionViewElement <em>Selection View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.SelectionViewElement
	 * @generated
	 */
	public Adapter createSelectionViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ListViewElement <em>List View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ListViewElement
	 * @generated
	 */
	public Adapter createListViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ListEntrySet <em>List Entry Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ListEntrySet
	 * @generated
	 */
	public Adapter createListEntrySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ListEntry
	 * @generated
	 */
	public Adapter createListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.TableViewElement <em>Table View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.TableViewElement
	 * @generated
	 */
	public Adapter createTableViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ColumnSet
	 * @generated
	 */
	public Adapter createColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.ComparisonCondition
	 * @generated
	 */
	public Adapter createComparisonConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link views.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see views.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
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
