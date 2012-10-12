package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 *  Bean class for credit limit.
 *
 */
public class CreditLimit implements Serializable {
	private static final long serialVersionUID = -895263426445428320L;
	
	private String accountNumber;
	private String cardNumber;
	private String customerNumber;

	
	private BigDecimal acctPermanentCreditLimit;
	private BigDecimal acctTemporaryCreditLimit;
	private Date acctEffectiveDate;
	private Date expiryDate;

	private BigDecimal customerPermanentCreditLimit;
	private BigDecimal customerTemporaryCreditLimit;
	private Date customerEffectiveDate;
	private Date customerExpiryDate;
	
	public CreditLimit(){
		
	}
	

	public CreditLimit(String accountNumber, String cardNumber,
			String customerNumber, BigDecimal acctPermanentCreditLimit,
			BigDecimal acctTemporaryCreditLimit, Date acctEffectiveDate,
			Date expiryDate, BigDecimal customerPermanentCreditLimit,
			BigDecimal customerTemporaryCreditLimit,
			Date customerEffectiveDate, Date customerExpiryDate) {
		
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.customerNumber = customerNumber;
		this.acctPermanentCreditLimit = acctPermanentCreditLimit;
		this.acctTemporaryCreditLimit = acctTemporaryCreditLimit;
		this.acctEffectiveDate = acctEffectiveDate;
		this.expiryDate = expiryDate;
		this.customerPermanentCreditLimit = customerPermanentCreditLimit;
		this.customerTemporaryCreditLimit = customerTemporaryCreditLimit;
		this.customerEffectiveDate = customerEffectiveDate;
		this.customerExpiryDate = customerExpiryDate;
	}



	/** setter and getter **/
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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
