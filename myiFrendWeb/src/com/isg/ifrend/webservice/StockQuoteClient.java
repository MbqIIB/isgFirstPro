package com.isg.ifrend.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class StockQuoteClient {

	
	public static void main(String[] args){
		
		URL url;
		try {
			url = new URL("http://localhost:9999/ws/hello?wsdl");
			QName qname = new QName("http://webservice.ifrend.isg.com/", "StockQuoteImplService");
			 
	        Service service = Service.create(url, qname);
	 
	        StockQuote stock = service.getPort(StockQuote.class);
	        System.out.println(stock.getQuote("IBM"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
 
        
		
	}
	
}
