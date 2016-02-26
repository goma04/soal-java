package metadslx.languages.soal;

class TypedElementImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.TypedElement {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.TypedElement; 
    }

    public TypedElementImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().TypedElement(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.SoalType getType() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.TypedElement.TypeProperty); 
        if (result != null) return (metadslx.languages.soal.SoalType)result;
        else return (metadslx.languages.soal.SoalType)null;
    }
    
    public void setType(metadslx.languages.soal.SoalType value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.TypedElement.TypeProperty, value);
    }
}


