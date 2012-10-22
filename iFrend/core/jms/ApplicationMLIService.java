package com.isg.ifrend.jms;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.application.Application;
import com.isg.ifrend.wrapper.mli.request.application.CreateApplication;
import com.isg.ifrend.wrapper.mli.request.application.GetApplication;


public interface ApplicationMLIService {

		
		/**
		 * @throws IfrendMLIException 
		 */
		public abstract Application requestApplicationInquiry(GetApplication wrapper) throws IfrendMLIException;

			
			/**
			 * @throws IfrendMLIException 
			 */
			public abstract String requestCreateApplication(CreateApplication wrapper) throws IfrendMLIException;
			
		

}
