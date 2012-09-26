package com.isg.iloan.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.isg.iloan.commons.LOVs;

public interface LOVService {
	public List<LOVs> getLOVByKey(String key) throws DataAccessException;
}
