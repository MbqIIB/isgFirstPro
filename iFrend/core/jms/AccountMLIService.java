package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.AccountClosureDTO;
import com.isg.ifrend.core.model.mli.dto.AccountCreditLimitDTO;
import com.isg.ifrend.core.model.mli.dto.AccountMaintenanceDTO;
import com.isg.ifrend.core.model.mli.dto.CustomerCreditLimitDTO;
import com.isg.ifrend.core.model.mli.dto.DirectDebitDTO;
import com.isg.ifrend.core.model.mli.dto.PayoutFigureDTO;


public interface AccountMLIService {


	/**
	 */
	public abstract String requestIncAcctCreditLimit(AccountCreditLimitDTO dto);




	/**
	 */
	public abstract String requestIncCustCreditLimit(CustomerCreditLimitDTO dto);



	/**
	 */
	public abstract String requestDirectDebit(DirectDebitDTO dto);



	/**
	 */
	public abstract String requestAccountMaintenance(AccountMaintenanceDTO dto);



	/**
	 */
	public abstract String requestPayoutFigure(PayoutFigureDTO dto);



	/**
	 */
	public abstract String requestAccountClosure(AccountClosureDTO dto);

	
	
}
