package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.model.dataEntry.Application;

public interface ApplicationService {
	
	Application retrieveById(long applicationId);
	
	void createApplication(Application app);
	
	void updateApplication(Application app);
	
	void deleteApplication(long id);
	
	List<Application> queryByKey(long key);
	
	List<Application> findAll() throws Exception;
	
	List<Application> findApplication(Application criteria) throws Exception; 

}
