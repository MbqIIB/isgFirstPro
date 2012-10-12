package com.isg.ifrend.core.model.mli.dto;

import java.math.BigDecimal;
import java.util.Date;


public class CustomerCreditLimitDTO {

	private String accountNumber;
	private String cardNumber;
	private String customerNumber;
	
	private BigDecimal customerPermanentCreditLimit;
	private BigDecimal customerTemporaryCreditLimit;
	private Date customerEffectiveDate;
	private Date customerExpiryDate;
	
	
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
	public BigDecimal getCustomerPermanentCreditLimit() {
		return customerPermanentCreditLimit;
	}
	public void setCustomerPermanentCreditLimit(
			BigDecimal customerPermanentCreditLimit) {
		this.customerPermanentCreditLimit = customerPermanentCreditLimit;
	}
	public BigDecimal getCustomerTemporaryCreditLimit() {
		return customerTemporaryCreditLimit;
	}
	public void setCustomerTemporaryCreditLimit(
			BigDecimal customerTemporaryCreditLimit) {
		this.customerTemporaryCreditLimit = customerTemporaryCreditLimit;
	}
	public Date getCustomerEffectiveDate() {
		return customerEffectiveDate;
	}
	public void setCustomerEffectiveDate(Date customerEffectiveDate) {
		this.customerEffectiveDate = customerEffectiveDate;
	}
	public Date getCustomerExpiryDate() {
		return customerExpiryDate;
	}
	public void setCustomerExpiryDate(Date customerExpiryDate) {
		this.customerExpiryDate = customerExpiryDate;
	}
	
}
