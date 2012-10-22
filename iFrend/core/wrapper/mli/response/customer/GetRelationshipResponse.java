package com.isg.ifrend.wrapper.mli.response.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.account.Account;

@XmlRootElement(name="GetRelationshipResponse")
public class GetRelationshipResponse {

	@XmlElement(name="account")
	private List<Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
