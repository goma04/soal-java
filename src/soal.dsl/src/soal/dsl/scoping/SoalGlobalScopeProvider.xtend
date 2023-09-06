package soal.dsl.scoping

import com.google.common.base.Predicate
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.ArrayList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import soal.model.GlobalSoalModel
import soal.model.SoalModelUtils

class SoalGlobalScopeProvider extends DefaultGlobalScopeProvider {
	@Inject 
	Provider<XtextResourceSet> resourceSetProvider;

	ArrayList<IEObjectDescription> descriptions;
	
	override getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {
		val resourceSet = resourceSetProvider.get()
		val globalModel = SoalModelUtils.getGlobalModel(resourceSet)
		val desc = getBuiltInDescriptions(globalModel)
		return new SimpleScope(super.getScope(context, reference, filter), desc)
	}
	
	private def ArrayList<IEObjectDescription> getBuiltInDescriptions(GlobalSoalModel globalModel) {
		if (descriptions === null) {
			descriptions = newArrayList
			for (decl: globalModel.builtInTypes) {
				descriptions.add(EObjectDescription.create(QualifiedName.create(decl.name), decl))
			}
		}
		return descriptions
	}

}