package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.ArrayType
import soal.model.EnumType
import soal.model.Interface
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.StructType

class RestCommonGenerator extends RestGeneratorBase {

    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def List<GeneratedFile> generateAll() {
        val result = newArrayList
        for (enumType : typeAnalysis.enumTypes) {
            result.add(new GeneratedFile(parentName+"/rest/common", enumType.name+".java", generateEnumType(enumType), true))
        }
        for (structType : typeAnalysis.structTypes) {
            result.add(new GeneratedFile(parentName+"/rest/common", structType.name+".java", generateStructType(structType), true))
        }
        for (intf : interfaces) {
            for (op : typeAnalysis.getOperations(intf)) {
                result.add(new GeneratedFile(parentName+"/rest/common", op.name+"Request.java", generateOperationRequest(intf, op), true))
                result.add(new GeneratedFile(parentName+"/rest/common", op.name+"Response.java", generateOperationResponse(intf, op), true))
            }
        }
        return result
    }

    private def generateEnumType(EnumType type) {
        '''
        package «parentName».rest.common;

        import java.util.stream.Stream;

        import com.fasterxml.jackson.annotation.JsonCreator;
        import com.fasterxml.jackson.annotation.JsonValue;

        public enum «type.name» {
            «FOR lit: type.literals SEPARATOR ", "»«lit.name.toUpperCase»(«parentName».common.«type.name».«lit.name.toUpperCase», "«lit.name»")«ENDFOR»;

            private «parentName».common.«type.name» _common;
            private String _value;

            private «type.name»(«parentName».common.«type.name» common, String value) {
                _common = common;
                _value = value;
            }

            @JsonCreator
            public static «type.name» fromValue(final String value) {
                return Stream.of(«type.name».values()).filter(targetEnum -> targetEnum._value.equals(value)).findFirst().orElse(null);
            }

            @JsonValue
            public String getValue() {
                return _value;
            }

            public «parentName».common.«type.name» toCommon() {
                return _common;
            }

            public static «type.name» fromCommon(«parentName».common.«type.name» value) {
                if (value == null) return null;
                return Stream.of(«type.name».values()).filter(targetEnum -> targetEnum._common.equals(value)).findFirst().orElse(null);
            }
        }
        '''
    }

    private def generateStructType(StructType type) {
        '''
        package «parentName».rest.common;

        import java.util.ArrayList;
        import java.util.List;

        public class «type.name»«IF type.baseType !== null» extends «generateTypeRef(type.baseType, false)»«ENDIF» {
            «generateFieldsAndAccessors(type.fields)»

            public «parentName».common.«type.name» toCommon() {
                «parentName».common.«type.name» result = new «parentName».common.«type.name»();
                «FOR field: type.fields»
                    «IF field.type instanceof ArrayType»
                    result.«field.name.toGetterName»().addAll(«field.name.toGetterName»());
                    «ELSE»
                    result.«field.name.toSetterName»(«field.name.toGetterName»());
                    «ENDIF»
                «ENDFOR»
                return result;
            }

            public static «type.name» fromCommon(«parentName».common.«type.name» value) {
                if (value == null) return null;
                «type.name» result = new «type.name»();
                «FOR field: type.fields»
                    «IF field.type instanceof ArrayType»
                    result.«field.name.toGetterName»().addAll(value.«field.name.toGetterName»());
                    «ELSE»
                    result.«field.name.toSetterName»(value.«field.name.toGetterName»());
                    «ENDIF»
                «ENDFOR»
                return result;
            }
        }
        '''
    }

    private def generateOperationRequest(Interface intf, Operation op) {
        '''
        package «parentName».rest.common;

        import java.util.ArrayList;
        import java.util.List;

        public class «op.name»Request {
            «IF op.hasRequestParameters»
            «generateFieldsAndAccessors(op.requestParameters.parameters)»
            «ENDIF»
        }
        '''
    }

    private def generateOperationResponse(Interface intf, Operation op) {
        '''
        package «parentName».rest.common;

        import java.util.ArrayList;
        import java.util.List;

        public class «op.name»Response {
            «IF op.hasResponseParameters»
            «generateFieldsAndAccessors(op.responseParameters.parameters)»
            «ENDIF»
        }
        '''
    }
}