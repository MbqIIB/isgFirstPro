package com.isg.ifrend.webservice;

import javax.xml.ws.Endpoint;

public class StockQuotePublisher {

	public static void main(String[] args){
		
		Endpoint.publish("http://localhost:9999/ws/hello", new StockQuoteImpl());
		
	}
	
}
