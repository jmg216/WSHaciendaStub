/**
 * DocumentoFirmaDigitalServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class DocumentoFirmaDigitalServiceSoapBindingStub extends org.apache.axis.client.Stub implements py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("guardarPdfFirmado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postFirmado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"), py.gov.hacienda.digital.doc.DocumentoElectronico.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedulaFirmante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fechaFirmaCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "resultOperacion"));
        oper.setReturnClass(py.gov.hacienda.digital.doc.ResultOperacion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultPdfFirmado"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"),
                      "py.gov.hacienda.digital.doc.WsException",
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("quitarReserva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"), py.gov.hacienda.digital.doc.DocumentoElectronico.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerPdfParaValidar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaParametros"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor"), py.gov.hacienda.digital.doc.CampoTipoValor[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        oper.setReturnClass(py.gov.hacienda.digital.doc.DocumentoElectronico.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultPdfParaValidar"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"),
                      "py.gov.hacienda.digital.doc.WsException",
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerPdfParaFirma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaParametros"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor"), py.gov.hacienda.digital.doc.CampoTipoValor[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cedulaFirmante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        oper.setReturnClass(py.gov.hacienda.digital.doc.DocumentoElectronico.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resultPdfParaFirma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"),
                      "py.gov.hacienda.digital.doc.WsException",
                      new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public DocumentoFirmaDigitalServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DocumentoFirmaDigitalServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DocumentoFirmaDigitalServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor");
            cachedSerQNames.add(qName);
            cls = py.gov.hacienda.digital.doc.CampoTipoValor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico");
            cachedSerQNames.add(qName);
            cls = py.gov.hacienda.digital.doc.DocumentoElectronico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "resultOperacion");
            cachedSerQNames.add(qName);
            cls = py.gov.hacienda.digital.doc.ResultOperacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "tipoDato");
            cachedSerQNames.add(qName);
            cls = py.gov.hacienda.digital.doc.TipoDato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "WsException");
            cachedSerQNames.add(qName);
            cls = py.gov.hacienda.digital.doc.WsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado, java.lang.String cedulaFirmante, java.util.Calendar fechaFirmaCliente) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "guardarPdfFirmado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {postFirmado, cedulaFirmante, fechaFirmaCliente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (py.gov.hacienda.digital.doc.ResultOperacion) _resp;
            } catch (java.lang.Exception _exception) {
                return (py.gov.hacienda.digital.doc.ResultOperacion) org.apache.axis.utils.JavaUtils.convert(_resp, py.gov.hacienda.digital.doc.ResultOperacion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof py.gov.hacienda.digital.doc.WsException) {
              throw (py.gov.hacienda.digital.doc.WsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void quitarReserva(py.gov.hacienda.digital.doc.DocumentoElectronico arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "quitarReserva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaValidar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tipoDocumento, listaParametros});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (py.gov.hacienda.digital.doc.DocumentoElectronico) _resp;
            } catch (java.lang.Exception _exception) {
                return (py.gov.hacienda.digital.doc.DocumentoElectronico) org.apache.axis.utils.JavaUtils.convert(_resp, py.gov.hacienda.digital.doc.DocumentoElectronico.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof py.gov.hacienda.digital.doc.WsException) {
              throw (py.gov.hacienda.digital.doc.WsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaFirma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tipoDocumento, listaParametros, cedulaFirmante});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (py.gov.hacienda.digital.doc.DocumentoElectronico) _resp;
            } catch (java.lang.Exception _exception) {
                return (py.gov.hacienda.digital.doc.DocumentoElectronico) org.apache.axis.utils.JavaUtils.convert(_resp, py.gov.hacienda.digital.doc.DocumentoElectronico.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof py.gov.hacienda.digital.doc.WsException) {
              throw (py.gov.hacienda.digital.doc.WsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
