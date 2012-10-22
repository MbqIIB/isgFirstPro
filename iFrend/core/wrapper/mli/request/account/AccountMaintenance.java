package com.isg.ifrend.wrapper.mli.request.account;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AccountMaintenance")
public class AccountMaintenance {

	private String accountNumber;
	private String customerNumber;
	private String cardNumber;
	
	private String shortName;
	private Date userDate;
	private int billingCycle;
	private String blockCode;
	private boolean statamentFrequency;
	private String statementFlag;
	
	/** Waive Flags **/
	private boolean isRetailInterest;
	private boolean isLateNotice;
	private boolean isSeviceCharges;
	private boolean isCashInterest;
	private boolean isAnnualFees;
	private boolean isPrepay; 
	private boolean isLateCharges;
	private boolean isOverLimitCharges;
	private boolean isJoiningFee;
	
	private int prodOfferOccurence;	
	private int pendingOccurence;
	private Date prodOfferExpiryDate;
	private Date pendingOccurenceExpiryDate;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	public int getBillingCycle() {
		return billingCycle;
	}
	public void setBillingCycle(int billingCycle) {
		this.billingCycle = billingCycle;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public boolean isStatamentFrequency() {
		return statamentFrequency;
	}
	public void setStatamentFrequency(boolean statamentFrequency) {
		this.statamentFrequency = statamentFrequency;
	}
	public String getStatementFlag() {
		return statementFlag;
	}
	public void setStatementFlag(String statementFlag) {
		this.statementFlag = statementFlag;
	}
	public boolean isRetailInterest() {
		return isRetailInterest;
	}
	public void setRetailInterest(boolean isRetailInterest) {
		this.isRetailInterest = isRetailInterest;
	}
	public boolean isLateNotice() {
		return isLateNotice;
	}
	public void setLateNotice(boolean isLateNotice) {
		this.isLateNotice = isLateNotice;
	}
	public boolean isSeviceCharges() {
		return isSeviceCharges;
	}
	public void setSeviceCharges(boolean isSeviceCharges) {
		this.isSeviceCharges = isSeviceCharges;
	}
	public boolean isCashInterest() {
		return isCashInterest;
	}
	public void setCashInterest(boolean isCashInterest) {
		this.isCashInterest = isCashInterest;
	}
	public boolean isAnnualFees() {
		return isAnnualFees;
	}
	public void setAnnualFees(boolean isAnnualFees) {
		this.isAnnualFees = isAnnualFees;
	}
	public boolean isPrepay() {
		return isPrepay;
	}
	public void setPrepay(boolean isPrepay) {
		this.isPrepay = isPrepay;
	}
	public boolean isLateCharges() {
		return isLateCharges;
	}
	public void setLateCharges(boolean isLateCharges) {
		this.isLateCharges = isLateCharges;
	}
	public boolean isOverLimitCharges() {
		return isOverLimitCharges;
	}
	public void setOverLimitCharges(boolean isOverLimitCharges) {
		this.isOverLimitCharges = isOverLimitCharges;
	}
	public boolean isJoiningFee() {
		return isJoiningFee;
	}
	public void setJoiningFee(boolean isJoiningFee) {
		this.isJoiningFee = isJoiningFee;
	}
	public int getProdOfferOccurence() {
		return prodOfferOccurence;
	}
	public void setProdOfferOccurence(int prodOfferOccurence) {
		this.prodOfferOccurence = prodOfferOccurence;
	}
	public int getPendingOccurence() {
		return pendingOccurence;
	}
	public void setPendingOccurence(int pendingOccurence) {
		this.pendingOccurence = pendingOccurence;
	}
	public Date getProdOfferExpiryDate() {
		return prodOfferExpiryDate;
	}
	public void setProdOfferExpiryDate(Date prodOfferExpiryDate) {
		this.prodOfferExpiryDate = prodOfferExpiryDate;
	}
	public Date getPendingOccurenceExpiryDate() {
		return pendingOccurenceExpiryDate;
	}
	public void setPendingOccurenceExpiryDate(Date pendingOccurenceExpiryDate) {
		this.pendingOccurenceExpiryDate = pendingOccurenceExpiryDate;
	}
	
	
	
}
