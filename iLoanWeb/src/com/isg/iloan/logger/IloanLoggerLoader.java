package com.isg.iloan.logger;

import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

public class IloanLoggerLoader extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2754049091977570733L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();		
		System.out.println("*** " + "["+ IloanLoggerLoader.class.getName() +
				"] " + "start loading the Log4j log loader...");
		URL url = Loader.getResource("com/isg/iloan/logger/log4j.properties");
		PropertyConfigurator.configure(url);
		
		System.out.println("*** " + "["+ IloanLoggerLoader.class.getName() +
				"] " + "finished loading the Log4j log loader...");		
		
	}

	
	
}
