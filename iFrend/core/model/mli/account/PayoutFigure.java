package com.isg.ifrend.core.model.mli.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * Bean class for pay-out figure.
 *
 */
public class PayoutFigure implements Serializable {
	
	private static final long serialVersionUID = 7565322301894718559L;
	
	private String accountNumber;
	private String cardNumber;
	private String customerNumber;
	
	private String shortName;
	private Date payoutDate;
	private String accountStatus;
	private Date lastAccrualDate;
	private Date lastPaymentDate;
	private BigDecimal interestPerDiem;
	
	public PayoutFigure(){
		
	}
	
	public PayoutFigure(String accountNumber, String cardNumber,
			String customerNumber, String shortName, Date payoutDate,
			String accountStatus, Date lastAccrualDate, Date lastPaymentDate,
			BigDecimal interestPerDiem) {

		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.customerNumber = customerNumber;
		this.shortName = shortName;
		this.payoutDate = payoutDate;
		this.accountStatus = accountStatus;
		this.lastAccrualDate = lastAccrualDate;
		this.lastPaymentDate = lastPaymentDate;
		this.interestPerDiem = interestPerDiem;
	}
	
	/** setter and getter **/
	
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Date getPayoutDate() {
		return payoutDate;
	}
	public void setPayoutDate(Date payoutDate) {
		this.payoutDate = payoutDate;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Date getLastAccrualDate() {
		return lastAccrualDate;
	}
	public void setLastAccrualDate(Date lastAccrualDate) {
		this.lastAccrualDate = lastAccrualDate;
	}
	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	public BigDecimal getInterestPerDiem() {
		return interestPerDiem;
	}
	public void setInterestPerDiem(BigDecimal interestPerDiem) {
		this.interestPerDiem = interestPerDiem;
	}
	
	


}
