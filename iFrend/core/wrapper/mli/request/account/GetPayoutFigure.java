package com.isg.ifrend.wrapper.mli.request.account;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetPayoutFigure")
public class GetPayoutFigure {

	private String accountNumber;
	private String customerNumber;
	private String cardNumber;
	
	@XmlElement(name="payoutDate")
	private Date payoutDate;

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

	public Date getPayoutDate() {
		return payoutDate;
	}

	public void setPayoutDate(Date payoutDate) {
		this.payoutDate = payoutDate;
	}
	
	
	
}
