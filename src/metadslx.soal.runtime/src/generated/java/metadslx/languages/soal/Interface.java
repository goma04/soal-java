package metadslx.languages.soal;

@metadslx.core.Scope
public interface Interface extends metadslx.languages.soal.SoalType, metadslx.languages.soal.Declaration
{
    java.util.List<metadslx.languages.soal.Operation> getOperations();

}


