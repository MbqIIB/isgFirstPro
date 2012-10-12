package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;

/**
 * 
 * Bean class for  Close Account.
 *
 */
public class CloseAccount implements Serializable {
	private static final long serialVersionUID = -5818882512633671136L;
	
	private String accountNumber;
	private String cardNumber;
	private String customerNumber;
	
	private String closureReason;
	private String contactDetails;
	private boolean isReverseAnnualFee;
	private boolean isReverseFinanceCharge;
	private boolean isCreateZeroBalance;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public CloseAccount(){
		
	}

	public CloseAccount(String accountNumber, String cardNumber,
			String customerNumber, String closureReason, String contactDetails,
			boolean isReverseAnnualFee, boolean isReverseFinanceCharge,
			boolean isCreateZeroBalance) {
		super();
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.customerNumber = customerNumber;
		this.closureReason = closureReason;
		this.contactDetails = contactDetails;
		this.isReverseAnnualFee = isReverseAnnualFee;
		this.isReverseFinanceCharge = isReverseFinanceCharge;
		this.isCreateZeroBalance = isCreateZeroBalance;
	}





	/** getter/setter **/
	
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
	public String getClosureReason() {
		return closureReason;
	}
	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public boolean isReverseAnnualFee() {
		return isReverseAnnualFee;
	}
	public void setReverseAnnualFee(boolean isReverseAnnualFee) {
		this.isReverseAnnualFee = isReverseAnnualFee;
	}
	public boolean isReverseFinanceCharge() {
		return isReverseFinanceCharge;
	}
	public void setReverseFinanceCharge(boolean isReverseFinanceCharge) {
		this.isReverseFinanceCharge = isReverseFinanceCharge;
	}
	public boolean isCreateZeroBalance() {
		return isCreateZeroBalance;
	}
	public void setCreateZeroBalance(boolean isCreateZeroBalance) {
		this.isCreateZeroBalance = isCreateZeroBalance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
	
	
	

	