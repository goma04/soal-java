package metadslx.languages.soal;

final class SoalImplementationProvider {
    // If there is a compile error at this line, create a new class called SoalImplementation
	// which is a subclass of SoalImplementationBase:
    private static SoalImplementation implementation = new SoalImplementation();

    public static SoalImplementation implementation() {
        return SoalImplementationProvider.implementation;
    }
}

