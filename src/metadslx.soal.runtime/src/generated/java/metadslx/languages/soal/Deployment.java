package metadslx.languages.soal;

public interface Deployment extends metadslx.languages.soal.Declaration
{
    java.util.List<metadslx.languages.soal.Environment> getEnvironments();
    java.util.List<metadslx.languages.soal.Wire> getWires();

}


