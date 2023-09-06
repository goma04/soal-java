package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.RootSoalModel

class JavaMainGenerator extends JavaGeneratorBase {
    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		result.add(new GeneratedFile(parentName+"/main", "Program.java", generateProgramJava(), false))
		return result
	}

	private def generateProgramJava() {
		'''
		package «parentName».main;
		
		«FOR service: services»
		import «parentName».client.«service.name»;
		«ENDFOR»
		
		public class Program {
		
			public static void main(String[] args) {
				«FOR service: services»
				try («service.name» «service.name.toLowerCase» = new «service.name»()) {
					// TODO: call service
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				«ENDFOR»
			}
		
		}
		
		'''
	}
}