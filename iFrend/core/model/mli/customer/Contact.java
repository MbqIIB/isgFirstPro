package com.isg.ifrend.core.model.mli.customer;

import java.io.Serializable;

/**
 * Bean class for contact.
 * 
 */
public class Contact implements Serializable {
	private static final long serialVersionUID = -5878815090903155002L;

	private String customerNumber;
	
	private String homeTelephone;
	private String businessTelephone;
	private boolean isPhonePlaceEmployee;
	private String mobile;
	private String otherTelephone;
	private String faxNumber;
	private String emailAddress;
	
	
	public Contact(){
		
	}
	
	public Contact(String customerNumber, String homeTelephone,
			String businessTelephone, boolean isPhonePlaceEmployee,
			String mobile, String otherTelephone, String faxNumber,
			String emailAddress) {
		this.customerNumber = customerNumber;
		this.homeTelephone = homeTelephone;
		this.businessTelephone = businessTelephone;
		this.isPhonePlaceEmployee = isPhonePlaceEmployee;
		this.mobile = mobile;
		this.otherTelephone = otherTelephone;
		this.faxNumber = faxNumber;
		this.emailAddress = emailAddress;
	}

	/**getter and setter **/
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getHomeTelephone() {
		return homeTelephone;
	}
	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}
	public String getBusinessTelephone() {
		return businessTelephone;
	}
	public void setBusinessTelephone(String businessTelephone) {
		this.businessTelephone = businessTelephone;
	}
	public boolean isPhonePlaceEmployee() {
		return isPhonePlaceEmployee;
	}
	public void setPhonePlaceEmployee(boolean isPhonePlaceEmployee) {
		this.isPhonePlaceEmployee = isPhonePlaceEmployee;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOtherTelephone() {
		return otherTelephone;
	}
	public void setOtherTelephone(String otherTelephone) {
		this.otherTelephone = otherTelephone;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
