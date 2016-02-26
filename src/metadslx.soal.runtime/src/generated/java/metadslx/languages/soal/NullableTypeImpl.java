package metadslx.languages.soal;

class NullableTypeImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.NullableType {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.NullableType; 
    }

    public NullableTypeImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().NullableType(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.SoalType getInnerType() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.NullableType.InnerTypeProperty); 
        if (result != null) return (metadslx.languages.soal.SoalType)result;
        else return (metadslx.languages.soal.SoalType)null;
    }
    
    public void setInnerType(metadslx.languages.soal.SoalType value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.NullableType.InnerTypeProperty, value);
    }
}


