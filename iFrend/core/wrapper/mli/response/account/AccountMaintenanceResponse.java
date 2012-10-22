package com.isg.ifrend.wrapper.mli.response.account;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="AccountMaintenanceResponse")
public class AccountMaintenanceResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
}
