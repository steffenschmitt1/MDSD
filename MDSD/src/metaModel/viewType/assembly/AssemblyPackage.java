/**
 */
package metaModel.viewType.assembly;

import metaModel.viewType.ViewTypePackage;

import metaModel.viewType.repository.RepositoryPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see metaModel.viewType.assembly.AssemblyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface AssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaModel/viewType/assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel.viewType.assembly";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyPackage eINSTANCE = metaModel.viewType.assembly.impl.AssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.AssemblyContextImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__INSTANCE_OF = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRES = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDES = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Assembly Context From Inner Components Of Composite Component Cant Be Allocated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT___ASSEMBLY_CONTEXT_FROM_INNER_COMPONENTS_OF_COMPOSITE_COMPONENT_CANT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.CompositeComponentImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = RepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRES = RepositoryPackage.COMPONENT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDES = RepositoryPackage.COMPONENT__PROVIDES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__DESCRIPTION = RepositoryPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Encapsulated Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES = RepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = RepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Of Other Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___OF_OTHER_COMPONENT__DIAGNOSTICCHAIN_MAP = RepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = RepositoryPackage.COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.SystemImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Encapsulated Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENCAPSULATED_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDES = 1;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DELEGATION_CONNECTORS = 2;

	/**
	 * The feature id for the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSEMBLY_CONNECTORS = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Provided Interfaces Should Match Provided Roles Of Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___PROVIDED_INTERFACES_SHOULD_MATCH_PROVIDED_ROLES_OF_INSTANCES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.RoleImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.RequiredRoleImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__DELEGATION_CONNECTOR = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ASSEMBLY_CONNECTOR = ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ASSEMBLY_CONTEXT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.DelegationConnectorImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Linked Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__LINKED_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorRequiredImpl <em>Delegation Connector Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.DelegationConnectorRequiredImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnectorRequired()
	 * @generated
	 */
	int DELEGATION_CONNECTOR_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Linked Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_REQUIRED__LINKED_INTERFACE = DELEGATION_CONNECTOR__LINKED_INTERFACE;

	/**
	 * The feature id for the '<em><b>Linked Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_REQUIRED_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delegation Connector Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_REQUIRED_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.AssemblyConnectorImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Connected Assembly Contexts Should Be Allocated To Same Container Or To Linked Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___CONNECTED_ASSEMBLY_CONTEXTS_SHOULD_BE_ALLOCATED_TO_SAME_CONTAINER_OR_TO_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.ProvidedRoleImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__DELEGATION_CONNECTOR = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ASSEMBLY_CONNECTOR = ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ASSEMBLY_CONTEXT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorProvidedImpl <em>Delegation Connector Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.impl.DelegationConnectorProvidedImpl
	 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnectorProvided()
	 * @generated
	 */
	int DELEGATION_CONNECTOR_PROVIDED = 9;

	/**
	 * The feature id for the '<em><b>Linked Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_PROVIDED__LINKED_INTERFACE = DELEGATION_CONNECTOR__LINKED_INTERFACE;

	/**
	 * The feature id for the '<em><b>Linkded Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_PROVIDED_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delegation Connector Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_PROVIDED_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.AssemblyContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see metaModel.viewType.assembly.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.AssemblyContext#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see metaModel.viewType.assembly.AssemblyContext#getInstanceOf()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_InstanceOf();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see metaModel.viewType.assembly.AssemblyContext#getAllocationContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AllocationContext();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.assembly.AssemblyContext#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see metaModel.viewType.assembly.AssemblyContext#getRequires()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.assembly.AssemblyContext#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see metaModel.viewType.assembly.AssemblyContext#getProvides()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Provides();

	/**
	 * Returns the meta object for the '{@link metaModel.viewType.assembly.AssemblyContext#assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Assembly Context From Inner Components Of Composite Component Cant Be Allocated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assembly Context From Inner Components Of Composite Component Cant Be Allocated</em>' operation.
	 * @see metaModel.viewType.assembly.AssemblyContext#assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyContext__AssemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see metaModel.viewType.assembly.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.assembly.CompositeComponent#getEncapsulatedInstances <em>Encapsulated Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated Instances</em>'.
	 * @see metaModel.viewType.assembly.CompositeComponent#getEncapsulatedInstances()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_EncapsulatedInstances();

	/**
	 * Returns the meta object for the '{@link metaModel.viewType.assembly.CompositeComponent#ofOtherComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Of Other Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Of Other Component</em>' operation.
	 * @see metaModel.viewType.assembly.CompositeComponent#ofOtherComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__OfOtherComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see metaModel.viewType.assembly.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.assembly.System#getEncapsulatedInstances <em>Encapsulated Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encapsulated Instances</em>'.
	 * @see metaModel.viewType.assembly.System#getEncapsulatedInstances()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_EncapsulatedInstances();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.assembly.System#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see metaModel.viewType.assembly.System#getProvides()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.assembly.System#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Connectors</em>'.
	 * @see metaModel.viewType.assembly.System#getDelegationConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_DelegationConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.assembly.System#getAssemblyConnectors <em>Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Connectors</em>'.
	 * @see metaModel.viewType.assembly.System#getAssemblyConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AssemblyConnectors();

	/**
	 * Returns the meta object for the '{@link metaModel.viewType.assembly.System#providedInterfacesShouldMatchProvidedRolesOfInstances(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provided Interfaces Should Match Provided Roles Of Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provided Interfaces Should Match Provided Roles Of Instances</em>' operation.
	 * @see metaModel.viewType.assembly.System#providedInterfacesShouldMatchProvidedRolesOfInstances(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystem__ProvidedInterfacesShouldMatchProvidedRolesOfInstances__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see metaModel.viewType.assembly.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.RequiredRole#getDelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Connector</em>'.
	 * @see metaModel.viewType.assembly.RequiredRole#getDelegationConnector()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_DelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see metaModel.viewType.assembly.RequiredRole#getAssemblyConnector()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_AssemblyConnector();

	/**
	 * Returns the meta object for the container reference '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assembly Context</em>'.
	 * @see metaModel.viewType.assembly.RequiredRole#getAssemblyContext()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_AssemblyContext();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.DelegationConnectorRequired <em>Delegation Connector Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector Required</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnectorRequired
	 * @generated
	 */
	EClass getDelegationConnectorRequired();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole <em>Linked Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Role</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole()
	 * @see #getDelegationConnectorRequired()
	 * @generated
	 */
	EReference getDelegationConnectorRequired_LinkedRole();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.AssemblyConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see metaModel.viewType.assembly.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see metaModel.viewType.assembly.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see metaModel.viewType.assembly.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the '{@link metaModel.viewType.assembly.AssemblyConnector#connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Connected Assembly Contexts Should Be Allocated To Same Container Or To Linked Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connected Assembly Contexts Should Be Allocated To Same Container Or To Linked Containers</em>' operation.
	 * @see metaModel.viewType.assembly.AssemblyConnector#connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__ConnectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see metaModel.viewType.assembly.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see metaModel.viewType.assembly.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.ProvidedRole#getDelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Connector</em>'.
	 * @see metaModel.viewType.assembly.ProvidedRole#getDelegationConnector()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_DelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_AssemblyConnector();

	/**
	 * Returns the meta object for the container reference '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assembly Context</em>'.
	 * @see metaModel.viewType.assembly.ProvidedRole#getAssemblyContext()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_AssemblyContext();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.DelegationConnector#getLinkedInterface <em>Linked Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Interface</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnector#getLinkedInterface()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_LinkedInterface();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.assembly.DelegationConnectorProvided <em>Delegation Connector Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector Provided</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnectorProvided
	 * @generated
	 */
	EClass getDelegationConnectorProvided();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole <em>Linkded Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linkded Role</em>'.
	 * @see metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole()
	 * @see #getDelegationConnectorProvided()
	 * @generated
	 */
	EReference getDelegationConnectorProvided_LinkdedRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyFactory getAssemblyFactory();

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
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.AssemblyContextImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__INSTANCE_OF = eINSTANCE.getAssemblyContext_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = eINSTANCE.getAssemblyContext_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRES = eINSTANCE.getAssemblyContext_Requires();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDES = eINSTANCE.getAssemblyContext_Provides();

		/**
		 * The meta object literal for the '<em><b>Assembly Context From Inner Components Of Composite Component Cant Be Allocated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONTEXT___ASSEMBLY_CONTEXT_FROM_INNER_COMPONENTS_OF_COMPOSITE_COMPONENT_CANT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssemblyContext__AssemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.CompositeComponentImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES = eINSTANCE.getCompositeComponent_EncapsulatedInstances();

		/**
		 * The meta object literal for the '<em><b>Of Other Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___OF_OTHER_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCompositeComponent__OfOtherComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.SystemImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENCAPSULATED_INSTANCES = eINSTANCE.getSystem_EncapsulatedInstances();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDES = eINSTANCE.getSystem_Provides();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__DELEGATION_CONNECTORS = eINSTANCE.getSystem_DelegationConnectors();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ASSEMBLY_CONNECTORS = eINSTANCE.getSystem_AssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces Should Match Provided Roles Of Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___PROVIDED_INTERFACES_SHOULD_MATCH_PROVIDED_ROLES_OF_INSTANCES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSystem__ProvidedInterfacesShouldMatchProvidedRolesOfInstances__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.RequiredRoleImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__DELEGATION_CONNECTOR = eINSTANCE.getRequiredRole_DelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__ASSEMBLY_CONNECTOR = eINSTANCE.getRequiredRole_AssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__ASSEMBLY_CONTEXT = eINSTANCE.getRequiredRole_AssemblyContext();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorRequiredImpl <em>Delegation Connector Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.DelegationConnectorRequiredImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnectorRequired()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR_REQUIRED = eINSTANCE.getDelegationConnectorRequired();

		/**
		 * The meta object literal for the '<em><b>Linked Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE = eINSTANCE.getDelegationConnectorRequired_LinkedRole();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.AssemblyConnectorImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Connected Assembly Contexts Should Be Allocated To Same Container Or To Linked Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___CONNECTED_ASSEMBLY_CONTEXTS_SHOULD_BE_ALLOCATED_TO_SAME_CONTAINER_OR_TO_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssemblyConnector__ConnectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.RoleImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.ProvidedRoleImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__DELEGATION_CONNECTOR = eINSTANCE.getProvidedRole_DelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__ASSEMBLY_CONNECTOR = eINSTANCE.getProvidedRole_AssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__ASSEMBLY_CONTEXT = eINSTANCE.getProvidedRole_AssemblyContext();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.DelegationConnectorImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Linked Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__LINKED_INTERFACE = eINSTANCE.getDelegationConnector_LinkedInterface();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.assembly.impl.DelegationConnectorProvidedImpl <em>Delegation Connector Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.assembly.impl.DelegationConnectorProvidedImpl
		 * @see metaModel.viewType.assembly.impl.AssemblyPackageImpl#getDelegationConnectorProvided()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR_PROVIDED = eINSTANCE.getDelegationConnectorProvided();

		/**
		 * The meta object literal for the '<em><b>Linkded Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE = eINSTANCE.getDelegationConnectorProvided_LinkdedRole();

	}

} //AssemblyPackage
