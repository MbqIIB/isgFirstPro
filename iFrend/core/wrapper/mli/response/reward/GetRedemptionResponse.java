package com.isg.ifrend.wrapper.mli.response.reward;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.reward.Redemption;

@XmlRootElement(name="GetRedemptionResponse")
public class GetRedemptionResponse {

	private String accountNumber;
	
	@XmlElement(name="redemption")
	private Redemption redemption;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Redemption getRedemption() {
		return redemption;
	}
	public void setRedemption(Redemption redemption) {
		this.redemption = redemption;
	}
	
}
