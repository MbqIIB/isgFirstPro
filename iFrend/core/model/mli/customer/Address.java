package com.isg.ifrend.core.model.mli.customer;

import java.io.Serializable;
import java.util.Date;
/**
 * Bean class for address.
 * 
 */
public class Address  implements Serializable  {

	private static final long serialVersionUID = -2558696208509900051L;

	private String customerNumber;
	
	private boolean isbillToAddress;	
	private String addressLinea3;
	private String city;
	private String stateCountry;
	private String zip;
	
	private String otherAddrLine1;
	private String otherAddrLine2;
	private String otherAddrLine3;
	
	private String otherCity;
	private String otherStateCountry;
	private String otherZip;
	private Date otherExpiryDate;
	
	private Boolean isUsageStatement;
	private Boolean isUsageCollection;
	private Boolean isUsageUsage9;
	private Boolean isUsagePinMailer;
	private Boolean isUsageUsage6;
	private Boolean isUsageUsage10;
	private Boolean isUsageDirectMail;
	private Boolean isUsageUsage7;
	private Boolean isUsageUsage11;
	private Boolean isUsageCardMailer;
	private Boolean isUsageUsage8;
	private Boolean isUsageUsage12;
	
	
	public Address(){
		
	}
	
	public Address(String customerNumber, boolean isbillToAddress,
			String addressLinea3, String city, String stateCountry, String zip,
			String otherAddrLine1, String otherAddrLine2,
			String otherAddrLine3, String otherCity, String otherStateCountry,
			String otherZip, Date otherExpiryDate, Boolean isUsageStatement,
			Boolean isUsageCollection, Boolean isUsageUsage9,
			Boolean isUsagePinMailer, Boolean isUsageUsage6,
			Boolean isUsageUsage10, Boolean isUsageDirectMail,
			Boolean isUsageUsage7, Boolean isUsageUsage11,
			Boolean isUsageCardMailer, Boolean isUsageUsage8,
			Boolean isUsageUsage12) {
	
		this.customerNumber = customerNumber;
		this.isbillToAddress = isbillToAddress;
		this.addressLinea3 = addressLinea3;
		this.city = city;
		this.stateCountry = stateCountry;
		this.zip = zip;
		this.otherAddrLine1 = otherAddrLine1;
		this.otherAddrLine2 = otherAddrLine2;
		this.otherAddrLine3 = otherAddrLine3;
		this.otherCity = otherCity;
		this.otherStateCountry = otherStateCountry;
		this.otherZip = otherZip;
		this.otherExpiryDate = otherExpiryDate;
		this.isUsageStatement = isUsageStatement;
		this.isUsageCollection = isUsageCollection;
		this.isUsageUsage9 = isUsageUsage9;
		this.isUsagePinMailer = isUsagePinMailer;
		this.isUsageUsage6 = isUsageUsage6;
		this.isUsageUsage10 = isUsageUsage10;
		this.isUsageDirectMail = isUsageDirectMail;
		this.isUsageUsage7 = isUsageUsage7;
		this.isUsageUsage11 = isUsageUsage11;
		this.isUsageCardMailer = isUsageCardMailer;
		this.isUsageUsage8 = isUsageUsage8;
		this.isUsageUsage12 = isUsageUsage12;
	}




