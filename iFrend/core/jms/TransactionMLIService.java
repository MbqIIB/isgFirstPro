package com.isg.ifrend.jms;

import java.util.List;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.transaction.Statement;
import com.isg.ifrend.model.mli.transaction.Transaction;
import com.isg.ifrend.wrapper.mli.request.transaction.DisputeTransaction;
import com.isg.ifrend.wrapper.mli.request.transaction.GetStatement;
import com.isg.ifrend.wrapper.mli.request.transaction.ListTransaction;
import com.isg.ifrend.wrapper.mli.request.transaction.ManualAdjustment;
import com.isg.ifrend.wrapper.mli.request.transaction.ReverseAuthorization;


public interface TransactionMLIService {

	public abstract List<Transaction> requestListTransaction(ListTransaction wrapper) throws IfrendMLIException;
	
	public abstract String requestTransactionDispute(DisputeTransaction wrapper) throws IfrendMLIException;		
		
	public abstract String requestAuthorizationReversal(ReverseAuthorization wrapper) throws IfrendMLIException;	
	
	public abstract Statement requestTransactionStatement(GetStatement wrapper) throws IfrendMLIException;
	
	public abstract String requestManualAdjustment(ManualAdjustment wrapper) throws IfrendMLIException;
		

}
