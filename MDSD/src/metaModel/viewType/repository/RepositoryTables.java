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
package metaModel.viewType.repository;

import metaModel.MetaModelPackage;
import metaModel.viewType.ViewTypeTables;
import metaModel.viewType.assembly.AssemblyPackage;
// import metaModel.viewType.repository.RepositoryPackage;
// import metaModel.viewType.repository.RepositoryTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.ids.WildcardId;
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

/**
 * RepositoryTables provides the dispatch tables for the repository for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RepositoryTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RepositoryPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel = IdManager.getNsURIPackageId("http://metaModel", null, MetaModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_assembly = IdManager.getNsURIPackageId("http://metaModel/viewType/assembly", null, AssemblyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_metaModel_s_viewType_s_repository = IdManager.getNsURIPackageId("http://metaModel/viewType/repository", null, RepositoryPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ WildcardId WILDid_ = IdManager.getWildcardId();
	public static final /*@NonInvalid*/ ClassId CLSSid_AssemblyContext = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("AssemblyContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BehaviourDescription = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("BehaviourDescription", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Branch = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Branch", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplexType = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("ComplexType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComponentBasedSystem = RepositoryTables.PACKid_http_c_s_s_metaModel.getClassId("ComponentBasedSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DelegationConnector = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("DelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExternalCall = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("ExternalCall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Interface = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Interface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InternalAction = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("InternalAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Loop = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Loop", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ParameterType = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("ParameterType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Repository = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Repository", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Signature = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Signature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_assembly.getClassId("System", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Type = RepositoryTables.PACKid_http_c_s_s_metaModel_s_viewType_s_repository.getClassId("Type", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ECharacterObject = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ECharacterObject", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EEList = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EEList", 1);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloatObject = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloatObject", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EIntegerObject = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EIntegerObject", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELongObject = RepositoryTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELongObject", 0);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AssemblyContext = TypeId.BAG.getSpecializedId(RepositoryTables.CLSSid_AssemblyContext, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Component = TypeId.BAG.getSpecializedId(RepositoryTables.CLSSid_Component, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DelegationConnector = TypeId.BAG.getSpecializedId(RepositoryTables.CLSSid_DelegationConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_System = TypeId.BAG.getSpecializedId(RepositoryTables.CLSSid_System, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Branch = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Branch, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Component = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Component, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExternalCall = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_ExternalCall, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_InternalAction = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_InternalAction, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Loop = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Loop, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Parameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParameterType = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_ParameterType, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Signature = TypeId.ORDERED_SET.getSpecializedId(RepositoryTables.CLSSid_Signature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RepositoryTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _BehaviourDescription = new EcoreExecutorType(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanType = new EcoreExecutorType(RepositoryPackage.Literals.BOOLEAN_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Branch = new EcoreExecutorType(RepositoryPackage.Literals.BRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _CharType = new EcoreExecutorType(RepositoryPackage.Literals.CHAR_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ComplexType = new EcoreExecutorType(RepositoryPackage.Literals.COMPLEX_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(RepositoryPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _DateType = new EcoreExecutorType(RepositoryPackage.Literals.DATE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ExternalCall = new EcoreExecutorType(RepositoryPackage.Literals.EXTERNAL_CALL, PACKAGE, 0);
		public static final EcoreExecutorType _FloatType = new EcoreExecutorType(RepositoryPackage.Literals.FLOAT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _IntType = new EcoreExecutorType(RepositoryPackage.Literals.INT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Interface = new EcoreExecutorType(RepositoryPackage.Literals.INTERFACE, PACKAGE, 0);
		public static final EcoreExecutorType _InternalAction = new EcoreExecutorType(RepositoryPackage.Literals.INTERNAL_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _ListType = new EcoreExecutorType(RepositoryPackage.Literals.LIST_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _LongType = new EcoreExecutorType(RepositoryPackage.Literals.LONG_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Loop = new EcoreExecutorType(RepositoryPackage.Literals.LOOP, PACKAGE, 0);
		public static final EcoreExecutorType _MapType = new EcoreExecutorType(RepositoryPackage.Literals.MAP_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(RepositoryPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _ParameterType = new EcoreExecutorType(RepositoryPackage.Literals.PARAMETER_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Repository = new EcoreExecutorType(RepositoryPackage.Literals.REPOSITORY, PACKAGE, 0);
		public static final EcoreExecutorType _Signature = new EcoreExecutorType(RepositoryPackage.Literals.SIGNATURE, PACKAGE, 0);
		public static final EcoreExecutorType _SimpleType = new EcoreExecutorType(RepositoryPackage.Literals.SIMPLE_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _StringType = new EcoreExecutorType(RepositoryPackage.Literals.STRING_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Type = new EcoreExecutorType(RepositoryPackage.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _VoidType = new EcoreExecutorType(RepositoryPackage.Literals.VOID_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BehaviourDescription,
			_BooleanType,
			_Branch,
			_CharType,
			_ComplexType,
			_Component,
			_DateType,
			_ExternalCall,
			_FloatType,
			_IntType,
			_Interface,
			_InternalAction,
			_ListType,
			_LongType,
			_Loop,
			_MapType,
			_Parameter,
			_ParameterType,
			_Repository,
			_Signature,
			_SimpleType,
			_StringType,
			_Type,
			_VoidType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _BehaviourDescription__BehaviourDescription = new ExecutorFragment(Types._BehaviourDescription, RepositoryTables.Types._BehaviourDescription);
		private static final ExecutorFragment _BehaviourDescription__OclAny = new ExecutorFragment(Types._BehaviourDescription, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BehaviourDescription__OclElement = new ExecutorFragment(Types._BehaviourDescription, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BooleanType__BooleanType = new ExecutorFragment(Types._BooleanType, RepositoryTables.Types._BooleanType);
		private static final ExecutorFragment _BooleanType__OclAny = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanType__OclElement = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanType__ParameterType = new ExecutorFragment(Types._BooleanType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _BooleanType__SimpleType = new ExecutorFragment(Types._BooleanType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _BooleanType__Type = new ExecutorFragment(Types._BooleanType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, RepositoryTables.Types._Branch);
		private static final ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CharType__CharType = new ExecutorFragment(Types._CharType, RepositoryTables.Types._CharType);
		private static final ExecutorFragment _CharType__OclAny = new ExecutorFragment(Types._CharType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CharType__OclElement = new ExecutorFragment(Types._CharType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CharType__ParameterType = new ExecutorFragment(Types._CharType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _CharType__SimpleType = new ExecutorFragment(Types._CharType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _CharType__Type = new ExecutorFragment(Types._CharType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _ComplexType__ComplexType = new ExecutorFragment(Types._ComplexType, RepositoryTables.Types._ComplexType);
		private static final ExecutorFragment _ComplexType__OclAny = new ExecutorFragment(Types._ComplexType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplexType__OclElement = new ExecutorFragment(Types._ComplexType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ComplexType__ParameterType = new ExecutorFragment(Types._ComplexType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _ComplexType__Type = new ExecutorFragment(Types._ComplexType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, RepositoryTables.Types._Component);
		private static final ExecutorFragment _Component__NamedElement = new ExecutorFragment(Types._Component, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DateType__DateType = new ExecutorFragment(Types._DateType, RepositoryTables.Types._DateType);
		private static final ExecutorFragment _DateType__OclAny = new ExecutorFragment(Types._DateType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DateType__OclElement = new ExecutorFragment(Types._DateType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DateType__ParameterType = new ExecutorFragment(Types._DateType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _DateType__SimpleType = new ExecutorFragment(Types._DateType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _DateType__Type = new ExecutorFragment(Types._DateType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _ExternalCall__ExternalCall = new ExecutorFragment(Types._ExternalCall, RepositoryTables.Types._ExternalCall);
		private static final ExecutorFragment _ExternalCall__OclAny = new ExecutorFragment(Types._ExternalCall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExternalCall__OclElement = new ExecutorFragment(Types._ExternalCall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FloatType__FloatType = new ExecutorFragment(Types._FloatType, RepositoryTables.Types._FloatType);
		private static final ExecutorFragment _FloatType__OclAny = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FloatType__OclElement = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FloatType__ParameterType = new ExecutorFragment(Types._FloatType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _FloatType__SimpleType = new ExecutorFragment(Types._FloatType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _FloatType__Type = new ExecutorFragment(Types._FloatType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _IntType__IntType = new ExecutorFragment(Types._IntType, RepositoryTables.Types._IntType);
		private static final ExecutorFragment _IntType__OclAny = new ExecutorFragment(Types._IntType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntType__OclElement = new ExecutorFragment(Types._IntType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntType__ParameterType = new ExecutorFragment(Types._IntType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _IntType__SimpleType = new ExecutorFragment(Types._IntType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _IntType__Type = new ExecutorFragment(Types._IntType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Interface__Interface = new ExecutorFragment(Types._Interface, RepositoryTables.Types._Interface);
		private static final ExecutorFragment _Interface__NamedElement = new ExecutorFragment(Types._Interface, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Interface__OclAny = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Interface__OclElement = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InternalAction__InternalAction = new ExecutorFragment(Types._InternalAction, RepositoryTables.Types._InternalAction);
		private static final ExecutorFragment _InternalAction__OclAny = new ExecutorFragment(Types._InternalAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InternalAction__OclElement = new ExecutorFragment(Types._InternalAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ListType__ListType = new ExecutorFragment(Types._ListType, RepositoryTables.Types._ListType);
		private static final ExecutorFragment _ListType__OclAny = new ExecutorFragment(Types._ListType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ListType__OclElement = new ExecutorFragment(Types._ListType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ListType__ParameterType = new ExecutorFragment(Types._ListType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _ListType__SimpleType = new ExecutorFragment(Types._ListType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _ListType__Type = new ExecutorFragment(Types._ListType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _LongType__LongType = new ExecutorFragment(Types._LongType, RepositoryTables.Types._LongType);
		private static final ExecutorFragment _LongType__OclAny = new ExecutorFragment(Types._LongType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LongType__OclElement = new ExecutorFragment(Types._LongType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LongType__ParameterType = new ExecutorFragment(Types._LongType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _LongType__SimpleType = new ExecutorFragment(Types._LongType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _LongType__Type = new ExecutorFragment(Types._LongType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Loop__Loop = new ExecutorFragment(Types._Loop, RepositoryTables.Types._Loop);
		private static final ExecutorFragment _Loop__OclAny = new ExecutorFragment(Types._Loop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Loop__OclElement = new ExecutorFragment(Types._Loop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MapType__MapType = new ExecutorFragment(Types._MapType, RepositoryTables.Types._MapType);
		private static final ExecutorFragment _MapType__OclAny = new ExecutorFragment(Types._MapType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MapType__OclElement = new ExecutorFragment(Types._MapType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MapType__ParameterType = new ExecutorFragment(Types._MapType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _MapType__SimpleType = new ExecutorFragment(Types._MapType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _MapType__Type = new ExecutorFragment(Types._MapType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, RepositoryTables.Types._Parameter);

		private static final ExecutorFragment _ParameterType__OclAny = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParameterType__OclElement = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParameterType__ParameterType = new ExecutorFragment(Types._ParameterType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _ParameterType__Type = new ExecutorFragment(Types._ParameterType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Repository__OclAny = new ExecutorFragment(Types._Repository, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Repository__OclElement = new ExecutorFragment(Types._Repository, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Repository__Repository = new ExecutorFragment(Types._Repository, RepositoryTables.Types._Repository);

		private static final ExecutorFragment _Signature__NamedElement = new ExecutorFragment(Types._Signature, ViewTypeTables.Types._NamedElement);
		private static final ExecutorFragment _Signature__OclAny = new ExecutorFragment(Types._Signature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Signature__OclElement = new ExecutorFragment(Types._Signature, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Signature__Signature = new ExecutorFragment(Types._Signature, RepositoryTables.Types._Signature);

		private static final ExecutorFragment _SimpleType__OclAny = new ExecutorFragment(Types._SimpleType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SimpleType__OclElement = new ExecutorFragment(Types._SimpleType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SimpleType__ParameterType = new ExecutorFragment(Types._SimpleType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _SimpleType__SimpleType = new ExecutorFragment(Types._SimpleType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _SimpleType__Type = new ExecutorFragment(Types._SimpleType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _StringType__OclAny = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringType__OclElement = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringType__ParameterType = new ExecutorFragment(Types._StringType, RepositoryTables.Types._ParameterType);
		private static final ExecutorFragment _StringType__SimpleType = new ExecutorFragment(Types._StringType, RepositoryTables.Types._SimpleType);
		private static final ExecutorFragment _StringType__StringType = new ExecutorFragment(Types._StringType, RepositoryTables.Types._StringType);
		private static final ExecutorFragment _StringType__Type = new ExecutorFragment(Types._StringType, RepositoryTables.Types._Type);

		private static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, RepositoryTables.Types._Type);

		private static final ExecutorFragment _VoidType__OclAny = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VoidType__OclElement = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VoidType__Type = new ExecutorFragment(Types._VoidType, RepositoryTables.Types._Type);
		private static final ExecutorFragment _VoidType__VoidType = new ExecutorFragment(Types._VoidType, RepositoryTables.Types._VoidType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of RepositoryTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of RepositoryTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _BehaviourDescription__branches = new EcoreExecutorProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__BRANCHES, Types._BehaviourDescription, 0);
		public static final ExecutorProperty _BehaviourDescription__externalCalls = new EcoreExecutorProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS, Types._BehaviourDescription, 1);
		public static final ExecutorProperty _BehaviourDescription__internalActions = new EcoreExecutorProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS, Types._BehaviourDescription, 2);
		public static final ExecutorProperty _BehaviourDescription__loops = new EcoreExecutorProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__LOOPS, Types._BehaviourDescription, 3);
		public static final ExecutorProperty _BehaviourDescription__Component__description = new ExecutorPropertyWithImplementation("Component", Types._BehaviourDescription, 4, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.COMPONENT__DESCRIPTION));

		public static final ExecutorProperty _BooleanType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.BOOLEAN_TYPE__TYPE, Types._BooleanType, 0);

		public static final ExecutorProperty _Branch__BehaviourDescription__branches = new ExecutorPropertyWithImplementation("BehaviourDescription", Types._Branch, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__BRANCHES));

		public static final ExecutorProperty _CharType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.CHAR_TYPE__TYPE, Types._CharType, 0);

		public static final ExecutorProperty _ComplexType__types = new EcoreExecutorProperty(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES, Types._ComplexType, 0);

		public static final ExecutorProperty _Component__description = new EcoreExecutorProperty(RepositoryPackage.Literals.COMPONENT__DESCRIPTION, Types._Component, 0);
		public static final ExecutorProperty _Component__provides = new EcoreExecutorProperty(RepositoryPackage.Literals.COMPONENT__PROVIDES, Types._Component, 1);
		public static final ExecutorProperty _Component__requires = new EcoreExecutorProperty(RepositoryPackage.Literals.COMPONENT__REQUIRES, Types._Component, 2);
		public static final ExecutorProperty _Component__AssemblyContext__instanceOf = new ExecutorPropertyWithImplementation("AssemblyContext", Types._Component, 3, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.ASSEMBLY_CONTEXT__INSTANCE_OF));
		public static final ExecutorProperty _Component__Repository__components = new ExecutorPropertyWithImplementation("Repository", Types._Component, 4, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.REPOSITORY__COMPONENTS));

		public static final ExecutorProperty _DateType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.DATE_TYPE__TYPE, Types._DateType, 0);

		public static final ExecutorProperty _ExternalCall__BehaviourDescription__externalCalls = new ExecutorPropertyWithImplementation("BehaviourDescription", Types._ExternalCall, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS));

		public static final ExecutorProperty _FloatType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.FLOAT_TYPE__TYPE, Types._FloatType, 0);

		public static final ExecutorProperty _IntType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.INT_TYPE__TYPE, Types._IntType, 0);

		public static final ExecutorProperty _Interface__signatures = new EcoreExecutorProperty(RepositoryPackage.Literals.INTERFACE__SIGNATURES, Types._Interface, 0);
		public static final ExecutorProperty _Interface__Component__provides = new ExecutorPropertyWithImplementation("Component", Types._Interface, 1, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.COMPONENT__PROVIDES));
		public static final ExecutorProperty _Interface__Component__requires = new ExecutorPropertyWithImplementation("Component", Types._Interface, 2, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.COMPONENT__REQUIRES));
		public static final ExecutorProperty _Interface__DelegationConnector__linkedInterface = new ExecutorPropertyWithImplementation("DelegationConnector", Types._Interface, 3, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.DELEGATION_CONNECTOR__LINKED_INTERFACE));
		public static final ExecutorProperty _Interface__Repository__interface = new ExecutorPropertyWithImplementation("Repository", Types._Interface, 4, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.REPOSITORY__INTERFACE));
		public static final ExecutorProperty _Interface__System__provides = new ExecutorPropertyWithImplementation("System", Types._Interface, 5, new EcoreLibraryOppositeProperty(AssemblyPackage.Literals.SYSTEM__PROVIDES));

		public static final ExecutorProperty _InternalAction__BehaviourDescription__internalActions = new ExecutorPropertyWithImplementation("BehaviourDescription", Types._InternalAction, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS));

		public static final ExecutorProperty _ListType__List = new EcoreExecutorProperty(RepositoryPackage.Literals.LIST_TYPE__LIST, Types._ListType, 0);

		public static final ExecutorProperty _LongType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.LONG_TYPE__TYPE, Types._LongType, 0);

		public static final ExecutorProperty _Loop__BehaviourDescription__loops = new ExecutorPropertyWithImplementation("BehaviourDescription", Types._Loop, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION__LOOPS));

		public static final ExecutorProperty _MapType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.MAP_TYPE__TYPE, Types._MapType, 0);

		public static final ExecutorProperty _Parameter__type = new EcoreExecutorProperty(RepositoryPackage.Literals.PARAMETER__TYPE, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__Signature__parameters = new ExecutorPropertyWithImplementation("Signature", Types._Parameter, 1, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.SIGNATURE__PARAMETERS));

		public static final ExecutorProperty _ParameterType__ComplexType__types = new ExecutorPropertyWithImplementation("ComplexType", Types._ParameterType, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES));
		public static final ExecutorProperty _ParameterType__Parameter__type = new ExecutorPropertyWithImplementation("Parameter", Types._ParameterType, 1, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.PARAMETER__TYPE));

		public static final ExecutorProperty _Repository__components = new EcoreExecutorProperty(RepositoryPackage.Literals.REPOSITORY__COMPONENTS, Types._Repository, 0);
		public static final ExecutorProperty _Repository__interface = new EcoreExecutorProperty(RepositoryPackage.Literals.REPOSITORY__INTERFACE, Types._Repository, 1);
		public static final ExecutorProperty _Repository__ComponentBasedSystem__repositories = new ExecutorPropertyWithImplementation("ComponentBasedSystem", Types._Repository, 2, new EcoreLibraryOppositeProperty(MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM__REPOSITORIES));

		public static final ExecutorProperty _Signature__parameters = new EcoreExecutorProperty(RepositoryPackage.Literals.SIGNATURE__PARAMETERS, Types._Signature, 0);
		public static final ExecutorProperty _Signature__returnType = new EcoreExecutorProperty(RepositoryPackage.Literals.SIGNATURE__RETURN_TYPE, Types._Signature, 1);
		public static final ExecutorProperty _Signature__Interface__signatures = new ExecutorPropertyWithImplementation("Interface", Types._Signature, 2, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.INTERFACE__SIGNATURES));

		public static final ExecutorProperty _StringType__type = new EcoreExecutorProperty(RepositoryPackage.Literals.STRING_TYPE__TYPE, Types._StringType, 0);

		public static final ExecutorProperty _Type__Signature__returnType = new ExecutorPropertyWithImplementation("Signature", Types._Type, 0, new EcoreLibraryOppositeProperty(RepositoryPackage.Literals.SIGNATURE__RETURN_TYPE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _BehaviourDescription =
			{
				Fragments._BehaviourDescription__OclAny /* 0 */,
				Fragments._BehaviourDescription__OclElement /* 1 */,
				Fragments._BehaviourDescription__BehaviourDescription /* 2 */
			};
		private static final int /*@NonNull*/ [] __BehaviourDescription = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanType =
			{
				Fragments._BooleanType__OclAny /* 0 */,
				Fragments._BooleanType__OclElement /* 1 */,
				Fragments._BooleanType__Type /* 2 */,
				Fragments._BooleanType__ParameterType /* 3 */,
				Fragments._BooleanType__SimpleType /* 4 */,
				Fragments._BooleanType__BooleanType /* 5 */
			};
		private static final int /*@NonNull*/ [] __BooleanType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Branch =
			{
				Fragments._Branch__OclAny /* 0 */,
				Fragments._Branch__OclElement /* 1 */,
				Fragments._Branch__Branch /* 2 */
			};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CharType =
			{
				Fragments._CharType__OclAny /* 0 */,
				Fragments._CharType__OclElement /* 1 */,
				Fragments._CharType__Type /* 2 */,
				Fragments._CharType__ParameterType /* 3 */,
				Fragments._CharType__SimpleType /* 4 */,
				Fragments._CharType__CharType /* 5 */
			};
		private static final int /*@NonNull*/ [] __CharType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplexType =
			{
				Fragments._ComplexType__OclAny /* 0 */,
				Fragments._ComplexType__OclElement /* 1 */,
				Fragments._ComplexType__Type /* 2 */,
				Fragments._ComplexType__ParameterType /* 3 */,
				Fragments._ComplexType__ComplexType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplexType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__NamedElement /* 2 */,
				Fragments._Component__Component /* 3 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DateType =
			{
				Fragments._DateType__OclAny /* 0 */,
				Fragments._DateType__OclElement /* 1 */,
				Fragments._DateType__Type /* 2 */,
				Fragments._DateType__ParameterType /* 3 */,
				Fragments._DateType__SimpleType /* 4 */,
				Fragments._DateType__DateType /* 5 */
			};
		private static final int /*@NonNull*/ [] __DateType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExternalCall =
			{
				Fragments._ExternalCall__OclAny /* 0 */,
				Fragments._ExternalCall__OclElement /* 1 */,
				Fragments._ExternalCall__ExternalCall /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExternalCall = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FloatType =
			{
				Fragments._FloatType__OclAny /* 0 */,
				Fragments._FloatType__OclElement /* 1 */,
				Fragments._FloatType__Type /* 2 */,
				Fragments._FloatType__ParameterType /* 3 */,
				Fragments._FloatType__SimpleType /* 4 */,
				Fragments._FloatType__FloatType /* 5 */
			};
		private static final int /*@NonNull*/ [] __FloatType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntType =
			{
				Fragments._IntType__OclAny /* 0 */,
				Fragments._IntType__OclElement /* 1 */,
				Fragments._IntType__Type /* 2 */,
				Fragments._IntType__ParameterType /* 3 */,
				Fragments._IntType__SimpleType /* 4 */,
				Fragments._IntType__IntType /* 5 */
			};
		private static final int /*@NonNull*/ [] __IntType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Interface =
			{
				Fragments._Interface__OclAny /* 0 */,
				Fragments._Interface__OclElement /* 1 */,
				Fragments._Interface__NamedElement /* 2 */,
				Fragments._Interface__Interface /* 3 */
			};
		private static final int /*@NonNull*/ [] __Interface = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InternalAction =
			{
				Fragments._InternalAction__OclAny /* 0 */,
				Fragments._InternalAction__OclElement /* 1 */,
				Fragments._InternalAction__InternalAction /* 2 */
			};
		private static final int /*@NonNull*/ [] __InternalAction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ListType =
			{
				Fragments._ListType__OclAny /* 0 */,
				Fragments._ListType__OclElement /* 1 */,
				Fragments._ListType__Type /* 2 */,
				Fragments._ListType__ParameterType /* 3 */,
				Fragments._ListType__SimpleType /* 4 */,
				Fragments._ListType__ListType /* 5 */
			};
		private static final int /*@NonNull*/ [] __ListType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LongType =
			{
				Fragments._LongType__OclAny /* 0 */,
				Fragments._LongType__OclElement /* 1 */,
				Fragments._LongType__Type /* 2 */,
				Fragments._LongType__ParameterType /* 3 */,
				Fragments._LongType__SimpleType /* 4 */,
				Fragments._LongType__LongType /* 5 */
			};
		private static final int /*@NonNull*/ [] __LongType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Loop =
			{
				Fragments._Loop__OclAny /* 0 */,
				Fragments._Loop__OclElement /* 1 */,
				Fragments._Loop__Loop /* 2 */
			};
		private static final int /*@NonNull*/ [] __Loop = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MapType =
			{
				Fragments._MapType__OclAny /* 0 */,
				Fragments._MapType__OclElement /* 1 */,
				Fragments._MapType__Type /* 2 */,
				Fragments._MapType__ParameterType /* 3 */,
				Fragments._MapType__SimpleType /* 4 */,
				Fragments._MapType__MapType /* 5 */
			};
		private static final int /*@NonNull*/ [] __MapType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__NamedElement /* 2 */,
				Fragments._Parameter__Parameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParameterType =
			{
				Fragments._ParameterType__OclAny /* 0 */,
				Fragments._ParameterType__OclElement /* 1 */,
				Fragments._ParameterType__Type /* 2 */,
				Fragments._ParameterType__ParameterType /* 3 */
			};
		private static final int /*@NonNull*/ [] __ParameterType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Repository =
			{
				Fragments._Repository__OclAny /* 0 */,
				Fragments._Repository__OclElement /* 1 */,
				Fragments._Repository__Repository /* 2 */
			};
		private static final int /*@NonNull*/ [] __Repository = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Signature =
			{
				Fragments._Signature__OclAny /* 0 */,
				Fragments._Signature__OclElement /* 1 */,
				Fragments._Signature__NamedElement /* 2 */,
				Fragments._Signature__Signature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Signature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SimpleType =
			{
				Fragments._SimpleType__OclAny /* 0 */,
				Fragments._SimpleType__OclElement /* 1 */,
				Fragments._SimpleType__Type /* 2 */,
				Fragments._SimpleType__ParameterType /* 3 */,
				Fragments._SimpleType__SimpleType /* 4 */
			};
		private static final int /*@NonNull*/ [] __SimpleType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringType =
			{
				Fragments._StringType__OclAny /* 0 */,
				Fragments._StringType__OclElement /* 1 */,
				Fragments._StringType__Type /* 2 */,
				Fragments._StringType__ParameterType /* 3 */,
				Fragments._StringType__SimpleType /* 4 */,
				Fragments._StringType__StringType /* 5 */
			};
		private static final int /*@NonNull*/ [] __StringType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__Type /* 2 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VoidType =
			{
				Fragments._VoidType__OclAny /* 0 */,
				Fragments._VoidType__OclElement /* 1 */,
				Fragments._VoidType__Type /* 2 */,
				Fragments._VoidType__VoidType /* 3 */
			};
		private static final int /*@NonNull*/ [] __VoidType = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BehaviourDescription.initFragments(_BehaviourDescription, __BehaviourDescription);
			Types._BooleanType.initFragments(_BooleanType, __BooleanType);
			Types._Branch.initFragments(_Branch, __Branch);
			Types._CharType.initFragments(_CharType, __CharType);
			Types._ComplexType.initFragments(_ComplexType, __ComplexType);
			Types._Component.initFragments(_Component, __Component);
			Types._DateType.initFragments(_DateType, __DateType);
			Types._ExternalCall.initFragments(_ExternalCall, __ExternalCall);
			Types._FloatType.initFragments(_FloatType, __FloatType);
			Types._IntType.initFragments(_IntType, __IntType);
			Types._Interface.initFragments(_Interface, __Interface);
			Types._InternalAction.initFragments(_InternalAction, __InternalAction);
			Types._ListType.initFragments(_ListType, __ListType);
			Types._LongType.initFragments(_LongType, __LongType);
			Types._Loop.initFragments(_Loop, __Loop);
			Types._MapType.initFragments(_MapType, __MapType);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._ParameterType.initFragments(_ParameterType, __ParameterType);
			Types._Repository.initFragments(_Repository, __Repository);
			Types._Signature.initFragments(_Signature, __Signature);
			Types._SimpleType.initFragments(_SimpleType, __SimpleType);
			Types._StringType.initFragments(_StringType, __StringType);
			Types._Type.initFragments(_Type, __Type);
			Types._VoidType.initFragments(_VoidType, __VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _BehaviourDescription__BehaviourDescription = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BehaviourDescription__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BehaviourDescription__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__BooleanType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _CharType__CharType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CharType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CharType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CharType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CharType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CharType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__ComplexType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _DateType__DateType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DateType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DateType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DateType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DateType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DateType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__ExternalCall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ExternalCall__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__FloatType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IntType__IntType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _IntType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _IntType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Interface__Interface = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__InternalAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _InternalAction__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ListType__ListType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ListType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ListType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ListType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ListType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ListType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _LongType__LongType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LongType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _LongType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _LongType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LongType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LongType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Loop__Loop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Loop__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _MapType__MapType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MapType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MapType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MapType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MapType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MapType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Repository__Repository = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repository__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Repository__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Signature__Signature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Signature__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SimpleType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StringType__StringType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__SimpleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__VoidType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__Type = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BehaviourDescription__BehaviourDescription.initOperations(_BehaviourDescription__BehaviourDescription);
			Fragments._BehaviourDescription__OclAny.initOperations(_BehaviourDescription__OclAny);
			Fragments._BehaviourDescription__OclElement.initOperations(_BehaviourDescription__OclElement);

			Fragments._BooleanType__BooleanType.initOperations(_BooleanType__BooleanType);
			Fragments._BooleanType__OclAny.initOperations(_BooleanType__OclAny);
			Fragments._BooleanType__OclElement.initOperations(_BooleanType__OclElement);
			Fragments._BooleanType__ParameterType.initOperations(_BooleanType__ParameterType);
			Fragments._BooleanType__SimpleType.initOperations(_BooleanType__SimpleType);
			Fragments._BooleanType__Type.initOperations(_BooleanType__Type);

			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._CharType__CharType.initOperations(_CharType__CharType);
			Fragments._CharType__OclAny.initOperations(_CharType__OclAny);
			Fragments._CharType__OclElement.initOperations(_CharType__OclElement);
			Fragments._CharType__ParameterType.initOperations(_CharType__ParameterType);
			Fragments._CharType__SimpleType.initOperations(_CharType__SimpleType);
			Fragments._CharType__Type.initOperations(_CharType__Type);

			Fragments._ComplexType__ComplexType.initOperations(_ComplexType__ComplexType);
			Fragments._ComplexType__OclAny.initOperations(_ComplexType__OclAny);
			Fragments._ComplexType__OclElement.initOperations(_ComplexType__OclElement);
			Fragments._ComplexType__ParameterType.initOperations(_ComplexType__ParameterType);
			Fragments._ComplexType__Type.initOperations(_ComplexType__Type);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__NamedElement.initOperations(_Component__NamedElement);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._DateType__DateType.initOperations(_DateType__DateType);
			Fragments._DateType__OclAny.initOperations(_DateType__OclAny);
			Fragments._DateType__OclElement.initOperations(_DateType__OclElement);
			Fragments._DateType__ParameterType.initOperations(_DateType__ParameterType);
			Fragments._DateType__SimpleType.initOperations(_DateType__SimpleType);
			Fragments._DateType__Type.initOperations(_DateType__Type);

			Fragments._ExternalCall__ExternalCall.initOperations(_ExternalCall__ExternalCall);
			Fragments._ExternalCall__OclAny.initOperations(_ExternalCall__OclAny);
			Fragments._ExternalCall__OclElement.initOperations(_ExternalCall__OclElement);

			Fragments._FloatType__FloatType.initOperations(_FloatType__FloatType);
			Fragments._FloatType__OclAny.initOperations(_FloatType__OclAny);
			Fragments._FloatType__OclElement.initOperations(_FloatType__OclElement);
			Fragments._FloatType__ParameterType.initOperations(_FloatType__ParameterType);
			Fragments._FloatType__SimpleType.initOperations(_FloatType__SimpleType);
			Fragments._FloatType__Type.initOperations(_FloatType__Type);

			Fragments._IntType__IntType.initOperations(_IntType__IntType);
			Fragments._IntType__OclAny.initOperations(_IntType__OclAny);
			Fragments._IntType__OclElement.initOperations(_IntType__OclElement);
			Fragments._IntType__ParameterType.initOperations(_IntType__ParameterType);
			Fragments._IntType__SimpleType.initOperations(_IntType__SimpleType);
			Fragments._IntType__Type.initOperations(_IntType__Type);

			Fragments._Interface__Interface.initOperations(_Interface__Interface);
			Fragments._Interface__NamedElement.initOperations(_Interface__NamedElement);
			Fragments._Interface__OclAny.initOperations(_Interface__OclAny);
			Fragments._Interface__OclElement.initOperations(_Interface__OclElement);

			Fragments._InternalAction__InternalAction.initOperations(_InternalAction__InternalAction);
			Fragments._InternalAction__OclAny.initOperations(_InternalAction__OclAny);
			Fragments._InternalAction__OclElement.initOperations(_InternalAction__OclElement);

			Fragments._ListType__ListType.initOperations(_ListType__ListType);
			Fragments._ListType__OclAny.initOperations(_ListType__OclAny);
			Fragments._ListType__OclElement.initOperations(_ListType__OclElement);
			Fragments._ListType__ParameterType.initOperations(_ListType__ParameterType);
			Fragments._ListType__SimpleType.initOperations(_ListType__SimpleType);
			Fragments._ListType__Type.initOperations(_ListType__Type);

			Fragments._LongType__LongType.initOperations(_LongType__LongType);
			Fragments._LongType__OclAny.initOperations(_LongType__OclAny);
			Fragments._LongType__OclElement.initOperations(_LongType__OclElement);
			Fragments._LongType__ParameterType.initOperations(_LongType__ParameterType);
			Fragments._LongType__SimpleType.initOperations(_LongType__SimpleType);
			Fragments._LongType__Type.initOperations(_LongType__Type);

			Fragments._Loop__Loop.initOperations(_Loop__Loop);
			Fragments._Loop__OclAny.initOperations(_Loop__OclAny);
			Fragments._Loop__OclElement.initOperations(_Loop__OclElement);

			Fragments._MapType__MapType.initOperations(_MapType__MapType);
			Fragments._MapType__OclAny.initOperations(_MapType__OclAny);
			Fragments._MapType__OclElement.initOperations(_MapType__OclElement);
			Fragments._MapType__ParameterType.initOperations(_MapType__ParameterType);
			Fragments._MapType__SimpleType.initOperations(_MapType__SimpleType);
			Fragments._MapType__Type.initOperations(_MapType__Type);

			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._ParameterType__OclAny.initOperations(_ParameterType__OclAny);
			Fragments._ParameterType__OclElement.initOperations(_ParameterType__OclElement);
			Fragments._ParameterType__ParameterType.initOperations(_ParameterType__ParameterType);
			Fragments._ParameterType__Type.initOperations(_ParameterType__Type);

			Fragments._Repository__OclAny.initOperations(_Repository__OclAny);
			Fragments._Repository__OclElement.initOperations(_Repository__OclElement);
			Fragments._Repository__Repository.initOperations(_Repository__Repository);

			Fragments._Signature__NamedElement.initOperations(_Signature__NamedElement);
			Fragments._Signature__OclAny.initOperations(_Signature__OclAny);
			Fragments._Signature__OclElement.initOperations(_Signature__OclElement);
			Fragments._Signature__Signature.initOperations(_Signature__Signature);

			Fragments._SimpleType__OclAny.initOperations(_SimpleType__OclAny);
			Fragments._SimpleType__OclElement.initOperations(_SimpleType__OclElement);
			Fragments._SimpleType__ParameterType.initOperations(_SimpleType__ParameterType);
			Fragments._SimpleType__SimpleType.initOperations(_SimpleType__SimpleType);
			Fragments._SimpleType__Type.initOperations(_SimpleType__Type);

			Fragments._StringType__OclAny.initOperations(_StringType__OclAny);
			Fragments._StringType__OclElement.initOperations(_StringType__OclElement);
			Fragments._StringType__ParameterType.initOperations(_StringType__ParameterType);
			Fragments._StringType__SimpleType.initOperations(_StringType__SimpleType);
			Fragments._StringType__StringType.initOperations(_StringType__StringType);
			Fragments._StringType__Type.initOperations(_StringType__Type);

			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._VoidType__OclAny.initOperations(_VoidType__OclAny);
			Fragments._VoidType__OclElement.initOperations(_VoidType__OclElement);
			Fragments._VoidType__Type.initOperations(_VoidType__Type);
			Fragments._VoidType__VoidType.initOperations(_VoidType__VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _BehaviourDescription = {
			RepositoryTables.Properties._BehaviourDescription__branches,
			RepositoryTables.Properties._BehaviourDescription__externalCalls,
			RepositoryTables.Properties._BehaviourDescription__internalActions,
			RepositoryTables.Properties._BehaviourDescription__loops,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._BooleanType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Branch = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CharType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._CharType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplexType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._ComplexType__types
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			RepositoryTables.Properties._Component__description,
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._Component__provides,
			RepositoryTables.Properties._Component__requires
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DateType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._DateType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExternalCall = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FloatType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._FloatType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._IntType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Interface = {
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._Interface__signatures
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InternalAction = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ListType = {
			RepositoryTables.Properties._ListType__List,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LongType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._LongType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Loop = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MapType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._MapType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._Parameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParameterType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Repository = {
			RepositoryTables.Properties._Repository__components,
			RepositoryTables.Properties._Repository__interface,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Signature = {
			ViewTypeTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._Signature__parameters,
			RepositoryTables.Properties._Signature__returnType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SimpleType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RepositoryTables.Properties._StringType__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Type = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VoidType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BehaviourDescription__BehaviourDescription.initProperties(_BehaviourDescription);
			Fragments._BooleanType__BooleanType.initProperties(_BooleanType);
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._CharType__CharType.initProperties(_CharType);
			Fragments._ComplexType__ComplexType.initProperties(_ComplexType);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._DateType__DateType.initProperties(_DateType);
			Fragments._ExternalCall__ExternalCall.initProperties(_ExternalCall);
			Fragments._FloatType__FloatType.initProperties(_FloatType);
			Fragments._IntType__IntType.initProperties(_IntType);
			Fragments._Interface__Interface.initProperties(_Interface);
			Fragments._InternalAction__InternalAction.initProperties(_InternalAction);
			Fragments._ListType__ListType.initProperties(_ListType);
			Fragments._LongType__LongType.initProperties(_LongType);
			Fragments._Loop__Loop.initProperties(_Loop);
			Fragments._MapType__MapType.initProperties(_MapType);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._ParameterType__ParameterType.initProperties(_ParameterType);
			Fragments._Repository__Repository.initProperties(_Repository);
			Fragments._Signature__Signature.initProperties(_Signature);
			Fragments._SimpleType__SimpleType.initProperties(_SimpleType);
			Fragments._StringType__StringType.initProperties(_StringType);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._VoidType__VoidType.initProperties(_VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RepositoryTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of RepositoryTables::EnumerationLiterals and all preceding sub-packages.
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
		new RepositoryTables();
	}

	private RepositoryTables() {
		super(RepositoryPackage.eNS_URI);
	}
}
