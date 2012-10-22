package com.isg.ifrend.jms;

import org.springframework.beans.factory.annotation.Value;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.model.mli.card.LostStolenReport;
import com.isg.ifrend.wrapper.mli.request.card.CardMaintenance;
import com.isg.ifrend.wrapper.mli.request.card.ChangeCardReport;
import com.isg.ifrend.wrapper.mli.request.card.DeleteCardReport;
import com.isg.ifrend.wrapper.mli.request.card.InquireCardReport;
import com.isg.ifrend.wrapper.mli.request.card.ReportLostStolenCard;
import com.isg.ifrend.wrapper.mli.response.card.CardMaintenanceResponse;
import com.isg.ifrend.wrapper.mli.response.card.ChangeCardReportResponse;
import com.isg.ifrend.wrapper.mli.response.card.DeleteCardReportResponse;
import com.isg.ifrend.wrapper.mli.response.card.InquireCardReportResponse;
import com.isg.ifrend.wrapper.mli.response.card.ReportLostStolenCardResponse;


public class CardMLIServiceImpl extends MLIService implements CardMLIService {
	
	@Value("${delReportQueue}")
	private String delReportQueue;
	@Value("${delReportDest}")
	private String delReportDest;
	@Value("${maintCardQueue}")
	private String maintCardQueue;
	@Value("${maintCardDest}")
	private String maintCardDest;
	@Value("${addReportQueue}")
	private String addReportQueue;
	@Value("${addReportDest}")
	private String addReportDest;
	@Value("${inqReportQueue}")
	private String inqReportQueue;
	@Value("${inqReportDest}")
	private String inqReportDest;
	@Value("${changeReportQueue}")
	private String changeReportQueue;
	@Value("${changeReportDest}")
	private String changeReportDest;
	

	@Override
	public String deleteLostStolenReport(DeleteCardReport wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, DeleteCardReportResponse.class, delReportQueue, delReportDest);
		if(obj!=null & obj instanceof DeleteCardReportResponse){
			mliResponse = ((DeleteCardReportResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String executeCardMaintenance(CardMaintenance wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, CardMaintenanceResponse.class, maintCardQueue, maintCardDest);
		if(obj!=null & obj instanceof CardMaintenanceResponse){
			mliResponse = ((CardMaintenanceResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public String addLostStolenReport(ReportLostStolenCard wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, ReportLostStolenCardResponse.class, addReportQueue, addReportDest);
		if(obj!=null & obj instanceof ReportLostStolenCardResponse){
			mliResponse = ((ReportLostStolenCardResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	@Override
	public LostStolenReport inquireLostStolenReport(InquireCardReport wrapper) throws IfrendMLIException {
		LostStolenReport report=null;		
		Object obj = processRequest(wrapper, InquireCardReportResponse.class, inqReportQueue, inqReportDest);
		if(obj!=null & obj instanceof InquireCardReportResponse){
			report = ((InquireCardReportResponse)obj).getCardReport();
		}
		return report;
	}

	@Override
	public String changeLostStolenReport(ChangeCardReport wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, ChangeCardReportResponse.class, changeReportQueue, changeReportDest);
		if(obj!=null & obj instanceof ChangeCardReportResponse){
			mliResponse = ((ChangeCardReportResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

	
	public String getDelReportQueue() {
		return delReportQueue;
	}

	public void setDelReportQueue(String delReportQueue) {
		this.delReportQueue = delReportQueue;
	}

	public String getDelReportDest() {
		return delReportDest;
	}

	public void setDelReportDest(String delReportDest) {
		this.delReportDest = delReportDest;
	}

	public String getMaintCardQueue() {
		return maintCardQueue;
	}

	public void setMaintCardQueue(String maintCardQueue) {
		this.maintCardQueue = maintCardQueue;
	}

	public String getMaintCardDest() {
		return maintCardDest;
	}

	public void setMaintCardDest(String maintCardDest) {
		this.maintCardDest = maintCardDest;
	}

	public String getAddReportQueue() {
		return addReportQueue;
	}

	public void setAddReportQueue(String addReportQueue) {
		this.addReportQueue = addReportQueue;
	}

	public String getAddReportDest() {
		return addReportDest;
	}

	public void setAddReportDest(String addReportDest) {
		this.addReportDest = addReportDest;
	}

	public String getInqReportQueue() {
		return inqReportQueue;
	}

	public void setInqReportQueue(String inqReportQueue) {
		this.inqReportQueue = inqReportQueue;
	}

	public String getInqReportDest() {
		return inqReportDest;
	}

	public void setInqReportDest(String inqReportDest) {
		this.inqReportDest = inqReportDest;
	}

	public String getChangeReportQueue() {
		return changeReportQueue;
	}

	public void setChangeReportQueue(String changeReportQueue) {
		this.changeReportQueue = changeReportQueue;
	}

	public String getChangeReportDest() {
		return changeReportDest;
	}

	public void setChangeReportDest(String changeReportDest) {
		this.changeReportDest = changeReportDest;
	}

	

	
}
