package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.RedempAdjustmentDTO;
import com.isg.ifrend.core.model.mli.dto.RedemptionDTO;


public interface RewardsMLIService {

		
		/**
		 */
		public abstract String requestRedemption(RedemptionDTO dto);

			
			/**
			 */
			public abstract String requestRedempAdjustment(RedempAdjustmentDTO dto);
			
		

}
