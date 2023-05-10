/**
 */
package metaModel.viewType.repository;

import metaModel.viewType.ViewTypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see metaModel.viewType.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaModel/viewType/repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel.viewType.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = metaModel.viewType.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ComponentImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRES = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDES = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.InterfaceImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNATURES = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.TypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ParameterTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.SignatureImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_TYPE = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ParameterImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.RepositoryImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.BehaviourDescriptionImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBehaviourDescription()
	 * @generated
	 */
	int BEHAVIOUR_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Internal Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>External Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS = 1;

	/**
	 * The feature id for the '<em><b>Loops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__LOOPS = 2;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__BRANCHES = 3;

	/**
	 * The number of structural features of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.SimpleTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ComplexTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPES = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.InternalActionImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 10;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ExternalCallImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 11;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.LoopImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 12;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.BranchImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 13;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.MapTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.StringTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.BooleanTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.IntTypeImpl <em>Int Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.IntTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getIntType()
	 * @generated
	 */
	int INT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.ListTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 18;

	/**
	 * The feature id for the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__LIST = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.DateTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.LongTypeImpl <em>Long Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.LongTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getLongType()
	 * @generated
	 */
	int LONG_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.FloatTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.CharTypeImpl <em>Char Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.CharTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getCharType()
	 * @generated
	 */
	int CHAR_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.repository.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.repository.impl.VoidTypeImpl
	 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see metaModel.viewType.repository.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.repository.Component#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see metaModel.viewType.repository.Component#getRequires()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Requires();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.repository.Component#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see metaModel.viewType.repository.Component#getProvides()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Provides();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.viewType.repository.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see metaModel.viewType.repository.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Description();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see metaModel.viewType.repository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see metaModel.viewType.repository.Interface#getSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signatures();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see metaModel.viewType.repository.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see metaModel.viewType.repository.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.viewType.repository.Signature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see metaModel.viewType.repository.Signature#getReturnType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see metaModel.viewType.repository.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see metaModel.viewType.repository.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link metaModel.viewType.repository.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see metaModel.viewType.repository.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see metaModel.viewType.repository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.Repository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see metaModel.viewType.repository.Repository#getComponents()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.Repository#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see metaModel.viewType.repository.Repository#getInterface()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Interface();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.BehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Description</em>'.
	 * @see metaModel.viewType.repository.BehaviourDescription
	 * @generated
	 */
	EClass getBehaviourDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.BehaviourDescription#getInternalActions <em>Internal Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Actions</em>'.
	 * @see metaModel.viewType.repository.BehaviourDescription#getInternalActions()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_InternalActions();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.BehaviourDescription#getExternalCalls <em>External Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Calls</em>'.
	 * @see metaModel.viewType.repository.BehaviourDescription#getExternalCalls()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_ExternalCalls();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.BehaviourDescription#getLoops <em>Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loops</em>'.
	 * @see metaModel.viewType.repository.BehaviourDescription#getLoops()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_Loops();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.BehaviourDescription#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see metaModel.viewType.repository.BehaviourDescription#getBranches()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_Branches();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see metaModel.viewType.repository.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see metaModel.viewType.repository.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.repository.ComplexType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see metaModel.viewType.repository.ComplexType#getTypes()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Types();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see metaModel.viewType.repository.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see metaModel.viewType.repository.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see metaModel.viewType.repository.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see metaModel.viewType.repository.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see metaModel.viewType.repository.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see metaModel.viewType.repository.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.MapType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.MapType#getType()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see metaModel.viewType.repository.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.StringType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.StringType#getType()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see metaModel.viewType.repository.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.BooleanType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.BooleanType#getType()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Type</em>'.
	 * @see metaModel.viewType.repository.IntType
	 * @generated
	 */
	EClass getIntType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.IntType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.IntType#getType()
	 * @see #getIntType()
	 * @generated
	 */
	EAttribute getIntType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see metaModel.viewType.repository.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.ListType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List</em>'.
	 * @see metaModel.viewType.repository.ListType#getList()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_List();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see metaModel.viewType.repository.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.DateType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.DateType#getType()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Type</em>'.
	 * @see metaModel.viewType.repository.LongType
	 * @generated
	 */
	EClass getLongType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.LongType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.LongType#getType()
	 * @see #getLongType()
	 * @generated
	 */
	EAttribute getLongType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see metaModel.viewType.repository.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.FloatType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.FloatType#getType()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Type</em>'.
	 * @see metaModel.viewType.repository.CharType
	 * @generated
	 */
	EClass getCharType();

	/**
	 * Returns the meta object for the attribute '{@link metaModel.viewType.repository.CharType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaModel.viewType.repository.CharType#getType()
	 * @see #getCharType()
	 * @generated
	 */
	EAttribute getCharType_Type();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.repository.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see metaModel.viewType.repository.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ComponentImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRES = eINSTANCE.getComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDES = eINSTANCE.getComponent_Provides();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.InterfaceImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNATURES = eINSTANCE.getInterface_Signatures();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ParameterTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.SignatureImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN_TYPE = eINSTANCE.getSignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ParameterImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.RepositoryImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENTS = eINSTANCE.getRepository_Components();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACE = eINSTANCE.getRepository_Interface();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.BehaviourDescriptionImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBehaviourDescription()
		 * @generated
		 */
		EClass BEHAVIOUR_DESCRIPTION = eINSTANCE.getBehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS = eINSTANCE.getBehaviourDescription_InternalActions();

		/**
		 * The meta object literal for the '<em><b>External Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS = eINSTANCE.getBehaviourDescription_ExternalCalls();

		/**
		 * The meta object literal for the '<em><b>Loops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__LOOPS = eINSTANCE.getBehaviourDescription_Loops();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__BRANCHES = eINSTANCE.getBehaviourDescription_Branches();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.SimpleTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ComplexTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__TYPES = eINSTANCE.getComplexType_Types();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.TypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.InternalActionImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ExternalCallImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.LoopImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.BranchImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.MapTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__TYPE = eINSTANCE.getMapType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.StringTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__TYPE = eINSTANCE.getStringType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.BooleanTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__TYPE = eINSTANCE.getBooleanType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.IntTypeImpl <em>Int Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.IntTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getIntType()
		 * @generated
		 */
		EClass INT_TYPE = eINSTANCE.getIntType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TYPE__TYPE = eINSTANCE.getIntType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.ListTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__LIST = eINSTANCE.getListType_List();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.DateTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TYPE__TYPE = eINSTANCE.getDateType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.LongTypeImpl <em>Long Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.LongTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getLongType()
		 * @generated
		 */
		EClass LONG_TYPE = eINSTANCE.getLongType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_TYPE__TYPE = eINSTANCE.getLongType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.FloatTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__TYPE = eINSTANCE.getFloatType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.CharTypeImpl <em>Char Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.CharTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getCharType()
		 * @generated
		 */
		EClass CHAR_TYPE = eINSTANCE.getCharType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_TYPE__TYPE = eINSTANCE.getCharType_Type();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.repository.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.repository.impl.VoidTypeImpl
		 * @see metaModel.viewType.repository.impl.RepositoryPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

	}

} //RepositoryPackage
