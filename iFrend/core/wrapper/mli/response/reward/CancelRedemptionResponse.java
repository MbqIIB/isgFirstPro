package com.isg.ifrend.wrapper.mli.response.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CancelRedemptionResponse")
public class CancelRedemptionResponse {

	
	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
}
