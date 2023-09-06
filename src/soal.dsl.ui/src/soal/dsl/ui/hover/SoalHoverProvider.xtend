package soal.dsl.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import soal.model.NamedElement

class SoalHoverProvider extends DefaultEObjectHoverProvider {

    override protected getHoverInfoAsHtml(EObject o) {
        if (o instanceof NamedElement) {
            val ne = o as NamedElement
            val doc = ne.hoverDocumentation
            return doc
        }
        return null
    }

}