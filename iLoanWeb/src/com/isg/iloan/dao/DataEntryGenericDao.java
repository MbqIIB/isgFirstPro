package com.isg.iloan.dao;

import org.hibernate.exception.DataException;
import org.springframework.dao.DataAccessException;

public interface DataEntryGenericDao<M> {
	
	M findById(final long id) throws DataException;
	void deleteById( final long id) throws DataAccessException;
	
	void setModelClass(Class<M> model);
	void reflesh(long id);

}
