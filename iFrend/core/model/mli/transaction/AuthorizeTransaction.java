package com.isg.ifrend.core.model.mli.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * Bean class for Transaction 
 *
 */
public class AuthorizeTransaction  implements Serializable  {
	
	private static final long serialVersionUID = 6838235722553547202L;
	
	private String accountNumber;
	private Date transactionDate;
	private String billCurrencyCode;
	private BigDecimal billAmount;
	private String response;
	private String authCode;
	private String origCurrencyCode;
	private BigDecimal origAmount;
	private BigDecimal reviseCode;
	private String merchantName;
	private String revesalReason;
	
	public AuthorizeTransaction(){
		
	}
	
	public AuthorizeTransaction(String accountNumber, Date transactionDate,
			String billCurrencyCode, BigDecimal billAmount, String response,
			String authCode, String origCurrencyCode, BigDecimal origAmount,
			BigDecimal reviseCode, String merchantName, String revesalReason) {
		this.accountNumber = accountNumber;
		this.transactionDate = transactionDate;
		this.billCurrencyCode = billCurrencyCode;
		this.billAmount = billAmount;
		this.response = response;
		this.authCode = authCode;
		this.origCurrencyCode = origCurrencyCode;
		this.origAmount = origAmount;
		this.reviseCode = reviseCode;
		this.merchantName = merchantName;
		this.revesalReason = revesalReason;
	}
	
	/** getter and  setter **/
	public Date getTransactionDate() {
		return transactionDate;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getBillCurrencyCode() {
		return billCurrencyCode;
	}
	public void setBillCurrencyCode(String billCurrencyCode) {
		this.billCurrencyCode = billCurrencyCode;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getOrigCurrencyCode() {
		return origCurrencyCode;
	}
	public void setOrigCurrencyCode(String origCurrencyCode) {
		this.origCurrencyCode = origCurrencyCode;
	}
	public BigDecimal getOrigAmount() {
		return origAmount;
	}
	public void setOrigAmount(BigDecimal origAmount) {
		this.origAmount = origAmount;
	}
	public BigDecimal getReviseCode() {
		return reviseCode;
	}
	public void setReviseCode(BigDecimal reviseCode) {
		this.reviseCode = reviseCode;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getRevesalReason() {
		return revesalReason;
	}
	public void setRevesalReason(String revesalReason) {
		this.revesalReason = revesalReason;
	}

}
