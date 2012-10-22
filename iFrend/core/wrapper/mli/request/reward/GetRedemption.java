package com.isg.ifrend.wrapper.mli.request.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetRedemption")
public class GetRedemption {

	private String accountNumber;
	private long redemptionNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getRedemptionNumber() {
		return redemptionNumber;
	}
	public void setRedemptionNumber(long redemptionNumber) {
		this.redemptionNumber = redemptionNumber;
	}
	
}
