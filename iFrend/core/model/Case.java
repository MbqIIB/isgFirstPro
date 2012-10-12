package com.isg.ifrend.core.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * 
 * Bean class for case.
 * 
 */
public class Case implements Serializable {	
	
	private static final long serialVersionUID = 508687427021497529L;
	
	private String callId;	
	private String caseId;
	private Date transactionDate;
	private Date postDate;
	private String operatorId;
	private String description;
	
	private String transactionCode;
	private String sourceCode;
	private String posEntryMode;
	
	private String referenceNumber;
	private String interchangeReferenceNumber;
	private String cardNumber;
	
	private BigDecimal disputeAmount;
	private String remarks;
	
	public Case(){
		
	}
	
	public Case(String callId, String caseId, Date transactionDate,
			Date postDate, String operatorId, String description,
			String transactionCode, String sourceCode, String posEntryMode,
			String referenceNumber, String interchangeReferenceNumber,
			String cardNumber, BigDecimal disputeAmount, String remarks) {
		this.callId = callId;
		this.caseId = caseId;
		this.transactionDate = transactionDate;
		this.postDate = postDate;
		this.operatorId = operatorId;
		this.description = description;
		this.transactionCode = transactionCode;
		this.sourceCode = sourceCode;
		this.posEntryMode = posEntryMode;
		this.referenceNumber = referenceNumber;
		this.interchangeReferenceNumber = interchangeReferenceNumber;
		this.cardNumber = cardNumber;
		this.disputeAmount = disputeAmount;
		this.remarks = remarks;
	}
	

	/** getter and setter **/	
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getInterchangeReferenceNumber() {
		return interchangeReferenceNumber;
	}
	public void setInterchangeReferenceNumber(String interchangeReferenceNumber) {
		this.interchangeReferenceNumber = interchangeReferenceNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public BigDecimal getDisputeAmount() {
		return disputeAmount;
	}
	public void setDisputeAmount(BigDecimal disputeAmount) {
		this.disputeAmount = disputeAmount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	
	
	
	

}
