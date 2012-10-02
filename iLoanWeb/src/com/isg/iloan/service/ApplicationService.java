package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.model.dataEntry.Application;

public interface ApplicationService {
	
	Application retrieveById(long applicationId);
	
	void createApplication(Application app);
	long updateApplication(Application app) throws Exception;
	
	void deleteApplication(long id);
	
	List<Application> queryByKey(long key);
	
	List<Application> findAll() throws Exception;
	
	List<Application> findApplication(SearchCriteria criteria) throws Exception; 
	

}
