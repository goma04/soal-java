package soal.generator

import java.util.LinkedHashSet
import java.util.Set
import soal.model.Interface
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.analysis.TypeAnalysis

class GeneratorBase {
    RootSoalModel _model
    String _name
    TypeAnalysis _typeAnalysis
    Set<Service> _services
    Set<Interface> _interfaces

    new (RootSoalModel model, String name) {
        _model = model
        _name = name
        _typeAnalysis = _model.typeAnalysis
        _services = new LinkedHashSet<Service>()
        _services.addAll(_model.declarations.filter(Service))
        _interfaces = new LinkedHashSet<Interface>()
        _interfaces.addAll(_services.map[it.interface])
    }
    	
    def getModel() { _model }	
    def getName() { _name }	
    def getTypeAnalysis() { _typeAnalysis }	
    def getInterfaces() { _interfaces }	
    def getServices() { _services }	
}