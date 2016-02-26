package metadslx.languages.soal;

class ReferenceImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Reference {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Reference; 
    }

    public ReferenceImpl() {
        this.mDerivedSet(metadslx.languages.soal.SoalDescriptor.Port.NameProperty, () -> metadslx.languages.soal.SoalImplementationProvider.implementation().Port_Name(this));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Reference(this);
        this.mMakeDefault();
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Port.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public String getOptionalName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Port.OptionalNameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setOptionalName(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Port.OptionalNameProperty, value);
    }
    
    public metadslx.languages.soal.Interface getInterface() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Port.InterfaceProperty); 
        if (result != null) return (metadslx.languages.soal.Interface)result;
        else return (metadslx.languages.soal.Interface)null;
    }
    
    public void setInterface(metadslx.languages.soal.Interface value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Port.InterfaceProperty, value);
    }
    
    public metadslx.languages.soal.Binding getBinding() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Port.BindingProperty); 
        if (result != null) return (metadslx.languages.soal.Binding)result;
        else return (metadslx.languages.soal.Binding)null;
    }
    
    public void setBinding(metadslx.languages.soal.Binding value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Port.BindingProperty, value);
    }
}


