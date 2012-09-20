package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.model.dataEntry.Application;

public interface ApplicationService {
	
	List<Application> retrieveByCriteria(SearchCriteria criteria);
	Application retrieveById(int applicationId);
	
	void createApplication(Application app);
	void updateApplication(Application app);
	
	
	

}
