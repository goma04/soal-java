package metadslx.languages.soal;

class WireImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Wire {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Wire; 
    }

    public WireImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().Wire(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.Port getSource() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Wire.SourceProperty); 
        if (result != null) return (metadslx.languages.soal.Port)result;
        else return (metadslx.languages.soal.Port)null;
    }
    
    public void setSource(metadslx.languages.soal.Port value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Wire.SourceProperty, value);
    }
    
    public metadslx.languages.soal.Port getTarget() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Wire.TargetProperty); 
        if (result != null) return (metadslx.languages.soal.Port)result;
        else return (metadslx.languages.soal.Port)null;
    }
    
    public void setTarget(metadslx.languages.soal.Port value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Wire.TargetProperty, value);
    }
}


