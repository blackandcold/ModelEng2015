/**
 */
package views.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import views.View;
import views.ViewAssociationElement;
import views.ViewElement;
import views.ViewElementGroup;
import views.ViewGroup;
import views.ViewModel;
import views.ViewPropertyElement;
import views.ViewsFactory;
import views.ViewsPackage;
import views.Visibility;

import views.util.ViewsValidator;

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
	private EClass dataTypeEClass = null;

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
	private EClass propertyEClass = null;

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
	private EClass enumLiteralEClass = null;

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
	private EClass associationEClass = null;

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
	private EClass modelEClass = null;

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
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPropertyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAssociationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textViewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePickerViewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionViewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listViewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEntrySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableViewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnSetEClass = null;

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
	private EClass conditionEClass = null;

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
	private EClass compositeConditionEClass = null;

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
	private EEnum textLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutEEnum = null;

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
	 * @see views.ViewsPackage#eNS_URI
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
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Type() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_MultiplicityLowerBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_MultiplicityUpperBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
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
	public EReference getClass_Superclass() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Subclass() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Properties() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_IsId() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Associations() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_AssociationsNavigable() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Name() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Value() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(1);
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
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Name() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Composition() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Begin() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_End() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
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
	public EReference getDomainModel_Classes() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DataTypes() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Enumerations() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Associations() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DomainModel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ViewModel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
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
	public EReference getViewModel_WelcomeViewGroup() {
		return (EReference)viewModelEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getViewGroup_Name() {
		return (EAttribute)viewGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewGroup_Views() {
		return (EReference)viewGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewGroup_StartView() {
		return (EReference)viewGroupEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Header() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Description() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Layout() {
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
	public EReference getClassIndexView_Instances() {
		return (EReference)classIndexViewEClass.getEStructuralFeatures().get(0);
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
	public EReference getClassOperationView_Instance() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperationView_ViewElements() {
		return (EReference)classOperationViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassOperationView__Create() {
		return classOperationViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassOperationView__Read() {
		return classOperationViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassOperationView__Update() {
		return classOperationViewEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassOperationView__Delete() {
		return classOperationViewEClass.getEOperations().get(3);
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
	public EClass getViewElementGroup() {
		return viewElementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElementGroup_Header() {
		return (EAttribute)viewElementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElementGroup_Layout() {
		return (EAttribute)viewElementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElementGroup_ViewElements() {
		return (EReference)viewElementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPropertyElement() {
		return viewPropertyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPropertyElement_PropertyRef() {
		return (EReference)viewPropertyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewAssociationElement() {
		return viewAssociationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewAssociationElement_ClassRef() {
		return (EReference)viewAssociationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextViewElement() {
		return textViewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextViewElement_Length() {
		return (EAttribute)textViewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextViewElement_Format() {
		return (EAttribute)textViewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimePickerViewElement() {
		return dateTimePickerViewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimePickerViewElement_Format() {
		return (EAttribute)dateTimePickerViewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionViewElement() {
		return selectionViewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionViewElement_Values() {
		return (EReference)selectionViewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListViewElement() {
		return listViewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListViewElement_Links() {
		return (EReference)listViewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListViewElement_EntrySet() {
		return (EReference)listViewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEntrySet() {
		return listEntrySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntrySet_Entries() {
		return (EReference)listEntrySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntrySet_Buttons() {
		return (EReference)listEntrySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEntry() {
		return listEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_PropertyRef() {
		return (EReference)listEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableViewElement() {
		return tableViewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableViewElement_Links() {
		return (EReference)tableViewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableViewElement_ColumnSet() {
		return (EReference)tableViewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnSet() {
		return columnSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnSet_Columns() {
		return (EReference)columnSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnSet_Buttons() {
		return (EReference)columnSetEClass.getEStructuralFeatures().get(1);
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
	public EReference getColumn_PropertyRef() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCondition_ConditionID() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Result() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getComparisonCondition_Expression() {
		return (EAttribute)comparisonConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonCondition_Element() {
		return (EReference)comparisonConditionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCompositeCondition_OperatorType() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Cond1() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Cond2() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(2);
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
	public EReference getLink_Instance() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_View() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextLength() {
		return textLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayout() {
		return layoutEEnum;
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
		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__TYPE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEReference(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__MULTIPLICITY_LOWER_BOUND);
		createEAttribute(propertyEClass, PROPERTY__MULTIPLICITY_UPPER_BOUND);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__SUPERCLASS);
		createEReference(classEClass, CLASS__SUBCLASS);
		createEReference(classEClass, CLASS__PROPERTIES);
		createEReference(classEClass, CLASS__IS_ID);
		createEReference(classEClass, CLASS__ASSOCIATIONS);
		createEReference(classEClass, CLASS__ASSOCIATIONS_NAVIGABLE);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__VALUE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__NAME);
		createEAttribute(associationEClass, ASSOCIATION__COMPOSITION);
		createEReference(associationEClass, ASSOCIATION__BEGIN);
		createEReference(associationEClass, ASSOCIATION__END);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__CLASSES);
		createEReference(domainModelEClass, DOMAIN_MODEL__DATA_TYPES);
		createEReference(domainModelEClass, DOMAIN_MODEL__ENUMERATIONS);
		createEReference(domainModelEClass, DOMAIN_MODEL__ASSOCIATIONS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__DOMAIN_MODEL);
		createEReference(modelEClass, MODEL__VIEW_MODEL);

		viewModelEClass = createEClass(VIEW_MODEL);
		createEReference(viewModelEClass, VIEW_MODEL__VIEW_GROUPS);
		createEReference(viewModelEClass, VIEW_MODEL__WELCOME_VIEW_GROUP);

		viewGroupEClass = createEClass(VIEW_GROUP);
		createEAttribute(viewGroupEClass, VIEW_GROUP__NAME);
		createEReference(viewGroupEClass, VIEW_GROUP__VIEWS);
		createEReference(viewGroupEClass, VIEW_GROUP__START_VIEW);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEAttribute(viewEClass, VIEW__HEADER);
		createEAttribute(viewEClass, VIEW__DESCRIPTION);
		createEAttribute(viewEClass, VIEW__LAYOUT);

		classIndexViewEClass = createEClass(CLASS_INDEX_VIEW);
		createEReference(classIndexViewEClass, CLASS_INDEX_VIEW__INSTANCES);

		classOperationViewEClass = createEClass(CLASS_OPERATION_VIEW);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__INSTANCE);
		createEReference(classOperationViewEClass, CLASS_OPERATION_VIEW__VIEW_ELEMENTS);
		createEOperation(classOperationViewEClass, CLASS_OPERATION_VIEW___CREATE);
		createEOperation(classOperationViewEClass, CLASS_OPERATION_VIEW___READ);
		createEOperation(classOperationViewEClass, CLASS_OPERATION_VIEW___UPDATE);
		createEOperation(classOperationViewEClass, CLASS_OPERATION_VIEW___DELETE);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__LABEL);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__ELEMENT_ID);

		viewElementGroupEClass = createEClass(VIEW_ELEMENT_GROUP);
		createEAttribute(viewElementGroupEClass, VIEW_ELEMENT_GROUP__HEADER);
		createEAttribute(viewElementGroupEClass, VIEW_ELEMENT_GROUP__LAYOUT);
		createEReference(viewElementGroupEClass, VIEW_ELEMENT_GROUP__VIEW_ELEMENTS);

		viewPropertyElementEClass = createEClass(VIEW_PROPERTY_ELEMENT);
		createEReference(viewPropertyElementEClass, VIEW_PROPERTY_ELEMENT__PROPERTY_REF);

		viewAssociationElementEClass = createEClass(VIEW_ASSOCIATION_ELEMENT);
		createEReference(viewAssociationElementEClass, VIEW_ASSOCIATION_ELEMENT__CLASS_REF);

		textViewElementEClass = createEClass(TEXT_VIEW_ELEMENT);
		createEAttribute(textViewElementEClass, TEXT_VIEW_ELEMENT__LENGTH);
		createEAttribute(textViewElementEClass, TEXT_VIEW_ELEMENT__FORMAT);

		dateTimePickerViewElementEClass = createEClass(DATE_TIME_PICKER_VIEW_ELEMENT);
		createEAttribute(dateTimePickerViewElementEClass, DATE_TIME_PICKER_VIEW_ELEMENT__FORMAT);

		selectionViewElementEClass = createEClass(SELECTION_VIEW_ELEMENT);
		createEReference(selectionViewElementEClass, SELECTION_VIEW_ELEMENT__VALUES);

		listViewElementEClass = createEClass(LIST_VIEW_ELEMENT);
		createEReference(listViewElementEClass, LIST_VIEW_ELEMENT__LINKS);
		createEReference(listViewElementEClass, LIST_VIEW_ELEMENT__ENTRY_SET);

		listEntrySetEClass = createEClass(LIST_ENTRY_SET);
		createEReference(listEntrySetEClass, LIST_ENTRY_SET__ENTRIES);
		createEReference(listEntrySetEClass, LIST_ENTRY_SET__BUTTONS);

		listEntryEClass = createEClass(LIST_ENTRY);
		createEReference(listEntryEClass, LIST_ENTRY__PROPERTY_REF);

		tableViewElementEClass = createEClass(TABLE_VIEW_ELEMENT);
		createEReference(tableViewElementEClass, TABLE_VIEW_ELEMENT__LINKS);
		createEReference(tableViewElementEClass, TABLE_VIEW_ELEMENT__COLUMN_SET);

		columnSetEClass = createEClass(COLUMN_SET);
		createEReference(columnSetEClass, COLUMN_SET__COLUMNS);
		createEReference(columnSetEClass, COLUMN_SET__BUTTONS);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__PROPERTY_REF);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__CONDITION_ID);
		createEAttribute(conditionEClass, CONDITION__RESULT);

		comparisonConditionEClass = createEClass(COMPARISON_CONDITION);
		createEAttribute(comparisonConditionEClass, COMPARISON_CONDITION__EXPRESSION);
		createEReference(comparisonConditionEClass, COMPARISON_CONDITION__ELEMENT);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__OPERATOR_TYPE);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__COND1);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__COND2);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__INSTANCE);
		createEReference(linkEClass, LINK__VIEW);

		// Create enums
		textLengthEEnum = createEEnum(TEXT_LENGTH);
		operatorEEnum = createEEnum(OPERATOR);
		visibilityEEnum = createEEnum(VISIBILITY);
		layoutEEnum = createEEnum(LAYOUT);
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
		ETypeParameter classIndexViewEClass_T = addETypeParameter(classIndexViewEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getClass_());
		classIndexViewEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(this.getType());
		classEClass.getESuperTypes().add(this.getType());
		enumerationEClass.getESuperTypes().add(this.getType());
		classIndexViewEClass.getESuperTypes().add(this.getView());
		classOperationViewEClass.getESuperTypes().add(this.getView());
		viewElementGroupEClass.getESuperTypes().add(this.getViewElement());
		viewPropertyElementEClass.getESuperTypes().add(this.getViewElement());
		viewAssociationElementEClass.getESuperTypes().add(this.getViewElement());
		textViewElementEClass.getESuperTypes().add(this.getViewPropertyElement());
		dateTimePickerViewElementEClass.getESuperTypes().add(this.getViewPropertyElement());
		selectionViewElementEClass.getESuperTypes().add(this.getViewPropertyElement());
		listViewElementEClass.getESuperTypes().add(this.getViewAssociationElement());
		tableViewElementEClass.getESuperTypes().add(this.getViewAssociationElement());
		comparisonConditionEClass.getESuperTypes().add(this.getCondition());
		compositeConditionEClass.getESuperTypes().add(this.getCondition());
		linkEClass.getESuperTypes().add(this.getViewElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getDataType_Type(), g1, "type", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Type(), this.getType(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_MultiplicityLowerBound(), ecorePackage.getEBigInteger(), "multiplicityLowerBound", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_MultiplicityUpperBound(), ecorePackage.getEBigInteger(), "multiplicityUpperBound", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, views.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Superclass(), this.getClass_(), null, "superclass", null, 0, 1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Subclass(), this.getClass_(), null, "subclass", null, 0, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_Properties(), this.getProperty(), null, "properties", null, 0, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_IsId(), this.getProperty(), null, "isId", null, 0, 1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Associations(), this.getAssociation(), null, "associations", null, 0, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_AssociationsNavigable(), this.getAssociation(), null, "associationsNavigable", null, 0, -1, views.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Composition(), ecorePackage.getEBoolean(), "composition", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Begin(), this.getProperty(), null, "begin", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_End(), this.getProperty(), null, "end", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_Classes(), this.getClass_(), null, "classes", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Associations(), this.getAssociation(), null, "associations", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_DomainModel(), this.getDomainModel(), null, "domainModel", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ViewModel(), this.getViewModel(), null, "viewModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModel_ViewGroups(), this.getViewGroup(), null, "viewGroups", null, 0, -1, ViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewModel_WelcomeViewGroup(), this.getViewGroup(), null, "welcomeViewGroup", null, 0, 1, ViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewGroupEClass, ViewGroup.class, "ViewGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewGroup_Views(), this.getView(), null, "views", null, 0, -1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewGroup_StartView(), this.getView(), null, "startView", null, 0, 1, ViewGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Header(), ecorePackage.getEString(), "header", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Description(), ecorePackage.getEString(), "description", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Layout(), this.getLayout(), "layout", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classIndexViewEClass, ClassIndexView.class, "ClassIndexView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(classIndexViewEClass_T);
		initEReference(getClassIndexView_Instances(), g1, null, "instances", null, 0, -1, ClassIndexView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classOperationViewEClass, ClassOperationView.class, "ClassOperationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperationView_Instance(), this.getClass_(), null, "instance", null, 0, 1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOperationView_ViewElements(), this.getViewElement(), null, "viewElements", null, 0, -1, ClassOperationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getClassOperationView__Create(), this.getClass_(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassOperationView__Read(), this.getClass_(), "read", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassOperationView__Update(), this.getClass_(), "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassOperationView__Delete(), this.getClass_(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_ElementID(), ecorePackage.getEString(), "elementID", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementGroupEClass, ViewElementGroup.class, "ViewElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewElementGroup_Header(), ecorePackage.getEString(), "header", null, 0, 1, ViewElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElementGroup_Layout(), this.getLayout(), "layout", null, 0, 1, ViewElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElementGroup_ViewElements(), this.getViewElement(), null, "viewElements", null, 0, -1, ViewElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPropertyElementEClass, ViewPropertyElement.class, "ViewPropertyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPropertyElement_PropertyRef(), this.getProperty(), null, "propertyRef", null, 1, 1, ViewPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewAssociationElementEClass, ViewAssociationElement.class, "ViewAssociationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewAssociationElement_ClassRef(), this.getClass_(), null, "classRef", null, 1, 1, ViewAssociationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textViewElementEClass, TextViewElement.class, "TextViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextViewElement_Length(), this.getTextLength(), "length", null, 0, 1, TextViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextViewElement_Format(), ecorePackage.getEString(), "format", null, 0, 1, TextViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimePickerViewElementEClass, DateTimePickerViewElement.class, "DateTimePickerViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimePickerViewElement_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateTimePickerViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionViewElementEClass, SelectionViewElement.class, "SelectionViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectionViewElement_Values(), this.getEnumeration(), null, "values", null, 1, 1, SelectionViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listViewElementEClass, ListViewElement.class, "ListViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListViewElement_Links(), this.getLink(), null, "links", null, 0, -1, ListViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListViewElement_EntrySet(), this.getListEntrySet(), null, "entrySet", null, 1, 1, ListViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEntrySetEClass, ListEntrySet.class, "ListEntrySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListEntrySet_Entries(), this.getListEntry(), null, "entries", null, 0, -1, ListEntrySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListEntrySet_Buttons(), this.getLink(), null, "buttons", null, 0, -1, ListEntrySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEntryEClass, ListEntry.class, "ListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListEntry_PropertyRef(), this.getProperty(), null, "propertyRef", null, 0, 1, ListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableViewElementEClass, TableViewElement.class, "TableViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableViewElement_Links(), this.getLink(), null, "links", null, 0, -1, TableViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableViewElement_ColumnSet(), this.getColumnSet(), null, "columnSet", null, 1, 1, TableViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnSetEClass, ColumnSet.class, "ColumnSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnSet_Columns(), this.getColumn(), null, "columns", null, 0, -1, ColumnSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnSet_Buttons(), this.getLink(), null, "buttons", null, 0, -1, ColumnSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_PropertyRef(), this.getProperty(), null, "propertyRef", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_ConditionID(), ecorePackage.getEString(), "conditionID", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Result(), this.getVisibility(), "result", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonConditionEClass, ComparisonCondition.class, "ComparisonCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonCondition_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ComparisonCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonCondition_Element(), this.getViewElement(), null, "element", null, 0, 1, ComparisonCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeCondition_OperatorType(), this.getOperator(), "operatorType", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_Cond1(), this.getCondition(), null, "cond1", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_Cond2(), this.getCondition(), null, "cond2", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Instance(), this.getClass_(), null, "instance", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_View(), this.getClassOperationView(), null, "view", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(textLengthEEnum, TextLength.class, "TextLength");
		addEEnumLiteral(textLengthEEnum, TextLength.SHORT);
		addEEnumLiteral(textLengthEEnum, TextLength.LONG);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.AND);
		addEEnumLiteral(operatorEEnum, Operator.OR);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.HIDDEN);
		addEEnumLiteral(visibilityEEnum, Visibility.SHOWN);
		addEEnumLiteral(visibilityEEnum, Visibility.ENABLED);
		addEEnumLiteral(visibilityEEnum, Visibility.DISABLED);

		initEEnum(layoutEEnum, Layout.class, "Layout");
		addEEnumLiteral(layoutEEnum, Layout.HORIZONTAL);
		addEEnumLiteral(layoutEEnum, Layout.VERTICAL);

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
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
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
			 "constraints", "lowerConstr upperConstr idConstr idMandatorySuperclass correctType noSelfSubclass noSelfSuperclass superNotSubclass"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueLiteral"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "constraints", "lowerConstrBegin upperConstrBegin lowerConstrEnd upperConstrEnd correctTypeBegin correctTypeEnd"
		   });	
		addAnnotation
		  (domainModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueClassNames uniquedataTypeNames uniqueEnumerationNames uniqueAssociationNames"
		   });	
		addAnnotation
		  (viewPropertyElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "isPropertyMemberOfClass"
		   });	
		addAnnotation
		  (textViewElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "correctType"
		   });	
		addAnnotation
		  (dateTimePickerViewElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "isDateThing"
		   });	
		addAnnotation
		  (selectionViewElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "correctType"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "constraints", "diffConditions"
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
			 "lowerConstr", "self.properties\n\t\t\t\t\t-> forAll (p: Property | p.multiplicityLowerBound = 0 or p.multiplicityLowerBound = 1)",
			 "upperConstr", "self.properties\n\t\t\t\t\t-> forAll (p: Property | p.multiplicityUpperBound = 1)",
			 "idConstr", "if self.isId->notEmpty() then self.isId.multiplicityLowerBound = 1 and self.isId.multiplicityUpperBound = 1 else true endif",
			 "idMandatorySuperclass", "if self.superclass->isEmpty() then self.properties -> includes(self.isId) else self.isId->isEmpty() endif",
			 "correctType", " self.properties \n\t\t\t\t\t-> forAll (p: Property | p.type.oclIsTypeOf(DataType) or p.type.oclIsTypeOf(Enumeration))",
			 "noSelfSubclass", "self.subclass->excludes(self)",
			 "noSelfSuperclass", "self.superclass->excludes(self)",
			 "superNotSubclass", "self.superclass <> self.subclass"
		   });	
		addAnnotation
		  (getClass_Subclass(), 
		   source, 
		   new String[] {
			 "derivation", "Class.allInstances() -> select(superclass = self)"
		   });	
		addAnnotation
		  (getClass_Associations(), 
		   source, 
		   new String[] {
			 "derivation", "Association.allInstances() -> select(begin.type = self)"
		   });	
		addAnnotation
		  (getClass_AssociationsNavigable(), 
		   source, 
		   new String[] {
			 "derivation", "Association.allInstances() -> select(end.type = self)"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "uniqueLiteral", "self.literals->isUnique(name)"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "lowerConstrBegin", "self.begin.multiplicityLowerBound >= 0",
			 "upperConstrBegin", "self.begin.multiplicityUpperBound = -1 \n\t\t\tor (self.begin.multiplicityLowerBound <= self.begin.multiplicityUpperBound and self.begin.multiplicityUpperBound > 0)",
			 "lowerConstrEnd", "self.end.multiplicityLowerBound >= 0",
			 "upperConstrEnd", "self.end.multiplicityUpperBound = -1 \n\t\t\tor (self.end.multiplicityLowerBound <= self.end.multiplicityUpperBound and self.end.multiplicityUpperBound > 0)",
			 "correctTypeBegin", "self.begin.type.oclIsTypeOf(Class)",
			 "correctTypeEnd", "self.end.type.oclIsTypeOf(Class)"
		   });	
		addAnnotation
		  (domainModelEClass, 
		   source, 
		   new String[] {
			 "uniqueClassNames", "self.classes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)",
			 "uniquedataTypeNames", "self.dataTypes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)",
			 "uniqueEnumerationNames", "Enumeration.allInstances()->isUnique(name)",
			 "uniqueAssociationNames", "Association.allInstances()->isUnique(name)"
		   });	
		addAnnotation
		  (viewPropertyElementEClass, 
		   source, 
		   new String[] {
			 "isPropertyMemberOfClass", "\n\t\t(self -> closure(o: ViewElement | o.oclContainer()) -> select(oclIsTypeOf(ClassOperationView)))\n\t\t -> forAll(cov: ClassOperationView | cov.instance.properties->includes(self.propertyRef))"
		   });	
		addAnnotation
		  (textViewElementEClass, 
		   source, 
		   new String[] {
			 "correctType", "self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)"
		   });	
		addAnnotation
		  (dateTimePickerViewElementEClass, 
		   source, 
		   new String[] {
			 "isDateThing", "self.propertyRef.type.oclIsTypeOf(DataType) and \n\t\t\t(self.propertyRef.type.name = \'Date\' or self.propertyRef.type.name = \'Time\' or self.propertyRef.type.name = \'DateTime\')"
		   });	
		addAnnotation
		  (selectionViewElementEClass, 
		   source, 
		   new String[] {
			 "correctType", "self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "diffConditions", "self.cond1 <> self.cond2"
		   });
	}

} //ViewsPackageImpl
