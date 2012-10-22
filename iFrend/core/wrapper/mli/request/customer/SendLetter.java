package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SendLetter")
public class SendLetter {
	
	private String letterCode;

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

}
