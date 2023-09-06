package soal.dsl.ui.hover

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.IInformationControlCreator
import org.eclipse.jface.text.IRegion
import org.eclipse.jface.text.ITextViewer
import org.eclipse.jface.text.Region
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider.IInformationControlCreatorProvider
import org.eclipse.xtext.util.Tuples
import org.eclipse.xtext.xbase.ui.hover.XbaseDispatchingEObjectTextHover

class SoalTextHover extends XbaseDispatchingEObjectTextHover {

    @Inject
    IEObjectHoverProvider hoverProvider

    IInformationControlCreatorProvider lastCreatorProvider = null

    override Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
        lastCreatorProvider = hoverProvider.getHoverInfo(first, textViewer, hoverRegion);
        return lastCreatorProvider === null ? null : lastCreatorProvider.getInfo();
    }

    override IInformationControlCreator getHoverControlCreator() {
        return this.lastCreatorProvider === null ? super.getHoverControlCreator() : lastCreatorProvider.getHoverControlCreator();
    }

    override protected getXtextElementAt(XtextResource resource, int offset) {
        var result = super.getXtextElementAt(resource, offset);
        if (result === null) {
            result = resolveElementAt(resource, offset);
        }
        return result;
    }

    private def resolveElementAt(XtextResource resource, int offset) {
        val parseResult = resource.getParseResult();
        if (parseResult !== null) {
            var leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
            if (leaf !== null) {
                val element = leaf.getGrammarElement();
                return Tuples.create(element, new Region(leaf.getOffset(), leaf.getLength()) as IRegion);
            }
        }
        return null;
    }
}