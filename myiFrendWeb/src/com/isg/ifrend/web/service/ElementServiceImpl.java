package com.isg.ifrend.web.service;

import com.isg.ifrend.dao.BizRulesManagerDao;
import com.isg.ifrend.web.model.Element;

public class ElementServiceImpl implements BizRulesManagerService {

	private BizRulesManagerDao elementDao;
	

	@Override
	public void add(Element obj) {
		
		elementDao.add(obj);
		
		// TODO Auto-generated method stub

	}

	
	
	
	
	public void setBizRulesManagerDao(BizRulesManagerDao bizRulesManagerDao) {
		this.elementDao = bizRulesManagerDao;
	}

	
}
