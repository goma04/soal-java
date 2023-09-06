package soal.generator.rest

import soal.generator.InterfaceKind
import soal.model.BindingKind
import soal.model.Operation
import soal.model.OperationKind
import soal.model.Resource
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.Type
import soal.model.Variable
import soal.model.analysis.TypeAnalysis

abstract class OpenApiGenerator_3 {
    static String[] s_contentTypes = #[ "application/json" ]
    static String s_textPlain = "text/plain"

    RootSoalModel _model
    InterfaceKind _interfaceKind
    TypeAnalysis _typeAnalysis
    Iterable<Service> _services

    new (RootSoalModel model, InterfaceKind interfaceKind) {
        _model = model
        _interfaceKind = interfaceKind
        _typeAnalysis = _model.typeAnalysis
        _services = _model.declarations.filter(Service).filter[it.binding == BindingKind.REST]
    }

    def getModel() {
        _model
    }

    def getTypeAnalysis() {
        _typeAnalysis
    }

    def getServices() {
        _services
    }

    def getDeclarations() {
        _model.declarations
    }

    abstract def String generateOpenApiVersion();
    abstract def String generateSchema();
    abstract def String generateTypeRef(Type type);

    def generate() {
        '''
        «generateHeader()»
        «generateTags()»
        «generateServices()»
        «generateSchema()»
        '''
    }

    def generateHeader() {
        '''
        openapi: '«generateOpenApiVersion()»'
        «IF _interfaceKind.server»
        servers:
        - url: https://tempuri.org
          description: A szolgáltatás végpontja.
        «ELSE»
        servers:
        - url: https://gw.kkszb.gov.hu
          description: A KKSZB rendszerben értelmezett HTTP szolgáltatási végpont.
        «ENDIF»
        info:
          description: TODO
          version: "1.0.0"
          title: TODO
          contact:
            email: you@your-company.com
          license:
            name: Apache 2.0
            url: 'http://www.apache.org/licenses/LICENSE-2.0.html'
        '''
    }

    def generateTags() {
        '''
        tags:
        «FOR service: _services»
        - name: '«service.name»'
          description: TODO
        «FOR operation: service.interface.operations»
        - name: '«service.name»/«operation.name»'
          description: TODO
        «ENDFOR»
        «FOR resource: service.interface.resources»
        - name: '«service.name»/«resource.name»'
          description: TODO
        «ENDFOR»
        «ENDFOR»
        '''
    }

    def generateServices() {
        '''
        paths:
          «FOR service: _services»
            «FOR operation: service.interface.operations»
            «generateOperation(service, operation)»
            «ENDFOR»
            «FOR resource: service.interface.resources»
            «generateResource(service, resource)»
            «ENDFOR»
          «ENDFOR»
        '''
    }

    def generateOperation(Service service, Operation operation) {
        '''
        '/«service.name»/«operation.name»':
          post:
            operationId: '«service.name»/«operation.name»'
            summary: TODO
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«operation.name»'
            «IF operation.hasRequestParameters»
            requestBody:
              content:
                «FOR contentType: s_contentTypes»
                '«contentType»':
                  schema:
                    type: object
                    «IF operation.requestParameters !== null»
                    «generateProperties(operation.requestParameters.parameters, false)»
                    «ENDIF»
                «ENDFOR»
            «ENDIF»
            «IF operation.async»
            responses:
              '200':
                description: "Accepted. A szolgáltatás az aszinkron kérést befogadta, és elkezdte feldolgozni."
            «ELSE»
            responses:
              '200':
                description: OK
                content:
                  «FOR contentType: s_contentTypes»
                  '«contentType»':
                    schema:
                      type: object
                      «IF operation.responseParameters !== null && operation.responseParameters.parameters.size > 0»
                        «val firstParam = operation.responseParameters.parameters.get(0)»
                        «IF operation.responseParameters.parameters.size == 1 && firstParam.name === null»
                        required:
                        - result
                        properties:
                          result:
                          «generateTypeRef(firstParam.type)»
                        «ELSE»
                        «generateProperties(operation.responseParameters.parameters, false)»
                        «ENDIF»
                      «ENDIF»
                  «ENDFOR»
              «generateOperationErrors(operation)»
            «ENDIF»
        '''
    }

