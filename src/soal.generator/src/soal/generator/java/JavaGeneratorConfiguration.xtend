package soal.generator.java

class JavaGeneratorConfiguration {
	String _javaVersion = "11";
	String _springVersion = "2.7.1";
	
	def getJavaVersion() { _javaVersion }
	def setJavaVersion(String value) { _javaVersion = value }	

	def getSpringVersion() { _springVersion }	
	def setSpringVersion(String value) { _springVersion = value }	
}