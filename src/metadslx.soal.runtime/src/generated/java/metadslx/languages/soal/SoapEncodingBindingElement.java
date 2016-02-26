package metadslx.languages.soal;

public interface SoapEncodingBindingElement extends metadslx.languages.soal.EncodingBindingElement
{
    metadslx.languages.soal.SoapEncodingStyle getStyle();
    void setStyle(metadslx.languages.soal.SoapEncodingStyle value);
    metadslx.languages.soal.SoapVersion getVersion();
    void setVersion(metadslx.languages.soal.SoapVersion value);
    boolean getMtom();
    void setMtom(boolean value);

}


