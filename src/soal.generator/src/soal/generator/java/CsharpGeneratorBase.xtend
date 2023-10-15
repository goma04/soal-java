package soal.generator.java

import soal.model.RootSoalModel
import soal.generator.GeneratorBase

class CsharpGeneratorBase extends GeneratorBase{
	String _parentName
   		CsharpGeneratorConfiguration _configuration
    
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
        super(model, name)
        _parentName = name.toLowerCase
        _configuration = configuration
    }
}