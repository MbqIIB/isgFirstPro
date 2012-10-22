package com.isg.ifrend.wrapper.mli.request.transaction;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ManualAdjustment")
public class ManualAdjustment {

	private String accountNumber;
	private String transactionCode;
	@XmlElement(name="amount")
	private BigDecimal amount;
	private String reversalReason;
	private String remarks;
	
	
	
	
	public ManualAdjustment(){
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getReversalReason() {
		return reversalReason;
	}
	public void setReversalReason(String reversalReason) {
		this.reversalReason = reversalReason;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
