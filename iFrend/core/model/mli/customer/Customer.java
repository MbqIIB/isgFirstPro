package com.isg.ifrend.core.model.mli.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.isg.ifrend.core.model.mli.account.Account;
/**
 * Bean class for customer.
 * 
 */
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 6864448739583163478L;
	
	/** identification  details **/
	private String customerNumber;	
	private String lastname;
	private String firstname;
	private String middlename;
	private String phoneNumber;
	private String dateOfBirth;
	private String userData;
	private String userOrganization;

	/** personal details **/
	private String custNameLine1;
	private String custNameLine2;
	private String custNameLine3;
	
	private Date  membershipDate;
	private String status;
	private int  billCycle;
	
	private String ssTaxOwner;
	private String ssTaxOwnerIndicator;
	private String ssTaxOwnerBirthDate;
	
	private String ssTaxCoOwner;
	private String ssTaxCoOwnerIndicator;
	private String ssTaxtCoOwnerBirthDate;
	
	private String empOwner;
	private String empCoOwner;
	private Date  lastMaintaned;
	
	List<Account>  accountList;
	
	
	public Customer(){
		
	}

	public Customer(String customerNumber, String lastname, String firstname,
			String middlename, String phoneNumber, String dateOfBirth,
			String userData, String userOrganization, String custNameLine1,
			String custNameLine2, String custNameLine3, Date membershipDate,
			String status, int billCycle, String ssTaxOwner,
			String ssTaxOwnerIndicator, String ssTaxOwnerBirthDate,
			String ssTaxCoOwner, String ssTaxCoOwnerIndicator,
			String ssTaxtCoOwnerBirthDate, String empOwner, String empCoOwner,
			Date lastMaintaned, List<Account> accountList) {
		this.customerNumber = customerNumber;
		this.lastname = lastname;
		this.firstname = firstname;
		this.middlename = middlename;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.userData = userData;
		this.userOrganization = userOrganization;
		this.custNameLine1 = custNameLine1;
		this.custNameLine2 = custNameLine2;
		this.custNameLine3 = custNameLine3;
		this.membershipDate = membershipDate;
		this.status = status;
		this.billCycle = billCycle;
		this.ssTaxOwner = ssTaxOwner;
		this.ssTaxOwnerIndicator = ssTaxOwnerIndicator;
		this.ssTaxOwnerBirthDate = ssTaxOwnerBirthDate;
		this.ssTaxCoOwner = ssTaxCoOwner;
		this.ssTaxCoOwnerIndicator = ssTaxCoOwnerIndicator;
		this.ssTaxtCoOwnerBirthDate = ssTaxtCoOwnerBirthDate;
		this.empOwner = empOwner;
		this.empCoOwner = empCoOwner;
		this.lastMaintaned = lastMaintaned;
		this.accountList = accountList;
	}

	/** getter and setter **/
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}
	
	
	public String getUserOrganization() {
		return userOrganization;
	}

	public void setUserOrganization(String userOrganization) {
		this.userOrganization = userOrganization;
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

	public Date getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(Date membershipDate) {
		this.membershipDate = membershipDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Date getLastMaintaned() {
		return lastMaintaned;
	}

	public void setLastMaintaned(Date lastMaintaned) {
		this.lastMaintaned = lastMaintaned;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	
	
}
