package com.isg.ifrend.wrapper.mli.response.card;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="CardMaintenanceResponse")
public class CardMaintenanceResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
	
}
