package soal.generator;

public enum InterfaceKind {
    GENERAL,
    CLIENT,
    SERVER;

    public boolean isClient() {
        return this == GENERAL || this == CLIENT;
    }

    public boolean isServer() {
        return this == GENERAL || this == SERVER;
    }
}
