package com.isg.iloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import com.isg.iloan.model.dataEntry.Application;

public class ApplicationDaoImpl extends IloanGenericDao<Application> implements ApplicationDao {

	private static Logger logger = Logger.getLogger(ApplicationDaoImpl.class);
	
	// test if this will be injected by the child class
	//private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext(unitName = "applicationPersistentUnit") 
	private EntityManager entityManager;
	
	public ApplicationDaoImpl(EntityManagerFactory entityManagerFactory) {
		super();
		entityManager = entityManagerFactory.createEntityManager();	
		
		config(Application.class, entityManagerFactory, entityManager );
	}

	@Override
	public Application findById(long id) throws DataAccessException {
		logger.debug("*** retrieving id: " + id );
		return super.findById(id);
		
	}

	@Override
	public  List<Application> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Application appBean) throws DataAccessException {
		
		super.save(appBean);
	}

	@Override
	public void update(Application appBean) throws DataAccessException {
		logger.debug("*** started updating application with id: " + appBean.getApplicationId());
		super.update(appBean);
		logger.debug("*** updating application with id: " + appBean.getApplicationId() + "..updated!");
	}

	@Override
	public void deleteById(Long id) throws DataAccessException {
		logger.debug("*** started deleting application with id: " + id);
		super.deleteById(id);
		logger.debug("*** deleting application with id: " + id + "....deleted!"); 
	}

	
	
	
	
	

}
