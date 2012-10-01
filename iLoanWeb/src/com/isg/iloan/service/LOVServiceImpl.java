package com.isg.iloan.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.isg.iloan.commons.LOV;
import com.isg.iloan.dao.ILOVDao;

public class LOVServiceImpl implements ILOVService {

	private static Logger logger = Logger.getLogger(LOVServiceImpl.class);
	
	
	private ILOVDao lovDao;
	
	public ILOVDao getLovDao() {
		return lovDao;
	}

	public void setLovDao(ILOVDao lovDao) {
		this.lovDao = lovDao;
	}

	@Override
	public List<LOV> retrieveByCriteria(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LOV retrieveById(long applicationId) {
		// TODO Auto-generated method stub
		return lovDao.findById(applicationId);
	}


	
	@Override
	public List<LOV> findAllApplication() {
		return lovDao.findAll();
		
	}

}
