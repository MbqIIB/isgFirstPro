package com.isg.ifrend.wrapper.mli.response.account;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.account.Account;

@XmlRootElement(name="GetAccountResponse")
public class GetAccountResponse {

	@XmlElement(name="account")
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
