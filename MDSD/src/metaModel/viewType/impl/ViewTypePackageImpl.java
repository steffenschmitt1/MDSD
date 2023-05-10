/**
 */
package metaModel.viewType.impl;

import metaModel.MetaModelPackage;

import metaModel.impl.MetaModelPackageImpl;

import metaModel.viewType.NamedElement;
import metaModel.viewType.ViewTypeFactory;
import metaModel.viewType.ViewTypePackage;

import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.allocation.impl.AllocationPackageImpl;

import metaModel.viewType.assembly.AssemblyPackage;

import metaModel.viewType.assembly.impl.AssemblyPackageImpl;

import metaModel.viewType.environment.EnvironmentPackage;

import metaModel.viewType.environment.impl.EnvironmentPackageImpl;

import metaModel.viewType.repository.RepositoryPackage;

import metaModel.viewType.repository.impl.RepositoryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewTypePackageImpl extends EPackageImpl implements ViewTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	 * @see metaModel.viewType.ViewTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewTypePackageImpl() {
		super(eNS_URI, ViewTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewTypePackage init() {
		if (isInited) return (ViewTypePackage)EPackage.Registry.INSTANCE.getEPackage(ViewTypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewTypePackageImpl theViewTypePackage = registeredViewTypePackage instanceof ViewTypePackageImpl ? (ViewTypePackageImpl)registeredViewTypePackage : new ViewTypePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaModelPackage.eNS_URI);
		MetaModelPackageImpl theMetaModelPackage = (MetaModelPackageImpl)(registeredPackage instanceof MetaModelPackageImpl ? registeredPackage : MetaModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(registeredPackage instanceof AssemblyPackageImpl ? registeredPackage : AssemblyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(registeredPackage instanceof AllocationPackageImpl ? registeredPackage : AllocationPackage.eINSTANCE);

		// Create package meta-data objects
		theViewTypePackage.createPackageContents();
		theMetaModelPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theViewTypePackage.initializePackageContents();
		theMetaModelPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewTypePackage.eNS_URI, theViewTypePackage);
		return theViewTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTypeFactory getViewTypeFactory() {
		return (ViewTypeFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		AssemblyPackage theAssemblyPackage = (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		EnvironmentPackage theEnvironmentPackage = (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRepositoryPackage);
		getESubpackages().add(theAssemblyPackage);
		getESubpackages().add(theEnvironmentPackage);
		getESubpackages().add(theAllocationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ViewTypePackageImpl
