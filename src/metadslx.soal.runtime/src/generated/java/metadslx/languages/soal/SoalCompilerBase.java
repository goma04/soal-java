package metadslx.languages.soal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import metadslx.compiler.MetaCompiler;
import metadslx.compiler.MetaCompilerDefinitionPhase;
import metadslx.compiler.MetaCompilerMergePhase;
import metadslx.compiler.MetaCompilerReferencePhase;
import metadslx.core.ModelObject;
import metadslx.core.TextSpan;

import metadslx.core.ResolutionLocation;


@SuppressWarnings("unused")
public abstract class SoalCompilerBase extends MetaCompiler
{
    public SoalCompilerBase(String source, String fileName)
    {
        super(source, fileName);
    }
    
    @Override
    protected void doCompile()
    {
        ANTLRInputStream inputStream = new ANTLRInputStream(this.getSource());
        this.lexer = new SoalLexer(inputStream);
        this.lexer.addErrorListener(this);
        this.setCommonTokenStream(new CommonTokenStream(this.lexer));
        this.parser = new SoalParser(this.getCommonTokenStream());
        this.parser.addErrorListener(this);
        this.parseTree = this.parser.main();
        SoalParserAnnotator annotator = new SoalParserAnnotator();
        annotator.visit(this.parseTree);
        this.setLexerAnnotations(annotator.getLexerAnnotations());
        this.setParserAnnotations(annotator.getParserAnnotations());
        this.setModeAnnotations(annotator.getModeAnnotations());
        this.setTokenAnnotations(annotator.getTokenAnnotations());
        this.setRuleAnnotations(annotator.getRuleAnnotations());
        this.setTreeAnnotations(annotator.getTreeAnnotations());
        MetaCompilerDefinitionPhase definitionPhase = new MetaCompilerDefinitionPhase(this);
        definitionPhase.visitNode(this.parseTree);
        MetaCompilerMergePhase mergePhase = new MetaCompilerMergePhase(this);
        mergePhase.visitNode(this.parseTree);
        MetaCompilerReferencePhase referencePhase = new MetaCompilerReferencePhase(this);
        referencePhase.visitNode(this.parseTree);
        SoalParserPropertyEvaluator propertyEvaluator = new SoalParserPropertyEvaluator(this);
        propertyEvaluator.visit(this.parseTree);
        
        this.getModel().evalLazyValues();
        for (ModelObject symbol: this.getData().getSymbols())
        {
            if (symbol.mHasUninitializedValue())
            {
                this.getDiagnostics().addError("The symbol '" + symbol + "' has uninitialized lazy values.", this.getFileName(), this.getNameProvider().getSymbolTextSpans(symbol), true);
            }
        }
    }
    
    private SoalParser.MainContext parseTree;
    private SoalLexer lexer;
    private SoalParser parser;
    public SoalParser.MainContext getParseTree() { return this.parseTree; }
    public SoalLexer getLexer() { return this.lexer; }
    public SoalParser getParser() { return this.parser; }
}

