package soal.generator.soap

import java.util.LinkedHashSet
import java.util.Set
import soal.model.BindingKind
import soal.model.Interface
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.Service
import soal.model.analysis.TypeAnalysis

class WsdlGenerator {
    RootSoalModel _model
    boolean _singleFileWsdl
    String _name
    TypeAnalysis _typeAnalysis
    String _targetNamespace
    String _targetPrefix
    String _soapPrefix
    Iterable<Service> _services
    Set<Interface> _interfaces
    XsdGenerator _xsdGenerator

    new (RootSoalModel model, String name, boolean singleFileWsdl) {
        _model = model
        _singleFileWsdl = singleFileWsdl
        _name = name
        _targetNamespace = "http://tempuri.org/TODO/"+name
        _targetPrefix = "tns"
        _soapPrefix = "soap12"
        _typeAnalysis = _model.typeAnalysis
        _services = _model.declarations.filter(Service).filter[it.binding == BindingKind.SOAP]
        _interfaces = new LinkedHashSet<Interface>()
        _interfaces.addAll(_services.map[it.interface])
        _xsdGenerator = new XsdGenerator(_model, name, false)
    }

    def generate() {
        '''
        <?xml version="1.0" encoding="utf-8"?>
        <wsdl:definitions targetNamespace="«_targetNamespace»"
            xmlns:«_targetPrefix»="«_targetNamespace»"
            xmlns:xs="http://www.w3.org/2001/XMLSchema"
            xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
            xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
            xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
            xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl"
        >
            «generateWsdlTypesPart()»

            «generateWsdlAbstractPart()»

            «generateWsdlBindingPart()»

            «generateWsdlEndpointPart()»
        </wsdl:definitions>
        '''
    }

    def generateWsdlTypesPart() {
        '''
        <wsdl:types>
            «IF _singleFileWsdl»
            «_xsdGenerator.generate()»
            «ELSE»
            <xs:schema>
                <xs:import namespace="«_targetNamespace»" schemaLocation="«_name».xsd"/>
            </xs:schema>
            «ENDIF»
        </wsdl:types>
        '''
    }

    def generateWsdlAbstractPart() {
        '''
        «FOR intf: _interfaces»

        «generateWsdlAbstractPart(intf)»
        «ENDFOR»
        '''
    }

    def generateWsdlAbstractPart(Interface intf) {
        '''
        «generateMessages(intf)»

        «generatePortType(intf)»
        '''
    }

    def generateMessages(Interface intf) {
        '''
        «FOR op: _typeAnalysis.getOperations(intf)»
        «generateMessageOperation(intf, op)»
        «ENDFOR»
        '''
    }

    def generateMessageOperation(Interface intf, Operation op) {
        '''
        <wsdl:message name="«intf.name»_«op.name»_InputMessage">
            <wsdl:part name="parameters" element="«_targetPrefix»:«op.name»"/>
        </wsdl:message>
        «IF !op.async»
        <wsdl:message name="«intf.name»_«op.name»_OutputMessage">
            <wsdl:part name="parameters" element="«_targetPrefix»:«op.name»Response"/>
        </wsdl:message>
        «ENDIF»
        «FOR ex: op.exceptions»
        <wsdl:message name="«intf.name»_«op.name»_«ex.name»_FaultMessage">
            <wsdl:part name="parameters" element="«_targetPrefix»:«ex.name»"/>
        </wsdl:message>
        «ENDFOR»
        '''
    }

    def generatePortType(Interface intf) {
        '''
        <wsdl:portType name="«intf.name»">
        	«FOR op: _typeAnalysis.getOperations(intf)»
	        «generatePortTypeOperation(intf, op)»
	        «ENDFOR»
        </wsdl:portType>
        '''
    }

    def generatePortTypeOperation(Interface intf, Operation op) {
        val action = _targetNamespace+"/"+intf.name+"/"+op.name
        '''
        <wsdl:operation name="«op.name»">
            <wsdl:input wsaw:action="«action»" message="«_targetPrefix»:«intf.name»_«op.name»_InputMessage"/>
            «IF !op.async»
            <wsdl:output wsaw:action="«action»Response" message="«_targetPrefix»:«intf.name»_«op.name»_OutputMessage"/>
            «FOR ex: op.exceptions»
            <wsdl:fault wsaw:action="«action»Fault/«ex.name»" message="«_targetPrefix»:«intf.name»_«op.name»_«ex.name»_FaultMessage" name="«ex.name»"/>
            «ENDFOR»
            «ENDIF»
        </wsdl:operation>
        '''
    }

    def generateWsdlBindingPart() {
        '''
        «FOR intf: _interfaces»

        «generateBinding(intf)»
        «ENDFOR»
        '''
    }

    def generateBinding(Interface intf) {
        '''
        <wsdl:binding name="«intf.name»_Binding" type="«_targetPrefix»:«intf.name»">
            <«_soapPrefix»:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        	«FOR op: _typeAnalysis.getOperations(intf)»
            «generateBindingOperation(intf, op)»
	        «ENDFOR»
        </wsdl:binding>
        '''
    }

    def generateBindingOperation(Interface intf, Operation op) {
        val action = _targetNamespace+"/"+intf.name+"/"+op.name
        '''
        <wsdl:operation name="«op.name»">
            <«_soapPrefix»:operation style="document" soapAction="«action»"/>
            <wsdl:input>
                <«_soapPrefix»:body use="literal"/>
            </wsdl:input>
            «IF !op.async»
            <wsdl:output>
                <«_soapPrefix»:body use="literal"/>
            </wsdl:output>
            «FOR ex: op.exceptions»
            <wsdl:fault name="«ex.name»">
                <«_soapPrefix»:fault name="«ex.name»" use="literal"/>
            </wsdl:fault>
            «ENDFOR»
            «ENDIF»
        </wsdl:operation>
        '''
    }

    def generateWsdlEndpointPart() {
        '''
        «FOR service: _services»

        «generateWsdlEndpoint(service)»
        «ENDFOR»
        '''
    }

    def generateWsdlEndpoint(Service service) {
        '''
        <wsdl:service name="«service.name»">
            <wsdl:port name="«service.interface.name»_Port" binding="«_targetPrefix»:«service.interface.name»_Binding">
                <«_soapPrefix»:address location="http://tempuri.org"/>
            </wsdl:port>
        </wsdl:service>
        '''
    }
}