package com.isg.ifrend.jms;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.card.LostStolenReport;
import com.isg.ifrend.wrapper.mli.request.card.CardMaintenance;
import com.isg.ifrend.wrapper.mli.request.card.ChangeCardReport;
import com.isg.ifrend.wrapper.mli.request.card.DeleteCardReport;
import com.isg.ifrend.wrapper.mli.request.card.InquireCardReport;
import com.isg.ifrend.wrapper.mli.request.card.ReportLostStolenCard;


public interface CardMLIService {

	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String deleteLostStolenReport(DeleteCardReport wrapper) throws IfrendMLIException;
	
	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String executeCardMaintenance(CardMaintenance wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String addLostStolenReport(ReportLostStolenCard wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract LostStolenReport inquireLostStolenReport(InquireCardReport wrapper) throws IfrendMLIException;



	/**
	 * @throws IfrendMLIException 
	 */
	public abstract String changeLostStolenReport(ChangeCardReport wrapper) throws IfrendMLIException;



}
