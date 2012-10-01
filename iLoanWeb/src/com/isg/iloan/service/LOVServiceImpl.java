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
		return null;
	}

	@Override
	public LOV retrieveById(long applicationId) {
		return lovDao.findById(applicationId);
	}


	@Override
	public List<LOV> retrieveAllAppStatus() {
		return lovDao.findAll();
	}

	@Override
	public List<LOV> retrieveAllCreditCardType() {
		return lovDao.findAll();
	}

}
