package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class EnvironmentImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Environment {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Environment; 
    }

    public EnvironmentImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Environment.DatabasesProperty, new metadslx.core.ModelList<Database>(this, metadslx.languages.soal.SoalDescriptor.Environment.DatabasesProperty));
        this.mSet(metadslx.languages.soal.SoalDescriptor.Environment.AssembliesProperty, new metadslx.core.ModelList<Assembly>(this, metadslx.languages.soal.SoalDescriptor.Environment.AssembliesProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Environment(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.Runtime getRuntime() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Environment.RuntimeProperty); 
        if (result != null) return (metadslx.languages.soal.Runtime)result;
        else return (metadslx.languages.soal.Runtime)null;
    }
    
    public void setRuntime(metadslx.languages.soal.Runtime value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Environment.RuntimeProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.Database> getDatabases() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Environment.DatabasesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Database>)result;
        else return (java.util.List<metadslx.languages.soal.Database>)null;
    }
    
    public java.util.List<metadslx.languages.soal.Assembly> getAssemblies() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Environment.AssembliesProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Assembly>)result;
        else return (java.util.List<metadslx.languages.soal.Assembly>)null;
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


