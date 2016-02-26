package metadslx.languages.soal;

public interface Port
{
    String getName();
    String getOptionalName();
    void setOptionalName(String value);
    metadslx.languages.soal.Interface getInterface();
    void setInterface(metadslx.languages.soal.Interface value);
    metadslx.languages.soal.Binding getBinding();
    void setBinding(metadslx.languages.soal.Binding value);

}


