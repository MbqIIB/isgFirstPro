package com.isg.ifrend.core.service.mli;

import java.util.List;


public interface RewardService {

		
		/**
		 */
		public abstract List searchReward(String status);

			
			/**
			 */
			public abstract List createRedemption(Object redemptionModel);


				
				/**
				 */
				public abstract List updateRedemption(Object redemptionModel);


					
					/**
					 */
					public abstract List cancelRedemption(Object redemptionModel);


						
						/**
						 */
						public abstract List convertRewardPoints(int rewardPoint);
						
					
				
			
		

}
