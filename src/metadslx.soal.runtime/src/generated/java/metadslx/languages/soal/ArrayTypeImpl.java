package metadslx.languages.soal;

class ArrayTypeImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.ArrayType {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.ArrayType; 
    }

    public ArrayTypeImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().ArrayType(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.SoalType getInnerType() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.ArrayType.InnerTypeProperty); 
        if (result != null) return (metadslx.languages.soal.SoalType)result;
        else return (metadslx.languages.soal.SoalType)null;
    }
    
    public void setInnerType(metadslx.languages.soal.SoalType value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.ArrayType.InnerTypeProperty, value);
    }
}


