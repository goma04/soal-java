package soal.dsl.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import soal.model.EnumLiteral
import soal.model.EnumType
import soal.model.Interface
import soal.model.NamedElement
import soal.model.Operation
import soal.model.Property
import soal.model.Service
import soal.model.SoalModel
import soal.model.SoalModelPackage
import soal.model.StructType

class NameValidator extends AbstractSoalDslValidator {
    public static val DUPLICATE_NAME = 'DUPLICATE_NAME'

    // This empty override is necessary to prevent reporting duplicate validation messages
    override register(EValidatorRegistrar registrar) {
    }

    @Check(NORMAL)
    def checkModelName(SoalModel m) {
        val fileName = m.eResource.URI.trimFileExtension.lastSegment;
        if (m.name != fileName) {
            error("The descriptor name '"+m.name+"' does not match the file name '"+fileName+"'.", SoalModelPackage.Literals.NAMED_ELEMENT__NAME)
        }
    }

    @Check(NORMAL)
    def checkEnumGloballyUnique(EnumType object) {
        checkGloballyUniqueName(object, EnumType)
    }

    @Check(NORMAL)
    def checkStructGloballyUnique(StructType object) {
        checkGloballyUniqueName(object, StructType)
    }

    @Check(NORMAL)
    def checkStructGloballyUnique(Interface object) {
        checkGloballyUniqueName(object, Interface)
    }

    @Check(NORMAL)
    def checkStructGloballyUnique(Service object) {
        checkGloballyUniqueName(object, Service)
    }

    private def <T extends NamedElement> checkGloballyUniqueName(NamedElement object, Class<T> type) {
        if(!(object.eContainer instanceof SoalModel)) return;
        var model = object.eContainer as SoalModel
        var rootModel = model.rootModel
        var globalModel = model.globals
        var objects = newArrayList
        objects.addAll(rootModel.declarations.filter(type))
        for (T otherObject : objects) {
            if (object !== otherObject && object.name == otherObject.name) {
                if (otherObject.eResource === globalModel.eResource) {
                    error("There is already a built-in " + type.simpleName + " called '" + object.name + "'",
                        SoalModelPackage.Literals.NAMED_ELEMENT__NAME, DUPLICATE_NAME)
                } else {
                    error("There is already another " + type.simpleName + " '" + object.name + "' defined in '" +
                        otherObject.eResource.URI.lastSegment + "'", SoalModelPackage.Literals.NAMED_ELEMENT__NAME,
                        DUPLICATE_NAME)
                }
            }
        }
    }

    @Check(NORMAL)
    def checkStructVariableUnique(EnumLiteral object) {
        if(!(object.eContainer instanceof EnumType)) return;
        checkUniqueName(object, EnumLiteral, SoalModelPackage.Literals.ENUM_TYPE__LITERALS)
    }

    @Check(NORMAL)
    def checkStructVariableUnique(Property object) {
        if(!(object.eContainer instanceof StructType)) return;
        checkUniqueName(object, Property, SoalModelPackage.Literals.STRUCT_TYPE__FIELDS)
    }

    @Check(NORMAL)
    def checkOperationUnique(Operation object) {
        if(!(object.eContainer instanceof Interface)) return;
        checkUniqueName(object, Operation, SoalModelPackage.Literals.INTERFACE__OPERATIONS)
    }

    private def <T extends NamedElement> checkUniqueName(NamedElement object, Class<T> type,
        EStructuralFeature... features) {
        val objects = newArrayList
        val container = object.eContainer as NamedElement
        for (feature : features) {
            objects.addAll(container.eGet(feature) as Iterable<T>)
        }
        for (otherObject : objects.filter[type.isInstance(it)]) {
            if (object !== otherObject && object.name == otherObject.name) {
                error(
                    "There is already another " + type.simpleName + " '" + object.name + "' defined in " +
                        getTypeName(otherObject.eContainer) + " '" + getObjectName(otherObject.eContainer) + "'",
                    SoalModelPackage.Literals.NAMED_ELEMENT__NAME, DUPLICATE_NAME)
            }
        }
    }

    private static def getTypeName(EObject object) {
        val result = object.class.simpleName
        if(result.endsWith("Impl")) return result.substring(0, result.length - 4) else return result
    }

    private static def getObjectName(EObject object) {
        if (object instanceof NamedElement) {
            return (object as NamedElement).name
        } else {
            return ""
        }
    }

}