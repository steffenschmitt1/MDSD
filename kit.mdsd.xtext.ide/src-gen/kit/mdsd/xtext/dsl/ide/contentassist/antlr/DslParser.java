/*
 * generated by Xtext 2.30.0
 */
package kit.mdsd.xtext.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import kit.mdsd.xtext.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import kit.mdsd.xtext.dsl.services.DslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDelegationConnectorAccess().getAlternatives(), "rule__DelegationConnector__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0(), "rule__EFloatObject__Alternatives_4_0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup(), "rule__ComponentBasedSystem__Group__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_3(), "rule__ComponentBasedSystem__Group_3__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_3_3(), "rule__ComponentBasedSystem__Group_3_3__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_4(), "rule__ComponentBasedSystem__Group_4__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_4_3(), "rule__ComponentBasedSystem__Group_4_3__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_5(), "rule__ComponentBasedSystem__Group_5__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_5_3(), "rule__ComponentBasedSystem__Group_5_3__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_6(), "rule__ComponentBasedSystem__Group_6__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getGroup_6_3(), "rule__ComponentBasedSystem__Group_6_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_3(), "rule__Repository__Group_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_3_3(), "rule__Repository__Group_3_3__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_4(), "rule__Repository__Group_4__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_4_3(), "rule__Repository__Group_4_3__0");
			builder.put(grammarAccess.getEnivronmentAccess().getGroup(), "rule__Enivronment__Group__0");
			builder.put(grammarAccess.getEnivronmentAccess().getGroup_3(), "rule__Enivronment__Group_3__0");
			builder.put(grammarAccess.getEnivronmentAccess().getGroup_3_3(), "rule__Enivronment__Group_3_3__0");
			builder.put(grammarAccess.getEnivronmentAccess().getGroup_4(), "rule__Enivronment__Group_4__0");
			builder.put(grammarAccess.getEnivronmentAccess().getGroup_4_3(), "rule__Enivronment__Group_4_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_5(), "rule__System__Group_5__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_10(), "rule__System__Group_10__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_12(), "rule__System__Group_12__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_12_3(), "rule__System__Group_12_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_13(), "rule__System__Group_13__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_13_3(), "rule__System__Group_13_3__0");
			builder.put(grammarAccess.getAllocationContextAccess().getGroup(), "rule__AllocationContext__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_4_3(), "rule__Component__Group_4_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_5_3(), "rule__Component__Group_5_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_4_3(), "rule__Interface__Group_4_3__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup(), "rule__BehaviourDescription__Group__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_3(), "rule__BehaviourDescription__Group_3__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_3_3(), "rule__BehaviourDescription__Group_3_3__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_4(), "rule__BehaviourDescription__Group_4__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_4_3(), "rule__BehaviourDescription__Group_4_3__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_5(), "rule__BehaviourDescription__Group_5__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_5_3(), "rule__BehaviourDescription__Group_5_3__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_6(), "rule__BehaviourDescription__Group_6__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_6_3(), "rule__BehaviourDescription__Group_6_3__0");
			builder.put(grammarAccess.getInternalActionAccess().getGroup(), "rule__InternalAction__Group__0");
			builder.put(grammarAccess.getExternalCallAccess().getGroup(), "rule__ExternalCall__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_5(), "rule__Signature__Group_5__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_5_3(), "rule__Signature__Group_5_3__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getComplexTypeAccess().getGroup(), "rule__ComplexType__Group__0");
			builder.put(grammarAccess.getComplexTypeAccess().getGroup_5(), "rule__ComplexType__Group_5__0");
			builder.put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
			builder.put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
			builder.put(grammarAccess.getStringTypeAccess().getGroup_3(), "rule__StringType__Group_3__0");
			builder.put(grammarAccess.getBooleanTypeAccess().getGroup(), "rule__BooleanType__Group__0");
			builder.put(grammarAccess.getIntTypeAccess().getGroup(), "rule__IntType__Group__0");
			builder.put(grammarAccess.getIntTypeAccess().getGroup_3(), "rule__IntType__Group_3__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup(), "rule__ListType__Group__0");
			builder.put(grammarAccess.getDateTypeAccess().getGroup(), "rule__DateType__Group__0");
			builder.put(grammarAccess.getLongTypeAccess().getGroup(), "rule__LongType__Group__0");
			builder.put(grammarAccess.getFloatTypeAccess().getGroup(), "rule__FloatType__Group__0");
			builder.put(grammarAccess.getCharTypeAccess().getGroup(), "rule__CharType__Group__0");
			builder.put(grammarAccess.getVoidTypeAccess().getGroup(), "rule__VoidType__Group__0");
			builder.put(grammarAccess.getEIntegerObjectAccess().getGroup(), "rule__EIntegerObject__Group__0");
			builder.put(grammarAccess.getELongObjectAccess().getGroup(), "rule__ELongObject__Group__0");
			builder.put(grammarAccess.getEFloatObjectAccess().getGroup(), "rule__EFloatObject__Group__0");
			builder.put(grammarAccess.getEFloatObjectAccess().getGroup_4(), "rule__EFloatObject__Group_4__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_4(), "rule__Container__Group_4__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_4_3(), "rule__Container__Group_4_3__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_5(), "rule__Container__Group_5__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_5_3(), "rule__Container__Group_5_3__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_6(), "rule__Link__Group_6__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup(), "rule__AssemblyContext__Group__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_5(), "rule__AssemblyContext__Group_5__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_6(), "rule__AssemblyContext__Group_6__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_6_3(), "rule__AssemblyContext__Group_6_3__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_7(), "rule__AssemblyContext__Group_7__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_7_3(), "rule__AssemblyContext__Group_7_3__0");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getGroup(), "rule__AssemblyConnector__Group__0");
			builder.put(grammarAccess.getRequiredRoleAccess().getGroup(), "rule__RequiredRole__Group__0");
			builder.put(grammarAccess.getRequiredRoleAccess().getGroup_4(), "rule__RequiredRole__Group_4__0");
			builder.put(grammarAccess.getRequiredRoleAccess().getGroup_5(), "rule__RequiredRole__Group_5__0");
			builder.put(grammarAccess.getProvidedRoleAccess().getGroup(), "rule__ProvidedRole__Group__0");
			builder.put(grammarAccess.getProvidedRoleAccess().getGroup_4(), "rule__ProvidedRole__Group_4__0");
			builder.put(grammarAccess.getProvidedRoleAccess().getGroup_5(), "rule__ProvidedRole__Group_5__0");
			builder.put(grammarAccess.getDelegationConnectorRequiredAccess().getGroup(), "rule__DelegationConnectorRequired__Group__0");
			builder.put(grammarAccess.getDelegationConnectorProvidedAccess().getGroup(), "rule__DelegationConnectorProvided__Group__0");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getRepositoriesAssignment_3_2(), "rule__ComponentBasedSystem__RepositoriesAssignment_3_2");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getRepositoriesAssignment_3_3_1(), "rule__ComponentBasedSystem__RepositoriesAssignment_3_3_1");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getEnivronmentsAssignment_4_2(), "rule__ComponentBasedSystem__EnivronmentsAssignment_4_2");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getEnivronmentsAssignment_4_3_1(), "rule__ComponentBasedSystem__EnivronmentsAssignment_4_3_1");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getSystemsAssignment_5_2(), "rule__ComponentBasedSystem__SystemsAssignment_5_2");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getSystemsAssignment_5_3_1(), "rule__ComponentBasedSystem__SystemsAssignment_5_3_1");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getAllocationContextsAssignment_6_2(), "rule__ComponentBasedSystem__AllocationContextsAssignment_6_2");
			builder.put(grammarAccess.getComponentBasedSystemAccess().getAllocationContextsAssignment_6_3_1(), "rule__ComponentBasedSystem__AllocationContextsAssignment_6_3_1");
			builder.put(grammarAccess.getRepositoryAccess().getComponentsAssignment_3_2(), "rule__Repository__ComponentsAssignment_3_2");
			builder.put(grammarAccess.getRepositoryAccess().getComponentsAssignment_3_3_1(), "rule__Repository__ComponentsAssignment_3_3_1");
			builder.put(grammarAccess.getRepositoryAccess().getInterfaceAssignment_4_2(), "rule__Repository__InterfaceAssignment_4_2");
			builder.put(grammarAccess.getRepositoryAccess().getInterfaceAssignment_4_3_1(), "rule__Repository__InterfaceAssignment_4_3_1");
			builder.put(grammarAccess.getEnivronmentAccess().getContainerAssignment_3_2(), "rule__Enivronment__ContainerAssignment_3_2");
			builder.put(grammarAccess.getEnivronmentAccess().getContainerAssignment_3_3_1(), "rule__Enivronment__ContainerAssignment_3_3_1");
			builder.put(grammarAccess.getEnivronmentAccess().getLinkAssignment_4_2(), "rule__Enivronment__LinkAssignment_4_2");
			builder.put(grammarAccess.getEnivronmentAccess().getLinkAssignment_4_3_1(), "rule__Enivronment__LinkAssignment_4_3_1");
			builder.put(grammarAccess.getSystemAccess().getProvidesAssignment_4(), "rule__System__ProvidesAssignment_4");
			builder.put(grammarAccess.getSystemAccess().getProvidesAssignment_5_1(), "rule__System__ProvidesAssignment_5_1");
			builder.put(grammarAccess.getSystemAccess().getEncapsulatedInstancesAssignment_9(), "rule__System__EncapsulatedInstancesAssignment_9");
			builder.put(grammarAccess.getSystemAccess().getEncapsulatedInstancesAssignment_10_1(), "rule__System__EncapsulatedInstancesAssignment_10_1");
			builder.put(grammarAccess.getSystemAccess().getDelegationConnectorsAssignment_12_2(), "rule__System__DelegationConnectorsAssignment_12_2");
			builder.put(grammarAccess.getSystemAccess().getDelegationConnectorsAssignment_12_3_1(), "rule__System__DelegationConnectorsAssignment_12_3_1");
			builder.put(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_13_2(), "rule__System__AssemblyConnectorsAssignment_13_2");
			builder.put(grammarAccess.getSystemAccess().getAssemblyConnectorsAssignment_13_3_1(), "rule__System__AssemblyConnectorsAssignment_13_3_1");
			builder.put(grammarAccess.getAllocationContextAccess().getNameAssignment_1(), "rule__AllocationContext__NameAssignment_1");
			builder.put(grammarAccess.getAllocationContextAccess().getAssemblyContextAssignment_4(), "rule__AllocationContext__AssemblyContextAssignment_4");
			builder.put(grammarAccess.getAllocationContextAccess().getContainerAssignment_6(), "rule__AllocationContext__ContainerAssignment_6");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_2(), "rule__Component__NameAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getRequiresAssignment_4_2(), "rule__Component__RequiresAssignment_4_2");
			builder.put(grammarAccess.getComponentAccess().getRequiresAssignment_4_3_1(), "rule__Component__RequiresAssignment_4_3_1");
			builder.put(grammarAccess.getComponentAccess().getProvidesAssignment_5_2(), "rule__Component__ProvidesAssignment_5_2");
			builder.put(grammarAccess.getComponentAccess().getProvidesAssignment_5_3_1(), "rule__Component__ProvidesAssignment_5_3_1");
			builder.put(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1(), "rule__Component__DescriptionAssignment_6_1");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_4_2(), "rule__Interface__SignaturesAssignment_4_2");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_4_3_1(), "rule__Interface__SignaturesAssignment_4_3_1");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getInternalActionsAssignment_3_2(), "rule__BehaviourDescription__InternalActionsAssignment_3_2");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getInternalActionsAssignment_3_3_1(), "rule__BehaviourDescription__InternalActionsAssignment_3_3_1");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getExternalCallsAssignment_4_2(), "rule__BehaviourDescription__ExternalCallsAssignment_4_2");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getExternalCallsAssignment_4_3_1(), "rule__BehaviourDescription__ExternalCallsAssignment_4_3_1");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getLoopsAssignment_5_2(), "rule__BehaviourDescription__LoopsAssignment_5_2");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getLoopsAssignment_5_3_1(), "rule__BehaviourDescription__LoopsAssignment_5_3_1");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getBranchesAssignment_6_2(), "rule__BehaviourDescription__BranchesAssignment_6_2");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getBranchesAssignment_6_3_1(), "rule__BehaviourDescription__BranchesAssignment_6_3_1");
			builder.put(grammarAccess.getSignatureAccess().getNameAssignment_1(), "rule__Signature__NameAssignment_1");
			builder.put(grammarAccess.getSignatureAccess().getReturnTypeAssignment_4(), "rule__Signature__ReturnTypeAssignment_4");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_5_2(), "rule__Signature__ParametersAssignment_5_2");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1(), "rule__Signature__ParametersAssignment_5_3_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_4(), "rule__Parameter__TypeAssignment_4");
			builder.put(grammarAccess.getComplexTypeAccess().getTypesAssignment_4(), "rule__ComplexType__TypesAssignment_4");
			builder.put(grammarAccess.getComplexTypeAccess().getTypesAssignment_5_1(), "rule__ComplexType__TypesAssignment_5_1");
			builder.put(grammarAccess.getStringTypeAccess().getTypeAssignment_3_1(), "rule__StringType__TypeAssignment_3_1");
			builder.put(grammarAccess.getBooleanTypeAccess().getTypeAssignment_1(), "rule__BooleanType__TypeAssignment_1");
			builder.put(grammarAccess.getIntTypeAccess().getTypeAssignment_3_1(), "rule__IntType__TypeAssignment_3_1");
			builder.put(grammarAccess.getDateTypeAccess().getTypeAssignment_3(), "rule__DateType__TypeAssignment_3");
			builder.put(grammarAccess.getLongTypeAccess().getTypeAssignment_3(), "rule__LongType__TypeAssignment_3");
			builder.put(grammarAccess.getFloatTypeAccess().getTypeAssignment_3(), "rule__FloatType__TypeAssignment_3");
			builder.put(grammarAccess.getCharTypeAccess().getTypeAssignment_3(), "rule__CharType__TypeAssignment_3");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
			builder.put(grammarAccess.getContainerAccess().getAllocationContextAssignment_4_2(), "rule__Container__AllocationContextAssignment_4_2");
			builder.put(grammarAccess.getContainerAccess().getAllocationContextAssignment_4_3_1(), "rule__Container__AllocationContextAssignment_4_3_1");
			builder.put(grammarAccess.getContainerAccess().getLinksAssignment_5_2(), "rule__Container__LinksAssignment_5_2");
			builder.put(grammarAccess.getContainerAccess().getLinksAssignment_5_3_1(), "rule__Container__LinksAssignment_5_3_1");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_5(), "rule__Link__ContainersAssignment_5");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_6_1(), "rule__Link__ContainersAssignment_6_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getNameAssignment_1(), "rule__AssemblyContext__NameAssignment_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getInstanceOfAssignment_4(), "rule__AssemblyContext__InstanceOfAssignment_4");
			builder.put(grammarAccess.getAssemblyContextAccess().getAllocationContextAssignment_5_1(), "rule__AssemblyContext__AllocationContextAssignment_5_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiresAssignment_6_2(), "rule__AssemblyContext__RequiresAssignment_6_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiresAssignment_6_3_1(), "rule__AssemblyContext__RequiresAssignment_6_3_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidesAssignment_7_2(), "rule__AssemblyContext__ProvidesAssignment_7_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidesAssignment_7_3_1(), "rule__AssemblyContext__ProvidesAssignment_7_3_1");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_3(), "rule__AssemblyConnector__RequiredRoleAssignment_3");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_5(), "rule__AssemblyConnector__ProvidedRoleAssignment_5");
			builder.put(grammarAccess.getRequiredRoleAccess().getNameAssignment_2(), "rule__RequiredRole__NameAssignment_2");
			builder.put(grammarAccess.getRequiredRoleAccess().getDelegationConnectorAssignment_4_1(), "rule__RequiredRole__DelegationConnectorAssignment_4_1");
			builder.put(grammarAccess.getRequiredRoleAccess().getAssemblyConnectorAssignment_5_1(), "rule__RequiredRole__AssemblyConnectorAssignment_5_1");
			builder.put(grammarAccess.getProvidedRoleAccess().getNameAssignment_2(), "rule__ProvidedRole__NameAssignment_2");
			builder.put(grammarAccess.getProvidedRoleAccess().getDelegationConnectorAssignment_4_1(), "rule__ProvidedRole__DelegationConnectorAssignment_4_1");
			builder.put(grammarAccess.getProvidedRoleAccess().getAssemblyConnectorAssignment_5_1(), "rule__ProvidedRole__AssemblyConnectorAssignment_5_1");
			builder.put(grammarAccess.getDelegationConnectorRequiredAccess().getLinkedInterfaceAssignment_3(), "rule__DelegationConnectorRequired__LinkedInterfaceAssignment_3");
			builder.put(grammarAccess.getDelegationConnectorRequiredAccess().getLinkedRoleAssignment_5(), "rule__DelegationConnectorRequired__LinkedRoleAssignment_5");
			builder.put(grammarAccess.getDelegationConnectorProvidedAccess().getLinkedInterfaceAssignment_3(), "rule__DelegationConnectorProvided__LinkedInterfaceAssignment_3");
			builder.put(grammarAccess.getDelegationConnectorProvidedAccess().getLinkdedRoleAssignment_5(), "rule__DelegationConnectorProvided__LinkdedRoleAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}