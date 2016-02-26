package metadslx.languages.soal;

public interface PrimitiveType extends metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
{
    boolean getNullable();
    void setNullable(boolean value);

}


