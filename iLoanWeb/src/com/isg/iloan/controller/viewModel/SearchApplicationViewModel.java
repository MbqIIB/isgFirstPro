package com.isg.iloan.controller.viewModel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zkplus.spring.SpringUtil;

import com.isg.iloan.commons.LOV;
import com.isg.iloan.service.ILOVService;
import com.isg.iloan.service.LOVServiceImpl;
import com.isg.iloan.service.SearchCriteria;

public class SearchApplicationViewModel {

	private static List<LOV> appStatus = new ArrayList<LOV>();
	private static List<LOV> creditCardType = new ArrayList<LOV>();

	public static ILOVService getLOVService(){
		 return  (ILOVService)SpringUtil.getBean("lovService", LOVServiceImpl.class);
	}
	
	static {	
		appStatus.addAll(getLOVService().retrieveAllAppStatus());
		creditCardType.addAll(getLOVService().retrieveAllCreditCardType());

	}

	public List<LOV> getAppStatus() {
		return appStatus;
	}

	public List<LOV> getCreditCardType() {
		return creditCardType;
	}

}
