package com.isg.iloan.model.dataEntry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DOA")
public class DeedsOfAssignment { 
  
  @Id
  @SequenceGenerator(name="DOA_SEQ",sequenceName="DOA_SEQ",allocationSize=1)
  @GeneratedValue(generator="DOA_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="DOA_ID")	
  private int doaId;
  @Column(name="ISSUANCE")
  private boolean issuance;
  @Column(name="INCDEC_LIMIT")
  private boolean incDecCreditLimit;
  @Column(name="INCDEC_LIMIT_VAL")
  private String incDecCreditLimitValue;
  @Column(name="CHANGE_DEP_INST")
  private boolean changeDepInst;
  @Column(name="PLEDGE_ACCNT_CODE")
  private String pledgedAccountTypeCode;
  @Column(name="PLEDGE_ACCNT_DESC")
  private String pledgedAccountTypeDesc;
  @Column(name="PLEDGE_ACCNT_NUM")
  private String pledgedAccountNum;
  @Column(name="PLEDGE_ACCNT_BRANCH")
  private String pledgedBankBranch;
  @Column(name="PLEDGE_AMT_WORDS")
  private String pledgedAmountWords;
  @Column(name="PLEDGE_AMT")
  private long pledgedAmount;

  //Constructors
  DeedsOfAssignment(){}

public int getDoaId() {
	return doaId;
}

public void setDoaId(int doaId) {
	this.doaId = doaId;
}

public boolean isIssuance() {
	return issuance;
}

public void setIssuance(boolean issuance) {
	this.issuance = issuance;
}

public boolean isIncDecCreditLimit() {
	return incDecCreditLimit;
}

public void setIncDecCreditLimit(boolean incDecCreditLimit) {
	this.incDecCreditLimit = incDecCreditLimit;
}

public String getIncDecCreditLimitValue() {
	return incDecCreditLimitValue;
}

public void setIncDecCreditLimitValue(String incDecCreditLimitValue) {
	this.incDecCreditLimitValue = incDecCreditLimitValue;
}

public boolean isChangeDepInst() {
	return changeDepInst;
}

public void setChangeDepInst(boolean changeDepInst) {
	this.changeDepInst = changeDepInst;
}

public String getPledgedAccountTypeCode() {
	return pledgedAccountTypeCode;
}

public void setPledgedAccountTypeCode(String pledgedAccountTypeCode) {
	this.pledgedAccountTypeCode = pledgedAccountTypeCode;
}

public String getPledgedAccountTypeDesc() {
	return pledgedAccountTypeDesc;
}

public void setPledgedAccountTypeDesc(String pledgedAccountTypeDesc) {
	this.pledgedAccountTypeDesc = pledgedAccountTypeDesc;
}

public String getPledgedAccountNum() {
	return pledgedAccountNum;
}

public void setPledgedAccountNum(String pledgedAccountNum) {
	this.pledgedAccountNum = pledgedAccountNum;
}

public String getPledgedBankBranch() {
	return pledgedBankBranch;
}

public void setPledgedBankBranch(String pledgedBankBranch) {
	this.pledgedBankBranch = pledgedBankBranch;
}

public String getPledgedAmountWords() {
	return pledgedAmountWords;
}

public void setPledgedAmountWords(String pledgedAmountWords) {
	this.pledgedAmountWords = pledgedAmountWords;
}

public long getPledgedAmount() {
	return pledgedAmount;
}

public void setPledgedAmount(long pledgedAmount) {
	this.pledgedAmount = pledgedAmount;
}

  //Methods

  //Inner classes

} //end class DeedsOfAssignment 
