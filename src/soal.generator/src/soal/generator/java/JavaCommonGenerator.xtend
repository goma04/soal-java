package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.EnumType
import soal.model.Interface
import soal.model.RootSoalModel
import soal.model.StructType

class JavaCommonGenerator extends JavaGeneratorBase {

    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def List<GeneratedFile> generateAll() {
        val result = newArrayList
        for (enumType : typeAnalysis.enumTypes) {
            result.add(new GeneratedFile(parentName+"/common", enumType.name+".java", generateEnumType(enumType), true))
        }
        for (structType : typeAnalysis.structTypes) {
            result.add(new GeneratedFile(parentName+"/common", structType.name+".java", generateStructType(structType), true))
        }
        for (intf : interfaces) {
            result.add(new GeneratedFile(parentName+"/common", intf.name+".java", generateInterfaceType(intf), true))
            result.add(new GeneratedFile(parentName+"/common", intf.name+"Factory.java", generateFactoryInterfaceType(intf), true))
        }
        return result
    }

    private def generateEnumType(EnumType type) {
        '''
        package «parentName».common;

        public enum «type.name» {
            «FOR lit: type.literals SEPARATOR ", "»«lit.name.toUpperCase»«ENDFOR»
        }
        '''
    }

    private def generateStructType(StructType type) {
        '''
        package «parentName».common;

        import java.util.ArrayList;
        import java.util.List;

        public class «type.name»«IF type.baseType !== null» extends «generateTypeRef(type.baseType, false)»«ENDIF» {
            «generateFieldsAndAccessors(type.fields)»
        }
        '''
    }

    private def generateInterfaceType(Interface type) {
        '''
        package «parentName».common;

        public interface «type.name» {
            «FOR op: typeAnalysis.getOperations(type)»
            «generateOperationSignature(type, op)»;
            «ENDFOR»
        }
        '''
    }

    private def generateFactoryInterfaceType(Interface type) {
        '''
        package «parentName».common;

        public interface «type.name»Factory {
            «type.name» create();
        }
        '''
    }
}