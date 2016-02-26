package metadslx.languages.soal;

class SoapEncodingBindingElementImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.SoapEncodingBindingElement {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.SoapEncodingBindingElement; 
    }

    public SoapEncodingBindingElementImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().SoapEncodingBindingElement(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.SoapEncodingStyle getStyle() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.StyleProperty); 
        if (result != null) return (metadslx.languages.soal.SoapEncodingStyle)result;
        else return (metadslx.languages.soal.SoapEncodingStyle)null;
    }
    
    public void setStyle(metadslx.languages.soal.SoapEncodingStyle value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.StyleProperty, value);
    }
    
    public metadslx.languages.soal.SoapVersion getVersion() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.VersionProperty); 
        if (result != null) return (metadslx.languages.soal.SoapVersion)result;
        else return (metadslx.languages.soal.SoapVersion)null;
    }
    
    public void setVersion(metadslx.languages.soal.SoapVersion value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.VersionProperty, value);
    }
    
    public boolean getMtom() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.MtomProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setMtom(boolean value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.SoapEncodingBindingElement.MtomProperty, value);
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


