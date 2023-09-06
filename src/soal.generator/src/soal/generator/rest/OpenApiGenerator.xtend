package soal.generator.rest

import soal.generator.InterfaceKind
import soal.model.RootSoalModel

class OpenApiGenerator {
    RootSoalModel _model
    InterfaceKind _interfaceKind
    OpenApiVersion _version

    new (RootSoalModel model, InterfaceKind interfaceKind, OpenApiVersion version) {
        _model = model
        _interfaceKind = interfaceKind
        _version = version
    }

    def generate() {
        switch (_version) {
        case VERSION_3_0:
            return new OpenApiGenerator_3_0(_model, _interfaceKind).generate()
        case VERSION_3_1:
            return new OpenApiGenerator_3_1(_model, _interfaceKind).generate()
        }
    }
}