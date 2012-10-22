package com.isg.ifrend.wrapper.mli.request.transaction;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetStatement")
public class GetStatement {
	
	private String accountNumber;
	private String customerNumber;
	private String cardNumber;	
	private Date statementDate;

	public Date getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
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
