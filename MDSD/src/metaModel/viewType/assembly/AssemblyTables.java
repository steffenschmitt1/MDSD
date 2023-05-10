/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /MDSD/model/metamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package metaModel.viewType.assembly;

import metaModel.MetaModelPackage;
import metaModel.viewType.ViewTypeTables;
import metaModel.viewType.allocation.AllocationPackage;
// import metaModel.viewType.assembly.AssemblyPackage;
// import metaModel.viewType.assembly.AssemblyTables;
import metaModel.viewType.environment.EnvironmentPackage;
import metaModel.viewType.repository.RepositoryPackage;
import metaModel.viewType.repository.RepositoryTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * AssemblyTables provides the dispatch tables for the assembly for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class AssemblyTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AssemblyPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel = IdManager.getNsURIPackageId("http://metaModel", null, MetaModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_allocation = IdManager.getNsURIPackageId("http://metaModel/viewType/allocation", null, AllocationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_assembly = IdManager.getNsURIPackageId("http://metaModel/viewType/assembly", null, AssemblyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_environment = IdManager.getNsURIPackageId("http://metaModel/viewType/environment", null, EnvironmentPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_repository = IdManager.getNsURIPackageId("http://metaModel/viewType/repository", null, RepositoryPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AllocationContext = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_allocation.getClassId("AllocationContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyConnector = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("AssemblyConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyContext = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("AssemblyContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = AssemblyTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComponentBasedSystem = AssemblyTables.PACKid_http_c_s_s_metaModel.getClassId("ComponentBasedSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeComponent = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("CompositeComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Container = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Container", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnector = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("DelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnectorProvided = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("DelegationConnectorProvided", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnectorRequired = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("DelegationConnectorRequired", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Interface = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Interface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Link", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProvidedRole = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("ProvidedRole", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RequiredRole = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("RequiredRole", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = AssemblyTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("System", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CompositeComponent = TypeId.BAG.getSpecializedId(AssemblyTables.CLSSid_CompositeComponent, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyConnector = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_AssemblyConnector, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyContext = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_AssemblyContext, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssemblyContext_0 = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_AssemblyContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_Container, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DelegationConnector = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_DelegationConnector, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface_0 = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_Interface, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProvidedRole = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_ProvidedRole, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_RequiredRole = TypeId.ORDERED_SET.getSpecializedId(AssemblyTables.CLSSid_RequiredRole, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Component = TypeId.SEQUENCE.getSpecializedId(AssemblyTables.CLSSid_Component, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Interface = TypeId.SEQUENCE.getSpecializedId(AssemblyTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Interface = TypeId.SET.getSpecializedId(AssemblyTables.CLSSid_Interface, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AssemblyTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AssemblyConnector = new EcoreExecutorType(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _AssemblyContext = new EcoreExecutorType(AssemblyPackage.Literals.ASSEMBLY_CONTEXT, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeComponent = new EcoreExecutorType(AssemblyPackage.Literals.COMPOSITE_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _DelegationConnector = new EcoreExecutorType(AssemblyPackage.Literals.DELEGATION_CONNECTOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DelegationConnectorProvided = new EcoreExecutorType(AssemblyPackage.Literals.DELEGATION_CONNECTOR_PROVIDED, PACKAGE, 0);
		public static final EcoreExecutorType _DelegationConnectorRequired = new EcoreExecutorType(AssemblyPackage.Literals.DELEGATION_CONNECTOR_REQUIRED, PACKAGE, 0);
		public static final EcoreExecutorType _ProvidedRole = new EcoreExecutorType(AssemblyPackage.Literals.PROVIDED_ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _RequiredRole = new EcoreExecutorType(AssemblyPackage.Literals.REQUIRED_ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Role = new EcoreExecutorType(AssemblyPackage.Literals.ROLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _System = new EcoreExecutorType(AssemblyPackage.Literals.SYSTEM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AssemblyConnector,
			_AssemblyContext,
			_CompositeComponent,
			_DelegationConnector,
			_DelegationConnectorProvided,
			_DelegationConnectorRequired,
			_ProvidedRole,
			_RequiredRole,
			_Role,
			_System
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AssemblyConnector__AssemblyConnector = new ExecutorFragment(Types._AssemblyConnector, AssemblyTables.Types._AssemblyConnector);
		private static final ExecutorFragment _AssemblyConnector__OclAny = new ExecutorFragment(Types._AssemblyConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssemblyConnector__OclElement = new ExecutorFragment(Types._AssemblyConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssemblyContext__AssemblyContext = new ExecutorFragment(Types._AssemblyContext, AssemblyTables.Types._AssemblyContext);
		private static final ExecutorFragment _AssemblyContext__NamedElement = new ExecutorFragment(Types._AssemblyContext, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _AssemblyContext__OclAny = new ExecutorFragment(Types._AssemblyContext, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssemblyContext__OclElement = new ExecutorFragment(Types._AssemblyContext, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CompositeComponent__Component = new ExecutorFragment(Types._CompositeComponent, RepositoryTables.Types._Component);
		private static final ExecutorFragment _CompositeComponent__CompositeComponent = new ExecutorFragment(Types._CompositeComponent, AssemblyTables.Types._CompositeComponent);
		private static final ExecutorFragment _CompositeComponent__NamedElement = new ExecutorFragment(Types._CompositeComponent, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _CompositeComponent__OclAny = new ExecutorFragment(Types._CompositeComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeComponent__OclElement = new ExecutorFragment(Types._CompositeComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DelegationConnector__DelegationConnector = new ExecutorFragment(Types._DelegationConnector, AssemblyTables.Types._DelegationConnector);
		private static final ExecutorFragment _DelegationConnector__OclAny = new ExecutorFragment(Types._DelegationConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DelegationConnector__OclElement = new ExecutorFragment(Types._DelegationConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DelegationConnectorProvided__DelegationConnector = new ExecutorFragment(Types._DelegationConnectorProvided, AssemblyTables.Types._DelegationConnector);
		private static final ExecutorFragment _DelegationConnectorProvided__DelegationConnectorProvided = new ExecutorFragment(Types._DelegationConnectorProvided, AssemblyTables.Types._DelegationConnectorProvided);
		private static final ExecutorFragment _DelegationConnectorProvided__OclAny = new ExecutorFragment(Types._DelegationConnectorProvided, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DelegationConnectorProvided__OclElement = new ExecutorFragment(Types._DelegationConnectorProvided, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DelegationConnectorRequired__DelegationConnector = new ExecutorFragment(Types._DelegationConnectorRequired, AssemblyTables.Types._DelegationConnector);
		private static final ExecutorFragment _DelegationConnectorRequired__DelegationConnectorRequired = new ExecutorFragment(Types._DelegationConnectorRequired, AssemblyTables.Types._DelegationConnectorRequired);
		private static final ExecutorFragment _DelegationConnectorRequired__OclAny = new ExecutorFragment(Types._DelegationConnectorRequired, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DelegationConnectorRequired__OclElement = new ExecutorFragment(Types._DelegationConnectorRequired, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ProvidedRole__NamedElement = new ExecutorFragment(Types._ProvidedRole, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _ProvidedRole__OclAny = new ExecutorFragment(Types._ProvidedRole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProvidedRole__OclElement = new ExecutorFragment(Types._ProvidedRole, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProvidedRole__ProvidedRole = new ExecutorFragment(Types._ProvidedRole, AssemblyTables.Types._ProvidedRole);
		private static final ExecutorFragment _ProvidedRole__Role = new ExecutorFragment(Types._ProvidedRole, AssemblyTables.Types._Role);

		private static final ExecutorFragment _RequiredRole__NamedElement = new ExecutorFragment(Types._RequiredRole, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _RequiredRole__OclAny = new ExecutorFragment(Types._RequiredRole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RequiredRole__OclElement = new ExecutorFragment(Types._RequiredRole, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RequiredRole__RequiredRole = new ExecutorFragment(Types._RequiredRole, AssemblyTables.Types._RequiredRole);
		private static final ExecutorFragment _RequiredRole__Role = new ExecutorFragment(Types._RequiredRole, AssemblyTables.Types._Role);

		private static final ExecutorFragment _Role__NamedElement = new ExecutorFragment(Types._Role, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, AssemblyTables.Types._Role);

		private static final ExecutorFragment _System__OclAny = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _System__OclElement = new ExecutorFragment(Types._System, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _System__System = new ExecutorFragment(Types._System, AssemblyTables.Types._System);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AssemblyConnector__providedRole = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, Types._AssemblyConnector, 0);
		public static final ExecutorProperty _AssemblyConnector__requiredRole = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, Types._AssemblyConnector, 1);
		public static final ExecutorProperty _AssemblyConnector__System__assemblyConnectors = new ExecutorPropertyWithImplementation("System", Types._AssemblyConnector, 2, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.SYSTEM__ASSEMBLY_CONNECTORS));

		public static final ExecutorProperty _AssemblyContext__allocationContext = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, Types._AssemblyContext, 0);
		public static final ExecutorProperty _AssemblyContext__instanceOf = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONTEXT__INSTANCE_OF, Types._AssemblyContext, 1);
		public static final ExecutorProperty _AssemblyContext__provides = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONTEXT__PROVIDES, Types._AssemblyContext, 2);
		public static final ExecutorProperty _AssemblyContext__requires = new EcoreExecutorProperty(AssemblyPackage.Literals.ASSEMBLY_CONTEXT__REQUIRES, Types._AssemblyContext, 3);
		public static final ExecutorProperty _AssemblyContext__CompositeComponent__encapsulatedInstances = new ExecutorPropertyWithImplementation("CompositeComponent", Types._AssemblyContext, 4, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES));
		public static final ExecutorProperty _AssemblyContext__System__encapsulatedInstances = new ExecutorPropertyWithImplementation("System", Types._AssemblyContext, 5, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.SYSTEM__ENCAPSULATED_INSTANCES));

		public static final ExecutorProperty _CompositeComponent__encapsulatedInstances = new EcoreExecutorProperty(AssemblyPackage.Literals.COMPOSITE_COMPONENT__ENCAPSULATED_INSTANCES, Types._CompositeComponent, 0);

		public static final ExecutorProperty _DelegationConnector__linkedInterface = new EcoreExecutorProperty(AssemblyPackage.Literals.DELEGATION_CONNECTOR__LINKED_INTERFACE, Types._DelegationConnector, 0);
		public static final ExecutorProperty _DelegationConnector__System__delegationConnectors = new ExecutorPropertyWithImplementation("System", Types._DelegationConnector, 1, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.SYSTEM__DELEGATION_CONNECTORS));

		public static final ExecutorProperty _DelegationConnectorProvided__linkdedRole = new EcoreExecutorProperty(AssemblyPackage.Literals.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE, Types._DelegationConnectorProvided, 0);

		public static final ExecutorProperty _DelegationConnectorRequired__linkedRole = new EcoreExecutorProperty(AssemblyPackage.Literals.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, Types._DelegationConnectorRequired, 0);

		public static final ExecutorProperty _ProvidedRole__assemblyConnector = new EcoreExecutorProperty(AssemblyPackage.Literals.PROVIDED_ROLE__ASSEMBLY_CONNECTOR, Types._ProvidedRole, 0);
		public static final ExecutorProperty _ProvidedRole__assemblyContext = new EcoreExecutorProperty(AssemblyPackage.Literals.PROVIDED_ROLE__ASSEMBLY_CONTEXT, Types._ProvidedRole, 1);
		public static final ExecutorProperty _ProvidedRole__delegationConnector = new EcoreExecutorProperty(AssemblyPackage.Literals.PROVIDED_ROLE__DELEGATION_CONNECTOR, Types._ProvidedRole, 2);

		public static final ExecutorProperty _RequiredRole__assemblyConnector = new EcoreExecutorProperty(AssemblyPackage.Literals.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, Types._RequiredRole, 0);
		public static final ExecutorProperty _RequiredRole__assemblyContext = new EcoreExecutorProperty(AssemblyPackage.Literals.REQUIRED_ROLE__ASSEMBLY_CONTEXT, Types._RequiredRole, 1);
		public static final ExecutorProperty _RequiredRole__delegationConnector = new EcoreExecutorProperty(AssemblyPackage.Literals.REQUIRED_ROLE__DELEGATION_CONNECTOR, Types._RequiredRole, 2);

		public static final ExecutorProperty _System__assemblyConnectors = new EcoreExecutorProperty(AssemblyPackage.Literals.SYSTEM__ASSEMBLY_CONNECTORS, Types._System, 0);
		public static final ExecutorProperty _System__delegationConnectors = new EcoreExecutorProperty(AssemblyPackage.Literals.SYSTEM__DELEGATION_CONNECTORS, Types._System, 1);
		public static final ExecutorProperty _System__encapsulatedInstances = new EcoreExecutorProperty(AssemblyPackage.Literals.SYSTEM__ENCAPSULATED_INSTANCES, Types._System, 2);
		public static final ExecutorProperty _System__provides = new EcoreExecutorProperty(AssemblyPackage.Literals.SYSTEM__PROVIDES, Types._System, 3);
		public static final ExecutorProperty _System__ComponentBasedSystem__systems = new ExecutorPropertyWithImplementation("ComponentBasedSystem", Types._System, 4, new EcoreLibraryOppositeProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__SYSTEMS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AssemblyConnector =
			{
				Fragments._AssemblyConnector__OclAny /* 0 */,
				Fragments._AssemblyConnector__OclElement /* 1 */,
				Fragments._AssemblyConnector__AssemblyConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __AssemblyConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssemblyContext =
			{
				Fragments._AssemblyContext__OclAny /* 0 */,
				Fragments._AssemblyContext__OclElement /* 1 */,
				Fragments._AssemblyContext__NamedElement /* 2 */,
				Fragments._AssemblyContext__AssemblyContext /* 3 */
			};
		private static final int /*@NonNull*/ [] __AssemblyContext = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeComponent =
			{
				Fragments._CompositeComponent__OclAny /* 0 */,
				Fragments._CompositeComponent__OclElement /* 1 */,
				Fragments._CompositeComponent__NamedElement /* 2 */,
				Fragments._CompositeComponent__Component /* 3 */,
				Fragments._CompositeComponent__CompositeComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __CompositeComponent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DelegationConnector =
			{
				Fragments._DelegationConnector__OclAny /* 0 */,
				Fragments._DelegationConnector__OclElement /* 1 */,
				Fragments._DelegationConnector__DelegationConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __DelegationConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DelegationConnectorProvided =
			{
				Fragments._DelegationConnectorProvided__OclAny /* 0 */,
				Fragments._DelegationConnectorProvided__OclElement /* 1 */,
				Fragments._DelegationConnectorProvided__DelegationConnector /* 2 */,
				Fragments._DelegationConnectorProvided__DelegationConnectorProvided /* 3 */
			};
		private static final int /*@NonNull*/ [] __DelegationConnectorProvided = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DelegationConnectorRequired =
			{
				Fragments._DelegationConnectorRequired__OclAny /* 0 */,
				Fragments._DelegationConnectorRequired__OclElement /* 1 */,
				Fragments._DelegationConnectorRequired__DelegationConnector /* 2 */,
				Fragments._DelegationConnectorRequired__DelegationConnectorRequired /* 3 */
			};
		private static final int /*@NonNull*/ [] __DelegationConnectorRequired = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProvidedRole =
			{
				Fragments._ProvidedRole__OclAny /* 0 */,
				Fragments._ProvidedRole__OclElement /* 1 */,
				Fragments._ProvidedRole__NamedElement /* 2 */,
				Fragments._ProvidedRole__Role /* 3 */,
				Fragments._ProvidedRole__ProvidedRole /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProvidedRole = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RequiredRole =
			{
				Fragments._RequiredRole__OclAny /* 0 */,
				Fragments._RequiredRole__OclElement /* 1 */,
				Fragments._RequiredRole__NamedElement /* 2 */,
				Fragments._RequiredRole__Role /* 3 */,
				Fragments._RequiredRole__RequiredRole /* 4 */
			};
		private static final int /*@NonNull*/ [] __RequiredRole = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__NamedElement /* 2 */,
				Fragments._Role__Role /* 3 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _System =
			{
				Fragments._System__OclAny /* 0 */,
				Fragments._System__OclElement /* 1 */,
				Fragments._System__System /* 2 */
			};
		private static final int /*@NonNull*/ [] __System = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AssemblyConnector.initFragments(_AssemblyConnector, __AssemblyConnector);
			Types._AssemblyContext.initFragments(_AssemblyContext, __AssemblyContext);
			Types._CompositeComponent.initFragments(_CompositeComponent, __CompositeComponent);
			Types._DelegationConnector.initFragments(_DelegationConnector, __DelegationConnector);
			Types._DelegationConnectorProvided.initFragments(_DelegationConnectorProvided, __DelegationConnectorProvided);
			Types._DelegationConnectorRequired.initFragments(_DelegationConnectorRequired, __DelegationConnectorRequired);
			Types._ProvidedRole.initFragments(_ProvidedRole, __ProvidedRole);
			Types._RequiredRole.initFragments(_RequiredRole, __RequiredRole);
			Types._Role.initFragments(_Role, __Role);
			Types._System.initFragments(_System, __System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__AssemblyConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__AssemblyContext = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssemblyContext__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__CompositeComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__DelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorProvided__DelegationConnectorProvided = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorProvided__DelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorProvided__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorProvided__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorRequired__DelegationConnectorRequired = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorRequired__DelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorRequired__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DelegationConnectorRequired__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProvidedRole__ProvidedRole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProvidedRole__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProvidedRole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProvidedRole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProvidedRole__Role = {};

		private static final ExecutorOperation /*@NonNull*/ [] _RequiredRole__RequiredRole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RequiredRole__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RequiredRole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RequiredRole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RequiredRole__Role = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _System__System = {};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _System__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AssemblyConnector__AssemblyConnector.initOperations(_AssemblyConnector__AssemblyConnector);
			Fragments._AssemblyConnector__OclAny.initOperations(_AssemblyConnector__OclAny);
			Fragments._AssemblyConnector__OclElement.initOperations(_AssemblyConnector__OclElement);

			Fragments._AssemblyContext__AssemblyContext.initOperations(_AssemblyContext__AssemblyContext);
			Fragments._AssemblyContext__NamedElement.initOperations(_AssemblyContext__NamedElement);
			Fragments._AssemblyContext__OclAny.initOperations(_AssemblyContext__OclAny);
			Fragments._AssemblyContext__OclElement.initOperations(_AssemblyContext__OclElement);

			Fragments._CompositeComponent__Component.initOperations(_CompositeComponent__Component);
			Fragments._CompositeComponent__CompositeComponent.initOperations(_CompositeComponent__CompositeComponent);
			Fragments._CompositeComponent__NamedElement.initOperations(_CompositeComponent__NamedElement);
			Fragments._CompositeComponent__OclAny.initOperations(_CompositeComponent__OclAny);
			Fragments._CompositeComponent__OclElement.initOperations(_CompositeComponent__OclElement);

			Fragments._DelegationConnector__DelegationConnector.initOperations(_DelegationConnector__DelegationConnector);
			Fragments._DelegationConnector__OclAny.initOperations(_DelegationConnector__OclAny);
			Fragments._DelegationConnector__OclElement.initOperations(_DelegationConnector__OclElement);

			Fragments._DelegationConnectorProvided__DelegationConnector.initOperations(_DelegationConnectorProvided__DelegationConnector);
			Fragments._DelegationConnectorProvided__DelegationConnectorProvided.initOperations(_DelegationConnectorProvided__DelegationConnectorProvided);
			Fragments._DelegationConnectorProvided__OclAny.initOperations(_DelegationConnectorProvided__OclAny);
			Fragments._DelegationConnectorProvided__OclElement.initOperations(_DelegationConnectorProvided__OclElement);

			Fragments._DelegationConnectorRequired__DelegationConnector.initOperations(_DelegationConnectorRequired__DelegationConnector);
			Fragments._DelegationConnectorRequired__DelegationConnectorRequired.initOperations(_DelegationConnectorRequired__DelegationConnectorRequired);
			Fragments._DelegationConnectorRequired__OclAny.initOperations(_DelegationConnectorRequired__OclAny);
			Fragments._DelegationConnectorRequired__OclElement.initOperations(_DelegationConnectorRequired__OclElement);

			Fragments._ProvidedRole__NamedElement.initOperations(_ProvidedRole__NamedElement);
			Fragments._ProvidedRole__OclAny.initOperations(_ProvidedRole__OclAny);
			Fragments._ProvidedRole__OclElement.initOperations(_ProvidedRole__OclElement);
			Fragments._ProvidedRole__ProvidedRole.initOperations(_ProvidedRole__ProvidedRole);
			Fragments._ProvidedRole__Role.initOperations(_ProvidedRole__Role);

			Fragments._RequiredRole__NamedElement.initOperations(_RequiredRole__NamedElement);
			Fragments._RequiredRole__OclAny.initOperations(_RequiredRole__OclAny);
			Fragments._RequiredRole__OclElement.initOperations(_RequiredRole__OclElement);
			Fragments._RequiredRole__RequiredRole.initOperations(_RequiredRole__RequiredRole);
			Fragments._RequiredRole__Role.initOperations(_RequiredRole__Role);

			Fragments._Role__NamedElement.initOperations(_Role__NamedElement);
			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._System__OclAny.initOperations(_System__OclAny);
			Fragments._System__OclElement.initOperations(_System__OclElement);
			Fragments._System__System.initOperations(_System__System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AssemblyConnector = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AssemblyTables.Properties._AssemblyConnector__providedRole,
			AssemblyTables.Properties._AssemblyConnector__requiredRole
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssemblyContext = {
			AssemblyTables.Properties._AssemblyContext__allocationContext,
			AssemblyTables.Properties._AssemblyContext__instanceOf,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AssemblyTables.Properties._AssemblyContext__provides,
			AssemblyTables.Properties._AssemblyContext__requires
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeComponent = {
			RepositoryTables.Properties._Component__description,
			AssemblyTables.Properties._CompositeComponent__encapsulatedInstances,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._Component__provides,
			RepositoryTables.Properties._Component__requires
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DelegationConnector = {
			AssemblyTables.Properties._DelegationConnector__linkedInterface,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DelegationConnectorProvided = {
			AssemblyTables.Properties._DelegationConnectorProvided__linkdedRole,
			AssemblyTables.Properties._DelegationConnector__linkedInterface,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DelegationConnectorRequired = {
			AssemblyTables.Properties._DelegationConnector__linkedInterface,
			AssemblyTables.Properties._DelegationConnectorRequired__linkedRole,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProvidedRole = {
			AssemblyTables.Properties._ProvidedRole__assemblyConnector,
			AssemblyTables.Properties._ProvidedRole__assemblyContext,
			AssemblyTables.Properties._ProvidedRole__delegationConnector,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RequiredRole = {
			AssemblyTables.Properties._RequiredRole__assemblyConnector,
			AssemblyTables.Properties._RequiredRole__assemblyContext,
			AssemblyTables.Properties._RequiredRole__delegationConnector,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _System = {
			AssemblyTables.Properties._System__assemblyConnectors,
			AssemblyTables.Properties._System__delegationConnectors,
			AssemblyTables.Properties._System__encapsulatedInstances,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AssemblyTables.Properties._System__provides
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AssemblyConnector__AssemblyConnector.initProperties(_AssemblyConnector);
			Fragments._AssemblyContext__AssemblyContext.initProperties(_AssemblyContext);
			Fragments._CompositeComponent__CompositeComponent.initProperties(_CompositeComponent);
			Fragments._DelegationConnector__DelegationConnector.initProperties(_DelegationConnector);
			Fragments._DelegationConnectorProvided__DelegationConnectorProvided.initProperties(_DelegationConnectorProvided);
			Fragments._DelegationConnectorRequired__DelegationConnectorRequired.initProperties(_DelegationConnectorRequired);
			Fragments._ProvidedRole__ProvidedRole.initProperties(_ProvidedRole);
			Fragments._RequiredRole__RequiredRole.initProperties(_RequiredRole);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._System__System.initProperties(_System);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AssemblyTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new AssemblyTables();
	}

	private AssemblyTables() {
		super(AssemblyPackage.eNS_URI);
	}
}
