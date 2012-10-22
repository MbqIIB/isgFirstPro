package com.isg.ifrend.jms;

import org.springframework.beans.factory.annotation.Value;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.application.Application;
import com.isg.ifrend.wrapper.mli.request.application.CreateApplication;
import com.isg.ifrend.wrapper.mli.request.application.GetApplication;
import com.isg.ifrend.wrapper.mli.response.application.CreateApplicationResponse;
import com.isg.ifrend.wrapper.mli.response.application.GetApplicationResponse;

public class ApplicationMLIServiceImpl extends MLIService implements ApplicationMLIService {

	@Value("${inqAppQueue}")
	private String inqAppQueue;
	@Value("${inqAppDest}")
	private String inqAppDest;
	@Value("${createAppQueue}")
	private String createAppQueue;
	@Value("${createAppDest}")
	private String createAppDest;
	
	
	@Override
	public Application requestApplicationInquiry(GetApplication wrapper) throws IfrendMLIException {
		Application application=null;		
		Object obj = processRequest(wrapper, GetApplicationResponse.class, inqAppQueue, inqAppDest);
		if(obj!=null & obj instanceof GetApplicationResponse){
			application = ((GetApplicationResponse)obj).getApplication();
			
		}
		return application;
	}
	

	@Override
	public String requestCreateApplication(CreateApplication wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CreateApplicationResponse.class, createAppQueue, createAppDest);
		if(obj!=null & obj instanceof CreateApplicationResponse){
			mliResponse = ((CreateApplicationResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	public String getInqAppQueue() {
		return inqAppQueue;
	}

	public void setInqAppQueue(String inqAppQueue) {
		this.inqAppQueue = inqAppQueue;
	}

	public String getInqAppDest() {
		return inqAppDest;
	}

	public void setInqAppDest(String inqAppDest) {
		this.inqAppDest = inqAppDest;
	}

	public String getCreateAppQueue() {
		return createAppQueue;
	}

	public void setCreateAppQueue(String createAppQueue) {
		this.createAppQueue = createAppQueue;
	}

	public String getCreateAppDest() {
		return createAppDest;
	}

	public void setCreateAppDest(String createAppDest) {
		this.createAppDest = createAppDest;
	}

}
