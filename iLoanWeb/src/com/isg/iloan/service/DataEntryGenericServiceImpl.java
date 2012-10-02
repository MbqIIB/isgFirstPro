package com.isg.iloan.service;

import com.isg.iloan.dao.DataEntryGenericDao;

public class DataEntryGenericServiceImpl<M> implements DataEntryGenericService<M> {

	DataEntryGenericDao<M> deGenericDao;
	
	
	
	@Override
	public long deleteById(long id) throws Exception {
		try{
			deGenericDao.deleteById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			
			return 0;
		}
		
		return id;
	}

	
	public void refresh(long id){
		deGenericDao.reflesh(id);
	}

	@Override
	public void setModelClass(Class<M> model) {
		deGenericDao.setModelClass(model);
		
	}


	public DataEntryGenericDao<M> getDeGenericDao() {
		return deGenericDao;
	}


	public void setDeGenericDao(DataEntryGenericDao<M> deGenericDao) {
		this.deGenericDao = deGenericDao;
	}

}
