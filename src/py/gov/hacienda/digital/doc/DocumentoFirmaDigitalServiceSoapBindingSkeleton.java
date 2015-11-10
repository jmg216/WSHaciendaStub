/**
 * DocumentoFirmaDigitalServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class DocumentoFirmaDigitalServiceSoapBindingSkeleton implements py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint, org.apache.axis.wsdl.Skeleton {
    private py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postFirmado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"), py.gov.hacienda.digital.doc.DocumentoElectronico.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedulaFirmante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaFirmaCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("guardarPdfFirmado", _params, new javax.xml.namespace.QName("", "resultPdfFirmado"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "resultOperacion"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "guardarPdfFirmado"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("guardarPdfFirmado") == null) {
            _myOperations.put("guardarPdfFirmado", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("guardarPdfFirmado")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("WsException");
        _fault.setQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _fault.setClassName("py.gov.hacienda.digital.doc.WsException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"), py.gov.hacienda.digital.doc.DocumentoElectronico.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("quitarReserva", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "quitarReserva"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("quitarReserva") == null) {
            _myOperations.put("quitarReserva", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("quitarReserva")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaParametros"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor"), py.gov.hacienda.digital.doc.CampoTipoValor[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obtenerPdfParaValidar", _params, new javax.xml.namespace.QName("", "resultPdfParaValidar"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaValidar"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obtenerPdfParaValidar") == null) {
            _myOperations.put("obtenerPdfParaValidar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obtenerPdfParaValidar")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("WsException");
        _fault.setQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _fault.setClassName("py.gov.hacienda.digital.doc.WsException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaParametros"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor"), py.gov.hacienda.digital.doc.CampoTipoValor[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedulaFirmante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obtenerPdfParaFirma", _params, new javax.xml.namespace.QName("", "resultPdfParaFirma"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaFirma"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obtenerPdfParaFirma") == null) {
            _myOperations.put("obtenerPdfParaFirma", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obtenerPdfParaFirma")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("WsException");
        _fault.setQName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _fault.setClassName("py.gov.hacienda.digital.doc.WsException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"));
        _oper.addFault(_fault);
    }

    public DocumentoFirmaDigitalServiceSoapBindingSkeleton() {
        this.impl = new py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceSoapBindingImpl();
    }

    public DocumentoFirmaDigitalServiceSoapBindingSkeleton(py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint impl) {
        this.impl = impl;
    }
    public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado, java.lang.String cedulaFirmante, java.util.Calendar fechaFirmaCliente) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException
    {
        py.gov.hacienda.digital.doc.ResultOperacion ret = impl.guardarPdfFirmado(postFirmado, cedulaFirmante, fechaFirmaCliente);
        return ret;
    }

    public void quitarReserva(py.gov.hacienda.digital.doc.DocumentoElectronico arg0) throws java.rmi.RemoteException
    {
        impl.quitarReserva(arg0);
    }

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException
    {
        py.gov.hacienda.digital.doc.DocumentoElectronico ret = impl.obtenerPdfParaValidar(tipoDocumento, listaParametros);
        return ret;
    }

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException
    {
        py.gov.hacienda.digital.doc.DocumentoElectronico ret = impl.obtenerPdfParaFirma(tipoDocumento, listaParametros, cedulaFirmante);
        return ret;
    }

}
