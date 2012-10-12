package com.isg.ifrend.core.model.mli.card;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Bean class for LostStolenReport
 * 
 * card type{ Visa , MasterCard }
 *
 */
public class LostStolenReport implements Serializable  {
	private static final long serialVersionUID = -2367202963473123611L;

	private String cardNumber;
	
	private String cardType; 
	private String action;
	private Date dateReported;
	private Date timeReported;
	private Date purgeDate;
	private String reasonCode;
	private String actionCode;
	private String cwbRegion;
	private boolean isDeleted;
	private String operatorId;
	private String blockcode;

	/** transfer account **/	
	private boolean isTransferAccount;
	private String newAccountNumber;
	private Date effectiveDateTransfer;
	
	
	public LostStolenReport(){
		
	}

	public LostStolenReport(String cardNumber, String cardType, String action,
			Date dateReported, Date timeReported, Date purgeDate,
			String reasonCode, String actionCode, String cwbRegion,
			boolean isDeleted, String operatorId, String blockcode,
			boolean isTransferAccount, String newAccountNumber,
			Date effectiveDateTransfer) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.action = action;
		this.dateReported = dateReported;
		this.timeReported = timeReported;
		this.purgeDate = purgeDate;
		this.reasonCode = reasonCode;
		this.actionCode = actionCode;
		this.cwbRegion = cwbRegion;
		this.isDeleted = isDeleted;
		this.operatorId = operatorId;
		this.blockcode = blockcode;
		this.isTransferAccount = isTransferAccount;
		this.newAccountNumber = newAccountNumber;
		this.effectiveDateTransfer = effectiveDateTransfer;
	}
	
	/** getter and setter **/

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getDateReported() {
		return dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}

	public Date getTimeReported() {
		return timeReported;
	}

	public void setTimeReported(Date timeReported) {
		this.timeReported = timeReported;
	}

	public Date getPurgeDate() {
		return purgeDate;
	}

	public void setPurgeDate(Date purgeDate) {
		this.purgeDate = purgeDate;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getCwbRegion() {
		return cwbRegion;
	}

	public void setCwbRegion(String cwbRegion) {
		this.cwbRegion = cwbRegion;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getBlockcode() {
		return blockcode;
	}

	public void setBlockcode(String blockcode) {
		this.blockcode = blockcode;
	}

	public boolean isTransferAccount() {
		return isTransferAccount;
	}

	public void setTransferAccount(boolean isTransferAccount) {
		this.isTransferAccount = isTransferAccount;
	}

	public String getNewAccountNumber() {
		return newAccountNumber;
	}

	public void setNewAccountNumber(String newAccountNumber) {
		this.newAccountNumber = newAccountNumber;
	}

	public Date getEffectiveDateTransfer() {
		return effectiveDateTransfer;
	}

	public void setEffectiveDateTransfer(Date effectiveDateTransfer) {
		this.effectiveDateTransfer = effectiveDateTransfer;
	}
	
}
