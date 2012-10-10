package com.isg.ifrend.core.service.mli;

import java.util.List;


public interface TransactionService {

		
		/**
		 * @param caseType TODO
		 */
		public abstract List createTransactionCase(Object transactionModel, String caseType);

			
			/**
			 */
			public abstract List reverseTransAuthorization(Object transactionModel);


			
		

}
