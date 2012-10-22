package com.isg.ifrend.wrapper.mli.response.account;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.account.PayoutFigure;

@XmlRootElement(name="GetPayoutFigureResponse")
public class GetPayoutFigureResponse {

	@XmlElement(name="payoutFigure")
	private PayoutFigure payoutFigure;
	

	public PayoutFigure getPayoutFigure() {
		return payoutFigure;
	}

	public void setPayoutFigure(PayoutFigure payoutFigure) {
		this.payoutFigure = payoutFigure;
	}
	
	
}