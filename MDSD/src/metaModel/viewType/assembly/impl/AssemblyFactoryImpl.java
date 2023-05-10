/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.viewType.assembly.AssemblyConnector;
import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.CompositeComponent;
import metaModel.viewType.assembly.DelegationConnectorProvided;
import metaModel.viewType.assembly.DelegationConnectorRequired;
import metaModel.viewType.assembly.ProvidedRole;
import metaModel.viewType.assembly.RequiredRole;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyFactoryImpl extends EFactoryImpl implements AssemblyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyFactory init() {
		try {
			AssemblyFactory theAssemblyFactory = (AssemblyFactory)EPackage.Registry.INSTANCE.getEFactory(AssemblyPackage.eNS_URI);
			if (theAssemblyFactory != null) {
				return theAssemblyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssemblyPackage.ASSEMBLY_CONTEXT: return createAssemblyContext();
			case AssemblyPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case AssemblyPackage.SYSTEM: return createSystem();
			case AssemblyPackage.REQUIRED_ROLE: return createRequiredRole();
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED: return createDelegationConnectorRequired();
			case AssemblyPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case AssemblyPackage.PROVIDED_ROLE: return createProvidedRole();
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED: return createDelegationConnectorProvided();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext createAssemblyContext() {
		AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metaModel.viewType.assembly.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole createRequiredRole() {
		RequiredRoleImpl requiredRole = new RequiredRoleImpl();
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorRequired createDelegationConnectorRequired() {
		DelegationConnectorRequiredImpl delegationConnectorRequired = new DelegationConnectorRequiredImpl();
		return delegationConnectorRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole createProvidedRole() {
		ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorProvided createDelegationConnectorProvided() {
		DelegationConnectorProvidedImpl delegationConnectorProvided = new DelegationConnectorProvidedImpl();
		return delegationConnectorProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyPackage getAssemblyPackage() {
		return (AssemblyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyPackage getPackage() {
		return AssemblyPackage.eINSTANCE;
	}

} //AssemblyFactoryImpl
