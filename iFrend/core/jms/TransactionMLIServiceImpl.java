package com.isg.ifrend.jms;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.transaction.Statement;
import com.isg.ifrend.model.mli.transaction.Transaction;
import com.isg.ifrend.wrapper.mli.request.transaction.DisputeTransaction;
import com.isg.ifrend.wrapper.mli.request.transaction.GetStatement;
import com.isg.ifrend.wrapper.mli.request.transaction.ListTransaction;
import com.isg.ifrend.wrapper.mli.request.transaction.ManualAdjustment;
import com.isg.ifrend.wrapper.mli.request.transaction.ReverseAuthorization;
import com.isg.ifrend.wrapper.mli.response.transaction.DisputeTransactionResponse;
import com.isg.ifrend.wrapper.mli.response.transaction.GetStatementResponse;
import com.isg.ifrend.wrapper.mli.response.transaction.ListTransactionResponse;
import com.isg.ifrend.wrapper.mli.response.transaction.ManualAdjustmentResponse;
import com.isg.ifrend.wrapper.mli.response.transaction.ReverseAuthorizationResponse;


public class TransactionMLIServiceImpl extends MLIService implements
		TransactionMLIService {
	
	@Value("${disputeTxnQueue}")
	private String disputeTxnQueue;
	@Value("${disputeTxnDest}")
	private String disputeTxnDest;
	@Value("${reverseAuthnzQueue}")
	private String reverseAuthnzQueue;
	@Value("${reverseAuthnzDest}")
	private String reverseAuthnzDest;
	@Value("${manualAdjQueue}")
	private String manualAdjQueue;
	@Value("${manualAdjDest}")
	private String manualAdjDest;
	@Value("${listTxnQueue}")
	private String listTxnQueue;
	@Value("${listTxnDest}")
	private String listTxnDest;
	@Value("${getStmtQueue}")
	private String getStmtQueue;
	@Value("${getStmtDest}")
	private String getStmtDest;
	

	@Override
	public String requestTransactionDispute(DisputeTransaction wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, DisputeTransactionResponse.class, disputeTxnQueue, disputeTxnDest);
		if(obj!=null & obj instanceof DisputeTransactionResponse){
			mliResponse = ((DisputeTransactionResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String requestAuthorizationReversal(ReverseAuthorization wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, ReverseAuthorizationResponse.class, reverseAuthnzQueue, reverseAuthnzDest);
		if(obj!=null & obj instanceof ReverseAuthorizationResponse){
			mliResponse = ((ReverseAuthorizationResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}


	@Override
	public String requestManualAdjustment(ManualAdjustment wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, ManualAdjustmentResponse.class, manualAdjQueue, manualAdjDest);
		if(obj!=null & obj instanceof ManualAdjustmentResponse){
			mliResponse = ((ManualAdjustmentResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public List<Transaction> requestListTransaction(ListTransaction wrapper) throws IfrendMLIException {
		List<Transaction> transactions=null;		
		Object obj = processRequest(wrapper, ListTransactionResponse.class, listTxnQueue, listTxnDest);
		if(obj!=null & obj instanceof ListTransactionResponse){
			transactions = ((ListTransactionResponse)obj).getTransactions();
		}
		return transactions;
	}

	@Override
	public Statement requestTransactionStatement(GetStatement wrapper) throws IfrendMLIException {
		Statement statement=null;		
		Object obj = processRequest(wrapper, GetStatementResponse.class, getStmtQueue, getStmtDest);
		if(obj!=null & obj instanceof GetStatementResponse){
			statement = ((GetStatementResponse)obj).getStatement();
			statement.setListTransactionDetail(((GetStatementResponse)obj).getTransactions());
		}
		return statement;
	}

	public String getDisputeTxnQueue() {
		return disputeTxnQueue;
	}

	public void setDisputeTxnQueue(String disputeTxnQueue) {
		this.disputeTxnQueue = disputeTxnQueue;
	}

	public String getDisputeTxnDest() {
		return disputeTxnDest;
	}

	public void setDisputeTxnDest(String disputeTxnDest) {
		this.disputeTxnDest = disputeTxnDest;
	}

	public String getReverseAuthnzQueue() {
		return reverseAuthnzQueue;
	}

	public void setReverseAuthnzQueue(String reverseAuthnzQueue) {
		this.reverseAuthnzQueue = reverseAuthnzQueue;
	}

	public String getReverseAuthnzDest() {
		return reverseAuthnzDest;
	}

	public void setReverseAuthnzDest(String reverseAuthnzDest) {
		this.reverseAuthnzDest = reverseAuthnzDest;
	}

	public String getManualAdjQueue() {
		return manualAdjQueue;
	}

	public void setManualAdjQueue(String manualAdjQueue) {
		this.manualAdjQueue = manualAdjQueue;
	}

	public String getManualAdjDest() {
		return manualAdjDest;
	}

	public void setManualAdjDest(String manualAdjDest) {
		this.manualAdjDest = manualAdjDest;
	}

	public String getListTxnQueue() {
		return listTxnQueue;
	}

	public void setListTxnQueue(String listTxnQueue) {
		this.listTxnQueue = listTxnQueue;
	}

	public String getListTxnDest() {
		return listTxnDest;
	}

	public void setListTxnDest(String listTxnDest) {
		this.listTxnDest = listTxnDest;
	}

	public String getGetStmtQueue() {
		return getStmtQueue;
	}

	public void setGetStmtQueue(String getStmtQueue) {
		this.getStmtQueue = getStmtQueue;
	}

	public String getGetStmtDest() {
		return getStmtDest;
	}

	public void setGetStmtDest(String getStmtDest) {
		this.getStmtDest = getStmtDest;
	}

	
	
}
