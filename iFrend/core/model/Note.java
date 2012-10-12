package com.isg.ifrend.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/** 
 * 
 * Bean class for note.
 */
public class Note implements Serializable {
	
	private static final long serialVersionUID = 2291075220486227920L;
	
	private String callId;
	private String noteId;

	private Date transactionDate;
	private Date postdate;
	private String operatorID;
	private String description;
	private String ranCode;
	private String sourceCode;
	private String posEntryMode;
	private String referenceNbr;
	private String interchangeReferenceNbr;
	private String cardNbr;
	private BigDecimal disputeAmount;
	private String remarks;
	
	public Note(){
		
	}
	
	public Note(String callId, String noteId, Date transactionDate,
			Date postdate, String operatorID, String description,
			String ranCode, String sourceCode, String posEntryMode,
			String referenceNbr, String interchangeReferenceNbr,
			String cardNbr, BigDecimal disputeAmount, String remarks) {
		super();
		this.callId = callId;
		this.noteId = noteId;
		this.transactionDate = transactionDate;
		this.postdate = postdate;
		this.operatorID = operatorID;
		this.description = description;
		this.ranCode = ranCode;
		this.sourceCode = sourceCode;
		this.posEntryMode = posEntryMode;
		this.referenceNbr = referenceNbr;
		this.interchangeReferenceNbr = interchangeReferenceNbr;
		this.cardNbr = cardNbr;
		this.disputeAmount = disputeAmount;
		this.remarks = remarks;
	}

	/** getter and setter **/		
	public Date getTransactionDate() {
		return transactionDate;
	}
	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getNoteId() {
		return noteId;
	}
	
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getOperatorID() {
		return operatorID;
	}
	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRanCode() {
		return ranCode;
	}
	public void setRanCode(String ranCode) {
		this.ranCode = ranCode;
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
	public String getReferenceNbr() {
		return referenceNbr;
	}
	public void setReferenceNbr(String referenceNbr) {
		this.referenceNbr = referenceNbr;
	}
	public String getInterchangeReferenceNbr() {
		return interchangeReferenceNbr;
	}
	public void setInterchangeReferenceNbr(String interchangeReferenceNbr) {
		this.interchangeReferenceNbr = interchangeReferenceNbr;
	}
	public String getCardNbr() {
		return cardNbr;
	}
	public void setCardNbr(String cardNbr) {
		this.cardNbr = cardNbr;
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
