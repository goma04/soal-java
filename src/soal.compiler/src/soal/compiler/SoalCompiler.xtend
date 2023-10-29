package soal.compiler

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import soal.dsl.SoalParser
import soal.generator.GeneratedFile
import soal.generator.InterfaceKind
import soal.generator.doc.HtmlGenerator
import soal.generator.java.EclipseProjectGenerator
import soal.generator.java.JavaClientGenerator
import soal.generator.java.JavaCommonGenerator
import soal.generator.java.JavaGeneratorConfiguration
import soal.generator.java.JavaMainGenerator
import soal.generator.java.JavaServiceGenerator
import soal.generator.java.MavenProjectGenerator
import soal.generator.java.RestClientGenerator
import soal.generator.java.RestCommonGenerator
import soal.generator.java.RestServiceGenerator
import soal.generator.rest.OpenApiGenerator
import soal.generator.rest.OpenApiVersion
import soal.generator.soap.WsdlGenerator
import soal.generator.soap.XsdGenerator
import soal.model.BindingKind
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.SoalModel
import soal.model.SoalModelUtils
import soal.generator.csharp.CsharpGeneratorConfiguration
import soal.generator.csharp.CsharpProjectGenerator
import soal.generator.csharp.CsharpRestServiceGenerator
import soal.generator.csharp.CsharpCommonGenerator

class SoalCompiler {
	final Logger logger = Logger.getLogger(SoalCompiler)

	String _inputPath
	String _outputPath
	String _modelName
	JavaGeneratorConfiguration _config
	CsharpGeneratorConfiguration _configCsharp
	RootSoalModel _rootModel
	MavenProjectGenerator _mavenGenerator
	EclipseProjectGenerator _eclipseGenerator
	JavaMainGenerator _mainGenerator
	JavaCommonGenerator _commonGenerator
	CsharpCommonGenerator _csharpCommonGenerator
	JavaClientGenerator _clientGenerator
	JavaServiceGenerator _serviceGenerator
	RestCommonGenerator _restCommonGenerator
	RestClientGenerator _restClientGenerator
	RestServiceGenerator _restServiceGenerator
	CsharpRestServiceGenerator _csharpRestServiceGenerator
	CsharpProjectGenerator _csharpGenerator

	new(String inputPath, String outputPath) {
		_inputPath = inputPath
		_outputPath = outputPath

		val file = new File(inputPath)
		_modelName = file.name.withoutExtension.toLowerCase
		_config = new JavaGeneratorConfiguration()
		_configCsharp = new CsharpGeneratorConfiguration()
	}

	def getRootModel() {
		if (_rootModel === null) {
			_rootModel = readRootSoalModel(_inputPath)
		}
		return _rootModel
	}

	def getMavenGenerator() {
		if (_mavenGenerator === null) {
			_mavenGenerator = new MavenProjectGenerator(rootModel, _modelName, _config)
		}
		return _mavenGenerator
	}

	def getCsharpGenerator() {
		if (_csharpGenerator === null) {
			_csharpGenerator = new CsharpProjectGenerator(rootModel, _modelName, _configCsharp)
		}
		return _csharpGenerator
	}

	def getEclipseGenerator() {
		if (_eclipseGenerator === null) {
			_eclipseGenerator = new EclipseProjectGenerator(rootModel, _modelName, _config)
		}
		return _eclipseGenerator
	}

	def getMainGenerator() {
		if (_mainGenerator === null) {
			_mainGenerator = new JavaMainGenerator(rootModel, _modelName, _config)
		}
		return _mainGenerator
	}

	def getCommonGenerator() {
		if (_commonGenerator === null) {
			_commonGenerator = new JavaCommonGenerator(rootModel, _modelName, _config)
		}
		return _commonGenerator
	}

	def getClientGenerator() {
		if (_clientGenerator === null) {
			_clientGenerator = new JavaClientGenerator(rootModel, _modelName, _config)
		}
		return _clientGenerator
	}

	def getServiceGenerator() {
		if (_serviceGenerator === null) {
			_serviceGenerator = new JavaServiceGenerator(rootModel, _modelName, _config)
		}
		return _serviceGenerator
	}

	def getRestCommonGenerator() {
		if (_restCommonGenerator === null) {
			_restCommonGenerator = new RestCommonGenerator(rootModel, _modelName, _config)
		}
		return _restCommonGenerator
	}

	def getRestClientGenerator() {
		if (_restClientGenerator === null) {
			_restClientGenerator = new RestClientGenerator(rootModel, _modelName, _config)
		}
		return _restClientGenerator
	}

