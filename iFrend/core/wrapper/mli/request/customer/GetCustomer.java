package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetCustomer")
public class GetCustomer {

	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
