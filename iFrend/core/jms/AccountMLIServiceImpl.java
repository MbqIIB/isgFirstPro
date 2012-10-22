package com.isg.ifrend.jms;

import org.springframework.beans.factory.annotation.Value;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.account.PayoutFigure;
import com.isg.ifrend.wrapper.mli.request.account.AccountMaintenance;
import com.isg.ifrend.wrapper.mli.request.account.CloseAccount;
import com.isg.ifrend.wrapper.mli.request.account.DirectDebit;
import com.isg.ifrend.wrapper.mli.request.account.GetPayoutFigure;
import com.isg.ifrend.wrapper.mli.request.account.IncrAccntCreditLimit;
import com.isg.ifrend.wrapper.mli.request.account.IncrCustCreditLimit;
import com.isg.ifrend.wrapper.mli.response.account.AccountMaintenanceResponse;
import com.isg.ifrend.wrapper.mli.response.account.CloseAccountResponse;
import com.isg.ifrend.wrapper.mli.response.account.DirectDebitResponse;
import com.isg.ifrend.wrapper.mli.response.account.GetPayoutFigureResponse;
import com.isg.ifrend.wrapper.mli.response.account.IncrAccntCreditLimitResponse;
import com.isg.ifrend.wrapper.mli.response.account.IncrCustCreditLimitResponse;


public class AccountMLIServiceImpl extends MLIService implements
		AccountMLIService {
	
	@Value("${accntCreditLimitQueue}")
	private String accntCreditLimitQueue;
	@Value("${accntCreditLimitDest}")
	private String accntCreditLimitDest;
	@Value("${custCreditLimitQueue}")
	private String custCreditLimitQueue;
	@Value("${custtCreditLimitDest}")
	private String custtCreditLimitDest;
	@Value("${directDebitQueue}")
	private String directDebitQueue;
	@Value("${directDebitDest}")
	private String directDebitDest;
	@Value("${accntMaintQueue}")
	private String accntMaintQueue;
	@Value("${accntMaintDest}")
	private String accntMaintDest;
	@Value("${payoutFigQueue}")
	private String payoutFigQueue;
	@Value("${payoutFigDest}")
	private String payoutFigDest;
	@Value("${accntClosureQueue}")
	private String accntClosureQueue;
	@Value("${accntClosureDest}")
	private String accntClosureDest;
	
	

	@Override
	public String increaseAcctCreditLimit(IncrAccntCreditLimit wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, IncrAccntCreditLimitResponse.class, accntCreditLimitQueue, accntCreditLimitDest);
		if(obj!=null & obj instanceof IncrAccntCreditLimitResponse){
			mliResponse = ((IncrAccntCreditLimitResponse)obj).getMliResponseCode();
		}
		return mliResponse;
		
	}

	@Override
	public String increaseCustCreditLimit(IncrCustCreditLimit wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, IncrCustCreditLimitResponse.class, custCreditLimitQueue, custtCreditLimitDest);
		if(obj!=null & obj instanceof IncrCustCreditLimitResponse){
			mliResponse = ((IncrCustCreditLimitResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String requestDirectDebit(DirectDebit wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, DirectDebitResponse.class, directDebitQueue, directDebitDest);
		if(obj!=null & obj instanceof DirectDebitResponse){
			mliResponse = ((DirectDebitResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String requestAccountMaintenance(AccountMaintenance wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, AccountMaintenanceResponse.class, accntMaintQueue, accntMaintDest);
		if(obj!=null & obj instanceof AccountMaintenanceResponse){
			mliResponse = ((AccountMaintenanceResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public PayoutFigure requestPayoutFigure(GetPayoutFigure wrapper) throws IfrendMLIException {
		PayoutFigure figure =null;		
		Object obj = processRequest(wrapper, GetPayoutFigureResponse.class, payoutFigQueue, payoutFigDest);
		if(obj!=null & obj instanceof GetPayoutFigureResponse){
			figure = ((GetPayoutFigureResponse)obj).getPayoutFigure();
		}
		return figure;
	}

	@Override
	public String requestAccountClosure(CloseAccount wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CloseAccountResponse.class, accntClosureQueue, accntClosureDest);
		if(obj!=null & obj instanceof CloseAccountResponse){
			mliResponse = ((CloseAccountResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	public String getAccntCreditLimitQueue() {
		return accntCreditLimitQueue;
	}

	public void setAccntCreditLimitQueue(String accntCreditLimitQueue) {
		this.accntCreditLimitQueue = accntCreditLimitQueue;
	}

	public String getAccntCreditLimitDest() {
		return accntCreditLimitDest;
	}

	public void setAccntCreditLimitDest(String accntCreditLimitDest) {
		this.accntCreditLimitDest = accntCreditLimitDest;
	}

	public String getCustCreditLimitQueue() {
		return custCreditLimitQueue;
	}

	public void setCustCreditLimitQueue(String custCreditLimitQueue) {
		this.custCreditLimitQueue = custCreditLimitQueue;
	}

	public String getCusttCreditLimitDest() {
		return custtCreditLimitDest;
	}

	public void setCusttCreditLimitDest(String custtCreditLimitDest) {
		this.custtCreditLimitDest = custtCreditLimitDest;
	}

	public String getDirectDebitQueue() {
		return directDebitQueue;
	}

	public void setDirectDebitQueue(String directDebitQueue) {
		this.directDebitQueue = directDebitQueue;
	}

	public String getDirectDebitDest() {
		return directDebitDest;
	}

	public void setDirectDebitDest(String directDebitDest) {
		this.directDebitDest = directDebitDest;
	}

	public String getAccntMaintQueue() {
		return accntMaintQueue;
	}

	public void setAccntMaintQueue(String accntMaintQueue) {
		this.accntMaintQueue = accntMaintQueue;
	}

	public String getAccntMaintDest() {
		return accntMaintDest;
	}

	public void setAccntMaintDest(String accntMaintDest) {
		this.accntMaintDest = accntMaintDest;
	}

	public String getPayoutFigQueue() {
		return payoutFigQueue;
	}

	public void setPayoutFigQueue(String payoutFigQueue) {
		this.payoutFigQueue = payoutFigQueue;
	}

	public String getPayoutFigDest() {
		return payoutFigDest;
	}

	public void setPayoutFigDest(String payoutFigDest) {
		this.payoutFigDest = payoutFigDest;
	}

	public String getAccntClosureQueue() {
		return accntClosureQueue;
	}

	public void setAccntClosureQueue(String accntClosureQueue) {
		this.accntClosureQueue = accntClosureQueue;
	}

	public String getAccntClosureDest() {
		return accntClosureDest;
	}

	public void setAccntClosureDest(String accntClosureDest) {
		this.accntClosureDest = accntClosureDest;
	}

}
