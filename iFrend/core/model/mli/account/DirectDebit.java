package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;

/**
 * 
 * Bean class for direct debit.
 *
 */
public class DirectDebit implements Serializable {

	private static final long serialVersionUID = 9207991124348860327L;
	
	private String accountNumber;
	private String cardNumber;
	private String customerNumber;

	private int paymentMethod ;
	private String acRTNumber;
	private String achDebitNumber;
	
	
	public DirectDebit(){
		
	}
	
	public DirectDebit(String accountNumber, String cardNumber,
			String customerNumber, int paymentMethod, String acRTNumber,
			String achDebitNumber) {
	
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.customerNumber = customerNumber;
		this.paymentMethod = paymentMethod;
		this.acRTNumber = acRTNumber;
		this.achDebitNumber = achDebitNumber;
	}

	/** setter and getter **/
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}


	public int getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public String getAcRTNumber() {
		return acRTNumber;
	}


	public void setAcRTNumber(String acRTNumber) {
		this.acRTNumber = acRTNumber;
	}


	public String getAchDebitNumber() {
		return achDebitNumber;
	}


	public void setAchDebitNumber(String achDebitNumber) {
		this.achDebitNumber = achDebitNumber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	
	

	

	
	

	
}
