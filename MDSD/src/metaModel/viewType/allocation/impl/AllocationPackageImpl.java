/**
 */
package metaModel.viewType.allocation.impl;

import metaModel.MetaModelPackage;

import metaModel.impl.MetaModelPackageImpl;

import metaModel.viewType.ViewTypePackage;

import metaModel.viewType.allocation.AllocationContext;
import metaModel.viewType.allocation.AllocationFactory;
import metaModel.viewType.allocation.AllocationPackage;

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
public class AllocationPackageImpl extends EPackageImpl implements AllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

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
	 * @see metaModel.viewType.allocation.AllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationPackageImpl() {
		super(eNS_URI, AllocationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationPackage init() {
		if (isInited) return (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAllocationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AllocationPackageImpl theAllocationPackage = registeredAllocationPackage instanceof AllocationPackageImpl ? (AllocationPackageImpl)registeredAllocationPackage : new AllocationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewTypePackage.eNS_URI);
		ViewTypePackageImpl theViewTypePackage = (ViewTypePackageImpl)(registeredPackage instanceof ViewTypePackageImpl ? registeredPackage : ViewTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(registeredPackage instanceof AssemblyPackageImpl ? registeredPackage : AssemblyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);

		// Create package meta-data objects
		theAllocationPackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theViewTypePackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationPackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theViewTypePackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllocationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, theAllocationPackage);
		return theAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_AssemblyContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_Container() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationFactory getAllocationFactory() {
		return (AllocationFactory)getEFactoryInstance();
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
		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__CONTAINER);
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
		AssemblyPackage theAssemblyPackage = (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		EnvironmentPackage theEnvironmentPackage = (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocationContextEClass.getESuperTypes().add(theViewTypePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_AssemblyContext(), theAssemblyPackage.getAssemblyContext(), theAssemblyPackage.getAssemblyContext_AllocationContext(), "assemblyContext", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationContext_Container(), theEnvironmentPackage.getContainer(), theEnvironmentPackage.getContainer_AllocationContext(), "container", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AllocationPackageImpl
