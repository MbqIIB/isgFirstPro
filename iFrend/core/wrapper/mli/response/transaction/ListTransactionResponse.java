package com.isg.ifrend.wrapper.mli.response.transaction;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.transaction.Transaction;

@XmlRootElement(name="ListTransactionResponse")
public class ListTransactionResponse {
	
	@XmlElement(name="transaction")
	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
