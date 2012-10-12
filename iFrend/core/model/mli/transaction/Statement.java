package com.isg.ifrend.core.model.mli.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/** 
 * Bean class for StatementDetails
 *
 */
public class Statement  implements Serializable  {
	private static final long serialVersionUID = -762720351913633746L;
	
	
	private String accountNumber;
	private Date statementDate;
	private BigDecimal previousBalance;
	private BigDecimal paymentCredits;
	private BigDecimal purchaseDebits;
	private BigDecimal cashAdvance;
	private BigDecimal financialCharge;
	private BigDecimal newBalance; 
	private BigDecimal creditLimit;
	private BigDecimal availableCredit;
	private int 	   numberDays;
	private Date duedate;
	private Date paymentDue;
	private BigDecimal amountPastDue;
	private BigDecimal totalAmountDue;
	
	List<StatementDetail> transactionDetails;
	
	public Statement(){
	}

	public Statement(String accountNumber, Date statementDate,
			BigDecimal previousBalance, BigDecimal paymentCredits,
			BigDecimal purchaseDebits, BigDecimal cashAdvance,
			BigDecimal financialCharge, BigDecimal newBalance,
			BigDecimal creditLimit, BigDecimal availableCredit, int numberDays,
			Date duedate, Date paymentDue, BigDecimal amountPastDue,
			BigDecimal totalAmountDue, List<StatementDetail> transactionDetails) {
		this.accountNumber = accountNumber;
		this.statementDate = statementDate;
		this.previousBalance = previousBalance;
		this.paymentCredits = paymentCredits;
		this.purchaseDebits = purchaseDebits;
		this.cashAdvance = cashAdvance;
		this.financialCharge = financialCharge;
		this.newBalance = newBalance;
		this.creditLimit = creditLimit;
		this.availableCredit = availableCredit;
		this.numberDays = numberDays;
		this.duedate = duedate;
		this.paymentDue = paymentDue;
		this.amountPastDue = amountPastDue;
		this.totalAmountDue = totalAmountDue;
		this.transactionDetails = transactionDetails;
	}


	/** getter and  setter **/
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Date getStatementDate() {
		return statementDate;
	}


	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}


	public BigDecimal getPreviousBalance() {
		return previousBalance;
	}


	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}


	public BigDecimal getPaymentCredits() {
		return paymentCredits;
	}


	public void setPaymentCredits(BigDecimal paymentCredits) {
		this.paymentCredits = paymentCredits;
	}


	public BigDecimal getPurchaseDebits() {
		return purchaseDebits;
	}


	public void setPurchaseDebits(BigDecimal purchaseDebits) {
		this.purchaseDebits = purchaseDebits;
	}


	public BigDecimal getCashAdvance() {
		return cashAdvance;
	}


	public void setCashAdvance(BigDecimal cashAdvance) {
		this.cashAdvance = cashAdvance;
	}


	public BigDecimal getFinancialCharge() {
		return financialCharge;
	}


	public void setFinancialCharge(BigDecimal financialCharge) {
		this.financialCharge = financialCharge;
	}


	public BigDecimal getNewBalance() {
		return newBalance;
	}


	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}


	public BigDecimal getCreditLimit() {
		return creditLimit;
	}


	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}


	public BigDecimal getAvailableCredit() {
		return availableCredit;
	}


	public void setAvailableCredit(BigDecimal availableCredit) {
		this.availableCredit = availableCredit;
	}


	public int getNumberDays() {
		return numberDays;
	}


	public void setNumberDays(int numberDays) {
		this.numberDays = numberDays;
	}


	public Date getDuedate() {
		return duedate;
	}


	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}


	public Date getPaymentDue() {
		return paymentDue;
	}


	public void setPaymentDue(Date paymentDue) {
		this.paymentDue = paymentDue;
	}


	public BigDecimal getAmountPastDue() {
		return amountPastDue;
	}


	public void setAmountPastDue(BigDecimal amountPastDue) {
		this.amountPastDue = amountPastDue;
	}


	public BigDecimal getTotalAmountDue() {
		return totalAmountDue;
	}


	public void setTotalAmountDue(BigDecimal totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}


	public List<StatementDetail> getTransactionDetails() {
		return transactionDetails;
	}


	public void setTransactionDetails(List<StatementDetail> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	
	

}
