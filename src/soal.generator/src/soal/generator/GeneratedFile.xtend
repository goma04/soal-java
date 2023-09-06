package soal.generator

class GeneratedFile {
    String _directory
    String _fileName
    CharSequence _content
    boolean _overwriteIfExists

    new (String directory, String fileName, CharSequence content, boolean overwriteIfExists) {
        _directory = directory
        _fileName = fileName
        _content = content
        _overwriteIfExists = overwriteIfExists
    }

    def getDirectory() { _directory }
    def getFileName() { _fileName }
    def getContent() { _content }
    def getOverwriteIfExists() { _overwriteIfExists }
}