    private def generateOperationErrors(Operation operation) {
        '''
        «FOR error: _typeAnalysis.getErrors(operation)»
        '«error.errorCode»':
          description: "«error.description»"
          «IF error.hasBody»
          content:
            «IF error.allExceptions.size > 0»
            «FOR contentType: s_contentTypes»
            '«contentType»':
              schema:
                «IF error.singleException !== null»
                $ref: '#/components/schemas/«error.singleException.name»'
                «ELSE»
                oneOf:
                «FOR ex: error.allExceptions»
                - $ref: '#/components/schemas/«ex.name»'
                «ENDFOR»
                «ENDIF»
            «ENDFOR»
            «ENDIF»
          «ENDIF»
        «ENDFOR»
        '''
    }

    def generateResource(Service service, Resource resource) {
        val getAll = _typeAnalysis.getOperation(resource, OperationKind.GET_ALL)
        val get = _typeAnalysis.getOperation(resource, OperationKind.GET)
        val insert = _typeAnalysis.getOperation(resource, OperationKind.INSERT)
        val update = _typeAnalysis.getOperation(resource, OperationKind.UPDATE)
        val delete = _typeAnalysis.getOperation(resource, OperationKind.DELETE)
        '''
        '/«service.name»/«resource.name»':
          get:
            operationId: '«service.name»/«getAll.name»'
            summary: TODO
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«resource.name»'
            responses:
              '200':
                description: OK
                content:
                  «FOR contentType: s_contentTypes»
                  '«contentType»':
                    schema:
                      type: array
                      items:
                        type: integer
                        format: int64
                  «ENDFOR»
              «generateOperationErrors(getAll)»
          «IF !resource.readonly»
          post:
            operationId: '«service.name»/«insert.name»'
            summary: TODO
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«resource.name»'
            requestBody:
              content:
                «FOR contentType: s_contentTypes»
                '«contentType»':
                  schema:
                    $ref: '#/components/schemas/«resource.name»'
                «ENDFOR»
            responses:
              '200':
                description: OK
                content:
                  «FOR contentType: s_contentTypes»
                  '«contentType»':
                    schema:
                      type: object
                      required:
                      - id
                      properties:
                        id:
                          type: integer
                          format: int64
                  «ENDFOR»
              «generateOperationErrors(insert)»
          «ENDIF»
        '/«service.name»/«resource.name»/{id}':
          get:
            operationId: '«service.name»/«get.name»'
            summary: TODO
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«resource.name»'
            parameters:
            - name: id
              in: path
              required: true
              schema:
                type: integer
                format: int64
            responses:
              '200':
                description: OK
                content:
                  «FOR contentType: s_contentTypes»
                  '«contentType»':
                    schema:
                      $ref: '#/components/schemas/«resource.name»'
                  «ENDFOR»
              «generateOperationErrors(get)»
          «IF !resource.readonly»
          put:
            summary: TODO
            operationId: '«service.name»/«update.name»'
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«resource.name»'
            parameters:
            - name: id
              in: path
              required: true
              schema:
                type: integer
                format: int64
            requestBody:
              content:
                «FOR contentType: s_contentTypes»
                '«contentType»':
                  schema:
                    $ref: '#/components/schemas/«resource.name»'
                «ENDFOR»
            responses:
              '200':
                description: OK
              «generateOperationErrors(update)»
          delete:
            operationId: '«service.name»/«delete.name»'
            summary: TODO
            description: TODO
            tags:
            - '«service.name»'
            - '«service.name»/«resource.name»'
            parameters:
            - name: id
              in: path
              required: true
              schema:
                type: integer
                format: int64
            responses:
              '200':
                description: OK
                content:
                  «FOR contentType: s_contentTypes»
                  '«contentType»':
                    schema:
                      $ref: '#/components/schemas/«resource.name»'
                  «ENDFOR»
              «generateOperationErrors(update)»
          «ENDIF»
        '''
    }


    def generateProperties(Iterable<? extends Variable> properties, boolean includeTypeDiscriminator) {
        '''
        «IF properties.size > 0 || includeTypeDiscriminator»
        required:
        «IF includeTypeDiscriminator»
        - _type
        «ENDIF»
        properties:
          «IF includeTypeDiscriminator»
          _type:
            type: string
          «ENDIF»
          «FOR property: properties»
          «property.name»:
          «generateTypeRef(property.type)»
          «ENDFOR»
        «ENDIF»
        '''
    }

}