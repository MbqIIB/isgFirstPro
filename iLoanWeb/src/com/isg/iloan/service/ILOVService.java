package com.isg.iloan.service;

import java.util.List;

import com.isg.iloan.commons.LOV;

public interface ILOVService {
	List<LOV> retrieveAllAppStatus();
	List<LOV> retrieveAllCreditCardType();
	
}
