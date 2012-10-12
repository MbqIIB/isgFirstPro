package com.isg.ifrend.core.model.mli.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/** 
 * Bean class for UnbilledTransaction
 *
 */
public class UnbilledTransaction  implements Serializable  {
	
	private static final long serialVersionUID = 1959801158187940627L;
	
	private String accountNumber;
	private String referenceNumber;
	private String sourceCode;
	private String posEntryMode;
	private String interchangeReferenceNumber;
	
	private Date postDate;
	private Date transactionDate;
	private String description;
	private String transactionCode;
	private BigDecimal transactionAmount;
	
	public UnbilledTransaction(){
		
	}
	
	public UnbilledTransaction(String accountNumber, String referenceNumber,
			String sourceCode, String posEntryMode,
			String interchangeReferenceNumber, Date postDate,
			Date transactionDate, String description, String transactionCode,
			BigDecimal transactionAmount) {
		this.accountNumber = accountNumber;
		this.referenceNumber = referenceNumber;
		this.sourceCode = sourceCode;
		this.posEntryMode = posEntryMode;
		this.interchangeReferenceNumber = interchangeReferenceNumber;
		this.postDate = postDate;
		this.transactionDate = transactionDate;
		this.description = description;
		this.transactionCode = transactionCode;
		this.transactionAmount = transactionAmount;
	}
	
	/** setter and getter **/
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getPosEntryMode() {
		return posEntryMode;
	}
	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}
	public String getInterchangeReferenceNumber() {
		return interchangeReferenceNumber;
	}
	public void setInterchangeReferenceNumber(String interchangeReferenceNumber) {
		this.interchangeReferenceNumber = interchangeReferenceNumber;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

}
