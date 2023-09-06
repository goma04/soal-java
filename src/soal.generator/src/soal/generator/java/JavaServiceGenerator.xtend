package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.RootSoalModel
import soal.model.Service

class JavaServiceGenerator extends JavaGeneratorBase {

    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def List<GeneratedFile> generateAll() {
        val result = newArrayList
        for (service : services) {
            result.add(new GeneratedFile(parentName+"/service", service.name+".java", generateService(service), false))
            result.add(new GeneratedFile(parentName+"/service", service.name+"ServiceFactory.java", generateServiceFactory(service), false))
        }
        return result
    }

    def generateService(Service service) {
        '''
        package «parentName».service;

        import «parentName».common.«service.interface.name»;
        «FOR type: typeAnalysis.getUsedTypes(service.interface)»
        import «parentName».common.«generateTypeRef(type, false)»;
        «ENDFOR»

        public class «service.name» implements «service.interface.name» {
            «FOR op: typeAnalysis.getOperations(service.interface)»
            @Override
            public «generateOperationSignature(service.interface, op)» {
                throw new UnsupportedOperationException("This operation is not implemented.");
            }
            «ENDFOR»

        }
        '''
    }

    def generateServiceFactory(Service service) {
        '''
        package «parentName».service;

        import «parentName».common.«service.interface.name»;
        import «parentName».common.«service.interface.name»Factory;

        public class «service.name»ServiceFactory implements «service.interface.name»Factory {

            @Override
            public «service.interface.name» create() {
                return new «service.name»();
            }

        }

        '''
    }

}