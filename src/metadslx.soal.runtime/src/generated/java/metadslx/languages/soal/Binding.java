package metadslx.languages.soal;

public interface Binding extends metadslx.languages.soal.Declaration
{
    metadslx.languages.soal.TransportBindingElement getTransport();
    void setTransport(metadslx.languages.soal.TransportBindingElement value);
    java.util.List<metadslx.languages.soal.EncodingBindingElement> getEncodings();
    java.util.List<metadslx.languages.soal.ProtocolBindingElement> getProtocols();

}


