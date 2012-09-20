package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 ** Class Application
 **/

@Entity
@Table(name="APPLICATION")
public class Application implements Serializable{ 
	
  
  private static final long serialVersionUID = 7404651072498175937L;
//  @Id
//  @SequenceGenerator(name="SEQ_ID",sequenceName="SEQ_ID",allocationSize=1)
//  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Id
  @GenericGenerator(name="generator", strategy="increment")
  @GeneratedValue(generator="generator")
  private int id;
  
  @Column(name="APPID")
  @Id
  @GenericGenerator(name="generator", strategy="increment")
  @GeneratedValue(generator="generator")
  private int applicationId;
  
  @Column(name="ACCEPTCLASSICCARD")
  private boolean acceptClassicCard;
  
  @Column(name="ACCEPTSAVEANDSWIPE")
  private boolean acceptSaveAndSwipe;
  
  @Column(name="APPDATE")
  private Date dateOfApplication;
  
  @Column(name="CARDTYPECODE")
  private String cardTypeCode;
  
  @Column(name="CARDTYPEDESC")
  private String cardTypeDesc;
  
  @Column(name="APPSTATUS")
  private int appStatusCode;
  
  @Column(name="APPSTATUSDESC")
  private String appStatusDesc;
 
  @Column(name="ENROLLSOS")
  private boolean enrollSOS;
  
  
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Use this method for update.
	 * @param appBean
	 */
	public void copyProperties(Application appBean){
		
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

  
  

} 
