package com.isg.ifrend.wrapper.mli.request.account;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetAccount")
public class GetAccount {

	private String accountNumber;
	private String customerNumber;
	private String cardNumber;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
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
	
}
