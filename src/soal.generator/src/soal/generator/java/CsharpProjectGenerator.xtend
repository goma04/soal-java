package soal.generator.java

import soal.model.RootSoalModel

class CsharpProjectGenerator extends CsharpGeneratorBase {
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }
	
	def GenerateMainCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateCommonCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateClientCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateServiceCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateRestCommonCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateRestServiceCsproj() {
		'''
    	Csproj
    	'''
	}
	
	def GenerateRestClientCsproj() {
		'''
    	Csproj
    	'''
	}
	
}