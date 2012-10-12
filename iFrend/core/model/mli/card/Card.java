package com.isg.ifrend.core.model.mli.card;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 
 * Bean class for Card
 *
 */
public class Card   implements Serializable {

	private static final long serialVersionUID = -8207828755179599544L;
	
	private String cardNumber;
	private String accountNumber;
	
	private String embossserName;
	private String status;
	private Date birthDate;
	private Date expiryDate;
	private String cardMaintAction;

	List <LostStolenReport> lostStolenReport;
	
	public Card(){
		
	}

	public Card(String cardNumber, String accountNumber, String embossserName,
			String status, Date birthDate, Date expiryDate,
			String cardMaintAction, List<LostStolenReport> lostStolenReport) {
		super();
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.embossserName = embossserName;
		this.status = status;
		this.birthDate = birthDate;
		this.expiryDate = expiryDate;
		this.cardMaintAction = cardMaintAction;
		this.lostStolenReport = lostStolenReport;
	}

	/** getter and setter **/
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmbossserName() {
		return embossserName;
	}

	public void setEmbossserName(String embossserName) {
		this.embossserName = embossserName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardMaintAction() {
		return cardMaintAction;
	}

	public void setCardMaintAction(String cardMaintAction) {
		this.cardMaintAction = cardMaintAction;
	}

	public List<LostStolenReport> getLostStolenReport() {
		return lostStolenReport;
	}

	public void setLostStolenReport(List<LostStolenReport> lostStolenReport) {
		this.lostStolenReport = lostStolenReport;
	}
	
	
	
	
	

}
