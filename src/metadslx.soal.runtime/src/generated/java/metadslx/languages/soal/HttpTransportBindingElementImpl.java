package metadslx.languages.soal;

class HttpTransportBindingElementImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.HttpTransportBindingElement {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.HttpTransportBindingElement; 
    }

    public HttpTransportBindingElementImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().HttpTransportBindingElement(this);
        this.mMakeDefault();
    }
    
    public boolean getSsl() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.SslProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setSsl(boolean value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.SslProperty, value);
    }
    
    public boolean getClientAuthentication() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.ClientAuthenticationProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setClientAuthentication(boolean value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.HttpTransportBindingElement.ClientAuthenticationProperty, value);
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


