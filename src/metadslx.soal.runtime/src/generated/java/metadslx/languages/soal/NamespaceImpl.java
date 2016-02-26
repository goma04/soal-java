package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class NamespaceImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Namespace {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Namespace; 
    }

    public NamespaceImpl() {
        this.mDerivedSet(metadslx.languages.soal.SoalDescriptor.Namespace.FullNameProperty, () -> metadslx.languages.soal.SoalImplementationProvider.implementation().Namespace_FullName(this));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Namespace.DeclarationsProperty, new metadslx.core.ModelList<Declaration>(this, metadslx.languages.soal.SoalDescriptor.Namespace.DeclarationsProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Namespace(this);
        this.mMakeDefault();
    }
    
    public String getUri() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Namespace.UriProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setUri(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Namespace.UriProperty, value);
    }
    
    public String getPrefix() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Namespace.PrefixProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setPrefix(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Namespace.PrefixProperty, value);
    }
    
    public String getFullName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Namespace.FullNameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public java.util.List<metadslx.languages.soal.Declaration> getDeclarations() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Namespace.DeclarationsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Declaration>)result;
        else return (java.util.List<metadslx.languages.soal.Declaration>)null;
    }
    
    public metadslx.languages.soal.Namespace getNamespace() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Declaration.NamespaceProperty); 
        if (result != null) return (metadslx.languages.soal.Namespace)result;
        else return (metadslx.languages.soal.Namespace)null;
    }
    
    public void setNamespace(metadslx.languages.soal.Namespace value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Declaration.NamespaceProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.Annotation> getAnnotations() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Annotation>)result;
        else return (java.util.List<metadslx.languages.soal.Annotation>)null;
    }
    
    public metadslx.languages.soal.Annotation addAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_addAnnotation(this, name);
    }
    
    public boolean hasAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_hasAnnotation(this, name);
    }
    
    public metadslx.languages.soal.Annotation getAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotation(this, name);
    }
    
    public java.util.List<metadslx.languages.soal.Annotation> getAnnotations(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotations(this, name);
    }
    
    public boolean hasAnnotationProperty(String annotationName, String propertyName) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_hasAnnotationProperty(this, annotationName, propertyName);
    }
    
    public Object getAnnotationPropertyValue(String annotationName, String propertyName) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotationPropertyValue(this, annotationName, propertyName);
    }
    
    public metadslx.languages.soal.AnnotationProperty setAnnotationPropertyValue(String annotationName, String propertyName, Object propertyValue) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_setAnnotationPropertyValue(this, annotationName, propertyName, propertyValue);
    }
}


