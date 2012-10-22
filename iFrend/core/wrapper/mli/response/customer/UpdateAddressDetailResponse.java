package com.isg.ifrend.wrapper.mli.response.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UpdateAddressDetailResponse")
public class UpdateAddressDetailResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
}
