package com.isg.iloan.model.dataEntry;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SAVEANDSWIPE")
public class SaveAndSwipe implements Serializable{ 
 
  
  private static final long serialVersionUID = -4787612254115909200L;
	
  @Id
  @SequenceGenerator(name="SAVEANDSWIPE_SEQ",sequenceName="SAVEANDSWIPE_SEQ",allocationSize=1)
  @GeneratedValue(generator="SAVEANDSWIPE_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name="SS_ID")	
  private long saveAndSwipeId;
  @Column(name="DEPOSITOR")
  private boolean metrobankDepositor;
  @Column(name="ACCNT_NUM")
  private String accountNum;
  @Column(name="BRANCH")
  private String bankBranch;
  @Column(name="ACCEPT_PLEDGE")
  private boolean acceptPledge;
  
  @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
  @JoinColumn(name="DOA_ID")
  private DeedsOfAssignment doa;

  //Constructors
  SaveAndSwipe(){}

	public long getSaveAndSwipeId() {
		return saveAndSwipeId;
	}
	
	public void setSaveAndSwipeId(long saveAndSwipeId) {
		this.saveAndSwipeId = saveAndSwipeId;
	}
	
	public boolean isMetrobankDepositor() {
		return metrobankDepositor;
	}
	
	public void setMetrobankDepositor(boolean metrobankDepositor) {
		this.metrobankDepositor = metrobankDepositor;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public boolean isAcceptPledge() {
		return acceptPledge;
	}
	
	public void setAcceptPledge(boolean acceptPledge) {
		this.acceptPledge = acceptPledge;
	}
	
	public DeedsOfAssignment getDoa() {
		return doa;
	}
	
	public void setDoa(DeedsOfAssignment doa) {
		this.doa = doa;
	}

  

} //end class SaveAndSwipe 
