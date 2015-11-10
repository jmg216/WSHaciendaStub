/**
 * DocumentoFirmaDigitalServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import utiles.UtilesResources;

public class DocumentoFirmaDigitalServiceSoapBindingImpl implements py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint{   	
	
	public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado, java.lang.String cedulaFirmante, java.util.Calendar fechaFirmaCliente) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
		OutputStream os = null;
		try{			
			String filename = UtilesResources.getProperty("WSConfig.destino");
			
			os = new FileOutputStream( filename );
			os.write( postFirmado.getObjetoPdf() );
			os.close();
			
		}
		catch( IOException e ){
			e.printStackTrace();
			throw new WsException();
		}
		 finally {
				try {
					if (os != null) {
						os.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		ResultOperacion resultOperation = new ResultOperacion();
    	System.out.println("************************** Init Servicio Stub::guardarPdfFirmado ************************** ");
    	System.out.println("Tipo documento: " + postFirmado.getTipoDocumento());
    	System.out.println("CÃ©dula: " + cedulaFirmante);    	
    	resultOperation.setCodigo(1);
    	resultOperation.setMsg("Documento guardado correctamente");
    	
        return resultOperation;
    }
	
	

	public void quitarReserva(py.gov.hacienda.digital.doc.DocumentoElectronico arg0) throws java.rmi.RemoteException {
    
	}
	
	

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
    	InputStream inputStream = null;
    	try {
    		System.out.println("************************** Init Servicio Stub::obtenerPdf ************************** ");
    		
    		DocumentoElectronico docElectronico = new DocumentoElectronico();
    		File file = new File( UtilesResources.getProperty("WSConfig.origen") );
    		System.out.println("PDF obtenido: " + file.getAbsolutePath());
	        inputStream = new FileInputStream(file);
	        byte[] bytes = new byte[(int)file.length()];
	        inputStream.read(bytes);    		
	    			
	    	docElectronico.setObjetoPdf(bytes);    		
	        docElectronico.setTipoDocumento("PDF");
	        
	        System.out.println("************************** Fin Servicio Stub::obtenerPdf ************************** ");
	        
	        return docElectronico;
    	}
			catch( IOException e ){
				e.printStackTrace();
				throw new WsException();
				
			}
			finally{
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new WsException();
				}
			}
    }

    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException {
    	InputStream inputStream = null;
    	try {
    		System.out.println("************************** Init Servicio Stub::obtenerPdfParaFirma ************************** ");
			
    		DocumentoElectronico docElectronico = new DocumentoElectronico();
			File file = new File( UtilesResources.getProperty("WSConfig.origen") );			
			System.out.println("PDF obtenido: " + file.getAbsolutePath());
	        inputStream = new FileInputStream(file);
	        byte[] bytes = new byte[(int)file.length()];
	        inputStream.read(bytes);
	    			
	    	docElectronico.setObjetoPdf(bytes);    		
	        docElectronico.setTipoDocumento("PDF");
	        
	        System.out.println("************************** Fin Servicio Stub::obtenerPdfParaFirma ************************** ");
	        
	        return docElectronico;
    	}
			catch( IOException e ){
				e.printStackTrace();
				throw new WsException();
				
			}
			finally{
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    }

}
