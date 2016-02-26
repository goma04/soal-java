package metadslx.languages.soal;

public interface Composite extends metadslx.languages.soal.Component
{
    java.util.List<metadslx.languages.soal.Component> getComponents();
    java.util.List<metadslx.languages.soal.Wire> getWires();

}


