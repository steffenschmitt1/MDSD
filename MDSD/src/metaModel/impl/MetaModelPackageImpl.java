/**
 */
package metaModel.impl;

import metaModel.ComponentBasedSystem;
import metaModel.MetaModelFactory;
import metaModel.MetaModelPackage;

import metaModel.viewType.ViewTypePackage;

import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.allocation.impl.AllocationPackageImpl;

import metaModel.viewType.assembly.AssemblyPackage;

import metaModel.viewType.assembly.impl.AssemblyPackageImpl;

import metaModel.viewType.environment.EnvironmentPackage;

import metaModel.viewType.environment.impl.EnvironmentPackageImpl;

import metaModel.viewType.impl.ViewTypePackageImpl;

import metaModel.viewType.repository.RepositoryPackage;

import metaModel.viewType.repository.impl.RepositoryPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelPackageImpl extends EPackageImpl implements MetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentBasedSystemEClass = null;

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
	 * @see metaModel.MetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaModelPackageImpl() {
		super(eNS_URI, MetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaModelPackage init() {
		if (isInited) return (MetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = registeredMetaModelPackage instanceof MetaModelPackageImpl ? (MetaModelPackageImpl)registeredMetaModelPackage : new MetaModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewTypePackage.eNS_URI);
		ViewTypePackageImpl theViewTypePackage = (ViewTypePackageImpl)(registeredPackage instanceof ViewTypePackageImpl ? registeredPackage : ViewTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(registeredPackage instanceof AssemblyPackageImpl ? registeredPackage : AssemblyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(registeredPackage instanceof AllocationPackageImpl ? registeredPackage : AllocationPackage.eINSTANCE);

		// Create package meta-data objects
		theMetaModelPackage.createPackageContents();
		theViewTypePackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theMetaModelPackage.initializePackageContents();
		theViewTypePackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaModelPackage.eNS_URI, theMetaModelPackage);
		return theMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentBasedSystem() {
		return componentBasedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentBasedSystem_Repositories() {
		return (EReference)componentBasedSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentBasedSystem_Enivronments() {
		return (EReference)componentBasedSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentBasedSystem_Systems() {
		return (EReference)componentBasedSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentBasedSystem_AllocationContexts() {
		return (EReference)componentBasedSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelFactory getMetaModelFactory() {
		return (MetaModelFactory)getEFactoryInstance();
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
		componentBasedSystemEClass = createEClass(COMPONENT_BASED_SYSTEM);
		createEReference(componentBasedSystemEClass, COMPONENT_BASED_SYSTEM__REPOSITORIES);
		createEReference(componentBasedSystemEClass, COMPONENT_BASED_SYSTEM__ENIVRONMENTS);
		createEReference(componentBasedSystemEClass, COMPONENT_BASED_SYSTEM__SYSTEMS);
		createEReference(componentBasedSystemEClass, COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS);
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
		EnvironmentPackage theEnvironmentPackage = (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		AssemblyPackage theAssemblyPackage = (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theViewTypePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentBasedSystemEClass, ComponentBasedSystem.class, "ComponentBasedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentBasedSystem_Repositories(), theRepositoryPackage.getRepository(), null, "repositories", null, 0, -1, ComponentBasedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentBasedSystem_Enivronments(), theEnvironmentPackage.getEnivronment(), null, "enivronments", null, 0, -1, ComponentBasedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentBasedSystem_Systems(), theAssemblyPackage.getSystem(), null, "systems", null, 0, -1, ComponentBasedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentBasedSystem_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 0, -1, ComponentBasedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetaModelPackageImpl
