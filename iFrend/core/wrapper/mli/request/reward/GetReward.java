package com.isg.ifrend.wrapper.mli.request.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetReward")
public class GetReward {
	
	private String accountNumber;
			
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	
}
