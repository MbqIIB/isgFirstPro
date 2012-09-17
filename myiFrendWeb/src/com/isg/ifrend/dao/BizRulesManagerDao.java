package com.isg.ifrend.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import com.isg.ifrend.web.model.Element;

public interface BizRulesManagerDao {

	int add(Element element) throws PersistenceException;
	Object view(Long id);
	void authorize();
	List<Object> list();
	int update(Object obj) throws PersistenceException;
	int delete(Object obj) throws PersistenceException;
	
}
