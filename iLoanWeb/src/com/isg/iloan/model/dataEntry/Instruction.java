package com.isg.iloan.model.dataEntry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="INSTRUCTION")
public class Instruction { 
	
  @Id
  @SequenceGenerator(name="INSTRUCTION_SEQ",sequenceName="INSTRUCTION_SEQ",allocationSize=1)
  @GeneratedValue(generator="INSTRUCTION_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="INSTRUCTION_ID")
  private long instructionId;
  @Column(name="DELIVERY_PLACE")
  private String deliveryPlace;
  @Column(name="PAYMENTMODE")
  private String paymentMode;
  @Column(name="ADA_ACCNT_NUM")
  private String adaAccountNum;
  @Column(name="ADA_BANK_BRANCH")
  private String adaBankBranch;
  @Column(name="MIN_AMOUNT")
  private boolean minAmountDue;
  @Column(name="TOTAL_AMOUNT")
  private boolean totalAmountDue;

  
  
  //Constructors
  public Instruction(){}



public long getInstructionId() {
	return instructionId;
}



public void setInstructionId(long instructionId) {
	this.instructionId = instructionId;
}



public String getDeliveryPlace() {
	return deliveryPlace;
}



public void setDeliveryPlace(String deliveryPlace) {
	this.deliveryPlace = deliveryPlace;
}



public String getPaymentMode() {
	return paymentMode;
}



public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}



public String getAdaAccountNum() {
	return adaAccountNum;
}



public void setAdaAccountNum(String adaAccountNum) {
	this.adaAccountNum = adaAccountNum;
}



public String getAdaBankBranch() {
	return adaBankBranch;
}



public void setAdaBankBranch(String adaBankBranch) {
	this.adaBankBranch = adaBankBranch;
}



public boolean isMinAmountDue() {
	return minAmountDue;
}



public void setMinAmountDue(boolean minAmountDue) {
	this.minAmountDue = minAmountDue;
}



public boolean isTotalAmountDue() {
	return totalAmountDue;
}



public void setTotalAmountDue(boolean totalAmountDue) {
	this.totalAmountDue = totalAmountDue;
}




  //Methods

  //Inner classes

} //end class Instruction 
