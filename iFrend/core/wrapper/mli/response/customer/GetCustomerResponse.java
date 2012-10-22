package com.isg.ifrend.wrapper.mli.response.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.account.Account;
import com.isg.ifrend.model.mli.customer.Customer;

@XmlRootElement(name="GetCustomerResponse")
public class GetCustomerResponse {
	
	@XmlElement(name="customer")
	private Customer customer;
	@XmlElement(name="account")
	
	private List<Account> accounts;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
