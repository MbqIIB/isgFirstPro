package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * Bean class for Account.
 *
 */
public class Account implements Serializable {

	private static final long serialVersionUID = -7283125943049197795L;
	
	private String accountNumber;
	private String cardNumber;
	private String customerNumber;
	
	private String prodPricingCode;
	private BigDecimal currentBalance;
	private BigDecimal creditLimit;
	private BigDecimal availCreditRemaining;
	private BigDecimal dailyCashAdvanceLimit;
	private BigDecimal availDailyCashAdvance;
	private BigDecimal cashLimit;
	private BigDecimal availCashRemaining;
	private BigDecimal cashBalance;
	private BigDecimal retailBalance;
	private String blockCode;
	private int cycleDue;
	private int billCycle;
	
	
	public Account(){
		
	}
	
	public Account(String accountNumber, String cardNumber,
			String customerNumber, String prodPricingCode,
			BigDecimal currentBalance, BigDecimal creditLimit,
			BigDecimal availCreditRemaining, BigDecimal dailyCashAdvanceLimit,
			BigDecimal availDailyCashAdvance, BigDecimal cashLimit,
			BigDecimal availCashRemaining, BigDecimal cashBalance,
			BigDecimal retailBalance, String blockCode, int cycleDue,
			int billCycle) {

		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.customerNumber = customerNumber;
		this.prodPricingCode = prodPricingCode;
		this.currentBalance = currentBalance;
		this.creditLimit = creditLimit;
		this.availCreditRemaining = availCreditRemaining;
		this.dailyCashAdvanceLimit = dailyCashAdvanceLimit;
		this.availDailyCashAdvance = availDailyCashAdvance;
		this.cashLimit = cashLimit;
		this.availCashRemaining = availCashRemaining;
		this.cashBalance = cashBalance;
		this.retailBalance = retailBalance;
		this.blockCode = blockCode;
		this.cycleDue = cycleDue;
		this.billCycle = billCycle;
	}
	/** getter and setter **/
	public String getAccountNumber() {
		return accountNumber;
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
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getProdPricingCode() {
		return prodPricingCode;
	}
	public void setProdPricingCode(String prodPricingCode) {
		this.prodPricingCode = prodPricingCode;
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	public BigDecimal getAvailCreditRemaining() {
		return availCreditRemaining;
	}
	public void setAvailCreditRemaining(BigDecimal availCreditRemaining) {
		this.availCreditRemaining = availCreditRemaining;
	}
	public BigDecimal getDailyCashAdvanceLimit() {
		return dailyCashAdvanceLimit;
	}
	public void setDailyCashAdvanceLimit(BigDecimal dailyCashAdvanceLimit) {
		this.dailyCashAdvanceLimit = dailyCashAdvanceLimit;
	}
	public BigDecimal getAvailDailyCashAdvance() {
		return availDailyCashAdvance;
	}
	public void setAvailDailyCashAdvance(BigDecimal availDailyCashAdvance) {
		this.availDailyCashAdvance = availDailyCashAdvance;
	}
	public BigDecimal getCashLimit() {
		return cashLimit;
	}
	public void setCashLimit(BigDecimal cashLimit) {
		this.cashLimit = cashLimit;
	}
	public BigDecimal getAvailCashRemaining() {
		return availCashRemaining;
	}
	public void setAvailCashRemaining(BigDecimal availCashRemaining) {
		this.availCashRemaining = availCashRemaining;
	}
	public BigDecimal getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}
	public BigDecimal getRetailBalance() {
		return retailBalance;
	}
	public void setRetailBalance(BigDecimal retailBalance) {
		this.retailBalance = retailBalance;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public int getCycleDue() {
		return cycleDue;
	}
	public void setCycleDue(int cycleDue) {
		this.cycleDue = cycleDue;
	}
	public int getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(int billCycle) {
		this.billCycle = billCycle;
	}
	
	
	


}
