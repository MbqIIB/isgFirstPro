package com.isg.ifrend.wrapper.mli.request.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ConvertRewarPoints")
public class ConvertRewardPoints {

	public String accountNumber;
	public long rewardPointsToConvert;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getRewardPointsToConvert() {
		return rewardPointsToConvert;
	}
	public void setRewardPointsToConvert(long rewardPointsToConvert) {
		this.rewardPointsToConvert = rewardPointsToConvert;
	}
	
}
