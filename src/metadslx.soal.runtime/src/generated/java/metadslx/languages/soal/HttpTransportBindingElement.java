package metadslx.languages.soal;

public interface HttpTransportBindingElement extends metadslx.languages.soal.TransportBindingElement
{
    boolean getSsl();
    void setSsl(boolean value);
    boolean getClientAuthentication();
    void setClientAuthentication(boolean value);

}


