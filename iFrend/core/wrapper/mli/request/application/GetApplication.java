package com.isg.ifrend.wrapper.mli.request.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InquireApplication")
public class GetApplication {
	
	private String applicationNumber;
	private String applicationType;
	
	
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

}
