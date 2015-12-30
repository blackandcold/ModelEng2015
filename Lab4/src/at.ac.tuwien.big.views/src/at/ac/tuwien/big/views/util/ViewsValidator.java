/**
 */
package at.ac.tuwien.big.views.util;

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
import at.ac.tuwien.big.views.ViewsPackage;
import at.ac.tuwien.big.views.VisibilityCondition;
import at.ac.tuwien.big.views.VisibilityConditionType;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.views.ViewsPackage
 * @generated
 */
public class ViewsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ViewsValidator INSTANCE = new ViewsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.views";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ViewsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ViewsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case ViewsPackage.DOMAIN_MODEL:
				return validateDomainModel((DomainModel)value, diagnostics, context);
			case ViewsPackage.DOMAIN_MODEL_ELEMENT:
				return validateDomainModelElement((DomainModelElement)value, diagnostics, context);
			case ViewsPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case ViewsPackage.CLASS:
				return validateClass((at.ac.tuwien.big.views.Class)value, diagnostics, context);
			case ViewsPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ViewsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case ViewsPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case ViewsPackage.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ViewsPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ViewsPackage.VIEW_MODEL:
				return validateViewModel((ViewModel)value, diagnostics, context);
			case ViewsPackage.VIEW_GROUP:
				return validateViewGroup((ViewGroup)value, diagnostics, context);
			case ViewsPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case ViewsPackage.CLASS_INDEX_VIEW:
				return validateClassIndexView((ClassIndexView)value, diagnostics, context);
			case ViewsPackage.CLASS_OPERATION_VIEW:
				return validateClassOperationView((ClassOperationView)value, diagnostics, context);
			case ViewsPackage.CREATE_VIEW:
				return validateCreateView((CreateView)value, diagnostics, context);
			case ViewsPackage.READ_VIEW:
				return validateReadView((ReadView)value, diagnostics, context);
			case ViewsPackage.UPDATE_VIEW:
				return validateUpdateView((UpdateView)value, diagnostics, context);
			case ViewsPackage.DELETE_VIEW:
				return validateDeleteView((DeleteView)value, diagnostics, context);
			case ViewsPackage.ELEMENT_GROUP:
				return validateElementGroup((ElementGroup)value, diagnostics, context);
			case ViewsPackage.VIEW_ELEMENT:
				return validateViewElement((ViewElement)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION_ELEMENT:
				return validateAssociationElement((AssociationElement)value, diagnostics, context);
			case ViewsPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case ViewsPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case ViewsPackage.PROPERTY_ELEMENT:
				return validatePropertyElement((PropertyElement)value, diagnostics, context);
			case ViewsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case ViewsPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case ViewsPackage.DATE_TIME_PICKER:
				return validateDateTimePicker((DateTimePicker)value, diagnostics, context);
			case ViewsPackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case ViewsPackage.VISIBILITY_CONDITION:
				return validateVisibilityCondition((VisibilityCondition)value, diagnostics, context);
			case ViewsPackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition)value, diagnostics, context);
			case ViewsPackage.COMPARISON_CONDITION:
				return validateComparisonCondition((ComparisonCondition)value, diagnostics, context);
			case ViewsPackage.LAYOUTABLE_ELEMENT:
				return validateLayoutableElement((LayoutableElement)value, diagnostics, context);
			case ViewsPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			case ViewsPackage.LINKABLE_ELEMENT:
				return validateLinkableElement((LinkableElement)value, diagnostics, context);
			case ViewsPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case ViewsPackage.SELECTION_ITEM:
				return validateSelectionItem((SelectionItem)value, diagnostics, context);
			case ViewsPackage.ENUMERATION_LITERAL_ITEM:
				return validateEnumerationLiteralItem((EnumerationLiteralItem)value, diagnostics, context);
			case ViewsPackage.CONDITIONAL_ELEMENT:
				return validateConditionalElement((ConditionalElement)value, diagnostics, context);
			case ViewsPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case ViewsPackage.VISIBILITY_CONDITION_TYPE:
				return validateVisibilityConditionType((VisibilityConditionType)value, diagnostics, context);
			case ViewsPackage.COMPOSITE_CONDITION_TYPE:
				return validateCompositeConditionType((CompositeConditionType)value, diagnostics, context);
			case ViewsPackage.COMPARISON_CONDITION_TYPE:
				return validateComparisonConditionType((ComparisonConditionType)value, diagnostics, context);
			case ViewsPackage.LAYOUT_STYLE:
				return validateLayoutStyle((LayoutStyle)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModelElement(DomainModelElement domainModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainModelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_UniqueIdIsContainedOrInherited(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_ClassPropertyTypeIsValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_ClassPropertyBoundsAreValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_IdBoundsAreValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_NoCyclicInheritance(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueIdIsContainedOrInherited constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__UNIQUE_ID_IS_CONTAINED_OR_INHERITED__EEXPRESSION = "\n" +
		"\t\t \tself.properties -> includes(self.id) \n" +
		"\t\t \tor self.superClass.properties -> closure(superClass.properties) -> includes(self.id)";

	/**
	 * Validates the UniqueIdIsContainedOrInherited constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_UniqueIdIsContainedOrInherited(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueIdIsContainedOrInherited",
				 CLASS__UNIQUE_ID_IS_CONTAINED_OR_INHERITED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ClassPropertyTypeIsValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__CLASS_PROPERTY_TYPE_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.properties -> \n" +
		"\t\t\tforAll(p | p.type.oclIsTypeOf(DataType) xor p.type.oclIsTypeOf(Enumeration))";

	/**
	 * Validates the ClassPropertyTypeIsValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_ClassPropertyTypeIsValid(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClassPropertyTypeIsValid",
				 CLASS__CLASS_PROPERTY_TYPE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ClassPropertyBoundsAreValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__CLASS_PROPERTY_BOUNDS_ARE_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.properties -> \n" +
		"\t\t\tforAll(p | p.upperBound = 1 and (p.lowerBound = 0 xor p.lowerBound = 1))";

	/**
	 * Validates the ClassPropertyBoundsAreValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_ClassPropertyBoundsAreValid(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClassPropertyBoundsAreValid",
				 CLASS__CLASS_PROPERTY_BOUNDS_ARE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IdBoundsAreValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__ID_BOUNDS_ARE_VALID__EEXPRESSION = "\n" +
		"\t\t \tself.id.upperBound = 1 and self.id.lowerBound = 1";

	/**
	 * Validates the IdBoundsAreValid constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_IdBoundsAreValid(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdBoundsAreValid",
				 CLASS__ID_BOUNDS_ARE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCyclicInheritance constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__NO_CYCLIC_INHERITANCE__EEXPRESSION = "\n" +
		"\t\t\tself.superClass -> closure(superClass) -> excludes(self)";

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_NoCyclicInheritance(at.ac.tuwien.big.views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoCyclicInheritance",
				 CLASS__NO_CYCLIC_INHERITANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_AssociationPropertyBoundsAreValid(association, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AssociationPropertyBoundsAreValid constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__ASSOCIATION_PROPERTY_BOUNDS_ARE_VALID__EEXPRESSION = "\n" +
		"\t\t \tself.associationEnds -> forAll(p | p.lowerBound >= 0 and (p.upperBound <> 0 or p.upperBound >= p.lowerBound or p.upperBound = -1))";

	/**
	 * Validates the AssociationPropertyBoundsAreValid constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_AssociationPropertyBoundsAreValid(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AssociationPropertyBoundsAreValid",
				 ASSOCIATION__ASSOCIATION_PROPERTY_BOUNDS_ARE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewModel(ViewModel viewModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewGroup_OneStartViewExistsWithinAViewGroup(viewGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewGroup_OneWelcomeGroupExists(viewGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneStartViewExistsWithinAViewGroup constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_GROUP__ONE_START_VIEW_EXISTS_WITHIN_AVIEW_GROUP__EEXPRESSION = "\n" +
		"\t\t\tself.views -> select(v | v.startView = true) -> size() = 1";

	/**
	 * Validates the OneStartViewExistsWithinAViewGroup constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup_OneStartViewExistsWithinAViewGroup(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_GROUP,
				 viewGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneStartViewExistsWithinAViewGroup",
				 VIEW_GROUP__ONE_START_VIEW_EXISTS_WITHIN_AVIEW_GROUP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneWelcomeGroupExists constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_GROUP__ONE_WELCOME_GROUP_EXISTS__EEXPRESSION = "\n" +
		"\t\t\tViewGroup.allInstances() -> select(v | v.welcomeViewGroup = true) -> size() = 1";

	/**
	 * Validates the OneWelcomeGroupExists constraint of '<em>View Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewGroup_OneWelcomeGroupExists(ViewGroup viewGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_GROUP,
				 viewGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneWelcomeGroupExists",
				 VIEW_GROUP__ONE_WELCOME_GROUP_EXISTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(view, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassIndexView(ClassIndexView classIndexView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classIndexView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classIndexView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassIndexView_TargetViewOfClassIndexViewLinksIsValid(classIndexView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TargetViewOfClassIndexViewLinksIsValid constraint of '<em>Class Index View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_INDEX_VIEW__TARGET_VIEW_OF_CLASS_INDEX_VIEW_LINKS_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.link.targetView.class  -> includes(self.class) or self.link -> isEmpty()";

	/**
	 * Validates the TargetViewOfClassIndexViewLinksIsValid constraint of '<em>Class Index View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassIndexView_TargetViewOfClassIndexViewLinksIsValid(ClassIndexView classIndexView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS_INDEX_VIEW,
				 classIndexView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TargetViewOfClassIndexViewLinksIsValid",
				 CLASS_INDEX_VIEW__TARGET_VIEW_OF_CLASS_INDEX_VIEW_LINKS_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classOperationView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementsReferToValidClassProperties(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_AssociationElementsReferToValidClass(classOperationView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(classOperationView, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PropertyElementsReferToValidClassProperties constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_OPERATION_VIEW__PROPERTY_ELEMENTS_REFER_TO_VALID_CLASS_PROPERTIES__EEXPRESSION = "\n" +
		"\t\t\tself.class.properties -> union(self.class -> closure(superClass).properties) -> \n" +
		"\t\t\tincludesAll(self.elementGroups.viewElements -> selectByKind(PropertyElement).property)";

	/**
	 * Validates the PropertyElementsReferToValidClassProperties constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView_PropertyElementsReferToValidClassProperties(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS_OPERATION_VIEW,
				 classOperationView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PropertyElementsReferToValidClassProperties",
				 CLASS_OPERATION_VIEW__PROPERTY_ELEMENTS_REFER_TO_VALID_CLASS_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssociationElementsReferToValidClass constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_OPERATION_VIEW__ASSOCIATION_ELEMENTS_REFER_TO_VALID_CLASS__EEXPRESSION = "\n" +
		"\t\t\tself.elementGroups.viewElements -> selectByKind(AssociationElement) -> \n" +
		"\t\t\tforAll(a | a.association.associationEnds -> excluding(a.association.navigableEnd).type \n" +
		"\t\t\t-> includesAll(self.class -> union(self.class -> closure(superClass))))";

	/**
	 * Validates the AssociationElementsReferToValidClass constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView_AssociationElementsReferToValidClass(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS_OPERATION_VIEW,
				 classOperationView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AssociationElementsReferToValidClass",
				 CLASS_OPERATION_VIEW__ASSOCIATION_ELEMENTS_REFER_TO_VALID_CLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PropertyElementOfComparisonConditionsIsValid constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS_OPERATION_VIEW__PROPERTY_ELEMENT_OF_COMPARISON_CONDITIONS_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.elementGroups.viewElements -> includesAll(\n" +
		"\t\t\tself.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition) \n" +
		"\t\t\t-> collect(v:CompositeCondition|v.composedConditions) -> selectByKind(ComparisonCondition).property \n" +
		"\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(ComparisonCondition).property) \n" +
		"\t\t\t-> union(self.elementGroups.condition -> union(self.elementGroups.viewElements.condition) -> selectByKind(CompositeCondition).composedConditions -> selectByKind(ComparisonCondition).property)\n" +
		"\t\t\t-> asSet())";

	/**
	 * Validates the PropertyElementOfComparisonConditionsIsValid constraint of '<em>Class Operation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS_OPERATION_VIEW,
				 classOperationView,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PropertyElementOfComparisonConditionsIsValid",
				 CLASS_OPERATION_VIEW__PROPERTY_ELEMENT_OF_COMPARISON_CONDITIONS_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateView(CreateView createView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementsReferToValidClassProperties(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_AssociationElementsReferToValidClass(createView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(createView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadView(ReadView readView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementsReferToValidClassProperties(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_AssociationElementsReferToValidClass(readView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(readView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateView(UpdateView updateView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(updateView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementsReferToValidClassProperties(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_AssociationElementsReferToValidClass(updateView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(updateView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteView(DeleteView deleteView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deleteView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementsReferToValidClassProperties(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_AssociationElementsReferToValidClass(deleteView, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassOperationView_PropertyElementOfComparisonConditionsIsValid(deleteView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementGroup(ElementGroup elementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewElement(ViewElement viewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(viewElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ElementIdIsUnique constraint of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tViewElement.allInstances() -> select(e | e.elementID = self.elementID) -> excluding(self) ->isEmpty()";

	/**
	 * Validates the ElementIdIsUnique constraint of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewElement_ElementIdIsUnique(ViewElement viewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_ELEMENT,
				 viewElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ElementIdIsUnique",
				 VIEW_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationElement(AssociationElement associationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(associationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationElement_TargetViewOfAssociationElementLinksIsValid(associationElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TargetViewOfAssociationElementLinksIsValid constraint of '<em>Association Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_ELEMENT__TARGET_VIEW_OF_ASSOCIATION_ELEMENT_LINKS_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.link.targetView.class  -> includes(self.association.navigableEnd.type) or self.link -> isEmpty()";

	/**
	 * Validates the TargetViewOfAssociationElementLinksIsValid constraint of '<em>Association Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationElement_TargetViewOfAssociationElementLinksIsValid(AssociationElement associationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION_ELEMENT,
				 associationElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TargetViewOfAssociationElementLinksIsValid",
				 ASSOCIATION_ELEMENT__TARGET_VIEW_OF_ASSOCIATION_ELEMENT_LINKS_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationElement_TargetViewOfAssociationElementLinksIsValid(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationElement_TargetViewOfAssociationElementLinksIsValid(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_TableColumnRefersToTargetViewClassProperty(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TableColumnRefersToTargetViewClassProperty constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__TABLE_COLUMN_REFERS_TO_TARGET_VIEW_CLASS_PROPERTY__EEXPRESSION = "\n" +
		"\t\t\tself.association.navigableEnd.type -> selectByType(Class).properties ->\n" +
		"\t\t\tunion(self.association.navigableEnd.type -> selectByType(Class) -> \n" +
		"\t\t\tclosure(superClass).properties) -> includesAll(self.columns.property)";

	/**
	 * Validates the TableColumnRefersToTargetViewClassProperty constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_TableColumnRefersToTargetViewClassProperty(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.TABLE,
				 table,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TableColumnRefersToTargetViewClassProperty",
				 TABLE__TABLE_COLUMN_REFERS_TO_TARGET_VIEW_CLASS_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyElement(PropertyElement propertyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(propertyElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(column, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_PropertyTypeOfTextIsValid(text, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PropertyTypeOfTextIsValid constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEXT__PROPERTY_TYPE_OF_TEXT_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)";

	/**
	 * Validates the PropertyTypeOfTextIsValid constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_PropertyTypeOfTextIsValid(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.TEXT,
				 text,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PropertyTypeOfTextIsValid",
				 TEXT__PROPERTY_TYPE_OF_TEXT_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePicker(DateTimePicker dateTimePicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTimePicker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(dateTimePicker, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePicker_PropertyTypeOfDateTimePickerIsValid(dateTimePicker, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PropertyTypeOfDateTimePickerIsValid constraint of '<em>Date Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATE_TIME_PICKER__PROPERTY_TYPE_OF_DATE_TIME_PICKER_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.property.type.oclIsTypeOf(DataType) and\n" +
		"\t\t\t(self.property.type.name = 'Date' or \n" +
		"\t\t\t self.property.type.name = 'Time' or\n" +
		"\t\t\t self.property.type.name = 'DateTime'\n" +
		"\t\t\t)";

	/**
	 * Validates the PropertyTypeOfDateTimePickerIsValid constraint of '<em>Date Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePicker_PropertyTypeOfDateTimePickerIsValid(DateTimePicker dateTimePicker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DATE_TIME_PICKER,
				 dateTimePicker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PropertyTypeOfDateTimePickerIsValid",
				 DATE_TIME_PICKER__PROPERTY_TYPE_OF_DATE_TIME_PICKER_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewElement_ElementIdIsUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelection_PropertyTypeOfSelectionIsValid(selection, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PropertyTypeOfSelectionIsValid constraint of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION__PROPERTY_TYPE_OF_SELECTION_IS_VALID__EEXPRESSION = "\n" +
		"\t\t\tself.property.type.oclIsTypeOf(DataType) xor self.property.type.oclIsTypeOf(Enumeration)";

	/**
	 * Validates the PropertyTypeOfSelectionIsValid constraint of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection_PropertyTypeOfSelectionIsValid(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.SELECTION,
				 selection,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PropertyTypeOfSelectionIsValid",
				 SELECTION__PROPERTY_TYPE_OF_SELECTION_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityCondition(VisibilityCondition visibilityCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(visibilityCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(visibilityCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateVisibilityCondition_ConditionIdIsUnique(visibilityCondition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConditionIdIsUnique constraint of '<em>Visibility Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VISIBILITY_CONDITION__CONDITION_ID_IS_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tVisibilityCondition.allInstances() -> select(c | c.conditionID = self.conditionID) -> excluding(self) -> isEmpty()";

	/**
	 * Validates the ConditionIdIsUnique constraint of '<em>Visibility Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityCondition_ConditionIdIsUnique(VisibilityCondition visibilityCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VISIBILITY_CONDITION,
				 visibilityCondition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConditionIdIsUnique",
				 VISIBILITY_CONDITION__CONDITION_ID_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateVisibilityCondition_ConditionIdIsUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeCondition_ComposedConditionTypesAreEqual(compositeCondition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ComposedConditionTypesAreEqual constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_CONDITION__COMPOSED_CONDITION_TYPES_ARE_EQUAL__EEXPRESSION = "\n" +
		"\t\t\tself.composedConditions -> forAll(c | c.type = self.type)";

	/**
	 * Validates the ComposedConditionTypesAreEqual constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition_ComposedConditionTypesAreEqual(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.COMPOSITE_CONDITION,
				 compositeCondition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ComposedConditionTypesAreEqual",
				 COMPOSITE_CONDITION__COMPOSED_CONDITION_TYPES_ARE_EQUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonCondition(ComparisonCondition comparisonCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comparisonCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comparisonCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateVisibilityCondition_ConditionIdIsUnique(comparisonCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutableElement(LayoutableElement layoutableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layoutableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkableElement(LinkableElement linkableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionItem(SelectionItem selectionItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteralItem(EnumerationLiteralItem enumerationLiteralItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteralItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalElement(ConditionalElement conditionalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityConditionType(VisibilityConditionType visibilityConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeConditionType(CompositeConditionType compositeConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonConditionType(ComparisonConditionType comparisonConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutStyle(LayoutStyle layoutStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ViewsValidator