	def getRestServiceGenerator() {
		if (_restServiceGenerator === null) {
			_restServiceGenerator = new RestServiceGenerator(rootModel, _modelName, _config)
		}
		return _restServiceGenerator
	}
	
	def getCsharpRestServiceGenerator(){
		if(_csharpRestServiceGenerator === null){
			_csharpRestServiceGenerator = new CsharpRestServiceGenerator(rootModel, _modelName, _configCsharp)
		}
		return _csharpRestServiceGenerator
	}
	
	def getCsharpCommonGenerator(){
		if(_csharpCommonGenerator === null){
			_csharpCommonGenerator = new CsharpCommonGenerator(rootModel, _modelName, _configCsharp)
		}
		return _csharpCommonGenerator
	}

	def RootSoalModel readRootSoalModel(String path) throws IOException {
		val file = new File(path);
		if (file.exists()) {
			val parser = new SoalParser()

			if (file.isFile() && path.toLowerCase().endsWith(".soal")) {
				parser.addFile(file.canonicalPath)
			} else if (file.isDirectory()) {
				for (File soalFile : file.listFiles()) {
					val soalFilePath = soalFile.canonicalPath
					if (soalFilePath.toLowerCase().endsWith(".soal")) {
						parser.addFile(soalFilePath)
					}
				}
			}

			val models = new ArrayList<SoalModel>();
			for (Resource resource : parser.getResourceSet().getResources()) {
				if (resource.getContents().size() > 0) {
					val root = resource.getContents().get(0);
					if (root instanceof SoalModel) {
						models.add(root as SoalModel)
					}
				}
			}

			if (parser.hasAnyErrors) {
				throw new IOException(String.format("Error - Could not compile the SOAL files in %s", path));
			} else if (models.isEmpty) {
				throw new IOException(String.format("Error - There are no SOAL files in %s", path));
			} else {
				val globalModel = SoalModelUtils.getGlobalModel(parser.getResourceSet());
				val rootModel = new RootSoalModel(globalModel, models);
				return rootModel;
			}
		} else {
			throw new IOException(String.format("Error - The %s file does not exist.", path));
		}
	}

	def generateDocumentation() {
		val html = _modelName + ".html"
		save(_outputPath, html, new HtmlGenerator(rootModel, _modelName).generate(), true)
	}

	def generateInterface() {
		val openApi30 = _modelName + "-OpenApi-3.0.yaml"
		val openApi31 = _modelName + "-OpenApi-3.1.yaml"
		if (rootModel.declarations.filter(Service).exists[it.binding == BindingKind.REST]) {
			save(_outputPath, openApi30,
				new OpenApiGenerator(rootModel, InterfaceKind.GENERAL, OpenApiVersion.VERSION_3_0).generate(), true)
			save(_outputPath, openApi31,
				new OpenApiGenerator(rootModel, InterfaceKind.GENERAL, OpenApiVersion.VERSION_3_1).generate(), true);
		} else {
			delete(_outputPath, openApi30);
			delete(_outputPath, openApi31);
		}

		val xsd = _modelName + ".xsd"
		val wsdl = _modelName + ".wsdl"
		if (rootModel.declarations.filter(Service).exists[it.binding == BindingKind.SOAP]) {
			save(_outputPath, xsd, new XsdGenerator(rootModel, _modelName, true).generate(), true)
			save(_outputPath, wsdl, new WsdlGenerator(rootModel, _modelName, false).generate(), true);
		} else {
			delete(_outputPath, xsd);
			delete(_outputPath, wsdl);
		}
	}

	def generateImplementation() {
		directory(_outputPath)

		var projectPath = _outputPath

		// parent
		save(projectPath, "pom.xml", mavenGenerator.generateParentPomXml, false)
		save(projectPath, ".project", eclipseGenerator.generateParentProject(_modelName), false)

		// main
		projectPath = mavenProject(_modelName + ".main", mavenGenerator.generateMainPomXml())
		javaSources(projectPath, mainGenerator.generateAll)

		// common
		projectPath = mavenProject(_modelName + ".common", mavenGenerator.generateCommonPomXml())
		javaSources(projectPath, commonGenerator.generateAll)

		// client
		projectPath = mavenProject(_modelName + ".client", mavenGenerator.generateClientPomXml())
		javaSources(projectPath, clientGenerator.generateAll)

		// service
		projectPath = mavenProject(_modelName + ".service", mavenGenerator.generateServicePomXml())
		javaSources(projectPath, serviceGenerator.generateAll)

		// rest.common
		projectPath = mavenProject(_modelName + ".rest.common", mavenGenerator.generateRestCommonPomXml())
		javaSources(projectPath, restCommonGenerator.generateAll)

		// rest.client
		projectPath = mavenProject(_modelName + ".rest.client", mavenGenerator.generateRestClientPomXml())
		javaSources(projectPath, restClientGenerator.generateAll)

		// rest.service
		projectPath = mavenProject(_modelName + ".rest.service", mavenGenerator.generateRestServicePomXml())
		javaSources(projectPath, restServiceGenerator.generateAll)
	}

