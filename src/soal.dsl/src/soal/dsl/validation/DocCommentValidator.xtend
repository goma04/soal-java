package soal.dsl.validation

import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import soal.model.NamedElement
import soal.model.Operation
import soal.model.Parameter
import soal.model.SoalModelPackage

class DocCommentValidator extends AbstractSoalDslValidator {
    override register(EValidatorRegistrar registrar) {
    }

    @Check(NORMAL)
    def checkDocComment(NamedElement elem) {
        if (elem.documentation === null) {
            var name = elem.name
            if (name === null) {
                if (elem instanceof Parameter) {
                    val op = EcoreUtil2.getContainerOfType(elem, typeof(Operation))
                    if (op !== null) {
                        name = "the return value of '"+op.name+"'"
                    }
                }
            } else {
                name = "'"+name+"'"
            }
            warning("There is no documentation comment for "+name, SoalModelPackage.Literals.NAMED_ELEMENT__NAME)
        }
    }

}