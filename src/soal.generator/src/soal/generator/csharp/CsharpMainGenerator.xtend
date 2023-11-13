package soal.generator.csharp

import soal.model.RootSoalModel
import java.util.List
import soal.generator.GeneratedFile

class CsharpMainGenerator extends CsharpGeneratorBase {

	new(RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
		super(model, name, configuration)
	}

	def List<GeneratedFile> generateAll() {
		val result = newArrayList
		result.add(new GeneratedFile(parentName + "", "Program.cs", generateProgram(), false))
		return result
	}

	private def generateProgram() {
		'''			
			«FOR service : services»
				using «parentName».Client;
			«ENDFOR»		
					
			«FOR service : services»
				«service.name» «service.name.toLowerCase» = new «service.name»();
				// TODO: call service					
			«ENDFOR»
		'''
	}

}
