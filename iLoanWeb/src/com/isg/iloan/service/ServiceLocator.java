package com.isg.iloan.service;

import org.zkoss.zkplus.spring.SpringUtil;

public class ServiceLocator {
	
	public static DataEntryGenericService getDataEntryGenericService(){
		return (DataEntryGenericService) SpringUtil.getBean("deGenericService", DataEntryGenericService.class);
	}

}
