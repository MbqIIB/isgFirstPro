package com.isg.ifrend.wrapper.mli.request.card;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InquireCardReport")
public class InquireCardReport {

	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
