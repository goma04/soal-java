package metadslx.languages.soal;

public interface Environment extends metadslx.languages.soal.NamedElement
{
    metadslx.languages.soal.Runtime getRuntime();
    void setRuntime(metadslx.languages.soal.Runtime value);
    java.util.List<metadslx.languages.soal.Database> getDatabases();
    java.util.List<metadslx.languages.soal.Assembly> getAssemblies();

}


