package com.isg.ifrend.core.service.mli;

import java.util.List;

import com.isg.ifrend.core.model.mli.customer.Address;
import com.isg.ifrend.core.model.mli.customer.Contact;
import com.isg.ifrend.core.model.mli.customer.Customer;


public interface CustomerService {

			
	public abstract List<Customer> searchCustomer(Customer customer);

	public abstract Customer getRelationship(String param);	

    public abstract Address getAddressDetail(String customerNum);

	public abstract Contact getContactDetail(String customerNum);
	
	public abstract String updateCustomerDetail(Customer customer);
							
						
					
				
			
		

}
