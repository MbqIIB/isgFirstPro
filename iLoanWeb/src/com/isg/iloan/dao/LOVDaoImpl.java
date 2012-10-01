package com.isg.iloan.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		Query q =  entityManager.createQuery("Select * from LOVS where LOV_KEY = 1");
		List<LOV> list = (ArrayList<LOV>) q.getResultList();
		 for(LOV lov: list){
		    System.out.println("Found a claus with id " + lov.getDesc());
		  }
		  return list;
	}
}
