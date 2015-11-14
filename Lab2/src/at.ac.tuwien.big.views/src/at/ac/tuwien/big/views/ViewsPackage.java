/**
 */
package at.ac.tuwien.big.views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.views.ViewsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = at.ac.tuwien.big.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.NamedElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.DomainModelImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Domain Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_MODEL_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.DomainModelElementImpl <em>Domain Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.DomainModelElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDomainModelElement()
	 * @generated
	 */
	int DOMAIN_MODEL_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Domain Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Domain Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.TypeImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = DOMAIN_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ClassImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.DataTypeImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.EnumerationImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.EnumerationLiteralImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.MultiplicityElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.AssociationImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_COMPOSITION = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_ENDS = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navigable End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAVIGABLE_END = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = DOMAIN_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = DOMAIN_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.PropertyImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = MULTIPLICITY_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = MULTIPLICITY_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ViewModelImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 11;

	/**
	 * The feature id for the '<em><b>View Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__VIEW_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ViewGroupImpl <em>View Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ViewGroupImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewGroup()
	 * @generated
	 */
	int VIEW_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__VIEWS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Welcome View Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__WELCOME_VIEW_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HEADER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CLASS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__START_VIEW = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.LinkableElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLinkableElement()
	 * @generated
	 */
	int LINKABLE_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__LINK = 0;

	/**
	 * The number of structural features of the '<em>Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ClassIndexViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClassIndexView()
	 * @generated
	 */
	int CLASS_INDEX_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__LINK = LINKABLE_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__NAME = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__HEADER = LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__DESCRIPTION = LINKABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__CLASS = LINKABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__START_VIEW = LINKABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_OPERATION_COUNT = LINKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ClassOperationViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClassOperationView()
	 * @generated
	 */
	int CLASS_OPERATION_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__HEADER = VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__CLASS = VIEW__CLASS;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__START_VIEW = VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__LAYOUT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__ELEMENT_GROUPS = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.CreateViewImpl <em>Create View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.CreateViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCreateView()
	 * @generated
	 */
	int CREATE_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__NAME = CLASS_OPERATION_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__HEADER = CLASS_OPERATION_VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__DESCRIPTION = CLASS_OPERATION_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__CLASS = CLASS_OPERATION_VIEW__CLASS;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__START_VIEW = CLASS_OPERATION_VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__LAYOUT = CLASS_OPERATION_VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Element Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__ELEMENT_GROUPS = CLASS_OPERATION_VIEW__ELEMENT_GROUPS;

	/**
	 * The number of structural features of the '<em>Create View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_FEATURE_COUNT = CLASS_OPERATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_OPERATION_COUNT = CLASS_OPERATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ReadViewImpl <em>Read View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ReadViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getReadView()
	 * @generated
	 */
	int READ_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__NAME = CLASS_OPERATION_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__HEADER = CLASS_OPERATION_VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__DESCRIPTION = CLASS_OPERATION_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__CLASS = CLASS_OPERATION_VIEW__CLASS;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__START_VIEW = CLASS_OPERATION_VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__LAYOUT = CLASS_OPERATION_VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Element Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW__ELEMENT_GROUPS = CLASS_OPERATION_VIEW__ELEMENT_GROUPS;

	/**
	 * The number of structural features of the '<em>Read View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW_FEATURE_COUNT = CLASS_OPERATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VIEW_OPERATION_COUNT = CLASS_OPERATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.UpdateViewImpl <em>Update View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.UpdateViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getUpdateView()
	 * @generated
	 */
	int UPDATE_VIEW = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__NAME = CLASS_OPERATION_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__HEADER = CLASS_OPERATION_VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__DESCRIPTION = CLASS_OPERATION_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__CLASS = CLASS_OPERATION_VIEW__CLASS;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__START_VIEW = CLASS_OPERATION_VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__LAYOUT = CLASS_OPERATION_VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Element Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW__ELEMENT_GROUPS = CLASS_OPERATION_VIEW__ELEMENT_GROUPS;

	/**
	 * The number of structural features of the '<em>Update View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW_FEATURE_COUNT = CLASS_OPERATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIEW_OPERATION_COUNT = CLASS_OPERATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.DeleteViewImpl <em>Delete View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.DeleteViewImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDeleteView()
	 * @generated
	 */
	int DELETE_VIEW = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__NAME = CLASS_OPERATION_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__HEADER = CLASS_OPERATION_VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__DESCRIPTION = CLASS_OPERATION_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__CLASS = CLASS_OPERATION_VIEW__CLASS;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__START_VIEW = CLASS_OPERATION_VIEW__START_VIEW;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__LAYOUT = CLASS_OPERATION_VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Element Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW__ELEMENT_GROUPS = CLASS_OPERATION_VIEW__ELEMENT_GROUPS;

	/**
	 * The number of structural features of the '<em>Delete View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW_FEATURE_COUNT = CLASS_OPERATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_VIEW_OPERATION_COUNT = CLASS_OPERATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.LayoutableElementImpl <em>Layoutable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.LayoutableElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayoutableElement()
	 * @generated
	 */
	int LAYOUTABLE_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_ELEMENT__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Layoutable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layoutable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ElementGroupImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__LAYOUT = LAYOUTABLE_ELEMENT__LAYOUT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__CONDITION = LAYOUTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__HEADER = LAYOUTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__VIEW_ELEMENTS = LAYOUTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = LAYOUTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_OPERATION_COUNT = LAYOUTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ConditionalElementImpl <em>Conditional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ConditionalElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getConditionalElement()
	 * @generated
	 */
	int CONDITIONAL_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ELEMENT__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conditional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ViewElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CONDITION = CONDITIONAL_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__LABEL = CONDITIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ELEMENT_ID = CONDITIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = CONDITIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = CONDITIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.AssociationElementImpl <em>Association Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.AssociationElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getAssociationElement()
	 * @generated
	 */
	int ASSOCIATION_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT__LINK = LINKABLE_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT__CONDITION = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT__LABEL = LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT__ELEMENT_ID = LINKABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT__ASSOCIATION = LINKABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ELEMENT_OPERATION_COUNT = LINKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ListImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 23;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LINK = ASSOCIATION_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONDITION = ASSOCIATION_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LABEL = ASSOCIATION_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_ID = ASSOCIATION_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ASSOCIATION = ASSOCIATION_ELEMENT__ASSOCIATION;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = ASSOCIATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = ASSOCIATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.TableImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 24;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LINK = ASSOCIATION_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONDITION = ASSOCIATION_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = ASSOCIATION_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ELEMENT_ID = ASSOCIATION_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ASSOCIATION = ASSOCIATION_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = ASSOCIATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ASSOCIATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ASSOCIATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.PropertyElementImpl <em>Property Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.PropertyElementImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getPropertyElement()
	 * @generated
	 */
	int PROPERTY_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT__CONDITION = VIEW_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT__LABEL = VIEW_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT__ELEMENT_ID = VIEW_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT__PROPERTY = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ELEMENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ColumnImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 26;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONDITION = PROPERTY_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL = PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ELEMENT_ID = PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PROPERTY = PROPERTY_ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.TextImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 27;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONDITION = PROPERTY_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LABEL = PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ELEMENT_ID = PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PROPERTY = PROPERTY_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FORMAT = PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LONG = PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = PROPERTY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.DateTimePickerImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDateTimePicker()
	 * @generated
	 */
	int DATE_TIME_PICKER = 28;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__CONDITION = PROPERTY_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__LABEL = PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__ELEMENT_ID = PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__PROPERTY = PROPERTY_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER__FORMAT = PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_FEATURE_COUNT = PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_OPERATION_COUNT = PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.SelectionImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 29;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__CONDITION = PROPERTY_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__LABEL = PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ELEMENT_ID = PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__PROPERTY = PROPERTY_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Selection Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTION_ITEMS = PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ConditionImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 40;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.VisibilityConditionImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getVisibilityCondition()
	 * @generated
	 */
	int VISIBILITY_CONDITION = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION__CONDITION_ID = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Visibility Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.CompositeConditionImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__TYPE = VISIBILITY_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITION_ID = VISIBILITY_CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Composed Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COMPOSED_CONDITIONS = VISIBILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COMPOSITION_TYPE = VISIBILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = VISIBILITY_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = VISIBILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.ComparisonConditionImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getComparisonCondition()
	 * @generated
	 */
	int COMPARISON_CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__TYPE = VISIBILITY_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__CONDITION_ID = VISIBILITY_CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__COMPARISON_VALUE = VISIBILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__PROPERTY = VISIBILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__COMPARISON_TYPE = VISIBILITY_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION_FEATURE_COUNT = VISIBILITY_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION_OPERATION_COUNT = VISIBILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.LayoutImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 34;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ALIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.LinkImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 36;

	/**
	 * The feature id for the '<em><b>Target View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.SelectionItemImpl <em>Selection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.SelectionItemImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getSelectionItem()
	 * @generated
	 */
	int SELECTION_ITEM = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.impl.EnumerationLiteralItemImpl <em>Enumeration Literal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.impl.EnumerationLiteralItemImpl
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumerationLiteralItem()
	 * @generated
	 */
	int ENUMERATION_LITERAL_ITEM = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM__VALUE = SELECTION_ITEM__VALUE;

	/**
	 * The feature id for the '<em><b>Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL = SELECTION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM_FEATURE_COUNT = SELECTION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_ITEM_OPERATION_COUNT = SELECTION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.VisibilityConditionType <em>Visibility Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.VisibilityConditionType
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getVisibilityConditionType()
	 * @generated
	 */
	int VISIBILITY_CONDITION_TYPE = 41;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.CompositeConditionType <em>Composite Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.CompositeConditionType
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCompositeConditionType()
	 * @generated
	 */
	int COMPOSITE_CONDITION_TYPE = 42;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.ComparisonConditionType <em>Comparison Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.ComparisonConditionType
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getComparisonConditionType()
	 * @generated
	 */
	int COMPARISON_CONDITION_TYPE = 43;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.views.LayoutStyle <em>Layout Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.views.LayoutStyle
	 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayoutStyle()
	 * @generated
	 */
	int LAYOUT_STYLE = 44;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see at.ac.tuwien.big.views.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.views.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see at.ac.tuwien.big.views.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.DomainModel#getDomainModelElements <em>Domain Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Model Elements</em>'.
	 * @see at.ac.tuwien.big.views.DomainModel#getDomainModelElements()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DomainModelElements();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.DomainModelElement <em>Domain Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model Element</em>'.
	 * @see at.ac.tuwien.big.views.DomainModelElement
	 * @generated
	 */
	EClass getDomainModelElement();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see at.ac.tuwien.big.views.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see at.ac.tuwien.big.views.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see at.ac.tuwien.big.views.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see at.ac.tuwien.big.views.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClass();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see at.ac.tuwien.big.views.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Id();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see at.ac.tuwien.big.views.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see at.ac.tuwien.big.views.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see at.ac.tuwien.big.views.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see at.ac.tuwien.big.views.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.EnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.views.EnumerationLiteral#getValue()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see at.ac.tuwien.big.views.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.MultiplicityElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see at.ac.tuwien.big.views.MultiplicityElement#getLowerBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.MultiplicityElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see at.ac.tuwien.big.views.MultiplicityElement#getUpperBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_UpperBound();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see at.ac.tuwien.big.views.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.Association#isIsComposition <em>Is Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composition</em>'.
	 * @see at.ac.tuwien.big.views.Association#isIsComposition()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.Association#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Ends</em>'.
	 * @see at.ac.tuwien.big.views.Association#getAssociationEnds()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEnds();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.Association#getNavigableEnd <em>Navigable End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Navigable End</em>'.
	 * @see at.ac.tuwien.big.views.Association#getNavigableEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_NavigableEnd();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see at.ac.tuwien.big.views.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see at.ac.tuwien.big.views.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see at.ac.tuwien.big.views.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.ViewModel#getViewGroups <em>View Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Groups</em>'.
	 * @see at.ac.tuwien.big.views.ViewModel#getViewGroups()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_ViewGroups();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Group</em>'.
	 * @see at.ac.tuwien.big.views.ViewGroup
	 * @generated
	 */
	EClass getViewGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.ViewGroup#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see at.ac.tuwien.big.views.ViewGroup#getViews()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Views();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ViewGroup#isWelcomeViewGroup <em>Welcome View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome View Group</em>'.
	 * @see at.ac.tuwien.big.views.ViewGroup#isWelcomeViewGroup()
	 * @see #getViewGroup()
	 * @generated
	 */
	EAttribute getViewGroup_WelcomeViewGroup();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see at.ac.tuwien.big.views.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.View#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see at.ac.tuwien.big.views.View#getHeader()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Header();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.View#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.ac.tuwien.big.views.View#getDescription()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Description();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.View#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see at.ac.tuwien.big.views.View#getClass_()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Class();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.View#isStartView <em>Start View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start View</em>'.
	 * @see at.ac.tuwien.big.views.View#isStartView()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_StartView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ClassIndexView <em>Class Index View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Index View</em>'.
	 * @see at.ac.tuwien.big.views.ClassIndexView
	 * @generated
	 */
	EClass getClassIndexView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ClassOperationView <em>Class Operation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation View</em>'.
	 * @see at.ac.tuwien.big.views.ClassOperationView
	 * @generated
	 */
	EClass getClassOperationView();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.ClassOperationView#getElementGroups <em>Element Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Groups</em>'.
	 * @see at.ac.tuwien.big.views.ClassOperationView#getElementGroups()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_ElementGroups();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.CreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create View</em>'.
	 * @see at.ac.tuwien.big.views.CreateView
	 * @generated
	 */
	EClass getCreateView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ReadView <em>Read View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read View</em>'.
	 * @see at.ac.tuwien.big.views.ReadView
	 * @generated
	 */
	EClass getReadView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.UpdateView <em>Update View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update View</em>'.
	 * @see at.ac.tuwien.big.views.UpdateView
	 * @generated
	 */
	EClass getUpdateView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.DeleteView <em>Delete View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete View</em>'.
	 * @see at.ac.tuwien.big.views.DeleteView
	 * @generated
	 */
	EClass getDeleteView();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see at.ac.tuwien.big.views.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ElementGroup#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see at.ac.tuwien.big.views.ElementGroup#getHeader()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.ElementGroup#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see at.ac.tuwien.big.views.ElementGroup#getViewElements()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_ViewElements();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see at.ac.tuwien.big.views.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ViewElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.views.ViewElement#getLabel()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ViewElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see at.ac.tuwien.big.views.ViewElement#getElementID()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_ElementID();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.AssociationElement <em>Association Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Element</em>'.
	 * @see at.ac.tuwien.big.views.AssociationElement
	 * @generated
	 */
	EClass getAssociationElement();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.AssociationElement#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see at.ac.tuwien.big.views.AssociationElement#getAssociation()
	 * @see #getAssociationElement()
	 * @generated
	 */
	EReference getAssociationElement_Association();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see at.ac.tuwien.big.views.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see at.ac.tuwien.big.views.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see at.ac.tuwien.big.views.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.PropertyElement <em>Property Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Element</em>'.
	 * @see at.ac.tuwien.big.views.PropertyElement
	 * @generated
	 */
	EClass getPropertyElement();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.PropertyElement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see at.ac.tuwien.big.views.PropertyElement#getProperty()
	 * @see #getPropertyElement()
	 * @generated
	 */
	EReference getPropertyElement_Property();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see at.ac.tuwien.big.views.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see at.ac.tuwien.big.views.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.Text#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see at.ac.tuwien.big.views.Text#getFormat()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Format();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.Text#isLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see at.ac.tuwien.big.views.Text#isLong()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Long();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.DateTimePicker <em>Date Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Picker</em>'.
	 * @see at.ac.tuwien.big.views.DateTimePicker
	 * @generated
	 */
	EClass getDateTimePicker();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.DateTimePicker#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see at.ac.tuwien.big.views.DateTimePicker#getFormat()
	 * @see #getDateTimePicker()
	 * @generated
	 */
	EAttribute getDateTimePicker_Format();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see at.ac.tuwien.big.views.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.Selection#getSelectionItems <em>Selection Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Items</em>'.
	 * @see at.ac.tuwien.big.views.Selection#getSelectionItems()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_SelectionItems();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.VisibilityCondition <em>Visibility Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Condition</em>'.
	 * @see at.ac.tuwien.big.views.VisibilityCondition
	 * @generated
	 */
	EClass getVisibilityCondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.VisibilityCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.ac.tuwien.big.views.VisibilityCondition#getType()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EAttribute getVisibilityCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.VisibilityCondition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see at.ac.tuwien.big.views.VisibilityCondition#getConditionID()
	 * @see #getVisibilityCondition()
	 * @generated
	 */
	EAttribute getVisibilityCondition_ConditionID();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see at.ac.tuwien.big.views.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.CompositeCondition#getComposedConditions <em>Composed Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Conditions</em>'.
	 * @see at.ac.tuwien.big.views.CompositeCondition#getComposedConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_ComposedConditions();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.CompositeCondition#getCompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition Type</em>'.
	 * @see at.ac.tuwien.big.views.CompositeCondition#getCompositionType()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_CompositionType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Condition</em>'.
	 * @see at.ac.tuwien.big.views.ComparisonCondition
	 * @generated
	 */
	EClass getComparisonCondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see at.ac.tuwien.big.views.ComparisonCondition#getComparisonValue()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EAttribute getComparisonCondition_ComparisonValue();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.ComparisonCondition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see at.ac.tuwien.big.views.ComparisonCondition#getProperty()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EReference getComparisonCondition_Property();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.ComparisonCondition#getComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Type</em>'.
	 * @see at.ac.tuwien.big.views.ComparisonCondition#getComparisonType()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EAttribute getComparisonCondition_ComparisonType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.LayoutableElement <em>Layoutable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable Element</em>'.
	 * @see at.ac.tuwien.big.views.LayoutableElement
	 * @generated
	 */
	EClass getLayoutableElement();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.views.LayoutableElement#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see at.ac.tuwien.big.views.LayoutableElement#getLayout()
	 * @see #getLayoutableElement()
	 * @generated
	 */
	EReference getLayoutableElement_Layout();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see at.ac.tuwien.big.views.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.Layout#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see at.ac.tuwien.big.views.Layout#getAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Alignment();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable Element</em>'.
	 * @see at.ac.tuwien.big.views.LinkableElement
	 * @generated
	 */
	EClass getLinkableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.views.LinkableElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see at.ac.tuwien.big.views.LinkableElement#getLink()
	 * @see #getLinkableElement()
	 * @generated
	 */
	EReference getLinkableElement_Link();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see at.ac.tuwien.big.views.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.Link#getTargetView <em>Target View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target View</em>'.
	 * @see at.ac.tuwien.big.views.Link#getTargetView()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_TargetView();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.views.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Label();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.SelectionItem <em>Selection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Item</em>'.
	 * @see at.ac.tuwien.big.views.SelectionItem
	 * @generated
	 */
	EClass getSelectionItem();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.views.SelectionItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.views.SelectionItem#getValue()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.EnumerationLiteralItem <em>Enumeration Literal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Item</em>'.
	 * @see at.ac.tuwien.big.views.EnumerationLiteralItem
	 * @generated
	 */
	EClass getEnumerationLiteralItem();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.views.EnumerationLiteralItem#getEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration Literal</em>'.
	 * @see at.ac.tuwien.big.views.EnumerationLiteralItem#getEnumerationLiteral()
	 * @see #getEnumerationLiteralItem()
	 * @generated
	 */
	EReference getEnumerationLiteralItem_EnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.ConditionalElement <em>Conditional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Element</em>'.
	 * @see at.ac.tuwien.big.views.ConditionalElement
	 * @generated
	 */
	EClass getConditionalElement();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.views.ConditionalElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see at.ac.tuwien.big.views.ConditionalElement#getCondition()
	 * @see #getConditionalElement()
	 * @generated
	 */
	EReference getConditionalElement_Condition();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.views.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see at.ac.tuwien.big.views.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.views.VisibilityConditionType <em>Visibility Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Condition Type</em>'.
	 * @see at.ac.tuwien.big.views.VisibilityConditionType
	 * @generated
	 */
	EEnum getVisibilityConditionType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.views.CompositeConditionType <em>Composite Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Condition Type</em>'.
	 * @see at.ac.tuwien.big.views.CompositeConditionType
	 * @generated
	 */
	EEnum getCompositeConditionType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.views.ComparisonConditionType <em>Comparison Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Condition Type</em>'.
	 * @see at.ac.tuwien.big.views.ComparisonConditionType
	 * @generated
	 */
	EEnum getComparisonConditionType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.views.LayoutStyle <em>Layout Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Style</em>'.
	 * @see at.ac.tuwien.big.views.LayoutStyle
	 * @generated
	 */
	EEnum getLayoutStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.NamedElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.DomainModelImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DOMAIN_MODEL_ELEMENTS = eINSTANCE.getDomainModel_DomainModelElements();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.DomainModelElementImpl <em>Domain Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.DomainModelElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDomainModelElement()
		 * @generated
		 */
		EClass DOMAIN_MODEL_ELEMENT = eINSTANCE.getDomainModelElement();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.TypeImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ClassImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ID = eINSTANCE.getClass_Id();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.DataTypeImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.EnumerationImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.EnumerationLiteralImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.MultiplicityElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER_BOUND = eINSTANCE.getMultiplicityElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER_BOUND = eINSTANCE.getMultiplicityElement_UpperBound();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.AssociationImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_COMPOSITION = eINSTANCE.getAssociation_IsComposition();

		/**
		 * The meta object literal for the '<em><b>Association Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_ENDS = eINSTANCE.getAssociation_AssociationEnds();

		/**
		 * The meta object literal for the '<em><b>Navigable End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__NAVIGABLE_END = eINSTANCE.getAssociation_NavigableEnd();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.PropertyImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ViewModelImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '<em><b>View Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__VIEW_GROUPS = eINSTANCE.getViewModel_ViewGroups();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ViewGroupImpl <em>View Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ViewGroupImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewGroup()
		 * @generated
		 */
		EClass VIEW_GROUP = eINSTANCE.getViewGroup();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__VIEWS = eINSTANCE.getViewGroup_Views();

		/**
		 * The meta object literal for the '<em><b>Welcome View Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_GROUP__WELCOME_VIEW_GROUP = eINSTANCE.getViewGroup_WelcomeViewGroup();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__HEADER = eINSTANCE.getView_Header();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DESCRIPTION = eINSTANCE.getView_Description();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CLASS = eINSTANCE.getView_Class();

		/**
		 * The meta object literal for the '<em><b>Start View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__START_VIEW = eINSTANCE.getView_StartView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ClassIndexViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClassIndexView()
		 * @generated
		 */
		EClass CLASS_INDEX_VIEW = eINSTANCE.getClassIndexView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ClassOperationViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getClassOperationView()
		 * @generated
		 */
		EClass CLASS_OPERATION_VIEW = eINSTANCE.getClassOperationView();

		/**
		 * The meta object literal for the '<em><b>Element Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__ELEMENT_GROUPS = eINSTANCE.getClassOperationView_ElementGroups();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.CreateViewImpl <em>Create View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.CreateViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCreateView()
		 * @generated
		 */
		EClass CREATE_VIEW = eINSTANCE.getCreateView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ReadViewImpl <em>Read View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ReadViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getReadView()
		 * @generated
		 */
		EClass READ_VIEW = eINSTANCE.getReadView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.UpdateViewImpl <em>Update View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.UpdateViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getUpdateView()
		 * @generated
		 */
		EClass UPDATE_VIEW = eINSTANCE.getUpdateView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.DeleteViewImpl <em>Delete View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.DeleteViewImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDeleteView()
		 * @generated
		 */
		EClass DELETE_VIEW = eINSTANCE.getDeleteView();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ElementGroupImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__HEADER = eINSTANCE.getElementGroup_Header();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__VIEW_ELEMENTS = eINSTANCE.getElementGroup_ViewElements();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ViewElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__LABEL = eINSTANCE.getViewElement_Label();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__ELEMENT_ID = eINSTANCE.getViewElement_ElementID();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.AssociationElementImpl <em>Association Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.AssociationElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getAssociationElement()
		 * @generated
		 */
		EClass ASSOCIATION_ELEMENT = eINSTANCE.getAssociationElement();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_ELEMENT__ASSOCIATION = eINSTANCE.getAssociationElement_Association();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ListImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.TableImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.PropertyElementImpl <em>Property Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.PropertyElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getPropertyElement()
		 * @generated
		 */
		EClass PROPERTY_ELEMENT = eINSTANCE.getPropertyElement();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ELEMENT__PROPERTY = eINSTANCE.getPropertyElement_Property();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ColumnImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.TextImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FORMAT = eINSTANCE.getText_Format();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__LONG = eINSTANCE.getText_Long();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.DateTimePickerImpl <em>Date Time Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.DateTimePickerImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getDateTimePicker()
		 * @generated
		 */
		EClass DATE_TIME_PICKER = eINSTANCE.getDateTimePicker();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PICKER__FORMAT = eINSTANCE.getDateTimePicker_Format();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.SelectionImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Selection Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECTION_ITEMS = eINSTANCE.getSelection_SelectionItems();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.VisibilityConditionImpl <em>Visibility Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.VisibilityConditionImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getVisibilityCondition()
		 * @generated
		 */
		EClass VISIBILITY_CONDITION = eINSTANCE.getVisibilityCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CONDITION__TYPE = eINSTANCE.getVisibilityCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CONDITION__CONDITION_ID = eINSTANCE.getVisibilityCondition_ConditionID();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.CompositeConditionImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Composed Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__COMPOSED_CONDITIONS = eINSTANCE.getCompositeCondition_ComposedConditions();

		/**
		 * The meta object literal for the '<em><b>Composition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__COMPOSITION_TYPE = eINSTANCE.getCompositeCondition_CompositionType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ComparisonConditionImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getComparisonCondition()
		 * @generated
		 */
		EClass COMPARISON_CONDITION = eINSTANCE.getComparisonCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONDITION__COMPARISON_VALUE = eINSTANCE.getComparisonCondition_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_CONDITION__PROPERTY = eINSTANCE.getComparisonCondition_Property();

		/**
		 * The meta object literal for the '<em><b>Comparison Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONDITION__COMPARISON_TYPE = eINSTANCE.getComparisonCondition_ComparisonType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.LayoutableElementImpl <em>Layoutable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.LayoutableElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayoutableElement()
		 * @generated
		 */
		EClass LAYOUTABLE_ELEMENT = eINSTANCE.getLayoutableElement();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUTABLE_ELEMENT__LAYOUT = eINSTANCE.getLayoutableElement_Layout();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.LayoutImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ALIGNMENT = eINSTANCE.getLayout_Alignment();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.LinkableElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLinkableElement()
		 * @generated
		 */
		EClass LINKABLE_ELEMENT = eINSTANCE.getLinkableElement();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_ELEMENT__LINK = eINSTANCE.getLinkableElement_Link();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.LinkImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Target View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET_VIEW = eINSTANCE.getLink_TargetView();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.SelectionItemImpl <em>Selection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.SelectionItemImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getSelectionItem()
		 * @generated
		 */
		EClass SELECTION_ITEM = eINSTANCE.getSelectionItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__VALUE = eINSTANCE.getSelectionItem_Value();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.EnumerationLiteralItemImpl <em>Enumeration Literal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.EnumerationLiteralItemImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getEnumerationLiteralItem()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_ITEM = eINSTANCE.getEnumerationLiteralItem();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_ITEM__ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteralItem_EnumerationLiteral();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ConditionalElementImpl <em>Conditional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ConditionalElementImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getConditionalElement()
		 * @generated
		 */
		EClass CONDITIONAL_ELEMENT = eINSTANCE.getConditionalElement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ELEMENT__CONDITION = eINSTANCE.getConditionalElement_Condition();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.impl.ConditionImpl
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.VisibilityConditionType <em>Visibility Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.VisibilityConditionType
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getVisibilityConditionType()
		 * @generated
		 */
		EEnum VISIBILITY_CONDITION_TYPE = eINSTANCE.getVisibilityConditionType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.CompositeConditionType <em>Composite Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.CompositeConditionType
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getCompositeConditionType()
		 * @generated
		 */
		EEnum COMPOSITE_CONDITION_TYPE = eINSTANCE.getCompositeConditionType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.ComparisonConditionType <em>Comparison Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.ComparisonConditionType
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getComparisonConditionType()
		 * @generated
		 */
		EEnum COMPARISON_CONDITION_TYPE = eINSTANCE.getComparisonConditionType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.views.LayoutStyle <em>Layout Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.views.LayoutStyle
		 * @see at.ac.tuwien.big.views.impl.ViewsPackageImpl#getLayoutStyle()
		 * @generated
		 */
		EEnum LAYOUT_STYLE = eINSTANCE.getLayoutStyle();

	}

} //ViewsPackage
