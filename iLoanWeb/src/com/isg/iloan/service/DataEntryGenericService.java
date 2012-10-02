package com.isg.iloan.service;

public interface DataEntryGenericService<M> {

	long deleteById(long id) throws Exception;
	void setModelClass(Class<M> model);
	void refresh(long id);
	
}
