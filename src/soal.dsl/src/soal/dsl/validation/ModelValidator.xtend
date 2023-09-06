package soal.dsl.validation

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import soal.dsl.validation.AbstractSoalDslValidator
import soal.model.SoalModel
import soal.model.SoalModelPackage

class ModelValidator extends AbstractSoalDslValidator {

    public static val FILE_IMPORTS_ITSELF = "FILE_IMPORTS_ITSELF"
    public static val FILE_MULTIPLE_IMPORT = "FILE_MULTIPLE_IMPORT"

    // This empty override is necessary to prevent reporting duplicate validation messages
    override register(EValidatorRegistrar registrar) {
    }

    @Check(NORMAL)
    def checkImportItself(SoalModel m) {
        for (i : 0 ..< m.imports.size)
            if (m.imports.get(i).equals(m))
                error("The file cannot import itself", SoalModelPackage.Literals.SOAL_MODEL__IMPORTS,i, FILE_IMPORTS_ITSELF)

    }

    @Check(NORMAL)
    def checkImportedMultipleTimes(SoalModel m) {
        for (i : 0 ..< m.imports.size)
            if (isMember(m.imports.get(i), m.imports, i + 1)) {
                var String[] subStrings= m.imports.get(i).eResource.toString.split("/")
                error(subStrings.get(subStrings.length-1) + " is imported multiple times",
                    SoalModelPackage.Literals.SOAL_MODEL__IMPORTS,i, FILE_MULTIPLE_IMPORT)

            }

    }

    def isMember(EObject object, EList<SoalModel> list, int start) {
        for (i : start ..< list.size)
            if (list.get(i).equals(object))
                return true
        return false
    }
}