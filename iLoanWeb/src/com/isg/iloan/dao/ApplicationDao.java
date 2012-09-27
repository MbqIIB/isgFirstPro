package com.isg.iloan.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.isg.iloan.model.dataEntry.Application;

public interface ApplicationDao {
	
	/**
	 * define methods here for accessing other backend service..
	 * @param <M>
	 */
		
	public Application findById(final long id) throws DataAccessException;
	
	public List<Application> findAll() throws DataAccessException;
	
	void save(final Application modelBean ) throws DataAccessException;
	
	void update( final Application modelBean )throws DataAccessException;
	
	void deleteById( final Long id) throws DataAccessException;
	
	List<Application> queryByKey(long key) throws DataAccessException;
	

}
