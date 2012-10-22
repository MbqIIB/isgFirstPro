package com.isg.ifrend.wrapper.mli.request.reward;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CancelRedemption")
public class CancelRedemption {

	private long redemptionNumber;

	public long getRedemptionNumber() {
		return redemptionNumber;
	}

	public void setRedemptionNumber(long redemptionNumber) {
		this.redemptionNumber = redemptionNumber;
	}
	
}
