package metadslx.languages.soal;

class SoalTypeImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.SoalType {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.SoalType; 
    }

    public SoalTypeImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().SoalType(this);
        this.mMakeDefault();
    }
}


