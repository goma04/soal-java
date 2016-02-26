package metadslx.languages.soal;

public interface Declaration extends metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
{
    metadslx.languages.soal.Namespace getNamespace();
    void setNamespace(metadslx.languages.soal.Namespace value);

}


