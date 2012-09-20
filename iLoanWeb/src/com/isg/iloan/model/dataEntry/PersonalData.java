package com.isg.iloan.model.dataEntry;

import java.util.Date;

/**
 ** Class PersonalData
 **/
public class PersonalData {
	// Fields
	private int id;
	private int personalDataId;
	private int applicationId;
	private String familyName;
	private String givenName;
	private String middleName;
	private String nameOnCard;

	
	
	public PersonalData(String familyName, String givenName, String middleName) {
		super();
		this.familyName = familyName;
		this.givenName = givenName;
		this.middleName = middleName;
	}

	
	public String getName() {
		return familyName +", "+givenName+" "+middleName;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonalDataId() {
		return personalDataId;
	}

	public void setPersonalDataId(int personalDataId) {
		this.personalDataId = personalDataId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	private Date birthDate;
	private String placeOfBirth;
	private String civilStatus;
	private String gender;
	private String nationality;
	private boolean otherNational;
	private String mobilePhoneNum;
	private String emailAddress;
	private String motherFullName;
	private int numOfChildren;
	private Address homeAddress;
	private Address permanentAddress;
	private String homeOwnership;
	private int lengthOfStays;
	private int numOfCars;
	private String carModelYear;
	private String education;
	private String tinNum;
	private String sss_gsis_Num;
	private boolean sssMember;
	private boolean gsisMember;
	private String otherIdCode;
	private String otherIdValue;
	private String personalRefName;
	private String personalRefRelation;
	private Address personalRefAddress;

	// Constructors

	// Methods

	// Inner classes

} // end class PersonalData
