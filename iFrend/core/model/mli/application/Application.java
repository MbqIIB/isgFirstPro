package com.isg.ifrend.core.model.mli.application;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * Bean class for application.
 * 
 */

public class Application implements Serializable {	

	private static final long serialVersionUID = 6365821841670901527L;
	
	private String applicationNumber;
	private String applicationType;
	private String applicationEvent;
	private String applicationStatus;
	
	private String lastname;
	private String firstname;
	private String addressline1;
	private String addressline2;
	private String addressline3;
	
	private String relation;
	private String association;
	private String ssNumber;
	private String homePhoneNum;
	private String workPhoneNum;
	private String memos;
	private String source;
	
	// edit event
	private Date editEnteredDate;
	private Date editExitedDate;
	private String editComment;
	// pre-validation event
	private Date preValEnteredDate;
	private Date preValExitedDate;
	private String preValComment;	
	//cross check event
	private Date crossCheckEnteredDate;
	private Date crossCheckExitDate;
	private String crossCheckComment;
	//cross application scoring event
	private String appScoringEnteredDate;
	private String appScoringExitDate;
	private String appScoringComment;	
	// cross verification scoring event
	private Date verificatinEnteredDate;
	private Date verificationExitDate;
	private String verificationComment;	
	// credit bureau
	private Date  creditBureauEnteredDate;
	private Date  creditBureauExitDate;
	private String  creditBureauComment;
	// combine scoring event
	private Date  combinedScoringEnteredDate;
	private Date  combinedScoringExitDate;
	private String  combinedScoringComment;	
	// final judgement
	private Date  finaljudgementEnteredDate;
	private Date  finaljudgementExitDate;
	private String  finaljudgementComment;
	
