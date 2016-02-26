package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class AnnotationImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Annotation {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Annotation; 
    }

    public AnnotationImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Annotation.PropertiesProperty, new metadslx.core.ModelList<AnnotationProperty>(this, metadslx.languages.soal.SoalDescriptor.Annotation.PropertiesProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Annotation(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.AnnotatedElement getAnnotatedElement() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Annotation.AnnotatedElementProperty); 
        if (result != null) return (metadslx.languages.soal.AnnotatedElement)result;
        else return (metadslx.languages.soal.AnnotatedElement)null;
    }
    
    public void setAnnotatedElement(metadslx.languages.soal.AnnotatedElement value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Annotation.AnnotatedElementProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.AnnotationProperty> getProperties() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Annotation.PropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.AnnotationProperty>)result;
        else return (java.util.List<metadslx.languages.soal.AnnotationProperty>)null;
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty, value);
    }
    
    public boolean hasProperty(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().Annotation_hasProperty(this, name);
    }
    
    public metadslx.languages.soal.AnnotationProperty getProperty(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().Annotation_getProperty(this, name);
    }
    
    public Object getPropertyValue(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().Annotation_getPropertyValue(this, name);
    }
    
    public metadslx.languages.soal.AnnotationProperty setPropertyValue(String name, Object value) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().Annotation_setPropertyValue(this, name, value);
    }
}


