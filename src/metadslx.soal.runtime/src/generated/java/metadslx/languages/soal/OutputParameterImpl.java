package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class OutputParameterImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.OutputParameter {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.OutputParameter; 
    }

    public OutputParameterImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().OutputParameter(this);
        this.mMakeDefault();
    }
    
    public boolean getIsOneway() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.OutputParameter.IsOnewayProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setIsOneway(boolean value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.OutputParameter.IsOnewayProperty, value);
    }
    
    public metadslx.languages.soal.SoalType getType() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.TypedElement.TypeProperty); 
        if (result != null) return (metadslx.languages.soal.SoalType)result;
        else return (metadslx.languages.soal.SoalType)null;
    }
    
    public void setType(metadslx.languages.soal.SoalType value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.TypedElement.TypeProperty, value);
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


