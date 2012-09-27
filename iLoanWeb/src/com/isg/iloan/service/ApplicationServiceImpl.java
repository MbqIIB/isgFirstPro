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
	public List<Application> retrieveByCriteria(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
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
	public void updateApplication(Application app) {

		applicationDao.update(app);
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

}
