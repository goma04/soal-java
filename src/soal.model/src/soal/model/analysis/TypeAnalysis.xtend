package soal.model.analysis

import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map
import java.util.Set
import org.eclipse.xtext.EcoreUtil2
import soal.model.ArrayType
import soal.model.BuiltInType
import soal.model.EnumType
import soal.model.Interface
import soal.model.NamedType
import soal.model.NullableType
import soal.model.Operation
import soal.model.OperationKind
import soal.model.Resource
import soal.model.RootSoalModel
import soal.model.SoalModelFactory
import soal.model.StructType
import soal.model.Type

class TypeAnalysis {
    RootSoalModel _model
    Set<NamedType> _nullableTypes
    Set<StructType> _structTypes
    Set<EnumType> _enumTypes
    Map<StructType, Set<StructType>> _baseTypes
    Map<StructType, Set<StructType>> _descendantTypes
    Map<Interface, Set<Operation>> _interfaceOperations
    Map<Interface, Set<Type>> _interfaceUsedTypes
    Map<Resource, Set<Operation>> _resourceOperations
    Map<Operation, Set<ErrorInfo>> _operationErrors

    new (RootSoalModel model) {
        _model = model
    }

    def static Type getInnermostType(Type type) {
        if (type instanceof NullableType) return (type as NullableType).innerType.innermostType
        else if (type instanceof ArrayType) return (type as ArrayType).innerType.innermostType
        else return type;
    }

    def getNullableTypes() {
        if (_nullableTypes === null) computeNullableTypes()
        return _nullableTypes
    }

    def Set<EnumType> getEnumTypes() {
        if (_enumTypes === null) computeEnumTypes()
        return _enumTypes
    }

    def Set<StructType> getStructTypes() {
        if (_structTypes === null) computeStructTypes()
        return _structTypes
    }

    def Set<StructType> getBaseTypes(StructType type) {
        if (_baseTypes === null) computeBaseTypes()
        return _baseTypes.get(type)
    }

    def Set<StructType> getDescendantTypes(StructType type) {
        if (_descendantTypes === null) computeDescendantTypes()
        return _descendantTypes.get(type)
    }

    def Set<Operation> getOperations(Interface intf) {
        if (_interfaceOperations === null) computeInterfaceOperations()
        return _interfaceOperations.get(intf)
    }

    def Set<Type> getUsedTypes(Interface intf) {
        if (_interfaceUsedTypes === null) computeInterfaceOperations()
        return _interfaceUsedTypes.get(intf)
    }

    def Set<Operation> getOperations(Resource resource) {
        if (_resourceOperations === null) computeResourceOperations()
        return _resourceOperations.get(resource)
    }

    def Operation getOperation(Resource resource, OperationKind kind) {
        if (_resourceOperations === null) computeResourceOperations()
        val ops = _resourceOperations.get(resource)
        return ops.findFirst[it.kind == kind]
    }

    def Set<ErrorInfo> getErrors(Operation operation) {
        if (_operationErrors === null) {
            _operationErrors = new LinkedHashMap
        }
        if (!_operationErrors.containsKey(operation)) {
            _operationErrors.put(operation, makeErrors(operation))
        }
        return _operationErrors.get(operation)
    }

    private def computeNullableTypes() {
        if (_nullableTypes !== null) return;
        _nullableTypes = new LinkedHashSet
        for (soalModel: _model.models) {
            val nullables = EcoreUtil2.getAllContentsOfType(soalModel, NullableType)
            for (nullable: nullables) {
                if (nullable.innerType instanceof NamedType) {
                    _nullableTypes.add(nullable.innerType as NamedType)
                    if (nullable.innerType instanceof StructType) {
                        val struct = nullable.innerType as StructType
                        val descendants = this.getDescendantTypes(struct)
                        _nullableTypes.addAll(descendants)
                    }
                }
            }
        }
    }

    private def computeEnumTypes() {
        if (_enumTypes !== null) return;
        _enumTypes = new LinkedHashSet
        for (soalModel: _model.models) {
            val enumTypes = soalModel.declarations.filter(EnumType)
            _enumTypes.addAll(enumTypes)
        }
    }

    private def computeStructTypes() {
        if (_structTypes !== null) return;
        _structTypes = new LinkedHashSet
        for (soalModel: _model.models) {
            val structTypes = soalModel.declarations.filter(StructType)
            _structTypes.addAll(structTypes)
        }
    }

    private def computeBaseTypes() {
        if (_baseTypes !== null) return;
        _baseTypes = new LinkedHashMap
        for (struct: structTypes) {
             val currentBases = newArrayList
             var first = true
             var i = 0
             while (first || i < currentBases.size) {
                 var currentStruct = struct
                 if (first) {
                     first = false
                 } else {
                     currentStruct = currentBases.get(i++)
                 }
                 val currentBase = currentStruct.baseType
                 if (currentBase !== null && !currentBases.contains(currentBase)) {
                     currentBases.add(currentBase)
                 }
             }
             val bases = newLinkedHashSet
             bases.addAll(currentBases)
             _baseTypes.put(struct, bases)
        }
    }

    private def computeDescendantTypes() {
        if (_descendantTypes !== null) return;
        _descendantTypes = new LinkedHashMap
        for (struct: structTypes) {
            val currentDescendants = newLinkedHashSet
            for (descendant: structTypes) {
                val bases = this.getBaseTypes(descendant)
                if (bases.contains(struct)) {
                    currentDescendants.add(descendant)
                }
            }
            _descendantTypes.put(struct, currentDescendants)
        }
    }

