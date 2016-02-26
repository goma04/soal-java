package metadslx.languages.soal;

class AnnotationPropertyImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.AnnotationProperty {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.AnnotationProperty; 
    }

    public AnnotationPropertyImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotationProperty(this);
        this.mMakeDefault();
    }
    
    public Object getValue() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.AnnotationProperty.ValueProperty); 
        if (result != null) return (Object)result;
        else return (Object)null;
    }
    
    public void setValue(Object value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotationProperty.ValueProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty, value);
    }
}


