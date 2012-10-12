package com.isg.ifrend.core.model.mli.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/** 
 * Bean class for PaymentDetails
 *
 */
public class PaymentDetail implements Serializable {

	private static final long serialVersionUID = -4771561931045318247L;

	private String accountNumber;
	private Date cycleDate;
	private BigDecimal minPaymentAmountDue;
	private BigDecimal fullBalanceAmountDue;
	private BigDecimal paidAmount;
	private BigDecimal delinquencyAmount;
	private Date errorDate;
	private int daysDelay;
	private String transactionCode;
	private Date paymentDueDate;
	
	
	public PaymentDetail(){
	}
	
	public PaymentDetail(String accountNumber, Date cycleDate,
			BigDecimal minPaymentAmountDue, BigDecimal fullBalanceAmountDue,
			BigDecimal paidAmount, BigDecimal delinquencyAmount,
			Date errorDate, int daysDelay, String transactionCode,
			Date paymentDueDate) {
		this.accountNumber = accountNumber;
		this.cycleDate = cycleDate;
		this.minPaymentAmountDue = minPaymentAmountDue;
		this.fullBalanceAmountDue = fullBalanceAmountDue;
		this.paidAmount = paidAmount;
		this.delinquencyAmount = delinquencyAmount;
		this.errorDate = errorDate;
		this.daysDelay = daysDelay;
		this.transactionCode = transactionCode;
		this.paymentDueDate = paymentDueDate;
	}

	/** getter and  setter **/
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getCycleDate() {
		return cycleDate;
	}
	public void setCycleDate(Date cycleDate) {
		this.cycleDate = cycleDate;
	}
	public BigDecimal getMinPaymentAmountDue() {
		return minPaymentAmountDue;
	}
	public void setMinPaymentAmountDue(BigDecimal minPaymentAmountDue) {
		this.minPaymentAmountDue = minPaymentAmountDue;
	}
	public BigDecimal getFullBalanceAmountDue() {
		return fullBalanceAmountDue;
	}
	public void setFullBalanceAmountDue(BigDecimal fullBalanceAmountDue) {
		this.fullBalanceAmountDue = fullBalanceAmountDue;
	}
	public BigDecimal getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}
	public BigDecimal getDelinquencyAmount() {
		return delinquencyAmount;
	}
	public void setDelinquencyAmount(BigDecimal delinquencyAmount) {
		this.delinquencyAmount = delinquencyAmount;
	}
	public Date getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(Date errorDate) {
		this.errorDate = errorDate;
	}
	public int getDaysDelay() {
		return daysDelay;
	}
	public void setDaysDelay(int daysDelay) {
		this.daysDelay = daysDelay;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}


	
	
}
