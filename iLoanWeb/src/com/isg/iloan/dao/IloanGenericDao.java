package com.isg.iloan.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Table;

public abstract class IloanGenericDao<M extends Serializable>  {
	
	private static final long serialVersionUID = -1035187014434957063L;
	
	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager entityManager;
	
	private Class<M> modelClass;
	
	public void setClass(final Class<M> model){
		modelClass = model;
	}
	
	
	public M findOne(final Long id){
		
		entityManager = entityManagerFactory.createEntityManager();	
		return entityManager.createQuery("from " + modelClass.getAnnotation(Table.class).name(), modelClass).getSingleResult();
	
	}
	
	public List<M> findAll(){
		
		entityManager = entityManagerFactory.createEntityManager();	
		return entityManager.createQuery("from " + modelClass.getAnnotation(Table.class).name(), modelClass).getResultList();
		
	}
	
	public void save(final M modelBean ){   
		entityManager = entityManagerFactory.createEntityManager();		
		entityManager.getTransaction().begin();
		entityManager.persist(modelBean);
		entityManager.getTransaction().commit();      
    }
	   
    public void update( final M modelBean ){
    	entityManager = entityManagerFactory.createEntityManager();	
    	entityManager.getTransaction().begin();
    	entityManager.merge(modelBean);
		entityManager.getTransaction().commit();    
       
    }
	   
   public void deleteById( final Long id){
	   entityManager = entityManagerFactory.createEntityManager();	
	   final M modelBean = findOne(id);
	   
	   entityManager.getTransaction().begin();
	   entityManager.remove(modelBean);
	   entityManager.getTransaction().commit();  
	  
   }
	 
	

}
