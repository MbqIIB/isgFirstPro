package com.isg.iloan.service;

import com.isg.iloan.controller.viewModel.ApplicationBean;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.PersonalData;

public class SearchCriteria {
	
	//to be define with field and criteria operators..

	private Application application;
	private PersonalData personalData;
	
	
	public SearchCriteria(Application application, PersonalData personalData) {
		super();
		this.application = application;
		this.personalData = personalData;
	}
	
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public PersonalData getPersonalData() {
		return personalData;
	}
	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
}
