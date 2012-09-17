package com.isg.ifrend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface StockQuote {

	@WebMethod
	public double getQuote(String code);
	
}
