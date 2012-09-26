package com.isg.iloan.controller.viewModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.isg.iloan.model.dataEntry.PersonalData;
import com.isg.iloan.service.SearchCriteria;

public class DummySearchViewModel {

	private static List<String> appStatus = new ArrayList<String>();
	private static List<String> creditCardType = new ArrayList<String>();
	private static List<SearchCriteria> applicationDetails = new ArrayList<SearchCriteria>();

	
	
	static{
		appStatus.add("New");
		appStatus.add("Pending");
		appStatus.add("Approved");
		appStatus.add("Rejected");
		
		creditCardType.add("M Lite Mastercard");
		creditCardType.add("Femme Visa");
		creditCardType.add("Classic Mastercard");
		creditCardType.add("Classic Visa");
		creditCardType.add("Gold Mastercard");
		creditCardType.add("Gold Visa");
		
//		PersonalData pd1 = new PersonalData("Geronimo", "Zara", "Reyes");
//		ApplicationBean app1 = new ApplicationBean(Calendar.getInstance().getTime(), "Femme Visa", "Approved");
//		applicationDetails.add(new SearchCriteria(app1, pd1));
//		PersonalData pd2 = new PersonalData("Ferragamo", "Sylverter", "Santos");
//		ApplicationBean app2 = new ApplicationBean(Calendar.getInstance().getTime(), "M Lite Mastercard", "Rejected");
//		applicationDetails.add(new SearchCriteria(app2, pd2));
//		PersonalData pd3 = new PersonalData("Khors", "Michael", "Tan");
//		ApplicationBean app3 = new ApplicationBean(Calendar.getInstance().getTime(), "Gold Visa", "New");
//		applicationDetails.add(new SearchCriteria(app3, pd3));
//		PersonalData pd4 = new PersonalData("York", "Donna Karan", "New");
//		ApplicationBean app4 = new ApplicationBean(Calendar.getInstance().getTime(), "Classic Mastercard", "Pending");
//		applicationDetails.add(new SearchCriteria(app4, pd4));
		
	}
	
	public List<String> getAppStatus() {
		return appStatus;
	}
	
	public List<String> getCreditCardType(){
		return creditCardType;
	}
	
	public List<SearchCriteria> getApplicationDetails() {
		return applicationDetails;
	}
	
}
