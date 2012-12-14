package com.isg.iseries.ifrend.webservice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.core.io.Resource;
import org.springframework.ws.client.core.SourceExtractor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.xml.transform.ResourceSource;

public class WebserviceClientGateway extends WebServiceGatewaySupport {

	IfrendMessageSigner messageSigner = null;

	Resource defaultRequest=null;
	
	public void callService() throws IOException{
			    //callService( defaultRequest );
		customSendAndReceive(getRequestMesg());
			    
	}
		
	@SuppressWarnings("unchecked")
	public void callService( Resource request ) throws IOException{
			 
	    Source requestSource = new ResourceSource( request );
			 
			    try{
			 
			      getWebServiceTemplate().sendSourceAndReceive(
			          requestSource,
			          messageSigner.getCallback(),
			          new MySourceExtractor() );        
			    }
			    catch( SoapFaultClientException e ){
			      // error handling
			    }
			  }
			 
			  public class MySourceExtractor implements SourceExtractor{
			    public Object extractData( Source src ) throws IOException, TransformerException {
			 
			    DOMSource dom = (DOMSource) src;
			    System.out.println(dom.toString());
			      // process response     
			      return null; // processed response;
			    }
			  }
	
	 public String getRequestMesg(){		  
		 String mesg=null;
		 try {
			InputStream is = defaultRequest.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = reader.readLine()) !=null){
				sb.append(line);
			}
			mesg=sb.toString();
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 return mesg;
	 }
			  
	  public void customSendAndReceive(String requestMesg) {
		  System.out.println(requestMesg);
		   String msg = "<sch:ProcessCallRequest xmlns:sch=\"http://isg.com/ifrend/schemas\">"+
	         			"<sch:cardNumber>4321-4321-4321-4321</sch:cardNumber>" + 
	         			"<sch:csrId>admin</sch:csrId><sch:pid>1010</sch:pid>" +
	         			"</sch:ProcessCallRequest>";
	        StreamSource source = new StreamSource(new StringReader(requestMesg));
	        StreamResult result = new StreamResult(System.out);
	        getWebServiceTemplate().sendSourceAndReceiveToResult(source, messageSigner.getCallback(), result);
	        
	        //getWebServiceTemplate().sendSourceAndReceiveToResult("http://localhost:9090/iseries/ws/processCallService/",
	        //    source, result);
	    }		  
			  
			  
			  
	
	public void setMessageSigner(IfrendMessageSigner messageSigner) {
		this.messageSigner = messageSigner;
	}
	
	public void setDefaultRequest(Resource defaultRequest) {
		this.defaultRequest = defaultRequest;
	}
	
	
	
}
