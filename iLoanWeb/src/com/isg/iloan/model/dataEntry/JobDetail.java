package com.isg.iloan.model.dataEntry;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 ** Class JobDetail
 **/
@Entity
@Table(name="JOB_DETAIL")
public class JobDetail implements Serializable { 

//	  @Id
//	  @GenericGenerator(name="generator", strategy="increment")
//	  @GeneratedValue(generator="generator")
  
  
 private static final long serialVersionUID = -2787475231432844790L;

  @Id
  @SequenceGenerator(name="JOB_DETAIL_SEQ",sequenceName="JOB_DETAIL_SEQ",allocationSize=1)
  @GeneratedValue(generator="JOB_DETAIL_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="JOB_DETAIL_ID")
  private long jobDetailId;
    
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

  
  @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
  @JoinColumn(name="ADDRESS_ID")
  private Address businessAddress;
  
   
  @OneToMany(cascade=CascadeType.ALL,mappedBy="jobDetail",fetch=FetchType.LAZY)
  private List<Fund> sourceOfFunds;
  
  public void addFundSource(Fund source){
	  this.sourceOfFunds.add(source);
	  if(this!=source.getJobDetail()){
		  source.setJobDetail(this);
	  }
  }
  
  
  //Constructors
  public JobDetail(){}




	public long getJobDetailId() {
		return jobDetailId;
	}
	
	
	public void setJobDetailId(long jobDetailId) {
		this.jobDetailId = jobDetailId;
	}
	
	
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
	
	
	public Address getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}
	
	
	
	
	public List<Fund> getSourceOfFunds() {
		return sourceOfFunds;
	}
	
	
	
	
	public void setSourceOfFunds(List<Fund> sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}


  
  
  
  
  
  
  //Methods

  //Inner classes

} //end class JobDetail 
