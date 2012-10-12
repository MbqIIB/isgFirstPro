package com.isg.ifrend.core.model.mli.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author aizza.fernando
 *
 */
public class StatementDetail  implements Serializable  {

	private static final long serialVersionUID = 6487737586393004689L;
	
	private String accountNumber;
	private Date postDate;
	private Date transactionDate;
	private String description;
	private String transactionCode;
	private BigDecimal transactionAmount;

	public StatementDetail(){
		
	}
	
	public StatementDetail(String accountNumber, Date postDate,
			Date transactionDate, String description, String transactionCode,
			BigDecimal transactionAmount) {
		this.accountNumber = accountNumber;
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
