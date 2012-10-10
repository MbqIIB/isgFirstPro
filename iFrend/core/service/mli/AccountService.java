package com.isg.ifrend.core.service.mli;

import java.util.List;


public interface AccountService {

		
		/**
		 */
		public abstract List increaseAccountCreditLimit(Object accountCreditLimitModel);

			
			/**
			 */
			public abstract Object getAccountInfo(String cardNum);


				
				/**
				 */
				public abstract List increaseCustomerCreditLimit(Object accountCustomerModel);


					
					/**
					 */
					public abstract List directDebit(Object directDebitModel);


						
						/**
						 */
						public abstract List updateAccount(Object accountMaintenanceModel);


							
							/**
							 */
							public abstract Object displayPayoutFigure(Object payoutFigureModel);


								
								/**
								 */
								public abstract List closeAccount(Object accountClosureModel);
								
							
						
					
				
			
		

}
