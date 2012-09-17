package com.isg.ifrend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.isg.ifrend.web.model.Element;


//@Repository("myGreatDAO")  
//@Transactional(propagation = Propagation.REQUIRED)  
public class ElementDaoImpl implements BizRulesManagerDao {
	
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext(unitName = "bizRulesPersistentUnit") 
	private EntityManager entityManager;
	
	@Override
	public int add(Element element) throws PersistenceException{
		
		entityManager = entityManagerFactory.createEntityManager();
		
		try{
			System.out.print("entering persistent..");
			entityManager.getTransaction().begin();
			entityManager.persist(element);
			entityManager.getTransaction().commit();
			System.out.print("leaving persistent..");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object view(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void authorize() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Object> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
