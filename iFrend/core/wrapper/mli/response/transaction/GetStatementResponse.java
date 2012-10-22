package com.isg.ifrend.wrapper.mli.response.transaction;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.transaction.Statement;
import com.isg.ifrend.model.mli.transaction.Transaction;

@XmlRootElement(name="GetStatementResponse")
public class GetStatementResponse {
		
	@XmlElement(name="statement")
	private Statement statement;
	
	@XmlElement(name="transaction")
	private List<Transaction> transactions;

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	
	
}
