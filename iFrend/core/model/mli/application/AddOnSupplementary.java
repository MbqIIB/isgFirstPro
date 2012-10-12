package com.isg.ifrend.core.model.mli.application;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * Bean class for add-on supplementary.
 *
 */
public class AddOnSupplementary  implements Serializable {
	
	private static final long serialVersionUID = -7331758641022486884L;
	
	private String prefix;
	private String lastname;
	private String firtsname;
	private String middlename;

	private Date dateOfBirth;
	private String gender;
	private String civilStatus;
	private String relationToPrimary;

	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String cityState;
	private String country;
	private String zipCode;
	private String homePhone;
	private String mobileNumber;
	private String officePhone;
	
	private String idTypeNbr;
	private BigDecimal income;
	private String emmboserName;
	private BigDecimal creditLimit;
	private BigDecimal cashCreditLimit;
	
	
	
	public  AddOnSupplementary(){
		
	}
	
	public AddOnSupplementary(String prefix, String lastname, String firtsname,
			String middlename, Date dateOfBirth, String gender,
			String civilStatus, String relationToPrimary, String addressLine1,
			String addressLine2, String addressLine3, String cityState,
			String country, String zipCode, String homePhone,
			String mobileNumber, String officePhone, String idTypeNbr,
			BigDecimal income, String emmboserName, BigDecimal creditLimit,
			BigDecimal cashCreditLimit) {
		super();
		this.prefix = prefix;
		this.lastname = lastname;
		this.firtsname = firtsname;
		this.middlename = middlename;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.civilStatus = civilStatus;
		this.relationToPrimary = relationToPrimary;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.cityState = cityState;
		this.country = country;
		this.zipCode = zipCode;
		this.homePhone = homePhone;
		this.mobileNumber = mobileNumber;
		this.officePhone = officePhone;
		this.idTypeNbr = idTypeNbr;
		this.income = income;
		this.emmboserName = emmboserName;
		this.creditLimit = creditLimit;
		this.cashCreditLimit = cashCreditLimit;
	}

	/** getter and setter **/
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getRelationToPrimary() {
		return relationToPrimary;
	}

	public void setRelationToPrimary(String relationToPrimary) {
		this.relationToPrimary = relationToPrimary;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCityState() {
		return cityState;
	}

	public void setCityState(String cityState) {
		this.cityState = cityState;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getIdTypeNbr() {
		return idTypeNbr;
	}

	public void setIdTypeNbr(String idTypeNbr) {
		this.idTypeNbr = idTypeNbr;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public String getEmmboserName() {
		return emmboserName;
	}

	public void setEmmboserName(String emmboserName) {
		this.emmboserName = emmboserName;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCashCreditLimit() {
		return cashCreditLimit;
	}

	public void setCashCreditLimit(BigDecimal cashCreditLimit) {
		this.cashCreditLimit = cashCreditLimit;
	}
	 
	
	

	

	
	
	

	

}
