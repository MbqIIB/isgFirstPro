package com.isg.iloan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.isg.iloan.commons.LOV;

public interface ILOVDao {
	
	/**
	 * define methods here for accessing other backend service..
	 * @param <M>
	 */
		
	public LOV findById(final long id) throws DataAccessException;
	
	public List<LOV> findAll() throws DataAccessException;
	
	public List<LOV> findByType(int typeKey) throws DataAccessException;
	

}
