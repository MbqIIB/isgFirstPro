package com.isg.iloan.model.dataEntry;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLEMENTARY")
public class Supplementary { 
  
  @Id
  @SequenceGenerator(name="SUPPLEMENTARY_SEQ",sequenceName="SUPPLEMENTARY_SEQ",allocationSize=1)
  @GeneratedValue(generator="SUPPLEMENTARY_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="SUPP_ID")
  private long supplementaryId;
  @Column(name="FAMILYNAME")
  private String familyName;
  @Column(name="GIVENNAME")
  private String givenName;
  @Column(name="MIDDLENAME")
  private String middleName;
  @Column(name="CARDNAME")
  private String nameOnCard;
  @Column(name="REL_TO_PRINC")
  private String relationToPrincipal;
  @Column(name="NATIONALITY")
  private String nationality;
  @Column(name="OTHERNATIONAL")
  private boolean otherNational;
  @Column(name="BIRTHDATE")
  private Date birthDate;
  @Column(name="GENDER")
  private char gender;

  @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
  @JoinColumn(name="ADDRESS_ID")
  private Address homeAddress;
  
  
  //Constructors
  public Supplementary(){}

public long getSupplementaryId() {
	return supplementaryId;
}

public void setSupplementaryId(long supplementaryId) {
	this.supplementaryId = supplementaryId;
}

public String getFamilyName() {
	return familyName;
}

public void setFamilyName(String familyName) {
	this.familyName = familyName;
}

public String getGivenName() {
	return givenName;
}

public void setGivenName(String givenName) {
	this.givenName = givenName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getNameOnCard() {
	return nameOnCard;
}

public void setNameOnCard(String nameOnCard) {
	this.nameOnCard = nameOnCard;
}

public Address getHomeAddress() {
	return homeAddress;
}

public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}

public String getRelationToPrincipal() {
	return relationToPrincipal;
}

public void setRelationToPrincipal(String relationToPrincipal) {
	this.relationToPrincipal = relationToPrincipal;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public boolean isOtherNational() {
	return otherNational;
}

public void setOtherNational(boolean otherNational) {
	this.otherNational = otherNational;
}

public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public char getGender() {
	return gender;
}
public void setGender(char gender){
	this.gender = gender;
}

  //Methods

  //Inner classes

} //end class Supplementary 
