package com.isg.ifrend.wrapper.mli.response.reward;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="CreateRedempAdjResponse")
public class CreateRedempAdjResponse {
	

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	

}
