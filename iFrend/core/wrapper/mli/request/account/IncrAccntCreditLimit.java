package com.isg.ifrend.wrapper.mli.request.account;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IncrAccntCreditLimit")
public class IncrAccntCreditLimit {

	private String accountNumber;
	private String cardNumber;
	private String customerNumber;

	@XmlElement(name="acctPermanentCreditLimit")
	private BigDecimal acctPermanentCreditLimit;
	@XmlElement(name="acctTemporaryCreditLimit")
	private BigDecimal acctTemporaryCreditLimit;
	@XmlElement(name="acctEffectiveDate")
	private Date acctEffectiveDate;
	@XmlElement(name="expiryDate")
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
