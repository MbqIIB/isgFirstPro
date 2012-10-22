package com.isg.ifrend.wrapper.mli.response.card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.card.LostStolenReport;

@XmlRootElement(name="InquireCardReportResponse")
public class InquireCardReportResponse {

	@XmlElement(name="report")
	private LostStolenReport cardReport;

	public LostStolenReport getCardReport() {
		return cardReport;
	}

	public void setCardReport(LostStolenReport cardReport) {
		this.cardReport = cardReport;
	}
}
