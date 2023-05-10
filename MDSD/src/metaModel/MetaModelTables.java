/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /MDSD/model/metamodel.ecore
 * using:
 *   /MDSD/model/metamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package metaModel;

// import metaModel.MetaModelTables;
import metaModel.viewType.allocation.AllocationPackage;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.environment.EnvironmentPackage;
import metaModel.viewType.repository.RepositoryPackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * MetaModelTables provides the dispatch tables for the metaModel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MetaModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MetaModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_allocation = IdManager.getNsURIPackageId("http://metaModel/viewType/allocation", null, AllocationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_assembly = IdManager.getNsURIPackageId("http://metaModel/viewType/assembly", null, AssemblyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_environment = IdManager.getNsURIPackageId("http://metaModel/viewType/environment", null, EnvironmentPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_repository = IdManager.getNsURIPackageId("http://metaModel/viewType/repository", null, RepositoryPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AllocationContext = MetaModelTables.PACKid_http_c_s_s_metaModel_s_viewType_s_allocation.getClassId("AllocationContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enivronment = MetaModelTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Enivronment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Repository = MetaModelTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Repository", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = MetaModelTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("System", 0);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AllocationContext = TypeId.ORDERED_SET.getSpecializedId(MetaModelTables.CLSSid_AllocationContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enivronment = TypeId.ORDERED_SET.getSpecializedId(MetaModelTables.CLSSid_Enivronment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Repository = TypeId.ORDERED_SET.getSpecializedId(MetaModelTables.CLSSid_Repository, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_System = TypeId.ORDERED_SET.getSpecializedId(MetaModelTables.CLSSid_System, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MetaModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _ComponentBasedSystem = new EcoreExecutorType(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_ComponentBasedSystem
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _ComponentBasedSystem__ComponentBasedSystem = new ExecutorFragment(Types._ComponentBasedSystem, MetaModelTables.Types._ComponentBasedSystem);
		private static final ExecutorFragment _ComponentBasedSystem__OclAny = new ExecutorFragment(Types._ComponentBasedSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComponentBasedSystem__OclElement = new ExecutorFragment(Types._ComponentBasedSystem, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of MetaModelTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of MetaModelTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _ComponentBasedSystem__allocationContexts = new EcoreExecutorProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS, Types._ComponentBasedSystem, 0);
		public static final ExecutorProperty _ComponentBasedSystem__enivronments = new EcoreExecutorProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__ENIVRONMENTS, Types._ComponentBasedSystem, 1);
		public static final ExecutorProperty _ComponentBasedSystem__repositories = new EcoreExecutorProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__REPOSITORIES, Types._ComponentBasedSystem, 2);
		public static final ExecutorProperty _ComponentBasedSystem__systems = new EcoreExecutorProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__SYSTEMS, Types._ComponentBasedSystem, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _ComponentBasedSystem =
			{
				Fragments._ComponentBasedSystem__OclAny /* 0 */,
				Fragments._ComponentBasedSystem__OclElement /* 1 */,
				Fragments._ComponentBasedSystem__ComponentBasedSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __ComponentBasedSystem = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ComponentBasedSystem.initFragments(_ComponentBasedSystem, __ComponentBasedSystem);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _ComponentBasedSystem__ComponentBasedSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComponentBasedSystem__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ComponentBasedSystem__OclElement = {
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
			Fragments._ComponentBasedSystem__ComponentBasedSystem.initOperations(_ComponentBasedSystem__ComponentBasedSystem);
			Fragments._ComponentBasedSystem__OclAny.initOperations(_ComponentBasedSystem__OclAny);
			Fragments._ComponentBasedSystem__OclElement.initOperations(_ComponentBasedSystem__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _ComponentBasedSystem = {
			MetaModelTables.Properties._ComponentBasedSystem__allocationContexts,
			MetaModelTables.Properties._ComponentBasedSystem__enivronments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaModelTables.Properties._ComponentBasedSystem__repositories,
			MetaModelTables.Properties._ComponentBasedSystem__systems
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ComponentBasedSystem__ComponentBasedSystem.initProperties(_ComponentBasedSystem);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaModelTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of MetaModelTables::EnumerationLiterals and all preceding sub-packages.
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
		new MetaModelTables();
	}

	private MetaModelTables() {
		super(MetaModelPackage.eNS_URI);
	}
}
