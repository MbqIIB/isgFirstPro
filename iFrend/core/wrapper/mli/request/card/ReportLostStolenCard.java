package com.isg.ifrend.wrapper.mli.request.card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.card.LostStolenReport;

@XmlRootElement(name="ReportLostStolenCard")
public class ReportLostStolenCard {

	private String accountNumber;
	private String customerNumber;
	
	@XmlElement(name="report")
	private LostStolenReport report;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public LostStolenReport getReport() {
		return report;
	}

	public void setReport(LostStolenReport report) {
		this.report = report;
	}
	
}
