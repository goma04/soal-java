package soal.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import soal.dsl.services.SoalDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REST'", "'SOAP'", "'object'", "'binary'", "'bool'", "'string'", "'int'", "'long'", "'float'", "'double'", "'date'", "'time'", "'datetime'", "'duration'", "'description'", "';'", "'import'", "'enum'", "'{'", "'}'", "','", "'struct'", "':'", "'interface'", "'resource'", "'throws'", "'('", "')'", "'void'", "'service'", "'binding'", "'['", "']'", "'?'", "'.'", "'readonly'", "'async'"
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

    	public void setGrammarAccess(SoalDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSoalModel"
    // InternalSoalDsl.g:53:1: entryRuleSoalModel : ruleSoalModel EOF ;
    public final void entryRuleSoalModel() throws RecognitionException {
        try {
            // InternalSoalDsl.g:54:1: ( ruleSoalModel EOF )
            // InternalSoalDsl.g:55:1: ruleSoalModel EOF
            {
             before(grammarAccess.getSoalModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSoalModel();

            state._fsp--;

             after(grammarAccess.getSoalModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSoalModel"


    // $ANTLR start "ruleSoalModel"
    // InternalSoalDsl.g:62:1: ruleSoalModel : ( ( rule__SoalModel__Group__0 ) ) ;
    public final void ruleSoalModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:66:2: ( ( ( rule__SoalModel__Group__0 ) ) )
            // InternalSoalDsl.g:67:2: ( ( rule__SoalModel__Group__0 ) )
            {
            // InternalSoalDsl.g:67:2: ( ( rule__SoalModel__Group__0 ) )
            // InternalSoalDsl.g:68:3: ( rule__SoalModel__Group__0 )
            {
             before(grammarAccess.getSoalModelAccess().getGroup()); 
            // InternalSoalDsl.g:69:3: ( rule__SoalModel__Group__0 )
            // InternalSoalDsl.g:69:4: rule__SoalModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoalModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoalModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSoalDsl.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:79:1: ( ruleDeclaration EOF )
            // InternalSoalDsl.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalSoalDsl.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalSoalDsl.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalSoalDsl.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalSoalDsl.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalSoalDsl.g:94:3: ( rule__Declaration__Alternatives )
            // InternalSoalDsl.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalSoalDsl.g:103:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:104:1: ( ruleEnumDeclaration EOF )
            // InternalSoalDsl.g:105:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalSoalDsl.g:112:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:116:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:117:2: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:117:2: ( ( rule__EnumDeclaration__Group__0 ) )
            // InternalSoalDsl.g:118:3: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:119:3: ( rule__EnumDeclaration__Group__0 )
            // InternalSoalDsl.g:119:4: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalSoalDsl.g:128:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalSoalDsl.g:129:1: ( ruleEnumLiteral EOF )
            // InternalSoalDsl.g:130:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalSoalDsl.g:137:1: ruleEnumLiteral : ( ( rule__EnumLiteral__NameAssignment ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:141:2: ( ( ( rule__EnumLiteral__NameAssignment ) ) )
            // InternalSoalDsl.g:142:2: ( ( rule__EnumLiteral__NameAssignment ) )
            {
            // InternalSoalDsl.g:142:2: ( ( rule__EnumLiteral__NameAssignment ) )
            // InternalSoalDsl.g:143:3: ( rule__EnumLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 
            // InternalSoalDsl.g:144:3: ( rule__EnumLiteral__NameAssignment )
            // InternalSoalDsl.g:144:4: rule__EnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleStructDeclaration"
    // InternalSoalDsl.g:153:1: entryRuleStructDeclaration : ruleStructDeclaration EOF ;
    public final void entryRuleStructDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:154:1: ( ruleStructDeclaration EOF )
            // InternalSoalDsl.g:155:1: ruleStructDeclaration EOF
            {
             before(grammarAccess.getStructDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStructDeclaration();

            state._fsp--;

             after(grammarAccess.getStructDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructDeclaration"


    // $ANTLR start "ruleStructDeclaration"
    // InternalSoalDsl.g:162:1: ruleStructDeclaration : ( ( rule__StructDeclaration__Group__0 ) ) ;
    public final void ruleStructDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:166:2: ( ( ( rule__StructDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:167:2: ( ( rule__StructDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:167:2: ( ( rule__StructDeclaration__Group__0 ) )
            // InternalSoalDsl.g:168:3: ( rule__StructDeclaration__Group__0 )
            {
             before(grammarAccess.getStructDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:169:3: ( rule__StructDeclaration__Group__0 )
            // InternalSoalDsl.g:169:4: rule__StructDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructDeclaration"


    // $ANTLR start "entryRuleFieldDeclaration"
    // InternalSoalDsl.g:178:1: entryRuleFieldDeclaration : ruleFieldDeclaration EOF ;
    public final void entryRuleFieldDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:179:1: ( ruleFieldDeclaration EOF )
            // InternalSoalDsl.g:180:1: ruleFieldDeclaration EOF
            {
             before(grammarAccess.getFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldDeclaration"


    // $ANTLR start "ruleFieldDeclaration"
    // InternalSoalDsl.g:187:1: ruleFieldDeclaration : ( ( rule__FieldDeclaration__Group__0 ) ) ;
    public final void ruleFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:191:2: ( ( ( rule__FieldDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:192:2: ( ( rule__FieldDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:192:2: ( ( rule__FieldDeclaration__Group__0 ) )
            // InternalSoalDsl.g:193:3: ( rule__FieldDeclaration__Group__0 )
            {
             before(grammarAccess.getFieldDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:194:3: ( rule__FieldDeclaration__Group__0 )
            // InternalSoalDsl.g:194:4: rule__FieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDeclaration"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalSoalDsl.g:203:1: entryRuleInterfaceDeclaration : ruleInterfaceDeclaration EOF ;
    public final void entryRuleInterfaceDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:204:1: ( ruleInterfaceDeclaration EOF )
            // InternalSoalDsl.g:205:1: ruleInterfaceDeclaration EOF
            {
             before(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalSoalDsl.g:212:1: ruleInterfaceDeclaration : ( ( rule__InterfaceDeclaration__Group__0 ) ) ;
    public final void ruleInterfaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:216:2: ( ( ( rule__InterfaceDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:217:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:217:2: ( ( rule__InterfaceDeclaration__Group__0 ) )
            // InternalSoalDsl.g:218:3: ( rule__InterfaceDeclaration__Group__0 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:219:3: ( rule__InterfaceDeclaration__Group__0 )
            // InternalSoalDsl.g:219:4: rule__InterfaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleResourceDeclaration"
    // InternalSoalDsl.g:228:1: entryRuleResourceDeclaration : ruleResourceDeclaration EOF ;
    public final void entryRuleResourceDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:229:1: ( ruleResourceDeclaration EOF )
            // InternalSoalDsl.g:230:1: ruleResourceDeclaration EOF
            {
             before(grammarAccess.getResourceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleResourceDeclaration();

            state._fsp--;

             after(grammarAccess.getResourceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourceDeclaration"


    // $ANTLR start "ruleResourceDeclaration"
    // InternalSoalDsl.g:237:1: ruleResourceDeclaration : ( ( rule__ResourceDeclaration__Group__0 ) ) ;
    public final void ruleResourceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:241:2: ( ( ( rule__ResourceDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:242:2: ( ( rule__ResourceDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:242:2: ( ( rule__ResourceDeclaration__Group__0 ) )
            // InternalSoalDsl.g:243:3: ( rule__ResourceDeclaration__Group__0 )
            {
             before(grammarAccess.getResourceDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:244:3: ( rule__ResourceDeclaration__Group__0 )
            // InternalSoalDsl.g:244:4: rule__ResourceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceDeclaration"


    // $ANTLR start "entryRuleOperationDeclaration"
    // InternalSoalDsl.g:253:1: entryRuleOperationDeclaration : ruleOperationDeclaration EOF ;
    public final void entryRuleOperationDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:254:1: ( ruleOperationDeclaration EOF )
            // InternalSoalDsl.g:255:1: ruleOperationDeclaration EOF
            {
             before(grammarAccess.getOperationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // InternalSoalDsl.g:262:1: ruleOperationDeclaration : ( ( rule__OperationDeclaration__Group__0 ) ) ;
    public final void ruleOperationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:266:2: ( ( ( rule__OperationDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:267:2: ( ( rule__OperationDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:267:2: ( ( rule__OperationDeclaration__Group__0 ) )
            // InternalSoalDsl.g:268:3: ( rule__OperationDeclaration__Group__0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:269:3: ( rule__OperationDeclaration__Group__0 )
            // InternalSoalDsl.g:269:4: rule__OperationDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleInputParameterList"
    // InternalSoalDsl.g:278:1: entryRuleInputParameterList : ruleInputParameterList EOF ;
    public final void entryRuleInputParameterList() throws RecognitionException {
        try {
            // InternalSoalDsl.g:279:1: ( ruleInputParameterList EOF )
            // InternalSoalDsl.g:280:1: ruleInputParameterList EOF
            {
             before(grammarAccess.getInputParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleInputParameterList();

            state._fsp--;

             after(grammarAccess.getInputParameterListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputParameterList"


    // $ANTLR start "ruleInputParameterList"
    // InternalSoalDsl.g:287:1: ruleInputParameterList : ( ( rule__InputParameterList__Group__0 ) ) ;
    public final void ruleInputParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:291:2: ( ( ( rule__InputParameterList__Group__0 ) ) )
            // InternalSoalDsl.g:292:2: ( ( rule__InputParameterList__Group__0 ) )
            {
            // InternalSoalDsl.g:292:2: ( ( rule__InputParameterList__Group__0 ) )
            // InternalSoalDsl.g:293:3: ( rule__InputParameterList__Group__0 )
            {
             before(grammarAccess.getInputParameterListAccess().getGroup()); 
            // InternalSoalDsl.g:294:3: ( rule__InputParameterList__Group__0 )
            // InternalSoalDsl.g:294:4: rule__InputParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputParameterList"


    // $ANTLR start "entryRuleOutputParameterList"
    // InternalSoalDsl.g:303:1: entryRuleOutputParameterList : ruleOutputParameterList EOF ;
    public final void entryRuleOutputParameterList() throws RecognitionException {
        try {
            // InternalSoalDsl.g:304:1: ( ruleOutputParameterList EOF )
            // InternalSoalDsl.g:305:1: ruleOutputParameterList EOF
            {
             before(grammarAccess.getOutputParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputParameterList();

            state._fsp--;

             after(grammarAccess.getOutputParameterListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputParameterList"


    // $ANTLR start "ruleOutputParameterList"
    // InternalSoalDsl.g:312:1: ruleOutputParameterList : ( ( rule__OutputParameterList__Alternatives ) ) ;
    public final void ruleOutputParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:316:2: ( ( ( rule__OutputParameterList__Alternatives ) ) )
            // InternalSoalDsl.g:317:2: ( ( rule__OutputParameterList__Alternatives ) )
            {
            // InternalSoalDsl.g:317:2: ( ( rule__OutputParameterList__Alternatives ) )
            // InternalSoalDsl.g:318:3: ( rule__OutputParameterList__Alternatives )
            {
             before(grammarAccess.getOutputParameterListAccess().getAlternatives()); 
            // InternalSoalDsl.g:319:3: ( rule__OutputParameterList__Alternatives )
            // InternalSoalDsl.g:319:4: rule__OutputParameterList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutputParameterListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalSoalDsl.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSoalDsl.g:329:1: ( ruleParameter EOF )
            // InternalSoalDsl.g:330:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSoalDsl.g:337:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:341:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSoalDsl.g:342:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSoalDsl.g:342:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSoalDsl.g:343:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSoalDsl.g:344:3: ( rule__Parameter__Group__0 )
            // InternalSoalDsl.g:344:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSingleReturnParameter"
    // InternalSoalDsl.g:353:1: entryRuleSingleReturnParameter : ruleSingleReturnParameter EOF ;
    public final void entryRuleSingleReturnParameter() throws RecognitionException {
        try {
            // InternalSoalDsl.g:354:1: ( ruleSingleReturnParameter EOF )
            // InternalSoalDsl.g:355:1: ruleSingleReturnParameter EOF
            {
             before(grammarAccess.getSingleReturnParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleReturnParameter();

            state._fsp--;

             after(grammarAccess.getSingleReturnParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleReturnParameter"


    // $ANTLR start "ruleSingleReturnParameter"
    // InternalSoalDsl.g:362:1: ruleSingleReturnParameter : ( ( rule__SingleReturnParameter__TypeReferenceAssignment ) ) ;
    public final void ruleSingleReturnParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:366:2: ( ( ( rule__SingleReturnParameter__TypeReferenceAssignment ) ) )
            // InternalSoalDsl.g:367:2: ( ( rule__SingleReturnParameter__TypeReferenceAssignment ) )
            {
            // InternalSoalDsl.g:367:2: ( ( rule__SingleReturnParameter__TypeReferenceAssignment ) )
            // InternalSoalDsl.g:368:3: ( rule__SingleReturnParameter__TypeReferenceAssignment )
            {
             before(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceAssignment()); 
            // InternalSoalDsl.g:369:3: ( rule__SingleReturnParameter__TypeReferenceAssignment )
            // InternalSoalDsl.g:369:4: rule__SingleReturnParameter__TypeReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SingleReturnParameter__TypeReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleReturnParameter"


    // $ANTLR start "entryRuleServiceDeclaration"
    // InternalSoalDsl.g:378:1: entryRuleServiceDeclaration : ruleServiceDeclaration EOF ;
    public final void entryRuleServiceDeclaration() throws RecognitionException {
        try {
            // InternalSoalDsl.g:379:1: ( ruleServiceDeclaration EOF )
            // InternalSoalDsl.g:380:1: ruleServiceDeclaration EOF
            {
             before(grammarAccess.getServiceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceDeclaration();

            state._fsp--;

             after(grammarAccess.getServiceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceDeclaration"


    // $ANTLR start "ruleServiceDeclaration"
    // InternalSoalDsl.g:387:1: ruleServiceDeclaration : ( ( rule__ServiceDeclaration__Group__0 ) ) ;
    public final void ruleServiceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:391:2: ( ( ( rule__ServiceDeclaration__Group__0 ) ) )
            // InternalSoalDsl.g:392:2: ( ( rule__ServiceDeclaration__Group__0 ) )
            {
            // InternalSoalDsl.g:392:2: ( ( rule__ServiceDeclaration__Group__0 ) )
            // InternalSoalDsl.g:393:3: ( rule__ServiceDeclaration__Group__0 )
            {
             before(grammarAccess.getServiceDeclarationAccess().getGroup()); 
            // InternalSoalDsl.g:394:3: ( rule__ServiceDeclaration__Group__0 )
            // InternalSoalDsl.g:394:4: rule__ServiceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceDeclaration"


    // $ANTLR start "entryRuleTypeReference"
    // InternalSoalDsl.g:403:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalSoalDsl.g:404:1: ( ruleTypeReference EOF )
            // InternalSoalDsl.g:405:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalSoalDsl.g:412:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:416:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalSoalDsl.g:417:2: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalSoalDsl.g:417:2: ( ( rule__TypeReference__Alternatives ) )
            // InternalSoalDsl.g:418:3: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalSoalDsl.g:419:3: ( rule__TypeReference__Alternatives )
            // InternalSoalDsl.g:419:4: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleArrayType"
    // InternalSoalDsl.g:428:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalSoalDsl.g:429:1: ( ruleArrayType EOF )
            // InternalSoalDsl.g:430:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalSoalDsl.g:437:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:441:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalSoalDsl.g:442:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalSoalDsl.g:442:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalSoalDsl.g:443:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalSoalDsl.g:444:3: ( rule__ArrayType__Alternatives )
            // InternalSoalDsl.g:444:4: rule__ArrayType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleNullableType"
    // InternalSoalDsl.g:453:1: entryRuleNullableType : ruleNullableType EOF ;
    public final void entryRuleNullableType() throws RecognitionException {
        try {
            // InternalSoalDsl.g:454:1: ( ruleNullableType EOF )
            // InternalSoalDsl.g:455:1: ruleNullableType EOF
            {
             before(grammarAccess.getNullableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNullableType();

            state._fsp--;

             after(grammarAccess.getNullableTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullableType"


    // $ANTLR start "ruleNullableType"
    // InternalSoalDsl.g:462:1: ruleNullableType : ( ( rule__NullableType__Group__0 ) ) ;
    public final void ruleNullableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:466:2: ( ( ( rule__NullableType__Group__0 ) ) )
            // InternalSoalDsl.g:467:2: ( ( rule__NullableType__Group__0 ) )
            {
            // InternalSoalDsl.g:467:2: ( ( rule__NullableType__Group__0 ) )
            // InternalSoalDsl.g:468:3: ( rule__NullableType__Group__0 )
            {
             before(grammarAccess.getNullableTypeAccess().getGroup()); 
            // InternalSoalDsl.g:469:3: ( rule__NullableType__Group__0 )
            // InternalSoalDsl.g:469:4: rule__NullableType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullableType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullableTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullableType"


    // $ANTLR start "entryRuleSimpleTypeReference"
    // InternalSoalDsl.g:478:1: entryRuleSimpleTypeReference : ruleSimpleTypeReference EOF ;
    public final void entryRuleSimpleTypeReference() throws RecognitionException {
        try {
            // InternalSoalDsl.g:479:1: ( ruleSimpleTypeReference EOF )
            // InternalSoalDsl.g:480:1: ruleSimpleTypeReference EOF
            {
             before(grammarAccess.getSimpleTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypeReference();

            state._fsp--;

             after(grammarAccess.getSimpleTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleTypeReference"


    // $ANTLR start "ruleSimpleTypeReference"
    // InternalSoalDsl.g:487:1: ruleSimpleTypeReference : ( ( rule__SimpleTypeReference__ReferencedTypeAssignment ) ) ;
    public final void ruleSimpleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:491:2: ( ( ( rule__SimpleTypeReference__ReferencedTypeAssignment ) ) )
            // InternalSoalDsl.g:492:2: ( ( rule__SimpleTypeReference__ReferencedTypeAssignment ) )
            {
            // InternalSoalDsl.g:492:2: ( ( rule__SimpleTypeReference__ReferencedTypeAssignment ) )
            // InternalSoalDsl.g:493:3: ( rule__SimpleTypeReference__ReferencedTypeAssignment )
            {
             before(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeAssignment()); 
            // InternalSoalDsl.g:494:3: ( rule__SimpleTypeReference__ReferencedTypeAssignment )
            // InternalSoalDsl.g:494:4: rule__SimpleTypeReference__ReferencedTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeReference__ReferencedTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypeReference"


    // $ANTLR start "entryRuleSimpleTypeName"
    // InternalSoalDsl.g:503:1: entryRuleSimpleTypeName : ruleSimpleTypeName EOF ;
    public final void entryRuleSimpleTypeName() throws RecognitionException {
        try {
            // InternalSoalDsl.g:504:1: ( ruleSimpleTypeName EOF )
            // InternalSoalDsl.g:505:1: ruleSimpleTypeName EOF
            {
             before(grammarAccess.getSimpleTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypeName();

            state._fsp--;

             after(grammarAccess.getSimpleTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleTypeName"


    // $ANTLR start "ruleSimpleTypeName"
    // InternalSoalDsl.g:512:1: ruleSimpleTypeName : ( ( rule__SimpleTypeName__Alternatives ) ) ;
    public final void ruleSimpleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:516:2: ( ( ( rule__SimpleTypeName__Alternatives ) ) )
            // InternalSoalDsl.g:517:2: ( ( rule__SimpleTypeName__Alternatives ) )
            {
            // InternalSoalDsl.g:517:2: ( ( rule__SimpleTypeName__Alternatives ) )
            // InternalSoalDsl.g:518:3: ( rule__SimpleTypeName__Alternatives )
            {
             before(grammarAccess.getSimpleTypeNameAccess().getAlternatives()); 
            // InternalSoalDsl.g:519:3: ( rule__SimpleTypeName__Alternatives )
            // InternalSoalDsl.g:519:4: rule__SimpleTypeName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypeName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSoalDsl.g:528:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSoalDsl.g:529:1: ( ruleQualifiedName EOF )
            // InternalSoalDsl.g:530:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSoalDsl.g:537:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:541:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSoalDsl.g:542:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSoalDsl.g:542:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSoalDsl.g:543:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSoalDsl.g:544:3: ( rule__QualifiedName__Group__0 )
            // InternalSoalDsl.g:544:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRestBindingKind"
    // InternalSoalDsl.g:553:1: ruleRestBindingKind : ( ( 'REST' ) ) ;
    public final void ruleRestBindingKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:557:1: ( ( ( 'REST' ) ) )
            // InternalSoalDsl.g:558:2: ( ( 'REST' ) )
            {
            // InternalSoalDsl.g:558:2: ( ( 'REST' ) )
            // InternalSoalDsl.g:559:3: ( 'REST' )
            {
             before(grammarAccess.getRestBindingKindAccess().getRESTEnumLiteralDeclaration()); 
            // InternalSoalDsl.g:560:3: ( 'REST' )
            // InternalSoalDsl.g:560:4: 'REST'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getRestBindingKindAccess().getRESTEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestBindingKind"


    // $ANTLR start "ruleSoapBindingKind"
    // InternalSoalDsl.g:569:1: ruleSoapBindingKind : ( ( 'SOAP' ) ) ;
    public final void ruleSoapBindingKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:573:1: ( ( ( 'SOAP' ) ) )
            // InternalSoalDsl.g:574:2: ( ( 'SOAP' ) )
            {
            // InternalSoalDsl.g:574:2: ( ( 'SOAP' ) )
            // InternalSoalDsl.g:575:3: ( 'SOAP' )
            {
             before(grammarAccess.getSoapBindingKindAccess().getSOAPEnumLiteralDeclaration()); 
            // InternalSoalDsl.g:576:3: ( 'SOAP' )
            // InternalSoalDsl.g:576:4: 'SOAP'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getSoapBindingKindAccess().getSOAPEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoapBindingKind"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalSoalDsl.g:584:1: rule__Declaration__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleStructDeclaration ) | ( ruleInterfaceDeclaration ) | ( ruleServiceDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:588:1: ( ( ruleEnumDeclaration ) | ( ruleStructDeclaration ) | ( ruleInterfaceDeclaration ) | ( ruleServiceDeclaration ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 40:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSoalDsl.g:589:2: ( ruleEnumDeclaration )
                    {
                    // InternalSoalDsl.g:589:2: ( ruleEnumDeclaration )
                    // InternalSoalDsl.g:590:3: ruleEnumDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:595:2: ( ruleStructDeclaration )
                    {
                    // InternalSoalDsl.g:595:2: ( ruleStructDeclaration )
                    // InternalSoalDsl.g:596:3: ruleStructDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getStructDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStructDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getStructDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:601:2: ( ruleInterfaceDeclaration )
                    {
                    // InternalSoalDsl.g:601:2: ( ruleInterfaceDeclaration )
                    // InternalSoalDsl.g:602:3: ruleInterfaceDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getInterfaceDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getInterfaceDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSoalDsl.g:607:2: ( ruleServiceDeclaration )
                    {
                    // InternalSoalDsl.g:607:2: ( ruleServiceDeclaration )
                    // InternalSoalDsl.g:608:3: ruleServiceDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getServiceDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleServiceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getServiceDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__OutputParameterList__Alternatives"
    // InternalSoalDsl.g:617:1: rule__OutputParameterList__Alternatives : ( ( ( rule__OutputParameterList__Group_0__0 ) ) | ( ( rule__OutputParameterList__Group_1__0 ) ) | ( ( rule__OutputParameterList__Group_2__0 ) ) );
    public final void rule__OutputParameterList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:621:1: ( ( ( rule__OutputParameterList__Group_0__0 ) ) | ( ( rule__OutputParameterList__Group_1__0 ) ) | ( ( rule__OutputParameterList__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSoalDsl.g:622:2: ( ( rule__OutputParameterList__Group_0__0 ) )
                    {
                    // InternalSoalDsl.g:622:2: ( ( rule__OutputParameterList__Group_0__0 ) )
                    // InternalSoalDsl.g:623:3: ( rule__OutputParameterList__Group_0__0 )
                    {
                     before(grammarAccess.getOutputParameterListAccess().getGroup_0()); 
                    // InternalSoalDsl.g:624:3: ( rule__OutputParameterList__Group_0__0 )
                    // InternalSoalDsl.g:624:4: rule__OutputParameterList__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputParameterList__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputParameterListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:628:2: ( ( rule__OutputParameterList__Group_1__0 ) )
                    {
                    // InternalSoalDsl.g:628:2: ( ( rule__OutputParameterList__Group_1__0 ) )
                    // InternalSoalDsl.g:629:3: ( rule__OutputParameterList__Group_1__0 )
                    {
                     before(grammarAccess.getOutputParameterListAccess().getGroup_1()); 
                    // InternalSoalDsl.g:630:3: ( rule__OutputParameterList__Group_1__0 )
                    // InternalSoalDsl.g:630:4: rule__OutputParameterList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputParameterList__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputParameterListAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:634:2: ( ( rule__OutputParameterList__Group_2__0 ) )
                    {
                    // InternalSoalDsl.g:634:2: ( ( rule__OutputParameterList__Group_2__0 ) )
                    // InternalSoalDsl.g:635:3: ( rule__OutputParameterList__Group_2__0 )
                    {
                     before(grammarAccess.getOutputParameterListAccess().getGroup_2()); 
                    // InternalSoalDsl.g:636:3: ( rule__OutputParameterList__Group_2__0 )
                    // InternalSoalDsl.g:636:4: rule__OutputParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputParameterList__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputParameterListAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Alternatives"


    // $ANTLR start "rule__ServiceDeclaration__BindingAlternatives_6_0"
    // InternalSoalDsl.g:644:1: rule__ServiceDeclaration__BindingAlternatives_6_0 : ( ( ruleRestBindingKind ) | ( ruleSoapBindingKind ) );
    public final void rule__ServiceDeclaration__BindingAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:648:1: ( ( ruleRestBindingKind ) | ( ruleSoapBindingKind ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSoalDsl.g:649:2: ( ruleRestBindingKind )
                    {
                    // InternalSoalDsl.g:649:2: ( ruleRestBindingKind )
                    // InternalSoalDsl.g:650:3: ruleRestBindingKind
                    {
                     before(grammarAccess.getServiceDeclarationAccess().getBindingRestBindingKindEnumRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRestBindingKind();

                    state._fsp--;

                     after(grammarAccess.getServiceDeclarationAccess().getBindingRestBindingKindEnumRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:655:2: ( ruleSoapBindingKind )
                    {
                    // InternalSoalDsl.g:655:2: ( ruleSoapBindingKind )
                    // InternalSoalDsl.g:656:3: ruleSoapBindingKind
                    {
                     before(grammarAccess.getServiceDeclarationAccess().getBindingSoapBindingKindEnumRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSoapBindingKind();

                    state._fsp--;

                     after(grammarAccess.getServiceDeclarationAccess().getBindingSoapBindingKindEnumRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__BindingAlternatives_6_0"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalSoalDsl.g:665:1: rule__TypeReference__Alternatives : ( ( ruleArrayType ) | ( ruleNullableType ) | ( ruleSimpleTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:669:1: ( ( ruleArrayType ) | ( ruleNullableType ) | ( ruleSimpleTypeReference ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSoalDsl.g:670:2: ( ruleArrayType )
                    {
                    // InternalSoalDsl.g:670:2: ( ruleArrayType )
                    // InternalSoalDsl.g:671:3: ruleArrayType
                    {
                     before(grammarAccess.getTypeReferenceAccess().getArrayTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getArrayTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:676:2: ( ruleNullableType )
                    {
                    // InternalSoalDsl.g:676:2: ( ruleNullableType )
                    // InternalSoalDsl.g:677:3: ruleNullableType
                    {
                     before(grammarAccess.getTypeReferenceAccess().getNullableTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNullableType();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getNullableTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:682:2: ( ruleSimpleTypeReference )
                    {
                    // InternalSoalDsl.g:682:2: ( ruleSimpleTypeReference )
                    // InternalSoalDsl.g:683:3: ruleSimpleTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getSimpleTypeReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getSimpleTypeReferenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__ArrayType__Alternatives"
    // InternalSoalDsl.g:692:1: rule__ArrayType__Alternatives : ( ( ( rule__ArrayType__Group_0__0 ) ) | ( ( rule__ArrayType__Group_1__0 ) ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:696:1: ( ( ( rule__ArrayType__Group_0__0 ) ) | ( ( rule__ArrayType__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSoalDsl.g:697:2: ( ( rule__ArrayType__Group_0__0 ) )
                    {
                    // InternalSoalDsl.g:697:2: ( ( rule__ArrayType__Group_0__0 ) )
                    // InternalSoalDsl.g:698:3: ( rule__ArrayType__Group_0__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_0()); 
                    // InternalSoalDsl.g:699:3: ( rule__ArrayType__Group_0__0 )
                    // InternalSoalDsl.g:699:4: rule__ArrayType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:703:2: ( ( rule__ArrayType__Group_1__0 ) )
                    {
                    // InternalSoalDsl.g:703:2: ( ( rule__ArrayType__Group_1__0 ) )
                    // InternalSoalDsl.g:704:3: ( rule__ArrayType__Group_1__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
                    // InternalSoalDsl.g:705:3: ( rule__ArrayType__Group_1__0 )
                    // InternalSoalDsl.g:705:4: rule__ArrayType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Alternatives"


    // $ANTLR start "rule__SimpleTypeName__Alternatives"
    // InternalSoalDsl.g:713:1: rule__SimpleTypeName__Alternatives : ( ( 'object' ) | ( 'binary' ) | ( 'bool' ) | ( 'string' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'date' ) | ( 'time' ) | ( 'datetime' ) | ( 'duration' ) | ( ruleQualifiedName ) );
    public final void rule__SimpleTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:717:1: ( ( 'object' ) | ( 'binary' ) | ( 'bool' ) | ( 'string' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'date' ) | ( 'time' ) | ( 'datetime' ) | ( 'duration' ) | ( ruleQualifiedName ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            case 23:
                {
                alt6=11;
                }
                break;
            case 24:
                {
                alt6=12;
                }
                break;
            case RULE_ID:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSoalDsl.g:718:2: ( 'object' )
                    {
                    // InternalSoalDsl.g:718:2: ( 'object' )
                    // InternalSoalDsl.g:719:3: 'object'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getObjectKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getObjectKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSoalDsl.g:724:2: ( 'binary' )
                    {
                    // InternalSoalDsl.g:724:2: ( 'binary' )
                    // InternalSoalDsl.g:725:3: 'binary'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getBinaryKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getBinaryKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSoalDsl.g:730:2: ( 'bool' )
                    {
                    // InternalSoalDsl.g:730:2: ( 'bool' )
                    // InternalSoalDsl.g:731:3: 'bool'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getBoolKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getBoolKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSoalDsl.g:736:2: ( 'string' )
                    {
                    // InternalSoalDsl.g:736:2: ( 'string' )
                    // InternalSoalDsl.g:737:3: 'string'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getStringKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getStringKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSoalDsl.g:742:2: ( 'int' )
                    {
                    // InternalSoalDsl.g:742:2: ( 'int' )
                    // InternalSoalDsl.g:743:3: 'int'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getIntKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSoalDsl.g:748:2: ( 'long' )
                    {
                    // InternalSoalDsl.g:748:2: ( 'long' )
                    // InternalSoalDsl.g:749:3: 'long'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getLongKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getLongKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSoalDsl.g:754:2: ( 'float' )
                    {
                    // InternalSoalDsl.g:754:2: ( 'float' )
                    // InternalSoalDsl.g:755:3: 'float'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getFloatKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getFloatKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSoalDsl.g:760:2: ( 'double' )
                    {
                    // InternalSoalDsl.g:760:2: ( 'double' )
                    // InternalSoalDsl.g:761:3: 'double'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getDoubleKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getDoubleKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSoalDsl.g:766:2: ( 'date' )
                    {
                    // InternalSoalDsl.g:766:2: ( 'date' )
                    // InternalSoalDsl.g:767:3: 'date'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getDateKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getDateKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSoalDsl.g:772:2: ( 'time' )
                    {
                    // InternalSoalDsl.g:772:2: ( 'time' )
                    // InternalSoalDsl.g:773:3: 'time'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getTimeKeyword_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getTimeKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSoalDsl.g:778:2: ( 'datetime' )
                    {
                    // InternalSoalDsl.g:778:2: ( 'datetime' )
                    // InternalSoalDsl.g:779:3: 'datetime'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getDatetimeKeyword_10()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getDatetimeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSoalDsl.g:784:2: ( 'duration' )
                    {
                    // InternalSoalDsl.g:784:2: ( 'duration' )
                    // InternalSoalDsl.g:785:3: 'duration'
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getDurationKeyword_11()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSimpleTypeNameAccess().getDurationKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSoalDsl.g:790:2: ( ruleQualifiedName )
                    {
                    // InternalSoalDsl.g:790:2: ( ruleQualifiedName )
                    // InternalSoalDsl.g:791:3: ruleQualifiedName
                    {
                     before(grammarAccess.getSimpleTypeNameAccess().getQualifiedNameParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getSimpleTypeNameAccess().getQualifiedNameParserRuleCall_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeName__Alternatives"


    // $ANTLR start "rule__SoalModel__Group__0"
    // InternalSoalDsl.g:800:1: rule__SoalModel__Group__0 : rule__SoalModel__Group__0__Impl rule__SoalModel__Group__1 ;
    public final void rule__SoalModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:804:1: ( rule__SoalModel__Group__0__Impl rule__SoalModel__Group__1 )
            // InternalSoalDsl.g:805:2: rule__SoalModel__Group__0__Impl rule__SoalModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SoalModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__0"


    // $ANTLR start "rule__SoalModel__Group__0__Impl"
    // InternalSoalDsl.g:812:1: rule__SoalModel__Group__0__Impl : ( 'description' ) ;
    public final void rule__SoalModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:816:1: ( ( 'description' ) )
            // InternalSoalDsl.g:817:1: ( 'description' )
            {
            // InternalSoalDsl.g:817:1: ( 'description' )
            // InternalSoalDsl.g:818:2: 'description'
            {
             before(grammarAccess.getSoalModelAccess().getDescriptionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__0__Impl"


    // $ANTLR start "rule__SoalModel__Group__1"
    // InternalSoalDsl.g:827:1: rule__SoalModel__Group__1 : rule__SoalModel__Group__1__Impl rule__SoalModel__Group__2 ;
    public final void rule__SoalModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:831:1: ( rule__SoalModel__Group__1__Impl rule__SoalModel__Group__2 )
            // InternalSoalDsl.g:832:2: rule__SoalModel__Group__1__Impl rule__SoalModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SoalModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__1"


    // $ANTLR start "rule__SoalModel__Group__1__Impl"
    // InternalSoalDsl.g:839:1: rule__SoalModel__Group__1__Impl : ( ( rule__SoalModel__NameAssignment_1 ) ) ;
    public final void rule__SoalModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:843:1: ( ( ( rule__SoalModel__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:844:1: ( ( rule__SoalModel__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:844:1: ( ( rule__SoalModel__NameAssignment_1 ) )
            // InternalSoalDsl.g:845:2: ( rule__SoalModel__NameAssignment_1 )
            {
             before(grammarAccess.getSoalModelAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:846:2: ( rule__SoalModel__NameAssignment_1 )
            // InternalSoalDsl.g:846:3: rule__SoalModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SoalModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSoalModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__1__Impl"


    // $ANTLR start "rule__SoalModel__Group__2"
    // InternalSoalDsl.g:854:1: rule__SoalModel__Group__2 : rule__SoalModel__Group__2__Impl rule__SoalModel__Group__3 ;
    public final void rule__SoalModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:858:1: ( rule__SoalModel__Group__2__Impl rule__SoalModel__Group__3 )
            // InternalSoalDsl.g:859:2: rule__SoalModel__Group__2__Impl rule__SoalModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SoalModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__2"


    // $ANTLR start "rule__SoalModel__Group__2__Impl"
    // InternalSoalDsl.g:866:1: rule__SoalModel__Group__2__Impl : ( ';' ) ;
    public final void rule__SoalModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:870:1: ( ( ';' ) )
            // InternalSoalDsl.g:871:1: ( ';' )
            {
            // InternalSoalDsl.g:871:1: ( ';' )
            // InternalSoalDsl.g:872:2: ';'
            {
             before(grammarAccess.getSoalModelAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__2__Impl"


    // $ANTLR start "rule__SoalModel__Group__3"
    // InternalSoalDsl.g:881:1: rule__SoalModel__Group__3 : rule__SoalModel__Group__3__Impl rule__SoalModel__Group__4 ;
    public final void rule__SoalModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:885:1: ( rule__SoalModel__Group__3__Impl rule__SoalModel__Group__4 )
            // InternalSoalDsl.g:886:2: rule__SoalModel__Group__3__Impl rule__SoalModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SoalModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__3"


    // $ANTLR start "rule__SoalModel__Group__3__Impl"
    // InternalSoalDsl.g:893:1: rule__SoalModel__Group__3__Impl : ( ( rule__SoalModel__Group_3__0 )* ) ;
    public final void rule__SoalModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:897:1: ( ( ( rule__SoalModel__Group_3__0 )* ) )
            // InternalSoalDsl.g:898:1: ( ( rule__SoalModel__Group_3__0 )* )
            {
            // InternalSoalDsl.g:898:1: ( ( rule__SoalModel__Group_3__0 )* )
            // InternalSoalDsl.g:899:2: ( rule__SoalModel__Group_3__0 )*
            {
             before(grammarAccess.getSoalModelAccess().getGroup_3()); 
            // InternalSoalDsl.g:900:2: ( rule__SoalModel__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSoalDsl.g:900:3: rule__SoalModel__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SoalModel__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSoalModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__3__Impl"


    // $ANTLR start "rule__SoalModel__Group__4"
    // InternalSoalDsl.g:908:1: rule__SoalModel__Group__4 : rule__SoalModel__Group__4__Impl ;
    public final void rule__SoalModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:912:1: ( rule__SoalModel__Group__4__Impl )
            // InternalSoalDsl.g:913:2: rule__SoalModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoalModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__4"


    // $ANTLR start "rule__SoalModel__Group__4__Impl"
    // InternalSoalDsl.g:919:1: rule__SoalModel__Group__4__Impl : ( ( rule__SoalModel__DeclarationsAssignment_4 )* ) ;
    public final void rule__SoalModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:923:1: ( ( ( rule__SoalModel__DeclarationsAssignment_4 )* ) )
            // InternalSoalDsl.g:924:1: ( ( rule__SoalModel__DeclarationsAssignment_4 )* )
            {
            // InternalSoalDsl.g:924:1: ( ( rule__SoalModel__DeclarationsAssignment_4 )* )
            // InternalSoalDsl.g:925:2: ( rule__SoalModel__DeclarationsAssignment_4 )*
            {
             before(grammarAccess.getSoalModelAccess().getDeclarationsAssignment_4()); 
            // InternalSoalDsl.g:926:2: ( rule__SoalModel__DeclarationsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==32||LA8_0==34||LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSoalDsl.g:926:3: rule__SoalModel__DeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SoalModel__DeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSoalModelAccess().getDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group__4__Impl"


    // $ANTLR start "rule__SoalModel__Group_3__0"
    // InternalSoalDsl.g:935:1: rule__SoalModel__Group_3__0 : rule__SoalModel__Group_3__0__Impl rule__SoalModel__Group_3__1 ;
    public final void rule__SoalModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:939:1: ( rule__SoalModel__Group_3__0__Impl rule__SoalModel__Group_3__1 )
            // InternalSoalDsl.g:940:2: rule__SoalModel__Group_3__0__Impl rule__SoalModel__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SoalModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__0"


    // $ANTLR start "rule__SoalModel__Group_3__0__Impl"
    // InternalSoalDsl.g:947:1: rule__SoalModel__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__SoalModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:951:1: ( ( 'import' ) )
            // InternalSoalDsl.g:952:1: ( 'import' )
            {
            // InternalSoalDsl.g:952:1: ( 'import' )
            // InternalSoalDsl.g:953:2: 'import'
            {
             before(grammarAccess.getSoalModelAccess().getImportKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getImportKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__0__Impl"


    // $ANTLR start "rule__SoalModel__Group_3__1"
    // InternalSoalDsl.g:962:1: rule__SoalModel__Group_3__1 : rule__SoalModel__Group_3__1__Impl rule__SoalModel__Group_3__2 ;
    public final void rule__SoalModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:966:1: ( rule__SoalModel__Group_3__1__Impl rule__SoalModel__Group_3__2 )
            // InternalSoalDsl.g:967:2: rule__SoalModel__Group_3__1__Impl rule__SoalModel__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__SoalModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoalModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__1"


    // $ANTLR start "rule__SoalModel__Group_3__1__Impl"
    // InternalSoalDsl.g:974:1: rule__SoalModel__Group_3__1__Impl : ( ( rule__SoalModel__ImportsAssignment_3_1 ) ) ;
    public final void rule__SoalModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:978:1: ( ( ( rule__SoalModel__ImportsAssignment_3_1 ) ) )
            // InternalSoalDsl.g:979:1: ( ( rule__SoalModel__ImportsAssignment_3_1 ) )
            {
            // InternalSoalDsl.g:979:1: ( ( rule__SoalModel__ImportsAssignment_3_1 ) )
            // InternalSoalDsl.g:980:2: ( rule__SoalModel__ImportsAssignment_3_1 )
            {
             before(grammarAccess.getSoalModelAccess().getImportsAssignment_3_1()); 
            // InternalSoalDsl.g:981:2: ( rule__SoalModel__ImportsAssignment_3_1 )
            // InternalSoalDsl.g:981:3: rule__SoalModel__ImportsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SoalModel__ImportsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSoalModelAccess().getImportsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__1__Impl"


    // $ANTLR start "rule__SoalModel__Group_3__2"
    // InternalSoalDsl.g:989:1: rule__SoalModel__Group_3__2 : rule__SoalModel__Group_3__2__Impl ;
    public final void rule__SoalModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:993:1: ( rule__SoalModel__Group_3__2__Impl )
            // InternalSoalDsl.g:994:2: rule__SoalModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoalModel__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__2"


    // $ANTLR start "rule__SoalModel__Group_3__2__Impl"
    // InternalSoalDsl.g:1000:1: rule__SoalModel__Group_3__2__Impl : ( ';' ) ;
    public final void rule__SoalModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1004:1: ( ( ';' ) )
            // InternalSoalDsl.g:1005:1: ( ';' )
            {
            // InternalSoalDsl.g:1005:1: ( ';' )
            // InternalSoalDsl.g:1006:2: ';'
            {
             before(grammarAccess.getSoalModelAccess().getSemicolonKeyword_3_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__Group_3__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // InternalSoalDsl.g:1016:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1020:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalSoalDsl.g:1021:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:1028:1: rule__EnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1032:1: ( ( 'enum' ) )
            // InternalSoalDsl.g:1033:1: ( 'enum' )
            {
            // InternalSoalDsl.g:1033:1: ( 'enum' )
            // InternalSoalDsl.g:1034:2: 'enum'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // InternalSoalDsl.g:1043:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1047:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalSoalDsl.g:1048:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:1055:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1059:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:1060:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:1060:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // InternalSoalDsl.g:1061:2: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:1062:2: ( rule__EnumDeclaration__NameAssignment_1 )
            // InternalSoalDsl.g:1062:3: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // InternalSoalDsl.g:1070:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1074:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // InternalSoalDsl.g:1075:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:1082:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1086:1: ( ( '{' ) )
            // InternalSoalDsl.g:1087:1: ( '{' )
            {
            // InternalSoalDsl.g:1087:1: ( '{' )
            // InternalSoalDsl.g:1088:2: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // InternalSoalDsl.g:1097:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1101:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // InternalSoalDsl.g:1102:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:1109:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1113:1: ( ( ( rule__EnumDeclaration__Group_3__0 )? ) )
            // InternalSoalDsl.g:1114:1: ( ( rule__EnumDeclaration__Group_3__0 )? )
            {
            // InternalSoalDsl.g:1114:1: ( ( rule__EnumDeclaration__Group_3__0 )? )
            // InternalSoalDsl.g:1115:2: ( rule__EnumDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_3()); 
            // InternalSoalDsl.g:1116:2: ( rule__EnumDeclaration__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSoalDsl.g:1116:3: rule__EnumDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // InternalSoalDsl.g:1124:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1128:1: ( rule__EnumDeclaration__Group__4__Impl )
            // InternalSoalDsl.g:1129:2: rule__EnumDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:1135:1: rule__EnumDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1139:1: ( ( '}' ) )
            // InternalSoalDsl.g:1140:1: ( '}' )
            {
            // InternalSoalDsl.g:1140:1: ( '}' )
            // InternalSoalDsl.g:1141:2: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_3__0"
    // InternalSoalDsl.g:1151:1: rule__EnumDeclaration__Group_3__0 : rule__EnumDeclaration__Group_3__0__Impl rule__EnumDeclaration__Group_3__1 ;
    public final void rule__EnumDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1155:1: ( rule__EnumDeclaration__Group_3__0__Impl rule__EnumDeclaration__Group_3__1 )
            // InternalSoalDsl.g:1156:2: rule__EnumDeclaration__Group_3__0__Impl rule__EnumDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3__0"


    // $ANTLR start "rule__EnumDeclaration__Group_3__0__Impl"
    // InternalSoalDsl.g:1163:1: rule__EnumDeclaration__Group_3__0__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__EnumDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1167:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_3_0 ) ) )
            // InternalSoalDsl.g:1168:1: ( ( rule__EnumDeclaration__LiteralsAssignment_3_0 ) )
            {
            // InternalSoalDsl.g:1168:1: ( ( rule__EnumDeclaration__LiteralsAssignment_3_0 ) )
            // InternalSoalDsl.g:1169:2: ( rule__EnumDeclaration__LiteralsAssignment_3_0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_0()); 
            // InternalSoalDsl.g:1170:2: ( rule__EnumDeclaration__LiteralsAssignment_3_0 )
            // InternalSoalDsl.g:1170:3: rule__EnumDeclaration__LiteralsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__LiteralsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_3__1"
    // InternalSoalDsl.g:1178:1: rule__EnumDeclaration__Group_3__1 : rule__EnumDeclaration__Group_3__1__Impl ;
    public final void rule__EnumDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1182:1: ( rule__EnumDeclaration__Group_3__1__Impl )
            // InternalSoalDsl.g:1183:2: rule__EnumDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3__1"


    // $ANTLR start "rule__EnumDeclaration__Group_3__1__Impl"
    // InternalSoalDsl.g:1189:1: rule__EnumDeclaration__Group_3__1__Impl : ( ( rule__EnumDeclaration__Group_3_1__0 )* ) ;
    public final void rule__EnumDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1193:1: ( ( ( rule__EnumDeclaration__Group_3_1__0 )* ) )
            // InternalSoalDsl.g:1194:1: ( ( rule__EnumDeclaration__Group_3_1__0 )* )
            {
            // InternalSoalDsl.g:1194:1: ( ( rule__EnumDeclaration__Group_3_1__0 )* )
            // InternalSoalDsl.g:1195:2: ( rule__EnumDeclaration__Group_3_1__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_3_1()); 
            // InternalSoalDsl.g:1196:2: ( rule__EnumDeclaration__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSoalDsl.g:1196:3: rule__EnumDeclaration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EnumDeclaration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_3_1__0"
    // InternalSoalDsl.g:1205:1: rule__EnumDeclaration__Group_3_1__0 : rule__EnumDeclaration__Group_3_1__0__Impl rule__EnumDeclaration__Group_3_1__1 ;
    public final void rule__EnumDeclaration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1209:1: ( rule__EnumDeclaration__Group_3_1__0__Impl rule__EnumDeclaration__Group_3_1__1 )
            // InternalSoalDsl.g:1210:2: rule__EnumDeclaration__Group_3_1__0__Impl rule__EnumDeclaration__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumDeclaration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3_1__0"


    // $ANTLR start "rule__EnumDeclaration__Group_3_1__0__Impl"
    // InternalSoalDsl.g:1217:1: rule__EnumDeclaration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1221:1: ( ( ',' ) )
            // InternalSoalDsl.g:1222:1: ( ',' )
            {
            // InternalSoalDsl.g:1222:1: ( ',' )
            // InternalSoalDsl.g:1223:2: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3_1__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_3_1__1"
    // InternalSoalDsl.g:1232:1: rule__EnumDeclaration__Group_3_1__1 : rule__EnumDeclaration__Group_3_1__1__Impl ;
    public final void rule__EnumDeclaration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1236:1: ( rule__EnumDeclaration__Group_3_1__1__Impl )
            // InternalSoalDsl.g:1237:2: rule__EnumDeclaration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3_1__1"


    // $ANTLR start "rule__EnumDeclaration__Group_3_1__1__Impl"
    // InternalSoalDsl.g:1243:1: rule__EnumDeclaration__Group_3_1__1__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 ) ) ;
    public final void rule__EnumDeclaration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1247:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 ) ) )
            // InternalSoalDsl.g:1248:1: ( ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 ) )
            {
            // InternalSoalDsl.g:1248:1: ( ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 ) )
            // InternalSoalDsl.g:1249:2: ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_1_1()); 
            // InternalSoalDsl.g:1250:2: ( rule__EnumDeclaration__LiteralsAssignment_3_1_1 )
            // InternalSoalDsl.g:1250:3: rule__EnumDeclaration__LiteralsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__LiteralsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_3_1__1__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__0"
    // InternalSoalDsl.g:1259:1: rule__StructDeclaration__Group__0 : rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1 ;
    public final void rule__StructDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1263:1: ( rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1 )
            // InternalSoalDsl.g:1264:2: rule__StructDeclaration__Group__0__Impl rule__StructDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StructDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__0"


    // $ANTLR start "rule__StructDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:1271:1: rule__StructDeclaration__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1275:1: ( ( 'struct' ) )
            // InternalSoalDsl.g:1276:1: ( 'struct' )
            {
            // InternalSoalDsl.g:1276:1: ( 'struct' )
            // InternalSoalDsl.g:1277:2: 'struct'
            {
             before(grammarAccess.getStructDeclarationAccess().getStructKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__1"
    // InternalSoalDsl.g:1286:1: rule__StructDeclaration__Group__1 : rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2 ;
    public final void rule__StructDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1290:1: ( rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2 )
            // InternalSoalDsl.g:1291:2: rule__StructDeclaration__Group__1__Impl rule__StructDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StructDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__1"


    // $ANTLR start "rule__StructDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:1298:1: rule__StructDeclaration__Group__1__Impl : ( ( rule__StructDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StructDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1302:1: ( ( ( rule__StructDeclaration__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:1303:1: ( ( rule__StructDeclaration__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:1303:1: ( ( rule__StructDeclaration__NameAssignment_1 ) )
            // InternalSoalDsl.g:1304:2: ( rule__StructDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStructDeclarationAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:1305:2: ( rule__StructDeclaration__NameAssignment_1 )
            // InternalSoalDsl.g:1305:3: rule__StructDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__2"
    // InternalSoalDsl.g:1313:1: rule__StructDeclaration__Group__2 : rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3 ;
    public final void rule__StructDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1317:1: ( rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3 )
            // InternalSoalDsl.g:1318:2: rule__StructDeclaration__Group__2__Impl rule__StructDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__StructDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__2"


    // $ANTLR start "rule__StructDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:1325:1: rule__StructDeclaration__Group__2__Impl : ( ( rule__StructDeclaration__Group_2__0 )? ) ;
    public final void rule__StructDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1329:1: ( ( ( rule__StructDeclaration__Group_2__0 )? ) )
            // InternalSoalDsl.g:1330:1: ( ( rule__StructDeclaration__Group_2__0 )? )
            {
            // InternalSoalDsl.g:1330:1: ( ( rule__StructDeclaration__Group_2__0 )? )
            // InternalSoalDsl.g:1331:2: ( rule__StructDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getStructDeclarationAccess().getGroup_2()); 
            // InternalSoalDsl.g:1332:2: ( rule__StructDeclaration__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSoalDsl.g:1332:3: rule__StructDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__3"
    // InternalSoalDsl.g:1340:1: rule__StructDeclaration__Group__3 : rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4 ;
    public final void rule__StructDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1344:1: ( rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4 )
            // InternalSoalDsl.g:1345:2: rule__StructDeclaration__Group__3__Impl rule__StructDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__StructDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__3"


    // $ANTLR start "rule__StructDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:1352:1: rule__StructDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__StructDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1356:1: ( ( '{' ) )
            // InternalSoalDsl.g:1357:1: ( '{' )
            {
            // InternalSoalDsl.g:1357:1: ( '{' )
            // InternalSoalDsl.g:1358:2: '{'
            {
             before(grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__4"
    // InternalSoalDsl.g:1367:1: rule__StructDeclaration__Group__4 : rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5 ;
    public final void rule__StructDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1371:1: ( rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5 )
            // InternalSoalDsl.g:1372:2: rule__StructDeclaration__Group__4__Impl rule__StructDeclaration__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__StructDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__4"


    // $ANTLR start "rule__StructDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:1379:1: rule__StructDeclaration__Group__4__Impl : ( ( rule__StructDeclaration__FieldsAssignment_4 )* ) ;
    public final void rule__StructDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1383:1: ( ( ( rule__StructDeclaration__FieldsAssignment_4 )* ) )
            // InternalSoalDsl.g:1384:1: ( ( rule__StructDeclaration__FieldsAssignment_4 )* )
            {
            // InternalSoalDsl.g:1384:1: ( ( rule__StructDeclaration__FieldsAssignment_4 )* )
            // InternalSoalDsl.g:1385:2: ( rule__StructDeclaration__FieldsAssignment_4 )*
            {
             before(grammarAccess.getStructDeclarationAccess().getFieldsAssignment_4()); 
            // InternalSoalDsl.g:1386:2: ( rule__StructDeclaration__FieldsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=13 && LA12_0<=24)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSoalDsl.g:1386:3: rule__StructDeclaration__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StructDeclaration__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStructDeclarationAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StructDeclaration__Group__5"
    // InternalSoalDsl.g:1394:1: rule__StructDeclaration__Group__5 : rule__StructDeclaration__Group__5__Impl ;
    public final void rule__StructDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1398:1: ( rule__StructDeclaration__Group__5__Impl )
            // InternalSoalDsl.g:1399:2: rule__StructDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__5"


    // $ANTLR start "rule__StructDeclaration__Group__5__Impl"
    // InternalSoalDsl.g:1405:1: rule__StructDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__StructDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1409:1: ( ( '}' ) )
            // InternalSoalDsl.g:1410:1: ( '}' )
            {
            // InternalSoalDsl.g:1410:1: ( '}' )
            // InternalSoalDsl.g:1411:2: '}'
            {
             before(grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_2__0"
    // InternalSoalDsl.g:1421:1: rule__StructDeclaration__Group_2__0 : rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1 ;
    public final void rule__StructDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1425:1: ( rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1 )
            // InternalSoalDsl.g:1426:2: rule__StructDeclaration__Group_2__0__Impl rule__StructDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__StructDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__0"


    // $ANTLR start "rule__StructDeclaration__Group_2__0__Impl"
    // InternalSoalDsl.g:1433:1: rule__StructDeclaration__Group_2__0__Impl : ( ':' ) ;
    public final void rule__StructDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1437:1: ( ( ':' ) )
            // InternalSoalDsl.g:1438:1: ( ':' )
            {
            // InternalSoalDsl.g:1438:1: ( ':' )
            // InternalSoalDsl.g:1439:2: ':'
            {
             before(grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__StructDeclaration__Group_2__1"
    // InternalSoalDsl.g:1448:1: rule__StructDeclaration__Group_2__1 : rule__StructDeclaration__Group_2__1__Impl ;
    public final void rule__StructDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1452:1: ( rule__StructDeclaration__Group_2__1__Impl )
            // InternalSoalDsl.g:1453:2: rule__StructDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__1"


    // $ANTLR start "rule__StructDeclaration__Group_2__1__Impl"
    // InternalSoalDsl.g:1459:1: rule__StructDeclaration__Group_2__1__Impl : ( ( rule__StructDeclaration__BaseTypeAssignment_2_1 ) ) ;
    public final void rule__StructDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1463:1: ( ( ( rule__StructDeclaration__BaseTypeAssignment_2_1 ) ) )
            // InternalSoalDsl.g:1464:1: ( ( rule__StructDeclaration__BaseTypeAssignment_2_1 ) )
            {
            // InternalSoalDsl.g:1464:1: ( ( rule__StructDeclaration__BaseTypeAssignment_2_1 ) )
            // InternalSoalDsl.g:1465:2: ( rule__StructDeclaration__BaseTypeAssignment_2_1 )
            {
             before(grammarAccess.getStructDeclarationAccess().getBaseTypeAssignment_2_1()); 
            // InternalSoalDsl.g:1466:2: ( rule__StructDeclaration__BaseTypeAssignment_2_1 )
            // InternalSoalDsl.g:1466:3: rule__StructDeclaration__BaseTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDeclaration__BaseTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDeclarationAccess().getBaseTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__FieldDeclaration__Group__0"
    // InternalSoalDsl.g:1475:1: rule__FieldDeclaration__Group__0 : rule__FieldDeclaration__Group__0__Impl rule__FieldDeclaration__Group__1 ;
    public final void rule__FieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1479:1: ( rule__FieldDeclaration__Group__0__Impl rule__FieldDeclaration__Group__1 )
            // InternalSoalDsl.g:1480:2: rule__FieldDeclaration__Group__0__Impl rule__FieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__0"


    // $ANTLR start "rule__FieldDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:1487:1: rule__FieldDeclaration__Group__0__Impl : ( ( rule__FieldDeclaration__TypeReferenceAssignment_0 ) ) ;
    public final void rule__FieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1491:1: ( ( ( rule__FieldDeclaration__TypeReferenceAssignment_0 ) ) )
            // InternalSoalDsl.g:1492:1: ( ( rule__FieldDeclaration__TypeReferenceAssignment_0 ) )
            {
            // InternalSoalDsl.g:1492:1: ( ( rule__FieldDeclaration__TypeReferenceAssignment_0 ) )
            // InternalSoalDsl.g:1493:2: ( rule__FieldDeclaration__TypeReferenceAssignment_0 )
            {
             before(grammarAccess.getFieldDeclarationAccess().getTypeReferenceAssignment_0()); 
            // InternalSoalDsl.g:1494:2: ( rule__FieldDeclaration__TypeReferenceAssignment_0 )
            // InternalSoalDsl.g:1494:3: rule__FieldDeclaration__TypeReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__TypeReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclarationAccess().getTypeReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FieldDeclaration__Group__1"
    // InternalSoalDsl.g:1502:1: rule__FieldDeclaration__Group__1 : rule__FieldDeclaration__Group__1__Impl rule__FieldDeclaration__Group__2 ;
    public final void rule__FieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1506:1: ( rule__FieldDeclaration__Group__1__Impl rule__FieldDeclaration__Group__2 )
            // InternalSoalDsl.g:1507:2: rule__FieldDeclaration__Group__1__Impl rule__FieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__1"


    // $ANTLR start "rule__FieldDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:1514:1: rule__FieldDeclaration__Group__1__Impl : ( ( rule__FieldDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1518:1: ( ( ( rule__FieldDeclaration__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:1519:1: ( ( rule__FieldDeclaration__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:1519:1: ( ( rule__FieldDeclaration__NameAssignment_1 ) )
            // InternalSoalDsl.g:1520:2: ( rule__FieldDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDeclarationAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:1521:2: ( rule__FieldDeclaration__NameAssignment_1 )
            // InternalSoalDsl.g:1521:3: rule__FieldDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FieldDeclaration__Group__2"
    // InternalSoalDsl.g:1529:1: rule__FieldDeclaration__Group__2 : rule__FieldDeclaration__Group__2__Impl ;
    public final void rule__FieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1533:1: ( rule__FieldDeclaration__Group__2__Impl )
            // InternalSoalDsl.g:1534:2: rule__FieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__2"


    // $ANTLR start "rule__FieldDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:1540:1: rule__FieldDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__FieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1544:1: ( ( ';' ) )
            // InternalSoalDsl.g:1545:1: ( ';' )
            {
            // InternalSoalDsl.g:1545:1: ( ';' )
            // InternalSoalDsl.g:1546:2: ';'
            {
             before(grammarAccess.getFieldDeclarationAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldDeclarationAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__Group__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0"
    // InternalSoalDsl.g:1556:1: rule__InterfaceDeclaration__Group__0 : rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 ;
    public final void rule__InterfaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1560:1: ( rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1 )
            // InternalSoalDsl.g:1561:2: rule__InterfaceDeclaration__Group__0__Impl rule__InterfaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InterfaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0"


    // $ANTLR start "rule__InterfaceDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:1568:1: rule__InterfaceDeclaration__Group__0__Impl : ( 'interface' ) ;
    public final void rule__InterfaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1572:1: ( ( 'interface' ) )
            // InternalSoalDsl.g:1573:1: ( 'interface' )
            {
            // InternalSoalDsl.g:1573:1: ( 'interface' )
            // InternalSoalDsl.g:1574:2: 'interface'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1"
    // InternalSoalDsl.g:1583:1: rule__InterfaceDeclaration__Group__1 : rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 ;
    public final void rule__InterfaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1587:1: ( rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2 )
            // InternalSoalDsl.g:1588:2: rule__InterfaceDeclaration__Group__1__Impl rule__InterfaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__InterfaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1"


    // $ANTLR start "rule__InterfaceDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:1595:1: rule__InterfaceDeclaration__Group__1__Impl : ( ( rule__InterfaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__InterfaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1599:1: ( ( ( rule__InterfaceDeclaration__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:1600:1: ( ( rule__InterfaceDeclaration__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:1600:1: ( ( rule__InterfaceDeclaration__NameAssignment_1 ) )
            // InternalSoalDsl.g:1601:2: ( rule__InterfaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:1602:2: ( rule__InterfaceDeclaration__NameAssignment_1 )
            // InternalSoalDsl.g:1602:3: rule__InterfaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2"
    // InternalSoalDsl.g:1610:1: rule__InterfaceDeclaration__Group__2 : rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3 ;
    public final void rule__InterfaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1614:1: ( rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3 )
            // InternalSoalDsl.g:1615:2: rule__InterfaceDeclaration__Group__2__Impl rule__InterfaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2"


    // $ANTLR start "rule__InterfaceDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:1622:1: rule__InterfaceDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__InterfaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1626:1: ( ( '{' ) )
            // InternalSoalDsl.g:1627:1: ( '{' )
            {
            // InternalSoalDsl.g:1627:1: ( '{' )
            // InternalSoalDsl.g:1628:2: '{'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__3"
    // InternalSoalDsl.g:1637:1: rule__InterfaceDeclaration__Group__3 : rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4 ;
    public final void rule__InterfaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1641:1: ( rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4 )
            // InternalSoalDsl.g:1642:2: rule__InterfaceDeclaration__Group__3__Impl rule__InterfaceDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__3"


    // $ANTLR start "rule__InterfaceDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:1649:1: rule__InterfaceDeclaration__Group__3__Impl : ( ( rule__InterfaceDeclaration__ResourcesAssignment_3 )* ) ;
    public final void rule__InterfaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1653:1: ( ( ( rule__InterfaceDeclaration__ResourcesAssignment_3 )* ) )
            // InternalSoalDsl.g:1654:1: ( ( rule__InterfaceDeclaration__ResourcesAssignment_3 )* )
            {
            // InternalSoalDsl.g:1654:1: ( ( rule__InterfaceDeclaration__ResourcesAssignment_3 )* )
            // InternalSoalDsl.g:1655:2: ( rule__InterfaceDeclaration__ResourcesAssignment_3 )*
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getResourcesAssignment_3()); 
            // InternalSoalDsl.g:1656:2: ( rule__InterfaceDeclaration__ResourcesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSoalDsl.g:1656:3: rule__InterfaceDeclaration__ResourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InterfaceDeclaration__ResourcesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInterfaceDeclarationAccess().getResourcesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__4"
    // InternalSoalDsl.g:1664:1: rule__InterfaceDeclaration__Group__4 : rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5 ;
    public final void rule__InterfaceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1668:1: ( rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5 )
            // InternalSoalDsl.g:1669:2: rule__InterfaceDeclaration__Group__4__Impl rule__InterfaceDeclaration__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__InterfaceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__4"


    // $ANTLR start "rule__InterfaceDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:1676:1: rule__InterfaceDeclaration__Group__4__Impl : ( ( rule__InterfaceDeclaration__OperationsAssignment_4 )* ) ;
    public final void rule__InterfaceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1680:1: ( ( ( rule__InterfaceDeclaration__OperationsAssignment_4 )* ) )
            // InternalSoalDsl.g:1681:1: ( ( rule__InterfaceDeclaration__OperationsAssignment_4 )* )
            {
            // InternalSoalDsl.g:1681:1: ( ( rule__InterfaceDeclaration__OperationsAssignment_4 )* )
            // InternalSoalDsl.g:1682:2: ( rule__InterfaceDeclaration__OperationsAssignment_4 )*
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getOperationsAssignment_4()); 
            // InternalSoalDsl.g:1683:2: ( rule__InterfaceDeclaration__OperationsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=13 && LA14_0<=24)||LA14_0==37||LA14_0==39||LA14_0==47) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSoalDsl.g:1683:3: rule__InterfaceDeclaration__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InterfaceDeclaration__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInterfaceDeclarationAccess().getOperationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__InterfaceDeclaration__Group__5"
    // InternalSoalDsl.g:1691:1: rule__InterfaceDeclaration__Group__5 : rule__InterfaceDeclaration__Group__5__Impl ;
    public final void rule__InterfaceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1695:1: ( rule__InterfaceDeclaration__Group__5__Impl )
            // InternalSoalDsl.g:1696:2: rule__InterfaceDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__5"


    // $ANTLR start "rule__InterfaceDeclaration__Group__5__Impl"
    // InternalSoalDsl.g:1702:1: rule__InterfaceDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__InterfaceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1706:1: ( ( '}' ) )
            // InternalSoalDsl.g:1707:1: ( '}' )
            {
            // InternalSoalDsl.g:1707:1: ( '}' )
            // InternalSoalDsl.g:1708:2: '}'
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group__0"
    // InternalSoalDsl.g:1718:1: rule__ResourceDeclaration__Group__0 : rule__ResourceDeclaration__Group__0__Impl rule__ResourceDeclaration__Group__1 ;
    public final void rule__ResourceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1722:1: ( rule__ResourceDeclaration__Group__0__Impl rule__ResourceDeclaration__Group__1 )
            // InternalSoalDsl.g:1723:2: rule__ResourceDeclaration__Group__0__Impl rule__ResourceDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ResourceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__0"


    // $ANTLR start "rule__ResourceDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:1730:1: rule__ResourceDeclaration__Group__0__Impl : ( ( rule__ResourceDeclaration__ReadonlyAssignment_0 )? ) ;
    public final void rule__ResourceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1734:1: ( ( ( rule__ResourceDeclaration__ReadonlyAssignment_0 )? ) )
            // InternalSoalDsl.g:1735:1: ( ( rule__ResourceDeclaration__ReadonlyAssignment_0 )? )
            {
            // InternalSoalDsl.g:1735:1: ( ( rule__ResourceDeclaration__ReadonlyAssignment_0 )? )
            // InternalSoalDsl.g:1736:2: ( rule__ResourceDeclaration__ReadonlyAssignment_0 )?
            {
             before(grammarAccess.getResourceDeclarationAccess().getReadonlyAssignment_0()); 
            // InternalSoalDsl.g:1737:2: ( rule__ResourceDeclaration__ReadonlyAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSoalDsl.g:1737:3: rule__ResourceDeclaration__ReadonlyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourceDeclaration__ReadonlyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceDeclarationAccess().getReadonlyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group__1"
    // InternalSoalDsl.g:1745:1: rule__ResourceDeclaration__Group__1 : rule__ResourceDeclaration__Group__1__Impl rule__ResourceDeclaration__Group__2 ;
    public final void rule__ResourceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1749:1: ( rule__ResourceDeclaration__Group__1__Impl rule__ResourceDeclaration__Group__2 )
            // InternalSoalDsl.g:1750:2: rule__ResourceDeclaration__Group__1__Impl rule__ResourceDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ResourceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__1"


    // $ANTLR start "rule__ResourceDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:1757:1: rule__ResourceDeclaration__Group__1__Impl : ( 'resource' ) ;
    public final void rule__ResourceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1761:1: ( ( 'resource' ) )
            // InternalSoalDsl.g:1762:1: ( 'resource' )
            {
            // InternalSoalDsl.g:1762:1: ( 'resource' )
            // InternalSoalDsl.g:1763:2: 'resource'
            {
             before(grammarAccess.getResourceDeclarationAccess().getResourceKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getResourceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group__2"
    // InternalSoalDsl.g:1772:1: rule__ResourceDeclaration__Group__2 : rule__ResourceDeclaration__Group__2__Impl rule__ResourceDeclaration__Group__3 ;
    public final void rule__ResourceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1776:1: ( rule__ResourceDeclaration__Group__2__Impl rule__ResourceDeclaration__Group__3 )
            // InternalSoalDsl.g:1777:2: rule__ResourceDeclaration__Group__2__Impl rule__ResourceDeclaration__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ResourceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__2"


    // $ANTLR start "rule__ResourceDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:1784:1: rule__ResourceDeclaration__Group__2__Impl : ( ( rule__ResourceDeclaration__EntityAssignment_2 ) ) ;
    public final void rule__ResourceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1788:1: ( ( ( rule__ResourceDeclaration__EntityAssignment_2 ) ) )
            // InternalSoalDsl.g:1789:1: ( ( rule__ResourceDeclaration__EntityAssignment_2 ) )
            {
            // InternalSoalDsl.g:1789:1: ( ( rule__ResourceDeclaration__EntityAssignment_2 ) )
            // InternalSoalDsl.g:1790:2: ( rule__ResourceDeclaration__EntityAssignment_2 )
            {
             before(grammarAccess.getResourceDeclarationAccess().getEntityAssignment_2()); 
            // InternalSoalDsl.g:1791:2: ( rule__ResourceDeclaration__EntityAssignment_2 )
            // InternalSoalDsl.g:1791:3: rule__ResourceDeclaration__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceDeclarationAccess().getEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group__3"
    // InternalSoalDsl.g:1799:1: rule__ResourceDeclaration__Group__3 : rule__ResourceDeclaration__Group__3__Impl rule__ResourceDeclaration__Group__4 ;
    public final void rule__ResourceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1803:1: ( rule__ResourceDeclaration__Group__3__Impl rule__ResourceDeclaration__Group__4 )
            // InternalSoalDsl.g:1804:2: rule__ResourceDeclaration__Group__3__Impl rule__ResourceDeclaration__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ResourceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__3"


    // $ANTLR start "rule__ResourceDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:1811:1: rule__ResourceDeclaration__Group__3__Impl : ( ( rule__ResourceDeclaration__Group_3__0 )? ) ;
    public final void rule__ResourceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1815:1: ( ( ( rule__ResourceDeclaration__Group_3__0 )? ) )
            // InternalSoalDsl.g:1816:1: ( ( rule__ResourceDeclaration__Group_3__0 )? )
            {
            // InternalSoalDsl.g:1816:1: ( ( rule__ResourceDeclaration__Group_3__0 )? )
            // InternalSoalDsl.g:1817:2: ( rule__ResourceDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getResourceDeclarationAccess().getGroup_3()); 
            // InternalSoalDsl.g:1818:2: ( rule__ResourceDeclaration__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSoalDsl.g:1818:3: rule__ResourceDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourceDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group__4"
    // InternalSoalDsl.g:1826:1: rule__ResourceDeclaration__Group__4 : rule__ResourceDeclaration__Group__4__Impl ;
    public final void rule__ResourceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1830:1: ( rule__ResourceDeclaration__Group__4__Impl )
            // InternalSoalDsl.g:1831:2: rule__ResourceDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__4"


    // $ANTLR start "rule__ResourceDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:1837:1: rule__ResourceDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__ResourceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1841:1: ( ( ';' ) )
            // InternalSoalDsl.g:1842:1: ( ';' )
            {
            // InternalSoalDsl.g:1842:1: ( ';' )
            // InternalSoalDsl.g:1843:2: ';'
            {
             before(grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__0"
    // InternalSoalDsl.g:1853:1: rule__ResourceDeclaration__Group_3__0 : rule__ResourceDeclaration__Group_3__0__Impl rule__ResourceDeclaration__Group_3__1 ;
    public final void rule__ResourceDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1857:1: ( rule__ResourceDeclaration__Group_3__0__Impl rule__ResourceDeclaration__Group_3__1 )
            // InternalSoalDsl.g:1858:2: rule__ResourceDeclaration__Group_3__0__Impl rule__ResourceDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ResourceDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__0"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__0__Impl"
    // InternalSoalDsl.g:1865:1: rule__ResourceDeclaration__Group_3__0__Impl : ( 'throws' ) ;
    public final void rule__ResourceDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1869:1: ( ( 'throws' ) )
            // InternalSoalDsl.g:1870:1: ( 'throws' )
            {
            // InternalSoalDsl.g:1870:1: ( 'throws' )
            // InternalSoalDsl.g:1871:2: 'throws'
            {
             before(grammarAccess.getResourceDeclarationAccess().getThrowsKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getThrowsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__1"
    // InternalSoalDsl.g:1880:1: rule__ResourceDeclaration__Group_3__1 : rule__ResourceDeclaration__Group_3__1__Impl rule__ResourceDeclaration__Group_3__2 ;
    public final void rule__ResourceDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1884:1: ( rule__ResourceDeclaration__Group_3__1__Impl rule__ResourceDeclaration__Group_3__2 )
            // InternalSoalDsl.g:1885:2: rule__ResourceDeclaration__Group_3__1__Impl rule__ResourceDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__ResourceDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__1"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__1__Impl"
    // InternalSoalDsl.g:1892:1: rule__ResourceDeclaration__Group_3__1__Impl : ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 ) ) ;
    public final void rule__ResourceDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1896:1: ( ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 ) ) )
            // InternalSoalDsl.g:1897:1: ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 ) )
            {
            // InternalSoalDsl.g:1897:1: ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 ) )
            // InternalSoalDsl.g:1898:2: ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 )
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_1()); 
            // InternalSoalDsl.g:1899:2: ( rule__ResourceDeclaration__ExceptionsAssignment_3_1 )
            // InternalSoalDsl.g:1899:3: rule__ResourceDeclaration__ExceptionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__ExceptionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__2"
    // InternalSoalDsl.g:1907:1: rule__ResourceDeclaration__Group_3__2 : rule__ResourceDeclaration__Group_3__2__Impl ;
    public final void rule__ResourceDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1911:1: ( rule__ResourceDeclaration__Group_3__2__Impl )
            // InternalSoalDsl.g:1912:2: rule__ResourceDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__2"


    // $ANTLR start "rule__ResourceDeclaration__Group_3__2__Impl"
    // InternalSoalDsl.g:1918:1: rule__ResourceDeclaration__Group_3__2__Impl : ( ( rule__ResourceDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ResourceDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1922:1: ( ( ( rule__ResourceDeclaration__Group_3_2__0 )* ) )
            // InternalSoalDsl.g:1923:1: ( ( rule__ResourceDeclaration__Group_3_2__0 )* )
            {
            // InternalSoalDsl.g:1923:1: ( ( rule__ResourceDeclaration__Group_3_2__0 )* )
            // InternalSoalDsl.g:1924:2: ( rule__ResourceDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getResourceDeclarationAccess().getGroup_3_2()); 
            // InternalSoalDsl.g:1925:2: ( rule__ResourceDeclaration__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSoalDsl.g:1925:3: rule__ResourceDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ResourceDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getResourceDeclarationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group_3_2__0"
    // InternalSoalDsl.g:1934:1: rule__ResourceDeclaration__Group_3_2__0 : rule__ResourceDeclaration__Group_3_2__0__Impl rule__ResourceDeclaration__Group_3_2__1 ;
    public final void rule__ResourceDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1938:1: ( rule__ResourceDeclaration__Group_3_2__0__Impl rule__ResourceDeclaration__Group_3_2__1 )
            // InternalSoalDsl.g:1939:2: rule__ResourceDeclaration__Group_3_2__0__Impl rule__ResourceDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ResourceDeclaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3_2__0"


    // $ANTLR start "rule__ResourceDeclaration__Group_3_2__0__Impl"
    // InternalSoalDsl.g:1946:1: rule__ResourceDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ResourceDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1950:1: ( ( ',' ) )
            // InternalSoalDsl.g:1951:1: ( ',' )
            {
            // InternalSoalDsl.g:1951:1: ( ',' )
            // InternalSoalDsl.g:1952:2: ','
            {
             before(grammarAccess.getResourceDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__ResourceDeclaration__Group_3_2__1"
    // InternalSoalDsl.g:1961:1: rule__ResourceDeclaration__Group_3_2__1 : rule__ResourceDeclaration__Group_3_2__1__Impl ;
    public final void rule__ResourceDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1965:1: ( rule__ResourceDeclaration__Group_3_2__1__Impl )
            // InternalSoalDsl.g:1966:2: rule__ResourceDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3_2__1"


    // $ANTLR start "rule__ResourceDeclaration__Group_3_2__1__Impl"
    // InternalSoalDsl.g:1972:1: rule__ResourceDeclaration__Group_3_2__1__Impl : ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 ) ) ;
    public final void rule__ResourceDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1976:1: ( ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 ) ) )
            // InternalSoalDsl.g:1977:1: ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 ) )
            {
            // InternalSoalDsl.g:1977:1: ( ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 ) )
            // InternalSoalDsl.g:1978:2: ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 )
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_2_1()); 
            // InternalSoalDsl.g:1979:2: ( rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 )
            // InternalSoalDsl.g:1979:3: rule__ResourceDeclaration__ExceptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ResourceDeclaration__ExceptionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__0"
    // InternalSoalDsl.g:1988:1: rule__OperationDeclaration__Group__0 : rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 ;
    public final void rule__OperationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:1992:1: ( rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 )
            // InternalSoalDsl.g:1993:2: rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OperationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__0"


    // $ANTLR start "rule__OperationDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:2000:1: rule__OperationDeclaration__Group__0__Impl : ( ( rule__OperationDeclaration__AsyncAssignment_0 )? ) ;
    public final void rule__OperationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2004:1: ( ( ( rule__OperationDeclaration__AsyncAssignment_0 )? ) )
            // InternalSoalDsl.g:2005:1: ( ( rule__OperationDeclaration__AsyncAssignment_0 )? )
            {
            // InternalSoalDsl.g:2005:1: ( ( rule__OperationDeclaration__AsyncAssignment_0 )? )
            // InternalSoalDsl.g:2006:2: ( rule__OperationDeclaration__AsyncAssignment_0 )?
            {
             before(grammarAccess.getOperationDeclarationAccess().getAsyncAssignment_0()); 
            // InternalSoalDsl.g:2007:2: ( rule__OperationDeclaration__AsyncAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSoalDsl.g:2007:3: rule__OperationDeclaration__AsyncAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDeclaration__AsyncAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDeclarationAccess().getAsyncAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__1"
    // InternalSoalDsl.g:2015:1: rule__OperationDeclaration__Group__1 : rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 ;
    public final void rule__OperationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2019:1: ( rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 )
            // InternalSoalDsl.g:2020:2: rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OperationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__1"


    // $ANTLR start "rule__OperationDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:2027:1: rule__OperationDeclaration__Group__1__Impl : ( ( rule__OperationDeclaration__ResponseParametersAssignment_1 ) ) ;
    public final void rule__OperationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2031:1: ( ( ( rule__OperationDeclaration__ResponseParametersAssignment_1 ) ) )
            // InternalSoalDsl.g:2032:1: ( ( rule__OperationDeclaration__ResponseParametersAssignment_1 ) )
            {
            // InternalSoalDsl.g:2032:1: ( ( rule__OperationDeclaration__ResponseParametersAssignment_1 ) )
            // InternalSoalDsl.g:2033:2: ( rule__OperationDeclaration__ResponseParametersAssignment_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getResponseParametersAssignment_1()); 
            // InternalSoalDsl.g:2034:2: ( rule__OperationDeclaration__ResponseParametersAssignment_1 )
            // InternalSoalDsl.g:2034:3: rule__OperationDeclaration__ResponseParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__ResponseParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getResponseParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__2"
    // InternalSoalDsl.g:2042:1: rule__OperationDeclaration__Group__2 : rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 ;
    public final void rule__OperationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2046:1: ( rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 )
            // InternalSoalDsl.g:2047:2: rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__OperationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__2"


    // $ANTLR start "rule__OperationDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:2054:1: rule__OperationDeclaration__Group__2__Impl : ( ( rule__OperationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__OperationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2058:1: ( ( ( rule__OperationDeclaration__NameAssignment_2 ) ) )
            // InternalSoalDsl.g:2059:1: ( ( rule__OperationDeclaration__NameAssignment_2 ) )
            {
            // InternalSoalDsl.g:2059:1: ( ( rule__OperationDeclaration__NameAssignment_2 ) )
            // InternalSoalDsl.g:2060:2: ( rule__OperationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameAssignment_2()); 
            // InternalSoalDsl.g:2061:2: ( rule__OperationDeclaration__NameAssignment_2 )
            // InternalSoalDsl.g:2061:3: rule__OperationDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__3"
    // InternalSoalDsl.g:2069:1: rule__OperationDeclaration__Group__3 : rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 ;
    public final void rule__OperationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2073:1: ( rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 )
            // InternalSoalDsl.g:2074:2: rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__OperationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__3"


    // $ANTLR start "rule__OperationDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:2081:1: rule__OperationDeclaration__Group__3__Impl : ( ( rule__OperationDeclaration__RequestParametersAssignment_3 ) ) ;
    public final void rule__OperationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2085:1: ( ( ( rule__OperationDeclaration__RequestParametersAssignment_3 ) ) )
            // InternalSoalDsl.g:2086:1: ( ( rule__OperationDeclaration__RequestParametersAssignment_3 ) )
            {
            // InternalSoalDsl.g:2086:1: ( ( rule__OperationDeclaration__RequestParametersAssignment_3 ) )
            // InternalSoalDsl.g:2087:2: ( rule__OperationDeclaration__RequestParametersAssignment_3 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getRequestParametersAssignment_3()); 
            // InternalSoalDsl.g:2088:2: ( rule__OperationDeclaration__RequestParametersAssignment_3 )
            // InternalSoalDsl.g:2088:3: rule__OperationDeclaration__RequestParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__RequestParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getRequestParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__4"
    // InternalSoalDsl.g:2096:1: rule__OperationDeclaration__Group__4 : rule__OperationDeclaration__Group__4__Impl rule__OperationDeclaration__Group__5 ;
    public final void rule__OperationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2100:1: ( rule__OperationDeclaration__Group__4__Impl rule__OperationDeclaration__Group__5 )
            // InternalSoalDsl.g:2101:2: rule__OperationDeclaration__Group__4__Impl rule__OperationDeclaration__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__OperationDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__4"


    // $ANTLR start "rule__OperationDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:2108:1: rule__OperationDeclaration__Group__4__Impl : ( ( rule__OperationDeclaration__Group_4__0 )? ) ;
    public final void rule__OperationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2112:1: ( ( ( rule__OperationDeclaration__Group_4__0 )? ) )
            // InternalSoalDsl.g:2113:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            {
            // InternalSoalDsl.g:2113:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            // InternalSoalDsl.g:2114:2: ( rule__OperationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 
            // InternalSoalDsl.g:2115:2: ( rule__OperationDeclaration__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSoalDsl.g:2115:3: rule__OperationDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__5"
    // InternalSoalDsl.g:2123:1: rule__OperationDeclaration__Group__5 : rule__OperationDeclaration__Group__5__Impl ;
    public final void rule__OperationDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2127:1: ( rule__OperationDeclaration__Group__5__Impl )
            // InternalSoalDsl.g:2128:2: rule__OperationDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__5"


    // $ANTLR start "rule__OperationDeclaration__Group__5__Impl"
    // InternalSoalDsl.g:2134:1: rule__OperationDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__OperationDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2138:1: ( ( ';' ) )
            // InternalSoalDsl.g:2139:1: ( ';' )
            {
            // InternalSoalDsl.g:2139:1: ( ';' )
            // InternalSoalDsl.g:2140:2: ';'
            {
             before(grammarAccess.getOperationDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__5__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4__0"
    // InternalSoalDsl.g:2150:1: rule__OperationDeclaration__Group_4__0 : rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 ;
    public final void rule__OperationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2154:1: ( rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 )
            // InternalSoalDsl.g:2155:2: rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__OperationDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__0"


    // $ANTLR start "rule__OperationDeclaration__Group_4__0__Impl"
    // InternalSoalDsl.g:2162:1: rule__OperationDeclaration__Group_4__0__Impl : ( 'throws' ) ;
    public final void rule__OperationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2166:1: ( ( 'throws' ) )
            // InternalSoalDsl.g:2167:1: ( 'throws' )
            {
            // InternalSoalDsl.g:2167:1: ( 'throws' )
            // InternalSoalDsl.g:2168:2: 'throws'
            {
             before(grammarAccess.getOperationDeclarationAccess().getThrowsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getThrowsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4__1"
    // InternalSoalDsl.g:2177:1: rule__OperationDeclaration__Group_4__1 : rule__OperationDeclaration__Group_4__1__Impl rule__OperationDeclaration__Group_4__2 ;
    public final void rule__OperationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2181:1: ( rule__OperationDeclaration__Group_4__1__Impl rule__OperationDeclaration__Group_4__2 )
            // InternalSoalDsl.g:2182:2: rule__OperationDeclaration__Group_4__1__Impl rule__OperationDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__OperationDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__1"


    // $ANTLR start "rule__OperationDeclaration__Group_4__1__Impl"
    // InternalSoalDsl.g:2189:1: rule__OperationDeclaration__Group_4__1__Impl : ( ( rule__OperationDeclaration__ExceptionsAssignment_4_1 ) ) ;
    public final void rule__OperationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2193:1: ( ( ( rule__OperationDeclaration__ExceptionsAssignment_4_1 ) ) )
            // InternalSoalDsl.g:2194:1: ( ( rule__OperationDeclaration__ExceptionsAssignment_4_1 ) )
            {
            // InternalSoalDsl.g:2194:1: ( ( rule__OperationDeclaration__ExceptionsAssignment_4_1 ) )
            // InternalSoalDsl.g:2195:2: ( rule__OperationDeclaration__ExceptionsAssignment_4_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_1()); 
            // InternalSoalDsl.g:2196:2: ( rule__OperationDeclaration__ExceptionsAssignment_4_1 )
            // InternalSoalDsl.g:2196:3: rule__OperationDeclaration__ExceptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__ExceptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4__2"
    // InternalSoalDsl.g:2204:1: rule__OperationDeclaration__Group_4__2 : rule__OperationDeclaration__Group_4__2__Impl ;
    public final void rule__OperationDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2208:1: ( rule__OperationDeclaration__Group_4__2__Impl )
            // InternalSoalDsl.g:2209:2: rule__OperationDeclaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__2"


    // $ANTLR start "rule__OperationDeclaration__Group_4__2__Impl"
    // InternalSoalDsl.g:2215:1: rule__OperationDeclaration__Group_4__2__Impl : ( ( rule__OperationDeclaration__Group_4_2__0 )* ) ;
    public final void rule__OperationDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2219:1: ( ( ( rule__OperationDeclaration__Group_4_2__0 )* ) )
            // InternalSoalDsl.g:2220:1: ( ( rule__OperationDeclaration__Group_4_2__0 )* )
            {
            // InternalSoalDsl.g:2220:1: ( ( rule__OperationDeclaration__Group_4_2__0 )* )
            // InternalSoalDsl.g:2221:2: ( rule__OperationDeclaration__Group_4_2__0 )*
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup_4_2()); 
            // InternalSoalDsl.g:2222:2: ( rule__OperationDeclaration__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSoalDsl.g:2222:3: rule__OperationDeclaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OperationDeclaration__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperationDeclarationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4_2__0"
    // InternalSoalDsl.g:2231:1: rule__OperationDeclaration__Group_4_2__0 : rule__OperationDeclaration__Group_4_2__0__Impl rule__OperationDeclaration__Group_4_2__1 ;
    public final void rule__OperationDeclaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2235:1: ( rule__OperationDeclaration__Group_4_2__0__Impl rule__OperationDeclaration__Group_4_2__1 )
            // InternalSoalDsl.g:2236:2: rule__OperationDeclaration__Group_4_2__0__Impl rule__OperationDeclaration__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__OperationDeclaration__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4_2__0"


    // $ANTLR start "rule__OperationDeclaration__Group_4_2__0__Impl"
    // InternalSoalDsl.g:2243:1: rule__OperationDeclaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OperationDeclaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2247:1: ( ( ',' ) )
            // InternalSoalDsl.g:2248:1: ( ',' )
            {
            // InternalSoalDsl.g:2248:1: ( ',' )
            // InternalSoalDsl.g:2249:2: ','
            {
             before(grammarAccess.getOperationDeclarationAccess().getCommaKeyword_4_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4_2__0__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4_2__1"
    // InternalSoalDsl.g:2258:1: rule__OperationDeclaration__Group_4_2__1 : rule__OperationDeclaration__Group_4_2__1__Impl ;
    public final void rule__OperationDeclaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2262:1: ( rule__OperationDeclaration__Group_4_2__1__Impl )
            // InternalSoalDsl.g:2263:2: rule__OperationDeclaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4_2__1"


    // $ANTLR start "rule__OperationDeclaration__Group_4_2__1__Impl"
    // InternalSoalDsl.g:2269:1: rule__OperationDeclaration__Group_4_2__1__Impl : ( ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 ) ) ;
    public final void rule__OperationDeclaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2273:1: ( ( ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 ) ) )
            // InternalSoalDsl.g:2274:1: ( ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 ) )
            {
            // InternalSoalDsl.g:2274:1: ( ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 ) )
            // InternalSoalDsl.g:2275:2: ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_2_1()); 
            // InternalSoalDsl.g:2276:2: ( rule__OperationDeclaration__ExceptionsAssignment_4_2_1 )
            // InternalSoalDsl.g:2276:3: rule__OperationDeclaration__ExceptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__ExceptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4_2__1__Impl"


    // $ANTLR start "rule__InputParameterList__Group__0"
    // InternalSoalDsl.g:2285:1: rule__InputParameterList__Group__0 : rule__InputParameterList__Group__0__Impl rule__InputParameterList__Group__1 ;
    public final void rule__InputParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2289:1: ( rule__InputParameterList__Group__0__Impl rule__InputParameterList__Group__1 )
            // InternalSoalDsl.g:2290:2: rule__InputParameterList__Group__0__Impl rule__InputParameterList__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__InputParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__0"


    // $ANTLR start "rule__InputParameterList__Group__0__Impl"
    // InternalSoalDsl.g:2297:1: rule__InputParameterList__Group__0__Impl : ( () ) ;
    public final void rule__InputParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2301:1: ( ( () ) )
            // InternalSoalDsl.g:2302:1: ( () )
            {
            // InternalSoalDsl.g:2302:1: ( () )
            // InternalSoalDsl.g:2303:2: ()
            {
             before(grammarAccess.getInputParameterListAccess().getParameterListAction_0()); 
            // InternalSoalDsl.g:2304:2: ()
            // InternalSoalDsl.g:2304:3: 
            {
            }

             after(grammarAccess.getInputParameterListAccess().getParameterListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__0__Impl"


    // $ANTLR start "rule__InputParameterList__Group__1"
    // InternalSoalDsl.g:2312:1: rule__InputParameterList__Group__1 : rule__InputParameterList__Group__1__Impl rule__InputParameterList__Group__2 ;
    public final void rule__InputParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2316:1: ( rule__InputParameterList__Group__1__Impl rule__InputParameterList__Group__2 )
            // InternalSoalDsl.g:2317:2: rule__InputParameterList__Group__1__Impl rule__InputParameterList__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InputParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__1"


    // $ANTLR start "rule__InputParameterList__Group__1__Impl"
    // InternalSoalDsl.g:2324:1: rule__InputParameterList__Group__1__Impl : ( '(' ) ;
    public final void rule__InputParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2328:1: ( ( '(' ) )
            // InternalSoalDsl.g:2329:1: ( '(' )
            {
            // InternalSoalDsl.g:2329:1: ( '(' )
            // InternalSoalDsl.g:2330:2: '('
            {
             before(grammarAccess.getInputParameterListAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInputParameterListAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__1__Impl"


    // $ANTLR start "rule__InputParameterList__Group__2"
    // InternalSoalDsl.g:2339:1: rule__InputParameterList__Group__2 : rule__InputParameterList__Group__2__Impl rule__InputParameterList__Group__3 ;
    public final void rule__InputParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2343:1: ( rule__InputParameterList__Group__2__Impl rule__InputParameterList__Group__3 )
            // InternalSoalDsl.g:2344:2: rule__InputParameterList__Group__2__Impl rule__InputParameterList__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InputParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__2"


    // $ANTLR start "rule__InputParameterList__Group__2__Impl"
    // InternalSoalDsl.g:2351:1: rule__InputParameterList__Group__2__Impl : ( ( rule__InputParameterList__Group_2__0 )? ) ;
    public final void rule__InputParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2355:1: ( ( ( rule__InputParameterList__Group_2__0 )? ) )
            // InternalSoalDsl.g:2356:1: ( ( rule__InputParameterList__Group_2__0 )? )
            {
            // InternalSoalDsl.g:2356:1: ( ( rule__InputParameterList__Group_2__0 )? )
            // InternalSoalDsl.g:2357:2: ( rule__InputParameterList__Group_2__0 )?
            {
             before(grammarAccess.getInputParameterListAccess().getGroup_2()); 
            // InternalSoalDsl.g:2358:2: ( rule__InputParameterList__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=13 && LA21_0<=24)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSoalDsl.g:2358:3: rule__InputParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputParameterList__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputParameterListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__2__Impl"


    // $ANTLR start "rule__InputParameterList__Group__3"
    // InternalSoalDsl.g:2366:1: rule__InputParameterList__Group__3 : rule__InputParameterList__Group__3__Impl ;
    public final void rule__InputParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2370:1: ( rule__InputParameterList__Group__3__Impl )
            // InternalSoalDsl.g:2371:2: rule__InputParameterList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__3"


    // $ANTLR start "rule__InputParameterList__Group__3__Impl"
    // InternalSoalDsl.g:2377:1: rule__InputParameterList__Group__3__Impl : ( ')' ) ;
    public final void rule__InputParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2381:1: ( ( ')' ) )
            // InternalSoalDsl.g:2382:1: ( ')' )
            {
            // InternalSoalDsl.g:2382:1: ( ')' )
            // InternalSoalDsl.g:2383:2: ')'
            {
             before(grammarAccess.getInputParameterListAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInputParameterListAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group__3__Impl"


    // $ANTLR start "rule__InputParameterList__Group_2__0"
    // InternalSoalDsl.g:2393:1: rule__InputParameterList__Group_2__0 : rule__InputParameterList__Group_2__0__Impl rule__InputParameterList__Group_2__1 ;
    public final void rule__InputParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2397:1: ( rule__InputParameterList__Group_2__0__Impl rule__InputParameterList__Group_2__1 )
            // InternalSoalDsl.g:2398:2: rule__InputParameterList__Group_2__0__Impl rule__InputParameterList__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__InputParameterList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2__0"


    // $ANTLR start "rule__InputParameterList__Group_2__0__Impl"
    // InternalSoalDsl.g:2405:1: rule__InputParameterList__Group_2__0__Impl : ( ( rule__InputParameterList__ParametersAssignment_2_0 ) ) ;
    public final void rule__InputParameterList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2409:1: ( ( ( rule__InputParameterList__ParametersAssignment_2_0 ) ) )
            // InternalSoalDsl.g:2410:1: ( ( rule__InputParameterList__ParametersAssignment_2_0 ) )
            {
            // InternalSoalDsl.g:2410:1: ( ( rule__InputParameterList__ParametersAssignment_2_0 ) )
            // InternalSoalDsl.g:2411:2: ( rule__InputParameterList__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_0()); 
            // InternalSoalDsl.g:2412:2: ( rule__InputParameterList__ParametersAssignment_2_0 )
            // InternalSoalDsl.g:2412:3: rule__InputParameterList__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2__0__Impl"


    // $ANTLR start "rule__InputParameterList__Group_2__1"
    // InternalSoalDsl.g:2420:1: rule__InputParameterList__Group_2__1 : rule__InputParameterList__Group_2__1__Impl ;
    public final void rule__InputParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2424:1: ( rule__InputParameterList__Group_2__1__Impl )
            // InternalSoalDsl.g:2425:2: rule__InputParameterList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2__1"


    // $ANTLR start "rule__InputParameterList__Group_2__1__Impl"
    // InternalSoalDsl.g:2431:1: rule__InputParameterList__Group_2__1__Impl : ( ( rule__InputParameterList__Group_2_1__0 )* ) ;
    public final void rule__InputParameterList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2435:1: ( ( ( rule__InputParameterList__Group_2_1__0 )* ) )
            // InternalSoalDsl.g:2436:1: ( ( rule__InputParameterList__Group_2_1__0 )* )
            {
            // InternalSoalDsl.g:2436:1: ( ( rule__InputParameterList__Group_2_1__0 )* )
            // InternalSoalDsl.g:2437:2: ( rule__InputParameterList__Group_2_1__0 )*
            {
             before(grammarAccess.getInputParameterListAccess().getGroup_2_1()); 
            // InternalSoalDsl.g:2438:2: ( rule__InputParameterList__Group_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSoalDsl.g:2438:3: rule__InputParameterList__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InputParameterList__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInputParameterListAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2__1__Impl"


    // $ANTLR start "rule__InputParameterList__Group_2_1__0"
    // InternalSoalDsl.g:2447:1: rule__InputParameterList__Group_2_1__0 : rule__InputParameterList__Group_2_1__0__Impl rule__InputParameterList__Group_2_1__1 ;
    public final void rule__InputParameterList__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2451:1: ( rule__InputParameterList__Group_2_1__0__Impl rule__InputParameterList__Group_2_1__1 )
            // InternalSoalDsl.g:2452:2: rule__InputParameterList__Group_2_1__0__Impl rule__InputParameterList__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__InputParameterList__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2_1__0"


    // $ANTLR start "rule__InputParameterList__Group_2_1__0__Impl"
    // InternalSoalDsl.g:2459:1: rule__InputParameterList__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__InputParameterList__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2463:1: ( ( ',' ) )
            // InternalSoalDsl.g:2464:1: ( ',' )
            {
            // InternalSoalDsl.g:2464:1: ( ',' )
            // InternalSoalDsl.g:2465:2: ','
            {
             before(grammarAccess.getInputParameterListAccess().getCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInputParameterListAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2_1__0__Impl"


    // $ANTLR start "rule__InputParameterList__Group_2_1__1"
    // InternalSoalDsl.g:2474:1: rule__InputParameterList__Group_2_1__1 : rule__InputParameterList__Group_2_1__1__Impl ;
    public final void rule__InputParameterList__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2478:1: ( rule__InputParameterList__Group_2_1__1__Impl )
            // InternalSoalDsl.g:2479:2: rule__InputParameterList__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2_1__1"


    // $ANTLR start "rule__InputParameterList__Group_2_1__1__Impl"
    // InternalSoalDsl.g:2485:1: rule__InputParameterList__Group_2_1__1__Impl : ( ( rule__InputParameterList__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__InputParameterList__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2489:1: ( ( ( rule__InputParameterList__ParametersAssignment_2_1_1 ) ) )
            // InternalSoalDsl.g:2490:1: ( ( rule__InputParameterList__ParametersAssignment_2_1_1 ) )
            {
            // InternalSoalDsl.g:2490:1: ( ( rule__InputParameterList__ParametersAssignment_2_1_1 ) )
            // InternalSoalDsl.g:2491:2: ( rule__InputParameterList__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_1_1()); 
            // InternalSoalDsl.g:2492:2: ( rule__InputParameterList__ParametersAssignment_2_1_1 )
            // InternalSoalDsl.g:2492:3: rule__InputParameterList__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InputParameterList__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__Group_2_1__1__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_0__0"
    // InternalSoalDsl.g:2501:1: rule__OutputParameterList__Group_0__0 : rule__OutputParameterList__Group_0__0__Impl rule__OutputParameterList__Group_0__1 ;
    public final void rule__OutputParameterList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2505:1: ( rule__OutputParameterList__Group_0__0__Impl rule__OutputParameterList__Group_0__1 )
            // InternalSoalDsl.g:2506:2: rule__OutputParameterList__Group_0__0__Impl rule__OutputParameterList__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__OutputParameterList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_0__0"


    // $ANTLR start "rule__OutputParameterList__Group_0__0__Impl"
    // InternalSoalDsl.g:2513:1: rule__OutputParameterList__Group_0__0__Impl : ( () ) ;
    public final void rule__OutputParameterList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2517:1: ( ( () ) )
            // InternalSoalDsl.g:2518:1: ( () )
            {
            // InternalSoalDsl.g:2518:1: ( () )
            // InternalSoalDsl.g:2519:2: ()
            {
             before(grammarAccess.getOutputParameterListAccess().getParameterListAction_0_0()); 
            // InternalSoalDsl.g:2520:2: ()
            // InternalSoalDsl.g:2520:3: 
            {
            }

             after(grammarAccess.getOutputParameterListAccess().getParameterListAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_0__0__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_0__1"
    // InternalSoalDsl.g:2528:1: rule__OutputParameterList__Group_0__1 : rule__OutputParameterList__Group_0__1__Impl ;
    public final void rule__OutputParameterList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2532:1: ( rule__OutputParameterList__Group_0__1__Impl )
            // InternalSoalDsl.g:2533:2: rule__OutputParameterList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_0__1"


    // $ANTLR start "rule__OutputParameterList__Group_0__1__Impl"
    // InternalSoalDsl.g:2539:1: rule__OutputParameterList__Group_0__1__Impl : ( 'void' ) ;
    public final void rule__OutputParameterList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2543:1: ( ( 'void' ) )
            // InternalSoalDsl.g:2544:1: ( 'void' )
            {
            // InternalSoalDsl.g:2544:1: ( 'void' )
            // InternalSoalDsl.g:2545:2: 'void'
            {
             before(grammarAccess.getOutputParameterListAccess().getVoidKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOutputParameterListAccess().getVoidKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_0__1__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_1__0"
    // InternalSoalDsl.g:2555:1: rule__OutputParameterList__Group_1__0 : rule__OutputParameterList__Group_1__0__Impl rule__OutputParameterList__Group_1__1 ;
    public final void rule__OutputParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2559:1: ( rule__OutputParameterList__Group_1__0__Impl rule__OutputParameterList__Group_1__1 )
            // InternalSoalDsl.g:2560:2: rule__OutputParameterList__Group_1__0__Impl rule__OutputParameterList__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__OutputParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_1__0"


    // $ANTLR start "rule__OutputParameterList__Group_1__0__Impl"
    // InternalSoalDsl.g:2567:1: rule__OutputParameterList__Group_1__0__Impl : ( () ) ;
    public final void rule__OutputParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2571:1: ( ( () ) )
            // InternalSoalDsl.g:2572:1: ( () )
            {
            // InternalSoalDsl.g:2572:1: ( () )
            // InternalSoalDsl.g:2573:2: ()
            {
             before(grammarAccess.getOutputParameterListAccess().getParameterListAction_1_0()); 
            // InternalSoalDsl.g:2574:2: ()
            // InternalSoalDsl.g:2574:3: 
            {
            }

             after(grammarAccess.getOutputParameterListAccess().getParameterListAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_1__0__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_1__1"
    // InternalSoalDsl.g:2582:1: rule__OutputParameterList__Group_1__1 : rule__OutputParameterList__Group_1__1__Impl ;
    public final void rule__OutputParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2586:1: ( rule__OutputParameterList__Group_1__1__Impl )
            // InternalSoalDsl.g:2587:2: rule__OutputParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_1__1"


    // $ANTLR start "rule__OutputParameterList__Group_1__1__Impl"
    // InternalSoalDsl.g:2593:1: rule__OutputParameterList__Group_1__1__Impl : ( ( rule__OutputParameterList__ParametersAssignment_1_1 ) ) ;
    public final void rule__OutputParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2597:1: ( ( ( rule__OutputParameterList__ParametersAssignment_1_1 ) ) )
            // InternalSoalDsl.g:2598:1: ( ( rule__OutputParameterList__ParametersAssignment_1_1 ) )
            {
            // InternalSoalDsl.g:2598:1: ( ( rule__OutputParameterList__ParametersAssignment_1_1 ) )
            // InternalSoalDsl.g:2599:2: ( rule__OutputParameterList__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersAssignment_1_1()); 
            // InternalSoalDsl.g:2600:2: ( rule__OutputParameterList__ParametersAssignment_1_1 )
            // InternalSoalDsl.g:2600:3: rule__OutputParameterList__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputParameterListAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_1__1__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2__0"
    // InternalSoalDsl.g:2609:1: rule__OutputParameterList__Group_2__0 : rule__OutputParameterList__Group_2__0__Impl rule__OutputParameterList__Group_2__1 ;
    public final void rule__OutputParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2613:1: ( rule__OutputParameterList__Group_2__0__Impl rule__OutputParameterList__Group_2__1 )
            // InternalSoalDsl.g:2614:2: rule__OutputParameterList__Group_2__0__Impl rule__OutputParameterList__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__OutputParameterList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__0"


    // $ANTLR start "rule__OutputParameterList__Group_2__0__Impl"
    // InternalSoalDsl.g:2621:1: rule__OutputParameterList__Group_2__0__Impl : ( '(' ) ;
    public final void rule__OutputParameterList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2625:1: ( ( '(' ) )
            // InternalSoalDsl.g:2626:1: ( '(' )
            {
            // InternalSoalDsl.g:2626:1: ( '(' )
            // InternalSoalDsl.g:2627:2: '('
            {
             before(grammarAccess.getOutputParameterListAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOutputParameterListAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__0__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2__1"
    // InternalSoalDsl.g:2636:1: rule__OutputParameterList__Group_2__1 : rule__OutputParameterList__Group_2__1__Impl rule__OutputParameterList__Group_2__2 ;
    public final void rule__OutputParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2640:1: ( rule__OutputParameterList__Group_2__1__Impl rule__OutputParameterList__Group_2__2 )
            // InternalSoalDsl.g:2641:2: rule__OutputParameterList__Group_2__1__Impl rule__OutputParameterList__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__OutputParameterList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__1"


    // $ANTLR start "rule__OutputParameterList__Group_2__1__Impl"
    // InternalSoalDsl.g:2648:1: rule__OutputParameterList__Group_2__1__Impl : ( ( rule__OutputParameterList__ParametersAssignment_2_1 ) ) ;
    public final void rule__OutputParameterList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2652:1: ( ( ( rule__OutputParameterList__ParametersAssignment_2_1 ) ) )
            // InternalSoalDsl.g:2653:1: ( ( rule__OutputParameterList__ParametersAssignment_2_1 ) )
            {
            // InternalSoalDsl.g:2653:1: ( ( rule__OutputParameterList__ParametersAssignment_2_1 ) )
            // InternalSoalDsl.g:2654:2: ( rule__OutputParameterList__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_1()); 
            // InternalSoalDsl.g:2655:2: ( rule__OutputParameterList__ParametersAssignment_2_1 )
            // InternalSoalDsl.g:2655:3: rule__OutputParameterList__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__1__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2__2"
    // InternalSoalDsl.g:2663:1: rule__OutputParameterList__Group_2__2 : rule__OutputParameterList__Group_2__2__Impl rule__OutputParameterList__Group_2__3 ;
    public final void rule__OutputParameterList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2667:1: ( rule__OutputParameterList__Group_2__2__Impl rule__OutputParameterList__Group_2__3 )
            // InternalSoalDsl.g:2668:2: rule__OutputParameterList__Group_2__2__Impl rule__OutputParameterList__Group_2__3
            {
            pushFollow(FOLLOW_26);
            rule__OutputParameterList__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__2"


    // $ANTLR start "rule__OutputParameterList__Group_2__2__Impl"
    // InternalSoalDsl.g:2675:1: rule__OutputParameterList__Group_2__2__Impl : ( ( rule__OutputParameterList__Group_2_2__0 )* ) ;
    public final void rule__OutputParameterList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2679:1: ( ( ( rule__OutputParameterList__Group_2_2__0 )* ) )
            // InternalSoalDsl.g:2680:1: ( ( rule__OutputParameterList__Group_2_2__0 )* )
            {
            // InternalSoalDsl.g:2680:1: ( ( rule__OutputParameterList__Group_2_2__0 )* )
            // InternalSoalDsl.g:2681:2: ( rule__OutputParameterList__Group_2_2__0 )*
            {
             before(grammarAccess.getOutputParameterListAccess().getGroup_2_2()); 
            // InternalSoalDsl.g:2682:2: ( rule__OutputParameterList__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSoalDsl.g:2682:3: rule__OutputParameterList__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OutputParameterList__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOutputParameterListAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__2__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2__3"
    // InternalSoalDsl.g:2690:1: rule__OutputParameterList__Group_2__3 : rule__OutputParameterList__Group_2__3__Impl ;
    public final void rule__OutputParameterList__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2694:1: ( rule__OutputParameterList__Group_2__3__Impl )
            // InternalSoalDsl.g:2695:2: rule__OutputParameterList__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__3"


    // $ANTLR start "rule__OutputParameterList__Group_2__3__Impl"
    // InternalSoalDsl.g:2701:1: rule__OutputParameterList__Group_2__3__Impl : ( ')' ) ;
    public final void rule__OutputParameterList__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2705:1: ( ( ')' ) )
            // InternalSoalDsl.g:2706:1: ( ')' )
            {
            // InternalSoalDsl.g:2706:1: ( ')' )
            // InternalSoalDsl.g:2707:2: ')'
            {
             before(grammarAccess.getOutputParameterListAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOutputParameterListAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2__3__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2_2__0"
    // InternalSoalDsl.g:2717:1: rule__OutputParameterList__Group_2_2__0 : rule__OutputParameterList__Group_2_2__0__Impl rule__OutputParameterList__Group_2_2__1 ;
    public final void rule__OutputParameterList__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2721:1: ( rule__OutputParameterList__Group_2_2__0__Impl rule__OutputParameterList__Group_2_2__1 )
            // InternalSoalDsl.g:2722:2: rule__OutputParameterList__Group_2_2__0__Impl rule__OutputParameterList__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__OutputParameterList__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2_2__0"


    // $ANTLR start "rule__OutputParameterList__Group_2_2__0__Impl"
    // InternalSoalDsl.g:2729:1: rule__OutputParameterList__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__OutputParameterList__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2733:1: ( ( ',' ) )
            // InternalSoalDsl.g:2734:1: ( ',' )
            {
            // InternalSoalDsl.g:2734:1: ( ',' )
            // InternalSoalDsl.g:2735:2: ','
            {
             before(grammarAccess.getOutputParameterListAccess().getCommaKeyword_2_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOutputParameterListAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2_2__0__Impl"


    // $ANTLR start "rule__OutputParameterList__Group_2_2__1"
    // InternalSoalDsl.g:2744:1: rule__OutputParameterList__Group_2_2__1 : rule__OutputParameterList__Group_2_2__1__Impl ;
    public final void rule__OutputParameterList__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2748:1: ( rule__OutputParameterList__Group_2_2__1__Impl )
            // InternalSoalDsl.g:2749:2: rule__OutputParameterList__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2_2__1"


    // $ANTLR start "rule__OutputParameterList__Group_2_2__1__Impl"
    // InternalSoalDsl.g:2755:1: rule__OutputParameterList__Group_2_2__1__Impl : ( ( rule__OutputParameterList__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__OutputParameterList__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2759:1: ( ( ( rule__OutputParameterList__ParametersAssignment_2_2_1 ) ) )
            // InternalSoalDsl.g:2760:1: ( ( rule__OutputParameterList__ParametersAssignment_2_2_1 ) )
            {
            // InternalSoalDsl.g:2760:1: ( ( rule__OutputParameterList__ParametersAssignment_2_2_1 ) )
            // InternalSoalDsl.g:2761:2: ( rule__OutputParameterList__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_2_1()); 
            // InternalSoalDsl.g:2762:2: ( rule__OutputParameterList__ParametersAssignment_2_2_1 )
            // InternalSoalDsl.g:2762:3: rule__OutputParameterList__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputParameterList__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__Group_2_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSoalDsl.g:2771:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2775:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSoalDsl.g:2776:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSoalDsl.g:2783:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeReferenceAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2787:1: ( ( ( rule__Parameter__TypeReferenceAssignment_0 ) ) )
            // InternalSoalDsl.g:2788:1: ( ( rule__Parameter__TypeReferenceAssignment_0 ) )
            {
            // InternalSoalDsl.g:2788:1: ( ( rule__Parameter__TypeReferenceAssignment_0 ) )
            // InternalSoalDsl.g:2789:2: ( rule__Parameter__TypeReferenceAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeReferenceAssignment_0()); 
            // InternalSoalDsl.g:2790:2: ( rule__Parameter__TypeReferenceAssignment_0 )
            // InternalSoalDsl.g:2790:3: rule__Parameter__TypeReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSoalDsl.g:2798:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2802:1: ( rule__Parameter__Group__1__Impl )
            // InternalSoalDsl.g:2803:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSoalDsl.g:2809:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2813:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:2814:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:2814:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalSoalDsl.g:2815:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:2816:2: ( rule__Parameter__NameAssignment_1 )
            // InternalSoalDsl.g:2816:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__0"
    // InternalSoalDsl.g:2825:1: rule__ServiceDeclaration__Group__0 : rule__ServiceDeclaration__Group__0__Impl rule__ServiceDeclaration__Group__1 ;
    public final void rule__ServiceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2829:1: ( rule__ServiceDeclaration__Group__0__Impl rule__ServiceDeclaration__Group__1 )
            // InternalSoalDsl.g:2830:2: rule__ServiceDeclaration__Group__0__Impl rule__ServiceDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__0"


    // $ANTLR start "rule__ServiceDeclaration__Group__0__Impl"
    // InternalSoalDsl.g:2837:1: rule__ServiceDeclaration__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2841:1: ( ( 'service' ) )
            // InternalSoalDsl.g:2842:1: ( 'service' )
            {
            // InternalSoalDsl.g:2842:1: ( 'service' )
            // InternalSoalDsl.g:2843:2: 'service'
            {
             before(grammarAccess.getServiceDeclarationAccess().getServiceKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__1"
    // InternalSoalDsl.g:2852:1: rule__ServiceDeclaration__Group__1 : rule__ServiceDeclaration__Group__1__Impl rule__ServiceDeclaration__Group__2 ;
    public final void rule__ServiceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2856:1: ( rule__ServiceDeclaration__Group__1__Impl rule__ServiceDeclaration__Group__2 )
            // InternalSoalDsl.g:2857:2: rule__ServiceDeclaration__Group__1__Impl rule__ServiceDeclaration__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ServiceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__1"


    // $ANTLR start "rule__ServiceDeclaration__Group__1__Impl"
    // InternalSoalDsl.g:2864:1: rule__ServiceDeclaration__Group__1__Impl : ( ( rule__ServiceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ServiceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2868:1: ( ( ( rule__ServiceDeclaration__NameAssignment_1 ) ) )
            // InternalSoalDsl.g:2869:1: ( ( rule__ServiceDeclaration__NameAssignment_1 ) )
            {
            // InternalSoalDsl.g:2869:1: ( ( rule__ServiceDeclaration__NameAssignment_1 ) )
            // InternalSoalDsl.g:2870:2: ( rule__ServiceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getServiceDeclarationAccess().getNameAssignment_1()); 
            // InternalSoalDsl.g:2871:2: ( rule__ServiceDeclaration__NameAssignment_1 )
            // InternalSoalDsl.g:2871:3: rule__ServiceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__2"
    // InternalSoalDsl.g:2879:1: rule__ServiceDeclaration__Group__2 : rule__ServiceDeclaration__Group__2__Impl rule__ServiceDeclaration__Group__3 ;
    public final void rule__ServiceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2883:1: ( rule__ServiceDeclaration__Group__2__Impl rule__ServiceDeclaration__Group__3 )
            // InternalSoalDsl.g:2884:2: rule__ServiceDeclaration__Group__2__Impl rule__ServiceDeclaration__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ServiceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__2"


    // $ANTLR start "rule__ServiceDeclaration__Group__2__Impl"
    // InternalSoalDsl.g:2891:1: rule__ServiceDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__ServiceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2895:1: ( ( ':' ) )
            // InternalSoalDsl.g:2896:1: ( ':' )
            {
            // InternalSoalDsl.g:2896:1: ( ':' )
            // InternalSoalDsl.g:2897:2: ':'
            {
             before(grammarAccess.getServiceDeclarationAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__3"
    // InternalSoalDsl.g:2906:1: rule__ServiceDeclaration__Group__3 : rule__ServiceDeclaration__Group__3__Impl rule__ServiceDeclaration__Group__4 ;
    public final void rule__ServiceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2910:1: ( rule__ServiceDeclaration__Group__3__Impl rule__ServiceDeclaration__Group__4 )
            // InternalSoalDsl.g:2911:2: rule__ServiceDeclaration__Group__3__Impl rule__ServiceDeclaration__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ServiceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__3"


    // $ANTLR start "rule__ServiceDeclaration__Group__3__Impl"
    // InternalSoalDsl.g:2918:1: rule__ServiceDeclaration__Group__3__Impl : ( ( rule__ServiceDeclaration__InterfaceAssignment_3 ) ) ;
    public final void rule__ServiceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2922:1: ( ( ( rule__ServiceDeclaration__InterfaceAssignment_3 ) ) )
            // InternalSoalDsl.g:2923:1: ( ( rule__ServiceDeclaration__InterfaceAssignment_3 ) )
            {
            // InternalSoalDsl.g:2923:1: ( ( rule__ServiceDeclaration__InterfaceAssignment_3 ) )
            // InternalSoalDsl.g:2924:2: ( rule__ServiceDeclaration__InterfaceAssignment_3 )
            {
             before(grammarAccess.getServiceDeclarationAccess().getInterfaceAssignment_3()); 
            // InternalSoalDsl.g:2925:2: ( rule__ServiceDeclaration__InterfaceAssignment_3 )
            // InternalSoalDsl.g:2925:3: rule__ServiceDeclaration__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__InterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceDeclarationAccess().getInterfaceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__4"
    // InternalSoalDsl.g:2933:1: rule__ServiceDeclaration__Group__4 : rule__ServiceDeclaration__Group__4__Impl rule__ServiceDeclaration__Group__5 ;
    public final void rule__ServiceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2937:1: ( rule__ServiceDeclaration__Group__4__Impl rule__ServiceDeclaration__Group__5 )
            // InternalSoalDsl.g:2938:2: rule__ServiceDeclaration__Group__4__Impl rule__ServiceDeclaration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ServiceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__4"


    // $ANTLR start "rule__ServiceDeclaration__Group__4__Impl"
    // InternalSoalDsl.g:2945:1: rule__ServiceDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ServiceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2949:1: ( ( '{' ) )
            // InternalSoalDsl.g:2950:1: ( '{' )
            {
            // InternalSoalDsl.g:2950:1: ( '{' )
            // InternalSoalDsl.g:2951:2: '{'
            {
             before(grammarAccess.getServiceDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__5"
    // InternalSoalDsl.g:2960:1: rule__ServiceDeclaration__Group__5 : rule__ServiceDeclaration__Group__5__Impl rule__ServiceDeclaration__Group__6 ;
    public final void rule__ServiceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2964:1: ( rule__ServiceDeclaration__Group__5__Impl rule__ServiceDeclaration__Group__6 )
            // InternalSoalDsl.g:2965:2: rule__ServiceDeclaration__Group__5__Impl rule__ServiceDeclaration__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ServiceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__5"


    // $ANTLR start "rule__ServiceDeclaration__Group__5__Impl"
    // InternalSoalDsl.g:2972:1: rule__ServiceDeclaration__Group__5__Impl : ( 'binding' ) ;
    public final void rule__ServiceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2976:1: ( ( 'binding' ) )
            // InternalSoalDsl.g:2977:1: ( 'binding' )
            {
            // InternalSoalDsl.g:2977:1: ( 'binding' )
            // InternalSoalDsl.g:2978:2: 'binding'
            {
             before(grammarAccess.getServiceDeclarationAccess().getBindingKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getBindingKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__6"
    // InternalSoalDsl.g:2987:1: rule__ServiceDeclaration__Group__6 : rule__ServiceDeclaration__Group__6__Impl rule__ServiceDeclaration__Group__7 ;
    public final void rule__ServiceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:2991:1: ( rule__ServiceDeclaration__Group__6__Impl rule__ServiceDeclaration__Group__7 )
            // InternalSoalDsl.g:2992:2: rule__ServiceDeclaration__Group__6__Impl rule__ServiceDeclaration__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ServiceDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__6"


    // $ANTLR start "rule__ServiceDeclaration__Group__6__Impl"
    // InternalSoalDsl.g:2999:1: rule__ServiceDeclaration__Group__6__Impl : ( ( rule__ServiceDeclaration__BindingAssignment_6 ) ) ;
    public final void rule__ServiceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3003:1: ( ( ( rule__ServiceDeclaration__BindingAssignment_6 ) ) )
            // InternalSoalDsl.g:3004:1: ( ( rule__ServiceDeclaration__BindingAssignment_6 ) )
            {
            // InternalSoalDsl.g:3004:1: ( ( rule__ServiceDeclaration__BindingAssignment_6 ) )
            // InternalSoalDsl.g:3005:2: ( rule__ServiceDeclaration__BindingAssignment_6 )
            {
             before(grammarAccess.getServiceDeclarationAccess().getBindingAssignment_6()); 
            // InternalSoalDsl.g:3006:2: ( rule__ServiceDeclaration__BindingAssignment_6 )
            // InternalSoalDsl.g:3006:3: rule__ServiceDeclaration__BindingAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__BindingAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceDeclarationAccess().getBindingAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__7"
    // InternalSoalDsl.g:3014:1: rule__ServiceDeclaration__Group__7 : rule__ServiceDeclaration__Group__7__Impl rule__ServiceDeclaration__Group__8 ;
    public final void rule__ServiceDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3018:1: ( rule__ServiceDeclaration__Group__7__Impl rule__ServiceDeclaration__Group__8 )
            // InternalSoalDsl.g:3019:2: rule__ServiceDeclaration__Group__7__Impl rule__ServiceDeclaration__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__ServiceDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__7"


    // $ANTLR start "rule__ServiceDeclaration__Group__7__Impl"
    // InternalSoalDsl.g:3026:1: rule__ServiceDeclaration__Group__7__Impl : ( ';' ) ;
    public final void rule__ServiceDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3030:1: ( ( ';' ) )
            // InternalSoalDsl.g:3031:1: ( ';' )
            {
            // InternalSoalDsl.g:3031:1: ( ';' )
            // InternalSoalDsl.g:3032:2: ';'
            {
             before(grammarAccess.getServiceDeclarationAccess().getSemicolonKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__7__Impl"


    // $ANTLR start "rule__ServiceDeclaration__Group__8"
    // InternalSoalDsl.g:3041:1: rule__ServiceDeclaration__Group__8 : rule__ServiceDeclaration__Group__8__Impl ;
    public final void rule__ServiceDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3045:1: ( rule__ServiceDeclaration__Group__8__Impl )
            // InternalSoalDsl.g:3046:2: rule__ServiceDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__8"


    // $ANTLR start "rule__ServiceDeclaration__Group__8__Impl"
    // InternalSoalDsl.g:3052:1: rule__ServiceDeclaration__Group__8__Impl : ( '}' ) ;
    public final void rule__ServiceDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3056:1: ( ( '}' ) )
            // InternalSoalDsl.g:3057:1: ( '}' )
            {
            // InternalSoalDsl.g:3057:1: ( '}' )
            // InternalSoalDsl.g:3058:2: '}'
            {
             before(grammarAccess.getServiceDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__Group__8__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__0"
    // InternalSoalDsl.g:3068:1: rule__ArrayType__Group_0__0 : rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1 ;
    public final void rule__ArrayType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3072:1: ( rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1 )
            // InternalSoalDsl.g:3073:2: rule__ArrayType__Group_0__0__Impl rule__ArrayType__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__ArrayType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__0"


    // $ANTLR start "rule__ArrayType__Group_0__0__Impl"
    // InternalSoalDsl.g:3080:1: rule__ArrayType__Group_0__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3084:1: ( ( () ) )
            // InternalSoalDsl.g:3085:1: ( () )
            {
            // InternalSoalDsl.g:3085:1: ( () )
            // InternalSoalDsl.g:3086:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getReferenceArrayTypeAction_0_0()); 
            // InternalSoalDsl.g:3087:2: ()
            // InternalSoalDsl.g:3087:3: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getReferenceArrayTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__1"
    // InternalSoalDsl.g:3095:1: rule__ArrayType__Group_0__1 : rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2 ;
    public final void rule__ArrayType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3099:1: ( rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2 )
            // InternalSoalDsl.g:3100:2: rule__ArrayType__Group_0__1__Impl rule__ArrayType__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__ArrayType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__1"


    // $ANTLR start "rule__ArrayType__Group_0__1__Impl"
    // InternalSoalDsl.g:3107:1: rule__ArrayType__Group_0__1__Impl : ( ( rule__ArrayType__InnerTypeAssignment_0_1 ) ) ;
    public final void rule__ArrayType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3111:1: ( ( ( rule__ArrayType__InnerTypeAssignment_0_1 ) ) )
            // InternalSoalDsl.g:3112:1: ( ( rule__ArrayType__InnerTypeAssignment_0_1 ) )
            {
            // InternalSoalDsl.g:3112:1: ( ( rule__ArrayType__InnerTypeAssignment_0_1 ) )
            // InternalSoalDsl.g:3113:2: ( rule__ArrayType__InnerTypeAssignment_0_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_0_1()); 
            // InternalSoalDsl.g:3114:2: ( rule__ArrayType__InnerTypeAssignment_0_1 )
            // InternalSoalDsl.g:3114:3: rule__ArrayType__InnerTypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__InnerTypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__2"
    // InternalSoalDsl.g:3122:1: rule__ArrayType__Group_0__2 : rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3 ;
    public final void rule__ArrayType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3126:1: ( rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3 )
            // InternalSoalDsl.g:3127:2: rule__ArrayType__Group_0__2__Impl rule__ArrayType__Group_0__3
            {
            pushFollow(FOLLOW_32);
            rule__ArrayType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__2"


    // $ANTLR start "rule__ArrayType__Group_0__2__Impl"
    // InternalSoalDsl.g:3134:1: rule__ArrayType__Group_0__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3138:1: ( ( '[' ) )
            // InternalSoalDsl.g:3139:1: ( '[' )
            {
            // InternalSoalDsl.g:3139:1: ( '[' )
            // InternalSoalDsl.g:3140:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__2__Impl"


    // $ANTLR start "rule__ArrayType__Group_0__3"
    // InternalSoalDsl.g:3149:1: rule__ArrayType__Group_0__3 : rule__ArrayType__Group_0__3__Impl ;
    public final void rule__ArrayType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3153:1: ( rule__ArrayType__Group_0__3__Impl )
            // InternalSoalDsl.g:3154:2: rule__ArrayType__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__3"


    // $ANTLR start "rule__ArrayType__Group_0__3__Impl"
    // InternalSoalDsl.g:3160:1: rule__ArrayType__Group_0__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3164:1: ( ( ']' ) )
            // InternalSoalDsl.g:3165:1: ( ']' )
            {
            // InternalSoalDsl.g:3165:1: ( ']' )
            // InternalSoalDsl.g:3166:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_0__3__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__0"
    // InternalSoalDsl.g:3176:1: rule__ArrayType__Group_1__0 : rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 ;
    public final void rule__ArrayType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3180:1: ( rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 )
            // InternalSoalDsl.g:3181:2: rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ArrayType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0"


    // $ANTLR start "rule__ArrayType__Group_1__0__Impl"
    // InternalSoalDsl.g:3188:1: rule__ArrayType__Group_1__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3192:1: ( ( () ) )
            // InternalSoalDsl.g:3193:1: ( () )
            {
            // InternalSoalDsl.g:3193:1: ( () )
            // InternalSoalDsl.g:3194:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getContainmentArrayTypeAction_1_0()); 
            // InternalSoalDsl.g:3195:2: ()
            // InternalSoalDsl.g:3195:3: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getContainmentArrayTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__1"
    // InternalSoalDsl.g:3203:1: rule__ArrayType__Group_1__1 : rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2 ;
    public final void rule__ArrayType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3207:1: ( rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2 )
            // InternalSoalDsl.g:3208:2: rule__ArrayType__Group_1__1__Impl rule__ArrayType__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__ArrayType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1"


    // $ANTLR start "rule__ArrayType__Group_1__1__Impl"
    // InternalSoalDsl.g:3215:1: rule__ArrayType__Group_1__1__Impl : ( ( rule__ArrayType__InnerTypeAssignment_1_1 ) ) ;
    public final void rule__ArrayType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3219:1: ( ( ( rule__ArrayType__InnerTypeAssignment_1_1 ) ) )
            // InternalSoalDsl.g:3220:1: ( ( rule__ArrayType__InnerTypeAssignment_1_1 ) )
            {
            // InternalSoalDsl.g:3220:1: ( ( rule__ArrayType__InnerTypeAssignment_1_1 ) )
            // InternalSoalDsl.g:3221:2: ( rule__ArrayType__InnerTypeAssignment_1_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_1_1()); 
            // InternalSoalDsl.g:3222:2: ( rule__ArrayType__InnerTypeAssignment_1_1 )
            // InternalSoalDsl.g:3222:3: rule__ArrayType__InnerTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__InnerTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__2"
    // InternalSoalDsl.g:3230:1: rule__ArrayType__Group_1__2 : rule__ArrayType__Group_1__2__Impl rule__ArrayType__Group_1__3 ;
    public final void rule__ArrayType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3234:1: ( rule__ArrayType__Group_1__2__Impl rule__ArrayType__Group_1__3 )
            // InternalSoalDsl.g:3235:2: rule__ArrayType__Group_1__2__Impl rule__ArrayType__Group_1__3
            {
            pushFollow(FOLLOW_32);
            rule__ArrayType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__2"


    // $ANTLR start "rule__ArrayType__Group_1__2__Impl"
    // InternalSoalDsl.g:3242:1: rule__ArrayType__Group_1__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3246:1: ( ( '[' ) )
            // InternalSoalDsl.g:3247:1: ( '[' )
            {
            // InternalSoalDsl.g:3247:1: ( '[' )
            // InternalSoalDsl.g:3248:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__2__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__3"
    // InternalSoalDsl.g:3257:1: rule__ArrayType__Group_1__3 : rule__ArrayType__Group_1__3__Impl ;
    public final void rule__ArrayType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3261:1: ( rule__ArrayType__Group_1__3__Impl )
            // InternalSoalDsl.g:3262:2: rule__ArrayType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__3"


    // $ANTLR start "rule__ArrayType__Group_1__3__Impl"
    // InternalSoalDsl.g:3268:1: rule__ArrayType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3272:1: ( ( ']' ) )
            // InternalSoalDsl.g:3273:1: ( ']' )
            {
            // InternalSoalDsl.g:3273:1: ( ']' )
            // InternalSoalDsl.g:3274:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__3__Impl"


    // $ANTLR start "rule__NullableType__Group__0"
    // InternalSoalDsl.g:3284:1: rule__NullableType__Group__0 : rule__NullableType__Group__0__Impl rule__NullableType__Group__1 ;
    public final void rule__NullableType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3288:1: ( rule__NullableType__Group__0__Impl rule__NullableType__Group__1 )
            // InternalSoalDsl.g:3289:2: rule__NullableType__Group__0__Impl rule__NullableType__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NullableType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullableType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullableType__Group__0"


    // $ANTLR start "rule__NullableType__Group__0__Impl"
    // InternalSoalDsl.g:3296:1: rule__NullableType__Group__0__Impl : ( ( rule__NullableType__InnerTypeAssignment_0 ) ) ;
    public final void rule__NullableType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3300:1: ( ( ( rule__NullableType__InnerTypeAssignment_0 ) ) )
            // InternalSoalDsl.g:3301:1: ( ( rule__NullableType__InnerTypeAssignment_0 ) )
            {
            // InternalSoalDsl.g:3301:1: ( ( rule__NullableType__InnerTypeAssignment_0 ) )
            // InternalSoalDsl.g:3302:2: ( rule__NullableType__InnerTypeAssignment_0 )
            {
             before(grammarAccess.getNullableTypeAccess().getInnerTypeAssignment_0()); 
            // InternalSoalDsl.g:3303:2: ( rule__NullableType__InnerTypeAssignment_0 )
            // InternalSoalDsl.g:3303:3: rule__NullableType__InnerTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NullableType__InnerTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNullableTypeAccess().getInnerTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullableType__Group__0__Impl"


    // $ANTLR start "rule__NullableType__Group__1"
    // InternalSoalDsl.g:3311:1: rule__NullableType__Group__1 : rule__NullableType__Group__1__Impl ;
    public final void rule__NullableType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3315:1: ( rule__NullableType__Group__1__Impl )
            // InternalSoalDsl.g:3316:2: rule__NullableType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullableType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullableType__Group__1"


    // $ANTLR start "rule__NullableType__Group__1__Impl"
    // InternalSoalDsl.g:3322:1: rule__NullableType__Group__1__Impl : ( '?' ) ;
    public final void rule__NullableType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3326:1: ( ( '?' ) )
            // InternalSoalDsl.g:3327:1: ( '?' )
            {
            // InternalSoalDsl.g:3327:1: ( '?' )
            // InternalSoalDsl.g:3328:2: '?'
            {
             before(grammarAccess.getNullableTypeAccess().getQuestionMarkKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNullableTypeAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullableType__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSoalDsl.g:3338:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3342:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSoalDsl.g:3343:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSoalDsl.g:3350:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3354:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3355:1: ( RULE_ID )
            {
            // InternalSoalDsl.g:3355:1: ( RULE_ID )
            // InternalSoalDsl.g:3356:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSoalDsl.g:3365:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3369:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSoalDsl.g:3370:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSoalDsl.g:3376:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3380:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSoalDsl.g:3381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSoalDsl.g:3381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSoalDsl.g:3382:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSoalDsl.g:3383:2: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSoalDsl.g:3383:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSoalDsl.g:3392:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3396:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSoalDsl.g:3397:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSoalDsl.g:3404:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3408:1: ( ( '.' ) )
            // InternalSoalDsl.g:3409:1: ( '.' )
            {
            // InternalSoalDsl.g:3409:1: ( '.' )
            // InternalSoalDsl.g:3410:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSoalDsl.g:3419:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3423:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSoalDsl.g:3424:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSoalDsl.g:3430:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3434:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3435:1: ( RULE_ID )
            {
            // InternalSoalDsl.g:3435:1: ( RULE_ID )
            // InternalSoalDsl.g:3436:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SoalModel__NameAssignment_1"
    // InternalSoalDsl.g:3446:1: rule__SoalModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SoalModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3450:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3451:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3451:2: ( RULE_ID )
            // InternalSoalDsl.g:3452:3: RULE_ID
            {
             before(grammarAccess.getSoalModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__NameAssignment_1"


    // $ANTLR start "rule__SoalModel__ImportsAssignment_3_1"
    // InternalSoalDsl.g:3461:1: rule__SoalModel__ImportsAssignment_3_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SoalModel__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3465:1: ( ( ( RULE_STRING ) ) )
            // InternalSoalDsl.g:3466:2: ( ( RULE_STRING ) )
            {
            // InternalSoalDsl.g:3466:2: ( ( RULE_STRING ) )
            // InternalSoalDsl.g:3467:3: ( RULE_STRING )
            {
             before(grammarAccess.getSoalModelAccess().getImportsSoalModelCrossReference_3_1_0()); 
            // InternalSoalDsl.g:3468:3: ( RULE_STRING )
            // InternalSoalDsl.g:3469:4: RULE_STRING
            {
             before(grammarAccess.getSoalModelAccess().getImportsSoalModelSTRINGTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSoalModelAccess().getImportsSoalModelSTRINGTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSoalModelAccess().getImportsSoalModelCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__ImportsAssignment_3_1"


    // $ANTLR start "rule__SoalModel__DeclarationsAssignment_4"
    // InternalSoalDsl.g:3480:1: rule__SoalModel__DeclarationsAssignment_4 : ( ruleDeclaration ) ;
    public final void rule__SoalModel__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3484:1: ( ( ruleDeclaration ) )
            // InternalSoalDsl.g:3485:2: ( ruleDeclaration )
            {
            // InternalSoalDsl.g:3485:2: ( ruleDeclaration )
            // InternalSoalDsl.g:3486:3: ruleDeclaration
            {
             before(grammarAccess.getSoalModelAccess().getDeclarationsDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSoalModelAccess().getDeclarationsDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoalModel__DeclarationsAssignment_4"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // InternalSoalDsl.g:3495:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3499:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3500:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3500:2: ( RULE_ID )
            // InternalSoalDsl.g:3501:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__LiteralsAssignment_3_0"
    // InternalSoalDsl.g:3510:1: rule__EnumDeclaration__LiteralsAssignment_3_0 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3514:1: ( ( ruleEnumLiteral ) )
            // InternalSoalDsl.g:3515:2: ( ruleEnumLiteral )
            {
            // InternalSoalDsl.g:3515:2: ( ruleEnumLiteral )
            // InternalSoalDsl.g:3516:3: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__LiteralsAssignment_3_0"


    // $ANTLR start "rule__EnumDeclaration__LiteralsAssignment_3_1_1"
    // InternalSoalDsl.g:3525:1: rule__EnumDeclaration__LiteralsAssignment_3_1_1 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3529:1: ( ( ruleEnumLiteral ) )
            // InternalSoalDsl.g:3530:2: ( ruleEnumLiteral )
            {
            // InternalSoalDsl.g:3530:2: ( ruleEnumLiteral )
            // InternalSoalDsl.g:3531:3: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__LiteralsAssignment_3_1_1"


    // $ANTLR start "rule__EnumLiteral__NameAssignment"
    // InternalSoalDsl.g:3540:1: rule__EnumLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3544:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3545:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3545:2: ( RULE_ID )
            // InternalSoalDsl.g:3546:3: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__NameAssignment"


    // $ANTLR start "rule__StructDeclaration__NameAssignment_1"
    // InternalSoalDsl.g:3555:1: rule__StructDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3559:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3560:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3560:2: ( RULE_ID )
            // InternalSoalDsl.g:3561:3: RULE_ID
            {
             before(grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StructDeclaration__BaseTypeAssignment_2_1"
    // InternalSoalDsl.g:3570:1: rule__StructDeclaration__BaseTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StructDeclaration__BaseTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3574:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3575:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3575:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3576:3: ( RULE_ID )
            {
             before(grammarAccess.getStructDeclarationAccess().getBaseTypeStructTypeCrossReference_2_1_0()); 
            // InternalSoalDsl.g:3577:3: ( RULE_ID )
            // InternalSoalDsl.g:3578:4: RULE_ID
            {
             before(grammarAccess.getStructDeclarationAccess().getBaseTypeStructTypeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDeclarationAccess().getBaseTypeStructTypeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStructDeclarationAccess().getBaseTypeStructTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__BaseTypeAssignment_2_1"


    // $ANTLR start "rule__StructDeclaration__FieldsAssignment_4"
    // InternalSoalDsl.g:3589:1: rule__StructDeclaration__FieldsAssignment_4 : ( ruleFieldDeclaration ) ;
    public final void rule__StructDeclaration__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3593:1: ( ( ruleFieldDeclaration ) )
            // InternalSoalDsl.g:3594:2: ( ruleFieldDeclaration )
            {
            // InternalSoalDsl.g:3594:2: ( ruleFieldDeclaration )
            // InternalSoalDsl.g:3595:3: ruleFieldDeclaration
            {
             before(grammarAccess.getStructDeclarationAccess().getFieldsFieldDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStructDeclarationAccess().getFieldsFieldDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDeclaration__FieldsAssignment_4"


    // $ANTLR start "rule__FieldDeclaration__TypeReferenceAssignment_0"
    // InternalSoalDsl.g:3604:1: rule__FieldDeclaration__TypeReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__FieldDeclaration__TypeReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3608:1: ( ( ruleTypeReference ) )
            // InternalSoalDsl.g:3609:2: ( ruleTypeReference )
            {
            // InternalSoalDsl.g:3609:2: ( ruleTypeReference )
            // InternalSoalDsl.g:3610:3: ruleTypeReference
            {
             before(grammarAccess.getFieldDeclarationAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getFieldDeclarationAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__TypeReferenceAssignment_0"


    // $ANTLR start "rule__FieldDeclaration__NameAssignment_1"
    // InternalSoalDsl.g:3619:1: rule__FieldDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3623:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3624:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3624:2: ( RULE_ID )
            // InternalSoalDsl.g:3625:3: RULE_ID
            {
             before(grammarAccess.getFieldDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDeclaration__NameAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__NameAssignment_1"
    // InternalSoalDsl.g:3634:1: rule__InterfaceDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterfaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3638:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3639:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3639:2: ( RULE_ID )
            // InternalSoalDsl.g:3640:3: RULE_ID
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__InterfaceDeclaration__ResourcesAssignment_3"
    // InternalSoalDsl.g:3649:1: rule__InterfaceDeclaration__ResourcesAssignment_3 : ( ruleResourceDeclaration ) ;
    public final void rule__InterfaceDeclaration__ResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3653:1: ( ( ruleResourceDeclaration ) )
            // InternalSoalDsl.g:3654:2: ( ruleResourceDeclaration )
            {
            // InternalSoalDsl.g:3654:2: ( ruleResourceDeclaration )
            // InternalSoalDsl.g:3655:3: ruleResourceDeclaration
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getResourcesResourceDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getResourcesResourceDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__ResourcesAssignment_3"


    // $ANTLR start "rule__InterfaceDeclaration__OperationsAssignment_4"
    // InternalSoalDsl.g:3664:1: rule__InterfaceDeclaration__OperationsAssignment_4 : ( ruleOperationDeclaration ) ;
    public final void rule__InterfaceDeclaration__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3668:1: ( ( ruleOperationDeclaration ) )
            // InternalSoalDsl.g:3669:2: ( ruleOperationDeclaration )
            {
            // InternalSoalDsl.g:3669:2: ( ruleOperationDeclaration )
            // InternalSoalDsl.g:3670:3: ruleOperationDeclaration
            {
             before(grammarAccess.getInterfaceDeclarationAccess().getOperationsOperationDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getInterfaceDeclarationAccess().getOperationsOperationDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceDeclaration__OperationsAssignment_4"


    // $ANTLR start "rule__ResourceDeclaration__ReadonlyAssignment_0"
    // InternalSoalDsl.g:3679:1: rule__ResourceDeclaration__ReadonlyAssignment_0 : ( ( 'readonly' ) ) ;
    public final void rule__ResourceDeclaration__ReadonlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3683:1: ( ( ( 'readonly' ) ) )
            // InternalSoalDsl.g:3684:2: ( ( 'readonly' ) )
            {
            // InternalSoalDsl.g:3684:2: ( ( 'readonly' ) )
            // InternalSoalDsl.g:3685:3: ( 'readonly' )
            {
             before(grammarAccess.getResourceDeclarationAccess().getReadonlyReadonlyKeyword_0_0()); 
            // InternalSoalDsl.g:3686:3: ( 'readonly' )
            // InternalSoalDsl.g:3687:4: 'readonly'
            {
             before(grammarAccess.getResourceDeclarationAccess().getReadonlyReadonlyKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getReadonlyReadonlyKeyword_0_0()); 

            }

             after(grammarAccess.getResourceDeclarationAccess().getReadonlyReadonlyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__ReadonlyAssignment_0"


    // $ANTLR start "rule__ResourceDeclaration__EntityAssignment_2"
    // InternalSoalDsl.g:3698:1: rule__ResourceDeclaration__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceDeclaration__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3702:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3703:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3703:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3704:3: ( RULE_ID )
            {
             before(grammarAccess.getResourceDeclarationAccess().getEntityStructTypeCrossReference_2_0()); 
            // InternalSoalDsl.g:3705:3: ( RULE_ID )
            // InternalSoalDsl.g:3706:4: RULE_ID
            {
             before(grammarAccess.getResourceDeclarationAccess().getEntityStructTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getEntityStructTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getResourceDeclarationAccess().getEntityStructTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__EntityAssignment_2"


    // $ANTLR start "rule__ResourceDeclaration__ExceptionsAssignment_3_1"
    // InternalSoalDsl.g:3717:1: rule__ResourceDeclaration__ExceptionsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceDeclaration__ExceptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3721:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3722:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3722:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3723:3: ( RULE_ID )
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_1_0()); 
            // InternalSoalDsl.g:3724:3: ( RULE_ID )
            // InternalSoalDsl.g:3725:4: RULE_ID
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__ExceptionsAssignment_3_1"


    // $ANTLR start "rule__ResourceDeclaration__ExceptionsAssignment_3_2_1"
    // InternalSoalDsl.g:3736:1: rule__ResourceDeclaration__ExceptionsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceDeclaration__ExceptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3740:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3741:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3741:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3742:3: ( RULE_ID )
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_2_1_0()); 
            // InternalSoalDsl.g:3743:3: ( RULE_ID )
            // InternalSoalDsl.g:3744:4: RULE_ID
            {
             before(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getResourceDeclarationAccess().getExceptionsStructTypeCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceDeclaration__ExceptionsAssignment_3_2_1"


    // $ANTLR start "rule__OperationDeclaration__AsyncAssignment_0"
    // InternalSoalDsl.g:3755:1: rule__OperationDeclaration__AsyncAssignment_0 : ( ( 'async' ) ) ;
    public final void rule__OperationDeclaration__AsyncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3759:1: ( ( ( 'async' ) ) )
            // InternalSoalDsl.g:3760:2: ( ( 'async' ) )
            {
            // InternalSoalDsl.g:3760:2: ( ( 'async' ) )
            // InternalSoalDsl.g:3761:3: ( 'async' )
            {
             before(grammarAccess.getOperationDeclarationAccess().getAsyncAsyncKeyword_0_0()); 
            // InternalSoalDsl.g:3762:3: ( 'async' )
            // InternalSoalDsl.g:3763:4: 'async'
            {
             before(grammarAccess.getOperationDeclarationAccess().getAsyncAsyncKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getAsyncAsyncKeyword_0_0()); 

            }

             after(grammarAccess.getOperationDeclarationAccess().getAsyncAsyncKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__AsyncAssignment_0"


    // $ANTLR start "rule__OperationDeclaration__ResponseParametersAssignment_1"
    // InternalSoalDsl.g:3774:1: rule__OperationDeclaration__ResponseParametersAssignment_1 : ( ruleOutputParameterList ) ;
    public final void rule__OperationDeclaration__ResponseParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3778:1: ( ( ruleOutputParameterList ) )
            // InternalSoalDsl.g:3779:2: ( ruleOutputParameterList )
            {
            // InternalSoalDsl.g:3779:2: ( ruleOutputParameterList )
            // InternalSoalDsl.g:3780:3: ruleOutputParameterList
            {
             before(grammarAccess.getOperationDeclarationAccess().getResponseParametersOutputParameterListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputParameterList();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getResponseParametersOutputParameterListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__ResponseParametersAssignment_1"


    // $ANTLR start "rule__OperationDeclaration__NameAssignment_2"
    // InternalSoalDsl.g:3789:1: rule__OperationDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OperationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3793:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3794:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3794:2: ( RULE_ID )
            // InternalSoalDsl.g:3795:3: RULE_ID
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__NameAssignment_2"


    // $ANTLR start "rule__OperationDeclaration__RequestParametersAssignment_3"
    // InternalSoalDsl.g:3804:1: rule__OperationDeclaration__RequestParametersAssignment_3 : ( ruleInputParameterList ) ;
    public final void rule__OperationDeclaration__RequestParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3808:1: ( ( ruleInputParameterList ) )
            // InternalSoalDsl.g:3809:2: ( ruleInputParameterList )
            {
            // InternalSoalDsl.g:3809:2: ( ruleInputParameterList )
            // InternalSoalDsl.g:3810:3: ruleInputParameterList
            {
             before(grammarAccess.getOperationDeclarationAccess().getRequestParametersInputParameterListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputParameterList();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getRequestParametersInputParameterListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__RequestParametersAssignment_3"


    // $ANTLR start "rule__OperationDeclaration__ExceptionsAssignment_4_1"
    // InternalSoalDsl.g:3819:1: rule__OperationDeclaration__ExceptionsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationDeclaration__ExceptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3823:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3824:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3824:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3825:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_1_0()); 
            // InternalSoalDsl.g:3826:3: ( RULE_ID )
            // InternalSoalDsl.g:3827:4: RULE_ID
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__ExceptionsAssignment_4_1"


    // $ANTLR start "rule__OperationDeclaration__ExceptionsAssignment_4_2_1"
    // InternalSoalDsl.g:3838:1: rule__OperationDeclaration__ExceptionsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationDeclaration__ExceptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3842:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3843:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3843:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3844:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_2_1_0()); 
            // InternalSoalDsl.g:3845:3: ( RULE_ID )
            // InternalSoalDsl.g:3846:4: RULE_ID
            {
             before(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getOperationDeclarationAccess().getExceptionsStructTypeCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__ExceptionsAssignment_4_2_1"


    // $ANTLR start "rule__InputParameterList__ParametersAssignment_2_0"
    // InternalSoalDsl.g:3857:1: rule__InputParameterList__ParametersAssignment_2_0 : ( ruleParameter ) ;
    public final void rule__InputParameterList__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3861:1: ( ( ruleParameter ) )
            // InternalSoalDsl.g:3862:2: ( ruleParameter )
            {
            // InternalSoalDsl.g:3862:2: ( ruleParameter )
            // InternalSoalDsl.g:3863:3: ruleParameter
            {
             before(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__ParametersAssignment_2_0"


    // $ANTLR start "rule__InputParameterList__ParametersAssignment_2_1_1"
    // InternalSoalDsl.g:3872:1: rule__InputParameterList__ParametersAssignment_2_1_1 : ( ruleParameter ) ;
    public final void rule__InputParameterList__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3876:1: ( ( ruleParameter ) )
            // InternalSoalDsl.g:3877:2: ( ruleParameter )
            {
            // InternalSoalDsl.g:3877:2: ( ruleParameter )
            // InternalSoalDsl.g:3878:3: ruleParameter
            {
             before(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getInputParameterListAccess().getParametersParameterParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputParameterList__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__OutputParameterList__ParametersAssignment_1_1"
    // InternalSoalDsl.g:3887:1: rule__OutputParameterList__ParametersAssignment_1_1 : ( ruleSingleReturnParameter ) ;
    public final void rule__OutputParameterList__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3891:1: ( ( ruleSingleReturnParameter ) )
            // InternalSoalDsl.g:3892:2: ( ruleSingleReturnParameter )
            {
            // InternalSoalDsl.g:3892:2: ( ruleSingleReturnParameter )
            // InternalSoalDsl.g:3893:3: ruleSingleReturnParameter
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersSingleReturnParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleReturnParameter();

            state._fsp--;

             after(grammarAccess.getOutputParameterListAccess().getParametersSingleReturnParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__ParametersAssignment_1_1"


    // $ANTLR start "rule__OutputParameterList__ParametersAssignment_2_1"
    // InternalSoalDsl.g:3902:1: rule__OutputParameterList__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__OutputParameterList__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3906:1: ( ( ruleParameter ) )
            // InternalSoalDsl.g:3907:2: ( ruleParameter )
            {
            // InternalSoalDsl.g:3907:2: ( ruleParameter )
            // InternalSoalDsl.g:3908:3: ruleParameter
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__ParametersAssignment_2_1"


    // $ANTLR start "rule__OutputParameterList__ParametersAssignment_2_2_1"
    // InternalSoalDsl.g:3917:1: rule__OutputParameterList__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__OutputParameterList__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3921:1: ( ( ruleParameter ) )
            // InternalSoalDsl.g:3922:2: ( ruleParameter )
            {
            // InternalSoalDsl.g:3922:2: ( ruleParameter )
            // InternalSoalDsl.g:3923:3: ruleParameter
            {
             before(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOutputParameterListAccess().getParametersParameterParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputParameterList__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Parameter__TypeReferenceAssignment_0"
    // InternalSoalDsl.g:3932:1: rule__Parameter__TypeReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3936:1: ( ( ruleTypeReference ) )
            // InternalSoalDsl.g:3937:2: ( ruleTypeReference )
            {
            // InternalSoalDsl.g:3937:2: ( ruleTypeReference )
            // InternalSoalDsl.g:3938:3: ruleTypeReference
            {
             before(grammarAccess.getParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeReferenceAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalSoalDsl.g:3947:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3951:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3952:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3952:2: ( RULE_ID )
            // InternalSoalDsl.g:3953:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__SingleReturnParameter__TypeReferenceAssignment"
    // InternalSoalDsl.g:3962:1: rule__SingleReturnParameter__TypeReferenceAssignment : ( ruleTypeReference ) ;
    public final void rule__SingleReturnParameter__TypeReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3966:1: ( ( ruleTypeReference ) )
            // InternalSoalDsl.g:3967:2: ( ruleTypeReference )
            {
            // InternalSoalDsl.g:3967:2: ( ruleTypeReference )
            // InternalSoalDsl.g:3968:3: ruleTypeReference
            {
             before(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceTypeReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReturnParameter__TypeReferenceAssignment"


    // $ANTLR start "rule__ServiceDeclaration__NameAssignment_1"
    // InternalSoalDsl.g:3977:1: rule__ServiceDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3981:1: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3982:2: ( RULE_ID )
            {
            // InternalSoalDsl.g:3982:2: ( RULE_ID )
            // InternalSoalDsl.g:3983:3: RULE_ID
            {
             before(grammarAccess.getServiceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ServiceDeclaration__InterfaceAssignment_3"
    // InternalSoalDsl.g:3992:1: rule__ServiceDeclaration__InterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ServiceDeclaration__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:3996:1: ( ( ( RULE_ID ) ) )
            // InternalSoalDsl.g:3997:2: ( ( RULE_ID ) )
            {
            // InternalSoalDsl.g:3997:2: ( ( RULE_ID ) )
            // InternalSoalDsl.g:3998:3: ( RULE_ID )
            {
             before(grammarAccess.getServiceDeclarationAccess().getInterfaceInterfaceCrossReference_3_0()); 
            // InternalSoalDsl.g:3999:3: ( RULE_ID )
            // InternalSoalDsl.g:4000:4: RULE_ID
            {
             before(grammarAccess.getServiceDeclarationAccess().getInterfaceInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceDeclarationAccess().getInterfaceInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServiceDeclarationAccess().getInterfaceInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__InterfaceAssignment_3"


    // $ANTLR start "rule__ServiceDeclaration__BindingAssignment_6"
    // InternalSoalDsl.g:4011:1: rule__ServiceDeclaration__BindingAssignment_6 : ( ( rule__ServiceDeclaration__BindingAlternatives_6_0 ) ) ;
    public final void rule__ServiceDeclaration__BindingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:4015:1: ( ( ( rule__ServiceDeclaration__BindingAlternatives_6_0 ) ) )
            // InternalSoalDsl.g:4016:2: ( ( rule__ServiceDeclaration__BindingAlternatives_6_0 ) )
            {
            // InternalSoalDsl.g:4016:2: ( ( rule__ServiceDeclaration__BindingAlternatives_6_0 ) )
            // InternalSoalDsl.g:4017:3: ( rule__ServiceDeclaration__BindingAlternatives_6_0 )
            {
             before(grammarAccess.getServiceDeclarationAccess().getBindingAlternatives_6_0()); 
            // InternalSoalDsl.g:4018:3: ( rule__ServiceDeclaration__BindingAlternatives_6_0 )
            // InternalSoalDsl.g:4018:4: rule__ServiceDeclaration__BindingAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDeclaration__BindingAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceDeclarationAccess().getBindingAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDeclaration__BindingAssignment_6"


    // $ANTLR start "rule__ArrayType__InnerTypeAssignment_0_1"
    // InternalSoalDsl.g:4026:1: rule__ArrayType__InnerTypeAssignment_0_1 : ( ( ruleSimpleTypeName ) ) ;
    public final void rule__ArrayType__InnerTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:4030:1: ( ( ( ruleSimpleTypeName ) ) )
            // InternalSoalDsl.g:4031:2: ( ( ruleSimpleTypeName ) )
            {
            // InternalSoalDsl.g:4031:2: ( ( ruleSimpleTypeName ) )
            // InternalSoalDsl.g:4032:3: ( ruleSimpleTypeName )
            {
             before(grammarAccess.getArrayTypeAccess().getInnerTypeTypeCrossReference_0_1_0()); 
            // InternalSoalDsl.g:4033:3: ( ruleSimpleTypeName )
            // InternalSoalDsl.g:4034:4: ruleSimpleTypeName
            {
             before(grammarAccess.getArrayTypeAccess().getInnerTypeTypeSimpleTypeNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeName();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getInnerTypeTypeSimpleTypeNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getInnerTypeTypeCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__InnerTypeAssignment_0_1"


    // $ANTLR start "rule__ArrayType__InnerTypeAssignment_1_1"
    // InternalSoalDsl.g:4045:1: rule__ArrayType__InnerTypeAssignment_1_1 : ( ruleNullableType ) ;
    public final void rule__ArrayType__InnerTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:4049:1: ( ( ruleNullableType ) )
            // InternalSoalDsl.g:4050:2: ( ruleNullableType )
            {
            // InternalSoalDsl.g:4050:2: ( ruleNullableType )
            // InternalSoalDsl.g:4051:3: ruleNullableType
            {
             before(grammarAccess.getArrayTypeAccess().getInnerTypeNullableTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullableType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getInnerTypeNullableTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__InnerTypeAssignment_1_1"


    // $ANTLR start "rule__NullableType__InnerTypeAssignment_0"
    // InternalSoalDsl.g:4060:1: rule__NullableType__InnerTypeAssignment_0 : ( ( ruleSimpleTypeName ) ) ;
    public final void rule__NullableType__InnerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:4064:1: ( ( ( ruleSimpleTypeName ) ) )
            // InternalSoalDsl.g:4065:2: ( ( ruleSimpleTypeName ) )
            {
            // InternalSoalDsl.g:4065:2: ( ( ruleSimpleTypeName ) )
            // InternalSoalDsl.g:4066:3: ( ruleSimpleTypeName )
            {
             before(grammarAccess.getNullableTypeAccess().getInnerTypeTypeCrossReference_0_0()); 
            // InternalSoalDsl.g:4067:3: ( ruleSimpleTypeName )
            // InternalSoalDsl.g:4068:4: ruleSimpleTypeName
            {
             before(grammarAccess.getNullableTypeAccess().getInnerTypeTypeSimpleTypeNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeName();

            state._fsp--;

             after(grammarAccess.getNullableTypeAccess().getInnerTypeTypeSimpleTypeNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNullableTypeAccess().getInnerTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullableType__InnerTypeAssignment_0"


    // $ANTLR start "rule__SimpleTypeReference__ReferencedTypeAssignment"
    // InternalSoalDsl.g:4079:1: rule__SimpleTypeReference__ReferencedTypeAssignment : ( ( ruleSimpleTypeName ) ) ;
    public final void rule__SimpleTypeReference__ReferencedTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSoalDsl.g:4083:1: ( ( ( ruleSimpleTypeName ) ) )
            // InternalSoalDsl.g:4084:2: ( ( ruleSimpleTypeName ) )
            {
            // InternalSoalDsl.g:4084:2: ( ( ruleSimpleTypeName ) )
            // InternalSoalDsl.g:4085:3: ( ruleSimpleTypeName )
            {
             before(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeTypeCrossReference_0()); 
            // InternalSoalDsl.g:4086:3: ( ruleSimpleTypeName )
            // InternalSoalDsl.g:4087:4: ruleSimpleTypeName
            {
             before(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeTypeSimpleTypeNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypeName();

            state._fsp--;

             after(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeTypeSimpleTypeNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypeReference__ReferencedTypeAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\uffff\15\17\2\uffff\1\22\2\uffff\1\17";
    static final String dfa_3s = "\16\4\2\uffff\2\4\1\uffff\1\4";
    static final String dfa_4s = "\1\30\14\54\1\55\2\uffff\1\52\1\4\1\uffff\1\55";
    static final String dfa_5s = "\16\uffff\1\1\1\3\2\uffff\1\2\1\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20",
            "\1\17\45\uffff\1\16\1\uffff\1\20\1\21",
            "",
            "",
            "\1\22\45\uffff\1\16",
            "\1\23",
            "",
            "\1\17\45\uffff\1\16\1\uffff\1\20\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "665:1: rule__TypeReference__Alternatives : ( ( ruleArrayType ) | ( ruleNullableType ) | ( ruleSimpleTypeReference ) );";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\15\52\2\uffff\1\4\1\52";
    static final String dfa_10s = "\1\30\14\54\1\55\2\uffff\1\4\1\55";
    static final String dfa_11s = "\16\uffff\1\1\1\2\2\uffff";
    static final String dfa_12s = "\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\15\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17\1\20",
            "",
            "",
            "\1\21",
            "\1\16\1\uffff\1\17\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "692:1: rule__ArrayType__Alternatives : ( ( ( rule__ArrayType__Group_0__0 ) ) | ( ( rule__ArrayType__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010518000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010510000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000041FFE010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001FFE012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000C0A841FFE010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400800000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000080A001FFE012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000080A001FFE010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004001FFE010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001FFE010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000002L});

}