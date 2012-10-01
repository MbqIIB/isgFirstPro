package com.isg.iloan.controller.viewModel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zkplus.spring.SpringUtil;

import com.isg.iloan.service.ILOVService;
import com.isg.iloan.service.LOVServiceImpl;
import com.isg.iloan.service.SearchCriteria;

public class SearchApplicationViewModel {

	private static List<String> appStatus = new ArrayList<String>();
	private static List<String> creditCardType = new ArrayList<String>();
	private static List<SearchCriteria> applicationDetails = new ArrayList<SearchCriteria>();

	public static ILOVService getLOVService(){
		 return  (ILOVService)SpringUtil.getBean("lovService", LOVServiceImpl.class);
	}
	
	static {
		appStatus.add(getLOVService().retrieveById(1).getDesc());
		appStatus.add(getLOVService().retrieveById(2).getDesc());
		appStatus.add(getLOVService().retrieveById(3).getDesc());
		appStatus.add(getLOVService().retrieveById(4).getDesc());
		
		creditCardType.add(getLOVService().retrieveById(5).getDesc());
		creditCardType.add(getLOVService().retrieveById(6).getDesc());
		creditCardType.add(getLOVService().retrieveById(7).getDesc());
		creditCardType.add(getLOVService().retrieveById(8).getDesc());
		creditCardType.add(getLOVService().retrieveById(9).getDesc());
		creditCardType.add(getLOVService().retrieveById(10).getDesc());
		
		// PersonalData pd1 = new PersonalData("Geronimo", "Zara", "Reyes");
		// ApplicationBean app1 = new
		// ApplicationBean(Calendar.getInstance().getTime(), "Femme Visa",
		// "Approved");
		// applicationDetails.add(new SearchCriteria(app1, pd1));
		// PersonalData pd2 = new PersonalData("Ferragamo", "Sylverter",
		// "Santos");
		// ApplicationBean app2 = new
		// ApplicationBean(Calendar.getInstance().getTime(),
		// "M Lite Mastercard", "Rejected");
		// applicationDetails.add(new SearchCriteria(app2, pd2));
		// PersonalData pd3 = new PersonalData("Khors", "Michael", "Tan");
		// ApplicationBean app3 = new
		// ApplicationBean(Calendar.getInstance().getTime(), "Gold Visa",
		// "New");
		// applicationDetails.add(new SearchCriteria(app3, pd3));
		// PersonalData pd4 = new PersonalData("York", "Donna Karan", "New");
		// ApplicationBean app4 = new
		// ApplicationBean(Calendar.getInstance().getTime(),
		// "Classic Mastercard", "Pending");
		// applicationDetails.add(new SearchCriteria(app4, pd4));

	}

	public List<String> getAppStatus() {
		return appStatus;
	}

	public List<String> getCreditCardType() {
		return creditCardType;
	}

	public List<SearchCriteria> getApplicationDetails() {
		return applicationDetails;
	}

}
