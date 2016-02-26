package metadslx.languages.soal;

public interface Operation extends metadslx.languages.soal.NamedElement, metadslx.languages.soal.AnnotatedElement
{
    String getAction();
    void setAction(String value);
    java.util.List<metadslx.languages.soal.InputParameter> getParameters();
    metadslx.languages.soal.OutputParameter getResult();
    java.util.List<metadslx.languages.soal.Struct> getExceptions();

}


