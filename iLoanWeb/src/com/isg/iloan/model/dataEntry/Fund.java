package com.isg.iloan.model.dataEntry;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FUND")
public class Fund implements Serializable{ 
  
  private static final long serialVersionUID = -7124272410437844513L;

  @Id
  @SequenceGenerator(name="FUND_SEQ",sequenceName="FUND_SEQ",allocationSize=1)
  @GeneratedValue(generator="FUND_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="FUND_ID")
  private long fundId;
  @Column(name="FUND_CODE")
  private String fundCode;
  @Column(name="FUND_DESC")
  private String fundDesc;

  @ManyToOne
  @JoinColumn(name="JOB_DETAIL_ID")
  private JobDetail jobDetail;
  
  
  
  public Fund(){}
  
  
  

	public long getFundId() {
		return fundId;
	}
	
	public void setFundId(long fundId) {
		this.fundId = fundId;
	}
	
	
	public String getFundCode() {
		return fundCode;
	}
	
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	
	public String getFundDesc() {
		return fundDesc;
	}
	
	public void setFundDesc(String fundDesc) {
		this.fundDesc = fundDesc;
	}
	
	public JobDetail getJobDetail() {
		return jobDetail;
	}
	
	public void setJobDetail(JobDetail jobDetail) {
		this.jobDetail = jobDetail;
		if(!jobDetail.getSourceOfFunds().contains(this)){
			jobDetail.getSourceOfFunds().add(this);
		}
	}
  
  
  
  //Constructors

  //Methods

  //Inner classes

} //end class Fund 
