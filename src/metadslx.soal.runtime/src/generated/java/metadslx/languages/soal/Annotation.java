package metadslx.languages.soal;

public interface Annotation extends metadslx.languages.soal.NamedElement
{
    metadslx.languages.soal.AnnotatedElement getAnnotatedElement();
    void setAnnotatedElement(metadslx.languages.soal.AnnotatedElement value);
    java.util.List<metadslx.languages.soal.AnnotationProperty> getProperties();

    boolean hasProperty(String name);
    metadslx.languages.soal.AnnotationProperty getProperty(String name);
    Object getPropertyValue(String name);
    metadslx.languages.soal.AnnotationProperty setPropertyValue(String name, Object value);
}


