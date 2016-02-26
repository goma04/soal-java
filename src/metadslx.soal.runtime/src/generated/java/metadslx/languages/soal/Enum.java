package metadslx.languages.soal;

@metadslx.core.Scope
public interface Enum extends metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
{
    metadslx.languages.soal.Enum getBaseType();
    void setBaseType(metadslx.languages.soal.Enum value);
    java.util.List<metadslx.languages.soal.EnumLiteral> getEnumLiterals();

}


