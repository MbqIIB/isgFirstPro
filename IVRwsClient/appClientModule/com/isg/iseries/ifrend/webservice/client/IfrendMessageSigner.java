package com.isg.iseries.ifrend.webservice.client;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;

import org.springframework.core.io.Resource;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.security.xwss.callback.KeyStoreCallbackHandler;

import com.sun.xml.wss.ProcessingContext;
import com.sun.xml.wss.XWSSProcessor;
import com.sun.xml.wss.XWSSProcessorFactory;

public class IfrendMessageSigner {
	
	    //WebServiceTemplate wsTemplate = new WebServiceTemplate();
	
		private final XWSSProcessor processor;
		 
		  public IfrendMessageSigner(Resource policyFile, KeyStoreCallbackHandler keystoreHandler ) throws Exception {
		 
		    InputStream in = policyFile.getInputStream();
		    XWSSProcessorFactory factory = XWSSProcessorFactory.newInstance();
		    processor = factory.createProcessorForSecurityConfiguration( in, keystoreHandler );
		    in.close();
		  }
		 
		  public WebServiceMessageCallback getCallback() {
		 
		    return       
		      new WebServiceMessageCallback() {
		        public void doWithMessage( WebServiceMessage message ) throws IOException {
		 
	             SaajSoapMessage origSaajMessage = (SaajSoapMessage) message;
	        
	          
	          
		          SOAPMessage origSoapMessage = origSaajMessage.getSaajMessage();
		          
		          try {
		        	  
					//SOAPHeader header = origSoapMessage.getSOAPHeader();
					     
					    SOAPEnvelope envelope = origSoapMessage.getSOAPPart().getEnvelope();
			            SOAPHeader header = envelope.getHeader();                        
			            
			            String NAMESPACE_ECB = "wsse";
			            String NAMESPACE_ECB_STRING = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
			            
			            //authentication
			            header.addNamespaceDeclaration(NAMESPACE_ECB, NAMESPACE_ECB_STRING);
			            SOAPHeaderElement headerElem = header.addHeaderElement(envelope.createName("Security", NAMESPACE_ECB, NAMESPACE_ECB_STRING));
			            headerElem.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
			      	  
			            
			            
			            SOAPElement usernameToken = headerElem.addChildElement("UsernameToken", "wsse");
			            usernameToken.setAttribute("wsu:Id", "token1");
			            
			            String username = "augusto.marte";
			            SOAPElement elem = usernameToken.addChildElement(envelope.createName("Username", NAMESPACE_ECB, NAMESPACE_ECB_STRING));
			            elem.addTextNode(username);
			            System.out.println("Adding username [" + username + "] to SOAP header authentication");

			            String password = "ezekiel@4084";
			            elem = usernameToken.addChildElement(envelope.createName("Password", NAMESPACE_ECB, NAMESPACE_ECB_STRING));
			            elem.addTextNode(password);
			            System.out.println("Adding password [" + password + "] to SOAP header authentication");
					
			            message.writeTo(System.out);
			            
				} catch (SOAPException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		          
		 
		         ProcessingContext context = new ProcessingContext();
		 
		          try {
		            context.setSOAPMessage( origSoapMessage );
		            SOAPMessage securedSoapMessage = processor.secureOutboundMessage( context );
		            origSaajMessage.setSaajMessage( securedSoapMessage );
		          }
		          catch (Exception exc) {
		            exc.printStackTrace();
		            throw new IOException( exc.getMessage() );
		          }
		        }
		      };
		   }


}
