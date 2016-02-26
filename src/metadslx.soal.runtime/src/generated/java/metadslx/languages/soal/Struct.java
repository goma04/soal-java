package metadslx.languages.soal;

@metadslx.core.Scope
public interface Struct extends metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
{
    metadslx.languages.soal.Struct getBaseType();
    void setBaseType(metadslx.languages.soal.Struct value);
    java.util.List<metadslx.languages.soal.Property> getProperties();

}


