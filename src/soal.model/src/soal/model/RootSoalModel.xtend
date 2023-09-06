package soal.model

import java.util.LinkedHashSet
import java.util.Set
import soal.model.analysis.TypeAnalysis

class RootSoalModel {
    GlobalSoalModel _globalModel
    Set<SoalModel> _models
    Set<Declaration> _declarations
    TypeAnalysis _typeAnalysis

    new (GlobalSoalModel globalModel, Iterable<SoalModel> models) {
        this._globalModel = globalModel
        this._models = new LinkedHashSet<SoalModel>()
        this._models.addAll(models)
    }

    def getGlobalModel() { _globalModel }
    def getModels() { _models }

    def getDeclarations() {
        if (_declarations === null) {
            val allDeclarations = new LinkedHashSet()
            for (model: _models) {
                allDeclarations.addAll(_globalModel.builtInTypes)
                allDeclarations.addAll(model.declarations)
            }
            _declarations = new LinkedHashSet(allDeclarations.sortWith([a, b | a.name === null ? -1 : a.name.compareTo(b.name)]))
        }
        return _declarations
    }

    def getTypeAnalysis() {
        if (_typeAnalysis === null) {
            _typeAnalysis = new TypeAnalysis(this)
        }
        return _typeAnalysis
    }
}
