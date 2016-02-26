package metadslx.languages.soal;

public interface Endpoint extends metadslx.languages.soal.Declaration
{
    metadslx.languages.soal.Interface getInterface();
    void setInterface(metadslx.languages.soal.Interface value);
    metadslx.languages.soal.Binding getBinding();
    void setBinding(metadslx.languages.soal.Binding value);
    String getAddress();
    void setAddress(String value);

}


