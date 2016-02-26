package metadslx.languages.soal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;


import metadslx.core.ResolutionLocation;

@SuppressWarnings("unused")
public class SoalParserAnnotator extends SoalParserBaseVisitor<Object>
{
    private SoalLexerAnnotator lexerAnnotator = new SoalLexerAnnotator();
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Class<?>, List<Object>> ruleAnnotations = new HashMap<>();
    private Map<Object, List<Object>> treeAnnotations = new HashMap<>();
    
    public List<Object> getParserAnnotations() { return this.grammarAnnotations; }
    public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }
    public Map<Class<?>, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }
    public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }
    
    
    public SoalParserAnnotator()
    {
        List<Object> annotList = null;
    }
    
    public Object visitTerminal(TerminalNode node)
    {
        this.lexerAnnotator.visitTerminal(node, treeAnnotations);
        this.handleSymbolType(node);
        return null;
    }
    
    private void handleSymbolType(ParseTree node)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(node);
        if (treeAnnotList != null)
        {
            for (Object treeAnnot: treeAnnotList)
            {
                if (treeAnnot instanceof SymbolTypeAnnotation)
                {
                    SymbolTypeAnnotation sta = (SymbolTypeAnnotation)treeAnnot;
                    if (sta.hasName())
                    {
                        ModelCompilerContext.requireContext();
                        IModelCompiler compiler = ModelCompilerContext.current();
                        String name = compiler.getNameProvider().getName(node);
                        if (sta.getName() == name)
                        {
                            this.overrideSymbolType(node, sta.getSymbolType());
                        }
                    }
                    else
                    {
                        this.overrideSymbolType(node, sta.getSymbolType());
                    }
                }
            }
            treeAnnotList.removeIf(a -> a instanceof SymbolTypeAnnotation);
        }
    }
    
    private void overrideSymbolType(ParseTree node, Class<?> symbolType)
    {
        if (node == null) return;
        if (symbolType == null) return;
        boolean set = false;
        while(!set && node != null)
        {
            List<Object> treeAnnotList = this.treeAnnotations.get(node);
            if (treeAnnotList != null)
            {
                for (Object treeAnnot: treeAnnotList)
                {
                    if (treeAnnot instanceof SymbolBasedAnnotation)
                    {
                        SymbolBasedAnnotation sta = (SymbolBasedAnnotation)treeAnnot;
                        set = true;
                        if (sta.getSymbolType() == null)
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else if (sta.overrideSymbolType())
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else
                        {
                            throw new IllegalStateException("Cannot change symbol type from '"+sta.getSymbolType()+"' to '"+symbolType+"'");
                        }
                    }
                }
            }
            node = node.getParent();
        }
    }
    
    @Override
    public Object visitMain(SoalParser.MainContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMain(ctx);
    }
    
    @Override
    public Object visitQualifiedName(SoalParser.QualifiedNameContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        QualifiedNameAnnotation __tmp1 = new QualifiedNameAnnotation();
        treeAnnotList.add(__tmp1);
        this.handleSymbolType(ctx);
        return super.visitQualifiedName(ctx);
    }
    
    @Override
    public Object visitIdentifierList(SoalParser.IdentifierListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifierList(ctx);
    }
    
    @Override
    public Object visitQualifiedNameList(SoalParser.QualifiedNameListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitQualifiedNameList(ctx);
    }
    
    @Override
    public Object visitAnnotationList(SoalParser.AnnotationListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationList(ctx);
    }
    
    @Override
    public Object visitReturnAnnotationList(SoalParser.ReturnAnnotationListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitReturnAnnotationList(ctx);
    }
    
    @Override
    public Object visitAnnotation(SoalParser.AnnotationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp2 = new PropertyAnnotation();
        __tmp2.setName("Annotations");
        treeAnnotList.add(__tmp2);
        SymbolAnnotation __tmp3 = new SymbolAnnotation();
        __tmp3.setSymbolType(Annotation.class);
        treeAnnotList.add(__tmp3);
        this.handleSymbolType(ctx);
        return super.visitAnnotation(ctx);
    }
    
    @Override
    public Object visitReturnAnnotation(SoalParser.ReturnAnnotationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp4 = new PropertyAnnotation();
        __tmp4.setName("Annotations");
        treeAnnotList.add(__tmp4);
        SymbolAnnotation __tmp5 = new SymbolAnnotation();
        __tmp5.setSymbolType(Annotation.class);
        treeAnnotList.add(__tmp5);
        this.handleSymbolType(ctx);
        return super.visitReturnAnnotation(ctx);
    }
    
    @Override
    public Object visitAnnotationBody(SoalParser.AnnotationBodyContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp6 = new PropertyAnnotation();
            __tmp6.setName("Name");
            elemAnnotList.add(__tmp6);
            ValueAnnotation __tmp7 = new ValueAnnotation();
            elemAnnotList.add(__tmp7);
        }
        this.handleSymbolType(ctx);
        return super.visitAnnotationBody(ctx);
    }
    
    @Override
    public Object visitAnnotationProperties(SoalParser.AnnotationPropertiesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationProperties(ctx);
    }
    
    @Override
    public Object visitAnnotationPropertyList(SoalParser.AnnotationPropertyListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationPropertyList(ctx);
    }
    
    @Override
    public Object visitAnnotationProperty(SoalParser.AnnotationPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp8 = new PropertyAnnotation();
        __tmp8.setName("Properties");
        treeAnnotList.add(__tmp8);
        SymbolAnnotation __tmp9 = new SymbolAnnotation();
        __tmp9.setSymbolType(AnnotationProperty.class);
        treeAnnotList.add(__tmp9);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp10 = new PropertyAnnotation();
            __tmp10.setName("Name");
            elemAnnotList.add(__tmp10);
            ValueAnnotation __tmp11 = new ValueAnnotation();
            elemAnnotList.add(__tmp11);
        }
        if (ctx.annotationPropertyValue() != null)
        {
            Object elem = ctx.annotationPropertyValue();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp12 = new PropertyAnnotation();
            __tmp12.setName("Value");
            elemAnnotList.add(__tmp12);
        }
        this.handleSymbolType(ctx);
        return super.visitAnnotationProperty(ctx);
    }
    
    @Override
    public Object visitAnnotationPropertyValue(SoalParser.AnnotationPropertyValueContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationPropertyValue(ctx);
    }
    
    @Override
    public Object visitNamespaceDeclaration(SoalParser.NamespaceDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp13 = new NameDefAnnotation();
        __tmp13.setSymbolType(Namespace.class);
        __tmp13.setNestingProperty("Declarations");
        __tmp13.setMerge(true);
        treeAnnotList.add(__tmp13);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp14 = new PropertyAnnotation();
            __tmp14.setName("Prefix");
            elemAnnotList.add(__tmp14);
            ValueAnnotation __tmp15 = new ValueAnnotation();
            elemAnnotList.add(__tmp15);
        }
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp16 = new PropertyAnnotation();
            __tmp16.setName("Uri");
            elemAnnotList.add(__tmp16);
            ValueAnnotation __tmp17 = new ValueAnnotation();
            elemAnnotList.add(__tmp17);
        }
        this.handleSymbolType(ctx);
        return super.visitNamespaceDeclaration(ctx);
    }
    
    @Override
    public Object visitDeclaration(SoalParser.DeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp18 = new PropertyAnnotation();
        __tmp18.setName("Declarations");
        treeAnnotList.add(__tmp18);
        this.handleSymbolType(ctx);
        return super.visitDeclaration(ctx);
    }
    
    @Override
    public Object visitEnumDeclaration(SoalParser.EnumDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp19 = new TypeDefAnnotation();
        __tmp19.setSymbolType(Enum.class);
        treeAnnotList.add(__tmp19);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp20 = new PropertyAnnotation();
            __tmp20.setName("BaseType");
            elemAnnotList.add(__tmp20);
            TypeUseAnnotation __tmp21 = new TypeUseAnnotation();
            __tmp21.getSymbolTypes().add(Enum.class);
            __tmp21.setLocation(ResolutionLocation.Parent);
            elemAnnotList.add(__tmp21);
        }
        this.handleSymbolType(ctx);
        return super.visitEnumDeclaration(ctx);
    }
    
    @Override
    public Object visitEnumLiterals(SoalParser.EnumLiteralsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEnumLiterals(ctx);
    }
    
    @Override
    public Object visitEnumLiteral(SoalParser.EnumLiteralContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp22 = new PropertyAnnotation();
        __tmp22.setName("EnumLiterals");
        treeAnnotList.add(__tmp22);
        NameDefAnnotation __tmp23 = new NameDefAnnotation();
        __tmp23.setSymbolType(EnumLiteral.class);
        treeAnnotList.add(__tmp23);
        this.handleSymbolType(ctx);
        return super.visitEnumLiteral(ctx);
    }
    
    @Override
    public Object visitStructDeclaration(SoalParser.StructDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp24 = new TypeDefAnnotation();
        __tmp24.setSymbolType(Struct.class);
        treeAnnotList.add(__tmp24);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp25 = new PropertyAnnotation();
            __tmp25.setName("BaseType");
            elemAnnotList.add(__tmp25);
            TypeUseAnnotation __tmp26 = new TypeUseAnnotation();
            __tmp26.getSymbolTypes().add(Struct.class);
            __tmp26.setLocation(ResolutionLocation.Parent);
            elemAnnotList.add(__tmp26);
        }
        this.handleSymbolType(ctx);
        return super.visitStructDeclaration(ctx);
    }
    
    @Override
    public Object visitPropertyDeclaration(SoalParser.PropertyDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp27 = new PropertyAnnotation();
        __tmp27.setName("Properties");
        treeAnnotList.add(__tmp27);
        NameDefAnnotation __tmp28 = new NameDefAnnotation();
        __tmp28.setSymbolType(Property.class);
        treeAnnotList.add(__tmp28);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp29 = new PropertyAnnotation();
            __tmp29.setName("Type");
            elemAnnotList.add(__tmp29);
            TypeUseAnnotation __tmp30 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp30);
        }
        this.handleSymbolType(ctx);
        return super.visitPropertyDeclaration(ctx);
    }
    
    @Override
    public Object visitDatabaseDeclaration(SoalParser.DatabaseDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp31 = new TypeDefAnnotation();
        __tmp31.setSymbolType(Database.class);
        treeAnnotList.add(__tmp31);
        this.handleSymbolType(ctx);
        return super.visitDatabaseDeclaration(ctx);
    }
    
    @Override
    public Object visitEntityReference(SoalParser.EntityReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp32 = new PropertyAnnotation();
        __tmp32.setName("Entities");
        treeAnnotList.add(__tmp32);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp33 = new TypeUseAnnotation();
            __tmp33.getSymbolTypes().add(Struct.class);
            elemAnnotList.add(__tmp33);
        }
        this.handleSymbolType(ctx);
        return super.visitEntityReference(ctx);
    }
    
    @Override
    public Object visitInterfaceDeclaration(SoalParser.InterfaceDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp34 = new TypeDefAnnotation();
        __tmp34.setSymbolType(Interface.class);
        treeAnnotList.add(__tmp34);
        this.handleSymbolType(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }
    
    @Override
    public Object visitOperationDeclaration(SoalParser.OperationDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp35 = new PropertyAnnotation();
        __tmp35.setName("Operations");
        treeAnnotList.add(__tmp35);
        NameDefAnnotation __tmp36 = new NameDefAnnotation();
        __tmp36.setSymbolType(Operation.class);
        treeAnnotList.add(__tmp36);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedNameList() != null)
        {
            Object elem = ctx.qualifiedNameList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp37 = new PropertyAnnotation();
            __tmp37.setName("Exceptions");
            elemAnnotList.add(__tmp37);
            TypeUseAnnotation __tmp38 = new TypeUseAnnotation();
            __tmp38.getSymbolTypes().add(Struct.class);
            elemAnnotList.add(__tmp38);
        }
        this.handleSymbolType(ctx);
        return super.visitOperationDeclaration(ctx);
    }
    
    @Override
    public Object visitParameterList(SoalParser.ParameterListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParameterList(ctx);
    }
    
    @Override
    public Object visitParameter(SoalParser.ParameterContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp39 = new PropertyAnnotation();
        __tmp39.setName("Parameters");
        treeAnnotList.add(__tmp39);
        NameDefAnnotation __tmp40 = new NameDefAnnotation();
        __tmp40.setSymbolType(InputParameter.class);
        treeAnnotList.add(__tmp40);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp41 = new PropertyAnnotation();
            __tmp41.setName("Type");
            elemAnnotList.add(__tmp41);
            TypeUseAnnotation __tmp42 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp42);
        }
        this.handleSymbolType(ctx);
        return super.visitParameter(ctx);
    }
    
    @Override
    public Object visitOperationResult(SoalParser.OperationResultContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp43 = new PropertyAnnotation();
        __tmp43.setName("Result");
        treeAnnotList.add(__tmp43);
        SymbolAnnotation __tmp44 = new SymbolAnnotation();
        __tmp44.setSymbolType(OutputParameter.class);
        treeAnnotList.add(__tmp44);
        List<Object> elemAnnotList = null;
        if (ctx.returnType() != null)
        {
            Object elem = ctx.returnType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp45 = new PropertyAnnotation();
            __tmp45.setName("Type");
            elemAnnotList.add(__tmp45);
            TypeUseAnnotation __tmp46 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp46);
        }
        this.handleSymbolType(ctx);
        return super.visitOperationResult(ctx);
    }
    
    @Override
    public Object visitComponentDeclaration(SoalParser.ComponentDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp47 = new TypeDefAnnotation();
        __tmp47.setSymbolType(Component.class);
        treeAnnotList.add(__tmp47);
        List<Object> elemAnnotList = null;
        if (ctx.KAbstract() != null)
        {
            Object elem = ctx.KAbstract();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp48 = new PropertyAnnotation();
            __tmp48.setName("IsAbstract");
            __tmp48.setValue(true);
            elemAnnotList.add(__tmp48);
        }
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp49 = new PropertyAnnotation();
            __tmp49.setName("BaseComponent");
            elemAnnotList.add(__tmp49);
            TypeUseAnnotation __tmp50 = new TypeUseAnnotation();
            __tmp50.getSymbolTypes().add(Component.class);
            __tmp50.setLocation(ResolutionLocation.Parent);
            elemAnnotList.add(__tmp50);
        }
        this.handleSymbolType(ctx);
        return super.visitComponentDeclaration(ctx);
    }
    
    @Override
    public Object visitComponentElements(SoalParser.ComponentElementsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitComponentElements(ctx);
    }
    
    @Override
    public Object visitComponentElement(SoalParser.ComponentElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitComponentElement(ctx);
    }
    
    @Override
    public Object visitComponentService(SoalParser.ComponentServiceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp51 = new PropertyAnnotation();
        __tmp51.setName("Services");
        treeAnnotList.add(__tmp51);
        SymbolAnnotation __tmp52 = new SymbolAnnotation();
        __tmp52.setSymbolType(Service.class);
        treeAnnotList.add(__tmp52);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp53 = new PropertyAnnotation();
            __tmp53.setName("Interface");
            elemAnnotList.add(__tmp53);
            TypeUseAnnotation __tmp54 = new TypeUseAnnotation();
            __tmp54.getSymbolTypes().add(Interface.class);
            elemAnnotList.add(__tmp54);
        }
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp55 = new PropertyAnnotation();
            __tmp55.setName("OptionalName");
            elemAnnotList.add(__tmp55);
            ValueAnnotation __tmp56 = new ValueAnnotation();
            elemAnnotList.add(__tmp56);
        }
        this.handleSymbolType(ctx);
        return super.visitComponentService(ctx);
    }
    
    @Override
    public Object visitComponentReference(SoalParser.ComponentReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp57 = new PropertyAnnotation();
        __tmp57.setName("References");
        treeAnnotList.add(__tmp57);
        SymbolAnnotation __tmp58 = new SymbolAnnotation();
        __tmp58.setSymbolType(Reference.class);
        treeAnnotList.add(__tmp58);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp59 = new PropertyAnnotation();
            __tmp59.setName("Interface");
            elemAnnotList.add(__tmp59);
            TypeUseAnnotation __tmp60 = new TypeUseAnnotation();
            __tmp60.getSymbolTypes().add(Interface.class);
            elemAnnotList.add(__tmp60);
        }
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp61 = new PropertyAnnotation();
            __tmp61.setName("OptionalName");
            elemAnnotList.add(__tmp61);
            ValueAnnotation __tmp62 = new ValueAnnotation();
            elemAnnotList.add(__tmp62);
        }
        this.handleSymbolType(ctx);
        return super.visitComponentReference(ctx);
    }
    
    @Override
    public Object visitComponentServiceOrReferenceBody(SoalParser.ComponentServiceOrReferenceBodyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitComponentServiceOrReferenceBody(ctx);
    }
    
    @Override
    public Object visitComponentServiceOrReferenceElement(SoalParser.ComponentServiceOrReferenceElementContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp63 = new PropertyAnnotation();
            __tmp63.setName("Binding");
            elemAnnotList.add(__tmp63);
            NameUseAnnotation __tmp64 = new NameUseAnnotation();
            __tmp64.getSymbolTypes().add(Binding.class);
            elemAnnotList.add(__tmp64);
        }
        this.handleSymbolType(ctx);
        return super.visitComponentServiceOrReferenceElement(ctx);
    }
    
    @Override
    public Object visitComponentProperty(SoalParser.ComponentPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp65 = new PropertyAnnotation();
        __tmp65.setName("Properties");
        treeAnnotList.add(__tmp65);
        NameDefAnnotation __tmp66 = new NameDefAnnotation();
        __tmp66.setSymbolType(Property.class);
        treeAnnotList.add(__tmp66);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp67 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp67);
        }
        this.handleSymbolType(ctx);
        return super.visitComponentProperty(ctx);
    }
    
    @Override
    public Object visitComponentImplementation(SoalParser.ComponentImplementationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp68 = new PropertyAnnotation();
        __tmp68.setName("Implementation");
        treeAnnotList.add(__tmp68);
        NameDefAnnotation __tmp69 = new NameDefAnnotation();
        __tmp69.setSymbolType(Implementation.class);
        treeAnnotList.add(__tmp69);
        this.handleSymbolType(ctx);
        return super.visitComponentImplementation(ctx);
    }
    
    @Override
    public Object visitComponentLanguage(SoalParser.ComponentLanguageContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp70 = new PropertyAnnotation();
        __tmp70.setName("Language");
        treeAnnotList.add(__tmp70);
        NameDefAnnotation __tmp71 = new NameDefAnnotation();
        __tmp71.setSymbolType(Language.class);
        treeAnnotList.add(__tmp71);
        this.handleSymbolType(ctx);
        return super.visitComponentLanguage(ctx);
    }
    
    @Override
    public Object visitCompositeDeclaration(SoalParser.CompositeDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp72 = new TypeDefAnnotation();
        __tmp72.setSymbolType(Composite.class);
        treeAnnotList.add(__tmp72);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp73 = new PropertyAnnotation();
            __tmp73.setName("BaseComponent");
            elemAnnotList.add(__tmp73);
            TypeUseAnnotation __tmp74 = new TypeUseAnnotation();
            __tmp74.getSymbolTypes().add(Component.class);
            __tmp74.getSymbolTypes().add(Composite.class);
            __tmp74.setLocation(ResolutionLocation.Parent);
            elemAnnotList.add(__tmp74);
        }
        this.handleSymbolType(ctx);
        return super.visitCompositeDeclaration(ctx);
    }
    
    @Override
    public Object visitAssemblyDeclaration(SoalParser.AssemblyDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeDefAnnotation __tmp75 = new TypeDefAnnotation();
        __tmp75.setSymbolType(Assembly.class);
        treeAnnotList.add(__tmp75);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp76 = new PropertyAnnotation();
            __tmp76.setName("BaseComponent");
            elemAnnotList.add(__tmp76);
            TypeUseAnnotation __tmp77 = new TypeUseAnnotation();
            __tmp77.getSymbolTypes().add(Component.class);
            __tmp77.getSymbolTypes().add(Composite.class);
            __tmp77.setLocation(ResolutionLocation.Parent);
            elemAnnotList.add(__tmp77);
        }
        this.handleSymbolType(ctx);
        return super.visitAssemblyDeclaration(ctx);
    }
    
    @Override
    public Object visitCompositeElements(SoalParser.CompositeElementsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitCompositeElements(ctx);
    }
    
    @Override
    public Object visitCompositeElement(SoalParser.CompositeElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitCompositeElement(ctx);
    }
    
    @Override
    public Object visitCompositeComponent(SoalParser.CompositeComponentContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp78 = new PropertyAnnotation();
        __tmp78.setName("Components");
        treeAnnotList.add(__tmp78);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            NameUseAnnotation __tmp79 = new NameUseAnnotation();
            __tmp79.getSymbolTypes().add(Component.class);
            elemAnnotList.add(__tmp79);
        }
        this.handleSymbolType(ctx);
        return super.visitCompositeComponent(ctx);
    }
    
    @Override
    public Object visitCompositeWire(SoalParser.CompositeWireContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp80 = new PropertyAnnotation();
        __tmp80.setName("Wires");
        treeAnnotList.add(__tmp80);
        SymbolAnnotation __tmp81 = new SymbolAnnotation();
        __tmp81.setSymbolType(Wire.class);
        treeAnnotList.add(__tmp81);
        this.handleSymbolType(ctx);
        return super.visitCompositeWire(ctx);
    }
    
    @Override
    public Object visitWireSource(SoalParser.WireSourceContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp82 = new PropertyAnnotation();
            __tmp82.setName("Source");
            elemAnnotList.add(__tmp82);
            NameUseAnnotation __tmp83 = new NameUseAnnotation();
            __tmp83.getSymbolTypes().add(Port.class);
            elemAnnotList.add(__tmp83);
        }
        this.handleSymbolType(ctx);
        return super.visitWireSource(ctx);
    }
    
    @Override
    public Object visitWireTarget(SoalParser.WireTargetContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp84 = new PropertyAnnotation();
            __tmp84.setName("Target");
            elemAnnotList.add(__tmp84);
            NameUseAnnotation __tmp85 = new NameUseAnnotation();
            __tmp85.getSymbolTypes().add(Port.class);
            elemAnnotList.add(__tmp85);
        }
        this.handleSymbolType(ctx);
        return super.visitWireTarget(ctx);
    }
    
    @Override
    public Object visitDeploymentDeclaration(SoalParser.DeploymentDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp86 = new NameDefAnnotation();
        __tmp86.setSymbolType(Deployment.class);
        treeAnnotList.add(__tmp86);
        this.handleSymbolType(ctx);
        return super.visitDeploymentDeclaration(ctx);
    }
    
    @Override
    public Object visitDeploymentElements(SoalParser.DeploymentElementsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDeploymentElements(ctx);
    }
    
    @Override
    public Object visitDeploymentElement(SoalParser.DeploymentElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDeploymentElement(ctx);
    }
    
    @Override
    public Object visitEnvironmentDeclaration(SoalParser.EnvironmentDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp87 = new PropertyAnnotation();
        __tmp87.setName("Environments");
        treeAnnotList.add(__tmp87);
        NameDefAnnotation __tmp88 = new NameDefAnnotation();
        __tmp88.setSymbolType(Environment.class);
        treeAnnotList.add(__tmp88);
        this.handleSymbolType(ctx);
        return super.visitEnvironmentDeclaration(ctx);
    }
    
    @Override
    public Object visitRuntimeDeclaration(SoalParser.RuntimeDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp89 = new PropertyAnnotation();
        __tmp89.setName("Runtime");
        treeAnnotList.add(__tmp89);
        NameDefAnnotation __tmp90 = new NameDefAnnotation();
        __tmp90.setSymbolType(Runtime.class);
        treeAnnotList.add(__tmp90);
        this.handleSymbolType(ctx);
        return super.visitRuntimeDeclaration(ctx);
    }
    
    @Override
    public Object visitRuntimeReference(SoalParser.RuntimeReferenceContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuntimeReference(ctx);
    }
    
    @Override
    public Object visitAssemblyReference(SoalParser.AssemblyReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp91 = new PropertyAnnotation();
        __tmp91.setName("Assemblies");
        treeAnnotList.add(__tmp91);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp92 = new TypeUseAnnotation();
            __tmp92.getSymbolTypes().add(Assembly.class);
            elemAnnotList.add(__tmp92);
        }
        this.handleSymbolType(ctx);
        return super.visitAssemblyReference(ctx);
    }
    
    @Override
    public Object visitDatabaseReference(SoalParser.DatabaseReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp93 = new PropertyAnnotation();
        __tmp93.setName("Databases");
        treeAnnotList.add(__tmp93);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp94 = new TypeUseAnnotation();
            __tmp94.getSymbolTypes().add(Database.class);
            elemAnnotList.add(__tmp94);
        }
        this.handleSymbolType(ctx);
        return super.visitDatabaseReference(ctx);
    }
    
    @Override
    public Object visitBindingDeclaration(SoalParser.BindingDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp95 = new NameDefAnnotation();
        __tmp95.setSymbolType(Binding.class);
        treeAnnotList.add(__tmp95);
        this.handleSymbolType(ctx);
        return super.visitBindingDeclaration(ctx);
    }
    
    @Override
    public Object visitBindingLayers(SoalParser.BindingLayersContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBindingLayers(ctx);
    }
    
    @Override
    public Object visitTransportLayer(SoalParser.TransportLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp96 = new PropertyAnnotation();
        __tmp96.setName("Transport");
        treeAnnotList.add(__tmp96);
        this.handleSymbolType(ctx);
        return super.visitTransportLayer(ctx);
    }
    
    @Override
    public Object visitHttpTransportLayer(SoalParser.HttpTransportLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp97 = new SymbolAnnotation();
        __tmp97.setSymbolType(HttpTransportBindingElement.class);
        treeAnnotList.add(__tmp97);
        this.handleSymbolType(ctx);
        return super.visitHttpTransportLayer(ctx);
    }
    
    @Override
    public Object visitRestTransportLayer(SoalParser.RestTransportLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp98 = new SymbolAnnotation();
        __tmp98.setSymbolType(RestTransportBindingElement.class);
        treeAnnotList.add(__tmp98);
        this.handleSymbolType(ctx);
        return super.visitRestTransportLayer(ctx);
    }
    
    @Override
    public Object visitWebSocketTransportLayer(SoalParser.WebSocketTransportLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp99 = new SymbolAnnotation();
        __tmp99.setSymbolType(WebSocketTransportBindingElement.class);
        treeAnnotList.add(__tmp99);
        this.handleSymbolType(ctx);
        return super.visitWebSocketTransportLayer(ctx);
    }
    
    @Override
    public Object visitHttpTransportLayerProperties(SoalParser.HttpTransportLayerPropertiesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitHttpTransportLayerProperties(ctx);
    }
    
    @Override
    public Object visitHttpSslProperty(SoalParser.HttpSslPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp100 = new PropertyAnnotation();
        __tmp100.setName("Ssl");
        treeAnnotList.add(__tmp100);
        List<Object> elemAnnotList = null;
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp101 = new ValueAnnotation();
            elemAnnotList.add(__tmp101);
        }
        this.handleSymbolType(ctx);
        return super.visitHttpSslProperty(ctx);
    }
    
    @Override
    public Object visitHttpClientAuthenticationProperty(SoalParser.HttpClientAuthenticationPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp102 = new PropertyAnnotation();
        __tmp102.setName("ClientAuthentication");
        treeAnnotList.add(__tmp102);
        List<Object> elemAnnotList = null;
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp103 = new ValueAnnotation();
            elemAnnotList.add(__tmp103);
        }
        this.handleSymbolType(ctx);
        return super.visitHttpClientAuthenticationProperty(ctx);
    }
    
    @Override
    public Object visitEncodingLayer(SoalParser.EncodingLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp104 = new PropertyAnnotation();
        __tmp104.setName("Encodings");
        treeAnnotList.add(__tmp104);
        this.handleSymbolType(ctx);
        return super.visitEncodingLayer(ctx);
    }
    
    @Override
    public Object visitSoapEncodingLayer(SoalParser.SoapEncodingLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp105 = new SymbolAnnotation();
        __tmp105.setSymbolType(SoapEncodingBindingElement.class);
        treeAnnotList.add(__tmp105);
        this.handleSymbolType(ctx);
        return super.visitSoapEncodingLayer(ctx);
    }
    
    @Override
    public Object visitXmlEncodingLayer(SoalParser.XmlEncodingLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp106 = new SymbolAnnotation();
        __tmp106.setSymbolType(XmlEncodingBindingElement.class);
        treeAnnotList.add(__tmp106);
        this.handleSymbolType(ctx);
        return super.visitXmlEncodingLayer(ctx);
    }
    
    @Override
    public Object visitJsonEncodingLayer(SoalParser.JsonEncodingLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp107 = new SymbolAnnotation();
        __tmp107.setSymbolType(JsonEncodingBindingElement.class);
        treeAnnotList.add(__tmp107);
        this.handleSymbolType(ctx);
        return super.visitJsonEncodingLayer(ctx);
    }
    
    @Override
    public Object visitSoapEncodingProperties(SoalParser.SoapEncodingPropertiesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSoapEncodingProperties(ctx);
    }
    
    @Override
    public Object visitSoapVersionProperty(SoalParser.SoapVersionPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp108 = new PropertyAnnotation();
        __tmp108.setName("Version");
        treeAnnotList.add(__tmp108);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            EnumValueAnnotation __tmp109 = new EnumValueAnnotation();
            __tmp109.setEnumType(SoapVersion.class);
            elemAnnotList.add(__tmp109);
        }
        this.handleSymbolType(ctx);
        return super.visitSoapVersionProperty(ctx);
    }
    
    @Override
    public Object visitSoapMtomProperty(SoalParser.SoapMtomPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp110 = new PropertyAnnotation();
        __tmp110.setName("Mtom");
        treeAnnotList.add(__tmp110);
        List<Object> elemAnnotList = null;
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp111 = new ValueAnnotation();
            elemAnnotList.add(__tmp111);
        }
        this.handleSymbolType(ctx);
        return super.visitSoapMtomProperty(ctx);
    }
    
    @Override
    public Object visitSoapStyleProperty(SoalParser.SoapStylePropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp112 = new PropertyAnnotation();
        __tmp112.setName("Style");
        treeAnnotList.add(__tmp112);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            EnumValueAnnotation __tmp113 = new EnumValueAnnotation();
            __tmp113.setEnumType(SoapEncodingStyle.class);
            elemAnnotList.add(__tmp113);
        }
        this.handleSymbolType(ctx);
        return super.visitSoapStyleProperty(ctx);
    }
    
    @Override
    public Object visitProtocolLayer(SoalParser.ProtocolLayerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp114 = new PropertyAnnotation();
        __tmp114.setName("Protocols");
        treeAnnotList.add(__tmp114);
        SymbolAnnotation __tmp115 = new SymbolAnnotation();
        treeAnnotList.add(__tmp115);
        this.handleSymbolType(ctx);
        return super.visitProtocolLayer(ctx);
    }
    
    @Override
    public Object visitProtocolLayerKind(SoalParser.ProtocolLayerKindContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp116 = new SymbolTypeAnnotation();
            __tmp116.setName("WsAddressing");
            __tmp116.setSymbolType(WsAddressingBindingElement.class);
            elemAnnotList.add(__tmp116);
        }
        this.handleSymbolType(ctx);
        return super.visitProtocolLayerKind(ctx);
    }
    
    @Override
    public Object visitEndpointDeclaration(SoalParser.EndpointDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp117 = new NameDefAnnotation();
        __tmp117.setSymbolType(Endpoint.class);
        treeAnnotList.add(__tmp117);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp118 = new PropertyAnnotation();
            __tmp118.setName("Interface");
            elemAnnotList.add(__tmp118);
            TypeUseAnnotation __tmp119 = new TypeUseAnnotation();
            __tmp119.getSymbolTypes().add(Interface.class);
            elemAnnotList.add(__tmp119);
        }
        this.handleSymbolType(ctx);
        return super.visitEndpointDeclaration(ctx);
    }
    
    @Override
    public Object visitEndpointProperties(SoalParser.EndpointPropertiesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEndpointProperties(ctx);
    }
    
    @Override
    public Object visitEndpointProperty(SoalParser.EndpointPropertyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEndpointProperty(ctx);
    }
    
    @Override
    public Object visitEndpointBindingProperty(SoalParser.EndpointBindingPropertyContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp120 = new PropertyAnnotation();
            __tmp120.setName("Binding");
            elemAnnotList.add(__tmp120);
            NameUseAnnotation __tmp121 = new NameUseAnnotation();
            __tmp121.getSymbolTypes().add(Binding.class);
            elemAnnotList.add(__tmp121);
        }
        this.handleSymbolType(ctx);
        return super.visitEndpointBindingProperty(ctx);
    }
    
    @Override
    public Object visitEndpointAddressProperty(SoalParser.EndpointAddressPropertyContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp122 = new PropertyAnnotation();
            __tmp122.setName("Address");
            elemAnnotList.add(__tmp122);
            ValueAnnotation __tmp123 = new ValueAnnotation();
            elemAnnotList.add(__tmp123);
        }
        this.handleSymbolType(ctx);
        return super.visitEndpointAddressProperty(ctx);
    }
    
    @Override
    public Object visitReturnType(SoalParser.ReturnTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitReturnType(ctx);
    }
    
    @Override
    public Object visitTypeReference(SoalParser.TypeReferenceContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeReference(ctx);
    }
    
    @Override
    public Object visitSimpleType(SoalParser.SimpleTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSimpleType(ctx);
    }
    
    @Override
    public Object visitNulledType(SoalParser.NulledTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNulledType(ctx);
    }
    
    @Override
    public Object visitReferenceType(SoalParser.ReferenceTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitReferenceType(ctx);
    }
    
    @Override
    public Object visitObjectType(SoalParser.ObjectTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp124 = new NameAnnotation();
        treeAnnotList.add(__tmp124);
        this.handleSymbolType(ctx);
        return super.visitObjectType(ctx);
    }
    
    @Override
    public Object visitValueType(SoalParser.ValueTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp125 = new NameAnnotation();
        treeAnnotList.add(__tmp125);
        this.handleSymbolType(ctx);
        return super.visitValueType(ctx);
    }
    
    @Override
    public Object visitVoidType(SoalParser.VoidTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp126 = new NameAnnotation();
        treeAnnotList.add(__tmp126);
        this.handleSymbolType(ctx);
        return super.visitVoidType(ctx);
    }
    
    @Override
    public Object visitOnewayType(SoalParser.OnewayTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp127 = new PropertyAnnotation();
        __tmp127.setName("IsOneway");
        __tmp127.setValue(true);
        treeAnnotList.add(__tmp127);
        PropertyAnnotation __tmp128 = new PropertyAnnotation();
        __tmp128.setName("Type");
        __tmp128.setValue(SoalInstance.Void);
        treeAnnotList.add(__tmp128);
        this.handleSymbolType(ctx);
        return super.visitOnewayType(ctx);
    }
    
    @Override
    public Object visitNullableType(SoalParser.NullableTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp129 = new TypeCtrAnnotation();
        __tmp129.setSymbolType(NullableType.class);
        treeAnnotList.add(__tmp129);
        List<Object> elemAnnotList = null;
        if (ctx.valueType() != null)
        {
            Object elem = ctx.valueType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp130 = new PropertyAnnotation();
            __tmp130.setName("InnerType");
            elemAnnotList.add(__tmp130);
            TypeUseAnnotation __tmp131 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp131);
        }
        this.handleSymbolType(ctx);
        return super.visitNullableType(ctx);
    }
    
    @Override
    public Object visitNonNullableType(SoalParser.NonNullableTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp132 = new TypeCtrAnnotation();
        __tmp132.setSymbolType(NonNullableType.class);
        treeAnnotList.add(__tmp132);
        List<Object> elemAnnotList = null;
        if (ctx.referenceType() != null)
        {
            Object elem = ctx.referenceType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp133 = new PropertyAnnotation();
            __tmp133.setName("InnerType");
            elemAnnotList.add(__tmp133);
            TypeUseAnnotation __tmp134 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp134);
        }
        this.handleSymbolType(ctx);
        return super.visitNonNullableType(ctx);
    }
    
    @Override
    public Object visitNonNullableArrayType(SoalParser.NonNullableArrayTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp135 = new TypeCtrAnnotation();
        __tmp135.setSymbolType(NonNullableType.class);
        treeAnnotList.add(__tmp135);
        List<Object> elemAnnotList = null;
        if (ctx.arrayType() != null)
        {
            Object elem = ctx.arrayType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp136 = new PropertyAnnotation();
            __tmp136.setName("InnerType");
            elemAnnotList.add(__tmp136);
            TypeUseAnnotation __tmp137 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp137);
        }
        this.handleSymbolType(ctx);
        return super.visitNonNullableArrayType(ctx);
    }
    
    @Override
    public Object visitArrayType(SoalParser.ArrayTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitArrayType(ctx);
    }
    
    @Override
    public Object visitSimpleArrayType(SoalParser.SimpleArrayTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp138 = new TypeCtrAnnotation();
        __tmp138.setSymbolType(ArrayType.class);
        treeAnnotList.add(__tmp138);
        List<Object> elemAnnotList = null;
        if (ctx.simpleType() != null)
        {
            Object elem = ctx.simpleType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp139 = new PropertyAnnotation();
            __tmp139.setName("InnerType");
            elemAnnotList.add(__tmp139);
            TypeUseAnnotation __tmp140 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp140);
        }
        this.handleSymbolType(ctx);
        return super.visitSimpleArrayType(ctx);
    }
    
    @Override
    public Object visitNulledArrayType(SoalParser.NulledArrayTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp141 = new TypeCtrAnnotation();
        __tmp141.setSymbolType(ArrayType.class);
        treeAnnotList.add(__tmp141);
        List<Object> elemAnnotList = null;
        if (ctx.nulledType() != null)
        {
            Object elem = ctx.nulledType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp142 = new PropertyAnnotation();
            __tmp142.setName("InnerType");
            elemAnnotList.add(__tmp142);
            TypeUseAnnotation __tmp143 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp143);
        }
        this.handleSymbolType(ctx);
        return super.visitNulledArrayType(ctx);
    }
    
    @Override
    public Object visitConstantValue(SoalParser.ConstantValueContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitConstantValue(ctx);
    }
    
    @Override
    public Object visitTypeofValue(SoalParser.TypeofValueContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.returnType() != null)
        {
            Object elem = ctx.returnType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp144 = new TypeUseAnnotation();
            elemAnnotList.add(__tmp144);
        }
        this.handleSymbolType(ctx);
        return super.visitTypeofValue(ctx);
    }
    
    @Override
    public Object visitIdentifier(SoalParser.IdentifierContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp145 = new NameAnnotation();
        treeAnnotList.add(__tmp145);
        IdentifierAnnotation __tmp146 = new IdentifierAnnotation();
        treeAnnotList.add(__tmp146);
        this.handleSymbolType(ctx);
        return super.visitIdentifier(ctx);
    }
    
    @Override
    public Object visitLiteral(SoalParser.LiteralContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.nullLiteral() != null)
        {
            Object elem = ctx.nullLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp147 = new ValueAnnotation();
            elemAnnotList.add(__tmp147);
        }
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp148 = new ValueAnnotation();
            elemAnnotList.add(__tmp148);
        }
        if (ctx.integerLiteral() != null)
        {
            Object elem = ctx.integerLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp149 = new ValueAnnotation();
            elemAnnotList.add(__tmp149);
        }
        if (ctx.decimalLiteral() != null)
        {
            Object elem = ctx.decimalLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp150 = new ValueAnnotation();
            elemAnnotList.add(__tmp150);
        }
        if (ctx.scientificLiteral() != null)
        {
            Object elem = ctx.scientificLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp151 = new ValueAnnotation();
            elemAnnotList.add(__tmp151);
        }
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp152 = new ValueAnnotation();
            elemAnnotList.add(__tmp152);
        }
        this.handleSymbolType(ctx);
        return super.visitLiteral(ctx);
    }
    
    @Override
    public Object visitNullLiteral(SoalParser.NullLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullLiteral(ctx);
    }
    
    @Override
    public Object visitBooleanLiteral(SoalParser.BooleanLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBooleanLiteral(ctx);
    }
    
    @Override
    public Object visitIntegerLiteral(SoalParser.IntegerLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIntegerLiteral(ctx);
    }
    
    @Override
    public Object visitDecimalLiteral(SoalParser.DecimalLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDecimalLiteral(ctx);
    }
    
    @Override
    public Object visitScientificLiteral(SoalParser.ScientificLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitScientificLiteral(ctx);
    }
    
    @Override
    public Object visitStringLiteral(SoalParser.StringLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitStringLiteral(ctx);
    }
    
    @Override
    public Object visitContextualKeywords(SoalParser.ContextualKeywordsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitContextualKeywords(ctx);
    }
}

