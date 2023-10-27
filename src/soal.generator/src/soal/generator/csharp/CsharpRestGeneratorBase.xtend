package soal.generator.csharp
import soal.model.RootSoalModel

class CsharpRestGeneratorBase extends CsharpGeneratorBase {
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }
}