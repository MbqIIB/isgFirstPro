package com.isg.ifrend.wrapper.mli.response.reward;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.reward.Reward;


@XmlRootElement(name="GetRewardResponse")
public class GetRewardResponse {
	
	private String accountNumber;
	
	@XmlElement(name="reward")
	private Reward reward;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	
	
}
