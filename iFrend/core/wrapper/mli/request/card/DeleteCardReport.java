package com.isg.ifrend.wrapper.mli.request.card;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DeleteCardReport")
public class DeleteCardReport {
	
	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