	/** getter/setter */
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public boolean isIsbillToAddress() {
		return isbillToAddress;
	}
	public void setIsbillToAddress(boolean isbillToAddress) {
		this.isbillToAddress = isbillToAddress;
	}
	public String getAddressLinea3() {
		return addressLinea3;
	}
	public void setAddressLinea3(String addressLinea3) {
		this.addressLinea3 = addressLinea3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCountry() {
		return stateCountry;
	}
	public void setStateCountry(String stateCountry) {
		this.stateCountry = stateCountry;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getOtherAddrLine1() {
		return otherAddrLine1;
	}
	public void setOtherAddrLine1(String otherAddrLine1) {
		this.otherAddrLine1 = otherAddrLine1;
	}
	public String getOtherAddrLine2() {
		return otherAddrLine2;
	}
	public void setOtherAddrLine2(String otherAddrLine2) {
		this.otherAddrLine2 = otherAddrLine2;
	}
	public String getOtherAddrLine3() {
		return otherAddrLine3;
	}
	public void setOtherAddrLine3(String otherAddrLine3) {
		this.otherAddrLine3 = otherAddrLine3;
	}
	public String getOtherCity() {
		return otherCity;
	}
	public void setOtherCity(String otherCity) {
		this.otherCity = otherCity;
	}
	public String getOtherStateCountry() {
		return otherStateCountry;
	}
	public void setOtherStateCountry(String otherStateCountry) {
		this.otherStateCountry = otherStateCountry;
	}
	public String getOtherZip() {
		return otherZip;
	}
	public void setOtherZip(String otherZip) {
		this.otherZip = otherZip;
	}
	public Date getOtherExpiryDate() {
		return otherExpiryDate;
	}
	public void setOtherExpiryDate(Date otherExpiryDate) {
		this.otherExpiryDate = otherExpiryDate;
	}
	public Boolean getIsUsageStatement() {
		return isUsageStatement;
	}
	public void setIsUsageStatement(Boolean isUsageStatement) {
		this.isUsageStatement = isUsageStatement;
	}
	public Boolean getIsUsageCollection() {
		return isUsageCollection;
	}
	public void setIsUsageCollection(Boolean isUsageCollection) {
		this.isUsageCollection = isUsageCollection;
	}
	public Boolean getIsUsageUsage9() {
		return isUsageUsage9;
	}
	public void setIsUsageUsage9(Boolean isUsageUsage9) {
		this.isUsageUsage9 = isUsageUsage9;
	}
	public Boolean getIsUsagePinMailer() {
		return isUsagePinMailer;
	}
	public void setIsUsagePinMailer(Boolean isUsagePinMailer) {
		this.isUsagePinMailer = isUsagePinMailer;
	}
	public Boolean getIsUsageUsage6() {
		return isUsageUsage6;
	}
	public void setIsUsageUsage6(Boolean isUsageUsage6) {
		this.isUsageUsage6 = isUsageUsage6;
	}
	public Boolean getIsUsageUsage10() {
		return isUsageUsage10;
	}
	public void setIsUsageUsage10(Boolean isUsageUsage10) {
		this.isUsageUsage10 = isUsageUsage10;
	}
	public Boolean getIsUsageDirectMail() {
		return isUsageDirectMail;
	}
	public void setIsUsageDirectMail(Boolean isUsageDirectMail) {
		this.isUsageDirectMail = isUsageDirectMail;
	}
	public Boolean getIsUsageUsage7() {
		return isUsageUsage7;
	}
	public void setIsUsageUsage7(Boolean isUsageUsage7) {
		this.isUsageUsage7 = isUsageUsage7;
	}
	public Boolean getIsUsageUsage11() {
		return isUsageUsage11;
	}
	public void setIsUsageUsage11(Boolean isUsageUsage11) {
		this.isUsageUsage11 = isUsageUsage11;
	}
	public Boolean getIsUsageCardMailer() {
		return isUsageCardMailer;
	}
	public void setIsUsageCardMailer(Boolean isUsageCardMailer) {
		this.isUsageCardMailer = isUsageCardMailer;
	}
	public Boolean getIsUsageUsage8() {
		return isUsageUsage8;
	}
	public void setIsUsageUsage8(Boolean isUsageUsage8) {
		this.isUsageUsage8 = isUsageUsage8;
	}
	public Boolean getIsUsageUsage12() {
		return isUsageUsage12;
	}
	public void setIsUsageUsage12(Boolean isUsageUsage12) {
		this.isUsageUsage12 = isUsageUsage12;
	}
}
