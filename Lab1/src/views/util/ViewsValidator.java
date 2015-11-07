/**
 */
package views.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
import views.ViewsPackage;
import views.Visibility;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see views.ViewsPackage
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
	public static final String DIAGNOSTIC_SOURCE = "views";

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
			case ViewsPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ViewsPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case ViewsPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ViewsPackage.CLASS:
				return validateClass((views.Class)value, diagnostics, context);
			case ViewsPackage.ENUM_LITERAL:
				return validateEnumLiteral((EnumLiteral)value, diagnostics, context);
			case ViewsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case ViewsPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ViewsPackage.DOMAIN_MODEL:
				return validateDomainModel((DomainModel)value, diagnostics, context);
			case ViewsPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case ViewsPackage.VIEW_MODEL:
				return validateViewModel((ViewModel)value, diagnostics, context);
			case ViewsPackage.VIEW_GROUP:
				return validateViewGroup((ViewGroup)value, diagnostics, context);
			case ViewsPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case ViewsPackage.CLASS_INDEX_VIEW:
				return validateClassIndexView((ClassIndexView<?>)value, diagnostics, context);
			case ViewsPackage.CLASS_OPERATION_VIEW:
				return validateClassOperationView((ClassOperationView)value, diagnostics, context);
			case ViewsPackage.VIEW_ELEMENT:
				return validateViewElement((ViewElement)value, diagnostics, context);
			case ViewsPackage.VIEW_ELEMENT_GROUP:
				return validateViewElementGroup((ViewElementGroup)value, diagnostics, context);
			case ViewsPackage.VIEW_PROPERTY_ELEMENT:
				return validateViewPropertyElement((ViewPropertyElement)value, diagnostics, context);
			case ViewsPackage.VIEW_ASSOCIATION_ELEMENT:
				return validateViewAssociationElement((ViewAssociationElement)value, diagnostics, context);
			case ViewsPackage.TEXT_VIEW_ELEMENT:
				return validateTextViewElement((TextViewElement)value, diagnostics, context);
			case ViewsPackage.DATE_TIME_PICKER_VIEW_ELEMENT:
				return validateDateTimePickerViewElement((DateTimePickerViewElement)value, diagnostics, context);
			case ViewsPackage.SELECTION_VIEW_ELEMENT:
				return validateSelectionViewElement((SelectionViewElement)value, diagnostics, context);
			case ViewsPackage.LIST_VIEW_ELEMENT:
				return validateListViewElement((ListViewElement)value, diagnostics, context);
			case ViewsPackage.LIST_ENTRY_SET:
				return validateListEntrySet((ListEntrySet)value, diagnostics, context);
			case ViewsPackage.LIST_ENTRY:
				return validateListEntry((ListEntry)value, diagnostics, context);
			case ViewsPackage.TABLE_VIEW_ELEMENT:
				return validateTableViewElement((TableViewElement)value, diagnostics, context);
			case ViewsPackage.COLUMN_SET:
				return validateColumnSet((ColumnSet)value, diagnostics, context);
			case ViewsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case ViewsPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case ViewsPackage.COMPARISON_CONDITION:
				return validateComparisonCondition((ComparisonCondition)value, diagnostics, context);
			case ViewsPackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition)value, diagnostics, context);
			case ViewsPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case ViewsPackage.TEXT_LENGTH:
				return validateTextLength((TextLength)value, diagnostics, context);
			case ViewsPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case ViewsPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case ViewsPackage.LAYOUT:
				return validateLayout((Layout)value, diagnostics, context);
			default:
				return true;
		}
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
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
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
	public boolean validateClass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_lowerConstr(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_upperConstr(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_idConstr(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_idMandatorySuperclass(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_correctType(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_noSelfSubclass(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_noSelfSuperclass(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_superNotSubclass(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lowerConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__LOWER_CONSTR__EEXPRESSION = "self.properties\n" +
		"\t\t\t\t\t-> forAll (p: Property | p.multiplicityLowerBound = 0 or p.multiplicityLowerBound = 1)";

	/**
	 * Validates the lowerConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_lowerConstr(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerConstr",
				 CLASS__LOWER_CONSTR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the upperConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__UPPER_CONSTR__EEXPRESSION = "self.properties\n" +
		"\t\t\t\t\t-> forAll (p: Property | p.multiplicityUpperBound = 1)";

	/**
	 * Validates the upperConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_upperConstr(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "upperConstr",
				 CLASS__UPPER_CONSTR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__ID_CONSTR__EEXPRESSION = "if self.isId->notEmpty() then self.isId.multiplicityLowerBound = 1 and self.isId.multiplicityUpperBound = 1 else true endif";

	/**
	 * Validates the idConstr constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_idConstr(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idConstr",
				 CLASS__ID_CONSTR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idMandatorySuperclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__ID_MANDATORY_SUPERCLASS__EEXPRESSION = "if self.superclass->isEmpty() then self.properties -> includes(self.isId) else self.isId->isEmpty() endif";

	/**
	 * Validates the idMandatorySuperclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_idMandatorySuperclass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idMandatorySuperclass",
				 CLASS__ID_MANDATORY_SUPERCLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctType constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__CORRECT_TYPE__EEXPRESSION = " self.properties \n" +
		"\t\t\t\t\t-> forAll (p: Property | p.type.oclIsTypeOf(DataType) or p.type.oclIsTypeOf(Enumeration))";

	/**
	 * Validates the correctType constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_correctType(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctType",
				 CLASS__CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noSelfSubclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__NO_SELF_SUBCLASS__EEXPRESSION = "self.subclass->excludes(self)";

	/**
	 * Validates the noSelfSubclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_noSelfSubclass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noSelfSubclass",
				 CLASS__NO_SELF_SUBCLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noSelfSuperclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__NO_SELF_SUPERCLASS__EEXPRESSION = "self.superclass->excludes(self)";

	/**
	 * Validates the noSelfSuperclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_noSelfSuperclass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noSelfSuperclass",
				 CLASS__NO_SELF_SUPERCLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the superNotSubclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__SUPER_NOT_SUBCLASS__EEXPRESSION = "self.superclass <> self.subclass";

	/**
	 * Validates the superNotSubclass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_superNotSubclass(views.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "superNotSubclass",
				 CLASS__SUPER_NOT_SUBCLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteral(EnumLiteral enumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_uniqueLiteral(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueLiteral constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION__UNIQUE_LITERAL__EEXPRESSION = "self.literals->isUnique(name)";

	/**
	 * Validates the uniqueLiteral constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_uniqueLiteral(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ENUMERATION,
				 enumeration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLiteral",
				 ENUMERATION__UNIQUE_LITERAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateAssociation_lowerConstrBegin(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_upperConstrBegin(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_lowerConstrEnd(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_upperConstrEnd(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_correctTypeBegin(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_correctTypeEnd(association, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lowerConstrBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__LOWER_CONSTR_BEGIN__EEXPRESSION = "self.begin.multiplicityLowerBound >= 0";

	/**
	 * Validates the lowerConstrBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_lowerConstrBegin(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerConstrBegin",
				 ASSOCIATION__LOWER_CONSTR_BEGIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the upperConstrBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__UPPER_CONSTR_BEGIN__EEXPRESSION = "self.begin.multiplicityUpperBound = -1 \n" +
		"\t\t\tor (self.begin.multiplicityLowerBound <= self.begin.multiplicityUpperBound and self.begin.multiplicityUpperBound > 0)";

	/**
	 * Validates the upperConstrBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_upperConstrBegin(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "upperConstrBegin",
				 ASSOCIATION__UPPER_CONSTR_BEGIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the lowerConstrEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__LOWER_CONSTR_END__EEXPRESSION = "self.end.multiplicityLowerBound >= 0";

	/**
	 * Validates the lowerConstrEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_lowerConstrEnd(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerConstrEnd",
				 ASSOCIATION__LOWER_CONSTR_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the upperConstrEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__UPPER_CONSTR_END__EEXPRESSION = "self.end.multiplicityUpperBound = -1 \n" +
		"\t\t\tor (self.end.multiplicityLowerBound <= self.end.multiplicityUpperBound and self.end.multiplicityUpperBound > 0)";

	/**
	 * Validates the upperConstrEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_upperConstrEnd(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "upperConstrEnd",
				 ASSOCIATION__UPPER_CONSTR_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctTypeBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__CORRECT_TYPE_BEGIN__EEXPRESSION = "self.begin.type.oclIsTypeOf(Class)";

	/**
	 * Validates the correctTypeBegin constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_correctTypeBegin(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctTypeBegin",
				 ASSOCIATION__CORRECT_TYPE_BEGIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctTypeEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__CORRECT_TYPE_END__EEXPRESSION = "self.end.type.oclIsTypeOf(Class)";

	/**
	 * Validates the correctTypeEnd constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_correctTypeEnd(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctTypeEnd",
				 ASSOCIATION__CORRECT_TYPE_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_uniqueClassNames(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_uniquedataTypeNames(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_uniqueEnumerationNames(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_uniqueAssociationNames(domainModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueClassNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__UNIQUE_CLASS_NAMES__EEXPRESSION = "self.classes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniqueClassNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_uniqueClassNames(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DOMAIN_MODEL,
				 domainModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueClassNames",
				 DOMAIN_MODEL__UNIQUE_CLASS_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniquedataTypeNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__UNIQUEDATA_TYPE_NAMES__EEXPRESSION = "self.dataTypes->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniquedataTypeNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_uniquedataTypeNames(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DOMAIN_MODEL,
				 domainModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquedataTypeNames",
				 DOMAIN_MODEL__UNIQUEDATA_TYPE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueEnumerationNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__UNIQUE_ENUMERATION_NAMES__EEXPRESSION = "Enumeration.allInstances()->isUnique(name)";

	/**
	 * Validates the uniqueEnumerationNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_uniqueEnumerationNames(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DOMAIN_MODEL,
				 domainModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueEnumerationNames",
				 DOMAIN_MODEL__UNIQUE_ENUMERATION_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueAssociationNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__UNIQUE_ASSOCIATION_NAMES__EEXPRESSION = "Association.allInstances()->isUnique(name)";

	/**
	 * Validates the uniqueAssociationNames constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_uniqueAssociationNames(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DOMAIN_MODEL,
				 domainModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueAssociationNames",
				 DOMAIN_MODEL__UNIQUE_ASSOCIATION_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
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
		return validate_EveryDefaultConstraint(viewGroup, diagnostics, context);
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
	public boolean validateClassIndexView(ClassIndexView<?> classIndexView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classIndexView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperationView(ClassOperationView classOperationView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classOperationView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewElement(ViewElement viewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewElementGroup(ViewElementGroup viewElementGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewElementGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewPropertyElement(ViewPropertyElement viewPropertyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewPropertyElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewPropertyElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewPropertyElement_isPropertyMemberOfClass(viewPropertyElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isPropertyMemberOfClass constraint of '<em>View Property Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIEW_PROPERTY_ELEMENT__IS_PROPERTY_MEMBER_OF_CLASS__EEXPRESSION = "\n" +
		"\t\t(self -> closure(o: ViewElement | o.oclContainer()) -> select(oclIsTypeOf(ClassOperationView)))\n" +
		"\t\t -> forAll(cov: ClassOperationView | cov.instance.properties->includes(self.propertyRef))";

	/**
	 * Validates the isPropertyMemberOfClass constraint of '<em>View Property Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewPropertyElement_isPropertyMemberOfClass(ViewPropertyElement viewPropertyElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.VIEW_PROPERTY_ELEMENT,
				 viewPropertyElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isPropertyMemberOfClass",
				 VIEW_PROPERTY_ELEMENT__IS_PROPERTY_MEMBER_OF_CLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewAssociationElement(ViewAssociationElement viewAssociationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewAssociationElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextViewElement(TextViewElement textViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textViewElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewPropertyElement_isPropertyMemberOfClass(textViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextViewElement_correctType(textViewElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correctType constraint of '<em>Text View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEXT_VIEW_ELEMENT__CORRECT_TYPE__EEXPRESSION = "self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)";

	/**
	 * Validates the correctType constraint of '<em>Text View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextViewElement_correctType(TextViewElement textViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.TEXT_VIEW_ELEMENT,
				 textViewElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctType",
				 TEXT_VIEW_ELEMENT__CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePickerViewElement(DateTimePickerViewElement dateTimePickerViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTimePickerViewElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewPropertyElement_isPropertyMemberOfClass(dateTimePickerViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePickerViewElement_isDateThing(dateTimePickerViewElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isDateThing constraint of '<em>Date Time Picker View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATE_TIME_PICKER_VIEW_ELEMENT__IS_DATE_THING__EEXPRESSION = "self.propertyRef.type.oclIsTypeOf(DataType) and \n" +
		"\t\t\t(self.propertyRef.type.name = 'Date' or self.propertyRef.type.name = 'Time' or self.propertyRef.type.name = 'DateTime')";

	/**
	 * Validates the isDateThing constraint of '<em>Date Time Picker View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePickerViewElement_isDateThing(DateTimePickerViewElement dateTimePickerViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.DATE_TIME_PICKER_VIEW_ELEMENT,
				 dateTimePickerViewElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isDateThing",
				 DATE_TIME_PICKER_VIEW_ELEMENT__IS_DATE_THING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionViewElement(SelectionViewElement selectionViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionViewElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewPropertyElement_isPropertyMemberOfClass(selectionViewElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionViewElement_correctType(selectionViewElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correctType constraint of '<em>Selection View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_VIEW_ELEMENT__CORRECT_TYPE__EEXPRESSION = "self.propertyRef.type.oclIsTypeOf(DataType) or self.propertyRef.type.oclIsTypeOf(Enumeration)";

	/**
	 * Validates the correctType constraint of '<em>Selection View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionViewElement_correctType(SelectionViewElement selectionViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.SELECTION_VIEW_ELEMENT,
				 selectionViewElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctType",
				 SELECTION_VIEW_ELEMENT__CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListViewElement(ListViewElement listViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listViewElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntrySet(ListEntrySet listEntrySet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntrySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntry(ListEntry listEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableViewElement(TableViewElement tableViewElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableViewElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnSet(ColumnSet columnSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
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
	public boolean validateComparisonCondition(ComparisonCondition comparisonCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonCondition, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCompositeCondition_diffConditions(compositeCondition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the diffConditions constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_CONDITION__DIFF_CONDITIONS__EEXPRESSION = "self.cond1 <> self.cond2";

	/**
	 * Validates the diffConditions constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition_diffConditions(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ViewsPackage.Literals.COMPOSITE_CONDITION,
				 compositeCondition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "diffConditions",
				 COMPOSITE_CONDITION__DIFF_CONDITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateTextLength(TextLength textLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayout(Layout layout, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
