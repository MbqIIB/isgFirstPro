package com.isg.ifrend.wrapper.mli.request.account;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IncrCustCreditLimit")
public class IncrCustCreditLimit {

	private String accountNumber;
	private String cardNumber;
	private String customerNumber;
	
	@XmlElement(name="customerPermanentCreditLimit")
	private BigDecimal customerPermanentCreditLimit;
	@XmlElement(name="customerTemporaryCreditLimit")
	private BigDecimal customerTemporaryCreditLimit;
	@XmlElement(name="customerEffectiveDate")
	private Date customerEffectiveDate;
	@XmlElement(name="customerExpiryDate")
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
