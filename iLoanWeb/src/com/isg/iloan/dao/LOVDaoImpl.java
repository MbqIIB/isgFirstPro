package com.isg.iloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import com.isg.iloan.commons.LOV;

public class LOVDaoImpl extends IloanGenericDao<LOV> implements ILOVDao {

	private static Logger logger = Logger.getLogger(LOVDaoImpl.class);
	
	@PersistenceContext(unitName = "applicationPersistentUnit") 
	private EntityManager entityManager;
	
	public LOVDaoImpl(EntityManagerFactory entityManagerFactory) {
		super();
		entityManager = entityManagerFactory.createEntityManager();	
		
		config(LOV.class, entityManagerFactory, entityManager );
	}

	@Override
	public LOV findById(long id) throws DataAccessException {
		logger.debug("*** retrieving id: " + id );
		return super.findById(id);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public  List<LOV> findAll() throws DataAccessException {
		return super.findAll();
	}
}
