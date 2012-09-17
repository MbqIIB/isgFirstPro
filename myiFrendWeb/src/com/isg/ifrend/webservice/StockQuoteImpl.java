package com.isg.ifrend.webservice;


import javax.jws.WebService;


@WebService(endpointInterface="com.isg.ifrend.webservice.StockQuote")
public class StockQuoteImpl implements StockQuote{
	
	
	public double getQuote(String code){		
	         double result = 0.0;
	         if (code.equals("SUN")) {
	            result = 20.0;
	         } else if (code.equals("IBM")){
	            result = 83.0;
	         } else if (code.equals("BEA")) {
	            result = 12;
	         }
		return result;
	}
	

}
