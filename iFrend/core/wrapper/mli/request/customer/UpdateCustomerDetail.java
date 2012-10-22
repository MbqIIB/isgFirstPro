package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UpdateCustomerDetail")
public class UpdateCustomerDetail {

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
