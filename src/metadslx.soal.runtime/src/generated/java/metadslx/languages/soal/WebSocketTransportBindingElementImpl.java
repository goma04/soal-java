package metadslx.languages.soal;

class WebSocketTransportBindingElementImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.WebSocketTransportBindingElement {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.WebSocketTransportBindingElement; 
    }

    public WebSocketTransportBindingElementImpl() {
        metadslx.languages.soal.SoalImplementationProvider.implementation().WebSocketTransportBindingElement(this);
        this.mMakeDefault();
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


