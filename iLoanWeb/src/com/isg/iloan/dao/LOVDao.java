package com.isg.iloan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.isg.iloan.commons.LOVs;

public interface LOVDao {

	public List<LOVs> getLOVByKey(String key) throws DataAccessException;

}
