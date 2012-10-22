package com.isg.ifrend.wrapper.mli.request.account;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DirectDebit")
public class DirectDebit {

	private String accountNumber;
	private String ACH_DebitNum;
	private String ACH_RT_Num;
	private int paymentMethod;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getACH_DebitNum() {
		return ACH_DebitNum;
	}
	public void setACH_DebitNum(String aCH_DebitNum) {
		ACH_DebitNum = aCH_DebitNum;
	}
	public String getACH_RT_Num() {
		return ACH_RT_Num;
	}
	public void setACH_RT_Num(String aCH_RT_Num) {
		ACH_RT_Num = aCH_RT_Num;
	}
	public int getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
