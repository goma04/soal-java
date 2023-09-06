package soal.model

import java.util.LinkedHashSet
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import soal.model.doc.DocumentationReader

class SoalModelUtils {
    public static final URI BuiltInResourceURI = URI.createURI("global:/soaltmp/Globals.soaltmp")

    def static GlobalSoalModel getGlobalModel(EObject obj) {
        val resource = obj?.eResource
        val resourceSet = resource?.resourceSet
        return getGlobalModel(resourceSet)
    }

    def static GlobalSoalModel getGlobalModel(ResourceSet resourceSet) {
        var globalResource = resourceSet?.getResource(BuiltInResourceURI, false)
        var GlobalSoalModel result = null
        if (globalResource === null) {
            globalResource = resourceSet?.createResource(BuiltInResourceURI)
            result = createGlobalModel()
            globalResource?.contents?.add(result)
        } else {
            result = globalResource?.contents?.get(0) as GlobalSoalModel
        }
        return result
    }

    def static GlobalSoalModel createGlobalModel() {
        val global = SoalModelFactory.eINSTANCE.createGlobalSoalModel()
        createBuiltInTypes(global)
        return global
    }

    def private static void createBuiltInTypes(GlobalSoalModel model) {
        model.errorType = createBuiltInType(model, BuiltInTypeKind.ERROR, "<<error>>")
        model.anyType = createBuiltInType(model, BuiltInTypeKind.ANY, "<<any>>")
        model.voidType = createBuiltInType(model, BuiltInTypeKind.VOID, "void")
        model.objectType = createBuiltInType(model, BuiltInTypeKind.OBJECT, "object")
        model.binaryType = createBuiltInType(model, BuiltInTypeKind.BINARY, "binary")
        model.boolType = createBuiltInType(model, BuiltInTypeKind.BOOL, "bool")
        model.stringType = createBuiltInType(model, BuiltInTypeKind.STRING, "string")
        model.intType = createBuiltInType(model, BuiltInTypeKind.INT, "int")
        model.longType = createBuiltInType(model, BuiltInTypeKind.LONG, "long")
        model.floatType = createBuiltInType(model, BuiltInTypeKind.FLOAT, "float")
        model.doubleType = createBuiltInType(model, BuiltInTypeKind.DOUBLE, "double")
        model.dateType = createBuiltInType(model, BuiltInTypeKind.DATE, "date")
        model.timeType = createBuiltInType(model, BuiltInTypeKind.TIME, "time")
        model.dateTimeType = createBuiltInType(model, BuiltInTypeKind.DATETIME, "datetime")
        model.durationType = createBuiltInType(model, BuiltInTypeKind.DURATION, "duration")
    }

    def private static BuiltInType createBuiltInType(GlobalSoalModel model, BuiltInTypeKind kind, String name) {
        val factory = SoalModelFactory.eINSTANCE
        val type = factory.createBuiltInType();
        type.name = name
        type.kind = kind
        model.builtInTypes.add(type)
        return type
    }

    def static getModel(EObject object) {
        return EcoreUtil2.getContainerOfType(object, typeof(SoalModel))
    }

    def static RootSoalModel createRootSoalModel(SoalModel model) {
        val globalModel = getGlobalModel(model)
        val models = new LinkedHashSet<SoalModel>()
        addModelImports(models, model)
        return new RootSoalModel(globalModel, models)
    }

    def static void addModelImports(Set<SoalModel> imports, SoalModel model) {
        imports.add(model)
        for (imodel: model.imports) {
            if (!imports.contains(imodel)) {
                imports.add(imodel)
            }
        }
    }

    def static Documentation getDocumentation(NamedElement object) {
        return DocumentationReader.getDocumentation(object);
    }
    
    def static String getHtml(DocumentationTag tag) {
        return DocumentationReader.getHtml(tag);
    }

	def static getUniqueName(NamedElement elem) {
		return DocumentationReader.getUniqueName(elem);
	}
}
