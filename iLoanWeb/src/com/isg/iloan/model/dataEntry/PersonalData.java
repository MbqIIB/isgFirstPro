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
@Table(name="PERSONALDATA")
public class PersonalData {
	
	@Id
	@SequenceGenerator(name="PERSONALDATA_SEQ",sequenceName="PERSONALDATA_SEQ",allocationSize=1)
	@GeneratedValue(generator="PERSONALDATA_SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name="PERSONALDATA_ID")
	private long personalDataId;
	@Column(name="FAMILYNAME")
	private String familyName;
	@Column(name="GIVENNAME")
	private String givenName;
	@Column(name="MIDDLENAME")
	private String middleName;
	@Column(name="CARDNAME")
	private String nameOnCard;
	@Column(name="BIRTHDATE")
	private Date birthDate;
	@Column(name="BIRTHPLACE")
	private String placeOfBirth;
	@Column(name="CIVILSTATUS")
	private String civilStatus;
	@Column(name="GENDER")
	private char gender;
	@Column(name="NATIONALITY")
	private String nationality;
	@Column(name="OTHERNATIONAL")
	private boolean otherNational;
	@Column(name="MOBILENUM")
	private String mobilePhoneNum;
	@Column(name="EMAIL")
	private String emailAddress;
	@Column(name="MOTHERNAME")
	private String motherFullName;
	@Column(name="CHILDREN")
	private int numOfChildren;
	@Column(name="HOME_OWNERSHIP")
	private String homeOwnership;
	@Column(name="LEN_STAY")
	private int lengthOfStays;
	@Column(name="CARS")
	private int numOfCars;
	@Column(name="CARMODEL")
	private String carModelYear;
	@Column(name="EDUCATION")
	private String education;
	@Column(name="TIN")
	private String tinNum;
	@Column(name="SSSNUM")
	private String sss_gsis_Num;
	@Column(name="SSSMEMBER")
	private boolean sssMember;
	@Column(name="GSISMEMBER")
	private boolean gsisMember;
	@Column(name="OTHER_ID_CODE")
	private String otherIdCode;
	@Column(name="OTHER_ID_VALUE")
	private String otherIdValue;
	@Column(name="PERSON_REF_NAME")
	private String personalRefName;
	@Column(name="PERSON_REF_REL")
	private String personalRefRelation;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="HOME_ADDR_ID")
	private Address homeAddress;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="PERM_ADDR_ID")
	private Address permanentAddress;	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="PERSON_REF_ADDR_ID")
	private Address personalRefAddress;
	
	public PersonalData(){}
	
	public PersonalData(String familyName, String givenName, String middleName) {
		super();
		this.familyName = familyName;
		this.givenName = givenName;
		this.middleName = middleName;
	}
	public String getName() {
		return familyName +", "+givenName+" "+middleName;
	}



	

	public long getPersonalDataId() {
		return personalDataId;
	}

	public void setPersonalDataId(long personalDataId) {
		this.personalDataId = personalDataId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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

	public String getMobilePhoneNum() {
		return mobilePhoneNum;
	}

	public void setMobilePhoneNum(String mobilePhoneNum) {
		this.mobilePhoneNum = mobilePhoneNum;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMotherFullName() {
		return motherFullName;
	}

	public void setMotherFullName(String motherFullName) {
		this.motherFullName = motherFullName;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getHomeOwnership() {
		return homeOwnership;
	}

	public void setHomeOwnership(String homeOwnership) {
		this.homeOwnership = homeOwnership;
	}

	public int getLengthOfStays() {
		return lengthOfStays;
	}

	public void setLengthOfStays(int lengthOfStays) {
		this.lengthOfStays = lengthOfStays;
	}

	public int getNumOfCars() {
		return numOfCars;
	}

	public void setNumOfCars(int numOfCars) {
		this.numOfCars = numOfCars;
	}

	public String getCarModelYear() {
		return carModelYear;
	}

	public void setCarModelYear(String carModelYear) {
		this.carModelYear = carModelYear;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTinNum() {
		return tinNum;
	}

	public void setTinNum(String tinNum) {
		this.tinNum = tinNum;
	}

	public String getSss_gsis_Num() {
		return sss_gsis_Num;
	}

	public void setSss_gsis_Num(String sss_gsis_Num) {
		this.sss_gsis_Num = sss_gsis_Num;
	}

	public boolean isSssMember() {
		return sssMember;
	}

	public void setSssMember(boolean sssMember) {
		this.sssMember = sssMember;
	}

	public boolean isGsisMember() {
		return gsisMember;
	}

	public void setGsisMember(boolean gsisMember) {
		this.gsisMember = gsisMember;
	}

	public String getOtherIdCode() {
		return otherIdCode;
	}

	public void setOtherIdCode(String otherIdCode) {
		this.otherIdCode = otherIdCode;
	}

	public String getOtherIdValue() {
		return otherIdValue;
	}

	public void setOtherIdValue(String otherIdValue) {
		this.otherIdValue = otherIdValue;
	}

	public String getPersonalRefName() {
		return personalRefName;
	}

	public void setPersonalRefName(String personalRefName) {
		this.personalRefName = personalRefName;
	}

	public String getPersonalRefRelation() {
		return personalRefRelation;
	}

	public void setPersonalRefRelation(String personalRefRelation) {
		this.personalRefRelation = personalRefRelation;
	}

	public Address getPersonalRefAddress() {
		return personalRefAddress;
	}

	public void setPersonalRefAddress(Address personalRefAddress) {
		this.personalRefAddress = personalRefAddress;
	}

	

	// Constructors

	// Methods

	// Inner classes

} // end class PersonalData
