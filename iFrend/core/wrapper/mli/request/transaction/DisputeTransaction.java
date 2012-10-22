package com.isg.ifrend.wrapper.mli.request.transaction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.Case;

@XmlRootElement(name="DisputeTransaction")
public class DisputeTransaction {
	
	@XmlElement(name="case")
	private Case disputeCase;

	public Case getDisputeCase() {
		return disputeCase;
	}

	public void setDisputeCase(Case disputeCase) {
		this.disputeCase = disputeCase;
	}
}
