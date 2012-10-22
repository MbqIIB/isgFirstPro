package com.isg.ifrend.wrapper.mli.response.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CreateApplicationResponse")
public class CreateApplicationResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
	
}
