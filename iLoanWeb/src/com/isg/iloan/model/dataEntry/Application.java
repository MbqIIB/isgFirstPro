package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;

/**
 ** Class Application
 **/
public class Application implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5891929745910949512L;
	// Fields
	private int id;
	private int applicationId;
	private boolean acceptClassicCard;
	private boolean acceptSaveAndSwipe;
	private Date dateOfApplication;
	private String cardTypeCode;
	private String cardTypeDesc;
	private int appStatusCode;
	private String appStatusDesc;
	private boolean enrollSOS;

	public Application(Date dateOfApplication, String cardTypeDesc,
			String appStatusDesc) {
		super();
		this.dateOfApplication = dateOfApplication;
		this.cardTypeDesc = cardTypeDesc;
		this.appStatusDesc = appStatusDesc;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public boolean isAcceptClassicCard() {
		return acceptClassicCard;
	}

	public void setAcceptClassicCard(boolean acceptClassicCard) {
		this.acceptClassicCard = acceptClassicCard;
	}

	public boolean isAcceptSaveAndSwipe() {
		return acceptSaveAndSwipe;
	}

	public void setAcceptSaveAndSwipe(boolean acceptSaveAndSwipe) {
		this.acceptSaveAndSwipe = acceptSaveAndSwipe;
	}

	public Date getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getCardTypeCode() {
		return cardTypeCode;
	}

	public void setCardTypeCode(String cardTypeCode) {
		this.cardTypeCode = cardTypeCode;
	}

	public String getCardTypeDesc() {
		return cardTypeDesc;
	}

	public void setCardTypeDesc(String cardTypeDesc) {
		this.cardTypeDesc = cardTypeDesc;
	}

	public int getAppStatusCode() {
		return appStatusCode;
	}

	public void setAppStatusCode(int appStatusCode) {
		this.appStatusCode = appStatusCode;
	}

	public String getAppStatusDesc() {
		return appStatusDesc;
	}

	public void setAppStatusDesc(String appStatusDesc) {
		this.appStatusDesc = appStatusDesc;
	}

	public boolean isEnrollSOS() {
		return enrollSOS;
	}

	public void setEnrollSOS(boolean enrollSOS) {
		this.enrollSOS = enrollSOS;
	}

	// Constructors

	// Methods

	// Inner classes

} // end class Application
