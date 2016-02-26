package metadslx.languages.soal;

public interface ArrayType extends metadslx.languages.soal.SoalType
{
    metadslx.languages.soal.SoalType getInnerType();
    void setInnerType(metadslx.languages.soal.SoalType value);

}


