package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.RootSoalModel
import soal.model.Service

class RestClientGenerator extends RestGeneratorBase {

    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def List<GeneratedFile> generateAll() {
        val result = newArrayList
        for (service : services) {
            result.add(new GeneratedFile(parentName+"/rest/client", service.name+"Client.java", generateClient(service), true))
        }
        return result
    }

    def generateClient(Service service) {
        '''
        package «parentName».rest.client;

        import java.util.Collections;

        import org.springframework.http.HttpHeaders;
        import org.springframework.http.MediaType;
        import org.springframework.web.reactive.function.client.WebClient;
        import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
        import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
        import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
        import org.springframework.web.reactive.function.client.WebClient.UriSpec;

        import «parentName».common.«service.interface.name»;
        «FOR op: typeAnalysis.getOperations(service.interface)»
        import «parentName».rest.common.«op.name»Request;
        import «parentName».rest.common.«op.name»Response;
        «ENDFOR»
        «FOR type: typeAnalysis.getUsedTypes(service.interface)»
        import «parentName».common.«generateTypeRef(type, false)»;
        «ENDFOR»

        import reactor.core.publisher.Mono;

        public class «service.name»Client implements «service.interface.name», AutoCloseable {
            private String _baseUrl;
            private WebClient _client;

            public «service.name»Client(String baseUrl) {
                _baseUrl = baseUrl;
            }

            private synchronized WebClient getClient() {
                if (_client == null) {
                    _client =
                        WebClient.builder()
                          .baseUrl(_baseUrl)
                          .defaultCookie("cookieKey", "cookieValue")
                          .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                          .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                          .defaultHeader(HttpHeaders.ACCEPT_CHARSET, "utf-8")
                          .defaultUriVariables(Collections.singletonMap("url", _baseUrl))
                          .build();
                }
                return _client;
            }

            «FOR op: typeAnalysis.getOperations(service.interface)»
            @Override
            public «generateOperationSignature(service.interface, op)» {
                «op.name»Request __request = new «op.name»Request();
                «IF op.hasRequestParameters»
                    «FOR param: op.requestParameters.parameters»
                        «IF param.type.isCustomType»
                        __request.«param.name.toSetterName»(«parentName».rest.common.«generateTypeRef(param.type, false)».fromCommon(«param.name.toCamelCase»));
                        «ELSE»
                        __request.«param.name.toSetterName»(«param.name.toCamelCase»);
                        «ENDIF»
                    «ENDFOR»
                «ENDIF»
                UriSpec<RequestBodySpec> __uriSpec = getClient().post();
                RequestBodySpec __bodySpec = __uriSpec.uri("/«service.name»/«op.name»");
                RequestHeadersSpec<?> __headersSpec = __bodySpec.bodyValue(__request);
                ResponseSpec __responseSpec = __headersSpec.retrieve();
                Mono<«op.name»Response> __mono = __responseSpec.bodyToMono(«op.name»Response.class);
                «op.name»Response __response = __mono.block();
                «IF !op.hasResponseParameters»
                «ELSEIF op.hasSingleResponseParameter»
                    «IF op.singleReturnType.isCustomType»
                    «parentName».rest.common.«generateTypeRef(op.singleReturnType, false)» __result = __response.getResult();
                    return __result.toCommon();
                    «ELSE»
                    «generateTypeRef(op.singleReturnType, false)» __result = __response.getResult();
                    return __result;
                    «ENDIF»
                «ELSE»
                    TODO: Multiple return parameters.
                «ENDIF»
            }

            «ENDFOR»

            @Override
            public void close() throws Exception {
            }
        }
        '''
    }
}