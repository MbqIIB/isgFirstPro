package com.isg.iloan.controller.viewModel;

import java.util.Date;

public class ApplicationBean {
	private Date dateOfApplication;
	private String applicationStatus;
	private String creditCardType;
	
	public ApplicationBean(Date date, String applicationStatus,
			String creditCardType) {
		super();
		this.setDateOfApplication(date);
		this.applicationStatus = applicationStatus;
		this.creditCardType = creditCardType;
	}


	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}


	public Date getDateOfApplication() {
		return dateOfApplication;
	}


	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
}
