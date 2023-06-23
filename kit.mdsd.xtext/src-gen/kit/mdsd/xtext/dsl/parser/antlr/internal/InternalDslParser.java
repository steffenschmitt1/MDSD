package kit.mdsd.xtext.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kit.mdsd.xtext.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentBasedSystem'", "'{'", "'repositories'", "','", "'}'", "'environments'", "'systems'", "'allocationContexts'", "'Repository'", "'components'", "'interfaces'", "'Environment'", "'containers'", "'links'", "'System'", "'provides'", "'('", "')'", "'encapsulatedInstances'", "'delegationConnectors'", "'assemblyConnectors'", "'AllocationContext'", "'assemblyContext'", "'container'", "'Component'", "'requires'", "'description'", "'CompositeComponent'", "'Interface'", "'signatures'", "'BehaviourDescription'", "'internalActions'", "'externalCalls'", "'loops'", "'branches'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'ComplexType'", "'types'", "'MapType'", "'StringType'", "'BooleanType'", "'IntType'", "'ListType'", "'DateType'", "'LongType'", "'FloatType'", "'CharType'", "'VoidType'", "'-'", "'EDate'", "'.'", "'E'", "'e'", "'ECharacterObject'", "'Container'", "'allocationContext'", "'Link'", "'AssemblyContext'", "'instantiatedComponent'", "'AssemblyConnector'", "'requiredRole'", "'providedRole'", "'RequiredRole'", "'delegationConnector'", "'assemblyConnector'", "'ProvidedRole'", "'DelegationConnectorRequired'", "'linkedInterface'", "'linkedRole'", "'DelegationConnectorProvided'", "'linkdedRole'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentBasedSystem";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentBasedSystem"
    // InternalDsl.g:64:1: entryRuleComponentBasedSystem returns [EObject current=null] : iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF ;
    public final EObject entryRuleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBasedSystem = null;


        try {
            // InternalDsl.g:64:61: (iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF )
            // InternalDsl.g:65:2: iv_ruleComponentBasedSystem= ruleComponentBasedSystem EOF
            {
             newCompositeNode(grammarAccess.getComponentBasedSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentBasedSystem=ruleComponentBasedSystem();

            state._fsp--;

             current =iv_ruleComponentBasedSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentBasedSystem"


    // $ANTLR start "ruleComponentBasedSystem"
    // InternalDsl.g:71:1: ruleComponentBasedSystem returns [EObject current=null] : ( () otherlv_1= 'ComponentBasedSystem' otherlv_2= '{' (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )? (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )? (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )? (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleComponentBasedSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_repositories_5_0 = null;

        EObject lv_repositories_7_0 = null;

        EObject lv_environments_11_0 = null;

        EObject lv_environments_13_0 = null;

        EObject lv_systems_17_0 = null;

        EObject lv_systems_19_0 = null;

        EObject lv_allocationContexts_23_0 = null;

        EObject lv_allocationContexts_25_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'ComponentBasedSystem' otherlv_2= '{' (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )? (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )? (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )? (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'ComponentBasedSystem' otherlv_2= '{' (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )? (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )? (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )? (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'ComponentBasedSystem' otherlv_2= '{' (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )? (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )? (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )? (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'ComponentBasedSystem' otherlv_2= '{' (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )? (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )? (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )? (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentBasedSystemAccess().getComponentBasedSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:94:3: (otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:95:4: otherlv_3= 'repositories' otherlv_4= '{' ( (lv_repositories_5_0= ruleRepository ) ) (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentBasedSystemAccess().getRepositoriesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:103:4: ( (lv_repositories_5_0= ruleRepository ) )
                    // InternalDsl.g:104:5: (lv_repositories_5_0= ruleRepository )
                    {
                    // InternalDsl.g:104:5: (lv_repositories_5_0= ruleRepository )
                    // InternalDsl.g:105:6: lv_repositories_5_0= ruleRepository
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRepositoriesRepositoryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_repositories_5_0=ruleRepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"repositories",
                    							lv_repositories_5_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Repository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:122:4: (otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:123:5: otherlv_6= ',' ( (lv_repositories_7_0= ruleRepository ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:127:5: ( (lv_repositories_7_0= ruleRepository ) )
                    	    // InternalDsl.g:128:6: (lv_repositories_7_0= ruleRepository )
                    	    {
                    	    // InternalDsl.g:128:6: (lv_repositories_7_0= ruleRepository )
                    	    // InternalDsl.g:129:7: lv_repositories_7_0= ruleRepository
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getRepositoriesRepositoryParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_repositories_7_0=ruleRepository();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"repositories",
                    	    								lv_repositories_7_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Repository");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:152:3: (otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:153:4: otherlv_9= 'environments' otherlv_10= '{' ( (lv_environments_11_0= ruleEnvironment ) ) (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentBasedSystemAccess().getEnvironmentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:161:4: ( (lv_environments_11_0= ruleEnvironment ) )
                    // InternalDsl.g:162:5: (lv_environments_11_0= ruleEnvironment )
                    {
                    // InternalDsl.g:162:5: (lv_environments_11_0= ruleEnvironment )
                    // InternalDsl.g:163:6: lv_environments_11_0= ruleEnvironment
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getEnvironmentsEnvironmentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_environments_11_0=ruleEnvironment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"environments",
                    							lv_environments_11_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Environment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:180:4: (otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:181:5: otherlv_12= ',' ( (lv_environments_13_0= ruleEnvironment ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:185:5: ( (lv_environments_13_0= ruleEnvironment ) )
                    	    // InternalDsl.g:186:6: (lv_environments_13_0= ruleEnvironment )
                    	    {
                    	    // InternalDsl.g:186:6: (lv_environments_13_0= ruleEnvironment )
                    	    // InternalDsl.g:187:7: lv_environments_13_0= ruleEnvironment
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getEnvironmentsEnvironmentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_environments_13_0=ruleEnvironment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environments",
                    	    								lv_environments_13_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Environment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:210:3: (otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:211:4: otherlv_15= 'systems' otherlv_16= '{' ( (lv_systems_17_0= ruleSystem ) ) (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentBasedSystemAccess().getSystemsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:219:4: ( (lv_systems_17_0= ruleSystem ) )
                    // InternalDsl.g:220:5: (lv_systems_17_0= ruleSystem )
                    {
                    // InternalDsl.g:220:5: (lv_systems_17_0= ruleSystem )
                    // InternalDsl.g:221:6: lv_systems_17_0= ruleSystem
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getSystemsSystemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_systems_17_0=ruleSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"systems",
                    							lv_systems_17_0,
                    							"kit.mdsd.xtext.dsl.Dsl.System");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:238:4: (otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:239:5: otherlv_18= ',' ( (lv_systems_19_0= ruleSystem ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:243:5: ( (lv_systems_19_0= ruleSystem ) )
                    	    // InternalDsl.g:244:6: (lv_systems_19_0= ruleSystem )
                    	    {
                    	    // InternalDsl.g:244:6: (lv_systems_19_0= ruleSystem )
                    	    // InternalDsl.g:245:7: lv_systems_19_0= ruleSystem
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getSystemsSystemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_systems_19_0=ruleSystem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systems",
                    	    								lv_systems_19_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.System");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:268:3: (otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:269:4: otherlv_21= 'allocationContexts' otherlv_22= '{' ( (lv_allocationContexts_23_0= ruleAllocationContext ) ) (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentBasedSystemAccess().getAllocationContextsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getComponentBasedSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:277:4: ( (lv_allocationContexts_23_0= ruleAllocationContext ) )
                    // InternalDsl.g:278:5: (lv_allocationContexts_23_0= ruleAllocationContext )
                    {
                    // InternalDsl.g:278:5: (lv_allocationContexts_23_0= ruleAllocationContext )
                    // InternalDsl.g:279:6: lv_allocationContexts_23_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAllocationContextsAllocationContextParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_allocationContexts_23_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_23_0,
                    							"kit.mdsd.xtext.dsl.Dsl.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:296:4: (otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:297:5: otherlv_24= ',' ( (lv_allocationContexts_25_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getComponentBasedSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:301:5: ( (lv_allocationContexts_25_0= ruleAllocationContext ) )
                    	    // InternalDsl.g:302:6: (lv_allocationContexts_25_0= ruleAllocationContext )
                    	    {
                    	    // InternalDsl.g:302:6: (lv_allocationContexts_25_0= ruleAllocationContext )
                    	    // InternalDsl.g:303:7: lv_allocationContexts_25_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentBasedSystemAccess().getAllocationContextsAllocationContextParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_allocationContexts_25_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentBasedSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_25_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.AllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getComponentBasedSystemAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentBasedSystem"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalDsl.g:334:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalDsl.g:334:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalDsl.g:335:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnector=ruleDelegationConnector();

            state._fsp--;

             current =iv_ruleDelegationConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalDsl.g:341:1: ruleDelegationConnector returns [EObject current=null] : (this_DelegationConnectorRequired_0= ruleDelegationConnectorRequired | this_DelegationConnectorProvided_1= ruleDelegationConnectorProvided ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject this_DelegationConnectorRequired_0 = null;

        EObject this_DelegationConnectorProvided_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:347:2: ( (this_DelegationConnectorRequired_0= ruleDelegationConnectorRequired | this_DelegationConnectorProvided_1= ruleDelegationConnectorProvided ) )
            // InternalDsl.g:348:2: (this_DelegationConnectorRequired_0= ruleDelegationConnectorRequired | this_DelegationConnectorProvided_1= ruleDelegationConnectorProvided )
            {
            // InternalDsl.g:348:2: (this_DelegationConnectorRequired_0= ruleDelegationConnectorRequired | this_DelegationConnectorProvided_1= ruleDelegationConnectorProvided )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==85) ) {
                alt9=1;
            }
            else if ( (LA9_0==88) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:349:3: this_DelegationConnectorRequired_0= ruleDelegationConnectorRequired
                    {

                    			newCompositeNode(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorRequiredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelegationConnectorRequired_0=ruleDelegationConnectorRequired();

                    state._fsp--;


                    			current = this_DelegationConnectorRequired_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:358:3: this_DelegationConnectorProvided_1= ruleDelegationConnectorProvided
                    {

                    			newCompositeNode(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorProvidedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelegationConnectorProvided_1=ruleDelegationConnectorProvided();

                    state._fsp--;


                    			current = this_DelegationConnectorProvided_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:370:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:370:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:371:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:377:1: ruleType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType | this_VoidType_10= ruleVoidType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_MapType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_BooleanType_3 = null;

        EObject this_IntType_4 = null;

        EObject this_ListType_5 = null;

        EObject this_DateType_6 = null;

        EObject this_LongType_7 = null;

        EObject this_FloatType_8 = null;

        EObject this_CharType_9 = null;

        EObject this_VoidType_10 = null;



        	enterRule();

        try {
            // InternalDsl.g:383:2: ( (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType | this_VoidType_10= ruleVoidType ) )
            // InternalDsl.g:384:2: (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType | this_VoidType_10= ruleVoidType )
            {
            // InternalDsl.g:384:2: (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType | this_VoidType_10= ruleVoidType )
            int alt10=11;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt10=1;
                }
                break;
            case 57:
                {
                alt10=2;
                }
                break;
            case 58:
                {
                alt10=3;
                }
                break;
            case 54:
            case 59:
                {
                alt10=4;
                }
                break;
            case 60:
                {
                alt10=5;
                }
                break;
            case 61:
                {
                alt10=6;
                }
                break;
            case 62:
                {
                alt10=7;
                }
                break;
            case 63:
                {
                alt10=8;
                }
                break;
            case 64:
                {
                alt10=9;
                }
                break;
            case 65:
                {
                alt10=10;
                }
                break;
            case 66:
                {
                alt10=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:385:3: this_ComplexType_0= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:394:3: this_MapType_1= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_1=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:403:3: this_StringType_2= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_2=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:412:3: this_BooleanType_3= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_3=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:421:3: this_IntType_4= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_4=ruleIntType();

                    state._fsp--;


                    			current = this_IntType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:430:3: this_ListType_5= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_5=ruleListType();

                    state._fsp--;


                    			current = this_ListType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:439:3: this_DateType_6= ruleDateType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDateTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateType_6=ruleDateType();

                    state._fsp--;


                    			current = this_DateType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:448:3: this_LongType_7= ruleLongType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LongType_7=ruleLongType();

                    state._fsp--;


                    			current = this_LongType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:457:3: this_FloatType_8= ruleFloatType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatType_8=ruleFloatType();

                    state._fsp--;


                    			current = this_FloatType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:466:3: this_CharType_9= ruleCharType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCharTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharType_9=ruleCharType();

                    state._fsp--;


                    			current = this_CharType_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDsl.g:475:3: this_VoidType_10= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_10=ruleVoidType();

                    state._fsp--;


                    			current = this_VoidType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleParameterType"
    // InternalDsl.g:487:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalDsl.g:487:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalDsl.g:488:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalDsl.g:494:1: ruleParameterType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_MapType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_BooleanType_3 = null;

        EObject this_IntType_4 = null;

        EObject this_ListType_5 = null;

        EObject this_DateType_6 = null;

        EObject this_LongType_7 = null;

        EObject this_FloatType_8 = null;

        EObject this_CharType_9 = null;



        	enterRule();

        try {
            // InternalDsl.g:500:2: ( (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType ) )
            // InternalDsl.g:501:2: (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType )
            {
            // InternalDsl.g:501:2: (this_ComplexType_0= ruleComplexType | this_MapType_1= ruleMapType | this_StringType_2= ruleStringType | this_BooleanType_3= ruleBooleanType | this_IntType_4= ruleIntType | this_ListType_5= ruleListType | this_DateType_6= ruleDateType | this_LongType_7= ruleLongType | this_FloatType_8= ruleFloatType | this_CharType_9= ruleCharType )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 58:
                {
                alt11=3;
                }
                break;
            case 54:
            case 59:
                {
                alt11=4;
                }
                break;
            case 60:
                {
                alt11=5;
                }
                break;
            case 61:
                {
                alt11=6;
                }
                break;
            case 62:
                {
                alt11=7;
                }
                break;
            case 63:
                {
                alt11=8;
                }
                break;
            case 64:
                {
                alt11=9;
                }
                break;
            case 65:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:502:3: this_ComplexType_0= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getComplexTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:511:3: this_MapType_1= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getMapTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_1=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:520:3: this_StringType_2= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getStringTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_2=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:529:3: this_BooleanType_3= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getBooleanTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_3=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:538:3: this_IntType_4= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getIntTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_4=ruleIntType();

                    state._fsp--;


                    			current = this_IntType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:547:3: this_ListType_5= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getListTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_5=ruleListType();

                    state._fsp--;


                    			current = this_ListType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDsl.g:556:3: this_DateType_6= ruleDateType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getDateTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateType_6=ruleDateType();

                    state._fsp--;


                    			current = this_DateType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDsl.g:565:3: this_LongType_7= ruleLongType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getLongTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LongType_7=ruleLongType();

                    state._fsp--;


                    			current = this_LongType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDsl.g:574:3: this_FloatType_8= ruleFloatType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getFloatTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatType_8=ruleFloatType();

                    state._fsp--;


                    			current = this_FloatType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDsl.g:583:3: this_CharType_9= ruleCharType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getCharTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharType_9=ruleCharType();

                    state._fsp--;


                    			current = this_CharType_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleRepository"
    // InternalDsl.g:595:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalDsl.g:595:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalDsl.g:596:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalDsl.g:602:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_components_8_0 = null;

        EObject lv_interfaces_12_0 = null;

        EObject lv_interfaces_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:608:2: ( ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalDsl.g:609:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalDsl.g:609:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalDsl.g:610:3: () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalDsl.g:610:3: ()
            // InternalDsl.g:611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            // InternalDsl.g:621:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:622:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:622:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:623:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:644:3: (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:645:4: otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:653:4: ( (lv_components_6_0= ruleComponent ) )
                    // InternalDsl.g:654:5: (lv_components_6_0= ruleComponent )
                    {
                    // InternalDsl.g:654:5: (lv_components_6_0= ruleComponent )
                    // InternalDsl.g:655:6: lv_components_6_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_6_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_6_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:672:4: (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:673:5: otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:677:5: ( (lv_components_8_0= ruleComponent ) )
                    	    // InternalDsl.g:678:6: (lv_components_8_0= ruleComponent )
                    	    {
                    	    // InternalDsl.g:678:6: (lv_components_8_0= ruleComponent )
                    	    // InternalDsl.g:679:7: lv_components_8_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_8_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_8_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:702:3: (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:703:4: otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getInterfacesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:711:4: ( (lv_interfaces_12_0= ruleInterface ) )
                    // InternalDsl.g:712:5: (lv_interfaces_12_0= ruleInterface )
                    {
                    // InternalDsl.g:712:5: (lv_interfaces_12_0= ruleInterface )
                    // InternalDsl.g:713:6: lv_interfaces_12_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interfaces_12_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_12_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:730:4: (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDsl.g:731:5: otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:735:5: ( (lv_interfaces_14_0= ruleInterface ) )
                    	    // InternalDsl.g:736:6: (lv_interfaces_14_0= ruleInterface )
                    	    {
                    	    // InternalDsl.g:736:6: (lv_interfaces_14_0= ruleInterface )
                    	    // InternalDsl.g:737:7: lv_interfaces_14_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interfaces_14_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_14_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleEnvironment"
    // InternalDsl.g:768:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalDsl.g:768:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalDsl.g:769:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalDsl.g:775:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_containers_5_0 = null;

        EObject lv_containers_7_0 = null;

        EObject lv_links_11_0 = null;

        EObject lv_links_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:781:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:782:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:782:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:783:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:783:3: ()
            // InternalDsl.g:784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:798:3: (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:799:4: otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:807:4: ( (lv_containers_5_0= ruleContainer ) )
                    // InternalDsl.g:808:5: (lv_containers_5_0= ruleContainer )
                    {
                    // InternalDsl.g:808:5: (lv_containers_5_0= ruleContainer )
                    // InternalDsl.g:809:6: lv_containers_5_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_containers_5_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"containers",
                    							lv_containers_5_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:826:4: (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDsl.g:827:5: otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:831:5: ( (lv_containers_7_0= ruleContainer ) )
                    	    // InternalDsl.g:832:6: (lv_containers_7_0= ruleContainer )
                    	    {
                    	    // InternalDsl.g:832:6: (lv_containers_7_0= ruleContainer )
                    	    // InternalDsl.g:833:7: lv_containers_7_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_containers_7_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containers",
                    	    								lv_containers_7_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:856:3: (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:857:4: otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinksKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:865:4: ( (lv_links_11_0= ruleLink ) )
                    // InternalDsl.g:866:5: (lv_links_11_0= ruleLink )
                    {
                    // InternalDsl.g:866:5: (lv_links_11_0= ruleLink )
                    // InternalDsl.g:867:6: lv_links_11_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_links_11_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_11_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:884:4: (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDsl.g:885:5: otherlv_12= ',' ( (lv_links_13_0= ruleLink ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:889:5: ( (lv_links_13_0= ruleLink ) )
                    	    // InternalDsl.g:890:6: (lv_links_13_0= ruleLink )
                    	    {
                    	    // InternalDsl.g:890:6: (lv_links_13_0= ruleLink )
                    	    // InternalDsl.g:891:7: lv_links_13_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_links_13_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_13_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleSystem"
    // InternalDsl.g:922:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDsl.g:922:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDsl.g:923:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDsl.g:929:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_encapsulatedInstances_10_0 = null;

        EObject lv_encapsulatedInstances_12_0 = null;

        EObject lv_delegationConnectors_16_0 = null;

        EObject lv_delegationConnectors_18_0 = null;

        EObject lv_assemblyConnectors_22_0 = null;

        EObject lv_assemblyConnectors_24_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:935:2: ( (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalDsl.g:936:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalDsl.g:936:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalDsl.g:937:3: otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getProvidesKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:953:3: ( ( ruleEString ) )
            // InternalDsl.g:954:4: ( ruleEString )
            {
            // InternalDsl.g:954:4: ( ruleEString )
            // InternalDsl.g:955:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getProvidesInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:969:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:970:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:974:4: ( ( ruleEString ) )
            	    // InternalDsl.g:975:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:975:5: ( ruleEString )
            	    // InternalDsl.g:976:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemAccess().getProvidesInterfaceCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getEncapsulatedInstancesKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalDsl.g:1003:3: ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) )
            // InternalDsl.g:1004:4: (lv_encapsulatedInstances_10_0= ruleAssemblyContext )
            {
            // InternalDsl.g:1004:4: (lv_encapsulatedInstances_10_0= ruleAssemblyContext )
            // InternalDsl.g:1005:5: lv_encapsulatedInstances_10_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getEncapsulatedInstancesAssemblyContextParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_encapsulatedInstances_10_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					add(
            						current,
            						"encapsulatedInstances",
            						lv_encapsulatedInstances_10_0,
            						"kit.mdsd.xtext.dsl.Dsl.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1022:3: (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1023:4: otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDsl.g:1027:4: ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) )
            	    // InternalDsl.g:1028:5: (lv_encapsulatedInstances_12_0= ruleAssemblyContext )
            	    {
            	    // InternalDsl.g:1028:5: (lv_encapsulatedInstances_12_0= ruleAssemblyContext )
            	    // InternalDsl.g:1029:6: lv_encapsulatedInstances_12_0= ruleAssemblyContext
            	    {

            	    						newCompositeNode(grammarAccess.getSystemAccess().getEncapsulatedInstancesAssemblyContextParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_encapsulatedInstances_12_0=ruleAssemblyContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"encapsulatedInstances",
            	    							lv_encapsulatedInstances_12_0,
            	    							"kit.mdsd.xtext.dsl.Dsl.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalDsl.g:1051:3: (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1052:4: otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getDelegationConnectorsKeyword_12_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalDsl.g:1060:4: ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) )
                    // InternalDsl.g:1061:5: (lv_delegationConnectors_16_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:1061:5: (lv_delegationConnectors_16_0= ruleDelegationConnector )
                    // InternalDsl.g:1062:6: lv_delegationConnectors_16_0= ruleDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_delegationConnectors_16_0=ruleDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"delegationConnectors",
                    							lv_delegationConnectors_16_0,
                    							"kit.mdsd.xtext.dsl.Dsl.DelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1079:4: (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDsl.g:1080:5: otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalDsl.g:1084:5: ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:1085:6: (lv_delegationConnectors_18_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:1085:6: (lv_delegationConnectors_18_0= ruleDelegationConnector )
                    	    // InternalDsl.g:1086:7: lv_delegationConnectors_18_0= ruleDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_delegationConnectors_18_0=ruleDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"delegationConnectors",
                    	    								lv_delegationConnectors_18_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.DelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1109:3: (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1110:4: otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_13_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalDsl.g:1118:4: ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:1119:5: (lv_assemblyConnectors_22_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:1119:5: (lv_assemblyConnectors_22_0= ruleAssemblyConnector )
                    // InternalDsl.g:1120:6: lv_assemblyConnectors_22_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_assemblyConnectors_22_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"assemblyConnectors",
                    							lv_assemblyConnectors_22_0,
                    							"kit.mdsd.xtext.dsl.Dsl.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1137:4: (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDsl.g:1138:5: otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getSystemAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalDsl.g:1142:5: ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:1143:6: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:1143:6: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:1144:7: lv_assemblyConnectors_24_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_assemblyConnectors_24_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyConnectors",
                    	    								lv_assemblyConnectors_24_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalDsl.g:1175:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalDsl.g:1175:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalDsl.g:1176:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalDsl.g:1182:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1188:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalDsl.g:1189:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:1189:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalDsl.g:1190:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalDsl.g:1194:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1195:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1195:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1196:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAssemblyContextKeyword_3());
            		
            // InternalDsl.g:1221:3: ( ( ruleEString ) )
            // InternalDsl.g:1222:4: ( ruleEString )
            {
            // InternalDsl.g:1222:4: ( ruleEString )
            // InternalDsl.g:1223:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getContainerKeyword_5());
            		
            // InternalDsl.g:1241:3: ( ( ruleEString ) )
            // InternalDsl.g:1242:4: ( ruleEString )
            {
            // InternalDsl.g:1242:4: ( ruleEString )
            // InternalDsl.g:1243:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:1265:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:1265:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:1266:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:1272:1: ruleComponent returns [EObject current=null] : ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) | this_CompositeComponent_19= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_17_0 = null;

        EObject this_CompositeComponent_19 = null;



        	enterRule();

        try {
            // InternalDsl.g:1278:2: ( ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) | this_CompositeComponent_19= ruleCompositeComponent ) )
            // InternalDsl.g:1279:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) | this_CompositeComponent_19= ruleCompositeComponent )
            {
            // InternalDsl.g:1279:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) | this_CompositeComponent_19= ruleCompositeComponent )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            else if ( (LA31_0==38) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1280:3: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' )
                    {
                    // InternalDsl.g:1280:3: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' )
                    // InternalDsl.g:1281:4: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}'
                    {
                    // InternalDsl.g:1281:4: ()
                    // InternalDsl.g:1282:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComponentAccess().getComponentAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_0_1());
                    			
                    // InternalDsl.g:1292:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalDsl.g:1293:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalDsl.g:1293:5: (lv_name_2_0= ruleEString )
                    // InternalDsl.g:1294:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"kit.mdsd.xtext.dsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalDsl.g:1315:4: (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==36) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDsl.g:1316:5: otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_24); 

                            					newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRequiresKeyword_0_4_0());
                            				
                            otherlv_5=(Token)match(input,27,FOLLOW_14); 

                            					newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_0_4_1());
                            				
                            // InternalDsl.g:1324:5: ( ( ruleEString ) )
                            // InternalDsl.g:1325:6: ( ruleEString )
                            {
                            // InternalDsl.g:1325:6: ( ruleEString )
                            // InternalDsl.g:1326:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComponentRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getComponentAccess().getRequiresInterfaceCrossReference_0_4_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:1340:5: (otherlv_7= ',' ( ( ruleEString ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==14) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalDsl.g:1341:6: otherlv_7= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_0_4_3_0());
                            	    					
                            	    // InternalDsl.g:1345:6: ( ( ruleEString ) )
                            	    // InternalDsl.g:1346:7: ( ruleEString )
                            	    {
                            	    // InternalDsl.g:1346:7: ( ruleEString )
                            	    // InternalDsl.g:1347:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getComponentRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getComponentAccess().getRequiresInterfaceCrossReference_0_4_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,28,FOLLOW_35); 

                            					newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_0_4_4());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1367:4: (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==26) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDsl.g:1368:5: otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_24); 

                            					newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getProvidesKeyword_0_5_0());
                            				
                            otherlv_11=(Token)match(input,27,FOLLOW_14); 

                            					newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_0_5_1());
                            				
                            // InternalDsl.g:1376:5: ( ( ruleEString ) )
                            // InternalDsl.g:1377:6: ( ruleEString )
                            {
                            // InternalDsl.g:1377:6: ( ruleEString )
                            // InternalDsl.g:1378:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComponentRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getComponentAccess().getProvidesInterfaceCrossReference_0_5_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:1392:5: (otherlv_13= ',' ( ( ruleEString ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==14) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalDsl.g:1393:6: otherlv_13= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_0_5_3_0());
                            	    					
                            	    // InternalDsl.g:1397:6: ( ( ruleEString ) )
                            	    // InternalDsl.g:1398:7: ( ruleEString )
                            	    {
                            	    // InternalDsl.g:1398:7: ( ruleEString )
                            	    // InternalDsl.g:1399:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getComponentRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getComponentAccess().getProvidesInterfaceCrossReference_0_5_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,28,FOLLOW_36); 

                            					newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_0_5_4());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1419:4: (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==37) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalDsl.g:1420:5: otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) )
                            {
                            otherlv_16=(Token)match(input,37,FOLLOW_37); 

                            					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getDescriptionKeyword_0_6_0());
                            				
                            // InternalDsl.g:1424:5: ( (lv_description_17_0= ruleBehaviourDescription ) )
                            // InternalDsl.g:1425:6: (lv_description_17_0= ruleBehaviourDescription )
                            {
                            // InternalDsl.g:1425:6: (lv_description_17_0= ruleBehaviourDescription )
                            // InternalDsl.g:1426:7: lv_description_17_0= ruleBehaviourDescription
                            {

                            							newCompositeNode(grammarAccess.getComponentAccess().getDescriptionBehaviourDescriptionParserRuleCall_0_6_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_description_17_0=ruleBehaviourDescription();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComponentRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_17_0,
                            								"kit.mdsd.xtext.dsl.Dsl.BehaviourDescription");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1450:3: this_CompositeComponent_19= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_19=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalDsl.g:1462:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalDsl.g:1462:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalDsl.g:1463:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalDsl.g:1469:1: ruleCompositeComponent returns [EObject current=null] : ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1475:2: ( ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' ) )
            // InternalDsl.g:1476:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            {
            // InternalDsl.g:1476:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}' )
            // InternalDsl.g:1477:3: () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? otherlv_24= '}'
            {
            // InternalDsl.g:1477:3: ()
            // InternalDsl.g:1478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeComponentAccess().getCompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_1());
            		
            // InternalDsl.g:1488:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1489:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1489:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1490:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1511:3: (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1512:4: otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:1520:4: ( ( ruleEString ) )
                    // InternalDsl.g:1521:5: ( ruleEString )
                    {
                    // InternalDsl.g:1521:5: ( ruleEString )
                    // InternalDsl.g:1522:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1536:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDsl.g:1537:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1541:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:1542:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:1542:6: ( ruleEString )
                    	    // InternalDsl.g:1543:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1563:3: (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1564:4: otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:1572:4: ( ( ruleEString ) )
                    // InternalDsl.g:1573:5: ( ruleEString )
                    {
                    // InternalDsl.g:1573:5: ( ruleEString )
                    // InternalDsl.g:1574:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1588:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDsl.g:1589:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1593:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:1594:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:1594:6: ( ruleEString )
                    	    // InternalDsl.g:1595:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1615:3: (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1616:4: otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_37); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalDsl.g:1620:4: ( (lv_description_17_0= ruleBehaviourDescription ) )
                    // InternalDsl.g:1621:5: (lv_description_17_0= ruleBehaviourDescription )
                    {
                    // InternalDsl.g:1621:5: (lv_description_17_0= ruleBehaviourDescription )
                    // InternalDsl.g:1622:6: lv_description_17_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getDescriptionBehaviourDescriptionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_description_17_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_17_0,
                    							"kit.mdsd.xtext.dsl.Dsl.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1640:3: (otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1641:4: otherlv_18= 'encapsulatedInstances' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getEncapsulatedInstancesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDsl.g:1649:4: ( ( ruleEString ) )
                    // InternalDsl.g:1650:5: ( ruleEString )
                    {
                    // InternalDsl.g:1650:5: ( ruleEString )
                    // InternalDsl.g:1651:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getEncapsulatedInstancesAssemblyContextCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1665:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDsl.g:1666:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:1670:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:1671:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:1671:6: ( ruleEString )
                    	    // InternalDsl.g:1672:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getEncapsulatedInstancesAssemblyContextCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleInterface"
    // InternalDsl.g:1700:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDsl.g:1700:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDsl.g:1701:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDsl.g:1707:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signatures_6_0 = null;

        EObject lv_signatures_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1713:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:1714:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:1714:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:1715:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:1715:3: ()
            // InternalDsl.g:1716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalDsl.g:1726:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1727:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1727:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1728:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1749:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1750:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1758:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalDsl.g:1759:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalDsl.g:1759:5: (lv_signatures_6_0= ruleSignature )
                    // InternalDsl.g:1760:6: lv_signatures_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_signatures_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signatures",
                    							lv_signatures_6_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1777:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDsl.g:1778:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1782:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalDsl.g:1783:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalDsl.g:1783:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalDsl.g:1784:7: lv_signatures_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_signatures_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signatures",
                    	    								lv_signatures_8_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:1815:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1815:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1816:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:1822:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1828:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1829:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1829:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1830:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1838:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalDsl.g:1849:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalDsl.g:1849:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalDsl.g:1850:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription=ruleBehaviourDescription();

            state._fsp--;

             current =iv_ruleBehaviourDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalDsl.g:1856:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_internalActions_5_0 = null;

        EObject lv_internalActions_7_0 = null;

        EObject lv_externalCalls_11_0 = null;

        EObject lv_externalCalls_13_0 = null;

        EObject lv_loops_17_0 = null;

        EObject lv_loops_19_0 = null;

        EObject lv_branches_23_0 = null;

        EObject lv_branches_25_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1862:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalDsl.g:1863:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalDsl.g:1863:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalDsl.g:1864:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalDsl.g:1864:3: ()
            // InternalDsl.g:1865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1879:3: (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1880:4: otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getInternalActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:1888:4: ( (lv_internalActions_5_0= ruleInternalAction ) )
                    // InternalDsl.g:1889:5: (lv_internalActions_5_0= ruleInternalAction )
                    {
                    // InternalDsl.g:1889:5: (lv_internalActions_5_0= ruleInternalAction )
                    // InternalDsl.g:1890:6: lv_internalActions_5_0= ruleInternalAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getInternalActionsInternalActionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_internalActions_5_0=ruleInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"internalActions",
                    							lv_internalActions_5_0,
                    							"kit.mdsd.xtext.dsl.Dsl.InternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1907:4: (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalDsl.g:1908:5: otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:1912:5: ( (lv_internalActions_7_0= ruleInternalAction ) )
                    	    // InternalDsl.g:1913:6: (lv_internalActions_7_0= ruleInternalAction )
                    	    {
                    	    // InternalDsl.g:1913:6: (lv_internalActions_7_0= ruleInternalAction )
                    	    // InternalDsl.g:1914:7: lv_internalActions_7_0= ruleInternalAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getInternalActionsInternalActionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_internalActions_7_0=ruleInternalAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalActions",
                    	    								lv_internalActions_7_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.InternalAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1937:3: (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:1938:4: otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getExternalCallsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_10, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1946:4: ( (lv_externalCalls_11_0= ruleExternalCall ) )
                    // InternalDsl.g:1947:5: (lv_externalCalls_11_0= ruleExternalCall )
                    {
                    // InternalDsl.g:1947:5: (lv_externalCalls_11_0= ruleExternalCall )
                    // InternalDsl.g:1948:6: lv_externalCalls_11_0= ruleExternalCall
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getExternalCallsExternalCallParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_externalCalls_11_0=ruleExternalCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"externalCalls",
                    							lv_externalCalls_11_0,
                    							"kit.mdsd.xtext.dsl.Dsl.ExternalCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1965:4: (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalDsl.g:1966:5: otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1970:5: ( (lv_externalCalls_13_0= ruleExternalCall ) )
                    	    // InternalDsl.g:1971:6: (lv_externalCalls_13_0= ruleExternalCall )
                    	    {
                    	    // InternalDsl.g:1971:6: (lv_externalCalls_13_0= ruleExternalCall )
                    	    // InternalDsl.g:1972:7: lv_externalCalls_13_0= ruleExternalCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getExternalCallsExternalCallParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_externalCalls_13_0=ruleExternalCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalCalls",
                    	    								lv_externalCalls_13_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.ExternalCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1995:3: (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:1996:4: otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviourDescriptionAccess().getLoopsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2004:4: ( (lv_loops_17_0= ruleLoop ) )
                    // InternalDsl.g:2005:5: (lv_loops_17_0= ruleLoop )
                    {
                    // InternalDsl.g:2005:5: (lv_loops_17_0= ruleLoop )
                    // InternalDsl.g:2006:6: lv_loops_17_0= ruleLoop
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getLoopsLoopParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_loops_17_0=ruleLoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"loops",
                    							lv_loops_17_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Loop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2023:4: (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDsl.g:2024:5: otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2028:5: ( (lv_loops_19_0= ruleLoop ) )
                    	    // InternalDsl.g:2029:6: (lv_loops_19_0= ruleLoop )
                    	    {
                    	    // InternalDsl.g:2029:6: (lv_loops_19_0= ruleLoop )
                    	    // InternalDsl.g:2030:7: lv_loops_19_0= ruleLoop
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getLoopsLoopParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_loops_19_0=ruleLoop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loops",
                    	    								lv_loops_19_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Loop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2053:3: (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2054:4: otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourDescriptionAccess().getBranchesKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_22, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2062:4: ( (lv_branches_23_0= ruleBranch ) )
                    // InternalDsl.g:2063:5: (lv_branches_23_0= ruleBranch )
                    {
                    // InternalDsl.g:2063:5: (lv_branches_23_0= ruleBranch )
                    // InternalDsl.g:2064:6: lv_branches_23_0= ruleBranch
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBranchesBranchParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_branches_23_0=ruleBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"branches",
                    							lv_branches_23_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Branch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2081:4: (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalDsl.g:2082:5: otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2086:5: ( (lv_branches_25_0= ruleBranch ) )
                    	    // InternalDsl.g:2087:6: (lv_branches_25_0= ruleBranch )
                    	    {
                    	    // InternalDsl.g:2087:6: (lv_branches_25_0= ruleBranch )
                    	    // InternalDsl.g:2088:7: lv_branches_25_0= ruleBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBranchesBranchParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_branches_25_0=ruleBranch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branches",
                    	    								lv_branches_25_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Branch");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInternalAction"
    // InternalDsl.g:2119:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalDsl.g:2119:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalDsl.g:2120:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalDsl.g:2126:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2132:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalDsl.g:2133:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalDsl.g:2133:2: ( () otherlv_1= 'InternalAction' )
            // InternalDsl.g:2134:3: () otherlv_1= 'InternalAction'
            {
            // InternalDsl.g:2134:3: ()
            // InternalDsl.g:2135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalDsl.g:2149:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDsl.g:2149:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDsl.g:2150:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalDsl.g:2156:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2162:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalDsl.g:2163:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalDsl.g:2163:2: ( () otherlv_1= 'ExternalCall' )
            // InternalDsl.g:2164:3: () otherlv_1= 'ExternalCall'
            {
            // InternalDsl.g:2164:3: ()
            // InternalDsl.g:2165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getExternalCallKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalDsl.g:2179:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalDsl.g:2179:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalDsl.g:2180:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalDsl.g:2186:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2192:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalDsl.g:2193:2: ( () otherlv_1= 'Loop' )
            {
            // InternalDsl.g:2193:2: ( () otherlv_1= 'Loop' )
            // InternalDsl.g:2194:3: () otherlv_1= 'Loop'
            {
            // InternalDsl.g:2194:3: ()
            // InternalDsl.g:2195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalDsl.g:2209:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalDsl.g:2209:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalDsl.g:2210:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalDsl.g:2216:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2222:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalDsl.g:2223:2: ( () otherlv_1= 'Branch' )
            {
            // InternalDsl.g:2223:2: ( () otherlv_1= 'Branch' )
            // InternalDsl.g:2224:3: () otherlv_1= 'Branch'
            {
            // InternalDsl.g:2224:3: ()
            // InternalDsl.g:2225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleSignature"
    // InternalDsl.g:2239:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalDsl.g:2239:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalDsl.g:2240:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalDsl.g:2246:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_returnType_4_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2252:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:2253:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:2253:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:2254:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalDsl.g:2258:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2259:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2259:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2260:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnTypeKeyword_3());
            		
            // InternalDsl.g:2285:3: ( (lv_returnType_4_0= ruleType ) )
            // InternalDsl.g:2286:4: (lv_returnType_4_0= ruleType )
            {
            // InternalDsl.g:2286:4: (lv_returnType_4_0= ruleType )
            // InternalDsl.g:2287:5: lv_returnType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_54);
            lv_returnType_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"kit.mdsd.xtext.dsl.Dsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2304:3: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2305:4: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2313:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalDsl.g:2314:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalDsl.g:2314:5: (lv_parameters_7_0= ruleParameter )
                    // InternalDsl.g:2315:6: lv_parameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2332:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDsl.g:2333:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_55); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2337:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalDsl.g:2338:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalDsl.g:2338:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalDsl.g:2339:7: lv_parameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalDsl.g:2370:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:2370:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:2371:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDsl.g:2377:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2383:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) )
            // InternalDsl.g:2384:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:2384:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            // InternalDsl.g:2385:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalDsl.g:2389:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2390:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2390:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2391:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,54,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalDsl.g:2416:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalDsl.g:2417:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalDsl.g:2417:4: (lv_type_4_0= ruleParameterType )
            // InternalDsl.g:2418:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"kit.mdsd.xtext.dsl.Dsl.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleComplexType"
    // InternalDsl.g:2443:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalDsl.g:2443:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalDsl.g:2444:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalDsl.g:2450:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_types_4_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2456:2: ( (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalDsl.g:2457:2: (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalDsl.g:2457:2: (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalDsl.g:2458:3: otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getTypesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2474:3: ( (lv_types_4_0= ruleParameterType ) )
            // InternalDsl.g:2475:4: (lv_types_4_0= ruleParameterType )
            {
            // InternalDsl.g:2475:4: (lv_types_4_0= ruleParameterType )
            // InternalDsl.g:2476:5: lv_types_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getTypesParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_types_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_4_0,
            						"kit.mdsd.xtext.dsl.Dsl.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2493:3: (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==14) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDsl.g:2494:4: otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_57); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:2498:4: ( (lv_types_6_0= ruleParameterType ) )
            	    // InternalDsl.g:2499:5: (lv_types_6_0= ruleParameterType )
            	    {
            	    // InternalDsl.g:2499:5: (lv_types_6_0= ruleParameterType )
            	    // InternalDsl.g:2500:6: lv_types_6_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getComplexTypeAccess().getTypesParameterTypeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_types_6_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_6_0,
            	    							"kit.mdsd.xtext.dsl.Dsl.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleMapType"
    // InternalDsl.g:2530:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalDsl.g:2530:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalDsl.g:2531:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalDsl.g:2537:1: ruleMapType returns [EObject current=null] : ( () otherlv_1= 'MapType' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2543:2: ( ( () otherlv_1= 'MapType' ) )
            // InternalDsl.g:2544:2: ( () otherlv_1= 'MapType' )
            {
            // InternalDsl.g:2544:2: ( () otherlv_1= 'MapType' )
            // InternalDsl.g:2545:3: () otherlv_1= 'MapType'
            {
            // InternalDsl.g:2545:3: ()
            // InternalDsl.g:2546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapTypeAccess().getMapTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getMapTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleStringType"
    // InternalDsl.g:2560:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalDsl.g:2560:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalDsl.g:2561:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalDsl.g:2567:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2573:2: ( ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:2574:2: ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:2574:2: ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalDsl.g:2575:3: () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:2575:3: ()
            // InternalDsl.g:2576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2590:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:2591:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2595:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalDsl.g:2596:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalDsl.g:2596:5: (lv_type_4_0= ruleEString )
                    // InternalDsl.g:2597:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"kit.mdsd.xtext.dsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStringTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalDsl.g:2623:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalDsl.g:2623:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalDsl.g:2624:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalDsl.g:2630:1: ruleBooleanType returns [EObject current=null] : ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2636:2: ( ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' ) )
            // InternalDsl.g:2637:2: ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' )
            {
            // InternalDsl.g:2637:2: ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' )
            // InternalDsl.g:2638:3: () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType'
            {
            // InternalDsl.g:2638:3: ()
            // InternalDsl.g:2639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2645:3: ( (lv_type_1_0= 'type' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:2646:4: (lv_type_1_0= 'type' )
                    {
                    // InternalDsl.g:2646:4: (lv_type_1_0= 'type' )
                    // InternalDsl.g:2647:5: lv_type_1_0= 'type'
                    {
                    lv_type_1_0=(Token)match(input,54,FOLLOW_60); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getBooleanTypeAccess().getTypeTypeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_1_0 != null, "type");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleIntType"
    // InternalDsl.g:2667:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalDsl.g:2667:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalDsl.g:2668:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalDsl.g:2674:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2680:2: ( ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:2681:2: ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:2681:2: ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' )
            // InternalDsl.g:2682:3: () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:2682:3: ()
            // InternalDsl.g:2683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getIntTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2697:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==54) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDsl.g:2698:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntTypeAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2702:4: ( (lv_type_4_0= ruleEIntegerObject ) )
                    // InternalDsl.g:2703:5: (lv_type_4_0= ruleEIntegerObject )
                    {
                    // InternalDsl.g:2703:5: (lv_type_4_0= ruleEIntegerObject )
                    // InternalDsl.g:2704:6: lv_type_4_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getIntTypeAccess().getTypeEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_4_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"kit.mdsd.xtext.dsl.Dsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleListType"
    // InternalDsl.g:2730:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalDsl.g:2730:49: (iv_ruleListType= ruleListType EOF )
            // InternalDsl.g:2731:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalDsl.g:2737:1: ruleListType returns [EObject current=null] : ( () otherlv_1= 'ListType' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2743:2: ( ( () otherlv_1= 'ListType' ) )
            // InternalDsl.g:2744:2: ( () otherlv_1= 'ListType' )
            {
            // InternalDsl.g:2744:2: ( () otherlv_1= 'ListType' )
            // InternalDsl.g:2745:3: () otherlv_1= 'ListType'
            {
            // InternalDsl.g:2745:3: ()
            // InternalDsl.g:2746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListTypeAccess().getListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getListTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleDateType"
    // InternalDsl.g:2760:1: entryRuleDateType returns [EObject current=null] : iv_ruleDateType= ruleDateType EOF ;
    public final EObject entryRuleDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateType = null;


        try {
            // InternalDsl.g:2760:49: (iv_ruleDateType= ruleDateType EOF )
            // InternalDsl.g:2761:2: iv_ruleDateType= ruleDateType EOF
            {
             newCompositeNode(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateType=ruleDateType();

            state._fsp--;

             current =iv_ruleDateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // InternalDsl.g:2767:1: ruleDateType returns [EObject current=null] : (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' ) ;
    public final EObject ruleDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2773:2: ( (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2774:2: (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2774:2: (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' )
            // InternalDsl.g:2775:3: otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateTypeAccess().getDateTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getDateTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getDateTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2787:3: ( (lv_type_3_0= ruleEDate ) )
            // InternalDsl.g:2788:4: (lv_type_3_0= ruleEDate )
            {
            // InternalDsl.g:2788:4: (lv_type_3_0= ruleEDate )
            // InternalDsl.g:2789:5: lv_type_3_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getDateTypeAccess().getTypeEDateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"kit.mdsd.xtext.dsl.Dsl.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDateTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleLongType"
    // InternalDsl.g:2814:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // InternalDsl.g:2814:49: (iv_ruleLongType= ruleLongType EOF )
            // InternalDsl.g:2815:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // InternalDsl.g:2821:1: ruleLongType returns [EObject current=null] : (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2827:2: ( (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2828:2: (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2828:2: (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2829:3: otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLongTypeAccess().getLongTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getLongTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getLongTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2841:3: ( (lv_type_3_0= ruleELongObject ) )
            // InternalDsl.g:2842:4: (lv_type_3_0= ruleELongObject )
            {
            // InternalDsl.g:2842:4: (lv_type_3_0= ruleELongObject )
            // InternalDsl.g:2843:5: lv_type_3_0= ruleELongObject
            {

            					newCompositeNode(grammarAccess.getLongTypeAccess().getTypeELongObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleELongObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLongTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"kit.mdsd.xtext.dsl.Dsl.ELongObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLongTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleFloatType"
    // InternalDsl.g:2868:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalDsl.g:2868:50: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalDsl.g:2869:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // InternalDsl.g:2875:1: ruleFloatType returns [EObject current=null] : (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2881:2: ( (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2882:2: (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2882:2: (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2883:3: otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatTypeAccess().getFloatTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2895:3: ( (lv_type_3_0= ruleEFloatObject ) )
            // InternalDsl.g:2896:4: (lv_type_3_0= ruleEFloatObject )
            {
            // InternalDsl.g:2896:4: (lv_type_3_0= ruleEFloatObject )
            // InternalDsl.g:2897:5: lv_type_3_0= ruleEFloatObject
            {

            					newCompositeNode(grammarAccess.getFloatTypeAccess().getTypeEFloatObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleEFloatObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"kit.mdsd.xtext.dsl.Dsl.EFloatObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFloatTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleCharType"
    // InternalDsl.g:2922:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // InternalDsl.g:2922:49: (iv_ruleCharType= ruleCharType EOF )
            // InternalDsl.g:2923:2: iv_ruleCharType= ruleCharType EOF
            {
             newCompositeNode(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharType=ruleCharType();

            state._fsp--;

             current =iv_ruleCharType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharType"


    // $ANTLR start "ruleCharType"
    // InternalDsl.g:2929:1: ruleCharType returns [EObject current=null] : (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2935:2: ( (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2936:2: (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2936:2: (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2937:3: otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCharTypeAccess().getCharTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getCharTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getCharTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2949:3: ( (lv_type_3_0= ruleECharacterObject ) )
            // InternalDsl.g:2950:4: (lv_type_3_0= ruleECharacterObject )
            {
            // InternalDsl.g:2950:4: (lv_type_3_0= ruleECharacterObject )
            // InternalDsl.g:2951:5: lv_type_3_0= ruleECharacterObject
            {

            					newCompositeNode(grammarAccess.getCharTypeAccess().getTypeECharacterObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleECharacterObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"kit.mdsd.xtext.dsl.Dsl.ECharacterObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCharTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleVoidType"
    // InternalDsl.g:2976:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalDsl.g:2976:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalDsl.g:2977:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalDsl.g:2983:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'VoidType' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2989:2: ( ( () otherlv_1= 'VoidType' ) )
            // InternalDsl.g:2990:2: ( () otherlv_1= 'VoidType' )
            {
            // InternalDsl.g:2990:2: ( () otherlv_1= 'VoidType' )
            // InternalDsl.g:2991:3: () otherlv_1= 'VoidType'
            {
            // InternalDsl.g:2991:3: ()
            // InternalDsl.g:2992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidTypeAccess().getVoidTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalDsl.g:3006:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalDsl.g:3006:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalDsl.g:3007:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalDsl.g:3013:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3019:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:3020:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:3020:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:3021:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:3021:3: (kw= '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==67) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDsl.g:3022:4: kw= '-'
                    {
                    kw=(Token)match(input,67,FOLLOW_65); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleEDate"
    // InternalDsl.g:3039:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalDsl.g:3039:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalDsl.g:3040:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalDsl.g:3046:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:3052:2: (kw= 'EDate' )
            // InternalDsl.g:3053:2: kw= 'EDate'
            {
            kw=(Token)match(input,68,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleELongObject"
    // InternalDsl.g:3061:1: entryRuleELongObject returns [String current=null] : iv_ruleELongObject= ruleELongObject EOF ;
    public final String entryRuleELongObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELongObject = null;


        try {
            // InternalDsl.g:3061:51: (iv_ruleELongObject= ruleELongObject EOF )
            // InternalDsl.g:3062:2: iv_ruleELongObject= ruleELongObject EOF
            {
             newCompositeNode(grammarAccess.getELongObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELongObject=ruleELongObject();

            state._fsp--;

             current =iv_ruleELongObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELongObject"


    // $ANTLR start "ruleELongObject"
    // InternalDsl.g:3068:1: ruleELongObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELongObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3074:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:3075:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:3075:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:3076:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:3076:3: (kw= '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDsl.g:3077:4: kw= '-'
                    {
                    kw=(Token)match(input,67,FOLLOW_65); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELongObject"


    // $ANTLR start "entryRuleEFloatObject"
    // InternalDsl.g:3094:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // InternalDsl.g:3094:52: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // InternalDsl.g:3095:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // InternalDsl.g:3101:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:3107:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:3108:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:3108:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:3109:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:3109:3: (kw= '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDsl.g:3110:4: kw= '-'
                    {
                    kw=(Token)match(input,67,FOLLOW_66); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3116:3: (this_INT_1= RULE_INT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDsl.g:3117:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_67); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,69,FOLLOW_65); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_68); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:3137:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=70 && LA62_0<=71)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDsl.g:3138:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:3138:4: (kw= 'E' | kw= 'e' )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==70) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==71) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalDsl.g:3139:5: kw= 'E'
                            {
                            kw=(Token)match(input,70,FOLLOW_61); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:3145:5: kw= 'e'
                            {
                            kw=(Token)match(input,71,FOLLOW_61); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:3151:4: (kw= '-' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==67) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalDsl.g:3152:5: kw= '-'
                            {
                            kw=(Token)match(input,67,FOLLOW_65); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleECharacterObject"
    // InternalDsl.g:3170:1: entryRuleECharacterObject returns [String current=null] : iv_ruleECharacterObject= ruleECharacterObject EOF ;
    public final String entryRuleECharacterObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECharacterObject = null;


        try {
            // InternalDsl.g:3170:56: (iv_ruleECharacterObject= ruleECharacterObject EOF )
            // InternalDsl.g:3171:2: iv_ruleECharacterObject= ruleECharacterObject EOF
            {
             newCompositeNode(grammarAccess.getECharacterObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECharacterObject=ruleECharacterObject();

            state._fsp--;

             current =iv_ruleECharacterObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECharacterObject"


    // $ANTLR start "ruleECharacterObject"
    // InternalDsl.g:3177:1: ruleECharacterObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ECharacterObject' ;
    public final AntlrDatatypeRuleToken ruleECharacterObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:3183:2: (kw= 'ECharacterObject' )
            // InternalDsl.g:3184:2: kw= 'ECharacterObject'
            {
            kw=(Token)match(input,72,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getECharacterObjectAccess().getECharacterObjectKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECharacterObject"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:3192:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:3192:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:3193:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:3199:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3205:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalDsl.g:3206:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalDsl.g:3206:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalDsl.g:3207:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalDsl.g:3207:3: ()
            // InternalDsl.g:3208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalDsl.g:3218:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3219:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3219:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3220:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3241:3: (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==74) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDsl.g:3242:4: otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAllocationContextKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:3250:4: ( ( ruleEString ) )
                    // InternalDsl.g:3251:5: ( ruleEString )
                    {
                    // InternalDsl.g:3251:5: ( ruleEString )
                    // InternalDsl.g:3252:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContainerAccess().getAllocationContextAllocationContextCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3266:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalDsl.g:3267:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:3271:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:3272:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:3272:6: ( ruleEString )
                    	    // InternalDsl.g:3273:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContainerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContainerAccess().getAllocationContextAllocationContextCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3293:3: (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==24) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDsl.g:3294:4: otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getLinksKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:3302:4: ( ( ruleEString ) )
                    // InternalDsl.g:3303:5: ( ruleEString )
                    {
                    // InternalDsl.g:3303:5: ( ruleEString )
                    // InternalDsl.g:3304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3318:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDsl.g:3319:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:3323:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:3324:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:3324:6: ( ruleEString )
                    	    // InternalDsl.g:3325:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContainerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getContainerAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:3353:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:3353:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:3354:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:3360:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3366:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalDsl.g:3367:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalDsl.g:3367:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalDsl.g:3368:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:3372:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3373:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3373:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3374:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDsl.g:3403:3: ( ( ruleEString ) )
            // InternalDsl.g:3404:4: ( ruleEString )
            {
            // InternalDsl.g:3404:4: ( ruleEString )
            // InternalDsl.g:3405:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:3419:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==14) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDsl.g:3420:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDsl.g:3424:4: ( ( ruleEString ) )
            	    // InternalDsl.g:3425:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:3425:5: ( ruleEString )
            	    // InternalDsl.g:3426:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalDsl.g:3453:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalDsl.g:3453:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalDsl.g:3454:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalDsl.g:3460:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_requires_9_0 = null;

        EObject lv_requires_11_0 = null;

        EObject lv_provides_15_0 = null;

        EObject lv_provides_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3466:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalDsl.g:3467:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalDsl.g:3467:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalDsl.g:3468:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalDsl.g:3472:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3473:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3473:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3474:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,77,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatedComponentKeyword_3());
            		
            // InternalDsl.g:3499:3: ( ( ruleEString ) )
            // InternalDsl.g:3500:4: ( ruleEString )
            {
            // InternalDsl.g:3500:4: ( ruleEString )
            // InternalDsl.g:3501:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatedComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:3515:3: (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==74) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDsl.g:3516:4: otherlv_5= 'allocationContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_5_0());
                    			
                    // InternalDsl.g:3520:4: ( ( ruleEString ) )
                    // InternalDsl.g:3521:5: ( ruleEString )
                    {
                    // InternalDsl.g:3521:5: ( ruleEString )
                    // InternalDsl.g:3522:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3537:3: (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==36) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDsl.g:3538:4: otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getRequiresKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_74); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:3546:4: ( (lv_requires_9_0= ruleRequiredRole ) )
                    // InternalDsl.g:3547:5: (lv_requires_9_0= ruleRequiredRole )
                    {
                    // InternalDsl.g:3547:5: (lv_requires_9_0= ruleRequiredRole )
                    // InternalDsl.g:3548:6: lv_requires_9_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiresRequiredRoleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requires_9_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"requires",
                    							lv_requires_9_0,
                    							"kit.mdsd.xtext.dsl.Dsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3565:4: (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalDsl.g:3566:5: otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_74); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:3570:5: ( (lv_requires_11_0= ruleRequiredRole ) )
                    	    // InternalDsl.g:3571:6: (lv_requires_11_0= ruleRequiredRole )
                    	    {
                    	    // InternalDsl.g:3571:6: (lv_requires_11_0= ruleRequiredRole )
                    	    // InternalDsl.g:3572:7: lv_requires_11_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiresRequiredRoleParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requires_11_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requires",
                    	    								lv_requires_11_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_75); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3595:3: (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==26) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDsl.g:3596:4: otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getProvidesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_76); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:3604:4: ( (lv_provides_15_0= ruleProvidedRole ) )
                    // InternalDsl.g:3605:5: (lv_provides_15_0= ruleProvidedRole )
                    {
                    // InternalDsl.g:3605:5: (lv_provides_15_0= ruleProvidedRole )
                    // InternalDsl.g:3606:6: lv_provides_15_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidesProvidedRoleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_provides_15_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"provides",
                    							lv_provides_15_0,
                    							"kit.mdsd.xtext.dsl.Dsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3623:4: (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==14) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalDsl.g:3624:5: otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_76); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:3628:5: ( (lv_provides_17_0= ruleProvidedRole ) )
                    	    // InternalDsl.g:3629:6: (lv_provides_17_0= ruleProvidedRole )
                    	    {
                    	    // InternalDsl.g:3629:6: (lv_provides_17_0= ruleProvidedRole )
                    	    // InternalDsl.g:3630:7: lv_provides_17_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidesProvidedRoleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_provides_17_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"provides",
                    	    								lv_provides_17_0,
                    	    								"kit.mdsd.xtext.dsl.Dsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalDsl.g:3661:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalDsl.g:3661:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalDsl.g:3662:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalDsl.g:3668:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3674:2: ( (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3675:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3675:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3676:3: otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_2());
            		
            // InternalDsl.g:3688:3: ( ( ruleEString ) )
            // InternalDsl.g:3689:4: ( ruleEString )
            {
            // InternalDsl.g:3689:4: ( ruleEString )
            // InternalDsl.g:3690:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRequiredRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_78);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_4());
            		
            // InternalDsl.g:3708:3: ( ( ruleEString ) )
            // InternalDsl.g:3709:4: ( ruleEString )
            {
            // InternalDsl.g:3709:4: ( ruleEString )
            // InternalDsl.g:3710:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleProvidedRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalDsl.g:3732:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalDsl.g:3732:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalDsl.g:3733:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalDsl.g:3739:1: ruleRequiredRole returns [EObject current=null] : ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3745:2: ( ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDsl.g:3746:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDsl.g:3746:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDsl.g:3747:3: () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDsl.g:3747:3: ()
            // InternalDsl.g:3748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1());
            		
            // InternalDsl.g:3758:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3759:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3759:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3760:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3781:3: (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==82) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDsl.g:3782:4: otherlv_4= 'delegationConnector' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequiredRoleAccess().getDelegationConnectorKeyword_4_0());
                    			
                    // InternalDsl.g:3786:4: ( ( ruleEString ) )
                    // InternalDsl.g:3787:5: ( ruleEString )
                    {
                    // InternalDsl.g:3787:5: ( ruleEString )
                    // InternalDsl.g:3788:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequiredRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequiredRoleAccess().getDelegationConnectorDelegationConnectorRequiredCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3803:3: (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==83) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDsl.g:3804:4: otherlv_6= 'assemblyConnector' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequiredRoleAccess().getAssemblyConnectorKeyword_5_0());
                    			
                    // InternalDsl.g:3808:4: ( ( ruleEString ) )
                    // InternalDsl.g:3809:5: ( ruleEString )
                    {
                    // InternalDsl.g:3809:5: ( ruleEString )
                    // InternalDsl.g:3810:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequiredRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequiredRoleAccess().getAssemblyConnectorAssemblyConnectorCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalDsl.g:3833:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalDsl.g:3833:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalDsl.g:3834:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalDsl.g:3840:1: ruleProvidedRole returns [EObject current=null] : ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3846:2: ( ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDsl.g:3847:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDsl.g:3847:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDsl.g:3848:3: () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDsl.g:3848:3: ()
            // InternalDsl.g:3849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1());
            		
            // InternalDsl.g:3859:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3860:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3860:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3861:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"kit.mdsd.xtext.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3882:3: (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDsl.g:3883:4: otherlv_4= 'delegationConnector' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getProvidedRoleAccess().getDelegationConnectorKeyword_4_0());
                    			
                    // InternalDsl.g:3887:4: ( ( ruleEString ) )
                    // InternalDsl.g:3888:5: ( ruleEString )
                    {
                    // InternalDsl.g:3888:5: ( ruleEString )
                    // InternalDsl.g:3889:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvidedRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProvidedRoleAccess().getDelegationConnectorDelegationConnectorProvidedCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3904:3: (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==83) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDsl.g:3905:4: otherlv_6= 'assemblyConnector' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getProvidedRoleAccess().getAssemblyConnectorKeyword_5_0());
                    			
                    // InternalDsl.g:3909:4: ( ( ruleEString ) )
                    // InternalDsl.g:3910:5: ( ruleEString )
                    {
                    // InternalDsl.g:3910:5: ( ruleEString )
                    // InternalDsl.g:3911:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvidedRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProvidedRoleAccess().getAssemblyConnectorAssemblyConnectorCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleDelegationConnectorRequired"
    // InternalDsl.g:3934:1: entryRuleDelegationConnectorRequired returns [EObject current=null] : iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF ;
    public final EObject entryRuleDelegationConnectorRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnectorRequired = null;


        try {
            // InternalDsl.g:3934:68: (iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF )
            // InternalDsl.g:3935:2: iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnectorRequired=ruleDelegationConnectorRequired();

            state._fsp--;

             current =iv_ruleDelegationConnectorRequired; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationConnectorRequired"


    // $ANTLR start "ruleDelegationConnectorRequired"
    // InternalDsl.g:3941:1: ruleDelegationConnectorRequired returns [EObject current=null] : (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDelegationConnectorRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3947:2: ( (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3948:2: (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3948:2: (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3949:3: otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorRequiredAccess().getDelegationConnectorRequiredKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorRequiredAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorRequiredAccess().getLinkedInterfaceKeyword_2());
            		
            // InternalDsl.g:3961:3: ( ( ruleEString ) )
            // InternalDsl.g:3962:4: ( ruleEString )
            {
            // InternalDsl.g:3962:4: ( ruleEString )
            // InternalDsl.g:3963:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRequiredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorRequiredAccess().getLinkedInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_82);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,87,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorRequiredAccess().getLinkedRoleKeyword_4());
            		
            // InternalDsl.g:3981:3: ( ( ruleEString ) )
            // InternalDsl.g:3982:4: ( ruleEString )
            {
            // InternalDsl.g:3982:4: ( ruleEString )
            // InternalDsl.g:3983:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRequiredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorRequiredAccess().getLinkedRoleRequiredRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorRequiredAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationConnectorRequired"


    // $ANTLR start "entryRuleDelegationConnectorProvided"
    // InternalDsl.g:4005:1: entryRuleDelegationConnectorProvided returns [EObject current=null] : iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF ;
    public final EObject entryRuleDelegationConnectorProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnectorProvided = null;


        try {
            // InternalDsl.g:4005:68: (iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF )
            // InternalDsl.g:4006:2: iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorProvidedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnectorProvided=ruleDelegationConnectorProvided();

            state._fsp--;

             current =iv_ruleDelegationConnectorProvided; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationConnectorProvided"


    // $ANTLR start "ruleDelegationConnectorProvided"
    // InternalDsl.g:4012:1: ruleDelegationConnectorProvided returns [EObject current=null] : (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDelegationConnectorProvided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:4018:2: ( (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:4019:2: (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:4019:2: (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:4020:3: otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorProvidedAccess().getDelegationConnectorProvidedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorProvidedAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorProvidedAccess().getLinkedInterfaceKeyword_2());
            		
            // InternalDsl.g:4032:3: ( ( ruleEString ) )
            // InternalDsl.g:4033:4: ( ruleEString )
            {
            // InternalDsl.g:4033:4: ( ruleEString )
            // InternalDsl.g:4034:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorProvidedAccess().getLinkedInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_83);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,89,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorProvidedAccess().getLinkdedRoleKeyword_4());
            		
            // InternalDsl.g:4052:3: ( ( ruleEString ) )
            // InternalDsl.g:4053:4: ( ruleEString )
            {
            // InternalDsl.g:4053:4: ( ruleEString )
            // InternalDsl.g:4054:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorProvidedAccess().getLinkedRoleProvidedRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorProvidedAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationConnectorProvided"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003004008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002004008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003024008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002024008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002020008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00003C0000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000380000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000300000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFEC0000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xFEC0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000028L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000001004008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000001004008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x0000000000080000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}