	def generateCsharpImplementation() {
		directory(_outputPath)

		var projectPath = _outputPath

		// main
		projectPath = csharpProject(_modelName + ".Main", csharpGenerator.GenerateMainCsproj, ProjectType.Main)

		// common
		projectPath = csharpProject(_modelName + ".Common", csharpGenerator.GenerateCommonCsproj, ProjectType.Common)
		csharpSources(projectPath, csharpCommonGenerator.generateAll())

		// client
		projectPath = csharpProject(_modelName + ".Client", csharpGenerator.GenerateClientCsproj, ProjectType.Client)

		// service
		projectPath = csharpProject(_modelName + ".Service", csharpGenerator.GenerateServiceCsproj, ProjectType.Service)

		// rest.common
		projectPath = csharpProject(_modelName + "Rest.Common", csharpGenerator.GenerateRestCommonCsproj, ProjectType.RestCommon)

		// rest.client
		projectPath = csharpProject(_modelName + "Rest.Client", csharpGenerator.GenerateRestClientCsproj, ProjectType.RestClient)

		// rest.service
		projectPath = csharpProject(_modelName + "Rest.Service", csharpGenerator.GenerateRestServiceCsproj, ProjectType.RestService)
		csharpSources(projectPath, csharpRestServiceGenerator.generateAll())

	}

	def mavenProject(String projectName, CharSequence pomXml) {
		val projectPath = directory(_outputPath, projectName)
		directory(projectPath, "src/main/java")
		directory(projectPath, "src/main/resources")
		directory(projectPath, "src/test/java")
		directory(projectPath, "src/test/resources")
		save(projectPath, ".classpath", eclipseGenerator.generateClassPath(), false)
		save(projectPath, ".project", eclipseGenerator.generateProject(projectName), false)
		save(projectPath, "pom.xml", pomXml, false)
		return projectPath
	}

	def csharpProject(String projectName, CharSequence csprojXml, ProjectType projectType) {
		val projectPath = directory(_outputPath, projectName)
		if(projectType == ProjectType.RestService){
			directory(projectPath, "Properties")
				directory(projectPath, "Controllers")
		}		
		save(projectPath, ".csproj", csprojXml, false)
		return projectPath
	}

	def javaSources(String projectPath, List<GeneratedFile> files) {
		val javaPath = new File(projectPath, "src/main/java")
		for (file : files) {
			logger.info("info-"+file.directory)
			val packagePath = new File(javaPath, file.directory).canonicalPath
			directory(packagePath)
			save(packagePath, file.fileName, file.content, file.overwriteIfExists)
		}
	}
	
	def csharpSources(String projectPath, List<GeneratedFile> files){
		val path = new File(projectPath, "test")
		for (file : files) {
			logger.info("info-"+file.directory)
			val packagePath = new File(projectPath).canonicalPath
			directory(packagePath)
			save(packagePath, file.fileName, file.content, file.overwriteIfExists)
		}
	}

	def save(String path, String fileName, CharSequence code, boolean overwrite) throws IOException {
		return save(path, fileName, code.toString, overwrite)
	}

	def save(String path, String fileName, String code, boolean overwrite) throws IOException {
		val file = new File(path, fileName)
		if (!overwrite && file.exists) {
			logger.info(String.format("Exists: %s", file.canonicalPath))
		} else {
			if (file.exists) {
				logger.warn(String.format("Overwrite: %s", file.canonicalPath))
			} else {
				logger.info(String.format("New: %s", file.canonicalPath))
			}
			Files.write(Paths.get(file.canonicalPath), code.getBytes())
		}
		return file.canonicalPath
	}

	def delete(String path, String fileName) throws IOException {
		val file = new File(path, fileName)
		if(file.exists) file.delete
	}

	def directory(String path) throws IOException {
		val file = new File(path)
		file.mkdirs()
		return file.canonicalPath
	}

	// Creates a new directory
	def directory(String path, String subPath) throws IOException {
		val file = new File(path, subPath)
		file.mkdirs()
		return file.canonicalPath
	}

	def static withoutExtension(String fileName) {
		val index = fileName.lastIndexOf('.')
		if (index == -1) {
			return fileName
		} else {
			return fileName.substring(0, index)
		}
	}
}
