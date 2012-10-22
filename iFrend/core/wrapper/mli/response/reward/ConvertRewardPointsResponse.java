package com.isg.ifrend.wrapper.mli.response.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ConvertRewardPointsResponse")
public class ConvertRewardPointsResponse {

	private String mliResponseCode;

	public String getMliResponseCode() {
		return mliResponseCode;
	}

	public void setMliResponseCode(String mliResponseCode) {
		this.mliResponseCode = mliResponseCode;
	}
	
}
