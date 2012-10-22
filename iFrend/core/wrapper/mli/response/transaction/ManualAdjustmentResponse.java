package com.isg.ifrend.wrapper.mli.response.transaction;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ManualAdjustmentResponse")
public class ManualAdjustmentResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
	
	
}
