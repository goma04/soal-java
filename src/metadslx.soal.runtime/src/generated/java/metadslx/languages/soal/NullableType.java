package metadslx.languages.soal;

public interface NullableType extends metadslx.languages.soal.SoalType
{
    metadslx.languages.soal.SoalType getInnerType();
    void setInnerType(metadslx.languages.soal.SoalType value);

}


