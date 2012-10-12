package com.isg.ifrend.core.model.mli.dto;


public class CustomerDTO {

	private String customerNum;	
	private String applicationNum;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String phoneNum;
	private String userData;
	private char searchFlag; //C - card, A -application
	private String dateOfBirth;
	
	/** below are the editable
	 ** fields in customer model 
	 ** that could possibly part of the request to MLI,
	 *  add the field here you want to include in MLI request**/
	
	private String custNameLine1;
	private String custNameLine2;
	private String custNameLine3;
	
	private int  billCycle;	
	
	private String ssTaxOwner;
	private String ssTaxOwnerIndicator;
	private String ssTaxOwnerBirthDate;
	
	private String ssTaxCoOwner;
	private String ssTaxCoOwnerIndicator;
	private String ssTaxtCoOwnerBirthDate;
	
	private String empOwner;
	private String empCoOwner;
	
	
	
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	public String getApplicationNum() {
		return applicationNum;
	}
	public void setApplicationNum(String applicationNum) {
		this.applicationNum = applicationNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public char getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getUserData() {
		return userData;
	}
	public void setUserData(String userData) {
		this.userData = userData;
	}
	public char getSearchFlag() {
		return searchFlag;
	}
	public void setSearchFlag(char searchFlag) {
		this.searchFlag = searchFlag;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCustNameLine1() {
		return custNameLine1;
	}
	public void setCustNameLine1(String custNameLine1) {
		this.custNameLine1 = custNameLine1;
	}
	public String getCustNameLine2() {
		return custNameLine2;
	}
	public void setCustNameLine2(String custNameLine2) {
		this.custNameLine2 = custNameLine2;
	}
	public String getCustNameLine3() {
		return custNameLine3;
	}
	public void setCustNameLine3(String custNameLine3) {
		this.custNameLine3 = custNameLine3;
	}
	public int getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(int billCycle) {
		this.billCycle = billCycle;
	}
	public String getSsTaxOwner() {
		return ssTaxOwner;
	}
	public void setSsTaxOwner(String ssTaxOwner) {
		this.ssTaxOwner = ssTaxOwner;
	}
	public String getSsTaxOwnerIndicator() {
		return ssTaxOwnerIndicator;
	}
	public void setSsTaxOwnerIndicator(String ssTaxOwnerIndicator) {
		this.ssTaxOwnerIndicator = ssTaxOwnerIndicator;
	}
	public String getSsTaxOwnerBirthDate() {
		return ssTaxOwnerBirthDate;
	}
	public void setSsTaxOwnerBirthDate(String ssTaxOwnerBirthDate) {
		this.ssTaxOwnerBirthDate = ssTaxOwnerBirthDate;
	}
	public String getSsTaxCoOwner() {
		return ssTaxCoOwner;
	}
	public void setSsTaxCoOwner(String ssTaxCoOwner) {
		this.ssTaxCoOwner = ssTaxCoOwner;
	}
	public String getSsTaxCoOwnerIndicator() {
		return ssTaxCoOwnerIndicator;
	}
	public void setSsTaxCoOwnerIndicator(String ssTaxCoOwnerIndicator) {
		this.ssTaxCoOwnerIndicator = ssTaxCoOwnerIndicator;
	}
	public String getSsTaxtCoOwnerBirthDate() {
		return ssTaxtCoOwnerBirthDate;
	}
	public void setSsTaxtCoOwnerBirthDate(String ssTaxtCoOwnerBirthDate) {
		this.ssTaxtCoOwnerBirthDate = ssTaxtCoOwnerBirthDate;
	}
	public String getEmpOwner() {
		return empOwner;
	}
	public void setEmpOwner(String empOwner) {
		this.empOwner = empOwner;
	}
	public String getEmpCoOwner() {
		return empCoOwner;
	}
	public void setEmpCoOwner(String empCoOwner) {
		this.empCoOwner = empCoOwner;
	}
	
	
}
