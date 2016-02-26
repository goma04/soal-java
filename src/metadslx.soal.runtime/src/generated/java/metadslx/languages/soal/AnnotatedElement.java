package metadslx.languages.soal;

public interface AnnotatedElement
{
    java.util.List<metadslx.languages.soal.Annotation> getAnnotations();

    metadslx.languages.soal.Annotation addAnnotation(String name);
    boolean hasAnnotation(String name);
    metadslx.languages.soal.Annotation getAnnotation(String name);
    java.util.List<metadslx.languages.soal.Annotation> getAnnotations(String name);
    boolean hasAnnotationProperty(String annotationName, String propertyName);
    Object getAnnotationPropertyValue(String annotationName, String propertyName);
    metadslx.languages.soal.AnnotationProperty setAnnotationPropertyValue(String annotationName, String propertyName, Object propertyValue);
}


