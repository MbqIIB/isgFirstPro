package com.isg.iloan.service;

import com.isg.iloan.controller.viewModel.ApplicationBean;
import com.isg.iloan.model.dataEntry.PersonalData;

public class SearchCriteria {
	
	//to be define with field and criteria operators..

	private ApplicationBean application;
	private PersonalData personalData;
	
	
	public SearchCriteria(ApplicationBean application, PersonalData personalData) {
		super();
		this.application = application;
		this.personalData = personalData;
	}
	
	public ApplicationBean getApplication() {
		return application;
	}
	public void setApplication(ApplicationBean application) {
		this.application = application;
	}
	public PersonalData getPersonalData() {
		return personalData;
	}
	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
}