	public Application(){	
	}
	
	
	public Application(String applicationNumber, String applicationType,
			String applicationEvent, String applicationStatus, String lastname,
			String firstname, String addressline1, String addressline2,
			String addressline3, String relation, String association,
			String ssNumber, String homePhoneNum, String workPhoneNum,
			String memos, String source, Date editEnteredDate,
			Date editExitedDate, String editComment, Date preValEnteredDate,
			Date preValExitedDate, String preValComment,
			Date crossCheckEnteredDate, Date crossCheckExitDate,
			String crossCheckComment, String appScoringEnteredDate,
			String appScoringExitDate, String appScoringComment,
			Date verificatinEnteredDate, Date verificationExitDate,
			String verificationComment, Date creditBureauEnteredDate,
			Date creditBureauExitDate, String creditBureauComment,
			Date combinedScoringEnteredDate, Date combinedScoringExitDate,
			String combinedScoringComment, Date finaljudgementEnteredDate,
			Date finaljudgementExitDate, String finaljudgementComment) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicationType = applicationType;
		this.applicationEvent = applicationEvent;
		this.applicationStatus = applicationStatus;
		this.lastname = lastname;
		this.firstname = firstname;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.addressline3 = addressline3;
		this.relation = relation;
		this.association = association;
		this.ssNumber = ssNumber;
		this.homePhoneNum = homePhoneNum;
		this.workPhoneNum = workPhoneNum;
		this.memos = memos;
		this.source = source;
		this.editEnteredDate = editEnteredDate;
		this.editExitedDate = editExitedDate;
		this.editComment = editComment;
		this.preValEnteredDate = preValEnteredDate;
		this.preValExitedDate = preValExitedDate;
		this.preValComment = preValComment;
		this.crossCheckEnteredDate = crossCheckEnteredDate;
		this.crossCheckExitDate = crossCheckExitDate;
		this.crossCheckComment = crossCheckComment;
		this.appScoringEnteredDate = appScoringEnteredDate;
		this.appScoringExitDate = appScoringExitDate;
		this.appScoringComment = appScoringComment;
		this.verificatinEnteredDate = verificatinEnteredDate;
		this.verificationExitDate = verificationExitDate;
		this.verificationComment = verificationComment;
		this.creditBureauEnteredDate = creditBureauEnteredDate;
		this.creditBureauExitDate = creditBureauExitDate;
		this.creditBureauComment = creditBureauComment;
		this.combinedScoringEnteredDate = combinedScoringEnteredDate;
		this.combinedScoringExitDate = combinedScoringExitDate;
		this.combinedScoringComment = combinedScoringComment;
		this.finaljudgementEnteredDate = finaljudgementEnteredDate;
		this.finaljudgementExitDate = finaljudgementExitDate;
		this.finaljudgementComment = finaljudgementComment;
	}




	/** getter and setter **/
	public String getApplicationNumber() {
		return applicationNumber;
	}	
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	public String getApplicationEvent() {
		return applicationEvent;
	}
	public void setApplicationEvent(String applicationEvent) {
		this.applicationEvent = applicationEvent;
	}
		
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getAddressline3() {
		return addressline3;
	}
	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getAssociation() {
		return association;
	}
	public void setAssociation(String association) {
		this.association = association;
	}
	public String getSsNumber() {
		return ssNumber;
	}
	public void setSsNumber(String ssNumber) {
		this.ssNumber = ssNumber;
	}
	public String getHomePhoneNum() {
		return homePhoneNum;
	}
	public void setHomePhoneNum(String homePhoneNum) {
		this.homePhoneNum = homePhoneNum;
	}
	public String getWorkPhoneNum() {
		return workPhoneNum;
	}
	public void setWorkPhoneNum(String workPhoneNum) {
		this.workPhoneNum = workPhoneNum;
	}
	public String getMemos() {
		return memos;
	}
	public void setMemos(String memos) {
		this.memos = memos;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getEditEnteredDate() {
		return editEnteredDate;
	}
	public void setEditEnteredDate(Date editEnteredDate) {
		this.editEnteredDate = editEnteredDate;
	}
	public Date getEditExitedDate() {
		return editExitedDate;
	}
	public void setEditExitedDate(Date editExitedDate) {
		this.editExitedDate = editExitedDate;
	}
	public String getEditComment() {
		return editComment;
	}
	public void setEditComment(String editComment) {
		this.editComment = editComment;
	}
	public Date getPreValEnteredDate() {
		return preValEnteredDate;
	}
	public void setPreValEnteredDate(Date preValEnteredDate) {
		this.preValEnteredDate = preValEnteredDate;
	}
	public Date getPreValExitedDate() {
		return preValExitedDate;
	}
	public void setPreValExitedDate(Date preValExitedDate) {
		this.preValExitedDate = preValExitedDate;
	}
	public String getPreValComment() {
		return preValComment;
	}
	public void setPreValComment(String preValComment) {
		this.preValComment = preValComment;
	}
	public Date getCrossCheckEnteredDate() {
		return crossCheckEnteredDate;
	}
	public void setCrossCheckEnteredDate(Date crossCheckEnteredDate) {
		this.crossCheckEnteredDate = crossCheckEnteredDate;
	}
	public Date getCrossCheckExitDate() {
		return crossCheckExitDate;
	}
	public void setCrossCheckExitDate(Date crossCheckExitDate) {
		this.crossCheckExitDate = crossCheckExitDate;
	}
	public String getCrossCheckComment() {
		return crossCheckComment;
	}
	public void setCrossCheckComment(String crossCheckComment) {
		this.crossCheckComment = crossCheckComment;
	}
	public String getAppScoringEnteredDate() {
		return appScoringEnteredDate;
	}
	public void setAppScoringEnteredDate(String appScoringEnteredDate) {
		this.appScoringEnteredDate = appScoringEnteredDate;
	}
	public String getAppScoringExitDate() {
		return appScoringExitDate;
	}
	public void setAppScoringExitDate(String appScoringExitDate) {
		this.appScoringExitDate = appScoringExitDate;
	}
	public String getAppScoringComment() {
		return appScoringComment;
	}
	public void setAppScoringComment(String appScoringComment) {
		this.appScoringComment = appScoringComment;
	}
	public Date getVerificatinEnteredDate() {
		return verificatinEnteredDate;
	}
	public void setVerificatinEnteredDate(Date verificatinEnteredDate) {
		this.verificatinEnteredDate = verificatinEnteredDate;
	}
	public Date getVerificationExitDate() {
		return verificationExitDate;
	}
	public void setVerificationExitDate(Date verificationExitDate) {
		this.verificationExitDate = verificationExitDate;
	}
	public String getVerificationComment() {
		return verificationComment;
	}
	public void setVerificationComment(String verificationComment) {
		this.verificationComment = verificationComment;
	}
	public Date getCreditBureauEnteredDate() {
		return creditBureauEnteredDate;
	}
	public void setCreditBureauEnteredDate(Date creditBureauEnteredDate) {
		this.creditBureauEnteredDate = creditBureauEnteredDate;
	}
	public Date getCreditBureauExitDate() {
		return creditBureauExitDate;
	}
	public void setCreditBureauExitDate(Date creditBureauExitDate) {
		this.creditBureauExitDate = creditBureauExitDate;
	}
	public String getCreditBureauComment() {
		return creditBureauComment;
	}
	public void setCreditBureauComment(String creditBureauComment) {
		this.creditBureauComment = creditBureauComment;
	}
	public Date getCombinedScoringEnteredDate() {
		return combinedScoringEnteredDate;
	}
	public void setCombinedScoringEnteredDate(Date combinedScoringEnteredDate) {
		this.combinedScoringEnteredDate = combinedScoringEnteredDate;
	}
	public Date getCombinedScoringExitDate() {
		return combinedScoringExitDate;
	}
	public void setCombinedScoringExitDate(Date combinedScoringExitDate) {
		this.combinedScoringExitDate = combinedScoringExitDate;
	}
	public String getCombinedScoringComment() {
		return combinedScoringComment;
	}
	public void setCombinedScoringComment(String combinedScoringComment) {
		this.combinedScoringComment = combinedScoringComment;
	}
	public Date getFinaljudgementEnteredDate() {
		return finaljudgementEnteredDate;
	}
	public void setFinaljudgementEnteredDate(Date finaljudgementEnteredDate) {
		this.finaljudgementEnteredDate = finaljudgementEnteredDate;
	}
	public Date getFinaljudgementExitDate() {
		return finaljudgementExitDate;
	}
	public void setFinaljudgementExitDate(Date finaljudgementExitDate) {
		this.finaljudgementExitDate = finaljudgementExitDate;
	}
	public String getFinaljudgementComment() {
		return finaljudgementComment;
	}
	public void setFinaljudgementComment(String finaljudgementComment) {
		this.finaljudgementComment = finaljudgementComment;
	}
	
	
	
	
	
	


}
