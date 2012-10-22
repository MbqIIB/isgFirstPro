package com.isg.ifrend.jms;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

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
import com.isg.ifrend.wrapper.mli.response.account.GetAccountResponse;
import com.isg.ifrend.wrapper.mli.response.customer.GetAddressResponse;
import com.isg.ifrend.wrapper.mli.response.customer.GetContactDetailResponse;
import com.isg.ifrend.wrapper.mli.response.customer.GetCustomerResponse;
import com.isg.ifrend.wrapper.mli.response.customer.GetRelationshipResponse;
import com.isg.ifrend.wrapper.mli.response.customer.SearchCustomerResponse;


public class CustomerMLIServiceImpl extends MLIService implements
		CustomerMLIService {
	
	private static Logger logger = Logger.getLogger(CustomerMLIServiceImpl.class);

	@Value("${customerQueue}")
	private String custQueue;
	@Value("${customerDestination}")
	private String custDestination;
	@Value("${customerSearchQueue}")
	private String custSearchQueue;
	@Value("${customerSearchDestination}")
	private String custSearchDestination;
	@Value("${relationshipQueue}")
	private String relQueue;	
	@Value("${relationshipDestination}")
	private String relDestination;
	@Value("${addressQueue}")
	private String addrQueue;
	@Value("${addressDestination}")
	private String addrDestination;
	@Value("${contactQueue}")
	private String contQueue;
	@Value("${contactDestination}")
	private String contDestination;
	@Value("${accountQueue}")
	private String accntQueue;	
	@Value("${accountDestination}")
	private String accntDestination;
	
	@Override
	public List<Customer> requestSearchCustomer(SearchCustomer wrapper) throws IfrendMLIException {
		List<Customer> customers=null;				
		Object obj = processRequest(wrapper, SearchCustomerResponse.class, custSearchQueue, custSearchDestination);
		if(obj!=null){
			customers  = ((SearchCustomerResponse)obj).getCustomers();
		}
		return customers;		
	}

	@Override
	public Customer requestGetCustomer(GetCustomer wrapper) throws IfrendMLIException {
		// TODO Auto-generated method stub
		Customer customer=null;			
		Object obj = processRequest(wrapper, GetCustomerResponse.class, custQueue, custDestination);
		if(obj!=null & obj instanceof GetCustomerResponse){
			customer = ((GetCustomerResponse)obj).getCustomer();
			customer.setAccountList(((GetCustomerResponse)obj).getAccounts());
		}
		return customer;
	}
	
	@Override
	public List<Account> requestRelationship(GetRelationship wrapper) throws IfrendMLIException {
		List<Account> accounts=null;
		Object obj = processRequest(wrapper, GetRelationshipResponse.class, relQueue, relDestination);
		if(obj!=null & obj instanceof GetRelationshipResponse){
			accounts = ((GetRelationshipResponse)obj).getAccounts();
		}
		return accounts;
	}

	@Override
	public Address requestAddressDetail(GetAddress wrapper) throws IfrendMLIException {
		Address address=null;
		Object obj = processRequest(wrapper, GetAddressResponse.class, addrQueue, addrDestination);
		if(obj!=null & obj instanceof GetAddressResponse){
			address = ((GetAddressResponse)obj).getAddr();
		}
		return address;
	}

	@Override
	public Contact requestContactDetail(GetContactDetail wrapper) throws IfrendMLIException {
		Contact contact=null;
		Object obj = processRequest(wrapper, GetContactDetailResponse.class, contQueue, contDestination);
		if(obj!=null & obj instanceof GetContactDetailResponse){
			contact = ((GetContactDetailResponse)obj).getContact();
		}
		return contact;
		
	}

	@Override
	public Account requestAccount(GetAccount wrapper) throws IfrendMLIException {
		Account account=null;
		Object obj = processRequest(wrapper, GetAccountResponse.class, accntQueue, accntDestination);
		if(obj!=null & obj instanceof GetAccountResponse){
			account = ((GetAccountResponse)obj).getAccount();
		}
		return account;
	}

	
	
	public String getCustQueue() {
		return custQueue;
	}

	public void setCustQueue(String custQueue) {
		this.custQueue = custQueue;
	}

	public String getCustDestination() {
		return custDestination;
	}

	public void setCustDestination(String custDestination) {
		this.custDestination = custDestination;
	}

	public String getRelQueue() {
		return relQueue;
	}

	public void setRelQueue(String relQueue) {
		this.relQueue = relQueue;
	}

	public String getRelDestination() {
		return relDestination;
	}

	public void setRelDestination(String relDestination) {
		this.relDestination = relDestination;
	}

	public String getAddrQueue() {
		return addrQueue;
	}

	public void setAddrQueue(String addrQueue) {
		this.addrQueue = addrQueue;
	}

	public String getAddrDestination() {
		return addrDestination;
	}

	public void setAddrDestination(String addrDestination) {
		this.addrDestination = addrDestination;
	}

	public String getContQueue() {
		return contQueue;
	}

	public void setContQueue(String contQueue) {
		this.contQueue = contQueue;
	}

	public String getContDestination() {
		return contDestination;
	}

	public void setContDestination(String contDestination) {
		this.contDestination = contDestination;
	}

	public String getAccntQueue() {
		return accntQueue;
	}

	public void setAccntQueue(String accntQueue) {
		this.accntQueue = accntQueue;
	}

	public String getAccntDestination() {
		return accntDestination;
	}

	public void setAccntDestination(String accntDestination) {
		this.accntDestination = accntDestination;
	}

	public String getCustSearchQueue() {
		return custSearchQueue;
	}

	public void setCustSearchQueue(String custSearchQueue) {
		this.custSearchQueue = custSearchQueue;
	}

	public String getCustSearchDestination() {
		return custSearchDestination;
	}

	public void setCustSearchDestination(String custSearchDestination) {
		this.custSearchDestination = custSearchDestination;
	}

	


}
