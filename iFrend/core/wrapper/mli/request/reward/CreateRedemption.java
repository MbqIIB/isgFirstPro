package com.isg.ifrend.wrapper.mli.request.reward;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.reward.Redemption;

@XmlRootElement(name="CreateRedemption")
public class CreateRedemption {

	@XmlElement(name="redemption")
	private Redemption redemption;

	public Redemption getRedemption() {
		return redemption;
	}

	public void setRedemption(Redemption redemption) {
		this.redemption = redemption;
	}
	
}
