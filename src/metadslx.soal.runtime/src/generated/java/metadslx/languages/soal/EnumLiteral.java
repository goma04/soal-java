package metadslx.languages.soal;

public interface EnumLiteral extends metadslx.languages.soal.NamedElement, metadslx.languages.soal.TypedElement, metadslx.languages.soal.AnnotatedElement
{
    metadslx.languages.soal.Enum getEnum();
    void setEnum(metadslx.languages.soal.Enum value);

}


