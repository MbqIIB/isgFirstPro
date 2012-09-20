package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 ** Class JobDetail
 **/
@Entity
@Table(name="JOB_DETAIL")
public class JobDetail implements Serializable { 

 
  
  @Id
  @SequenceGenerator(name="APPLICATION_SEQUENCE",sequenceName="APPLICATION_SEQUENCE",allocationSize=1)
  @GeneratedValue(generator="APPLICATION_SEQUENCE", strategy = GenerationType.SEQUENCE)  
  @Column(name="JOB_DETAIL_ID")
  private int jobDetailId;
  
  
  @Column(name="APPID")
  private int applicationId; 
  
  
  @Column(name="COMPANY")
  private String companyName;
  @Column(name="OCCUPATION")
  private String occupation;
  @Column(name="WORKNATURE")
  private String natureOfWork;
  @Column(name="YEARS_EMPLOYED")
  private int yearsWithCurrentEmployer;
  @Column(name="TOTAL_YRS_WORKING")
  private int totalWorkingYears;
  @Column(name="MONTHLYGROSS")
  private long grossMonthlyIncome;
  @Column(name="SPOUSE_FAM_NAME")
  private String spouseFamilyName;
  @Column(name="SPOUSE_MIDD_NAME")
  private String spouseMiddleName;
  @Column(name="SPOUSE_DOB")
  private Date spouseDOB;

  
//  @OneToOne(fetch=FetchType.LAZY)
//  @JoinColumn(name="ADDRESS_ID")
//  private Address businessAddress;
  
  //private List<Fund> sourceOfFunds;
  
  
  
  //Constructors
  public JobDetail(){}




public int getJobDetailId() {
	return jobDetailId;
}


public void setJobDetailId(int jobDetailId) {
	this.jobDetailId = jobDetailId;
}


//public int getApplicationId() {
//	return applicationId;
//}
//public void setApplicationId(int applicationId) {
//	this.applicationId = applicationId;
//}


public String getCompanyName() {
	return companyName;
}


public void setCompanyName(String companyName) {
	this.companyName = companyName;
}


public String getOccupation() {
	return occupation;
}


public void setOccupation(String occupation) {
	this.occupation = occupation;
}


public String getNatureOfWork() {
	return natureOfWork;
}


public void setNatureOfWork(String natureOfWork) {
	this.natureOfWork = natureOfWork;
}


public int getYearsWithCurrentEmployer() {
	return yearsWithCurrentEmployer;
}


public void setYearsWithCurrentEmployer(int yearsWithCurrentEmployer) {
	this.yearsWithCurrentEmployer = yearsWithCurrentEmployer;
}


public int getTotalWorkingYears() {
	return totalWorkingYears;
}


public void setTotalWorkingYears(int totalWorkingYears) {
	this.totalWorkingYears = totalWorkingYears;
}


public long getGrossMonthlyIncome() {
	return grossMonthlyIncome;
}


public void setGrossMonthlyIncome(long grossMonthlyIncome) {
	this.grossMonthlyIncome = grossMonthlyIncome;
}


public String getSpouseFamilyName() {
	return spouseFamilyName;
}


public void setSpouseFamilyName(String spouseFamilyName) {
	this.spouseFamilyName = spouseFamilyName;
}


public String getSpouseMiddleName() {
	return spouseMiddleName;
}


public void setSpouseMiddleName(String spouseMiddleName) {
	this.spouseMiddleName = spouseMiddleName;
}


public Date getSpouseDOB() {
	return spouseDOB;
}


public void setSpouseDOB(Date spouseDOB) {
	this.spouseDOB = spouseDOB;
}




public int getApplicationId() {
	return applicationId;
}




public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}










//public Address getBusinessAddress() {
//	return businessAddress;
//}
//
//
//public void setBusinessAddress(Address businessAddress) {
//	this.businessAddress = businessAddress;
//}

//
//public List<Fund> getSourceOfFunds() {
//	return sourceOfFunds;
//}
//public void setSourceOfFunds(List<Fund> sourceOfFunds) {
//	this.sourceOfFunds = sourceOfFunds;
//}

  
  
  
  
  
  
  
  //Methods

  //Inner classes

} //end class JobDetail 
