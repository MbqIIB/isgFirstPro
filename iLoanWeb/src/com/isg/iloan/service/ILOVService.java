package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.commons.LOV;

public interface ILOVService {
	List<LOV> retrieveByCriteria(SearchCriteria criteria);

	LOV retrieveById(long applicationId);
	
	List<LOV> findAllApplication();
}
