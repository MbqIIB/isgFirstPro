package com.isg.ifrend.core.model.mli.dto;

import java.math.BigDecimal;
import java.util.Date;


public class AccountCreditLimitDTO {

	private String accountNumber;
	private String cardNumber;
	private String customerNumber;

	
	private BigDecimal acctPermanentCreditLimit;
	private BigDecimal acctTemporaryCreditLimit;
	private Date acctEffectiveDate;
	private Date expiryDate;
	
	
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
	public BigDecimal getAcctPermanentCreditLimit() {
		return acctPermanentCreditLimit;
	}
	public void setAcctPermanentCreditLimit(BigDecimal acctPermanentCreditLimit) {
		this.acctPermanentCreditLimit = acctPermanentCreditLimit;
	}
	public BigDecimal getAcctTemporaryCreditLimit() {
		return acctTemporaryCreditLimit;
	}
	public void setAcctTemporaryCreditLimit(BigDecimal acctTemporaryCreditLimit) {
		this.acctTemporaryCreditLimit = acctTemporaryCreditLimit;
	}
	public Date getAcctEffectiveDate() {
		return acctEffectiveDate;
	}
	public void setAcctEffectiveDate(Date acctEffectiveDate) {
		this.acctEffectiveDate = acctEffectiveDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	
	
	
}
