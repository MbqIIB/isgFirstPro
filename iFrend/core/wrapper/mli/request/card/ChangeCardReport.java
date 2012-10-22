package com.isg.ifrend.wrapper.mli.request.card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.card.LostStolenReport;

@XmlRootElement(name="ChangeCardReport")
public class ChangeCardReport {

	@XmlElement(name="report")
	private LostStolenReport report;

	public LostStolenReport getReport() {
		return report;
	}

	public void setReport(LostStolenReport report) {
		this.report = report;
	}
	
}
