package com.isg.iseries.ivrwsclient.logger;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;


public class IfrendCoreLoggerLoader {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2754049091977570733L;

	
	public void init() {
		// TODO Auto-generated method stub
				
		System.out.println("*** " + "["+ IfrendCoreLoggerLoader.class.getName() +
				"] " + "loading the Log4j log loader...");
		String pack = IfrendCoreLoggerLoader.class.getPackage().getName();		
		//URL url = Loader.getResource("com/isg/iloan/logger/log4j.properties");
		URL url = Loader.getResource(pack.replace('.', '/')+"/log4j.properties");
		System.out.println("URL:"+url.getPath());
		PropertyConfigurator.configure(url);
		
		System.out.println("*** " + "["+ IfrendCoreLoggerLoader.class.getName() +
				"] " + "loading the Log4j log loader...finished!");		
		
	}

	
	
}
