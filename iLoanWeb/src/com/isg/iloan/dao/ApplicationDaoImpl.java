package com.isg.iloan.dao;

import com.isg.iloan.model.dataEntry.Application;

public class ApplicationDaoImpl extends IloanGenericDao<Application> implements ApplicationDao {

	public ApplicationDaoImpl() {
		super();
		setClass(Application.class);
	}
	
	
	
	

}
