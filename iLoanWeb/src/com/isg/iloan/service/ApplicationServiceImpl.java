package com.isg.iloan.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.isg.iloan.dao.ApplicationDao;
import com.isg.iloan.model.dataEntry.Application;

public class ApplicationServiceImpl implements ApplicationService {

	private static Logger logger = Logger.getLogger(ApplicationServiceImpl.class);
	
	
	private ApplicationDao applicationDao;
	
	
	public void setApplicationDao(ApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}

	@Override
	public Application retrieveById(long applicationId) {
		// TODO Auto-generated method stub
		return applicationDao.findById(applicationId);
	}

	@Override
	public void createApplication(Application app) {
		
		logger.debug("calling applicationDao...");
		applicationDao.save(app);
		logger.debug("finished call on applicationDao...");
	}

	@Override
	public long updateApplication(Application app) throws Exception{
		long success=0;
		try{
			applicationDao.update(app);
			success = app.getApplicationId();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return success;
	}
	
	@Override
	public void deleteApplication(long id) {
		applicationDao.deleteById(id);
	}

	@Override
	public List<Application> queryByKey(long key) {
		// TODO Auto-generated method stub
		return applicationDao.queryByKey(key);
	}

	@Override
	public List<Application> findAll() throws Exception {
		// TODO Auto-generated method stub
		return applicationDao.findAll();
	}

	@Override
	public List<Application> findApplication(SearchCriteria criteria)
			throws Exception {
		return applicationDao.findApplication(criteria);
	}

}
