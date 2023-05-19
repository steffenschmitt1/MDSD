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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentBasedSystem'", "'{'", "'repositories'", "','", "'}'", "'environments'", "'systems'", "'allocationContexts'", "'Repository'", "'components'", "'interfaces'", "'Environment'", "'container'", "'link'", "'System'", "'provides'", "'('", "')'", "'encapsulatedInstances'", "'delegationConnectors'", "'assemblyConnectors'", "'AllocationContext'", "'assemblyContext'", "'Component'", "'requires'", "'description'", "'Interface'", "'signatures'", "'BehaviourDescription'", "'internalActions'", "'externalCalls'", "'loops'", "'branches'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'ComplexType'", "'types'", "'MapType'", "'StringType'", "'BooleanType'", "'IntType'", "'ListType'", "'DateType'", "'LongType'", "'FloatType'", "'CharType'", "'VoidType'", "'-'", "'EDate'", "'.'", "'E'", "'e'", "'ECharacterObject'", "'Container'", "'allocationContext'", "'links'", "'Link'", "'containers'", "'AssemblyContext'", "'instantiatedComponent'", "'AssemblyConnector'", "'requiredRole'", "'providedRole'", "'RequiredRole'", "'delegationConnector'", "'assemblyConnector'", "'ProvidedRole'", "'DelegationConnectorRequired'", "'linkedInterface'", "'linkedRole'", "'DelegationConnectorProvided'", "'linkdedRole'"
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
            case 53:
                {
                alt10=1;
                }
                break;
            case 55:
                {
                alt10=2;
                }
                break;
            case 56:
                {
                alt10=3;
                }
                break;
            case 52:
            case 57:
                {
                alt10=4;
                }
                break;
            case 58:
                {
                alt10=5;
                }
                break;
            case 59:
                {
                alt10=6;
                }
                break;
            case 60:
                {
                alt10=7;
                }
                break;
            case 61:
                {
                alt10=8;
                }
                break;
            case 62:
                {
                alt10=9;
                }
                break;
            case 63:
                {
                alt10=10;
                }
                break;
            case 64:
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
            case 53:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            case 52:
            case 57:
                {
                alt11=4;
                }
                break;
            case 58:
                {
                alt11=5;
                }
                break;
            case 59:
                {
                alt11=6;
                }
                break;
            case 60:
                {
                alt11=7;
                }
                break;
            case 61:
                {
                alt11=8;
                }
                break;
            case 62:
                {
                alt11=9;
                }
                break;
            case 63:
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
    // InternalDsl.g:602:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
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
        EObject lv_components_5_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_interfaces_11_0 = null;

        EObject lv_interfaces_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:608:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:609:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:609:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:610:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:610:3: ()
            // InternalDsl.g:611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:625:3: (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:626:4: otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getComponentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:634:4: ( (lv_components_5_0= ruleComponent ) )
                    // InternalDsl.g:635:5: (lv_components_5_0= ruleComponent )
                    {
                    // InternalDsl.g:635:5: (lv_components_5_0= ruleComponent )
                    // InternalDsl.g:636:6: lv_components_5_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_5_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_5_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:653:4: (otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:654:5: otherlv_6= ',' ( (lv_components_7_0= ruleComponent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:658:5: ( (lv_components_7_0= ruleComponent ) )
                    	    // InternalDsl.g:659:6: (lv_components_7_0= ruleComponent )
                    	    {
                    	    // InternalDsl.g:659:6: (lv_components_7_0= ruleComponent )
                    	    // InternalDsl.g:660:7: lv_components_7_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_7_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:683:3: (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:684:4: otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getInterfacesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:692:4: ( (lv_interfaces_11_0= ruleInterface ) )
                    // InternalDsl.g:693:5: (lv_interfaces_11_0= ruleInterface )
                    {
                    // InternalDsl.g:693:5: (lv_interfaces_11_0= ruleInterface )
                    // InternalDsl.g:694:6: lv_interfaces_11_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interfaces_11_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_11_0,
                    							"kit.mdsd.xtext.dsl.Dsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:711:4: (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDsl.g:712:5: otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:716:5: ( (lv_interfaces_13_0= ruleInterface ) )
                    	    // InternalDsl.g:717:6: (lv_interfaces_13_0= ruleInterface )
                    	    {
                    	    // InternalDsl.g:717:6: (lv_interfaces_13_0= ruleInterface )
                    	    // InternalDsl.g:718:7: lv_interfaces_13_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interfaces_13_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_13_0,
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

                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:749:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalDsl.g:749:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalDsl.g:750:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalDsl.g:756:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalDsl.g:762:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:763:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:763:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:764:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:764:3: ()
            // InternalDsl.g:765:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:779:3: (otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:780:4: otherlv_3= 'container' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainerKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:788:4: ( (lv_containers_5_0= ruleContainer ) )
                    // InternalDsl.g:789:5: (lv_containers_5_0= ruleContainer )
                    {
                    // InternalDsl.g:789:5: (lv_containers_5_0= ruleContainer )
                    // InternalDsl.g:790:6: lv_containers_5_0= ruleContainer
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

                    // InternalDsl.g:807:4: (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDsl.g:808:5: otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:812:5: ( (lv_containers_7_0= ruleContainer ) )
                    	    // InternalDsl.g:813:6: (lv_containers_7_0= ruleContainer )
                    	    {
                    	    // InternalDsl.g:813:6: (lv_containers_7_0= ruleContainer )
                    	    // InternalDsl.g:814:7: lv_containers_7_0= ruleContainer
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

                    otherlv_8=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:837:3: (otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:838:4: otherlv_9= 'link' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinkKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:846:4: ( (lv_links_11_0= ruleLink ) )
                    // InternalDsl.g:847:5: (lv_links_11_0= ruleLink )
                    {
                    // InternalDsl.g:847:5: (lv_links_11_0= ruleLink )
                    // InternalDsl.g:848:6: lv_links_11_0= ruleLink
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

                    // InternalDsl.g:865:4: (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDsl.g:866:5: otherlv_12= ',' ( (lv_links_13_0= ruleLink ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:870:5: ( (lv_links_13_0= ruleLink ) )
                    	    // InternalDsl.g:871:6: (lv_links_13_0= ruleLink )
                    	    {
                    	    // InternalDsl.g:871:6: (lv_links_13_0= ruleLink )
                    	    // InternalDsl.g:872:7: lv_links_13_0= ruleLink
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
    // InternalDsl.g:903:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDsl.g:903:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDsl.g:904:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalDsl.g:910:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
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
            // InternalDsl.g:916:2: ( (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalDsl.g:917:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalDsl.g:917:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalDsl.g:918:3: otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'provides' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'encapsulatedInstances' otherlv_9= '{' ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) ) (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )* otherlv_13= '}' (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )? (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getProvidesKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:934:3: ( ( ruleEString ) )
            // InternalDsl.g:935:4: ( ruleEString )
            {
            // InternalDsl.g:935:4: ( ruleEString )
            // InternalDsl.g:936:5: ruleEString
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

            // InternalDsl.g:950:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:951:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_24); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:955:4: ( ( ruleEString ) )
            	    // InternalDsl.g:956:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:956:5: ( ruleEString )
            	    // InternalDsl.g:957:6: ruleEString
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
            		
            // InternalDsl.g:984:3: ( (lv_encapsulatedInstances_10_0= ruleAssemblyContext ) )
            // InternalDsl.g:985:4: (lv_encapsulatedInstances_10_0= ruleAssemblyContext )
            {
            // InternalDsl.g:985:4: (lv_encapsulatedInstances_10_0= ruleAssemblyContext )
            // InternalDsl.g:986:5: lv_encapsulatedInstances_10_0= ruleAssemblyContext
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

            // InternalDsl.g:1003:3: (otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1004:4: otherlv_11= ',' ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDsl.g:1008:4: ( (lv_encapsulatedInstances_12_0= ruleAssemblyContext ) )
            	    // InternalDsl.g:1009:5: (lv_encapsulatedInstances_12_0= ruleAssemblyContext )
            	    {
            	    // InternalDsl.g:1009:5: (lv_encapsulatedInstances_12_0= ruleAssemblyContext )
            	    // InternalDsl.g:1010:6: lv_encapsulatedInstances_12_0= ruleAssemblyContext
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
            		
            // InternalDsl.g:1032:3: (otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1033:4: otherlv_14= 'delegationConnectors' otherlv_15= '{' ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) ) (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getDelegationConnectorsKeyword_12_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalDsl.g:1041:4: ( (lv_delegationConnectors_16_0= ruleDelegationConnector ) )
                    // InternalDsl.g:1042:5: (lv_delegationConnectors_16_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:1042:5: (lv_delegationConnectors_16_0= ruleDelegationConnector )
                    // InternalDsl.g:1043:6: lv_delegationConnectors_16_0= ruleDelegationConnector
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

                    // InternalDsl.g:1060:4: (otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDsl.g:1061:5: otherlv_17= ',' ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalDsl.g:1065:5: ( (lv_delegationConnectors_18_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:1066:6: (lv_delegationConnectors_18_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:1066:6: (lv_delegationConnectors_18_0= ruleDelegationConnector )
                    	    // InternalDsl.g:1067:7: lv_delegationConnectors_18_0= ruleDelegationConnector
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

            // InternalDsl.g:1090:3: (otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1091:4: otherlv_20= 'assemblyConnectors' otherlv_21= '{' ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) ) (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getAssemblyConnectorsKeyword_13_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalDsl.g:1099:4: ( (lv_assemblyConnectors_22_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:1100:5: (lv_assemblyConnectors_22_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:1100:5: (lv_assemblyConnectors_22_0= ruleAssemblyConnector )
                    // InternalDsl.g:1101:6: lv_assemblyConnectors_22_0= ruleAssemblyConnector
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

                    // InternalDsl.g:1118:4: (otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDsl.g:1119:5: otherlv_23= ',' ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getSystemAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalDsl.g:1123:5: ( (lv_assemblyConnectors_24_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:1124:6: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:1124:6: (lv_assemblyConnectors_24_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:1125:7: lv_assemblyConnectors_24_0= ruleAssemblyConnector
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
    // InternalDsl.g:1156:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalDsl.g:1156:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalDsl.g:1157:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalDsl.g:1163:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalDsl.g:1169:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalDsl.g:1170:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:1170:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalDsl.g:1171:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'assemblyContext' ( ( ruleEString ) ) otherlv_5= 'container' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalDsl.g:1175:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1176:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1176:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1177:5: lv_name_1_0= ruleEString
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
            		
            otherlv_3=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAssemblyContextKeyword_3());
            		
            // InternalDsl.g:1202:3: ( ( ruleEString ) )
            // InternalDsl.g:1203:4: ( ruleEString )
            {
            // InternalDsl.g:1203:4: ( ruleEString )
            // InternalDsl.g:1204:5: ruleEString
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

            otherlv_5=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getContainerKeyword_5());
            		
            // InternalDsl.g:1222:3: ( ( ruleEString ) )
            // InternalDsl.g:1223:4: ( ruleEString )
            {
            // InternalDsl.g:1223:4: ( ruleEString )
            // InternalDsl.g:1224:5: ruleEString
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
    // InternalDsl.g:1246:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:1246:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:1247:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalDsl.g:1253:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) ;
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



        	enterRule();

        try {
            // InternalDsl.g:1259:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' ) )
            // InternalDsl.g:1260:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' )
            {
            // InternalDsl.g:1260:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}' )
            // InternalDsl.g:1261:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )? otherlv_18= '}'
            {
            // InternalDsl.g:1261:3: ()
            // InternalDsl.g:1262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalDsl.g:1272:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1273:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1273:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1274:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_2_0());
            				
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

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1295:3: (otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1296:4: otherlv_4= 'requires' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRequiresKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:1304:4: ( ( ruleEString ) )
                    // InternalDsl.g:1305:5: ( ruleEString )
                    {
                    // InternalDsl.g:1305:5: ( ruleEString )
                    // InternalDsl.g:1306:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiresInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1320:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDsl.g:1321:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1325:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:1326:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:1326:6: ( ruleEString )
                    	    // InternalDsl.g:1327:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiresInterfaceCrossReference_4_3_1_0());
                    	    						
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

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1347:3: (otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1348:4: otherlv_10= 'provides' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getProvidesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:1356:4: ( ( ruleEString ) )
                    // InternalDsl.g:1357:5: ( ruleEString )
                    {
                    // InternalDsl.g:1357:5: ( ruleEString )
                    // InternalDsl.g:1358:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getProvidesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1372:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDsl.g:1373:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1377:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:1378:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:1378:6: ( ruleEString )
                    	    // InternalDsl.g:1379:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getProvidesInterfaceCrossReference_5_3_1_0());
                    	    						
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

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1399:3: (otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1400:4: otherlv_16= 'description' ( (lv_description_17_0= ruleBehaviourDescription ) )
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalDsl.g:1404:4: ( (lv_description_17_0= ruleBehaviourDescription ) )
                    // InternalDsl.g:1405:5: (lv_description_17_0= ruleBehaviourDescription )
                    {
                    // InternalDsl.g:1405:5: (lv_description_17_0= ruleBehaviourDescription )
                    // InternalDsl.g:1406:6: lv_description_17_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getDescriptionBehaviourDescriptionParserRuleCall_6_1_0());
                    					
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

            			newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleInterface"
    // InternalDsl.g:1432:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDsl.g:1432:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDsl.g:1433:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalDsl.g:1439:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalDsl.g:1445:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:1446:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:1446:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:1447:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:1447:3: ()
            // InternalDsl.g:1448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalDsl.g:1458:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1459:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1459:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1460:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1481:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1482:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1490:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalDsl.g:1491:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalDsl.g:1491:5: (lv_signatures_6_0= ruleSignature )
                    // InternalDsl.g:1492:6: lv_signatures_6_0= ruleSignature
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

                    // InternalDsl.g:1509:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDsl.g:1510:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1514:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalDsl.g:1515:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalDsl.g:1515:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalDsl.g:1516:7: lv_signatures_8_0= ruleSignature
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
                    	    break loop31;
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
    // InternalDsl.g:1547:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1547:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1548:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:1554:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1560:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1561:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1561:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1562:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1570:3: this_ID_1= RULE_ID
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
    // InternalDsl.g:1581:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalDsl.g:1581:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalDsl.g:1582:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
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
    // InternalDsl.g:1588:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // InternalDsl.g:1594:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalDsl.g:1595:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalDsl.g:1595:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalDsl.g:1596:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )? (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )? (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )? (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalDsl.g:1596:3: ()
            // InternalDsl.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1611:3: (otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1612:4: otherlv_3= 'internalActions' otherlv_4= '{' ( (lv_internalActions_5_0= ruleInternalAction ) ) (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getInternalActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:1620:4: ( (lv_internalActions_5_0= ruleInternalAction ) )
                    // InternalDsl.g:1621:5: (lv_internalActions_5_0= ruleInternalAction )
                    {
                    // InternalDsl.g:1621:5: (lv_internalActions_5_0= ruleInternalAction )
                    // InternalDsl.g:1622:6: lv_internalActions_5_0= ruleInternalAction
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

                    // InternalDsl.g:1639:4: (otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDsl.g:1640:5: otherlv_6= ',' ( (lv_internalActions_7_0= ruleInternalAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:1644:5: ( (lv_internalActions_7_0= ruleInternalAction ) )
                    	    // InternalDsl.g:1645:6: (lv_internalActions_7_0= ruleInternalAction )
                    	    {
                    	    // InternalDsl.g:1645:6: (lv_internalActions_7_0= ruleInternalAction )
                    	    // InternalDsl.g:1646:7: lv_internalActions_7_0= ruleInternalAction
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1669:3: (otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1670:4: otherlv_9= 'externalCalls' otherlv_10= '{' ( (lv_externalCalls_11_0= ruleExternalCall ) ) (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getExternalCallsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1678:4: ( (lv_externalCalls_11_0= ruleExternalCall ) )
                    // InternalDsl.g:1679:5: (lv_externalCalls_11_0= ruleExternalCall )
                    {
                    // InternalDsl.g:1679:5: (lv_externalCalls_11_0= ruleExternalCall )
                    // InternalDsl.g:1680:6: lv_externalCalls_11_0= ruleExternalCall
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

                    // InternalDsl.g:1697:4: (otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDsl.g:1698:5: otherlv_12= ',' ( (lv_externalCalls_13_0= ruleExternalCall ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1702:5: ( (lv_externalCalls_13_0= ruleExternalCall ) )
                    	    // InternalDsl.g:1703:6: (lv_externalCalls_13_0= ruleExternalCall )
                    	    {
                    	    // InternalDsl.g:1703:6: (lv_externalCalls_13_0= ruleExternalCall )
                    	    // InternalDsl.g:1704:7: lv_externalCalls_13_0= ruleExternalCall
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1727:3: (otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1728:4: otherlv_15= 'loops' otherlv_16= '{' ( (lv_loops_17_0= ruleLoop ) ) (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviourDescriptionAccess().getLoopsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1736:4: ( (lv_loops_17_0= ruleLoop ) )
                    // InternalDsl.g:1737:5: (lv_loops_17_0= ruleLoop )
                    {
                    // InternalDsl.g:1737:5: (lv_loops_17_0= ruleLoop )
                    // InternalDsl.g:1738:6: lv_loops_17_0= ruleLoop
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

                    // InternalDsl.g:1755:4: (otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDsl.g:1756:5: otherlv_18= ',' ( (lv_loops_19_0= ruleLoop ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1760:5: ( (lv_loops_19_0= ruleLoop ) )
                    	    // InternalDsl.g:1761:6: (lv_loops_19_0= ruleLoop )
                    	    {
                    	    // InternalDsl.g:1761:6: (lv_loops_19_0= ruleLoop )
                    	    // InternalDsl.g:1762:7: lv_loops_19_0= ruleLoop
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1785:3: (otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1786:4: otherlv_21= 'branches' otherlv_22= '{' ( (lv_branches_23_0= ruleBranch ) ) (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourDescriptionAccess().getBranchesKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_22, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:1794:4: ( (lv_branches_23_0= ruleBranch ) )
                    // InternalDsl.g:1795:5: (lv_branches_23_0= ruleBranch )
                    {
                    // InternalDsl.g:1795:5: (lv_branches_23_0= ruleBranch )
                    // InternalDsl.g:1796:6: lv_branches_23_0= ruleBranch
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

                    // InternalDsl.g:1813:4: (otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalDsl.g:1814:5: otherlv_24= ',' ( (lv_branches_25_0= ruleBranch ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:1818:5: ( (lv_branches_25_0= ruleBranch ) )
                    	    // InternalDsl.g:1819:6: (lv_branches_25_0= ruleBranch )
                    	    {
                    	    // InternalDsl.g:1819:6: (lv_branches_25_0= ruleBranch )
                    	    // InternalDsl.g:1820:7: lv_branches_25_0= ruleBranch
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
                    	    break loop40;
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
    // InternalDsl.g:1851:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalDsl.g:1851:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalDsl.g:1852:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalDsl.g:1858:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1864:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalDsl.g:1865:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalDsl.g:1865:2: ( () otherlv_1= 'InternalAction' )
            // InternalDsl.g:1866:3: () otherlv_1= 'InternalAction'
            {
            // InternalDsl.g:1866:3: ()
            // InternalDsl.g:1867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

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
    // InternalDsl.g:1881:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDsl.g:1881:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDsl.g:1882:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalDsl.g:1888:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1894:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalDsl.g:1895:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalDsl.g:1895:2: ( () otherlv_1= 'ExternalCall' )
            // InternalDsl.g:1896:3: () otherlv_1= 'ExternalCall'
            {
            // InternalDsl.g:1896:3: ()
            // InternalDsl.g:1897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalDsl.g:1911:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalDsl.g:1911:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalDsl.g:1912:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalDsl.g:1918:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1924:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalDsl.g:1925:2: ( () otherlv_1= 'Loop' )
            {
            // InternalDsl.g:1925:2: ( () otherlv_1= 'Loop' )
            // InternalDsl.g:1926:3: () otherlv_1= 'Loop'
            {
            // InternalDsl.g:1926:3: ()
            // InternalDsl.g:1927:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalDsl.g:1941:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalDsl.g:1941:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalDsl.g:1942:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalDsl.g:1948:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1954:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalDsl.g:1955:2: ( () otherlv_1= 'Branch' )
            {
            // InternalDsl.g:1955:2: ( () otherlv_1= 'Branch' )
            // InternalDsl.g:1956:3: () otherlv_1= 'Branch'
            {
            // InternalDsl.g:1956:3: ()
            // InternalDsl.g:1957:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalDsl.g:1971:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalDsl.g:1971:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalDsl.g:1972:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalDsl.g:1978:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalDsl.g:1984:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:1985:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1985:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:1986:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalDsl.g:1990:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1991:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1991:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1992:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnTypeKeyword_3());
            		
            // InternalDsl.g:2017:3: ( (lv_returnType_4_0= ruleType ) )
            // InternalDsl.g:2018:4: (lv_returnType_4_0= ruleType )
            {
            // InternalDsl.g:2018:4: (lv_returnType_4_0= ruleType )
            // InternalDsl.g:2019:5: lv_returnType_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalDsl.g:2036:3: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2037:4: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2045:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalDsl.g:2046:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalDsl.g:2046:5: (lv_parameters_7_0= ruleParameter )
                    // InternalDsl.g:2047:6: lv_parameters_7_0= ruleParameter
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

                    // InternalDsl.g:2064:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalDsl.g:2065:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2069:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalDsl.g:2070:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalDsl.g:2070:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalDsl.g:2071:7: lv_parameters_9_0= ruleParameter
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
                    	    break loop42;
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
    // InternalDsl.g:2102:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:2102:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:2103:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDsl.g:2109:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) ;
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
            // InternalDsl.g:2115:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) )
            // InternalDsl.g:2116:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:2116:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            // InternalDsl.g:2117:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalDsl.g:2121:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2122:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2122:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2123:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalDsl.g:2148:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalDsl.g:2149:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalDsl.g:2149:4: (lv_type_4_0= ruleParameterType )
            // InternalDsl.g:2150:5: lv_type_4_0= ruleParameterType
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
    // InternalDsl.g:2175:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalDsl.g:2175:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalDsl.g:2176:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalDsl.g:2182:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalDsl.g:2188:2: ( (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalDsl.g:2189:2: (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalDsl.g:2189:2: (otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalDsl.g:2190:3: otherlv_0= 'ComplexType' otherlv_1= '{' otherlv_2= 'types' otherlv_3= '{' ( (lv_types_4_0= ruleParameterType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getTypesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2206:3: ( (lv_types_4_0= ruleParameterType ) )
            // InternalDsl.g:2207:4: (lv_types_4_0= ruleParameterType )
            {
            // InternalDsl.g:2207:4: (lv_types_4_0= ruleParameterType )
            // InternalDsl.g:2208:5: lv_types_4_0= ruleParameterType
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

            // InternalDsl.g:2225:3: (otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==14) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDsl.g:2226:4: otherlv_5= ',' ( (lv_types_6_0= ruleParameterType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_53); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:2230:4: ( (lv_types_6_0= ruleParameterType ) )
            	    // InternalDsl.g:2231:5: (lv_types_6_0= ruleParameterType )
            	    {
            	    // InternalDsl.g:2231:5: (lv_types_6_0= ruleParameterType )
            	    // InternalDsl.g:2232:6: lv_types_6_0= ruleParameterType
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
            	    break loop44;
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
    // InternalDsl.g:2262:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalDsl.g:2262:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalDsl.g:2263:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalDsl.g:2269:1: ruleMapType returns [EObject current=null] : ( () otherlv_1= 'MapType' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2275:2: ( ( () otherlv_1= 'MapType' ) )
            // InternalDsl.g:2276:2: ( () otherlv_1= 'MapType' )
            {
            // InternalDsl.g:2276:2: ( () otherlv_1= 'MapType' )
            // InternalDsl.g:2277:3: () otherlv_1= 'MapType'
            {
            // InternalDsl.g:2277:3: ()
            // InternalDsl.g:2278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapTypeAccess().getMapTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalDsl.g:2292:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalDsl.g:2292:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalDsl.g:2293:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalDsl.g:2299:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2305:2: ( ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:2306:2: ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:2306:2: ( () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalDsl.g:2307:3: () otherlv_1= 'StringType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:2307:3: ()
            // InternalDsl.g:2308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2322:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2323:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2327:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalDsl.g:2328:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalDsl.g:2328:5: (lv_type_4_0= ruleEString )
                    // InternalDsl.g:2329:6: lv_type_4_0= ruleEString
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
    // InternalDsl.g:2355:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalDsl.g:2355:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalDsl.g:2356:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalDsl.g:2362:1: ruleBooleanType returns [EObject current=null] : ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2368:2: ( ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' ) )
            // InternalDsl.g:2369:2: ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' )
            {
            // InternalDsl.g:2369:2: ( () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType' )
            // InternalDsl.g:2370:3: () ( (lv_type_1_0= 'type' ) )? otherlv_2= 'BooleanType'
            {
            // InternalDsl.g:2370:3: ()
            // InternalDsl.g:2371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2377:3: ( (lv_type_1_0= 'type' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2378:4: (lv_type_1_0= 'type' )
                    {
                    // InternalDsl.g:2378:4: (lv_type_1_0= 'type' )
                    // InternalDsl.g:2379:5: lv_type_1_0= 'type'
                    {
                    lv_type_1_0=(Token)match(input,52,FOLLOW_56); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getBooleanTypeAccess().getTypeTypeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_1_0 != null, "type");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_2); 

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
    // InternalDsl.g:2399:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalDsl.g:2399:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalDsl.g:2400:2: iv_ruleIntType= ruleIntType EOF
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
    // InternalDsl.g:2406:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2412:2: ( ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:2413:2: ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:2413:2: ( () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}' )
            // InternalDsl.g:2414:3: () otherlv_1= 'IntType' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:2414:3: ()
            // InternalDsl.g:2415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getIntTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2429:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2430:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntTypeAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2434:4: ( (lv_type_4_0= ruleEIntegerObject ) )
                    // InternalDsl.g:2435:5: (lv_type_4_0= ruleEIntegerObject )
                    {
                    // InternalDsl.g:2435:5: (lv_type_4_0= ruleEIntegerObject )
                    // InternalDsl.g:2436:6: lv_type_4_0= ruleEIntegerObject
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
    // InternalDsl.g:2462:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalDsl.g:2462:49: (iv_ruleListType= ruleListType EOF )
            // InternalDsl.g:2463:2: iv_ruleListType= ruleListType EOF
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
    // InternalDsl.g:2469:1: ruleListType returns [EObject current=null] : ( () otherlv_1= 'ListType' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2475:2: ( ( () otherlv_1= 'ListType' ) )
            // InternalDsl.g:2476:2: ( () otherlv_1= 'ListType' )
            {
            // InternalDsl.g:2476:2: ( () otherlv_1= 'ListType' )
            // InternalDsl.g:2477:3: () otherlv_1= 'ListType'
            {
            // InternalDsl.g:2477:3: ()
            // InternalDsl.g:2478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListTypeAccess().getListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalDsl.g:2492:1: entryRuleDateType returns [EObject current=null] : iv_ruleDateType= ruleDateType EOF ;
    public final EObject entryRuleDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateType = null;


        try {
            // InternalDsl.g:2492:49: (iv_ruleDateType= ruleDateType EOF )
            // InternalDsl.g:2493:2: iv_ruleDateType= ruleDateType EOF
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
    // InternalDsl.g:2499:1: ruleDateType returns [EObject current=null] : (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' ) ;
    public final EObject ruleDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2505:2: ( (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2506:2: (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2506:2: (otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}' )
            // InternalDsl.g:2507:3: otherlv_0= 'DateType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEDate ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateTypeAccess().getDateTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getDateTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getDateTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2519:3: ( (lv_type_3_0= ruleEDate ) )
            // InternalDsl.g:2520:4: (lv_type_3_0= ruleEDate )
            {
            // InternalDsl.g:2520:4: (lv_type_3_0= ruleEDate )
            // InternalDsl.g:2521:5: lv_type_3_0= ruleEDate
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
    // InternalDsl.g:2546:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // InternalDsl.g:2546:49: (iv_ruleLongType= ruleLongType EOF )
            // InternalDsl.g:2547:2: iv_ruleLongType= ruleLongType EOF
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
    // InternalDsl.g:2553:1: ruleLongType returns [EObject current=null] : (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2559:2: ( (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2560:2: (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2560:2: (otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2561:3: otherlv_0= 'LongType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleELongObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLongTypeAccess().getLongTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getLongTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getLongTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2573:3: ( (lv_type_3_0= ruleELongObject ) )
            // InternalDsl.g:2574:4: (lv_type_3_0= ruleELongObject )
            {
            // InternalDsl.g:2574:4: (lv_type_3_0= ruleELongObject )
            // InternalDsl.g:2575:5: lv_type_3_0= ruleELongObject
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
    // InternalDsl.g:2600:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalDsl.g:2600:50: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalDsl.g:2601:2: iv_ruleFloatType= ruleFloatType EOF
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
    // InternalDsl.g:2607:1: ruleFloatType returns [EObject current=null] : (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2613:2: ( (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2614:2: (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2614:2: (otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2615:3: otherlv_0= 'FloatType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEFloatObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatTypeAccess().getFloatTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2627:3: ( (lv_type_3_0= ruleEFloatObject ) )
            // InternalDsl.g:2628:4: (lv_type_3_0= ruleEFloatObject )
            {
            // InternalDsl.g:2628:4: (lv_type_3_0= ruleEFloatObject )
            // InternalDsl.g:2629:5: lv_type_3_0= ruleEFloatObject
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
    // InternalDsl.g:2654:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // InternalDsl.g:2654:49: (iv_ruleCharType= ruleCharType EOF )
            // InternalDsl.g:2655:2: iv_ruleCharType= ruleCharType EOF
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
    // InternalDsl.g:2661:1: ruleCharType returns [EObject current=null] : (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2667:2: ( (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' ) )
            // InternalDsl.g:2668:2: (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:2668:2: (otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}' )
            // InternalDsl.g:2669:3: otherlv_0= 'CharType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleECharacterObject ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCharTypeAccess().getCharTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getCharTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getCharTypeAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:2681:3: ( (lv_type_3_0= ruleECharacterObject ) )
            // InternalDsl.g:2682:4: (lv_type_3_0= ruleECharacterObject )
            {
            // InternalDsl.g:2682:4: (lv_type_3_0= ruleECharacterObject )
            // InternalDsl.g:2683:5: lv_type_3_0= ruleECharacterObject
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
    // InternalDsl.g:2708:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalDsl.g:2708:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalDsl.g:2709:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalDsl.g:2715:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'VoidType' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2721:2: ( ( () otherlv_1= 'VoidType' ) )
            // InternalDsl.g:2722:2: ( () otherlv_1= 'VoidType' )
            {
            // InternalDsl.g:2722:2: ( () otherlv_1= 'VoidType' )
            // InternalDsl.g:2723:3: () otherlv_1= 'VoidType'
            {
            // InternalDsl.g:2723:3: ()
            // InternalDsl.g:2724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalDsl.g:2738:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalDsl.g:2738:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalDsl.g:2739:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalDsl.g:2745:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2751:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:2752:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:2752:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:2753:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:2753:3: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2754:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_61); 

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
    // InternalDsl.g:2771:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalDsl.g:2771:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalDsl.g:2772:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalDsl.g:2778:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:2784:2: (kw= 'EDate' )
            // InternalDsl.g:2785:2: kw= 'EDate'
            {
            kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalDsl.g:2793:1: entryRuleELongObject returns [String current=null] : iv_ruleELongObject= ruleELongObject EOF ;
    public final String entryRuleELongObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELongObject = null;


        try {
            // InternalDsl.g:2793:51: (iv_ruleELongObject= ruleELongObject EOF )
            // InternalDsl.g:2794:2: iv_ruleELongObject= ruleELongObject EOF
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
    // InternalDsl.g:2800:1: ruleELongObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELongObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2806:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:2807:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:2807:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:2808:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:2808:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2809:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_61); 

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
    // InternalDsl.g:2826:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // InternalDsl.g:2826:52: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // InternalDsl.g:2827:2: iv_ruleEFloatObject= ruleEFloatObject EOF
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
    // InternalDsl.g:2833:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2839:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:2840:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:2840:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:2841:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:2841:3: (kw= '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2842:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_62); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2848:3: (this_INT_1= RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2849:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_63); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,67,FOLLOW_61); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_64); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:2869:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=68 && LA54_0<=69)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:2870:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:2870:4: (kw= 'E' | kw= 'e' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==68) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==69) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalDsl.g:2871:5: kw= 'E'
                            {
                            kw=(Token)match(input,68,FOLLOW_57); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:2877:5: kw= 'e'
                            {
                            kw=(Token)match(input,69,FOLLOW_57); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:2883:4: (kw= '-' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==65) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalDsl.g:2884:5: kw= '-'
                            {
                            kw=(Token)match(input,65,FOLLOW_61); 

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
    // InternalDsl.g:2902:1: entryRuleECharacterObject returns [String current=null] : iv_ruleECharacterObject= ruleECharacterObject EOF ;
    public final String entryRuleECharacterObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECharacterObject = null;


        try {
            // InternalDsl.g:2902:56: (iv_ruleECharacterObject= ruleECharacterObject EOF )
            // InternalDsl.g:2903:2: iv_ruleECharacterObject= ruleECharacterObject EOF
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
    // InternalDsl.g:2909:1: ruleECharacterObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ECharacterObject' ;
    public final AntlrDatatypeRuleToken ruleECharacterObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:2915:2: (kw= 'ECharacterObject' )
            // InternalDsl.g:2916:2: kw= 'ECharacterObject'
            {
            kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalDsl.g:2924:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:2924:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:2925:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalDsl.g:2931:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
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
            // InternalDsl.g:2937:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalDsl.g:2938:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalDsl.g:2938:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalDsl.g:2939:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalDsl.g:2939:3: ()
            // InternalDsl.g:2940:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalDsl.g:2950:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:2951:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:2951:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:2952:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2973:3: (otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==72) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDsl.g:2974:4: otherlv_4= 'allocationContext' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,72,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAllocationContextKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:2982:4: ( ( ruleEString ) )
                    // InternalDsl.g:2983:5: ( ruleEString )
                    {
                    // InternalDsl.g:2983:5: ( ruleEString )
                    // InternalDsl.g:2984:6: ruleEString
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

                    // InternalDsl.g:2998:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalDsl.g:2999:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:3003:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:3004:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:3004:6: ( ruleEString )
                    	    // InternalDsl.g:3005:7: ruleEString
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_66); 

                    				newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3025:3: (otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==73) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDsl.g:3026:4: otherlv_10= 'links' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getLinksKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:3034:4: ( ( ruleEString ) )
                    // InternalDsl.g:3035:5: ( ruleEString )
                    {
                    // InternalDsl.g:3035:5: ( ruleEString )
                    // InternalDsl.g:3036:6: ruleEString
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

                    // InternalDsl.g:3050:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalDsl.g:3051:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:3055:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:3056:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:3056:6: ( ruleEString )
                    	    // InternalDsl.g:3057:7: ruleEString
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
                    	    break loop57;
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
    // InternalDsl.g:3085:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:3085:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:3086:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:3092:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalDsl.g:3098:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalDsl.g:3099:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalDsl.g:3099:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalDsl.g:3100:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:3104:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3105:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3105:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3106:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDsl.g:3135:3: ( ( ruleEString ) )
            // InternalDsl.g:3136:4: ( ruleEString )
            {
            // InternalDsl.g:3136:4: ( ruleEString )
            // InternalDsl.g:3137:5: ruleEString
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

            // InternalDsl.g:3151:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==14) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDsl.g:3152:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_24); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDsl.g:3156:4: ( ( ruleEString ) )
            	    // InternalDsl.g:3157:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:3157:5: ( ruleEString )
            	    // InternalDsl.g:3158:6: ruleEString
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
            	    break loop59;
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
    // InternalDsl.g:3185:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalDsl.g:3185:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalDsl.g:3186:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalDsl.g:3192:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
            // InternalDsl.g:3198:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalDsl.g:3199:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalDsl.g:3199:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalDsl.g:3200:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalDsl.g:3204:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3205:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3205:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3206:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,77,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatedComponentKeyword_3());
            		
            // InternalDsl.g:3231:3: ( ( ruleEString ) )
            // InternalDsl.g:3232:4: ( ruleEString )
            {
            // InternalDsl.g:3232:4: ( ruleEString )
            // InternalDsl.g:3233:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatedComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:3247:3: (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==72) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDsl.g:3248:4: otherlv_5= 'allocationContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_5_0());
                    			
                    // InternalDsl.g:3252:4: ( ( ruleEString ) )
                    // InternalDsl.g:3253:5: ( ruleEString )
                    {
                    // InternalDsl.g:3253:5: ( ruleEString )
                    // InternalDsl.g:3254:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3269:3: (otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDsl.g:3270:4: otherlv_7= 'requires' otherlv_8= '{' ( (lv_requires_9_0= ruleRequiredRole ) ) (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getRequiresKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_71); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:3278:4: ( (lv_requires_9_0= ruleRequiredRole ) )
                    // InternalDsl.g:3279:5: (lv_requires_9_0= ruleRequiredRole )
                    {
                    // InternalDsl.g:3279:5: (lv_requires_9_0= ruleRequiredRole )
                    // InternalDsl.g:3280:6: lv_requires_9_0= ruleRequiredRole
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

                    // InternalDsl.g:3297:4: (otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDsl.g:3298:5: otherlv_10= ',' ( (lv_requires_11_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_71); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:3302:5: ( (lv_requires_11_0= ruleRequiredRole ) )
                    	    // InternalDsl.g:3303:6: (lv_requires_11_0= ruleRequiredRole )
                    	    {
                    	    // InternalDsl.g:3303:6: (lv_requires_11_0= ruleRequiredRole )
                    	    // InternalDsl.g:3304:7: lv_requires_11_0= ruleRequiredRole
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_72); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3327:3: (otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==26) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDsl.g:3328:4: otherlv_13= 'provides' otherlv_14= '{' ( (lv_provides_15_0= ruleProvidedRole ) ) (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getProvidesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_73); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:3336:4: ( (lv_provides_15_0= ruleProvidedRole ) )
                    // InternalDsl.g:3337:5: (lv_provides_15_0= ruleProvidedRole )
                    {
                    // InternalDsl.g:3337:5: (lv_provides_15_0= ruleProvidedRole )
                    // InternalDsl.g:3338:6: lv_provides_15_0= ruleProvidedRole
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

                    // InternalDsl.g:3355:4: (otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalDsl.g:3356:5: otherlv_16= ',' ( (lv_provides_17_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_73); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:3360:5: ( (lv_provides_17_0= ruleProvidedRole ) )
                    	    // InternalDsl.g:3361:6: (lv_provides_17_0= ruleProvidedRole )
                    	    {
                    	    // InternalDsl.g:3361:6: (lv_provides_17_0= ruleProvidedRole )
                    	    // InternalDsl.g:3362:7: lv_provides_17_0= ruleProvidedRole
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
                    	    break loop63;
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
    // InternalDsl.g:3393:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalDsl.g:3393:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalDsl.g:3394:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalDsl.g:3400:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3406:2: ( (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3407:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3407:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3408:3: otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'requiredRole' ( ( ruleEString ) ) otherlv_4= 'providedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_2());
            		
            // InternalDsl.g:3420:3: ( ( ruleEString ) )
            // InternalDsl.g:3421:4: ( ruleEString )
            {
            // InternalDsl.g:3421:4: ( ruleEString )
            // InternalDsl.g:3422:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRequiredRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_75);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_4());
            		
            // InternalDsl.g:3440:3: ( ( ruleEString ) )
            // InternalDsl.g:3441:4: ( ruleEString )
            {
            // InternalDsl.g:3441:4: ( ruleEString )
            // InternalDsl.g:3442:5: ruleEString
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
    // InternalDsl.g:3464:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalDsl.g:3464:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalDsl.g:3465:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalDsl.g:3471:1: ruleRequiredRole returns [EObject current=null] : ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalDsl.g:3477:2: ( ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDsl.g:3478:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDsl.g:3478:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDsl.g:3479:3: () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDsl.g:3479:3: ()
            // InternalDsl.g:3480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1());
            		
            // InternalDsl.g:3490:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3491:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3491:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3492:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3513:3: (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==82) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDsl.g:3514:4: otherlv_4= 'delegationConnector' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequiredRoleAccess().getDelegationConnectorKeyword_4_0());
                    			
                    // InternalDsl.g:3518:4: ( ( ruleEString ) )
                    // InternalDsl.g:3519:5: ( ruleEString )
                    {
                    // InternalDsl.g:3519:5: ( ruleEString )
                    // InternalDsl.g:3520:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequiredRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequiredRoleAccess().getDelegationConnectorDelegationConnectorRequiredCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3535:3: (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==83) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDsl.g:3536:4: otherlv_6= 'assemblyConnector' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequiredRoleAccess().getAssemblyConnectorKeyword_5_0());
                    			
                    // InternalDsl.g:3540:4: ( ( ruleEString ) )
                    // InternalDsl.g:3541:5: ( ruleEString )
                    {
                    // InternalDsl.g:3541:5: ( ruleEString )
                    // InternalDsl.g:3542:6: ruleEString
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
    // InternalDsl.g:3565:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalDsl.g:3565:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalDsl.g:3566:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalDsl.g:3572:1: ruleProvidedRole returns [EObject current=null] : ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalDsl.g:3578:2: ( ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDsl.g:3579:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDsl.g:3579:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDsl.g:3580:3: () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )? (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDsl.g:3580:3: ()
            // InternalDsl.g:3581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1());
            		
            // InternalDsl.g:3591:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3592:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3592:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3593:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3614:3: (otherlv_4= 'delegationConnector' ( ( ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==82) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDsl.g:3615:4: otherlv_4= 'delegationConnector' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getProvidedRoleAccess().getDelegationConnectorKeyword_4_0());
                    			
                    // InternalDsl.g:3619:4: ( ( ruleEString ) )
                    // InternalDsl.g:3620:5: ( ruleEString )
                    {
                    // InternalDsl.g:3620:5: ( ruleEString )
                    // InternalDsl.g:3621:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvidedRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProvidedRoleAccess().getDelegationConnectorDelegationConnectorProvidedCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3636:3: (otherlv_6= 'assemblyConnector' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==83) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDsl.g:3637:4: otherlv_6= 'assemblyConnector' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getProvidedRoleAccess().getAssemblyConnectorKeyword_5_0());
                    			
                    // InternalDsl.g:3641:4: ( ( ruleEString ) )
                    // InternalDsl.g:3642:5: ( ruleEString )
                    {
                    // InternalDsl.g:3642:5: ( ruleEString )
                    // InternalDsl.g:3643:6: ruleEString
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
    // InternalDsl.g:3666:1: entryRuleDelegationConnectorRequired returns [EObject current=null] : iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF ;
    public final EObject entryRuleDelegationConnectorRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnectorRequired = null;


        try {
            // InternalDsl.g:3666:68: (iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF )
            // InternalDsl.g:3667:2: iv_ruleDelegationConnectorRequired= ruleDelegationConnectorRequired EOF
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
    // InternalDsl.g:3673:1: ruleDelegationConnectorRequired returns [EObject current=null] : (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDelegationConnectorRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3679:2: ( (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3680:2: (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3680:2: (otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3681:3: otherlv_0= 'DelegationConnectorRequired' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorRequiredAccess().getDelegationConnectorRequiredKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorRequiredAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorRequiredAccess().getLinkedInterfaceKeyword_2());
            		
            // InternalDsl.g:3693:3: ( ( ruleEString ) )
            // InternalDsl.g:3694:4: ( ruleEString )
            {
            // InternalDsl.g:3694:4: ( ruleEString )
            // InternalDsl.g:3695:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRequiredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorRequiredAccess().getLinkedInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_79);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,87,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorRequiredAccess().getLinkedRoleKeyword_4());
            		
            // InternalDsl.g:3713:3: ( ( ruleEString ) )
            // InternalDsl.g:3714:4: ( ruleEString )
            {
            // InternalDsl.g:3714:4: ( ruleEString )
            // InternalDsl.g:3715:5: ruleEString
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
    // InternalDsl.g:3737:1: entryRuleDelegationConnectorProvided returns [EObject current=null] : iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF ;
    public final EObject entryRuleDelegationConnectorProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnectorProvided = null;


        try {
            // InternalDsl.g:3737:68: (iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF )
            // InternalDsl.g:3738:2: iv_ruleDelegationConnectorProvided= ruleDelegationConnectorProvided EOF
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
    // InternalDsl.g:3744:1: ruleDelegationConnectorProvided returns [EObject current=null] : (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDelegationConnectorProvided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3750:2: ( (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3751:2: (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3751:2: (otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3752:3: otherlv_0= 'DelegationConnectorProvided' otherlv_1= '{' otherlv_2= 'linkedInterface' ( ( ruleEString ) ) otherlv_4= 'linkdedRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorProvidedAccess().getDelegationConnectorProvidedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorProvidedAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorProvidedAccess().getLinkedInterfaceKeyword_2());
            		
            // InternalDsl.g:3764:3: ( ( ruleEString ) )
            // InternalDsl.g:3765:4: ( ruleEString )
            {
            // InternalDsl.g:3765:4: ( ruleEString )
            // InternalDsl.g:3766:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorProvidedAccess().getLinkedInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_80);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,89,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorProvidedAccess().getLinkdedRoleKeyword_4());
            		
            // InternalDsl.g:3784:3: ( ( ruleEString ) )
            // InternalDsl.g:3785:4: ( ruleEString )
            {
            // InternalDsl.g:3785:4: ( ruleEString )
            // InternalDsl.g:3786:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorProvidedAccess().getLinkdedRoleProvidedRoleCrossReference_5_0());
            				
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001804008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001004008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000F0000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000E0000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xFFB0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFFB0000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000040L,0x000000000000000AL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000300L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000804008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000804008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000008000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000008000L,0x0000000000080000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}