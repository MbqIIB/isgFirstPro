package com.isg.ifrend.core.jms;

import java.util.List;

import com.isg.ifrend.core.model.mli.dto.CardMaintenanceDTO;
import com.isg.ifrend.core.model.mli.dto.CardReportDTO;


public interface CardMLIService {

	/**
	 */
	public abstract String requestDeleteCardReport(CardReportDTO dto);
	
	/**
	 */
	public abstract String requestCardMaintenance(CardMaintenanceDTO dto);



	/**
	 */
	public abstract String requestAddCardReport(CardReportDTO dto);



	/**
	 */
	public abstract List requestSearchCardReport(CardReportDTO dto);



	/**
	 */
	public abstract String requestUpdateCardReport(CardReportDTO dto);



}
