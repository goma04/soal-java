package metadslx.languages.soal;

public interface NonNullableType extends metadslx.languages.soal.SoalType
{
    metadslx.languages.soal.SoalType getInnerType();
    void setInnerType(metadslx.languages.soal.SoalType value);

}


