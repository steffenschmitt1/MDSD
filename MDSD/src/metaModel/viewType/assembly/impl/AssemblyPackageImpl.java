/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.MetaModelPackage;

import metaModel.impl.MetaModelPackageImpl;

import metaModel.viewType.ViewTypePackage;

import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.allocation.impl.AllocationPackageImpl;

import metaModel.viewType.assembly.AssemblyConnector;
import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.CompositeComponent;
import metaModel.viewType.assembly.DelegationConnector;
import metaModel.viewType.assembly.DelegationConnectorProvided;
import metaModel.viewType.assembly.DelegationConnectorRequired;
import metaModel.viewType.assembly.ProvidedRole;
import metaModel.viewType.assembly.RequiredRole;
import metaModel.viewType.assembly.Role;

import metaModel.viewType.assembly.util.AssemblyValidator;

import metaModel.viewType.environment.EnvironmentPackage;

import metaModel.viewType.environment.impl.EnvironmentPackageImpl;

import metaModel.viewType.impl.ViewTypePackageImpl;

import metaModel.viewType.repository.RepositoryPackage;

import metaModel.viewType.repository.impl.RepositoryPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class AssemblyPackageImpl extends EPackageImpl implements AssemblyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorProvidedEClass = null;

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
	 * @see metaModel.viewType.assembly.AssemblyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyPackageImpl() {
		super(eNS_URI, AssemblyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssemblyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyPackage init() {
		if (isInited) return (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAssemblyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = registeredAssemblyPackage instanceof AssemblyPackageImpl ? (AssemblyPackageImpl)registeredAssemblyPackage : new AssemblyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewTypePackage.eNS_URI);
		ViewTypePackageImpl theViewTypePackage = (ViewTypePackageImpl)(registeredPackage instanceof ViewTypePackageImpl ? registeredPackage : ViewTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(registeredPackage instanceof AllocationPackageImpl ? registeredPackage : AllocationPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyPackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theViewTypePackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyPackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theViewTypePackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAssemblyPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AssemblyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAssemblyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblyPackage.eNS_URI, theAssemblyPackage);
		return theAssemblyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_InstanceOf() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_AllocationContext() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_Requires() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_Provides() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssemblyContext__AssemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated__DiagnosticChain_Map() {
		return assemblyContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeComponent() {
		return compositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeComponent_EncapsulatedInstances() {
		return (EReference)compositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeComponent__OfOtherComponent__DiagnosticChain_Map() {
		return compositeComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_EncapsulatedInstances() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Provides() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_DelegationConnectors() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AssemblyConnectors() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__ProvidedInterfacesShouldMatchProvidedRolesOfInstances__DiagnosticChain_Map() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredRole() {
		return requiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredRole_DelegationConnector() {
		return (EReference)requiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredRole_AssemblyConnector() {
		return (EReference)requiredRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredRole_AssemblyContext() {
		return (EReference)requiredRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnectorRequired() {
		return delegationConnectorRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnectorRequired_LinkedRole() {
		return (EReference)delegationConnectorRequiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_RequiredRole() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_ProvidedRole() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssemblyConnector__ConnectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers__DiagnosticChain_Map() {
		return assemblyConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedRole() {
		return providedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedRole_DelegationConnector() {
		return (EReference)providedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedRole_AssemblyConnector() {
		return (EReference)providedRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedRole_AssemblyContext() {
		return (EReference)providedRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_LinkedInterface() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnectorProvided() {
		return delegationConnectorProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnectorProvided_LinkdedRole() {
		return (EReference)delegationConnectorProvidedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyFactory getAssemblyFactory() {
		return (AssemblyFactory)getEFactoryInstance();
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
		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__INSTANCE_OF);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__REQUIRES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PROVIDES);
		createEOperation(assemblyContextEClass, ASSEMBLY_CONTEXT___ASSEMBLY_CONTEXT_FROM_INNER_COMPONENTS_OF_COMPOSITE_COMPONENT_CANT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP);

		compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES);
		createEOperation(compositeComponentEClass, COMPOSITE_COMPONENT___OF_OTHER_COMPONENT__DIAGNOSTICCHAIN_MAP);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ENCAPSULATED_INSTANCES);
		createEReference(systemEClass, SYSTEM__PROVIDES);
		createEReference(systemEClass, SYSTEM__DELEGATION_CONNECTORS);
		createEReference(systemEClass, SYSTEM__ASSEMBLY_CONNECTORS);
		createEOperation(systemEClass, SYSTEM___PROVIDED_INTERFACES_SHOULD_MATCH_PROVIDED_ROLES_OF_INSTANCES__DIAGNOSTICCHAIN_MAP);

		requiredRoleEClass = createEClass(REQUIRED_ROLE);
		createEReference(requiredRoleEClass, REQUIRED_ROLE__DELEGATION_CONNECTOR);
		createEReference(requiredRoleEClass, REQUIRED_ROLE__ASSEMBLY_CONNECTOR);
		createEReference(requiredRoleEClass, REQUIRED_ROLE__ASSEMBLY_CONTEXT);

		delegationConnectorRequiredEClass = createEClass(DELEGATION_CONNECTOR_REQUIRED);
		createEReference(delegationConnectorRequiredEClass, DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE);
		createEOperation(assemblyConnectorEClass, ASSEMBLY_CONNECTOR___CONNECTED_ASSEMBLY_CONTEXTS_SHOULD_BE_ALLOCATED_TO_SAME_CONTAINER_OR_TO_LINKED_CONTAINERS__DIAGNOSTICCHAIN_MAP);

		roleEClass = createEClass(ROLE);

		providedRoleEClass = createEClass(PROVIDED_ROLE);
		createEReference(providedRoleEClass, PROVIDED_ROLE__DELEGATION_CONNECTOR);
		createEReference(providedRoleEClass, PROVIDED_ROLE__ASSEMBLY_CONNECTOR);
		createEReference(providedRoleEClass, PROVIDED_ROLE__ASSEMBLY_CONTEXT);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__LINKED_INTERFACE);

		delegationConnectorProvidedEClass = createEClass(DELEGATION_CONNECTOR_PROVIDED);
		createEReference(delegationConnectorProvidedEClass, DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE);
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

		// Obtain other dependent packages
		ViewTypePackage theViewTypePackage = (ViewTypePackage)EPackage.Registry.INSTANCE.getEPackage(ViewTypePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assemblyContextEClass.getESuperTypes().add(theViewTypePackage.getNamedElement());
		compositeComponentEClass.getESuperTypes().add(theRepositoryPackage.getComponent());
		requiredRoleEClass.getESuperTypes().add(this.getRole());
		delegationConnectorRequiredEClass.getESuperTypes().add(this.getDelegationConnector());
		roleEClass.getESuperTypes().add(theViewTypePackage.getNamedElement());
		providedRoleEClass.getESuperTypes().add(this.getRole());
		delegationConnectorProvidedEClass.getESuperTypes().add(this.getDelegationConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_InstanceOf(), theRepositoryPackage.getComponent(), null, "instanceOf", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_AllocationContext(), theAllocationPackage.getAllocationContext(), theAllocationPackage.getAllocationContext_AssemblyContext(), "allocationContext", null, 0, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_Requires(), this.getRequiredRole(), this.getRequiredRole_AssemblyContext(), "requires", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_Provides(), this.getProvidedRole(), this.getProvidedRole_AssemblyContext(), "provides", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAssemblyContext__AssemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeComponent_EncapsulatedInstances(), this.getAssemblyContext(), null, "encapsulatedInstances", null, 1, -1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCompositeComponent__OfOtherComponent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ofOtherComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemEClass, metaModel.viewType.assembly.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_EncapsulatedInstances(), this.getAssemblyContext(), null, "encapsulatedInstances", null, 1, -1, metaModel.viewType.assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Provides(), theRepositoryPackage.getInterface(), null, "provides", null, 1, -1, metaModel.viewType.assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_DelegationConnectors(), this.getDelegationConnector(), null, "delegationConnectors", null, 0, -1, metaModel.viewType.assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AssemblyConnectors(), this.getAssemblyConnector(), null, "assemblyConnectors", null, 0, -1, metaModel.viewType.assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSystem__ProvidedInterfacesShouldMatchProvidedRolesOfInstances__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "providedInterfacesShouldMatchProvidedRolesOfInstances", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requiredRoleEClass, RequiredRole.class, "RequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredRole_DelegationConnector(), this.getDelegationConnectorRequired(), this.getDelegationConnectorRequired_LinkedRole(), "delegationConnector", null, 0, 1, RequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredRole_AssemblyConnector(), this.getAssemblyConnector(), this.getAssemblyConnector_RequiredRole(), "assemblyConnector", null, 0, 1, RequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredRole_AssemblyContext(), this.getAssemblyContext(), this.getAssemblyContext_Requires(), "assemblyContext", null, 1, 1, RequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorRequiredEClass, DelegationConnectorRequired.class, "DelegationConnectorRequired", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnectorRequired_LinkedRole(), this.getRequiredRole(), this.getRequiredRole_DelegationConnector(), "linkedRole", null, 1, 1, DelegationConnectorRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_RequiredRole(), this.getRequiredRole(), this.getRequiredRole_AssemblyConnector(), "requiredRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_ProvidedRole(), this.getProvidedRole(), this.getProvidedRole_AssemblyConnector(), "providedRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssemblyConnector__ConnectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedRoleEClass, ProvidedRole.class, "ProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedRole_DelegationConnector(), this.getDelegationConnectorProvided(), this.getDelegationConnectorProvided_LinkdedRole(), "delegationConnector", null, 0, 1, ProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedRole_AssemblyConnector(), this.getAssemblyConnector(), this.getAssemblyConnector_ProvidedRole(), "assemblyConnector", null, 0, 1, ProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedRole_AssemblyContext(), this.getAssemblyContext(), this.getAssemblyContext_Provides(), "assemblyContext", null, 1, 1, ProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_LinkedInterface(), theRepositoryPackage.getInterface(), null, "linkedInterface", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorProvidedEClass, DelegationConnectorProvided.class, "DelegationConnectorProvided", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnectorProvided_LinkdedRole(), this.getProvidedRole(), this.getProvidedRole_DelegationConnector(), "linkdedRole", null, 1, 1, DelegationConnectorProvided.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		   });
		addAnnotation
		  (assemblyContextEClass,
		   source,
		   new String[] {
			   "constraints", "assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated"
		   });
		addAnnotation
		  (compositeComponentEClass,
		   source,
		   new String[] {
			   "constraints", "ofOtherComponent"
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "constraints", "providedInterfacesShouldMatchProvidedRolesOfInstances"
		   });
		addAnnotation
		  (assemblyConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers"
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
		  (getAssemblyContext__AssemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.instanceOf.oclIsTypeOf(assembly::CompositeComponent) implies self.instanceOf.oclAsType(assembly::CompositeComponent).encapsulatedInstances -> forAll(allocationContext = null)"
		   });
		addAnnotation
		  (getCompositeComponent__OfOtherComponent__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.encapsulatedInstances -> select(instance | instance.instanceOf = self)->size() = 0"
		   });
		addAnnotation
		  (getSystem__ProvidedInterfacesShouldMatchProvidedRolesOfInstances__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.encapsulatedInstances.instanceOf.provides -> includesAll(self.provides -> asSet())"
		   });
		addAnnotation
		  (getAssemblyConnector__ConnectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "not (self.requiredRole.assemblyContext.allocationContext = null) and not (self.providedRole.assemblyContext.allocationContext = null) implies self.requiredRole.assemblyContext.allocationContext.container = self.providedRole.assemblyContext.allocationContext.container or self.requiredRole.assemblyContext.allocationContext.container.links -> exists(link | link.containers -> includes(self.providedRole.assemblyContext.allocationContext.container))"
		   });
	}

} //AssemblyPackageImpl
