package com.isg.ifrend.jms;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.account.PayoutFigure;
import com.isg.ifrend.wrapper.mli.request.account.CloseAccount;
import com.isg.ifrend.wrapper.mli.request.account.DirectDebit;
import com.isg.ifrend.wrapper.mli.request.account.GetPayoutFigure;
import com.isg.ifrend.wrapper.mli.request.account.IncrAccntCreditLimit;
import com.isg.ifrend.wrapper.mli.request.account.IncrCustCreditLimit;
import com.isg.ifrend.wrapper.mli.request.account.AccountMaintenance;


public interface AccountMLIService {


	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String increaseAcctCreditLimit(IncrAccntCreditLimit wrapper) throws IfrendMLIException;




	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String increaseCustCreditLimit(IncrCustCreditLimit wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String requestDirectDebit(DirectDebit wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String requestAccountMaintenance(AccountMaintenance wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract PayoutFigure requestPayoutFigure(GetPayoutFigure wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String requestAccountClosure(CloseAccount wrapper) throws IfrendMLIException;

	
	
}
