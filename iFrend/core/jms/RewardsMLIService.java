package com.isg.ifrend.jms;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.reward.Redemption;
import com.isg.ifrend.model.mli.reward.Reward;
import com.isg.ifrend.wrapper.mli.request.reward.CancelRedempAdj;
import com.isg.ifrend.wrapper.mli.request.reward.CancelRedemption;
import com.isg.ifrend.wrapper.mli.request.reward.CreateRedempAdj;
import com.isg.ifrend.wrapper.mli.request.reward.CreateRedemption;
import com.isg.ifrend.wrapper.mli.request.reward.GetRedemption;
import com.isg.ifrend.wrapper.mli.request.reward.GetReward;
import com.isg.ifrend.wrapper.mli.request.reward.UpdateRedempAdj;
import com.isg.ifrend.wrapper.mli.request.reward.UpdateRedemption;


public interface RewardsMLIService {

		
		/**
		 * @throws IfrendMLIException 
		 */
		public abstract Reward getReward(GetReward wrapper) throws IfrendMLIException;
		
		public abstract Redemption getRedemption(GetRedemption wrapper) throws IfrendMLIException;
		
		public abstract String createRedemption(CreateRedemption wrapper) throws IfrendMLIException;
		public abstract String updateRedemption(UpdateRedemption wrapper) throws IfrendMLIException;
		public abstract String cancelRedemption(CancelRedemption wrapper) throws IfrendMLIException;
			
		/**
		 * @throws IfrendMLIException 
		 */
		public abstract String createRedempAdj(CreateRedempAdj wrapper) throws IfrendMLIException;
		public abstract String updateRedempAdj(UpdateRedempAdj wrapper) throws IfrendMLIException;
		public abstract String cancelRedempAdj(CancelRedempAdj wrapper) throws IfrendMLIException;
			
		

}
