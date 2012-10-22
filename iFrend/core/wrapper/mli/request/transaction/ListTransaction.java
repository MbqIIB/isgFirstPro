package com.isg.ifrend.wrapper.mli.request.transaction;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ListTransaction")
public class ListTransaction {

	public String accountNumber;
	public String customerNumber;
	public String cardNumber;
	
	 	
	public ListTransaction() {
		
	}
	
	
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
