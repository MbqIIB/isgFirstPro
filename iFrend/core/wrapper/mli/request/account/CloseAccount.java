package com.isg.ifrend.wrapper.mli.request.account;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CloseAccount")
public class CloseAccount {

	private String accountNumber;
	private String customerNumber;
	private String cardNumber;
	
	private String closureReason;
	private String contactDetails;	
	private String actionOnFee;	
	private String remarks;

	
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

	public String getClosureReason() {
		return closureReason;
	}

	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getActionOnFee() {
		return actionOnFee;
	}

	public void setActionOnFee(String actionOnFee) {
		this.actionOnFee = actionOnFee;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
