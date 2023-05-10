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
package metaModel.viewType.environment;

import metaModel.MetaModelPackage;
import metaModel.viewType.ViewTypeTables;
import metaModel.viewType.allocation.AllocationPackage;
// import metaModel.viewType.environment.EnvironmentPackage;
// import metaModel.viewType.environment.EnvironmentTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
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
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * EnvironmentTables provides the dispatch tables for the environment for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EnvironmentTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EnvironmentPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel = IdManager.getNsURIPackageId("http://metaModel", null, MetaModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_allocation = IdManager.getNsURIPackageId("http://metaModel/viewType/allocation", null, AllocationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_environment = IdManager.getNsURIPackageId("http://metaModel/viewType/environment", null, EnvironmentPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AllocationContext = EnvironmentTables.PACKid_http_c_s_s_metaModel_s_viewType_s_allocation.getClassId("AllocationContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComponentBasedSystem = EnvironmentTables.PACKid_http_c_s_s_metaModel.getClassId("ComponentBasedSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Container = EnvironmentTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Container", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enivronment = EnvironmentTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Enivronment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = EnvironmentTables.PACKid_http_c_s_s_metaModel_s_viewType_s_environment.getClassId("Link", 0);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AllocationContext = TypeId.ORDERED_SET.getSpecializedId(EnvironmentTables.CLSSid_AllocationContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container = TypeId.ORDERED_SET.getSpecializedId(EnvironmentTables.CLSSid_Container, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container_0 = TypeId.ORDERED_SET.getSpecializedId(EnvironmentTables.CLSSid_Container, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(EnvironmentTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EnvironmentTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Container = new EcoreExecutorType(EnvironmentPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final EcoreExecutorType _Enivronment = new EcoreExecutorType(EnvironmentPackage.Literals.ENIVRONMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Link = new EcoreExecutorType(EnvironmentPackage.Literals.LINK, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Container,
			_Enivronment,
			_Link
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, EnvironmentTables.Types._Container);
		private static final ExecutorFragment _Container__NamedElement = new ExecutorFragment(Types._Container, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enivronment__Enivronment = new ExecutorFragment(Types._Enivronment, EnvironmentTables.Types._Enivronment);
		private static final ExecutorFragment _Enivronment__OclAny = new ExecutorFragment(Types._Enivronment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enivronment__OclElement = new ExecutorFragment(Types._Enivronment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, EnvironmentTables.Types._Link);
		private static final ExecutorFragment _Link__NamedElement = new ExecutorFragment(Types._Link, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of EnvironmentTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of EnvironmentTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Container__allocationContext = new EcoreExecutorProperty(EnvironmentPackage.Literals.CONTAINER__ALLOCATION_CONTEXT, Types._Container, 0);
		public static final ExecutorProperty _Container__links = new EcoreExecutorProperty(EnvironmentPackage.Literals.CONTAINER__LINKS, Types._Container, 1);
		public static final ExecutorProperty _Container__Enivronment__container = new ExecutorPropertyWithImplementation("Enivronment", Types._Container, 2, new EcoreLibraryOppositeProperty(EnvironmentPackage.Literals.ENIVRONMENT__CONTAINER));

		public static final ExecutorProperty _Enivronment__container = new EcoreExecutorProperty(EnvironmentPackage.Literals.ENIVRONMENT__CONTAINER, Types._Enivronment, 0);
		public static final ExecutorProperty _Enivronment__link = new EcoreExecutorProperty(EnvironmentPackage.Literals.ENIVRONMENT__LINK, Types._Enivronment, 1);
		public static final ExecutorProperty _Enivronment__ComponentBasedSystem__enivronments = new ExecutorPropertyWithImplementation("ComponentBasedSystem", Types._Enivronment, 2, new EcoreLibraryOppositeProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__ENIVRONMENTS));

		public static final ExecutorProperty _Link__containers = new EcoreExecutorProperty(EnvironmentPackage.Literals.LINK__CONTAINERS, Types._Link, 0);
		public static final ExecutorProperty _Link__Enivronment__link = new ExecutorPropertyWithImplementation("Enivronment", Types._Link, 1, new EcoreLibraryOppositeProperty(EnvironmentPackage.Literals.ENIVRONMENT__LINK));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Container =
			{
				Fragments._Container__OclAny /* 0 */,
				Fragments._Container__OclElement /* 1 */,
				Fragments._Container__NamedElement /* 2 */,
				Fragments._Container__Container /* 3 */
			};
		private static final int /*@NonNull*/ [] __Container = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enivronment =
			{
				Fragments._Enivronment__OclAny /* 0 */,
				Fragments._Enivronment__OclElement /* 1 */,
				Fragments._Enivronment__Enivronment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enivronment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__NamedElement /* 2 */,
				Fragments._Link__Link /* 3 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Container.initFragments(_Container, __Container);
			Types._Enivronment.initFragments(_Enivronment, __Enivronment);
			Types._Link.initFragments(_Link, __Link);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Container__Container = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Enivronment__Enivronment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enivronment__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Enivronment__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Link__Link = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
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
			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__NamedElement.initOperations(_Container__NamedElement);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);

			Fragments._Enivronment__Enivronment.initOperations(_Enivronment__Enivronment);
			Fragments._Enivronment__OclAny.initOperations(_Enivronment__OclAny);
			Fragments._Enivronment__OclElement.initOperations(_Enivronment__OclElement);

			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__NamedElement.initOperations(_Link__NamedElement);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Container = {
			EnvironmentTables.Properties._Container__allocationContext,
			EnvironmentTables.Properties._Container__links,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enivronment = {
			EnvironmentTables.Properties._Enivronment__container,
			EnvironmentTables.Properties._Enivronment__link,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Link = {
			EnvironmentTables.Properties._Link__containers,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Container__Container.initProperties(_Container);
			Fragments._Enivronment__Enivronment.initProperties(_Enivronment);
			Fragments._Link__Link.initProperties(_Link);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnvironmentTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of EnvironmentTables::EnumerationLiterals and all preceding sub-packages.
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
		new EnvironmentTables();
	}

	private EnvironmentTables() {
		super(EnvironmentPackage.eNS_URI);
	}
}
