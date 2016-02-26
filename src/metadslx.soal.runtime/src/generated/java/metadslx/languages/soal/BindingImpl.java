package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class BindingImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Binding {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Binding; 
    }

    public BindingImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Binding.EncodingsProperty, new metadslx.core.ModelList<EncodingBindingElement>(this, metadslx.languages.soal.SoalDescriptor.Binding.EncodingsProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Binding.ProtocolsProperty, new metadslx.core.ModelList<ProtocolBindingElement>(this, metadslx.languages.soal.SoalDescriptor.Binding.ProtocolsProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Binding(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.TransportBindingElement getTransport() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Binding.TransportProperty); 
        if (result != null) return (metadslx.languages.soal.TransportBindingElement)result;
        else return (metadslx.languages.soal.TransportBindingElement)null;
    }
    
    public void setTransport(metadslx.languages.soal.TransportBindingElement value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Binding.TransportProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.EncodingBindingElement> getEncodings() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Binding.EncodingsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.EncodingBindingElement>)result;
        else return (java.util.List<metadslx.languages.soal.EncodingBindingElement>)null;
    }
    
    public java.util.List<metadslx.languages.soal.ProtocolBindingElement> getProtocols() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Binding.ProtocolsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.ProtocolBindingElement>)result;
        else return (java.util.List<metadslx.languages.soal.ProtocolBindingElement>)null;
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


