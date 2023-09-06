package soal.dsl;

import com.google.inject.Inject
import com.google.inject.Injector
import java.io.IOException
import java.util.ArrayList
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.validation.Issue
import soal.model.RootSoalModel
import soal.model.SoalModel
import soal.model.SoalModelPackage
import soal.model.SoalModelUtils

class SoalParser {
    final Logger logger = Logger.getLogger(SoalParser)

    SoalModelPackage _soalPackage
    int _codeCounter
    Injector _injector
    List<Issue> _issues
    boolean _hasAnyErrors
    RootSoalModel _rootModel

    @Inject
    IResourceValidator _resourceValidator

    @Inject
    XtextResourceSet _resourceSet

    new () {
        _soalPackage = SoalModelPackage.eINSTANCE
        val setup = new SoalDslStandaloneSetup()
        _injector = setup.createInjectorAndDoEMFRegistration()
        _injector.injectMembers(this);
        _resourceSet = new XtextResourceSet();
        _resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soaltmp", new XMIResourceFactoryImpl());
        _resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        _issues = new ArrayList<Issue>();
    }

    def getSoalPackage() { _soalPackage }
    def getResourceSet() { _resourceSet }
    def hasAnyErrors() { _hasAnyErrors }
    def getIssues() { _issues }

    def RootSoalModel getModel() {
        if (_rootModel === null) {
            var globalModel = SoalModelUtils.getGlobalModel(resourceSet);
            var models = new ArrayList<SoalModel>();
            for (resource: resourceSet.resources) {
                if (resource.contents !== null && resource.contents.size == 1 && (resource.contents.get(0) instanceof SoalModel)) {
	                val model = resource.contents.get(0) as SoalModel;
	                models.add(model);
                }
            }
            _rootModel = new RootSoalModel(globalModel, models);
        }
        return _rootModel;
    }

    def Resource addSource(String soalCode) throws IOException {
    	if (_rootModel !== null) throw new IllegalStateException("Cannot add more sources after the root model has been accessed.");
        _codeCounter++
        val resourceName = "dummy:/source"+_codeCounter+".soal"
        logger.info("Adding resource: "+resourceName)
        val resource = resourceSet.createResource(URI.createURI(resourceName))
        resource.load(new StringInputStream(soalCode), resourceSet.getLoadOptions())
        checkResource(resource)
        return resource;
    }

    def addFile(String filePath) {
    	if (_rootModel !== null) throw new IllegalStateException("Cannot add more sources after the root model has been accessed.");
        logger.info("Adding resource: "+filePath)
        val resource = resourceSet.getResource(URI.createFileURI(filePath), true)
        checkResource(resource)
        return resource;
    }

    def checkResource(Resource resource) {
        val issues = _resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
        this.issues.addAll(issues)
        for (Issue issue : issues) {
            val logEntry = issue.message+" ["+issue.uriToProblem.lastSegment+" ("+issue.lineNumber+","+issue.column+")]"
            switch (issue.severity) {
                case ERROR : {
                    _hasAnyErrors = true
                    logger.error(logEntry)
                }
                case WARNING : {
                    logger.warn(logEntry);
                }
                case INFO : {
                    logger.info(logEntry);
                }
                default : {
                    logger.trace(logEntry);
                }
            }
        }
    }

}