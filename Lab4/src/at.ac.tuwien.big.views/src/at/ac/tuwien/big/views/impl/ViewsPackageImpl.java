/**
 */
package at.ac.tuwien.big.views.impl;

import at.ac.tuwien.big.views.Association;
import at.ac.tuwien.big.views.AssociationElement;
import at.ac.tuwien.big.views.ClassIndexView;
import at.ac.tuwien.big.views.ClassOperationView;
import at.ac.tuwien.big.views.Column;
import at.ac.tuwien.big.views.ComparisonCondition;
import at.ac.tuwien.big.views.ComparisonConditionType;
import at.ac.tuwien.big.views.CompositeCondition;
import at.ac.tuwien.big.views.CompositeConditionType;
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
import at.ac.tuwien.big.views.LayoutStyle;
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
import at.ac.tuwien.big.views.ViewsFactory;
import at.ac.tuwien.big.views.ViewsPackage;
import at.ac.tuwien.big.views.VisibilityCondition;
import at.ac.tuwien.big.views.VisibilityConditionType;

import at.ac.tuwien.big.views.util.ViewsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classIndexViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityConditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeConditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonConditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theViewsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theViewsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ViewsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainModelElements() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelElement() {
		return domainModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Properties() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Id() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Value() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_LowerBound() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_UpperBound() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsComposition() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AssociationEnds() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModel_ViewGroups() {
		return (EReference)viewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewGroup() {
		return viewGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewGroup_Views() {
		return (EReference)viewGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewGroup_WelcomeViewGroup() {
		return (EAttribute)viewGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Header() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Description() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Class() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_StartView() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassIndexView() {
		return classIndexViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperationView() {
		return classOperationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_ElementGroups() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateView() {
		return createViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadView() {
		return readViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateView() {
		return updateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteView() {
		return deleteViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Header() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_ViewElements() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_Label() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_ElementID() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationElement() {
		return associationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationElement_Association() {
		return (EReference)associationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyElement() {
		return propertyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyElement_Property() {
		return (EReference)propertyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Format() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Long() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimePicker() {
		return dateTimePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimePicker_Format() {
		return (EAttribute)dateTimePickerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_SelectionItems() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityCondition() {
		return visibilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityCondition_Type() {
		return (EAttribute)visibilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityCondition_ConditionID() {
		return (EAttribute)visibilityConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_ComposedConditions() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_CompositionType() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonCondition() {
		return comparisonConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonCondition_ComparisonValue() {
		return (EAttribute)comparisonConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonCondition_Property() {
		return (EReference)comparisonConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonCondition_ComparisonType() {
		return (EAttribute)comparisonConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutableElement() {
		return layoutableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutableElement_Layout() {
		return (EReference)layoutableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Alignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkableElement() {
		return linkableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkableElement_Link() {
		return (EReference)linkableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_TargetView() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Label() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionItem() {
		return selectionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionItem_Value() {
		return (EAttribute)selectionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteralItem() {
		return enumerationLiteralItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteralItem_EnumerationLiteral() {
		return (EReference)enumerationLiteralItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalElement() {
		return conditionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalElement_Condition() {
		return (EReference)conditionalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityConditionType() {
		return visibilityConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeConditionType() {
		return compositeConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonConditionType() {
		return comparisonConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutStyle() {
		return layoutStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_MODEL_ELEMENTS);

		domainModelElementEClass = createEClass(DOMAIN_MODEL_ELEMENT);

		typeEClass = createEClass(TYPE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__PROPERTIES);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEReference(classEClass, CLASS__ID);

		dataTypeEClass = createEClass(DATA_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__VALUE);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_BOUND);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_BOUND);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__IS_COMPOSITION);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_ENDS);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_END);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__TYPE);

		viewModelEClass = createEClass(VIEW_MODEL);
		createEReference(viewModelEClass, VIEW_MODEL__VIEW_GROUPS);

		viewGroupEClass = createEClass(VIEW_GROUP);
		createEReference(viewGroupEClass, VIEW_GROUP__VIEWS);
		createEAttribute(viewGroupEClass, VIEW_GROUP__WELCOME_VIEW_GROUP);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__HEADER);
		createEAttribute(viewEClass, VIEW__DESCRIPTION);
		createEReference(viewEClass, VIEW__CLASS);
		createEAttribute(viewEClass, VIEW__START_VIEW);

		classIndexViewEClass = createEClass(CLASS_INDEX_VIEW);

		classOperationViewEClass = createEClass(CLASS_OPERATION_VIEW);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__ELEMENT_GROUPS);

		createViewEClass = createEClass(CREATE_VIEW);

		readViewEClass = createEClass(READ_VIEW);

		updateViewEClass = createEClass(UPDATE_VIEW);

		deleteViewEClass = createEClass(DELETE_VIEW);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__HEADER);
		createEReference(elementGroupEClass, ELEMENT_GROUP__VIEW_ELEMENTS);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__LABEL);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__ELEMENT_ID);

		associationElementEClass = createEClass(ASSOCIATION_ELEMENT);
		createEReference(associationElementEClass, ASSOCIATION_ELEMENT__ASSOCIATION);

		listEClass = createEClass(LIST);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);

		propertyElementEClass = createEClass(PROPERTY_ELEMENT);
		createEReference(propertyElementEClass, PROPERTY_ELEMENT__PROPERTY);

		columnEClass = createEClass(COLUMN);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__FORMAT);
		createEAttribute(textEClass, TEXT__LONG);

		dateTimePickerEClass = createEClass(DATE_TIME_PICKER);
		createEAttribute(dateTimePickerEClass, DATE_TIME_PICKER__FORMAT);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__SELECTION_ITEMS);

		visibilityConditionEClass = createEClass(VISIBILITY_CONDITION);
		createEAttribute(visibilityConditionEClass, VISIBILITY_CONDITION__TYPE);
		createEAttribute(visibilityConditionEClass, VISIBILITY_CONDITION__CONDITION_ID);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__COMPOSED_CONDITIONS);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__COMPOSITION_TYPE);

		comparisonConditionEClass = createEClass(COMPARISON_CONDITION);
		createEAttribute(comparisonConditionEClass, COMPARISON_CONDITION__COMPARISON_VALUE);
		createEReference(comparisonConditionEClass, COMPARISON_CONDITION__PROPERTY);
		createEAttribute(comparisonConditionEClass, COMPARISON_CONDITION__COMPARISON_TYPE);

		layoutableElementEClass = createEClass(LAYOUTABLE_ELEMENT);
		createEReference(layoutableElementEClass, LAYOUTABLE_ELEMENT__LAYOUT);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__ALIGNMENT);

		linkableElementEClass = createEClass(LINKABLE_ELEMENT);
		createEReference(linkableElementEClass, LINKABLE_ELEMENT__LINK);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__TARGET_VIEW);
		createEAttribute(linkEClass, LINK__LABEL);

		selectionItemEClass = createEClass(SELECTION_ITEM);
		createEAttribute(selectionItemEClass, SELECTION_ITEM__VALUE);

		enumerationLiteralItemEClass = createEClass(ENUMERATION_LITERAL_ITEM);
		createEReference(enumerationLiteralItemEClass, ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL);

		conditionalElementEClass = createEClass(CONDITIONAL_ELEMENT);
		createEReference(conditionalElementEClass, CONDITIONAL_ELEMENT__CONDITION);

		conditionEClass = createEClass(CONDITION);

		// Create enums
		visibilityConditionTypeEEnum = createEEnum(VISIBILITY_CONDITION_TYPE);
		compositeConditionTypeEEnum = createEEnum(COMPOSITE_CONDITION_TYPE);
		comparisonConditionTypeEEnum = createEEnum(COMPARISON_CONDITION_TYPE);
		layoutStyleEEnum = createEEnum(LAYOUT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getDomainModelElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		classEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getType());
		enumerationEClass.getESuperTypes().add(this.getType());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		associationEClass.getESuperTypes().add(this.getDomainModelElement());
		associationEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getNamedElement());
		viewGroupEClass.getESuperTypes().add(this.getNamedElement());
		viewEClass.getESuperTypes().add(this.getNamedElement());
		classIndexViewEClass.getESuperTypes().add(this.getLinkableElement());
		classIndexViewEClass.getESuperTypes().add(this.getView());
		classOperationViewEClass.getESuperTypes().add(this.getView());
		classOperationViewEClass.getESuperTypes().add(this.getLayoutableElement());
		createViewEClass.getESuperTypes().add(this.getClassOperationView());
		readViewEClass.getESuperTypes().add(this.getClassOperationView());
		updateViewEClass.getESuperTypes().add(this.getClassOperationView());
		deleteViewEClass.getESuperTypes().add(this.getClassOperationView());
		elementGroupEClass.getESuperTypes().add(this.getLayoutableElement());
		elementGroupEClass.getESuperTypes().add(this.getConditionalElement());
		viewElementEClass.getESuperTypes().add(this.getConditionalElement());
		associationElementEClass.getESuperTypes().add(this.getLinkableElement());
		associationElementEClass.getESuperTypes().add(this.getViewElement());
		listEClass.getESuperTypes().add(this.getAssociationElement());
		tableEClass.getESuperTypes().add(this.getAssociationElement());
		propertyElementEClass.getESuperTypes().add(this.getViewElement());
		columnEClass.getESuperTypes().add(this.getPropertyElement());
		textEClass.getESuperTypes().add(this.getPropertyElement());
		dateTimePickerEClass.getESuperTypes().add(this.getPropertyElement());
		selectionEClass.getESuperTypes().add(this.getPropertyElement());
		visibilityConditionEClass.getESuperTypes().add(this.getCondition());
		compositeConditionEClass.getESuperTypes().add(this.getVisibilityCondition());
		comparisonConditionEClass.getESuperTypes().add(this.getVisibilityCondition());
		enumerationLiteralItemEClass.getESuperTypes().add(this.getSelectionItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_DomainModelElements(), this.getDomainModelElement(), null, "domainModelElements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelElementEClass, DomainModelElement.class, "DomainModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, at.ac.tuwien.big.views.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Properties(), this.getProperty(), null, "properties", null, 1, -1, at.ac.tuwien.big.views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, 1, at.ac.tuwien.big.views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Id(), this.getProperty(), null, "id", null, 1, 1, at.ac.tuwien.big.views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 1, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_UpperBound(), ecorePackage.getEInt(), "upperBound", "-1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_IsComposition(), ecorePackage.getEBoolean(), "isComposition", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AssociationEnds(), this.getProperty(), null, "associationEnds", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_NavigableEnd(), this.getProperty(), null, "navigableEnd", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Type(), this.getType(), null, "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModel_ViewGroups(), this.getViewGroup(), null, "viewGroups", null, 0, -1, ViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewGroupEClass, ViewGroup.class, "ViewGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewGroup_Views(), this.getView(), null, "views", null, 0, -1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewGroup_WelcomeViewGroup(), ecorePackage.getEBoolean(), "welcomeViewGroup", "false", 1, 1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Header(), ecorePackage.getEString(), "header", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Description(), ecorePackage.getEString(), "description", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Class(), this.getClass_(), null, "class", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_StartView(), ecorePackage.getEBoolean(), "startView", "false", 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classIndexViewEClass, ClassIndexView.class, "ClassIndexView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classOperationViewEClass, ClassOperationView.class, "ClassOperationView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperationView_ElementGroups(), this.getElementGroup(), null, "elementGroups", null, 0, -1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createViewEClass, CreateView.class, "CreateView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readViewEClass, ReadView.class, "ReadView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateViewEClass, UpdateView.class, "UpdateView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteViewEClass, DeleteView.class, "DeleteView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementGroup_Header(), ecorePackage.getEString(), "header", null, 1, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroup_ViewElements(), this.getViewElement(), null, "viewElements", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewElement_Label(), ecorePackage.getEString(), "label", null, 1, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_ElementID(), ecorePackage.getEString(), "elementID", null, 1, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationElementEClass, AssociationElement.class, "AssociationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationElement_Association(), this.getAssociation(), null, "association", null, 1, 1, AssociationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyElementEClass, PropertyElement.class, "PropertyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyElement_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Format(), ecorePackage.getEString(), "format", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Long(), ecorePackage.getEBoolean(), "long", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimePickerEClass, DateTimePicker.class, "DateTimePicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimePicker_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateTimePicker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_SelectionItems(), this.getSelectionItem(), null, "selectionItems", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityConditionEClass, VisibilityCondition.class, "VisibilityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityCondition_Type(), this.getVisibilityConditionType(), "type", null, 1, 1, VisibilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibilityCondition_ConditionID(), ecorePackage.getEString(), "conditionID", null, 1, 1, VisibilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCondition_ComposedConditions(), this.getVisibilityCondition(), null, "composedConditions", null, 2, 2, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCondition_CompositionType(), this.getCompositeConditionType(), "compositionType", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonConditionEClass, ComparisonCondition.class, "ComparisonCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonCondition_ComparisonValue(), ecorePackage.getEString(), "comparisonValue", null, 1, 1, ComparisonCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonCondition_Property(), this.getPropertyElement(), null, "property", null, 1, 1, ComparisonCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonCondition_ComparisonType(), this.getComparisonConditionType(), "comparisonType", null, 1, 1, ComparisonCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutableElementEClass, LayoutableElement.class, "LayoutableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutableElement_Layout(), this.getLayout(), null, "layout", null, 1, 1, LayoutableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_Alignment(), this.getLayoutStyle(), "alignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkableElementEClass, LinkableElement.class, "LinkableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkableElement_Link(), this.getLink(), null, "link", null, 0, -1, LinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_TargetView(), this.getClassOperationView(), null, "targetView", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Label(), ecorePackage.getEString(), "label", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionItemEClass, SelectionItem.class, "SelectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionItem_Value(), ecorePackage.getEString(), "value", null, 1, 1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralItemEClass, EnumerationLiteralItem.class, "EnumerationLiteralItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteralItem_EnumerationLiteral(), this.getEnumerationLiteral(), null, "enumerationLiteral", null, 1, 1, EnumerationLiteralItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalElementEClass, ConditionalElement.class, "ConditionalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalElement_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityConditionTypeEEnum, VisibilityConditionType.class, "VisibilityConditionType");
		addEEnumLiteral(visibilityConditionTypeEEnum, VisibilityConditionType.HIDE);
		addEEnumLiteral(visibilityConditionTypeEEnum, VisibilityConditionType.SHOW);
		addEEnumLiteral(visibilityConditionTypeEEnum, VisibilityConditionType.ENABLE);
		addEEnumLiteral(visibilityConditionTypeEEnum, VisibilityConditionType.DISABLE);

		initEEnum(compositeConditionTypeEEnum, CompositeConditionType.class, "CompositeConditionType");
		addEEnumLiteral(compositeConditionTypeEEnum, CompositeConditionType.AND);
		addEEnumLiteral(compositeConditionTypeEEnum, CompositeConditionType.OR);

		initEEnum(comparisonConditionTypeEEnum, ComparisonConditionType.class, "ComparisonConditionType");
		addEEnumLiteral(comparisonConditionTypeEEnum, ComparisonConditionType.EQUAL);
		addEEnumLiteral(comparisonConditionTypeEEnum, ComparisonConditionType.LESS);
		addEEnumLiteral(comparisonConditionTypeEEnum, ComparisonConditionType.GREATER);

		initEEnum(layoutStyleEEnum, LayoutStyle.class, "LayoutStyle");
		addEEnumLiteral(layoutStyleEEnum, LayoutStyle.VERTICAL);
		addEEnumLiteral(layoutStyleEEnum, LayoutStyle.HORIZONTAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueIdIsContainedOrInherited ClassPropertyTypeIsValid ClassPropertyBoundsAreValid IdBoundsAreValid NoCyclicInheritance"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "constraints", "AssociationPropertyBoundsAreValid"
		   });	
		addAnnotation
		  (viewGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneStartViewExistsWithinAViewGroup OneWelcomeGroupExists"
		   });	
		addAnnotation
		  (classIndexViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "TargetViewOfClassIndexViewLinksIsValid"
		   });	
		addAnnotation
		  (classOperationViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "PropertyElementsReferToValidClassProperties AssociationElementsReferToValidClass PropertyElementOfComparisonConditionsIsValid"
		   });	
		addAnnotation
		  (viewElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ElementIdIsUnique"
		   });	
		addAnnotation
		  (associationElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "TargetViewOfAssociationElementLinksIsValid"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "constraints", "TableColumnRefersToTargetViewClassProperty"
		   });	
		addAnnotation
		  (textEClass, 
		   source, 
		   new String[] {
			 "constraints", "PropertyTypeOfTextIsValid"
		   });	
		addAnnotation
		  (dateTimePickerEClass, 
		   source, 
		   new String[] {
			 "constraints", "PropertyTypeOfDateTimePickerIsValid"
		   });	
		addAnnotation
		  (selectionEClass, 
		   source, 
		   new String[] {
			 "constraints", "PropertyTypeOfSelectionIsValid"
		   });	
		addAnnotation
		  (visibilityConditionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConditionIdIsUnique"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ComposedConditionTypesAreEqual"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "UniqueIdIsContainedOrInherited", "\n\t\t \tself.properties -> includes(self.id) \n\t\t \tor self.superClass.properties -> closure(superClass.properties) -> includes(self.id)",
			 "ClassPropertyTypeIsValid", "\n\t\t\tself.properties -> \n\t\t\tforAll(p | p.type.oclIsTypeOf(DataType) xor p.type.oclIsTypeOf(Enumeration))",
			 "ClassPropertyBoundsAreValid", "\n\t\t\tself.properties -> \n\t\t\tforAll(p | p.upperBound = 1 and (p.lowerBound = 0 xor p.lowerBound = 1))",
			 "IdBoundsAreValid", "\n\t\t \tself.id.upperBound = 1 and self.id.lowerBound = 1",
			 "NoCyclicInheritance", "\n\t\t\tself.superClass -> closure(superClass) -> excludes(self)"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "AssociationPropertyBoundsAreValid", "\n\t\t \tself.associationEnds -> forAll(p | p.lowerBound >= 0 and (p.upperBound <> 0 or p.upperBound >= p.lowerBound or p.upperBound = -1))"
		   });	
		addAnnotation
		  (viewGroupEClass, 
		   source, 
		   new String[] {
			 "OneStartViewExistsWithinAViewGroup", "\n\t\t\tself.views -> select(v | v.startView = true) -> size() = 1",
			 "OneWelcomeGroupExists", "\n\t\t\tViewGroup.allInstances() -> select(v | v.welcomeViewGroup = true) -> size() = 1"
		   });	
		addAnnotation
		  (classIndexViewEClass, 
		   source, 
		   new String[] {
			 "TargetViewOfClassIndexViewLinksIsValid", "\n\t\t\tself.link.targetView.class  -> includes(self.class) or self.link -> isEmpty()"
		   });	
		addAnnotation
		  (classOperationViewEClass, 
		   source, 
		   new String[] {
			 "PropertyElementsReferToValidClassProperties", "\n\t\t\tself.class.properties -> union(self.class -> closure(superClass).properties) -> \n\t\t\tincludesAll(self.elementGroups.viewElements -> selectByKind(PropertyElement).property)",
			 "AssociationElementsReferToValidClass", "\n\t\t\tself.elementGroups.viewElements -> selectByKind(AssociationElement) -> \n\t\t\tforAll(a | a.association.associationEnds -> excluding(a.association.navigableEnd).type \n\t\t\t-> includesAll(self.class -> union(self.class -> closure(superClass))))",
			 "PropertyElementOfComparisonConditionsIsValid", "\n\t\t\tself.elementGroups.viewElements -> includesAll(\n\t\t\tself.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition) \n\t\t\t-> collect(v:CompositeCondition|v.composedConditions) -> selectByKind(ComparisonCondition).property \n\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(ComparisonCondition).property) \n\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition).composedConditions -> selectByKind(ComparisonCondition).property)\n\t\t\t-> asSet())"
		   });	
		addAnnotation
		  (viewElementEClass, 
		   source, 
		   new String[] {
			 "ElementIdIsUnique", "\n\t\t\tViewElement.allInstances() -> select(e | e.elementID = self.elementID) -> excluding(self) ->isEmpty()"
		   });	
		addAnnotation
		  (associationElementEClass, 
		   source, 
		   new String[] {
			 "TargetViewOfAssociationElementLinksIsValid", "\n\t\t\tself.link.targetView.class  -> includes(self.association.navigableEnd.type) or self.link -> isEmpty()"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "TableColumnRefersToTargetViewClassProperty", "\n\t\t\tself.association.navigableEnd.type -> selectByType(Class).properties ->\n\t\t\tunion(self.association.navigableEnd.type -> selectByType(Class) -> \n\t\t\tclosure(superClass).properties) -> includesAll(self.columns.property)"
		   });	
		addAnnotation
		  (textEClass, 
		   source, 
		   new String[] {
			 "PropertyTypeOfTextIsValid", "\n\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)"
		   });	
		addAnnotation
		  (dateTimePickerEClass, 
		   source, 
		   new String[] {
			 "PropertyTypeOfDateTimePickerIsValid", "\n\t\t\tself.property.type.oclIsTypeOf(DataType) and\n\t\t\t(self.property.type.name = \'Date\' or \n\t\t\t self.property.type.name = \'Time\' or\n\t\t\t self.property.type.name = \'DateTime\'\n\t\t\t)"
		   });	
		addAnnotation
		  (selectionEClass, 
		   source, 
		   new String[] {
			 "PropertyTypeOfSelectionIsValid", "\n\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)"
		   });	
		addAnnotation
		  (visibilityConditionEClass, 
		   source, 
		   new String[] {
			 "ConditionIdIsUnique", "\n\t\t\tVisibilityCondition.allInstances() -> select(c | c.conditionID = self.conditionID) -> excluding(self) -> isEmpty()"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "ComposedConditionTypesAreEqual", "\n\t\t\tself.composedConditions -> forAll(c | c.type = self.type)"
		   });
	}

} //ViewsPackageImpl
