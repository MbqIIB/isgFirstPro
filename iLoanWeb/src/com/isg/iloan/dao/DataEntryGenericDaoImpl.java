package com.isg.iloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

public class DataEntryGenericDaoImpl<M> implements DataEntryGenericDao<M> {
	
	private static Logger logger = Logger.getLogger(DataEntryGenericDaoImpl.class);
	
	
	@PersistenceContext(unitName = "applicationPersistentUnit") 
	private EntityManager entityManager;
	private Class<M> modelClass;
	
	public DataEntryGenericDaoImpl(EntityManagerFactory entityManagerFactory) {
		super();
		entityManager = entityManagerFactory.createEntityManager();	
		
	}

	public void setModelClass(final Class<M> model){
		modelClass = model;
		
	}
	
	public M findById(final long id) throws DataAccessException{
			
		return entityManager.find(modelClass, id);	
	}
	
	@Transactional	
	public void deleteById( final long id) throws DataAccessException{
		   logger.debug("*** deleting fund id:" + id);
		   M modelBean = findById(id);		   		   	
		   entityManager.remove(modelBean);		  
		   logger.debug("*** deleting fund id:" + id + "...finished!");		  
		   entityManager.flush(); 		  
		  
	   }

	@Override
	public void reflesh(long id) {
		//entityManager.getEntityManagerFactory().getCache().evict(modelClass, model);
		M modelBean = entityManager.find(modelClass, id);
		entityManager.refresh(modelBean);
	}
	

}
