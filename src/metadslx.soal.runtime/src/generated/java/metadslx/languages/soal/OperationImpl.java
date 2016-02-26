package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class OperationImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Operation {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Operation; 
    }

    public OperationImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Operation.ParametersProperty, new metadslx.core.ModelList<InputParameter>(this, metadslx.languages.soal.SoalDescriptor.Operation.ParametersProperty));
        // Init metadslx.languages.soal.SoalDescriptor.Operation.ResultProperty in metadslx.languages.soal.SoalImplementationProvider.implementation().Operation_Operation
        this.mSet(metadslx.languages.soal.SoalDescriptor.Operation.ExceptionsProperty, new metadslx.core.ModelList<Struct>(this, metadslx.languages.soal.SoalDescriptor.Operation.ExceptionsProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Operation(this);
        if (!this.mIsSet(metadslx.languages.soal.SoalDescriptor.Operation.ResultProperty)) throw new metadslx.core.ModelException("Readonly property Soal.Operation.ResultProperty was not set in Operation_Operation().");
        this.mMakeDefault();
    }
    
    public String getAction() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Operation.ActionProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setAction(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Operation.ActionProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.InputParameter> getParameters() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Operation.ParametersProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.InputParameter>)result;
        else return (java.util.List<metadslx.languages.soal.InputParameter>)null;
    }
    
    public metadslx.languages.soal.OutputParameter getResult() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Operation.ResultProperty); 
        if (result != null) return (metadslx.languages.soal.OutputParameter)result;
        else return (metadslx.languages.soal.OutputParameter)null;
    }
    
    public java.util.List<metadslx.languages.soal.Struct> getExceptions() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Operation.ExceptionsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Struct>)result;
        else return (java.util.List<metadslx.languages.soal.Struct>)null;
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


