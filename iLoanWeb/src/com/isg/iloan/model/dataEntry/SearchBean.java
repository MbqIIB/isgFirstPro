package com.isg.iloan.model.dataEntry;

public class SearchBean {
	private Application application;
	private PersonalData personalData;
	
	
	public SearchBean(Application application, PersonalData personalData) {
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
