package com.isg.ifrend.wrapper.mli.response.card;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="ReportLostStolenCardResponse")
public class ReportLostStolenCardResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}

	
	
}
