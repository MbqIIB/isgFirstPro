package com.isg.iloan.model.dataEntry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 ** Class Address
 **/
@Entity
@Table(name="ADDRESS")
public class Address { 
 
  @Id
  @SequenceGenerator(name="ADDRESS_SEQ",sequenceName="ADDRESS_SEQ",allocationSize=1)
  @GeneratedValue(generator="ADDRESS_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="ADDRESS_ID")
  private long addressId;
  //private int personalDataId;
  //note: no need to place personalDataId here, addressId should be present in PERSONALDATA table
  @Column(name="ADDRESSLINE1")
  private String addressLine1;
  @Column(name="ZIPCODE")
  private int zipCode;
  @Column(name="HOMEADDRESS")
  private boolean isHomeAddress;
  @Column(name="PERMADDRESS")
  private boolean isPermanentAddress;
  @Column(name="TELNUM")
  private String telNum;
 

  
  
  
  
  //Constructors
  public Address(){}





public long getAddressId() {
	return addressId;
}





public void setAddressId(long addressId) {
	this.addressId = addressId;
}
public String getAddressLine1() {
	return addressLine1;
}


public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public int getZipCode() {
	return zipCode;
}


public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}


public String getTelNum() {
	return telNum;
}
public void setTelNum(String telNum) {
	this.telNum = telNum;
}


public boolean isHomeAddress() {
	return isHomeAddress;
}

public void setHomeAddress(boolean isHomeAddress) {
	this.isHomeAddress = isHomeAddress;
}
public boolean isPermanentAddress() {
	return isPermanentAddress;
}
public void setPermanentAddress(boolean isPermanentAddress) {
	this.isPermanentAddress = isPermanentAddress;
}

  //Methods

  //Inner classes

} //end class Address 
