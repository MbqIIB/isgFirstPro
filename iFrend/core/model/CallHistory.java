package com.isg.ifrend.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * Bean class for call history.
 *
 */

public class CallHistory implements Serializable {
	
	private static final long serialVersionUID = 3708527734135045427L;
	
	private String callId;
	private String accountNumber;
	private Date currentDate;
	private Date startTime;
	private Date endTime;
	private Date duration;
	private String operationID;

	List<Case> caseList;
	List<Memo> memoList;
	List<Note> noteList;
	
	public CallHistory(){
		
	}
	
	public CallHistory(String callId, String accountNumber, Date currentDate,
			Date startTime, Date endTime, Date duration, String operationID,
			List<Case> caseList, List<Memo> memoList, List<Note> noteList) {
		this.callId = callId;
		this.accountNumber = accountNumber;
		this.currentDate = currentDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.operationID = operationID;
		this.caseList = caseList;
		this.memoList = memoList;
		this.noteList = noteList;
	}


	/** getter and setter **/	
	public String getCallId() {
		return callId;
	}


	public void setCallId(String callId) {
		this.callId = callId;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Date getCurrentDate() {
		return currentDate;
	}


	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public Date getDuration() {
		return duration;
	}


	public void setDuration(Date duration) {
		this.duration = duration;
	}


	public String getOperationID() {
		return operationID;
	}


	public void setOperationID(String operationID) {
		this.operationID = operationID;
	}


	public List<Case> getCaseList() {
		return caseList;
	}


	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}


	public List<Memo> getMemoList() {
		return memoList;
	}


	public void setMemoList(List<Memo> memoList) {
		this.memoList = memoList;
	}


	public List<Note> getNoteList() {
		return noteList;
	}


	public void setNoteList(List<Note> noteList) {
		this.noteList = noteList;
	}
}
