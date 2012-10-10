package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.AuthorizationReversalDTO;
import com.isg.ifrend.core.model.mli.dto.TransactionDisputeDTO;


public interface TransactionMLIService {

	/**
	 */
	public abstract String requestTransactionDispute(TransactionDisputeDTO dto);

		
		/**
		 */
		public abstract String requestAuthorizationReversal(AuthorizationReversalDTO dto);
		

}
