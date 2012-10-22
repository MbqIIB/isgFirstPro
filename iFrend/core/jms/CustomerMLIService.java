package com.isg.ifrend.jms;

import java.util.List;

import javax.jms.JMSException;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.account.Account;
import com.isg.ifrend.model.mli.customer.Address;
import com.isg.ifrend.model.mli.customer.Contact;
import com.isg.ifrend.model.mli.customer.Customer;
import com.isg.ifrend.wrapper.mli.request.account.GetAccount;
import com.isg.ifrend.wrapper.mli.request.customer.GetAddress;
import com.isg.ifrend.wrapper.mli.request.customer.GetContactDetail;
import com.isg.ifrend.wrapper.mli.request.customer.GetCustomer;
import com.isg.ifrend.wrapper.mli.request.customer.GetRelationship;
import com.isg.ifrend.wrapper.mli.request.customer.SearchCustomer;


public interface CustomerMLIService {


	/**
	 * @throws JMSException 
	 * @throws IfrendMLIException 
	 */
	public abstract List<Customer> requestSearchCustomer(SearchCustomer wrapper) throws IfrendMLIException, JMSException;

	public abstract Customer requestGetCustomer(GetCustomer wrapper) throws IfrendMLIException, JMSException;

	public abstract List<Account> requestRelationship(GetRelationship wrapper) throws IfrendMLIException;
	
	public abstract Address requestAddressDetail(GetAddress wrapper) throws IfrendMLIException;

	public abstract Contact requestContactDetail(GetContactDetail  wrapper) throws IfrendMLIException;
	/**
	 * @throws IfrendMLIException 
	 */
	public abstract Account requestAccount(GetAccount wrapper) throws IfrendMLIException;

	
}
