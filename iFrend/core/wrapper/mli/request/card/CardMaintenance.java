package com.isg.ifrend.wrapper.mli.request.card;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CardMaintenance")
public class CardMaintenance {

	private String cardNumber;
	private String accountNumber;
	
	private String embossserName;
	private String status;
	@XmlElement(name="birthDate")
	private Date birthDate;
	@XmlElement(name="expiryDate")
	private Date expiryDate;
	private String cardMaintAction;
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
	
	
}
