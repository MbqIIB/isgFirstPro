package com.isg.ifrend.jms;

import org.springframework.beans.factory.annotation.Value;

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
import com.isg.ifrend.wrapper.mli.response.reward.CancelRedempAdjResponse;
import com.isg.ifrend.wrapper.mli.response.reward.CancelRedemptionResponse;
import com.isg.ifrend.wrapper.mli.response.reward.CreateRedempAdjResponse;
import com.isg.ifrend.wrapper.mli.response.reward.CreateRedemptionResponse;
import com.isg.ifrend.wrapper.mli.response.reward.GetRedemptionResponse;
import com.isg.ifrend.wrapper.mli.response.reward.GetRewardResponse;
import com.isg.ifrend.wrapper.mli.response.reward.UpdateRedempAdjResponse;
import com.isg.ifrend.wrapper.mli.response.reward.UpdateRedemptionResponse;

public class RewardsMLIServiceImpl extends MLIService implements
		RewardsMLIService {

	@Value("${getRewardQueue}")
	private String getRewardQueue;
	@Value("${getRewardDest}")
	private String getRewardDest;
	@Value("${getRedemptionQueue}")
	private String getRedemptionQueue;
	@Value("${getRedemptionDest}")
	private String getRedemptionDest;
	@Value("${createRedemptionQueue}")
	private String createRedemptionQueue;
	@Value("${createRedemptionDest}")
	private String createRedemptionDest;
	@Value("${updateRedemptionQueue}")
	private String updateRedemptionQueue;
	@Value("${updateRedemptionDest}")
	private String updateRedemptionDest;
	@Value("${cancelRedemptionQueue}")
	private String cancelRedemptionQueue;
	@Value("${cancelRedemptionDest}")
	private String cancelRedemptionDest;
	@Value("${createRedempAdjQueue}")
	private String createRedempAdjQueue;
	@Value("${createRedempAdjDest}")
	private String createRedempAdjDest;
	@Value("${updateRedempAdjQueue}")
	private String updateRedempAdjQueue;
	@Value("${updateRedempAdjDest}")
	private String updateRedempAdjDest;
	@Value("${cancelRedempAdjQueue}")
	private String cancelRedempAdjQueue;
	@Value("${cancelRedempAdjDest}")
	private String cancelRedempAdjDest;
	
	
	@Override
	public Reward getReward(GetReward wrapper) throws IfrendMLIException {
		Reward reward=null;		
		Object obj = processRequest(wrapper, GetRewardResponse.class, getRewardQueue, getRewardDest);
		if(obj!=null & obj instanceof GetRewardResponse){
			reward = ((GetRewardResponse)obj).getReward();		
		}
		return reward;
	}

	@Override
	public Redemption getRedemption(GetRedemption wrapper) throws IfrendMLIException {
		Redemption redemption=null;		
		Object obj = processRequest(wrapper, GetRedemptionResponse.class, getRedemptionQueue, getRedemptionDest);
		if(obj!=null & obj instanceof GetRedemptionResponse){
			redemption = ((GetRedemptionResponse)obj).getRedemption();	
		}
		return redemption;
	}

	@Override
	public String createRedemption(CreateRedemption wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CreateRedemptionResponse.class, createRedemptionQueue, createRedemptionDest);
		if(obj!=null & obj instanceof CreateRedemptionResponse){
			mliResponse = ((CreateRedemptionResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String updateRedemption(UpdateRedemption wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, UpdateRedemptionResponse.class, updateRedemptionQueue, updateRedemptionDest);
		if(obj!=null & obj instanceof UpdateRedemptionResponse){
			mliResponse = ((UpdateRedemptionResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String cancelRedemption(CancelRedemption wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CancelRedemptionResponse.class, cancelRedemptionQueue, cancelRedemptionDest);
		if(obj!=null & obj instanceof CancelRedemptionResponse){
			mliResponse = ((CancelRedemptionResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String createRedempAdj(CreateRedempAdj wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CreateRedempAdjResponse.class, createRedempAdjQueue, createRedempAdjDest);
		if(obj!=null & obj instanceof CreateRedempAdjResponse){
			mliResponse = ((CreateRedempAdjResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String updateRedempAdj(UpdateRedempAdj wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, UpdateRedempAdjResponse.class, updateRedempAdjQueue, updateRedempAdjDest);
		if(obj!=null & obj instanceof UpdateRedempAdjResponse){
			mliResponse = ((UpdateRedempAdjResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String cancelRedempAdj(CancelRedempAdj wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CancelRedempAdjResponse.class, cancelRedempAdjQueue, cancelRedempAdjDest);
		if(obj!=null & obj instanceof CancelRedempAdjResponse){
			mliResponse = ((CancelRedempAdjResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	public String getGetRewardQueue() {
		return getRewardQueue;
	}

	public void setGetRewardQueue(String getRewardQueue) {
		this.getRewardQueue = getRewardQueue;
	}

	public String getGetRewardDest() {
		return getRewardDest;
	}

	public void setGetRewardDest(String getRewardDest) {
		this.getRewardDest = getRewardDest;
	}

	public String getGetRedemptionQueue() {
		return getRedemptionQueue;
	}

	public void setGetRedemptionQueue(String getRedemptionQueue) {
		this.getRedemptionQueue = getRedemptionQueue;
	}

	public String getGetRedemptionDest() {
		return getRedemptionDest;
	}

	public void setGetRedemptionDest(String getRedemptionDest) {
		this.getRedemptionDest = getRedemptionDest;
	}

	public String getCreateRedemptionQueue() {
		return createRedemptionQueue;
	}

	public void setCreateRedemptionQueue(String createRedemptionQueue) {
		this.createRedemptionQueue = createRedemptionQueue;
	}

	public String getCreateRedemptionDest() {
		return createRedemptionDest;
	}

	public void setCreateRedemptionDest(String createRedemptionDest) {
		this.createRedemptionDest = createRedemptionDest;
	}

	public String getUpdateRedemptionQueue() {
		return updateRedemptionQueue;
	}

	public void setUpdateRedemptionQueue(String updateRedemptionQueue) {
		this.updateRedemptionQueue = updateRedemptionQueue;
	}

	public String getUpdateRedemptionDest() {
		return updateRedemptionDest;
	}

	public void setUpdateRedemptionDest(String updateRedemptionDest) {
		this.updateRedemptionDest = updateRedemptionDest;
	}

	public String getCancelRedemptionQueue() {
		return cancelRedemptionQueue;
	}

	public void setCancelRedemptionQueue(String cancelRedemptionQueue) {
		this.cancelRedemptionQueue = cancelRedemptionQueue;
	}

	public String getCancelRedemptionDest() {
		return cancelRedemptionDest;
	}

	public void setCancelRedemptionDest(String cancelRedemptionDest) {
		this.cancelRedemptionDest = cancelRedemptionDest;
	}

	public String getCreateRedempAdjQueue() {
		return createRedempAdjQueue;
	}

	public void setCreateRedempAdjQueue(String createRedempAdjQueue) {
		this.createRedempAdjQueue = createRedempAdjQueue;
	}

	public String getCreateRedempAdjDest() {
		return createRedempAdjDest;
	}

	public void setCreateRedempAdjDest(String createRedempAdjDest) {
		this.createRedempAdjDest = createRedempAdjDest;
	}

	public String getUpdateRedempAdjQueue() {
		return updateRedempAdjQueue;
	}

	public void setUpdateRedempAdjQueue(String updateRedempAdjQueue) {
		this.updateRedempAdjQueue = updateRedempAdjQueue;
	}

	public String getUpdateRedempAdjDest() {
		return updateRedempAdjDest;
	}

	public void setUpdateRedempAdjDest(String updateRedempAdjDest) {
		this.updateRedempAdjDest = updateRedempAdjDest;
	}

	public String getCancelRedempAdjQueue() {
		return cancelRedempAdjQueue;
	}

	public void setCancelRedempAdjQueue(String cancelRedempAdjQueue) {
		this.cancelRedempAdjQueue = cancelRedempAdjQueue;
	}

	public String getCancelRedempAdjDest() {
		return cancelRedempAdjDest;
	}

	public void setCancelRedempAdjDest(String cancelRedempAdjDest) {
		this.cancelRedempAdjDest = cancelRedempAdjDest;
	}

	
	
	
}
