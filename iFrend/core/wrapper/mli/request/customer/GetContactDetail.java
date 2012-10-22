package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetContactDetail")
public class GetContactDetail {

	
	private String customerNumber;
	private String cardNumber;
	private String applicationNumber;
	
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	
	
	
}
