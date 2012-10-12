package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  Bean class for Account Maintenance.
 *
 */
public class AccountMaintenance implements Serializable {
	private static final long serialVersionUID = 2560736953729143633L;
	
	private String accountNumber;
	private String customerNumber;
	private String cardNumber;
	
	private String shortName;
	private Date userDate;
	private int billingCycle;
	private String paymentType;
	private String blockCode;
	private Date  blockCodeDate;	

	private String chStatus;
	private boolean postingFlag;
	private boolean statamentFrequency;
	private BigDecimal fixedPayment;

	private Date dateLastMaintenance;
	private Date dateNextStatement;
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
	private Date pendingOccurence;
	private Date pendingOccurenceExpiryDate;
	
	public AccountMaintenance(){
		
	}

	
	public AccountMaintenance(String accountNumber, String customerNumber,
			String cardNumber, String shortName, Date userDate,
			int billingCycle, String paymentType, String blockCode,
			Date blockCodeDate, String chStatus, boolean postingFlag,
			boolean statamentFrequency, BigDecimal fixedPayment,
			Date dateLastMaintenance, Date dateNextStatement,
			String statementFlag, boolean isRetailInterest,
			boolean isLateNotice, boolean isSeviceCharges,
			boolean isCashInterest, boolean isAnnualFees, boolean isPrepay,
			boolean isLateCharges, boolean isOverLimitCharges,
			boolean isJoiningFee, Date pendingOccurence,
			Date pendingOccurenceExpiryDate) {
	
		this.accountNumber = accountNumber;
		this.customerNumber = customerNumber;
		this.cardNumber = cardNumber;
		this.shortName = shortName;
		this.userDate = userDate;
		this.billingCycle = billingCycle;
		this.paymentType = paymentType;
		this.blockCode = blockCode;
		this.blockCodeDate = blockCodeDate;
		this.chStatus = chStatus;
		this.postingFlag = postingFlag;
		this.statamentFrequency = statamentFrequency;
		this.fixedPayment = fixedPayment;
		this.dateLastMaintenance = dateLastMaintenance;
		this.dateNextStatement = dateNextStatement;
		this.statementFlag = statementFlag;
		this.isRetailInterest = isRetailInterest;
		this.isLateNotice = isLateNotice;
		this.isSeviceCharges = isSeviceCharges;
		this.isCashInterest = isCashInterest;
		this.isAnnualFees = isAnnualFees;
		this.isPrepay = isPrepay;
		this.isLateCharges = isLateCharges;
		this.isOverLimitCharges = isOverLimitCharges;
		this.isJoiningFee = isJoiningFee;
		this.pendingOccurence = pendingOccurence;
		this.pendingOccurenceExpiryDate = pendingOccurenceExpiryDate;
	}



	/** getter/setter **/
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public Date getBlockCodeDate() {
		return blockCodeDate;
	}
	public void setBlockCodeDate(Date blockCodeDate) {
		this.blockCodeDate = blockCodeDate;
	}
	public String getChStatus() {
		return chStatus;
	}
	public void setChStatus(String chStatus) {
		this.chStatus = chStatus;
	}
	public boolean isPostingFlag() {
		return postingFlag;
	}
	public void setPostingFlag(boolean postingFlag) {
		this.postingFlag = postingFlag;
	}
	public boolean isStatamentFrequency() {
		return statamentFrequency;
	}
	public void setStatamentFrequency(boolean statamentFrequency) {
		this.statamentFrequency = statamentFrequency;
	}
	public BigDecimal getFixedPayment() {
		return fixedPayment;
	}
	public void setFixedPayment(BigDecimal fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	public Date getDateLastMaintenance() {
		return dateLastMaintenance;
	}
	public void setDateLastMaintenance(Date dateLastMaintenance) {
		this.dateLastMaintenance = dateLastMaintenance;
	}
	public Date getDateNextStatement() {
		return dateNextStatement;
	}
	public void setDateNextStatement(Date dateNextStatement) {
		this.dateNextStatement = dateNextStatement;
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
	public Date getPendingOccurence() {
		return pendingOccurence;
	}
	public void setPendingOccurence(Date pendingOccurence) {
		this.pendingOccurence = pendingOccurence;
	}
	public Date getPendingOccurenceExpiryDate() {
		return pendingOccurenceExpiryDate;
	}
	public void setPendingOccurenceExpiryDate(Date pendingOccurenceExpiryDate) {
		this.pendingOccurenceExpiryDate = pendingOccurenceExpiryDate;
	}
	
	




}
