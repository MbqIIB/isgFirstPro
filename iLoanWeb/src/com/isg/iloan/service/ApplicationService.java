package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.model.dataEntry.Application;

public interface ApplicationService {
	
	List<Application> retrieveByCriteria(SearchCriteria criteria);
	Application retrieveById(long applicationId);
	
	void createApplication(Application app);
	void updateApplication(Application app);
	
	void deleteApplication(long id);
	
	List<Application> queryByKey(long key);
	

}
