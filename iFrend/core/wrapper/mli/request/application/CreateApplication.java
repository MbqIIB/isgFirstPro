package com.isg.ifrend.wrapper.mli.request.application;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.application.Application;

@XmlRootElement(name="CreateApplication")
public class CreateApplication {

	@XmlElement(name="application")
	private Application application;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
}
