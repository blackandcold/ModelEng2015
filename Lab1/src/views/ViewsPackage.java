/**
 */
package views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see views.ViewsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
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
	String eNS_URI = "http://www.example.org/views";

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
	ViewsPackage eINSTANCE = views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link views.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.TypeImpl
	 * @see views.impl.ViewsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DataTypeImpl
	 * @see views.impl.ViewsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.PropertyImpl
	 * @see views.impl.ViewsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MULTIPLICITY_LOWER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MULTIPLICITY_UPPER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassImpl
	 * @see views.impl.ViewsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERCLASS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBCLASS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ID = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATIONS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Associations Navigable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATIONS_NAVIGABLE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.EnumLiteralImpl
	 * @see views.impl.ViewsPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.EnumerationImpl
	 * @see views.impl.ViewsPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 5;

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
	 * The meta object id for the '{@link views.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.AssociationImpl
	 * @see views.impl.ViewsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BEGIN = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END = 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DomainModelImpl
	 * @see views.impl.ViewsPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENUMERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ASSOCIATIONS = 3;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ModelImpl
	 * @see views.impl.ViewsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewModelImpl
	 * @see views.impl.ViewsPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 9;

	/**
	 * The feature id for the '<em><b>View Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__VIEW_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Welcome View Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__WELCOME_VIEW_GROUP = 1;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewGroupImpl <em>View Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewGroupImpl
	 * @see views.impl.ViewsPackageImpl#getViewGroup()
	 * @generated
	 */
	int VIEW_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__VIEWS = 1;

	/**
	 * The feature id for the '<em><b>Start View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP__START_VIEW = 2;

	/**
	 * The number of structural features of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewImpl
	 * @see views.impl.ViewsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HEADER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassIndexViewImpl
	 * @see views.impl.ViewsPackageImpl#getClassIndexView()
	 * @generated
	 */
	int CLASS_INDEX_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__HEADER = VIEW__HEADER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__LAYOUT = VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW__INSTANCES = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Index View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INDEX_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ClassOperationViewImpl
	 * @see views.impl.ViewsPackageImpl#getClassOperationView()
	 * @generated
	 */
	int CLASS_OPERATION_VIEW = 13;

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
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__LAYOUT = VIEW__LAYOUT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__INSTANCE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW__VIEW_ELEMENTS = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW___CREATE = VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW___READ = VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW___UPDATE = VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW___DELETE = VIEW_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class Operation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link views.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ELEMENT_ID = 1;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewElementGroupImpl <em>View Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewElementGroupImpl
	 * @see views.impl.ViewsPackageImpl#getViewElementGroup()
	 * @generated
	 */
	int VIEW_ELEMENT_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP__LABEL = VIEW_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP__ELEMENT_ID = VIEW_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP__HEADER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP__LAYOUT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP__VIEW_ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_GROUP_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewPropertyElementImpl <em>View Property Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewPropertyElementImpl
	 * @see views.impl.ViewsPackageImpl#getViewPropertyElement()
	 * @generated
	 */
	int VIEW_PROPERTY_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROPERTY_ELEMENT__LABEL = VIEW_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROPERTY_ELEMENT__ELEMENT_ID = VIEW_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROPERTY_ELEMENT__PROPERTY_REF = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROPERTY_ELEMENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Property Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PROPERTY_ELEMENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ViewAssociationElementImpl <em>View Association Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ViewAssociationElementImpl
	 * @see views.impl.ViewsPackageImpl#getViewAssociationElement()
	 * @generated
	 */
	int VIEW_ASSOCIATION_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_ELEMENT__LABEL = VIEW_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_ELEMENT__ELEMENT_ID = VIEW_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_ELEMENT__CLASS_REF = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Association Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_ELEMENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Association Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ASSOCIATION_ELEMENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.TextViewElementImpl <em>Text View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.TextViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getTextViewElement()
	 * @generated
	 */
	int TEXT_VIEW_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT__LABEL = VIEW_PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT__ELEMENT_ID = VIEW_PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT__PROPERTY_REF = VIEW_PROPERTY_ELEMENT__PROPERTY_REF;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT__LENGTH = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT__FORMAT = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT_FEATURE_COUNT = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_ELEMENT_OPERATION_COUNT = VIEW_PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.DateTimePickerViewElementImpl <em>Date Time Picker View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.DateTimePickerViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getDateTimePickerViewElement()
	 * @generated
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT__LABEL = VIEW_PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT__ELEMENT_ID = VIEW_PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT__PROPERTY_REF = VIEW_PROPERTY_ELEMENT__PROPERTY_REF;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT__FORMAT = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Picker View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT_FEATURE_COUNT = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Picker View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PICKER_VIEW_ELEMENT_OPERATION_COUNT = VIEW_PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.SelectionViewElementImpl <em>Selection View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.SelectionViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getSelectionViewElement()
	 * @generated
	 */
	int SELECTION_VIEW_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT__LABEL = VIEW_PROPERTY_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT__ELEMENT_ID = VIEW_PROPERTY_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT__PROPERTY_REF = VIEW_PROPERTY_ELEMENT__PROPERTY_REF;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT__VALUES = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT_FEATURE_COUNT = VIEW_PROPERTY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_VIEW_ELEMENT_OPERATION_COUNT = VIEW_PROPERTY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ListViewElementImpl <em>List View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ListViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getListViewElement()
	 * @generated
	 */
	int LIST_VIEW_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT__LABEL = VIEW_ASSOCIATION_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT__ELEMENT_ID = VIEW_ASSOCIATION_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT__CLASS_REF = VIEW_ASSOCIATION_ELEMENT__CLASS_REF;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT__LINKS = VIEW_ASSOCIATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT_FEATURE_COUNT = VIEW_ASSOCIATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ELEMENT_OPERATION_COUNT = VIEW_ASSOCIATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.TableViewElementImpl <em>Table View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.TableViewElementImpl
	 * @see views.impl.ViewsPackageImpl#getTableViewElement()
	 * @generated
	 */
	int TABLE_VIEW_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT__LABEL = VIEW_ASSOCIATION_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT__ELEMENT_ID = VIEW_ASSOCIATION_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT__CLASS_REF = VIEW_ASSOCIATION_ELEMENT__CLASS_REF;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT__LINKS = VIEW_ASSOCIATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT_FEATURE_COUNT = VIEW_ASSOCIATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_ELEMENT_OPERATION_COUNT = VIEW_ASSOCIATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ConditionImpl
	 * @see views.impl.ViewsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 23;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link views.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.ComparisonConditionImpl
	 * @see views.impl.ViewsPackageImpl#getComparisonCondition()
	 * @generated
	 */
	int COMPARISON_CONDITION = 24;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__RESULT = CONDITION__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__EXPRESSION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__ELEMENT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.CompositeConditionImpl
	 * @see views.impl.ViewsPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 25;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__RESULT = CONDITION__RESULT;

	/**
	 * The feature id for the '<em><b>Operator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__OPERATOR_TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COND1 = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cond2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COND2 = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.impl.LinkImpl
	 * @see views.impl.ViewsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = VIEW_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ELEMENT_ID = VIEW_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INSTANCE = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VIEW = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link views.TextLength <em>Text Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.TextLength
	 * @see views.impl.ViewsPackageImpl#getTextLength()
	 * @generated
	 */
	int TEXT_LENGTH = 27;

	/**
	 * The meta object id for the '{@link views.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.Operator
	 * @see views.impl.ViewsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 28;

	/**
	 * The meta object id for the '{@link views.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.Visibility
	 * @see views.impl.ViewsPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 29;

	/**
	 * The meta object id for the '{@link views.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see views.Layout
	 * @see views.impl.ViewsPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 30;


	/**
	 * Returns the meta object for class '{@link views.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see views.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link views.DataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see views.DataType#getType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Type();

	/**
	 * Returns the meta object for class '{@link views.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see views.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link views.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link views.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see views.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link views.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see views.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getMultiplicityLowerBound <em>Multiplicity Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Lower Bound</em>'.
	 * @see views.Property#getMultiplicityLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_MultiplicityLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link views.Property#getMultiplicityUpperBound <em>Multiplicity Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Upper Bound</em>'.
	 * @see views.Property#getMultiplicityUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_MultiplicityUpperBound();

	/**
	 * Returns the meta object for class '{@link views.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see views.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link views.Class#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see views.Class#getSuperclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Superclass();

	/**
	 * Returns the meta object for the reference list '{@link views.Class#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subclass</em>'.
	 * @see views.Class#getSubclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Subclass();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see views.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for the reference '{@link views.Class#getIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Id</em>'.
	 * @see views.Class#getIsId()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_IsId();

	/**
	 * Returns the meta object for the reference list '{@link views.Class#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations</em>'.
	 * @see views.Class#getAssociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Associations();

	/**
	 * Returns the meta object for the reference list '{@link views.Class#getAssociationsNavigable <em>Associations Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations Navigable</em>'.
	 * @see views.Class#getAssociationsNavigable()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_AssociationsNavigable();

	/**
	 * Returns the meta object for class '{@link views.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see views.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link views.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link views.EnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see views.EnumLiteral#getValue()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Value();

	/**
	 * Returns the meta object for class '{@link views.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see views.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link views.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see views.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link views.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see views.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link views.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Name();

	/**
	 * Returns the meta object for the attribute '{@link views.Association#isComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition</em>'.
	 * @see views.Association#isComposition()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Composition();

	/**
	 * Returns the meta object for the containment reference '{@link views.Association#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see views.Association#getBegin()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link views.Association#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see views.Association#getEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_End();

	/**
	 * Returns the meta object for class '{@link views.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see views.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see views.DomainModel#getClasses()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see views.DomainModel#getDataTypes()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see views.DomainModel#getEnumerations()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link views.DomainModel#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see views.DomainModel#getAssociations()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Associations();

	/**
	 * Returns the meta object for class '{@link views.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see views.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link views.Model#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model</em>'.
	 * @see views.Model#getDomainModel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DomainModel();

	/**
	 * Returns the meta object for the containment reference '{@link views.Model#getViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Model</em>'.
	 * @see views.Model#getViewModel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ViewModel();

	/**
	 * Returns the meta object for class '{@link views.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see views.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewModel#getViewGroups <em>View Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Groups</em>'.
	 * @see views.ViewModel#getViewGroups()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_ViewGroups();

	/**
	 * Returns the meta object for the reference '{@link views.ViewModel#getWelcomeViewGroup <em>Welcome View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Welcome View Group</em>'.
	 * @see views.ViewModel#getWelcomeViewGroup()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_WelcomeViewGroup();

	/**
	 * Returns the meta object for class '{@link views.ViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Group</em>'.
	 * @see views.ViewGroup
	 * @generated
	 */
	EClass getViewGroup();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.ViewGroup#getName()
	 * @see #getViewGroup()
	 * @generated
	 */
	EAttribute getViewGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewGroup#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see views.ViewGroup#getViews()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_Views();

	/**
	 * Returns the meta object for the reference '{@link views.ViewGroup#getStartView <em>Start View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start View</em>'.
	 * @see views.ViewGroup#getStartView()
	 * @see #getViewGroup()
	 * @generated
	 */
	EReference getViewGroup_StartView();

	/**
	 * Returns the meta object for class '{@link views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see views.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see views.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see views.View#getHeader()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Header();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see views.View#getDescription()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Description();

	/**
	 * Returns the meta object for the attribute '{@link views.View#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see views.View#getLayout()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Layout();

	/**
	 * Returns the meta object for class '{@link views.ClassIndexView <em>Class Index View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Index View</em>'.
	 * @see views.ClassIndexView
	 * @generated
	 */
	EClass getClassIndexView();

	/**
	 * Returns the meta object for the reference list '{@link views.ClassIndexView#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see views.ClassIndexView#getInstances()
	 * @see #getClassIndexView()
	 * @generated
	 */
	EReference getClassIndexView_Instances();

	/**
	 * Returns the meta object for class '{@link views.ClassOperationView <em>Class Operation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation View</em>'.
	 * @see views.ClassOperationView
	 * @generated
	 */
	EClass getClassOperationView();

	/**
	 * Returns the meta object for the reference '{@link views.ClassOperationView#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see views.ClassOperationView#getInstance()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ClassOperationView#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see views.ClassOperationView#getViewElements()
	 * @see #getClassOperationView()
	 * @generated
	 */
	EReference getClassOperationView_ViewElements();

	/**
	 * Returns the meta object for the '{@link views.ClassOperationView#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see views.ClassOperationView#create()
	 * @generated
	 */
	EOperation getClassOperationView__Create();

	/**
	 * Returns the meta object for the '{@link views.ClassOperationView#read() <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see views.ClassOperationView#read()
	 * @generated
	 */
	EOperation getClassOperationView__Read();

	/**
	 * Returns the meta object for the '{@link views.ClassOperationView#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see views.ClassOperationView#update()
	 * @generated
	 */
	EOperation getClassOperationView__Update();

	/**
	 * Returns the meta object for the '{@link views.ClassOperationView#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see views.ClassOperationView#delete()
	 * @generated
	 */
	EOperation getClassOperationView__Delete();

	/**
	 * Returns the meta object for class '{@link views.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see views.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see views.ViewElement#getLabel()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see views.ViewElement#getElementID()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_ElementID();

	/**
	 * Returns the meta object for class '{@link views.ViewElementGroup <em>View Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element Group</em>'.
	 * @see views.ViewElementGroup
	 * @generated
	 */
	EClass getViewElementGroup();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElementGroup#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see views.ViewElementGroup#getHeader()
	 * @see #getViewElementGroup()
	 * @generated
	 */
	EAttribute getViewElementGroup_Header();

	/**
	 * Returns the meta object for the attribute '{@link views.ViewElementGroup#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see views.ViewElementGroup#getLayout()
	 * @see #getViewElementGroup()
	 * @generated
	 */
	EAttribute getViewElementGroup_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ViewElementGroup#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see views.ViewElementGroup#getViewElements()
	 * @see #getViewElementGroup()
	 * @generated
	 */
	EReference getViewElementGroup_ViewElements();

	/**
	 * Returns the meta object for class '{@link views.ViewPropertyElement <em>View Property Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Property Element</em>'.
	 * @see views.ViewPropertyElement
	 * @generated
	 */
	EClass getViewPropertyElement();

	/**
	 * Returns the meta object for the reference '{@link views.ViewPropertyElement#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Ref</em>'.
	 * @see views.ViewPropertyElement#getPropertyRef()
	 * @see #getViewPropertyElement()
	 * @generated
	 */
	EReference getViewPropertyElement_PropertyRef();

	/**
	 * Returns the meta object for class '{@link views.ViewAssociationElement <em>View Association Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Association Element</em>'.
	 * @see views.ViewAssociationElement
	 * @generated
	 */
	EClass getViewAssociationElement();

	/**
	 * Returns the meta object for the reference '{@link views.ViewAssociationElement#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Ref</em>'.
	 * @see views.ViewAssociationElement#getClassRef()
	 * @see #getViewAssociationElement()
	 * @generated
	 */
	EReference getViewAssociationElement_ClassRef();

	/**
	 * Returns the meta object for class '{@link views.TextViewElement <em>Text View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View Element</em>'.
	 * @see views.TextViewElement
	 * @generated
	 */
	EClass getTextViewElement();

	/**
	 * Returns the meta object for the attribute '{@link views.TextViewElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see views.TextViewElement#getLength()
	 * @see #getTextViewElement()
	 * @generated
	 */
	EAttribute getTextViewElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link views.TextViewElement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see views.TextViewElement#getFormat()
	 * @see #getTextViewElement()
	 * @generated
	 */
	EAttribute getTextViewElement_Format();

	/**
	 * Returns the meta object for class '{@link views.DateTimePickerViewElement <em>Date Time Picker View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Picker View Element</em>'.
	 * @see views.DateTimePickerViewElement
	 * @generated
	 */
	EClass getDateTimePickerViewElement();

	/**
	 * Returns the meta object for the attribute '{@link views.DateTimePickerViewElement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see views.DateTimePickerViewElement#getFormat()
	 * @see #getDateTimePickerViewElement()
	 * @generated
	 */
	EAttribute getDateTimePickerViewElement_Format();

	/**
	 * Returns the meta object for class '{@link views.SelectionViewElement <em>Selection View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection View Element</em>'.
	 * @see views.SelectionViewElement
	 * @generated
	 */
	EClass getSelectionViewElement();

	/**
	 * Returns the meta object for the reference '{@link views.SelectionViewElement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values</em>'.
	 * @see views.SelectionViewElement#getValues()
	 * @see #getSelectionViewElement()
	 * @generated
	 */
	EReference getSelectionViewElement_Values();

	/**
	 * Returns the meta object for class '{@link views.ListViewElement <em>List View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List View Element</em>'.
	 * @see views.ListViewElement
	 * @generated
	 */
	EClass getListViewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link views.ListViewElement#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see views.ListViewElement#getLinks()
	 * @see #getListViewElement()
	 * @generated
	 */
	EReference getListViewElement_Links();

	/**
	 * Returns the meta object for class '{@link views.TableViewElement <em>Table View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table View Element</em>'.
	 * @see views.TableViewElement
	 * @generated
	 */
	EClass getTableViewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link views.TableViewElement#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see views.TableViewElement#getLinks()
	 * @see #getTableViewElement()
	 * @generated
	 */
	EReference getTableViewElement_Links();

	/**
	 * Returns the meta object for class '{@link views.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see views.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link views.Condition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see views.Condition#getConditionID()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ConditionID();

	/**
	 * Returns the meta object for the attribute '{@link views.Condition#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see views.Condition#getResult()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Result();

	/**
	 * Returns the meta object for class '{@link views.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Condition</em>'.
	 * @see views.ComparisonCondition
	 * @generated
	 */
	EClass getComparisonCondition();

	/**
	 * Returns the meta object for the attribute '{@link views.ComparisonCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see views.ComparisonCondition#getExpression()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EAttribute getComparisonCondition_Expression();

	/**
	 * Returns the meta object for the reference '{@link views.ComparisonCondition#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see views.ComparisonCondition#getElement()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EReference getComparisonCondition_Element();

	/**
	 * Returns the meta object for class '{@link views.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see views.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link views.CompositeCondition#getOperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Type</em>'.
	 * @see views.CompositeCondition#getOperatorType()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_OperatorType();

	/**
	 * Returns the meta object for the containment reference '{@link views.CompositeCondition#getCond1 <em>Cond1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond1</em>'.
	 * @see views.CompositeCondition#getCond1()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Cond1();

	/**
	 * Returns the meta object for the containment reference '{@link views.CompositeCondition#getCond2 <em>Cond2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond2</em>'.
	 * @see views.CompositeCondition#getCond2()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Cond2();

	/**
	 * Returns the meta object for class '{@link views.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see views.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link views.Link#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see views.Link#getInstance()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Instance();

	/**
	 * Returns the meta object for the reference '{@link views.Link#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see views.Link#getView()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_View();

	/**
	 * Returns the meta object for enum '{@link views.TextLength <em>Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Length</em>'.
	 * @see views.TextLength
	 * @generated
	 */
	EEnum getTextLength();

	/**
	 * Returns the meta object for enum '{@link views.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see views.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link views.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see views.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link views.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see views.Layout
	 * @generated
	 */
	EEnum getLayout();

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
		 * The meta object literal for the '{@link views.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DataTypeImpl
		 * @see views.impl.ViewsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__TYPE = eINSTANCE.getDataType_Type();

		/**
		 * The meta object literal for the '{@link views.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.TypeImpl
		 * @see views.impl.ViewsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link views.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.PropertyImpl
		 * @see views.impl.ViewsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MULTIPLICITY_LOWER_BOUND = eINSTANCE.getProperty_MultiplicityLowerBound();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MULTIPLICITY_UPPER_BOUND = eINSTANCE.getProperty_MultiplicityUpperBound();

		/**
		 * The meta object literal for the '{@link views.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassImpl
		 * @see views.impl.ViewsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPERCLASS = eINSTANCE.getClass_Superclass();

		/**
		 * The meta object literal for the '<em><b>Subclass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUBCLASS = eINSTANCE.getClass_Subclass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IS_ID = eINSTANCE.getClass_IsId();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATIONS = eINSTANCE.getClass_Associations();

		/**
		 * The meta object literal for the '<em><b>Associations Navigable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATIONS_NAVIGABLE = eINSTANCE.getClass_AssociationsNavigable();

		/**
		 * The meta object literal for the '{@link views.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.EnumLiteralImpl
		 * @see views.impl.ViewsPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__VALUE = eINSTANCE.getEnumLiteral_Value();

		/**
		 * The meta object literal for the '{@link views.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.EnumerationImpl
		 * @see views.impl.ViewsPackageImpl#getEnumeration()
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
		 * The meta object literal for the '{@link views.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.AssociationImpl
		 * @see views.impl.ViewsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__COMPOSITION = eINSTANCE.getAssociation_Composition();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__BEGIN = eINSTANCE.getAssociation_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END = eINSTANCE.getAssociation_End();

		/**
		 * The meta object literal for the '{@link views.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DomainModelImpl
		 * @see views.impl.ViewsPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__CLASSES = eINSTANCE.getDomainModel_Classes();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DATA_TYPES = eINSTANCE.getDomainModel_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENUMERATIONS = eINSTANCE.getDomainModel_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ASSOCIATIONS = eINSTANCE.getDomainModel_Associations();

		/**
		 * The meta object literal for the '{@link views.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ModelImpl
		 * @see views.impl.ViewsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DOMAIN_MODEL = eINSTANCE.getModel_DomainModel();

		/**
		 * The meta object literal for the '<em><b>View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__VIEW_MODEL = eINSTANCE.getModel_ViewModel();

		/**
		 * The meta object literal for the '{@link views.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewModelImpl
		 * @see views.impl.ViewsPackageImpl#getViewModel()
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
		 * The meta object literal for the '<em><b>Welcome View Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__WELCOME_VIEW_GROUP = eINSTANCE.getViewModel_WelcomeViewGroup();

		/**
		 * The meta object literal for the '{@link views.impl.ViewGroupImpl <em>View Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewGroupImpl
		 * @see views.impl.ViewsPackageImpl#getViewGroup()
		 * @generated
		 */
		EClass VIEW_GROUP = eINSTANCE.getViewGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_GROUP__NAME = eINSTANCE.getViewGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__VIEWS = eINSTANCE.getViewGroup_Views();

		/**
		 * The meta object literal for the '<em><b>Start View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_GROUP__START_VIEW = eINSTANCE.getViewGroup_StartView();

		/**
		 * The meta object literal for the '{@link views.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewImpl
		 * @see views.impl.ViewsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

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
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LAYOUT = eINSTANCE.getView_Layout();

		/**
		 * The meta object literal for the '{@link views.impl.ClassIndexViewImpl <em>Class Index View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassIndexViewImpl
		 * @see views.impl.ViewsPackageImpl#getClassIndexView()
		 * @generated
		 */
		EClass CLASS_INDEX_VIEW = eINSTANCE.getClassIndexView();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INDEX_VIEW__INSTANCES = eINSTANCE.getClassIndexView_Instances();

		/**
		 * The meta object literal for the '{@link views.impl.ClassOperationViewImpl <em>Class Operation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ClassOperationViewImpl
		 * @see views.impl.ViewsPackageImpl#getClassOperationView()
		 * @generated
		 */
		EClass CLASS_OPERATION_VIEW = eINSTANCE.getClassOperationView();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__INSTANCE = eINSTANCE.getClassOperationView_Instance();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION_VIEW__VIEW_ELEMENTS = eINSTANCE.getClassOperationView_ViewElements();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS_OPERATION_VIEW___CREATE = eINSTANCE.getClassOperationView__Create();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS_OPERATION_VIEW___READ = eINSTANCE.getClassOperationView__Read();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS_OPERATION_VIEW___UPDATE = eINSTANCE.getClassOperationView__Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS_OPERATION_VIEW___DELETE = eINSTANCE.getClassOperationView__Delete();

		/**
		 * The meta object literal for the '{@link views.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getViewElement()
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
		 * The meta object literal for the '{@link views.impl.ViewElementGroupImpl <em>View Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewElementGroupImpl
		 * @see views.impl.ViewsPackageImpl#getViewElementGroup()
		 * @generated
		 */
		EClass VIEW_ELEMENT_GROUP = eINSTANCE.getViewElementGroup();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT_GROUP__HEADER = eINSTANCE.getViewElementGroup_Header();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT_GROUP__LAYOUT = eINSTANCE.getViewElementGroup_Layout();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT_GROUP__VIEW_ELEMENTS = eINSTANCE.getViewElementGroup_ViewElements();

		/**
		 * The meta object literal for the '{@link views.impl.ViewPropertyElementImpl <em>View Property Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewPropertyElementImpl
		 * @see views.impl.ViewsPackageImpl#getViewPropertyElement()
		 * @generated
		 */
		EClass VIEW_PROPERTY_ELEMENT = eINSTANCE.getViewPropertyElement();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_PROPERTY_ELEMENT__PROPERTY_REF = eINSTANCE.getViewPropertyElement_PropertyRef();

		/**
		 * The meta object literal for the '{@link views.impl.ViewAssociationElementImpl <em>View Association Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ViewAssociationElementImpl
		 * @see views.impl.ViewsPackageImpl#getViewAssociationElement()
		 * @generated
		 */
		EClass VIEW_ASSOCIATION_ELEMENT = eINSTANCE.getViewAssociationElement();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ASSOCIATION_ELEMENT__CLASS_REF = eINSTANCE.getViewAssociationElement_ClassRef();

		/**
		 * The meta object literal for the '{@link views.impl.TextViewElementImpl <em>Text View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.TextViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getTextViewElement()
		 * @generated
		 */
		EClass TEXT_VIEW_ELEMENT = eINSTANCE.getTextViewElement();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW_ELEMENT__LENGTH = eINSTANCE.getTextViewElement_Length();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW_ELEMENT__FORMAT = eINSTANCE.getTextViewElement_Format();

		/**
		 * The meta object literal for the '{@link views.impl.DateTimePickerViewElementImpl <em>Date Time Picker View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.DateTimePickerViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getDateTimePickerViewElement()
		 * @generated
		 */
		EClass DATE_TIME_PICKER_VIEW_ELEMENT = eINSTANCE.getDateTimePickerViewElement();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PICKER_VIEW_ELEMENT__FORMAT = eINSTANCE.getDateTimePickerViewElement_Format();

		/**
		 * The meta object literal for the '{@link views.impl.SelectionViewElementImpl <em>Selection View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.SelectionViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getSelectionViewElement()
		 * @generated
		 */
		EClass SELECTION_VIEW_ELEMENT = eINSTANCE.getSelectionViewElement();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_VIEW_ELEMENT__VALUES = eINSTANCE.getSelectionViewElement_Values();

		/**
		 * The meta object literal for the '{@link views.impl.ListViewElementImpl <em>List View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ListViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getListViewElement()
		 * @generated
		 */
		EClass LIST_VIEW_ELEMENT = eINSTANCE.getListViewElement();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW_ELEMENT__LINKS = eINSTANCE.getListViewElement_Links();

		/**
		 * The meta object literal for the '{@link views.impl.TableViewElementImpl <em>Table View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.TableViewElementImpl
		 * @see views.impl.ViewsPackageImpl#getTableViewElement()
		 * @generated
		 */
		EClass TABLE_VIEW_ELEMENT = eINSTANCE.getTableViewElement();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW_ELEMENT__LINKS = eINSTANCE.getTableViewElement_Links();

		/**
		 * The meta object literal for the '{@link views.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ConditionImpl
		 * @see views.impl.ViewsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION_ID = eINSTANCE.getCondition_ConditionID();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__RESULT = eINSTANCE.getCondition_Result();

		/**
		 * The meta object literal for the '{@link views.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.ComparisonConditionImpl
		 * @see views.impl.ViewsPackageImpl#getComparisonCondition()
		 * @generated
		 */
		EClass COMPARISON_CONDITION = eINSTANCE.getComparisonCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONDITION__EXPRESSION = eINSTANCE.getComparisonCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_CONDITION__ELEMENT = eINSTANCE.getComparisonCondition_Element();

		/**
		 * The meta object literal for the '{@link views.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.CompositeConditionImpl
		 * @see views.impl.ViewsPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Operator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__OPERATOR_TYPE = eINSTANCE.getCompositeCondition_OperatorType();

		/**
		 * The meta object literal for the '<em><b>Cond1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__COND1 = eINSTANCE.getCompositeCondition_Cond1();

		/**
		 * The meta object literal for the '<em><b>Cond2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__COND2 = eINSTANCE.getCompositeCondition_Cond2();

		/**
		 * The meta object literal for the '{@link views.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.impl.LinkImpl
		 * @see views.impl.ViewsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INSTANCE = eINSTANCE.getLink_Instance();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__VIEW = eINSTANCE.getLink_View();

		/**
		 * The meta object literal for the '{@link views.TextLength <em>Text Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.TextLength
		 * @see views.impl.ViewsPackageImpl#getTextLength()
		 * @generated
		 */
		EEnum TEXT_LENGTH = eINSTANCE.getTextLength();

		/**
		 * The meta object literal for the '{@link views.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.Operator
		 * @see views.impl.ViewsPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link views.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.Visibility
		 * @see views.impl.ViewsPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link views.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see views.Layout
		 * @see views.impl.ViewsPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //ViewsPackage