    private def computeInterfaceOperations() {
        if (_interfaceOperations !== null) return;
        _interfaceOperations = new LinkedHashMap
        _interfaceUsedTypes = new LinkedHashMap
        for (intf: _model.declarations.filter(Interface)) {
            val currentOps = newLinkedHashSet
            currentOps.addAll(intf.operations)
            for (res: intf.resources) {
                currentOps.addAll(getOperations(res))
            }
            _interfaceOperations.put(intf, currentOps)
            val currentTypes = newLinkedHashSet
            for (op: currentOps) {
                if (op.hasRequestParameters) {
                    for (param: op.requestParameters.parameters) {
                        val type = param.type.innermostType
                        if (!(type instanceof BuiltInType)) {
                            currentTypes.add(param.type.innermostType)
                        }
                    }
                }
                if (op.hasResponseParameters) {
                    for (param: op.responseParameters.parameters) {
                        val type = param.type.innermostType
                        if (!(type instanceof BuiltInType)) {
                            currentTypes.add(param.type.innermostType)
                        }
                    }
                }
            }
            _interfaceUsedTypes.put(intf, currentTypes)
        }
    }

    private def computeResourceOperations() {
        if (_resourceOperations !== null) return;
        _resourceOperations = new LinkedHashMap
        for (intf: _model.declarations.filter(Interface)) {
            for (res: intf.resources) {
                val currentOps = newLinkedHashSet
                currentOps.add(createGetAll(res))
                currentOps.add(createGet(res))
                if (!res.readonly) {
                    currentOps.add(createInsert(res))
                    currentOps.add(createUpdate(res))
                    currentOps.add(createDelete(res))
                }
                _resourceOperations.put(res, currentOps)
            }
        }
    }

    private def createGetAll(Resource res) {
        val factory = SoalModelFactory.eINSTANCE;
        val op = factory.createOperation
        op.name = "GetAll"+res.name
        op.kind = OperationKind.GET_ALL
        op.resource = res
        op.requestParameters = factory.createParameterList
        op.responseParameters = factory.createParameterList
        val result = factory.createParameter
        val intArray = factory.createReferenceArrayType
        intArray.innerType = _model.globalModel.intType
        result.typeReference = intArray
        op.responseParameters.parameters.add(result)
        op.exceptions.addAll(res.exceptions)
        return op
    }

    private def createGet(Resource res) {
        val factory = SoalModelFactory.eINSTANCE;
        val op = factory.createOperation
        op.name = "Get"+res.name
        op.kind = OperationKind.GET
        op.resource = res
        op.requestParameters = factory.createParameterList
        val id = factory.createParameter
        id.name = "id"
        val intRef = factory.createSimpleTypeReference
        intRef.referencedType = _model.globalModel.intType
        id.typeReference = intRef
        op.requestParameters.parameters.add(id)
        op.responseParameters = factory.createParameterList
        val result = factory.createParameter
        val entityRef = factory.createSimpleTypeReference
        entityRef.referencedType = res.entity
        result.typeReference = entityRef
        op.responseParameters.parameters.add(result)
        op.exceptions.addAll(res.exceptions)
        return op
    }

    private def createInsert(Resource res) {
        val factory = SoalModelFactory.eINSTANCE;
        val op = factory.createOperation
        op.name = "Insert"+res.name
        op.kind = OperationKind.INSERT
        op.resource = res
        op.requestParameters = factory.createParameterList
        val entity = factory.createParameter
        entity.name = "entity"
        val entityRef = factory.createSimpleTypeReference
        entityRef.referencedType = res.entity
        entity.typeReference = entityRef
        op.requestParameters.parameters.add(entity)
        op.responseParameters = factory.createParameterList
        op.exceptions.addAll(res.exceptions)
        return op
    }

    private def createUpdate(Resource res) {
        val factory = SoalModelFactory.eINSTANCE;
        val op = factory.createOperation
        op.name = "Update"+res.name
        op.kind = OperationKind.UPDATE
        op.resource = res
        op.requestParameters = factory.createParameterList
        val id = factory.createParameter
        id.name = "id"
        val intRef = factory.createSimpleTypeReference
        intRef.referencedType = _model.globalModel.intType
        id.typeReference = intRef
        op.requestParameters.parameters.add(id)
        val entity = factory.createParameter
        entity.name = "entity"
        val entityRef = factory.createSimpleTypeReference
        entityRef.referencedType = res.entity
        entity.typeReference = entityRef
        op.requestParameters.parameters.add(entity)
        op.responseParameters = factory.createParameterList
        op.exceptions.addAll(res.exceptions)
        return op
    }

    private def createDelete(Resource res) {
        val factory = SoalModelFactory.eINSTANCE;
        val op = factory.createOperation
        op.name = "Delete"+res.name
        op.kind = OperationKind.DELETE
        op.resource = res
        op.requestParameters = factory.createParameterList
        val id = factory.createParameter
        id.name = "id"
        val intRef = factory.createSimpleTypeReference
        intRef.referencedType = _model.globalModel.intType
        id.typeReference = intRef
        op.requestParameters.parameters.add(id)
        op.responseParameters = factory.createParameterList
        val result = factory.createParameter
        val entityRef = factory.createSimpleTypeReference
        entityRef.referencedType = res.entity
        result.typeReference = entityRef
        op.responseParameters.parameters.add(result)
        op.exceptions.addAll(res.exceptions)
        return op
    }

    private def makeErrors(Operation operation) {
        val result = new LinkedHashSet
        result.add(new ErrorInfo(404, "Not found", null, this))
        result.add(new ErrorInfo(400, "Client error", operation.exceptions, this))
        result.add(new ErrorInfo(500, "Server error", operation.exceptions, this))
        return result
    }
}