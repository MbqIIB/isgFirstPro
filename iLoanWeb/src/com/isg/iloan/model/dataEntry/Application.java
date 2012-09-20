package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.apache.log4j.Logger;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.engine.CascadeStyle;

import com.isg.iloan.controller.functions.dataEntry.CreditCardDetailsViewCtrl;

/**
 ** Class Application
 **/

//@Table(name="APPLICATION",
//		uniqueConstraints = @UniqueConstraint(columnNames="CARDTYPECODE,APPSTATUS")
//	)


@Entity
@Table(name="APPLICATION")
public class Application implements Serializable{ 
	
	private static Logger logger = Logger.getLogger(Application.class);
	
  private static final long serialVersionUID = 7404651072498175937L;
 
//  @Id
//  @GenericGenerator(name="generator", strategy="increment")
//  @GeneratedValue(generator="generator")
  
  
  @Id
  @SequenceGenerator(name="APPLICATION_SEQUENCE",sequenceName="APPLICATION_SEQUENCE",allocationSize=1)
  @GeneratedValue(generator="APPLICATION_SEQUENCE", strategy = GenerationType.SEQUENCE)  
  @Column(name="APPID")
  private int applicationId;
    
  @Column(name="ACCEPTCLASSICCARD")
  private boolean acceptClassicCard;  
  @Column(name="ACCEPTSAVEANDSWIPE")
  private boolean acceptSaveAndSwipe;  
  //@Temporal(TemporalType.TIMESTAMP)
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
  
  

  @Column(name="JOB_DETAIL_ID")
  private int jobDetailId;
  
  
  @OneToOne(cascade=CascadeType.ALL)
  @PrimaryKeyJoinColumn(name="APPID", referencedColumnName="JOB_DETAIL_ID")
  private JobDetail jobDetail;
  
  
  
  public Application() {
		super();
		
	}

	/**
	 * Use this method for update.
	 * @param appBean
	 */
	public void copyProperties(Application appBean){}

	
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
	
	

	public JobDetail getJobDetail() {
		return jobDetail;
	}

	public void setJobDetail(JobDetail jobDetail) {
		this.jobDetail = jobDetail;
	}

	
	public int getJobDetailId() {		
		return jobDetailId;
	}

	public void setJobDetailId(int jobDetailId) {
		this.jobDetailId = jobDetailId;
	}

  
  

} 
