package com.isg.iloan.model.dataEntry;

import com.isg.iloan.controller.viewModel.ApplicationBean;

public class SearchBean {
	private ApplicationBean application;
	private PersonalData personalData;
	
	
	public SearchBean(ApplicationBean application, PersonalData personalData) {
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
