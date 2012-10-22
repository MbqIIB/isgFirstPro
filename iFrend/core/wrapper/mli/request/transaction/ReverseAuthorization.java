package com.isg.ifrend.wrapper.mli.request.transaction;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ReverseAuthorization")
public class ReverseAuthorization {

	private String accountNumber;
	private Date transactionDate;
	private String origCurrencyCode;
	private String billCurrencyCode;
	@XmlElement(name="origAmount")
	private BigDecimal origAmount;
	@XmlElement(name="billAmount")
	private BigDecimal billAmount;
	private String authorizationCode;	
	private String reversalReason;
	private String merchantNumber;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getOrigCurrencyCode() {
		return origCurrencyCode;
	}
	public void setOrigCurrencyCode(String origCurrencyCode) {
		this.origCurrencyCode = origCurrencyCode;
	}
	public String getBillCurrencyCode() {
		return billCurrencyCode;
	}
	public void setBillCurrencyCode(String billCurrencyCode) {
		this.billCurrencyCode = billCurrencyCode;
	}
	public BigDecimal getOrigAmount() {
		return origAmount;
	}
	public void setOrigAmount(BigDecimal origAmount) {
		this.origAmount = origAmount;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public String getReversalReason() {
		return reversalReason;
	}
	public void setReversalReason(String reversalReason) {
		this.reversalReason = reversalReason;
	}
	public String getMerchantNumber() {
		return merchantNumber;
	}
	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}
	
	
}
