package metadslx.languages.soal;

@metadslx.core.Scope
public interface Component extends metadslx.languages.soal.Declaration
{
    metadslx.languages.soal.Component getBaseComponent();
    void setBaseComponent(metadslx.languages.soal.Component value);
    boolean getIsAbstract();
    void setIsAbstract(boolean value);
    java.util.List<metadslx.languages.soal.Service> getServices();
    java.util.List<metadslx.languages.soal.Reference> getReferences();
    java.util.List<metadslx.languages.soal.Property> getProperties();
    metadslx.languages.soal.Implementation getImplementation();
    void setImplementation(metadslx.languages.soal.Implementation value);
    metadslx.languages.soal.Language getLanguage();
    void setLanguage(metadslx.languages.soal.Language value);

}


