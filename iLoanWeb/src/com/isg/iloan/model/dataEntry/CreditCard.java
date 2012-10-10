package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDITCARD")
public class CreditCard implements Serializable{ 
  
	
  private static final long serialVersionUID = -8445637465475836819L;
  
  @Id
  @SequenceGenerator(name="CREDITCARD_SEQ",sequenceName="CREDITCARD_SEQ",allocationSize=1)
  @GeneratedValue(generator="CREDITCARD_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="CREDITCARD_ID")  
  private long creditCardId;
  @Column(name="CREDITCARDNUM")
  private String creditCardNum;
  @Column(name="CREDITLIMIT")
  private long creditCardLimit;
  @Column(name="COMPANY")
  private String cardCompany;
  @Column(name="MEMBERDATE")
  private Date dateOfMembership;
  @Column(name="EXISTINGCARD")
  private boolean existingCreditCard;
  @Column(name="OTHERCARD")
  private boolean otherCreditCard;
  @Column(name="CARD_RANK")
  private int cardRank;
  
  @ManyToOne
  @JoinColumn(name="APP_ID")
  private Application application;
  
  
  
  
  
  public CreditCard(){}
  
  
	public long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public long getCreditCardLimit() {
		return creditCardLimit;
	}
	public void setCreditCardLimit(long creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}
	public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public Date getDateOfMembership() {
		return dateOfMembership;
	}
	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}
	public boolean isExistingCreditCard() {
		return existingCreditCard;
	}
	public void setExistingCreditCard(boolean existingCreditCard) {
		this.existingCreditCard = existingCreditCard;
	}
	public boolean isOtherCreditCard() {
		return otherCreditCard;
	}
	public void setOtherCreditCard(boolean otherCreditCard) {
		this.otherCreditCard = otherCreditCard;
	}


	public Application getApplication() {
		return application;
	}
	//added bidirectional relationship codes ---
	public void setApplication(Application application) {
		this.application = application;
		if(!application.getCreditCards().contains(this)){
			application.getCreditCards().add(this);
		}
	}


	public int getCardRank() {
		return cardRank;
	}


	public void setCardRank(int cardRank) {
		this.cardRank = cardRank;
	}



  
} //end class CreditCard 
