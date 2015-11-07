/**
 */
package views.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import views.Association;
import views.ClassIndexView;
import views.ClassOperationView;
import views.Column;
import views.ColumnSet;
import views.ComparisonCondition;
import views.CompositeCondition;
import views.DataType;
import views.DateTimePickerViewElement;
import views.DomainModel;
import views.EnumLiteral;
import views.Enumeration;
import views.Layout;
import views.Link;
import views.ListEntry;
import views.ListEntrySet;
import views.ListViewElement;
import views.Model;
import views.Operator;
import views.Property;
import views.SelectionViewElement;
import views.TableViewElement;
import views.TextLength;
import views.TextViewElement;
import views.Type;
import views.ViewElementGroup;
import views.ViewGroup;
import views.ViewModel;
import views.ViewsFactory;
import views.ViewsPackage;
import views.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewsPackage.DATA_TYPE: return createDataType();
			case ViewsPackage.TYPE: return createType();
			case ViewsPackage.PROPERTY: return createProperty();
			case ViewsPackage.CLASS: return createClass();
			case ViewsPackage.ENUM_LITERAL: return createEnumLiteral();
			case ViewsPackage.ENUMERATION: return createEnumeration();
			case ViewsPackage.ASSOCIATION: return createAssociation();
			case ViewsPackage.DOMAIN_MODEL: return createDomainModel();
			case ViewsPackage.MODEL: return createModel();
			case ViewsPackage.VIEW_MODEL: return createViewModel();
			case ViewsPackage.VIEW_GROUP: return createViewGroup();
			case ViewsPackage.CLASS_INDEX_VIEW: return createClassIndexView();
			case ViewsPackage.CLASS_OPERATION_VIEW: return createClassOperationView();
			case ViewsPackage.VIEW_ELEMENT_GROUP: return createViewElementGroup();
			case ViewsPackage.TEXT_VIEW_ELEMENT: return createTextViewElement();
			case ViewsPackage.DATE_TIME_PICKER_VIEW_ELEMENT: return createDateTimePickerViewElement();
			case ViewsPackage.SELECTION_VIEW_ELEMENT: return createSelectionViewElement();
			case ViewsPackage.LIST_VIEW_ELEMENT: return createListViewElement();
			case ViewsPackage.LIST_ENTRY_SET: return createListEntrySet();
			case ViewsPackage.LIST_ENTRY: return createListEntry();
			case ViewsPackage.TABLE_VIEW_ELEMENT: return createTableViewElement();
			case ViewsPackage.COLUMN_SET: return createColumnSet();
			case ViewsPackage.COLUMN: return createColumn();
			case ViewsPackage.COMPARISON_CONDITION: return createComparisonCondition();
			case ViewsPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case ViewsPackage.LINK: return createLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ViewsPackage.TEXT_LENGTH:
				return createTextLengthFromString(eDataType, initialValue);
			case ViewsPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case ViewsPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case ViewsPackage.LAYOUT:
				return createLayoutFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ViewsPackage.TEXT_LENGTH:
				return convertTextLengthToString(eDataType, instanceValue);
			case ViewsPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case ViewsPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case ViewsPackage.LAYOUT:
				return convertLayoutToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public views.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModel createViewModel() {
		ViewModelImpl viewModel = new ViewModelImpl();
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroup createViewGroup() {
		ViewGroupImpl viewGroup = new ViewGroupImpl();
		return viewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends views.Class> ClassIndexView<T> createClassIndexView() {
		ClassIndexViewImpl<T> classIndexView = new ClassIndexViewImpl<T>();
		return classIndexView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperationView createClassOperationView() {
		ClassOperationViewImpl classOperationView = new ClassOperationViewImpl();
		return classOperationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElementGroup createViewElementGroup() {
		ViewElementGroupImpl viewElementGroup = new ViewElementGroupImpl();
		return viewElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextViewElement createTextViewElement() {
		TextViewElementImpl textViewElement = new TextViewElementImpl();
		return textViewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePickerViewElement createDateTimePickerViewElement() {
		DateTimePickerViewElementImpl dateTimePickerViewElement = new DateTimePickerViewElementImpl();
		return dateTimePickerViewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionViewElement createSelectionViewElement() {
		SelectionViewElementImpl selectionViewElement = new SelectionViewElementImpl();
		return selectionViewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListViewElement createListViewElement() {
		ListViewElementImpl listViewElement = new ListViewElementImpl();
		return listViewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntrySet createListEntrySet() {
		ListEntrySetImpl listEntrySet = new ListEntrySetImpl();
		return listEntrySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableViewElement createTableViewElement() {
		TableViewElementImpl tableViewElement = new TableViewElementImpl();
		return tableViewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSet createColumnSet() {
		ColumnSetImpl columnSet = new ColumnSetImpl();
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCondition createComparisonCondition() {
		ComparisonConditionImpl comparisonCondition = new ComparisonConditionImpl();
		return comparisonCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCondition createCompositeCondition() {
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLength createTextLengthFromString(EDataType eDataType, String initialValue) {
		TextLength result = TextLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayoutFromString(EDataType eDataType, String initialValue) {
		Layout result = Layout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl
