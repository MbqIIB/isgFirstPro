package com.isg.ifrend.wrapper.mli.response.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.customer.Customer;

@XmlRootElement(name="SearchCustomerResponse")
public class SearchCustomerResponse {

	public List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
