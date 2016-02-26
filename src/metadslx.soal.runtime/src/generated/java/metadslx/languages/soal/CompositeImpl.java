package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class CompositeImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Composite {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Composite; 
    }

    public CompositeImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Composite.ComponentsProperty, new metadslx.core.ModelList<Component>(this, metadslx.languages.soal.SoalDescriptor.Composite.ComponentsProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Composite.WiresProperty, new metadslx.core.ModelList<Wire>(this, metadslx.languages.soal.SoalDescriptor.Composite.WiresProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.ServicesProperty, new metadslx.core.ModelList<Service>(this, metadslx.languages.soal.SoalDescriptor.Component.ServicesProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.ReferencesProperty, new metadslx.core.ModelList<Reference>(this, metadslx.languages.soal.SoalDescriptor.Component.ReferencesProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.PropertiesProperty, new metadslx.core.ModelList<Property>(this, metadslx.languages.soal.SoalDescriptor.Component.PropertiesProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Composite(this);
        this.mMakeDefault();
    }
    
    public java.util.List<metadslx.languages.soal.Component> getComponents() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Composite.ComponentsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Component>)result;
        else return (java.util.List<metadslx.languages.soal.Component>)null;
    }
    
    public java.util.List<metadslx.languages.soal.Wire> getWires() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Composite.WiresProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Wire>)result;
        else return (java.util.List<metadslx.languages.soal.Wire>)null;
    }
    
    public metadslx.languages.soal.Component getBaseComponent() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.BaseComponentProperty); 
        if (result != null) return (metadslx.languages.soal.Component)result;
        else return (metadslx.languages.soal.Component)null;
    }
    
    public void setBaseComponent(metadslx.languages.soal.Component value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.BaseComponentProperty, value);
    }
    
    public boolean getIsAbstract() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.IsAbstractProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setIsAbstract(boolean value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.IsAbstractProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.Service> getServices() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.ServicesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Service>)result;
        else return (java.util.List<metadslx.languages.soal.Service>)null;
    }
    
    public java.util.List<metadslx.languages.soal.Reference> getReferences() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.ReferencesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Reference>)result;
        else return (java.util.List<metadslx.languages.soal.Reference>)null;
    }
    
    public java.util.List<metadslx.languages.soal.Property> getProperties() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.PropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Property>)result;
        else return (java.util.List<metadslx.languages.soal.Property>)null;
    }
    
    public metadslx.languages.soal.Implementation getImplementation() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.ImplementationProperty); 
        if (result != null) return (metadslx.languages.soal.Implementation)result;
        else return (metadslx.languages.soal.Implementation)null;
    }
    
    public void setImplementation(metadslx.languages.soal.Implementation value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.ImplementationProperty, value);
    }
    
    public metadslx.languages.soal.Language getLanguage() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Component.LanguageProperty); 
        if (result != null) return (metadslx.languages.soal.Language)result;
        else return (metadslx.languages.soal.Language)null;
    }
    
    public void setLanguage(metadslx.languages.soal.Language value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Component.LanguageProperty, value);
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


