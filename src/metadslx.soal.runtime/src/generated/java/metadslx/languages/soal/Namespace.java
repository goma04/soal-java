package metadslx.languages.soal;

@metadslx.core.Scope
public interface Namespace extends metadslx.languages.soal.Declaration
{
    String getUri();
    void setUri(String value);
    String getPrefix();
    void setPrefix(String value);
    String getFullName();
    java.util.List<metadslx.languages.soal.Declaration> getDeclarations();

}


