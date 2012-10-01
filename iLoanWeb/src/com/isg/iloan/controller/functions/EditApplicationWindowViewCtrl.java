/**
 * 
 */
package com.isg.iloan.controller.functions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.ComponentNotFoundException;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Include;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Longbox;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabpanels;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.isg.iloan.commons.Helper;
import com.isg.iloan.commons.IDs;
import com.isg.iloan.commons.Labels;
import com.isg.iloan.dao.ApplicationDaoImpl;
import com.isg.iloan.model.dataEntry.Address;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.CreditCard;
import com.isg.iloan.model.dataEntry.DeedsOfAssignment;
import com.isg.iloan.model.dataEntry.Fund;
import com.isg.iloan.model.dataEntry.Instruction;
import com.isg.iloan.model.dataEntry.JobDetail;
import com.isg.iloan.model.dataEntry.PersonalData;
import com.isg.iloan.model.dataEntry.SaveAndSwipe;
import com.isg.iloan.model.dataEntry.Supplementary;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;

/**
 * @author augusto.marte
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class EditApplicationWindowViewCtrl extends GenericForwardComposer {
	
	private static Logger logger = Logger.getLogger(EditApplicationWindowViewCtrl.class);

	private Window editApplicationWindow;
	private Tabpanel instructionTabPanel;
	private Tabpanel internetTabPanel;
	private Tabpanel supplementaryTabPanel;
	private Tabpanel jobDetailTabPanel;
	private Include personalDataInc;
	private Tabpanel personalPanel;
	private Tabpanel ccDetailPanel;
	private Tabpanels tabPanels;
	private Tab deliveryInstruction;
	private Tab internetTransaction;
	private Tab supplementaryDetail;
	private Tab jobDetail;
	private Tab personalData;
	private Tab creditCardDetail;
	private Tabs tabs;
	private Tabbox tb;
	private Div breadcrumb;
	private Button appUpdateButton;
	
	private Application app;

	/**
	 *
	 *
	 */
	
	public ApplicationService getService(){
		   return  (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
		}
	
	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		
		final Application app = getService().retrieveById(23);
		this.app = app;
		
		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		for(Component window:comps){			
			if("creditCardDetails".equals(window.getId())){		
				 Helper.setValues(window, app);
				((Checkbox)window.getFellow(app.getCreditCardTypeCode().toLowerCase())).setChecked(true);				
				((Checkbox)window.getFellow(IDs.ACCEPT_CLASSIC_CARD)).setChecked(app.isAcceptClassicCard());
				((Checkbox)window.getFellow(IDs.ACCEPT_SAVE_SWIPE)).setChecked(app.isAcceptSaveAndSwipe());
				
				
				composeCreditCard(app, window);
				
				
				if(app.isAcceptSaveAndSwipe()){
					showSaveAndSwipeTab(app);
				}
				
				break;
			}			
		}
			
		
		    if(desktop.isServerPushEnabled()) {
		      logger.debug("Server push already enabled..");
		    }else{
		    	desktop.enableServerPush(true);
		    	logger.debug("Server push enabled..");
		    }
		    final EventListener<Event> el = this;
		    Thread bgViewComposer = new Thread() {
		        public void run() {
		          // In this part of code the ThreadLocals ARE NOT available
		          // You must NOT touch any ZK related things (e.g. components, desktops)
		          // If you need some information from ZK, you need to get them before this code
		          // For example here I've read searchString from a textbox, so I can use the searchString variable without problems
		          //String result = ... // Retrieve the result from somewhere
		          Executions.schedule(desktop, el, new Event("onViewCompose", null, app));
		        }
		     };
		     bgViewComposer.start();

	}
	
	public void onViewCompose(Event event) {
	    // In this part of code the ThreadLocals ARE available
	   // String result = (String) event.getData();
		
		try {
			composePersonalData(app);
			composeJobDetail(app);
			composeSupplementary(app);
			composeInstruction(app);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    // Do something with result. You can touch any ZK stuff freely, just like when a normal event is posted.
	  }
	
	
	class ApplicationViewComposer implements Runnable{
		
		Application application;
		
		ApplicationViewComposer(Application app){
			this.application = app;
		}
		
		@Override
		public void run() {
			
				try {
					composePersonalData(application);
					composeJobDetail(application);
					composeSupplementary(application);
					composeInstruction(application);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	
	
	
	public void composeCreditCard(Application app, Component window){
		
		List<CreditCard> cards = app.getCreditCards();
		
		
			for(CreditCard card:cards){
				int rank = card.getCardRank();	
				try{
				if(card.isExistingCreditCard()){
									
					((Textbox)window.getFellow("existingCC"+rank)).setValue(card.getCreditCardNum());
					((Longbox)window.getFellow("ecc"+rank+"Limit")).setValue(card.getCreditCardLimit());
					((Datebox)window.getFellow("ecc"+rank+"DOM")).setValue(card.getDateOfMembership());
				
				}else if(card.isOtherCreditCard()) {
					((Textbox)window.getFellow("occ"+rank)).setValue(card.getCardCompany());
					((Textbox)window.getFellow("occ"+rank+"Num")).setValue(card.getCreditCardNum());
					((Longbox)window.getFellow("occ"+rank+"Limit")).setValue(card.getCreditCardLimit());
					((Datebox)window.getFellow("occ"+rank+"DOM")).setValue(card.getDateOfMembership());
					
				}
				
				}catch(ComponentNotFoundException e){
					//exception handling to be designed
					continue;
				}
				
			}
			
		
		
		
		
		
		
	}
	
	
	
	public void showSaveAndSwipeTab(Application app) throws Exception{
		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
	
		SaveAndSwipe ss = app.getSaveAndSwipe();
		DeedsOfAssignment doa = ss.getDoa();
		
		int ctr=0;
		for(Component window:comps){	
			//logger.debug("comp id: " + window.getId());
			if("ccDetailPanelWindow".equals(window.getId())){				
				window.getFellow("saveAndSwipe").setVisible(true);
				window.getFellow("ssDeeds").setVisible(true);
				
				ctr++;
				
				//break;
			}
			
			if(IDs.SS_WINDOW.equals(window.getId())){
				
				Helper.setValues(window, ss);
				if(ss.isMetrobankDepositor()){
					((Checkbox)window.getFellow(IDs.SS_METROBANK_DEPOSITOR_YES)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SS_METROBANK_DEPOSITOR_NO)).setChecked(false);
				}
				if(ss.isAcceptPledge()){
					((Checkbox)window.getFellow(IDs.SS_PLEDGE_YES)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SS_PLEDGE_NO)).setChecked(false);
				}				
				ctr++;
			}
			
			if(IDs.DOA_WINDOW.equals(window.getId())){
				Helper.setValues(window, doa);
				//logger.debug("issuance: " + doa.isIssuance());
				if(ss.isAcceptPledge()){
					
					((Div)window.getFellow(IDs.DOA_PLEDGE_DIV)).setVisible(true);
					((Checkbox)window.getFellow(doa.getPledgedAccountTypeCode().toLowerCase())).setChecked(true);
				}
				
			}
		}
	
	}
	
	

	public void composePersonalData(Application app) throws Exception{
		
		//----Personal
		Collection<Component> personalComps =  personalPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.PD_WINDOW.equals(window.getId())){
				PersonalData pd = app.getPersonalData();
				Helper.setValues(window, pd);
				
				((Checkbox)window.getFellow(pd.getCivilStatus().toLowerCase())).setChecked(true);
				((Checkbox)window.getFellow(pd.getGender().toLowerCase())).setChecked(true);
				if(pd.isOtherNational()){
					((Checkbox)window.getFellow(IDs.PD_OTHER_NATIONAL)).setChecked(true);
					((Checkbox)window.getFellow(IDs.PD_FILIPINO_NAT)).setChecked(false);
				}
				logger.debug("address line:"+pd.getHomeAddress().getAddressLine1());
				logger.debug("zip :" + pd.getHomeAddress().getZipCode());
				logger.debug("tel no.:"+pd.getHomeAddress().getTelNum());
				Helper.setAddress(window, pd.getHomeAddress(),
						new String[]{IDs.PD_HOME_ADDRESS,IDs.PD_HOME_ZIP_CODE,IDs.PD_HOME_TEL_NUM});
				Helper.setAddress(window, pd.getPermanentAddress(),
						new String[]{IDs.PD_PERMANENT_ADDRESS,IDs.PD_PERM_ZIP_CODE});
				Helper.setAddress(window, pd.getPersonalRefAddress(),
						new String[]{IDs.PD_PERSONAL_REF_ADDRESS,"", IDs.PD_PERSONAL_REF_TEL_NUM});
				
				if((pd.getHomeOwnership().startsWith("Living"))){
					((Checkbox)window.getFellow("lwpr")).setChecked(true);
				}else{
					((Checkbox)window.getFellow(pd.getHomeOwnership().toLowerCase())).setChecked(true);
				}
				((Checkbox)window.getFellow(pd.getEducation().toLowerCase())).setChecked(true);
				
				((Checkbox)window.getFellow(IDs.PD_DRIVER_LICENSE_NUM + "_chkbox")).setChecked(null!=pd.getDriverLicenseNum() && !pd.getDriverLicenseNum().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_PASSPORT_NUM + "_chkbox")).setChecked(null!=pd.getPassportNum() && !pd.getPassportNum().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_PRC_ID + "_chkbox")).setChecked(null!=pd.getPrcID() && !pd.getPrcID().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_OTHER_ID + "_chkbox")).setChecked(null!=pd.getOtherID() && !pd.getOtherID().isEmpty());
				
			}
		}
	}
	
    public void composeJobDetail(Application app) throws Exception{
		
		Collection<Component> personalComps =  jobDetailTabPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.JD_WINDOW.equals(window.getId())){
				JobDetail jd = app.getJobDetail();
				Helper.setValues(window, jd);
				Helper.setAddress(window, jd.getBusinessAddress(), 
						new String[]{IDs.JD_BUSS_ADDR, IDs.JD_ZIPCODE, IDs.JD_TEL});
				
				List<Fund> funds = jd.getSourceOfFunds();
				for(Fund fund:funds){
					((Checkbox)window.getFellow(fund.getFundCode().toLowerCase())).setChecked(true);
					if(IDs.JD_OTHERS_CHKBOX.equals(fund.getFundCode().toLowerCase())){
						((Textbox)window.getFellow(IDs.JD_OTHERS_TXTBOX)).setValue(fund.getFundDesc());
					}
				}
				
			}
		}
	}


	public void composeSupplementary(Application app) throws Exception{		
		
		Collection<Component> personalComps =  supplementaryTabPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.SUPP_WINDOW.equals(window.getId())){
				Supplementary supp = app.getSupplementary();
				Helper.setValues(window, supp);
				Helper.setAddress(window, supp.getHomeAddress(), 
						new String[]{IDs.SUPP_ADDR, IDs.SUPP_ZIPCODE,});
				((Checkbox)window.getFellow(supp.getGender().toLowerCase())).setChecked(true);
				if(supp.isOtherNational()){
					((Checkbox)window.getFellow(IDs.SUPP_OTHER_NAT)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SUPP_FILIPINO_NAT)).setChecked(false);
				}
				
			}
		}
	}

	public void composeInstruction(Application app) throws Exception{
			
			
			Collection<Component> personalComps =  instructionTabPanel.getPage().getDesktop().getComponents();
			for(Component window:personalComps){			
				if(IDs.INS_WINDOW.equals(window.getId())){
					Instruction ins = app.getInstruction();
					Helper.setValues(window, ins);
					
					((Checkbox)window.getFellow(IDs.INS_MIN_AMOUNT)).setChecked(ins.isMinAmountDue());
					((Checkbox)window.getFellow(IDs.INS_TOTAL_AMOUNT)).setChecked(ins.isTotalAmountDue());
					
					Checkbox pm = (Checkbox)window.getFellow(ins.getPaymentMode().toLowerCase());
					if(IDs.INS_ADA_PAY.equals(pm.getId())){
						((Div)window.getFellow(IDs.INS_ADA_DIV)).setVisible(true);
						 pm.setChecked(true);
						((Checkbox)window.getFellow(IDs.INS_CASHCHECK_PAY)).setChecked(false);
					}else{
						((Div)window.getFellow(IDs.INS_ADA_DIV)).setVisible(false);
						pm.setChecked(true);
					}
					
					
				}
			}
		}
	
	
	
	public void decomposePersonalData(Application app) throws WrongValueException,
		SecurityException, IllegalAccessException, InvocationTargetException{
	
	
	
		Collection<Component> comps =  personalPanel.getPage().getDesktop().getComponents();
			for(Component window:comps){			
				if(IDs.PD_WINDOW.equals(window.getId())){
					PersonalData personalData = app.getPersonalData();
					Helper.setProperties(personalData, window);
					
					Address addr;
					addr = personalData.getHomeAddress();
					addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_HOME_ADDRESS)).getValue());
					addr.setTelNum(((Textbox)window.getFellow(IDs.PD_HOME_TEL_NUM)).getValue());
					addr.setZipCode(((Intbox)window.getFellow(IDs.PD_HOME_ZIP_CODE)).getValue());
					addr.setHomeAddress(true);
					addr.setPermanentAddress(false);
					personalData.setHomeAddress(addr);
					addr = personalData.getPermanentAddress();
					addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_PERMANENT_ADDRESS)).getValue());
					addr.setZipCode(((Intbox)window.getFellow(IDs.PD_PERM_ZIP_CODE)).getValue());
					addr.setHomeAddress(false);
					addr.setPermanentAddress(true);
					personalData.setPermanentAddress(addr);
					addr = personalData.getPersonalRefAddress();
					addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_PERSONAL_REF_ADDRESS)).getValue());
					addr.setTelNum(((Textbox)window.getFellow(IDs.PD_PERSONAL_REF_TEL_NUM)).getValue());
					addr.setHomeAddress(false);
					addr.setPermanentAddress(false);
					personalData.setPersonalRefAddress(addr);
					
					app.setPersonalData(personalData);
				}
			}
	}

	
	public void decomposeJobDetail(Application app) throws WrongValueException, SecurityException, IllegalAccessException, InvocationTargetException{
		
		Collection<Component> comps =  jobDetailTabPanel.getPage().getDesktop().getComponents();
		
		for(Component window:comps){			
			if(IDs.JD_WINDOW.equals(window.getId())){	

				JobDetail jd = app.getJobDetail();				
				Helper.setProperties(jd,window);
				
				Address addr = jd.getBusinessAddress();			
				addr.setAddressLine1(((Textbox)window.getFellow(IDs.JD_BUSS_ADDR)).getValue());
				addr.setTelNum(((Textbox)window.getFellow(IDs.JD_TEL)).getValue());
				addr.setZipCode(((Intbox)window.getFellow(IDs.JD_ZIPCODE)).getValue());
				addr.setHomeAddress(false);
				addr.setPermanentAddress(false);
				jd.setBusinessAddress(addr);
				
				decomposeFunds(jd, window);
				
				
				
				
				
				
				
				//Checkbox inv = ((Checkbox)window.getFellow(IDs.JD_INVESTMENT));
				//if(inv.isChecked())jd.addFundSource(new Fund(inv.getName(),inv.getLabel()));
				//Checkbox sem = ((Checkbox)window.getFellow(IDs.JD_SELF_EMP));
				//if(sem.isChecked())jd.addFundSource(new Fund(sem.getName(),sem.getLabel()));
				//Checkbox uem = ((Checkbox)window.getFellow(IDs.JD_UNEMP));
				//if(uem.isChecked())jd.addFundSource(new Fund(uem.getName(),uem.getLabel()));
				Checkbox ret = ((Checkbox)window.getFellow(IDs.JD_RETIRED));
				if(ret.isChecked())jd.addFundSource(new Fund(ret.getName(),ret.getLabel()));
				Checkbox oth = ((Checkbox)window.getFellow(IDs.JD_OTHERS_CHKBOX));
				if(oth.isChecked()){
					jd.addFundSource(new Fund(oth.getName(),((Textbox)window.getFellow(IDs.JD_OTHERS_TXTBOX)).getValue()));
				}
				
				app.setJobDetail(jd);
				
				break;
			}			
		}
		
		
	}

	
	
	public void decomposeFunds(JobDetail jd, Component window){
		
		List<Fund> funds = jd.getSourceOfFunds();
		Map<String,Fund> fundTable = new Hashtable();
		for(Fund fund:funds){
			fundTable.put(fund.getFundCode(), fund);
		}
		
		Checkbox emp = ((Checkbox)window.getFellow(IDs.JD_EMPLOYMENT));
		boolean empExist = false;
		if(emp.isChecked()){					
			if(fundTable.get(emp.getName())!=null){	
				empExist = true;
			}											
			if(!empExist){
				jd.addFundSource(new Fund(emp.getName(),emp.getLabel()));
			}					
		}else{
			if(fundTable.get(emp.getName())!=null){
				funds.remove(fundTable.get(emp.getName()));
			}
				
		}
		Checkbox inv = ((Checkbox)window.getFellow(IDs.JD_INVESTMENT));
		boolean invExist = false;
		if(inv.isChecked()){					
			if(fundTable.get(inv.getName())!=null){	
				invExist = true;
			}											
			if(!invExist){
				jd.addFundSource(new Fund(inv.getName(),inv.getLabel()));
			}					
		}else{
			if(fundTable.get(inv.getName())!=null){
				funds.remove(fundTable.get(inv.getName()));
			}	
		}
		Checkbox sem = ((Checkbox)window.getFellow(IDs.JD_SELF_EMP));
		boolean semExist = false;
		if(sem.isChecked()){					
			if(fundTable.get(sem.getName())!=null){	
				semExist = true;
			}											
			if(!semExist){
				jd.addFundSource(new Fund(sem.getName(),sem.getLabel()));
			}					
		}else{
			if(fundTable.get(sem.getName())!=null){
				funds.remove(fundTable.get(sem.getName()));
			}				
		}
		Checkbox uem = ((Checkbox)window.getFellow(IDs.JD_UNEMP));
		boolean uemExist = false;
		if(uem.isChecked()){					
			if(fundTable.get(uem.getName())!=null){	
				uemExist = true;
			}											
			if(!uemExist){
				jd.addFundSource(new Fund(uem.getName(),uem.getLabel()));
			}					
		}else{
			if(fundTable.get(uem.getName())!=null){
				funds.remove(fundTable.get(uem.getName()));
			}				
		}
		Checkbox ret = ((Checkbox)window.getFellow(IDs.JD_RETIRED));
		boolean retExist = false;
		if(ret.isChecked()){					
			if(fundTable.get(ret.getName())!=null){	
				retExist = true;
			}											
			if(!retExist){
				jd.addFundSource(new Fund(ret.getName(),ret.getLabel()));
			}					
		}else{
			if(fundTable.get(ret.getName())!=null){
				funds.remove(fundTable.get(ret.getName()));
			}				
		}
		Checkbox oth = ((Checkbox)window.getFellow(IDs.JD_OTHERS_CHKBOX));		
		boolean othExist = false;
		if(oth.isChecked()){					
			if(fundTable.get(oth.getName())!=null){	
				othExist = true;
			}											
			if(!othExist){
				jd.addFundSource(new Fund(oth.getName(),((Textbox)window.getFellow(IDs.JD_OTHERS_TXTBOX)).getValue()));
			}					
		}else{
			if(fundTable.get(oth.getName())!=null){
				funds.remove(fundTable.get(oth.getName()));
			}				
		}
		
		
	}
	
	
	
	public void decomposeSupplementary(Application app) throws WrongValueException, 
			SecurityException, IllegalAccessException, InvocationTargetException{
				logger.debug("*** decomposing Supplementary...");		
				Collection<Component> comps =  supplementaryTabPanel.getPage().getDesktop().getComponents();			
				for(Component window:comps){			
				if(IDs.SUPP_WINDOW.equals(window.getId())){							
					Supplementary supp = app.getSupplementary();
						
					Helper.setProperties(supp,window);
					Address addr = supp.getHomeAddress();
					addr.setHomeAddress(true);
					addr.setAddressLine1(((Textbox)window.getFellow(IDs.SUPP_ADDR)).getValue());
					addr.setZipCode(((Intbox)window.getFellow(IDs.SUPP_ZIPCODE)).getValue());
					supp.setHomeAddress(addr);
					app.setSupplementary(supp);
					break;
				}			
			}
	}
	
	
	
	public void decomposeInstruction(Application app) throws WrongValueException, 
			SecurityException, IllegalAccessException, InvocationTargetException{
		
			logger.debug("*** decomposing Supplementary...");		
			Collection<Component> comps =  instructionTabPanel.getPage().getDesktop().getComponents();
			for(Component window:comps){			
			if(IDs.INS_WINDOW.equals(window.getId())){							
				Instruction ins = app.getInstruction();				
				Helper.setProperties(ins,window);
				app.setInstruction(ins);
				break;
			}			
		}
	}
	
	public void decomposeCardDetails(Application app){		
		logger.debug("*** decomposingCreditCardDetails...");		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		Map<String,Component> ccDetailsMap = new LinkedHashMap<String, Component>();		
		for(Component comp:comps){			
			if("creditCardDetails".equals(comp.getId())){							
				Collection<Component> fellows = comp.getFellows();
				for(Component fellow:fellows){
					ccDetailsMap.put(fellow.getId(), fellow);					
				}
				break;
			}			
		}
		
		app.setAppStatusCode(2);
		app.setAppStatusDesc("MODIFIED");
		app.setCreditCardTypeDesc(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_CODE)).getValue());
		app.setCreditCardTypeDesc(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_DESC)).getValue());
		app.setAcceptClassicCard(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_CLASSIC_CARD)).isChecked());
		app.setAcceptSaveAndSwipe(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_SAVE_SWIPE)).isChecked());
		
		//app.setCreditCards(new ArrayList<CreditCard>());
		decomposedCreditCard(app,ccDetailsMap);		
		//if(app.getCreditCards().size()==0){app.setCreditCards(null);}
	
		if(app.isAcceptSaveAndSwipe()){
			decomposeSaveAndSwipe(app); 
			
		}
		logger.debug("*** decomposingCreditCardDetails...finished!");	
		
		//for internet transaction---
		Collection<Component> eComs =  internetTabPanel.getPage().getDesktop().getComponents();	
		for(Component eCom:eComs){			
			if(IDs.ETRANS_WINDOW.equals(eCom.getId())){							
				Collection<Component> fellows = eCom.getFellows();
				for(Component fellow:fellows){
					if("internetTransaction_chkbox".equals(fellow.getId())){					
						app.setEnrollSOS(((Checkbox)fellow).isChecked());
					}
				}
				break;
			}			
		}
		//end internet transaction---
	}
	
	
	public void decomposedCreditCard(Application app, Map<String,Component> ccDetailsMap){
		CreditCard creditcard;
		List<CreditCard> cards = app.getCreditCards();
		Map<String,CreditCard> eccTable = new Hashtable();
		Map<String,CreditCard> occTable = new Hashtable();
		for(CreditCard card:cards){
			if(card.isExistingCreditCard()){				
				eccTable.put("existingCC"+card.getCardRank(), card);
			}else{
				occTable.put("occ"+card.getCardRank(), card);
			}
		}
		
		for(int k=1;k<4;k++){			
			String cardNum = ((Textbox)ccDetailsMap.get("existingCC"+k)).getValue();
			if(null!=cardNum && !"".equals(cardNum)){				
				long cardLimit = ((Longbox)ccDetailsMap.get("ecc"+k+"Limit")).getValue();
				Date membershipDate = ((Datebox)ccDetailsMap.get("ecc"+k+"DOM")).getValue();
				
				
					if(eccTable.get("existingCC"+k)!=null) {
						creditcard = eccTable.get("existingCC"+k);
					}else{
						creditcard =  new CreditCard();
					}
					creditcard.setExistingCreditCard(true);
					creditcard.setOtherCreditCard(false);
					creditcard.setCreditCardNum(cardNum);
					creditcard.setCreditCardLimit(cardLimit);
					creditcard.setDateOfMembership(membershipDate);
					creditcard.setCardCompany(Labels.MCC);
					creditcard.setCardRank(k);
					app.addCreditCard(creditcard);
				
				
				
			}else{break;}			
			
		}
		for(int k=1;k<4;k++){			
			String cardCompany = ((Textbox)ccDetailsMap.get("occ"+k)).getValue();
			if(null!=cardCompany && !"".equals(cardCompany)){
				String cardNum = ((Textbox)ccDetailsMap.get("occ"+k+"Num")).getValue();
				long cardLimit = ((Longbox)ccDetailsMap.get("occ"+k+"Limit")).getValue();
				Date membershipDate = ((Datebox)ccDetailsMap.get("occ"+k+"DOM")).getValue();
				
					if(occTable.get("existingCC"+k)!=null) {
						creditcard = eccTable.get("occ"+k);
					}else{
						creditcard =  new CreditCard();
					}
					creditcard.setExistingCreditCard(false);
					creditcard.setOtherCreditCard(true);
					creditcard.setCreditCardNum(cardNum);
					creditcard.setCreditCardLimit(cardLimit);
					creditcard.setDateOfMembership(membershipDate);
					creditcard.setCardCompany(cardCompany);
					creditcard.setCardRank(k);
					app.addCreditCard(creditcard);
							
				
			}else{break;}			
			
		}
	}
	
	public void decomposeSaveAndSwipe(Application app){
		logger.debug("*** decomposingSaveAndSwipe...");		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();
		//Map<String,Component> ssMap = new LinkedHashMap<String, Component>();	
		SaveAndSwipe ss = app.getSaveAndSwipe();
		for(Component window:comps){			
			if(IDs.SS_WINDOW.equals(window.getId())){
				
				ss.setMetrobankDepositor(((Checkbox)window.getFellow(IDs.SS_METROBANK_DEPOSITOR_YES)).isChecked());
				if(ss.isMetrobankDepositor()){
					ss.setAccountNum(((Textbox)window.getFellow(IDs.SS_DEPOSITOR_ACCT_NUM)).getValue());
					ss.setAccountNum(((Textbox)window.getFellow(IDs.SS_DEPOSITOR_ACCT_BRANCH)).getValue());			
				}
				ss.setAcceptPledge(((Checkbox)window.getFellow(IDs.SS_PLEDGE_YES)).isChecked());				
				break;
			}
					
		}
		
		
		if(ss.isAcceptPledge()){
			
			for(Component window:comps){			
				if(IDs.DOA_WINDOW.equals(window.getId())){
					DeedsOfAssignment doa = ss.getDoa();
					doa.setIssuance( ((Checkbox)window.getFellow(IDs.DOA_ISSUANCE)).isChecked());
					doa.setChangeDepInst(((Checkbox)window.getFellow(IDs.DOA_CHANGE_DEP)).isChecked());
					doa.setIncDecCreditLimit(((Checkbox)window.getFellow(IDs.DOA_INCDEC_LIMIT_CHKBOX)).isChecked());
					if(doa.isIncDecCreditLimit()){
						doa.setIncDecCreditLimitValue(((Textbox)window.getFellow(IDs.DOA_INCDEC_LIMIT)).getValue());
					}					
					doa.setPledgedAccountTypeCode(((Textbox)window.getFellow(IDs.DOA_PLEDGE_ACCNT_CODE)).getValue());
					doa.setPledgedAccountTypeDesc(((Textbox)window.getFellow(IDs.DOA_PLEDGE_ACCNT_DESC)).getValue());
					doa.setPledgedAccntSpecial(((Checkbox)window.getFellow(IDs.DOA_SPECIAL_ACCNT)).isChecked());
					doa.setPledgedAccountNum(((Textbox)window.getFellow(IDs.DOA_PLEDGE_ACCNT_NUM)).getValue());
					doa.setPledgedAccntDepoBranch(((Textbox)window.getFellow(IDs.DOA_PLEDGE_DEPO_BRANCH)).getValue());
					doa.setPledgedAmountWords(((Textbox)window.getFellow(IDs.DOA_PLEDGE_AMT_WORDS)).getValue());
					doa.setPledgedAmount(((Longbox)window.getFellow(IDs.DOA_PLEDGE_AMT)).getValue());
					doa.setDateApplied(((Datebox)window.getFellow(IDs.DOA_DATE_APPLIED)).getValue());
					doa.setMetrobankBranchNameCode(((Textbox)window.getFellow(IDs.DOA_METROBANK_BRANCH)).getValue());
					doa.setAcceptDOA(((Checkbox)window.getFellow(IDs.DOA_ACCEPTANCE)).isChecked());
					
					ss.setDoa(doa);
					break;
				}
			}
			
		}		
		app.setSaveAndSwipe(ss);
		logger.debug("*** decomposingSaveAndSwipe...finished!");		
	}
	
	
	
	
	

	public void onClick$appUpdateButton() throws 
		WrongValueException, SecurityException, 
		IllegalAccessException, InvocationTargetException{
		
		decomposeCardDetails(app);
		decomposePersonalData(app);
		decomposeJobDetail(app);
		decomposeSupplementary(app);
		decomposeInstruction(app);
		
		
		
		getService().updateApplication(app);
		
	}



	
}
