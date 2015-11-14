/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.Association;
import at.ac.tuwien.big.views.ClassIndexView;
import at.ac.tuwien.big.views.Column;
import at.ac.tuwien.big.views.ComparisonCondition;
import at.ac.tuwien.big.views.ComparisonConditionType;
import at.ac.tuwien.big.views.CompositeCondition;
import at.ac.tuwien.big.views.CompositeConditionType;
import at.ac.tuwien.big.views.CreateView;
import at.ac.tuwien.big.views.DataType;
import at.ac.tuwien.big.views.DateTimePicker;
import at.ac.tuwien.big.views.DeleteView;
import at.ac.tuwien.big.views.DomainModel;
import at.ac.tuwien.big.views.ElementGroup;
import at.ac.tuwien.big.views.Enumeration;
import at.ac.tuwien.big.views.EnumerationLiteral;
import at.ac.tuwien.big.views.EnumerationLiteralItem;
import at.ac.tuwien.big.views.Layout;
import at.ac.tuwien.big.views.LayoutStyle;
import at.ac.tuwien.big.views.Link;
import at.ac.tuwien.big.views.List;
import at.ac.tuwien.big.views.Property;
import at.ac.tuwien.big.views.ReadView;
import at.ac.tuwien.big.views.Selection;
import at.ac.tuwien.big.views.SelectionItem;
import at.ac.tuwien.big.views.Table;
import at.ac.tuwien.big.views.Text;
import at.ac.tuwien.big.views.UpdateView;
import at.ac.tuwien.big.views.ViewGroup;
import at.ac.tuwien.big.views.ViewModel;
import at.ac.tuwien.big.views.ViewsFactory;
import at.ac.tuwien.big.views.ViewsPackage;
import at.ac.tuwien.big.views.VisibilityConditionType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case ViewsPackage.DOMAIN_MODEL: return createDomainModel();
			case ViewsPackage.CLASS: return createClass();
			case ViewsPackage.DATA_TYPE: return createDataType();
			case ViewsPackage.ENUMERATION: return createEnumeration();
			case ViewsPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case ViewsPackage.ASSOCIATION: return createAssociation();
			case ViewsPackage.PROPERTY: return createProperty();
			case ViewsPackage.VIEW_MODEL: return createViewModel();
			case ViewsPackage.VIEW_GROUP: return createViewGroup();
			case ViewsPackage.CLASS_INDEX_VIEW: return createClassIndexView();
			case ViewsPackage.CREATE_VIEW: return createCreateView();
			case ViewsPackage.READ_VIEW: return createReadView();
			case ViewsPackage.UPDATE_VIEW: return createUpdateView();
			case ViewsPackage.DELETE_VIEW: return createDeleteView();
			case ViewsPackage.ELEMENT_GROUP: return createElementGroup();
			case ViewsPackage.LIST: return createList();
			case ViewsPackage.TABLE: return createTable();
			case ViewsPackage.COLUMN: return createColumn();
			case ViewsPackage.TEXT: return createText();
			case ViewsPackage.DATE_TIME_PICKER: return createDateTimePicker();
			case ViewsPackage.SELECTION: return createSelection();
			case ViewsPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case ViewsPackage.COMPARISON_CONDITION: return createComparisonCondition();
			case ViewsPackage.LAYOUT: return createLayout();
			case ViewsPackage.LINK: return createLink();
			case ViewsPackage.SELECTION_ITEM: return createSelectionItem();
			case ViewsPackage.ENUMERATION_LITERAL_ITEM: return createEnumerationLiteralItem();
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
			case ViewsPackage.VISIBILITY_CONDITION_TYPE:
				return createVisibilityConditionTypeFromString(eDataType, initialValue);
			case ViewsPackage.COMPOSITE_CONDITION_TYPE:
				return createCompositeConditionTypeFromString(eDataType, initialValue);
			case ViewsPackage.COMPARISON_CONDITION_TYPE:
				return createComparisonConditionTypeFromString(eDataType, initialValue);
			case ViewsPackage.LAYOUT_STYLE:
				return createLayoutStyleFromString(eDataType, initialValue);
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
			case ViewsPackage.VISIBILITY_CONDITION_TYPE:
				return convertVisibilityConditionTypeToString(eDataType, instanceValue);
			case ViewsPackage.COMPOSITE_CONDITION_TYPE:
				return convertCompositeConditionTypeToString(eDataType, instanceValue);
			case ViewsPackage.COMPARISON_CONDITION_TYPE:
				return convertComparisonConditionTypeToString(eDataType, instanceValue);
			case ViewsPackage.LAYOUT_STYLE:
				return convertLayoutStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public at.ac.tuwien.big.views.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
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
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public ClassIndexView createClassIndexView() {
		ClassIndexViewImpl classIndexView = new ClassIndexViewImpl();
		return classIndexView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateView createCreateView() {
		CreateViewImpl createView = new CreateViewImpl();
		return createView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadView createReadView() {
		ReadViewImpl readView = new ReadViewImpl();
		return readView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateView createUpdateView() {
		UpdateViewImpl updateView = new UpdateViewImpl();
		return updateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteView createDeleteView() {
		DeleteViewImpl deleteView = new DeleteViewImpl();
		return deleteView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup createElementGroup() {
		ElementGroupImpl elementGroup = new ElementGroupImpl();
		return elementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
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
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePicker createDateTimePicker() {
		DateTimePickerImpl dateTimePicker = new DateTimePickerImpl();
		return dateTimePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
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
	public ComparisonCondition createComparisonCondition() {
		ComparisonConditionImpl comparisonCondition = new ComparisonConditionImpl();
		return comparisonCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
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
	public SelectionItem createSelectionItem() {
		SelectionItemImpl selectionItem = new SelectionItemImpl();
		return selectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralItem createEnumerationLiteralItem() {
		EnumerationLiteralItemImpl enumerationLiteralItem = new EnumerationLiteralItemImpl();
		return enumerationLiteralItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityConditionType createVisibilityConditionTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityConditionType result = VisibilityConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionType createCompositeConditionTypeFromString(EDataType eDataType, String initialValue) {
		CompositeConditionType result = CompositeConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonConditionType createComparisonConditionTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonConditionType result = ComparisonConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutStyle createLayoutStyleFromString(EDataType eDataType, String initialValue) {
		LayoutStyle result = LayoutStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutStyleToString(EDataType eDataType, Object instanceValue) {
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
