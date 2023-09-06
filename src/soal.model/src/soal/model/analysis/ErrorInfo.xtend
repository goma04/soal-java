package soal.model.analysis

import java.util.LinkedHashSet
import java.util.Set
import soal.model.StructType

class ErrorInfo {
    int _errorCode
    String _description
    Set<StructType> _exceptions
    TypeAnalysis _typeAnalysis
    Set<StructType> _allExceptions

    new (int errorCode, String description, Iterable<StructType> exceptions, TypeAnalysis typeAnalysis) {
        _errorCode = errorCode
        _description = description
        _exceptions = new LinkedHashSet()
        if (exceptions !== null) _exceptions.addAll(exceptions)
        _typeAnalysis = typeAnalysis
    }

    def getErrorCode() { _errorCode }
    def getDescription() { _description }
    def getExceptions() { _exceptions }
    def hasBody() { exceptions.size > 0 }

    def getAllExceptions() {
        if (_allExceptions === null) {
            _allExceptions = new LinkedHashSet
            for (ex: _exceptions) {
                _allExceptions.add(ex)
                _allExceptions.addAll(_typeAnalysis.getDescendantTypes(ex))
            }
        }
        return _allExceptions
    }

    def getSingleException() {
        return allExceptions.size == 1 ? allExceptions.findFirst[true] : null
    }
}