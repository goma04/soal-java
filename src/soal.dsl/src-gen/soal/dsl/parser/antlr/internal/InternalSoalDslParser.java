package soal.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import soal.dsl.services.SoalDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'description'", "';'", "'import'", "'enum'", "'{'", "','", "'}'", "'struct'", "':'", "'interface'", "'readonly'", "'resource'", "'throws'", "'async'", "'('", "')'", "'void'", "'service'", "'binding'", "'['", "']'", "'?'", "'object'", "'binary'", "'bool'", "'string'", "'int'", "'long'", "'float'", "'double'", "'date'", "'time'", "'datetime'", "'duration'", "'.'", "'REST'", "'SOAP'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSoalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSoalDsl.g"; }



     	private SoalDslGrammarAccess grammarAccess;

        public InternalSoalDslParser(TokenStream input, SoalDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SoalModel";
       	}

       	@Override
       	protected SoalDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSoalModel"
    // InternalSoalDsl.g:65:1: entryRuleSoalModel returns [EObject current=null] : iv_ruleSoalModel= ruleSoalModel EOF ;
    public final EObject entryRuleSoalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoalModel = null;


        try {
            // InternalSoalDsl.g:65:50: (iv_ruleSoalModel= ruleSoalModel EOF )
            // InternalSoalDsl.g:66:2: iv_ruleSoalModel= ruleSoalModel EOF
            {
             newCompositeNode(grammarAccess.getSoalModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoalModel=ruleSoalModel();

            state._fsp--;

             current =iv_ruleSoalModel; 
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
    // $ANTLR end "entryRuleSoalModel"


    // $ANTLR start "ruleSoalModel"
    // InternalSoalDsl.g:72:1: ruleSoalModel returns [EObject current=null] : (otherlv_0= 'description' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_declarations_6_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSoalModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_declarations_6_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:78:2: ( (otherlv_0= 'description' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_declarations_6_0= ruleDeclaration ) )* ) )
            // InternalSoalDsl.g:79:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_declarations_6_0= ruleDeclaration ) )* )
            {
            // InternalSoalDsl.g:79:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_declarations_6_0= ruleDeclaration ) )* )
            // InternalSoalDsl.g:80:3: otherlv_0= 'description' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )* ( (lv_declarations_6_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSoalModelAccess().getDescriptionKeyword_0());
            		
            // InternalSoalDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSoalModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoalModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSoalModelAccess().getSemicolonKeyword_2());
            		
            // InternalSoalDsl.g:106:3: (otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSoalDsl.g:107:4: otherlv_3= 'import' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSoalModelAccess().getImportKeyword_3_0());
            	    			
            	    // InternalSoalDsl.g:111:4: ( (otherlv_4= RULE_STRING ) )
            	    // InternalSoalDsl.g:112:5: (otherlv_4= RULE_STRING )
            	    {
            	    // InternalSoalDsl.g:112:5: (otherlv_4= RULE_STRING )
            	    // InternalSoalDsl.g:113:6: otherlv_4= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSoalModelRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    						newLeafNode(otherlv_4, grammarAccess.getSoalModelAccess().getImportsSoalModelCrossReference_3_1_0());
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSoalModelAccess().getSemicolonKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSoalDsl.g:129:3: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==18||LA2_0==20||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSoalDsl.g:130:4: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // InternalSoalDsl.g:130:4: (lv_declarations_6_0= ruleDeclaration )
            	    // InternalSoalDsl.g:131:5: lv_declarations_6_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSoalModelAccess().getDeclarationsDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSoalModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_6_0,
            	    						"soal.dsl.SoalDsl.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleSoalModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSoalDsl.g:152:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSoalDsl.g:152:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSoalDsl.g:153:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalSoalDsl.g:159:1: ruleDeclaration returns [EObject current=null] : (this_EnumDeclaration_0= ruleEnumDeclaration | this_StructDeclaration_1= ruleStructDeclaration | this_InterfaceDeclaration_2= ruleInterfaceDeclaration | this_ServiceDeclaration_3= ruleServiceDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDeclaration_0 = null;

        EObject this_StructDeclaration_1 = null;

        EObject this_InterfaceDeclaration_2 = null;

        EObject this_ServiceDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:165:2: ( (this_EnumDeclaration_0= ruleEnumDeclaration | this_StructDeclaration_1= ruleStructDeclaration | this_InterfaceDeclaration_2= ruleInterfaceDeclaration | this_ServiceDeclaration_3= ruleServiceDeclaration ) )
            // InternalSoalDsl.g:166:2: (this_EnumDeclaration_0= ruleEnumDeclaration | this_StructDeclaration_1= ruleStructDeclaration | this_InterfaceDeclaration_2= ruleInterfaceDeclaration | this_ServiceDeclaration_3= ruleServiceDeclaration )
            {
            // InternalSoalDsl.g:166:2: (this_EnumDeclaration_0= ruleEnumDeclaration | this_StructDeclaration_1= ruleStructDeclaration | this_InterfaceDeclaration_2= ruleInterfaceDeclaration | this_ServiceDeclaration_3= ruleServiceDeclaration )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSoalDsl.g:167:3: this_EnumDeclaration_0= ruleEnumDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEnumDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_0=ruleEnumDeclaration();

                    state._fsp--;


                    			current = this_EnumDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:176:3: this_StructDeclaration_1= ruleStructDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getStructDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructDeclaration_1=ruleStructDeclaration();

                    state._fsp--;


                    			current = this_StructDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:185:3: this_InterfaceDeclaration_2= ruleInterfaceDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getInterfaceDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterfaceDeclaration_2=ruleInterfaceDeclaration();

                    state._fsp--;


                    			current = this_InterfaceDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSoalDsl.g:194:3: this_ServiceDeclaration_3= ruleServiceDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getServiceDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceDeclaration_3=ruleServiceDeclaration();

                    state._fsp--;


                    			current = this_ServiceDeclaration_3;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalSoalDsl.g:206:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalSoalDsl.g:206:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalSoalDsl.g:207:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalSoalDsl.g:213:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:219:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= '}' ) )
            // InternalSoalDsl.g:220:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= '}' )
            {
            // InternalSoalDsl.g:220:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= '}' )
            // InternalSoalDsl.g:221:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
            		
            // InternalSoalDsl.g:225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:226:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoalDsl.g:247:3: ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSoalDsl.g:248:4: ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                    {
                    // InternalSoalDsl.g:248:4: ( (lv_literals_3_0= ruleEnumLiteral ) )
                    // InternalSoalDsl.g:249:5: (lv_literals_3_0= ruleEnumLiteral )
                    {
                    // InternalSoalDsl.g:249:5: (lv_literals_3_0= ruleEnumLiteral )
                    // InternalSoalDsl.g:250:6: lv_literals_3_0= ruleEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_literals_3_0=ruleEnumLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_3_0,
                    							"soal.dsl.SoalDsl.EnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSoalDsl.g:267:4: (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSoalDsl.g:268:5: otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSoalDsl.g:272:5: ( (lv_literals_5_0= ruleEnumLiteral ) )
                    	    // InternalSoalDsl.g:273:6: (lv_literals_5_0= ruleEnumLiteral )
                    	    {
                    	    // InternalSoalDsl.g:273:6: (lv_literals_5_0= ruleEnumLiteral )
                    	    // InternalSoalDsl.g:274:7: lv_literals_5_0= ruleEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_literals_5_0=ruleEnumLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_5_0,
                    	    								"soal.dsl.SoalDsl.EnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalSoalDsl.g:301:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalSoalDsl.g:301:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalSoalDsl.g:302:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalSoalDsl.g:308:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:314:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSoalDsl.g:315:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSoalDsl.g:315:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSoalDsl.g:316:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSoalDsl.g:316:3: (lv_name_0_0= RULE_ID )
            // InternalSoalDsl.g:317:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleStructDeclaration"
    // InternalSoalDsl.g:336:1: entryRuleStructDeclaration returns [EObject current=null] : iv_ruleStructDeclaration= ruleStructDeclaration EOF ;
    public final EObject entryRuleStructDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDeclaration = null;


        try {
            // InternalSoalDsl.g:336:58: (iv_ruleStructDeclaration= ruleStructDeclaration EOF )
            // InternalSoalDsl.g:337:2: iv_ruleStructDeclaration= ruleStructDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStructDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructDeclaration=ruleStructDeclaration();

            state._fsp--;

             current =iv_ruleStructDeclaration; 
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
    // $ANTLR end "entryRuleStructDeclaration"


    // $ANTLR start "ruleStructDeclaration"
    // InternalSoalDsl.g:343:1: ruleStructDeclaration returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleFieldDeclaration ) )* otherlv_6= '}' ) ;
    public final EObject ruleStructDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:349:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleFieldDeclaration ) )* otherlv_6= '}' ) )
            // InternalSoalDsl.g:350:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleFieldDeclaration ) )* otherlv_6= '}' )
            {
            // InternalSoalDsl.g:350:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleFieldDeclaration ) )* otherlv_6= '}' )
            // InternalSoalDsl.g:351:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleFieldDeclaration ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructDeclarationAccess().getStructKeyword_0());
            		
            // InternalSoalDsl.g:355:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:356:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:356:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:357:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoalDsl.g:373:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSoalDsl.g:374:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0());
                    			
                    // InternalSoalDsl.g:378:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSoalDsl.g:379:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSoalDsl.g:379:5: (otherlv_3= RULE_ID )
                    // InternalSoalDsl.g:380:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructDeclarationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_3, grammarAccess.getStructDeclarationAccess().getBaseTypeStructTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoalDsl.g:396:3: ( (lv_fields_5_0= ruleFieldDeclaration ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=33 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSoalDsl.g:397:4: (lv_fields_5_0= ruleFieldDeclaration )
            	    {
            	    // InternalSoalDsl.g:397:4: (lv_fields_5_0= ruleFieldDeclaration )
            	    // InternalSoalDsl.g:398:5: lv_fields_5_0= ruleFieldDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getStructDeclarationAccess().getFieldsFieldDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_fields_5_0=ruleFieldDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"soal.dsl.SoalDsl.FieldDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStructDeclaration"


    // $ANTLR start "entryRuleFieldDeclaration"
    // InternalSoalDsl.g:423:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // InternalSoalDsl.g:423:57: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // InternalSoalDsl.g:424:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;

             current =iv_ruleFieldDeclaration; 
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
    // $ANTLR end "entryRuleFieldDeclaration"


    // $ANTLR start "ruleFieldDeclaration"
    // InternalSoalDsl.g:430:1: ruleFieldDeclaration returns [EObject current=null] : ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:436:2: ( ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSoalDsl.g:437:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSoalDsl.g:437:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSoalDsl.g:438:3: ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalSoalDsl.g:438:3: ( (lv_typeReference_0_0= ruleTypeReference ) )
            // InternalSoalDsl.g:439:4: (lv_typeReference_0_0= ruleTypeReference )
            {
            // InternalSoalDsl.g:439:4: (lv_typeReference_0_0= ruleTypeReference )
            // InternalSoalDsl.g:440:5: lv_typeReference_0_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getFieldDeclarationAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_typeReference_0_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDeclarationRule());
            					}
            					set(
            						current,
            						"typeReference",
            						lv_typeReference_0_0,
            						"soal.dsl.SoalDsl.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoalDsl.g:457:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:458:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:458:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:459:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldDeclarationAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleFieldDeclaration"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalSoalDsl.g:483:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // InternalSoalDsl.g:483:61: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // InternalSoalDsl.g:484:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;

             current =iv_ruleInterfaceDeclaration; 
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
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalSoalDsl.g:490:1: ruleInterfaceDeclaration returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResourceDeclaration ) )* ( (lv_operations_4_0= ruleOperationDeclaration ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_resources_3_0 = null;

        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:496:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResourceDeclaration ) )* ( (lv_operations_4_0= ruleOperationDeclaration ) )* otherlv_5= '}' ) )
            // InternalSoalDsl.g:497:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResourceDeclaration ) )* ( (lv_operations_4_0= ruleOperationDeclaration ) )* otherlv_5= '}' )
            {
            // InternalSoalDsl.g:497:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResourceDeclaration ) )* ( (lv_operations_4_0= ruleOperationDeclaration ) )* otherlv_5= '}' )
            // InternalSoalDsl.g:498:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_resources_3_0= ruleResourceDeclaration ) )* ( (lv_operations_4_0= ruleOperationDeclaration ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0());
            		
            // InternalSoalDsl.g:502:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:503:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:503:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:504:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoalDsl.g:524:3: ( (lv_resources_3_0= ruleResourceDeclaration ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSoalDsl.g:525:4: (lv_resources_3_0= ruleResourceDeclaration )
            	    {
            	    // InternalSoalDsl.g:525:4: (lv_resources_3_0= ruleResourceDeclaration )
            	    // InternalSoalDsl.g:526:5: lv_resources_3_0= ruleResourceDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getResourcesResourceDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_resources_3_0=ruleResourceDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_3_0,
            	    						"soal.dsl.SoalDsl.ResourceDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSoalDsl.g:543:3: ( (lv_operations_4_0= ruleOperationDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=24 && LA9_0<=25)||LA9_0==27||(LA9_0>=33 && LA9_0<=44)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSoalDsl.g:544:4: (lv_operations_4_0= ruleOperationDeclaration )
            	    {
            	    // InternalSoalDsl.g:544:4: (lv_operations_4_0= ruleOperationDeclaration )
            	    // InternalSoalDsl.g:545:5: lv_operations_4_0= ruleOperationDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getOperationsOperationDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_operations_4_0=ruleOperationDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"soal.dsl.SoalDsl.OperationDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleResourceDeclaration"
    // InternalSoalDsl.g:570:1: entryRuleResourceDeclaration returns [EObject current=null] : iv_ruleResourceDeclaration= ruleResourceDeclaration EOF ;
    public final EObject entryRuleResourceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceDeclaration = null;


        try {
            // InternalSoalDsl.g:570:60: (iv_ruleResourceDeclaration= ruleResourceDeclaration EOF )
            // InternalSoalDsl.g:571:2: iv_ruleResourceDeclaration= ruleResourceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getResourceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceDeclaration=ruleResourceDeclaration();

            state._fsp--;

             current =iv_ruleResourceDeclaration; 
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
    // $ANTLR end "entryRuleResourceDeclaration"


    // $ANTLR start "ruleResourceDeclaration"
    // InternalSoalDsl.g:577:1: ruleResourceDeclaration returns [EObject current=null] : ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'resource' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ';' ) ;
    public final EObject ruleResourceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_readonly_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:583:2: ( ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'resource' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ';' ) )
            // InternalSoalDsl.g:584:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'resource' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ';' )
            {
            // InternalSoalDsl.g:584:2: ( ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'resource' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ';' )
            // InternalSoalDsl.g:585:3: ( (lv_readonly_0_0= 'readonly' ) )? otherlv_1= 'resource' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ';'
            {
            // InternalSoalDsl.g:585:3: ( (lv_readonly_0_0= 'readonly' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSoalDsl.g:586:4: (lv_readonly_0_0= 'readonly' )
                    {
                    // InternalSoalDsl.g:586:4: (lv_readonly_0_0= 'readonly' )
                    // InternalSoalDsl.g:587:5: lv_readonly_0_0= 'readonly'
                    {
                    lv_readonly_0_0=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(lv_readonly_0_0, grammarAccess.getResourceDeclarationAccess().getReadonlyReadonlyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "readonly", lv_readonly_0_0 != null, "readonly");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceDeclarationAccess().getResourceKeyword_1());
            		
            // InternalSoalDsl.g:603:3: ( (otherlv_2= RULE_ID ) )
            // InternalSoalDsl.g:604:4: (otherlv_2= RULE_ID )
            {
            // InternalSoalDsl.g:604:4: (otherlv_2= RULE_ID )
            // InternalSoalDsl.g:605:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getResourceDeclarationAccess().getEntityStructTypeCrossReference_2_0());
            				

            }


            }

            // InternalSoalDsl.g:616:3: (otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSoalDsl.g:617:4: otherlv_3= 'throws' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getResourceDeclarationAccess().getThrowsKeyword_3_0());
                    			
                    // InternalSoalDsl.g:621:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSoalDsl.g:622:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSoalDsl.g:622:5: (otherlv_4= RULE_ID )
                    // InternalSoalDsl.g:623:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceDeclarationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_4, grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalSoalDsl.g:634:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSoalDsl.g:635:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getResourceDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSoalDsl.g:639:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalSoalDsl.g:640:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalSoalDsl.g:640:6: (otherlv_6= RULE_ID )
                    	    // InternalSoalDsl.g:641:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceDeclarationRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleResourceDeclaration"


    // $ANTLR start "entryRuleOperationDeclaration"
    // InternalSoalDsl.g:662:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // InternalSoalDsl.g:662:61: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // InternalSoalDsl.g:663:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;

             current =iv_ruleOperationDeclaration; 
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
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // InternalSoalDsl.g:669:1: ruleOperationDeclaration returns [EObject current=null] : ( ( (lv_async_0_0= 'async' ) )? ( (lv_responseParameters_1_0= ruleOutputParameterList ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_requestParameters_3_0= ruleInputParameterList ) ) (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_async_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_responseParameters_1_0 = null;

        EObject lv_requestParameters_3_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:675:2: ( ( ( (lv_async_0_0= 'async' ) )? ( (lv_responseParameters_1_0= ruleOutputParameterList ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_requestParameters_3_0= ruleInputParameterList ) ) (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' ) )
            // InternalSoalDsl.g:676:2: ( ( (lv_async_0_0= 'async' ) )? ( (lv_responseParameters_1_0= ruleOutputParameterList ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_requestParameters_3_0= ruleInputParameterList ) ) (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' )
            {
            // InternalSoalDsl.g:676:2: ( ( (lv_async_0_0= 'async' ) )? ( (lv_responseParameters_1_0= ruleOutputParameterList ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_requestParameters_3_0= ruleInputParameterList ) ) (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' )
            // InternalSoalDsl.g:677:3: ( (lv_async_0_0= 'async' ) )? ( (lv_responseParameters_1_0= ruleOutputParameterList ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_requestParameters_3_0= ruleInputParameterList ) ) (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';'
            {
            // InternalSoalDsl.g:677:3: ( (lv_async_0_0= 'async' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSoalDsl.g:678:4: (lv_async_0_0= 'async' )
                    {
                    // InternalSoalDsl.g:678:4: (lv_async_0_0= 'async' )
                    // InternalSoalDsl.g:679:5: lv_async_0_0= 'async'
                    {
                    lv_async_0_0=(Token)match(input,24,FOLLOW_18); 

                    					newLeafNode(lv_async_0_0, grammarAccess.getOperationDeclarationAccess().getAsyncAsyncKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "async", lv_async_0_0 != null, "async");
                    				

                    }


                    }
                    break;

            }

            // InternalSoalDsl.g:691:3: ( (lv_responseParameters_1_0= ruleOutputParameterList ) )
            // InternalSoalDsl.g:692:4: (lv_responseParameters_1_0= ruleOutputParameterList )
            {
            // InternalSoalDsl.g:692:4: (lv_responseParameters_1_0= ruleOutputParameterList )
            // InternalSoalDsl.g:693:5: lv_responseParameters_1_0= ruleOutputParameterList
            {

            					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getResponseParametersOutputParameterListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_responseParameters_1_0=ruleOutputParameterList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
            					}
            					set(
            						current,
            						"responseParameters",
            						lv_responseParameters_1_0,
            						"soal.dsl.SoalDsl.OutputParameterList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoalDsl.g:710:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSoalDsl.g:711:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSoalDsl.g:711:4: (lv_name_2_0= RULE_ID )
            // InternalSoalDsl.g:712:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoalDsl.g:728:3: ( (lv_requestParameters_3_0= ruleInputParameterList ) )
            // InternalSoalDsl.g:729:4: (lv_requestParameters_3_0= ruleInputParameterList )
            {
            // InternalSoalDsl.g:729:4: (lv_requestParameters_3_0= ruleInputParameterList )
            // InternalSoalDsl.g:730:5: lv_requestParameters_3_0= ruleInputParameterList
            {

            					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getRequestParametersInputParameterListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_requestParameters_3_0=ruleInputParameterList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
            					}
            					set(
            						current,
            						"requestParameters",
            						lv_requestParameters_3_0,
            						"soal.dsl.SoalDsl.InputParameterList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoalDsl.g:747:3: (otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSoalDsl.g:748:4: otherlv_4= 'throws' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationDeclarationAccess().getThrowsKeyword_4_0());
                    			
                    // InternalSoalDsl.g:752:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSoalDsl.g:753:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSoalDsl.g:753:5: (otherlv_5= RULE_ID )
                    // InternalSoalDsl.g:754:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationDeclarationRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_5, grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalSoalDsl.g:765:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSoalDsl.g:766:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getOperationDeclarationAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSoalDsl.g:770:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalSoalDsl.g:771:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalSoalDsl.g:771:6: (otherlv_7= RULE_ID )
                    	    // InternalSoalDsl.g:772:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOperationDeclarationRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationDeclarationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleInputParameterList"
    // InternalSoalDsl.g:793:1: entryRuleInputParameterList returns [EObject current=null] : iv_ruleInputParameterList= ruleInputParameterList EOF ;
    public final EObject entryRuleInputParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputParameterList = null;


        try {
            // InternalSoalDsl.g:793:59: (iv_ruleInputParameterList= ruleInputParameterList EOF )
            // InternalSoalDsl.g:794:2: iv_ruleInputParameterList= ruleInputParameterList EOF
            {
             newCompositeNode(grammarAccess.getInputParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputParameterList=ruleInputParameterList();

            state._fsp--;

             current =iv_ruleInputParameterList; 
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
    // $ANTLR end "entryRuleInputParameterList"


    // $ANTLR start "ruleInputParameterList"
    // InternalSoalDsl.g:800:1: ruleInputParameterList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInputParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:806:2: ( ( () otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' ) )
            // InternalSoalDsl.g:807:2: ( () otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )
            {
            // InternalSoalDsl.g:807:2: ( () otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )
            // InternalSoalDsl.g:808:3: () otherlv_1= '(' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ')'
            {
            // InternalSoalDsl.g:808:3: ()
            // InternalSoalDsl.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputParameterListAccess().getParameterListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getInputParameterListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSoalDsl.g:819:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=33 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSoalDsl.g:820:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    {
                    // InternalSoalDsl.g:820:4: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalSoalDsl.g:821:5: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalSoalDsl.g:821:5: (lv_parameters_2_0= ruleParameter )
                    // InternalSoalDsl.g:822:6: lv_parameters_2_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputParameterListRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"soal.dsl.SoalDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSoalDsl.g:839:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSoalDsl.g:840:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInputParameterListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSoalDsl.g:844:5: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalSoalDsl.g:845:6: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalSoalDsl.g:845:6: (lv_parameters_4_0= ruleParameter )
                    	    // InternalSoalDsl.g:846:7: lv_parameters_4_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputParameterListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"soal.dsl.SoalDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInputParameterListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInputParameterList"


    // $ANTLR start "entryRuleOutputParameterList"
    // InternalSoalDsl.g:873:1: entryRuleOutputParameterList returns [EObject current=null] : iv_ruleOutputParameterList= ruleOutputParameterList EOF ;
    public final EObject entryRuleOutputParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputParameterList = null;


        try {
            // InternalSoalDsl.g:873:60: (iv_ruleOutputParameterList= ruleOutputParameterList EOF )
            // InternalSoalDsl.g:874:2: iv_ruleOutputParameterList= ruleOutputParameterList EOF
            {
             newCompositeNode(grammarAccess.getOutputParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputParameterList=ruleOutputParameterList();

            state._fsp--;

             current =iv_ruleOutputParameterList; 
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
    // $ANTLR end "entryRuleOutputParameterList"


    // $ANTLR start "ruleOutputParameterList"
    // InternalSoalDsl.g:880:1: ruleOutputParameterList returns [EObject current=null] : ( ( () otherlv_1= 'void' ) | ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) ) | (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleOutputParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:886:2: ( ( ( () otherlv_1= 'void' ) | ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) ) | (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' ) ) )
            // InternalSoalDsl.g:887:2: ( ( () otherlv_1= 'void' ) | ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) ) | (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' ) )
            {
            // InternalSoalDsl.g:887:2: ( ( () otherlv_1= 'void' ) | ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) ) | (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSoalDsl.g:888:3: ( () otherlv_1= 'void' )
                    {
                    // InternalSoalDsl.g:888:3: ( () otherlv_1= 'void' )
                    // InternalSoalDsl.g:889:4: () otherlv_1= 'void'
                    {
                    // InternalSoalDsl.g:889:4: ()
                    // InternalSoalDsl.g:890:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutputParameterListAccess().getParameterListAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputParameterListAccess().getVoidKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:902:3: ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) )
                    {
                    // InternalSoalDsl.g:902:3: ( () ( (lv_parameters_3_0= ruleSingleReturnParameter ) ) )
                    // InternalSoalDsl.g:903:4: () ( (lv_parameters_3_0= ruleSingleReturnParameter ) )
                    {
                    // InternalSoalDsl.g:903:4: ()
                    // InternalSoalDsl.g:904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOutputParameterListAccess().getParameterListAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSoalDsl.g:910:4: ( (lv_parameters_3_0= ruleSingleReturnParameter ) )
                    // InternalSoalDsl.g:911:5: (lv_parameters_3_0= ruleSingleReturnParameter )
                    {
                    // InternalSoalDsl.g:911:5: (lv_parameters_3_0= ruleSingleReturnParameter )
                    // InternalSoalDsl.g:912:6: lv_parameters_3_0= ruleSingleReturnParameter
                    {

                    						newCompositeNode(grammarAccess.getOutputParameterListAccess().getParametersSingleReturnParameterParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_3_0=ruleSingleReturnParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputParameterListRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"soal.dsl.SoalDsl.SingleReturnParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:931:3: (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )
                    {
                    // InternalSoalDsl.g:931:3: (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )
                    // InternalSoalDsl.g:932:4: otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getOutputParameterListAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSoalDsl.g:936:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalSoalDsl.g:937:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalSoalDsl.g:937:5: (lv_parameters_5_0= ruleParameter )
                    // InternalSoalDsl.g:938:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputParameterListRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"soal.dsl.SoalDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSoalDsl.g:955:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSoalDsl.g:956:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_22); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getOutputParameterListAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSoalDsl.g:960:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalSoalDsl.g:961:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalSoalDsl.g:961:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalSoalDsl.g:962:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOutputParameterListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"soal.dsl.SoalDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutputParameterListAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


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
    // $ANTLR end "ruleOutputParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalSoalDsl.g:989:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSoalDsl.g:989:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSoalDsl.g:990:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSoalDsl.g:996:1: ruleParameter returns [EObject current=null] : ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1002:2: ( ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoalDsl.g:1003:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoalDsl.g:1003:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoalDsl.g:1004:3: ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSoalDsl.g:1004:3: ( (lv_typeReference_0_0= ruleTypeReference ) )
            // InternalSoalDsl.g:1005:4: (lv_typeReference_0_0= ruleTypeReference )
            {
            // InternalSoalDsl.g:1005:4: (lv_typeReference_0_0= ruleTypeReference )
            // InternalSoalDsl.g:1006:5: lv_typeReference_0_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_typeReference_0_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"typeReference",
            						lv_typeReference_0_0,
            						"soal.dsl.SoalDsl.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoalDsl.g:1023:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:1024:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:1024:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:1025:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSingleReturnParameter"
    // InternalSoalDsl.g:1045:1: entryRuleSingleReturnParameter returns [EObject current=null] : iv_ruleSingleReturnParameter= ruleSingleReturnParameter EOF ;
    public final EObject entryRuleSingleReturnParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleReturnParameter = null;


        try {
            // InternalSoalDsl.g:1045:62: (iv_ruleSingleReturnParameter= ruleSingleReturnParameter EOF )
            // InternalSoalDsl.g:1046:2: iv_ruleSingleReturnParameter= ruleSingleReturnParameter EOF
            {
             newCompositeNode(grammarAccess.getSingleReturnParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleReturnParameter=ruleSingleReturnParameter();

            state._fsp--;

             current =iv_ruleSingleReturnParameter; 
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
    // $ANTLR end "entryRuleSingleReturnParameter"


    // $ANTLR start "ruleSingleReturnParameter"
    // InternalSoalDsl.g:1052:1: ruleSingleReturnParameter returns [EObject current=null] : ( (lv_typeReference_0_0= ruleTypeReference ) ) ;
    public final EObject ruleSingleReturnParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1058:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) )
            // InternalSoalDsl.g:1059:2: ( (lv_typeReference_0_0= ruleTypeReference ) )
            {
            // InternalSoalDsl.g:1059:2: ( (lv_typeReference_0_0= ruleTypeReference ) )
            // InternalSoalDsl.g:1060:3: (lv_typeReference_0_0= ruleTypeReference )
            {
            // InternalSoalDsl.g:1060:3: (lv_typeReference_0_0= ruleTypeReference )
            // InternalSoalDsl.g:1061:4: lv_typeReference_0_0= ruleTypeReference
            {

            				newCompositeNode(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_typeReference_0_0=ruleTypeReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSingleReturnParameterRule());
            				}
            				set(
            					current,
            					"typeReference",
            					lv_typeReference_0_0,
            					"soal.dsl.SoalDsl.TypeReference");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSingleReturnParameter"


    // $ANTLR start "entryRuleServiceDeclaration"
    // InternalSoalDsl.g:1081:1: entryRuleServiceDeclaration returns [EObject current=null] : iv_ruleServiceDeclaration= ruleServiceDeclaration EOF ;
    public final EObject entryRuleServiceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDeclaration = null;


        try {
            // InternalSoalDsl.g:1081:59: (iv_ruleServiceDeclaration= ruleServiceDeclaration EOF )
            // InternalSoalDsl.g:1082:2: iv_ruleServiceDeclaration= ruleServiceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getServiceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceDeclaration=ruleServiceDeclaration();

            state._fsp--;

             current =iv_ruleServiceDeclaration; 
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
    // $ANTLR end "entryRuleServiceDeclaration"


    // $ANTLR start "ruleServiceDeclaration"
    // InternalSoalDsl.g:1088:1: ruleServiceDeclaration returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'binding' ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) ) otherlv_7= ';' otherlv_8= '}' ) ;
    public final EObject ruleServiceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_binding_6_1 = null;

        Enumerator lv_binding_6_2 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1094:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'binding' ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) ) otherlv_7= ';' otherlv_8= '}' ) )
            // InternalSoalDsl.g:1095:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'binding' ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) ) otherlv_7= ';' otherlv_8= '}' )
            {
            // InternalSoalDsl.g:1095:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'binding' ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) ) otherlv_7= ';' otherlv_8= '}' )
            // InternalSoalDsl.g:1096:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'binding' ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) ) otherlv_7= ';' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceDeclarationAccess().getServiceKeyword_0());
            		
            // InternalSoalDsl.g:1100:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoalDsl.g:1101:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoalDsl.g:1101:4: (lv_name_1_0= RULE_ID )
            // InternalSoalDsl.g:1102:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceDeclarationAccess().getColonKeyword_2());
            		
            // InternalSoalDsl.g:1122:3: ( (otherlv_3= RULE_ID ) )
            // InternalSoalDsl.g:1123:4: (otherlv_3= RULE_ID )
            {
            // InternalSoalDsl.g:1123:4: (otherlv_3= RULE_ID )
            // InternalSoalDsl.g:1124:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceDeclarationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getServiceDeclarationAccess().getInterfaceInterfaceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceDeclarationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceDeclarationAccess().getBindingKeyword_5());
            		
            // InternalSoalDsl.g:1143:3: ( ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) ) )
            // InternalSoalDsl.g:1144:4: ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) )
            {
            // InternalSoalDsl.g:1144:4: ( (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind ) )
            // InternalSoalDsl.g:1145:5: (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind )
            {
            // InternalSoalDsl.g:1145:5: (lv_binding_6_1= ruleRestBindingKind | lv_binding_6_2= ruleSoapBindingKind )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSoalDsl.g:1146:6: lv_binding_6_1= ruleRestBindingKind
                    {

                    						newCompositeNode(grammarAccess.getServiceDeclarationAccess().getBindingRestBindingKindEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_binding_6_1=ruleRestBindingKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"binding",
                    							lv_binding_6_1,
                    							"soal.dsl.SoalDsl.RestBindingKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:1162:6: lv_binding_6_2= ruleSoapBindingKind
                    {

                    						newCompositeNode(grammarAccess.getServiceDeclarationAccess().getBindingSoapBindingKindEnumRuleCall_6_0_1());
                    					
                    pushFollow(FOLLOW_4);
                    lv_binding_6_2=ruleSoapBindingKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"binding",
                    							lv_binding_6_2,
                    							"soal.dsl.SoalDsl.SoapBindingKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceDeclarationAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceDeclarationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleServiceDeclaration"


    // $ANTLR start "entryRuleTypeReference"
    // InternalSoalDsl.g:1192:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalSoalDsl.g:1192:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalSoalDsl.g:1193:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalSoalDsl.g:1199:1: ruleTypeReference returns [EObject current=null] : (this_ArrayType_0= ruleArrayType | this_NullableType_1= ruleNullableType | this_SimpleTypeReference_2= ruleSimpleTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayType_0 = null;

        EObject this_NullableType_1 = null;

        EObject this_SimpleTypeReference_2 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1205:2: ( (this_ArrayType_0= ruleArrayType | this_NullableType_1= ruleNullableType | this_SimpleTypeReference_2= ruleSimpleTypeReference ) )
            // InternalSoalDsl.g:1206:2: (this_ArrayType_0= ruleArrayType | this_NullableType_1= ruleNullableType | this_SimpleTypeReference_2= ruleSimpleTypeReference )
            {
            // InternalSoalDsl.g:1206:2: (this_ArrayType_0= ruleArrayType | this_NullableType_1= ruleNullableType | this_SimpleTypeReference_2= ruleSimpleTypeReference )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSoalDsl.g:1207:3: this_ArrayType_0= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getArrayTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_0=ruleArrayType();

                    state._fsp--;


                    			current = this_ArrayType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:1216:3: this_NullableType_1= ruleNullableType
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getNullableTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullableType_1=ruleNullableType();

                    state._fsp--;


                    			current = this_NullableType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:1225:3: this_SimpleTypeReference_2= ruleSimpleTypeReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getSimpleTypeReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypeReference_2=ruleSimpleTypeReference();

                    state._fsp--;


                    			current = this_SimpleTypeReference_2;
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleArrayType"
    // InternalSoalDsl.g:1237:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalSoalDsl.g:1237:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalSoalDsl.g:1238:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalSoalDsl.g:1244:1: ruleArrayType returns [EObject current=null] : ( ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' ) | ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_innerType_5_0 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1250:2: ( ( ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' ) | ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' ) ) )
            // InternalSoalDsl.g:1251:2: ( ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' ) | ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' ) )
            {
            // InternalSoalDsl.g:1251:2: ( ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' ) | ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalSoalDsl.g:1252:3: ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' )
                    {
                    // InternalSoalDsl.g:1252:3: ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' )
                    // InternalSoalDsl.g:1253:4: () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']'
                    {
                    // InternalSoalDsl.g:1253:4: ()
                    // InternalSoalDsl.g:1254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArrayTypeAccess().getReferenceArrayTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSoalDsl.g:1260:4: ( ( ruleSimpleTypeName ) )
                    // InternalSoalDsl.g:1261:5: ( ruleSimpleTypeName )
                    {
                    // InternalSoalDsl.g:1261:5: ( ruleSimpleTypeName )
                    // InternalSoalDsl.g:1262:6: ruleSimpleTypeName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getInnerTypeTypeCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleSimpleTypeName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:1286:3: ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' )
                    {
                    // InternalSoalDsl.g:1286:3: ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' )
                    // InternalSoalDsl.g:1287:4: () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']'
                    {
                    // InternalSoalDsl.g:1287:4: ()
                    // InternalSoalDsl.g:1288:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArrayTypeAccess().getContainmentArrayTypeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSoalDsl.g:1294:4: ( (lv_innerType_5_0= ruleNullableType ) )
                    // InternalSoalDsl.g:1295:5: (lv_innerType_5_0= ruleNullableType )
                    {
                    // InternalSoalDsl.g:1295:5: (lv_innerType_5_0= ruleNullableType )
                    // InternalSoalDsl.g:1296:6: lv_innerType_5_0= ruleNullableType
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getInnerTypeNullableTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_innerType_5_0=ruleNullableType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"innerType",
                    							lv_innerType_5_0,
                    							"soal.dsl.SoalDsl.NullableType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    otherlv_7=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleNullableType"
    // InternalSoalDsl.g:1326:1: entryRuleNullableType returns [EObject current=null] : iv_ruleNullableType= ruleNullableType EOF ;
    public final EObject entryRuleNullableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullableType = null;


        try {
            // InternalSoalDsl.g:1326:53: (iv_ruleNullableType= ruleNullableType EOF )
            // InternalSoalDsl.g:1327:2: iv_ruleNullableType= ruleNullableType EOF
            {
             newCompositeNode(grammarAccess.getNullableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullableType=ruleNullableType();

            state._fsp--;

             current =iv_ruleNullableType; 
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
    // $ANTLR end "entryRuleNullableType"


    // $ANTLR start "ruleNullableType"
    // InternalSoalDsl.g:1333:1: ruleNullableType returns [EObject current=null] : ( ( ( ruleSimpleTypeName ) ) otherlv_1= '?' ) ;
    public final EObject ruleNullableType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:1339:2: ( ( ( ( ruleSimpleTypeName ) ) otherlv_1= '?' ) )
            // InternalSoalDsl.g:1340:2: ( ( ( ruleSimpleTypeName ) ) otherlv_1= '?' )
            {
            // InternalSoalDsl.g:1340:2: ( ( ( ruleSimpleTypeName ) ) otherlv_1= '?' )
            // InternalSoalDsl.g:1341:3: ( ( ruleSimpleTypeName ) ) otherlv_1= '?'
            {
            // InternalSoalDsl.g:1341:3: ( ( ruleSimpleTypeName ) )
            // InternalSoalDsl.g:1342:4: ( ruleSimpleTypeName )
            {
            // InternalSoalDsl.g:1342:4: ( ruleSimpleTypeName )
            // InternalSoalDsl.g:1343:5: ruleSimpleTypeName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNullableTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNullableTypeAccess().getInnerTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_29);
            ruleSimpleTypeName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullableTypeAccess().getQuestionMarkKeyword_1());
            		

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
    // $ANTLR end "ruleNullableType"


    // $ANTLR start "entryRuleSimpleTypeReference"
    // InternalSoalDsl.g:1365:1: entryRuleSimpleTypeReference returns [EObject current=null] : iv_ruleSimpleTypeReference= ruleSimpleTypeReference EOF ;
    public final EObject entryRuleSimpleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeReference = null;


        try {
            // InternalSoalDsl.g:1365:60: (iv_ruleSimpleTypeReference= ruleSimpleTypeReference EOF )
            // InternalSoalDsl.g:1366:2: iv_ruleSimpleTypeReference= ruleSimpleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypeReference=ruleSimpleTypeReference();

            state._fsp--;

             current =iv_ruleSimpleTypeReference; 
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
    // $ANTLR end "entryRuleSimpleTypeReference"


    // $ANTLR start "ruleSimpleTypeReference"
    // InternalSoalDsl.g:1372:1: ruleSimpleTypeReference returns [EObject current=null] : ( ( ruleSimpleTypeName ) ) ;
    public final EObject ruleSimpleTypeReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSoalDsl.g:1378:2: ( ( ( ruleSimpleTypeName ) ) )
            // InternalSoalDsl.g:1379:2: ( ( ruleSimpleTypeName ) )
            {
            // InternalSoalDsl.g:1379:2: ( ( ruleSimpleTypeName ) )
            // InternalSoalDsl.g:1380:3: ( ruleSimpleTypeName )
            {
            // InternalSoalDsl.g:1380:3: ( ruleSimpleTypeName )
            // InternalSoalDsl.g:1381:4: ruleSimpleTypeName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSimpleTypeReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeTypeCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleSimpleTypeName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSimpleTypeReference"


    // $ANTLR start "entryRuleSimpleTypeName"
    // InternalSoalDsl.g:1398:1: entryRuleSimpleTypeName returns [String current=null] : iv_ruleSimpleTypeName= ruleSimpleTypeName EOF ;
    public final String entryRuleSimpleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTypeName = null;


        try {
            // InternalSoalDsl.g:1398:54: (iv_ruleSimpleTypeName= ruleSimpleTypeName EOF )
            // InternalSoalDsl.g:1399:2: iv_ruleSimpleTypeName= ruleSimpleTypeName EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypeName=ruleSimpleTypeName();

            state._fsp--;

             current =iv_ruleSimpleTypeName.getText(); 
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
    // $ANTLR end "entryRuleSimpleTypeName"


    // $ANTLR start "ruleSimpleTypeName"
    // InternalSoalDsl.g:1405:1: ruleSimpleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'object' | kw= 'binary' | kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'date' | kw= 'time' | kw= 'datetime' | kw= 'duration' | this_QualifiedName_12= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_12 = null;



        	enterRule();

        try {
            // InternalSoalDsl.g:1411:2: ( (kw= 'object' | kw= 'binary' | kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'date' | kw= 'time' | kw= 'datetime' | kw= 'duration' | this_QualifiedName_12= ruleQualifiedName ) )
            // InternalSoalDsl.g:1412:2: (kw= 'object' | kw= 'binary' | kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'date' | kw= 'time' | kw= 'datetime' | kw= 'duration' | this_QualifiedName_12= ruleQualifiedName )
            {
            // InternalSoalDsl.g:1412:2: (kw= 'object' | kw= 'binary' | kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'date' | kw= 'time' | kw= 'datetime' | kw= 'duration' | this_QualifiedName_12= ruleQualifiedName )
            int alt23=13;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            case 36:
                {
                alt23=4;
                }
                break;
            case 37:
                {
                alt23=5;
                }
                break;
            case 38:
                {
                alt23=6;
                }
                break;
            case 39:
                {
                alt23=7;
                }
                break;
            case 40:
                {
                alt23=8;
                }
                break;
            case 41:
                {
                alt23=9;
                }
                break;
            case 42:
                {
                alt23=10;
                }
                break;
            case 43:
                {
                alt23=11;
                }
                break;
            case 44:
                {
                alt23=12;
                }
                break;
            case RULE_ID:
                {
                alt23=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSoalDsl.g:1413:3: kw= 'object'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getObjectKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:1419:3: kw= 'binary'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getBinaryKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:1425:3: kw= 'bool'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getBoolKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoalDsl.g:1431:3: kw= 'string'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoalDsl.g:1437:3: kw= 'int'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getIntKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSoalDsl.g:1443:3: kw= 'long'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getLongKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSoalDsl.g:1449:3: kw= 'float'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getFloatKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSoalDsl.g:1455:3: kw= 'double'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getDoubleKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSoalDsl.g:1461:3: kw= 'date'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getDateKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSoalDsl.g:1467:3: kw= 'time'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getTimeKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSoalDsl.g:1473:3: kw= 'datetime'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getDatetimeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSoalDsl.g:1479:3: kw= 'duration'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleTypeNameAccess().getDurationKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSoalDsl.g:1485:3: this_QualifiedName_12= ruleQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeNameAccess().getQualifiedNameParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_12=ruleQualifiedName();

                    state._fsp--;


                    			current.merge(this_QualifiedName_12);
                    		

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
    // $ANTLR end "ruleSimpleTypeName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSoalDsl.g:1499:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSoalDsl.g:1499:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSoalDsl.g:1500:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSoalDsl.g:1506:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:1512:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSoalDsl.g:1513:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSoalDsl.g:1513:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSoalDsl.g:1514:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSoalDsl.g:1521:3: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSoalDsl.g:1522:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,45,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRestBindingKind"
    // InternalSoalDsl.g:1539:1: ruleRestBindingKind returns [Enumerator current=null] : (enumLiteral_0= 'REST' ) ;
    public final Enumerator ruleRestBindingKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:1545:2: ( (enumLiteral_0= 'REST' ) )
            // InternalSoalDsl.g:1546:2: (enumLiteral_0= 'REST' )
            {
            // InternalSoalDsl.g:1546:2: (enumLiteral_0= 'REST' )
            // InternalSoalDsl.g:1547:3: enumLiteral_0= 'REST'
            {
            enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

            			current = grammarAccess.getRestBindingKindAccess().getRESTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getRestBindingKindAccess().getRESTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleRestBindingKind"


    // $ANTLR start "ruleSoapBindingKind"
    // InternalSoalDsl.g:1556:1: ruleSoapBindingKind returns [Enumerator current=null] : (enumLiteral_0= 'SOAP' ) ;
    public final Enumerator ruleSoapBindingKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSoalDsl.g:1562:2: ( (enumLiteral_0= 'SOAP' ) )
            // InternalSoalDsl.g:1563:2: (enumLiteral_0= 'SOAP' )
            {
            // InternalSoalDsl.g:1563:2: (enumLiteral_0= 'SOAP' )
            // InternalSoalDsl.g:1564:3: enumLiteral_0= 'SOAP'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

            			current = grammarAccess.getSoapBindingKindAccess().getSOAPEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSoapBindingKindAccess().getSOAPEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSoapBindingKind"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\uffff\15\16\2\uffff\1\22\2\uffff\1\16";
    static final String dfa_3s = "\16\4\2\uffff\2\4\1\uffff\1\4";
    static final String dfa_4s = "\1\54\14\40\1\55\2\uffff\1\36\1\4\1\uffff\1\55";
    static final String dfa_5s = "\16\uffff\1\3\1\1\2\uffff\1\2\1\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\34\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20",
            "\1\16\31\uffff\1\17\1\uffff\1\20\14\uffff\1\21",
            "",
            "",
            "\1\22\31\uffff\1\17",
            "\1\23",
            "",
            "\1\16\31\uffff\1\17\1\uffff\1\20\14\uffff\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1206:2: (this_ArrayType_0= ruleArrayType | this_NullableType_1= ruleNullableType | this_SimpleTypeReference_2= ruleSimpleTypeReference )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\15\36\2\uffff\1\4\1\36";
    static final String dfa_10s = "\1\54\14\40\1\55\2\uffff\1\4\1\55";
    static final String dfa_11s = "\16\uffff\1\2\1\1\2\uffff";
    static final String dfa_12s = "\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\15\34\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16\14\uffff\1\20",
            "",
            "",
            "\1\21",
            "\1\17\1\uffff\1\16\14\uffff\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1251:2: ( ( () ( ( ruleSimpleTypeName ) ) otherlv_2= '[' otherlv_3= ']' ) | ( () ( (lv_innerType_5_0= ruleNullableType ) ) otherlv_6= '[' otherlv_7= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010146002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010144002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FFE00020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001FFE0B620010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001FFE0B020010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001FFE0B000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001FFE04000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001FFE00000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});

}