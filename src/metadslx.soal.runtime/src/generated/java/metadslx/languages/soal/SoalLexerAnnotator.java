package metadslx.languages.soal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;

@SuppressWarnings("unused")
public class SoalLexerAnnotator
{
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();
    private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();
    
    public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }
    
    
    public SoalLexerAnnotator()
    {
        List<Object> annotList = null;
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(SoalLexer.MULTILINE_COMMENT, annotList);
        SyntaxAnnotation __tmp1 = new SyntaxAnnotation();
        __tmp1.setKind(SyntaxKind.Comment);
        __tmp1.setFirst(SoalLexer.MULTILINE_COMMENT);
        __tmp1.setLast(SoalLexer.MULTILINE_COMMENT);
        annotList.add(__tmp1);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(SoalLexer.DOUBLEQUOTE_VERBATIM_STRING, annotList);
        SyntaxAnnotation __tmp2 = new SyntaxAnnotation();
        __tmp2.setKind(SyntaxKind.String);
        __tmp2.setFirst(SoalLexer.DOUBLEQUOTE_VERBATIM_STRING);
        __tmp2.setLast(SoalLexer.DOUBLEQUOTE_VERBATIM_STRING);
        annotList.add(__tmp2);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(SoalLexer.SINGLEQUOTE_VERBATIM_STRING, annotList);
        SyntaxAnnotation __tmp3 = new SyntaxAnnotation();
        __tmp3.setKind(SyntaxKind.String);
        __tmp3.setFirst(SoalLexer.SINGLEQUOTE_VERBATIM_STRING);
        __tmp3.setLast(SoalLexer.SINGLEQUOTE_VERBATIM_STRING);
        annotList.add(__tmp3);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.KNamespace, annotList);
        SyntaxAnnotation __tmp4 = new SyntaxAnnotation();
        __tmp4.setKind(SyntaxKind.Keyword);
        __tmp4.setFirst(SoalLexer.KNamespace);
        __tmp4.setLast(SoalLexer.KVoid);
        annotList.add(__tmp4);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.IdentifierNormal, annotList);
        SyntaxAnnotation __tmp5 = new SyntaxAnnotation();
        __tmp5.setKind(SyntaxKind.Identifier);
        __tmp5.setFirst(SoalLexer.IdentifierNormal);
        __tmp5.setLast(SoalLexer.IdentifierNormal);
        annotList.add(__tmp5);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.IdentifierVerbatim, annotList);
        SyntaxAnnotation __tmp6 = new SyntaxAnnotation();
        __tmp6.setKind(SyntaxKind.Identifier);
        __tmp6.setFirst(SoalLexer.IdentifierVerbatim);
        __tmp6.setLast(SoalLexer.IdentifierVerbatim);
        annotList.add(__tmp6);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.IntegerLiteral, annotList);
        SyntaxAnnotation __tmp7 = new SyntaxAnnotation();
        __tmp7.setKind(SyntaxKind.Number);
        __tmp7.setFirst(SoalLexer.IntegerLiteral);
        __tmp7.setLast(SoalLexer.IntegerLiteral);
        annotList.add(__tmp7);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.DecimalLiteral, annotList);
        SyntaxAnnotation __tmp8 = new SyntaxAnnotation();
        __tmp8.setKind(SyntaxKind.Number);
        __tmp8.setFirst(SoalLexer.DecimalLiteral);
        __tmp8.setLast(SoalLexer.DecimalLiteral);
        annotList.add(__tmp8);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.ScientificLiteral, annotList);
        SyntaxAnnotation __tmp9 = new SyntaxAnnotation();
        __tmp9.setKind(SyntaxKind.Number);
        __tmp9.setFirst(SoalLexer.ScientificLiteral);
        __tmp9.setLast(SoalLexer.ScientificLiteral);
        annotList.add(__tmp9);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.DateTimeOffsetLiteral, annotList);
        SyntaxAnnotation __tmp10 = new SyntaxAnnotation();
        __tmp10.setKind(SyntaxKind.Number);
        __tmp10.setFirst(SoalLexer.DateTimeOffsetLiteral);
        __tmp10.setLast(SoalLexer.DateTimeOffsetLiteral);
        annotList.add(__tmp10);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.DateTimeLiteral, annotList);
        SyntaxAnnotation __tmp11 = new SyntaxAnnotation();
        __tmp11.setKind(SyntaxKind.Number);
        __tmp11.setFirst(SoalLexer.DateTimeLiteral);
        __tmp11.setLast(SoalLexer.DateTimeLiteral);
        annotList.add(__tmp11);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.DateLiteral, annotList);
        SyntaxAnnotation __tmp12 = new SyntaxAnnotation();
        __tmp12.setKind(SyntaxKind.Number);
        __tmp12.setFirst(SoalLexer.DateLiteral);
        __tmp12.setLast(SoalLexer.DateLiteral);
        annotList.add(__tmp12);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.TimeLiteral, annotList);
        SyntaxAnnotation __tmp13 = new SyntaxAnnotation();
        __tmp13.setKind(SyntaxKind.Number);
        __tmp13.setFirst(SoalLexer.TimeLiteral);
        __tmp13.setLast(SoalLexer.TimeLiteral);
        annotList.add(__tmp13);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.RegularStringLiteral, annotList);
        SyntaxAnnotation __tmp14 = new SyntaxAnnotation();
        __tmp14.setKind(SyntaxKind.String);
        __tmp14.setFirst(SoalLexer.RegularStringLiteral);
        __tmp14.setLast(SoalLexer.RegularStringLiteral);
        annotList.add(__tmp14);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.GuidLiteral, annotList);
        SyntaxAnnotation __tmp15 = new SyntaxAnnotation();
        __tmp15.setKind(SyntaxKind.String);
        __tmp15.setFirst(SoalLexer.GuidLiteral);
        __tmp15.setLast(SoalLexer.GuidLiteral);
        annotList.add(__tmp15);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.LINE_COMMENT, annotList);
        SyntaxAnnotation __tmp16 = new SyntaxAnnotation();
        __tmp16.setKind(SyntaxKind.Comment);
        __tmp16.setFirst(SoalLexer.LINE_COMMENT);
        __tmp16.setLast(SoalLexer.LINE_COMMENT);
        annotList.add(__tmp16);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.COMMENT, annotList);
        SyntaxAnnotation __tmp17 = new SyntaxAnnotation();
        __tmp17.setKind(SyntaxKind.Comment);
        __tmp17.setFirst(SoalLexer.COMMENT);
        __tmp17.setLast(SoalLexer.COMMENT);
        annotList.add(__tmp17);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.DoubleQuoteVerbatimStringLiteral, annotList);
        SyntaxAnnotation __tmp18 = new SyntaxAnnotation();
        __tmp18.setKind(SyntaxKind.String);
        __tmp18.setFirst(SoalLexer.DoubleQuoteVerbatimStringLiteral);
        __tmp18.setLast(SoalLexer.DoubleQuoteVerbatimStringLiteral);
        annotList.add(__tmp18);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(SoalLexer.SingleQuoteVerbatimStringLiteral, annotList);
        SyntaxAnnotation __tmp19 = new SyntaxAnnotation();
        __tmp19.setKind(SyntaxKind.String);
        __tmp19.setFirst(SoalLexer.SingleQuoteVerbatimStringLiteral);
        __tmp19.setLast(SoalLexer.SingleQuoteVerbatimStringLiteral);
        annotList.add(__tmp19);
    }
    
    public Object visitTerminal(TerminalNode node, Map<Object, List<Object>> treeAnnotations)
    {
        Token token = node.getSymbol();
        if (token != null)
        {
            List<Object> annotList = this.tokenAnnotations.get(token.getType());
            if (annotList != null)
            {
                List<Object> treeAnnotList = treeAnnotations.get(node);
                if (treeAnnotList == null)
                {
                    treeAnnotList = new ArrayList<>();
                    treeAnnotations.put(node, treeAnnotList);
                }
                treeAnnotList.addAll(annotList);
            }
        }
        return null;
    }
}

