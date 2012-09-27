/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.isg.iloan.commons.Helper;
import com.isg.iloan.commons.IDs;
import com.isg.iloan.commons.Labels;
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
public class NewApplicationViewCtrl extends GenericForwardComposer {

	
	private static Logger logger = Logger.getLogger(NewApplicationViewCtrl.class);
	
	private Window newApplicationWindow;
	private Tabpanel personalPanel;
	private Tabpanel ccDetailPanel;
	private Tabpanel jobDetailTabPanel;
	private Tabpanel supplementaryTabPanel;
	private Tabpanel instructionTabPanel;
	private Tabpanel internetTabPanel;
	//private Tab ssDeeds;
	//private Tab saveAndSwipe;
	private Tab internetTransaction;
	private Tab deliveryInstruction;
	private Tab supplementaryDetail;
	private Tab jobDetail;
	private Tab personalData;
	private Tab creditCardDetail;
	private Tabs tabs;
	private Tabbox tb;
	private Hlayout cbLayout;
	private Hbox acceptClassicCardHbox;
	private Button newappSubmitButton;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
	}
	public void onClick$creditCardDetail(){
		Clients.evalJavaScript("changeState('#ccd')");
	}
	
	public void onClick$personalData(){
		Clients.evalJavaScript("changeState('#pd')");
	}
	public void onClick$jobDetail(){
		Clients.evalJavaScript("changeState('#jd')");
	}
	public void onClick$supplementaryDetail(){
		Clients.evalJavaScript("changeState('#sd')");
	}
	public void onClick$deliveryInstruction(){
		Clients.evalJavaScript("changeState('#dpi')");
	}
	public void onClick$internetTransaction(){
		Clients.evalJavaScript("changeState('#it')");
	}
	public void onClick$saveAndSwipe(){
		Clients.evalJavaScript("changeState('#ss')");
	}
	public void onClick$ssDeeds(){
		Clients.evalJavaScript("changeState('#dass')");
	}
	
	public ApplicationService getService(){
		   return  (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
		}
	
	
	public void onClick$newappSubmitButton(){
		//boolean pdChecker = allPersonalDataDetailsValid();
		//logger.debug(pdChecker);
		
		
		try {
			Application app = new Application();
			composeCardDetails(app);
			composePersonalData(app);
			composeJobDetail(app);			
			composeSupplementary(app);
			composeInstruction(app);			
			getService().createApplication(app);
			
//			Application ap = getService().retrieveById(23);
//			logger.debug("card type code: " + ap.getCardTypeCode());
//			logger.debug("card type desc: " + ap.getCardTypeDesc());
//			
//			List<Application> apps = getService().queryByKey(25);
//			logger.debug("app size: " + apps.size());
//			for(Application ap1:apps){
//				logger.debug("card type code 1: " + ap1.getCardTypeCode());
//				logger.debug("card type desc 1: " + ap1.getCardTypeDesc());
//			}
			
			
		} catch (WrongValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		for(Component c: newApplicationWindow.getPage().getDesktop().getComponents()){
//		
//			if("errorDiv".equals(c.getId())){
//				logger.debug(c);
//				c.setVisible(true);
//			}
//		}
//		Clients.evalJavaScript("showErrorPage()");
	}
	
	
	
	public void composePersonalData(Application app) throws WrongValueException,
				SecurityException, IllegalAccessException, InvocationTargetException{
		
		String[] fields = {IDs.PD_FAMILY_NAME,IDs.PD_GIVEN_NAME,IDs.PD_MIDDLE_NAME, IDs.PD_NAME_ON_CARD,
						   IDs.PD_BIRTH_DATE, IDs.PD_PLACE_OF_BIRTH,IDs.PD_CIVIL_STATUS, IDs.PD_GENDER,
						   IDs.PD_NATIONALITY, IDs.PD_OTHER_NATIONAL, IDs.PD_MOBILE_NUM, IDs.PD_EMAIL,
						   IDs.PD_MOTHER_FULL_NAME, IDs.PD_NUM_OF_CHILDREN, IDs.PD_HOME_OWNERSHIP,
						   IDs.PD_LENGTH_OF_STAY, IDs.PD_NUM_OF_CARS, IDs.PD_CAR_MODEL_YR, IDs.PD_EDUCATION,
						   IDs.PD_TIN_NUM, IDs.PD_SSS_MEMBER, IDs.PD_GSIS_MEMBER, IDs.PD_SSS_GSIS_NUM, IDs.PD_PRC_ID,
						   IDs.PD_OTHER_ID, IDs.PD_DRIVER_LICENSE_NUM, IDs.PD_PASSPORT_NUM, IDs.PD_PERSON_REF_NAME,
						   IDs.PD_PERSONAL_REF_RELATION};
		
		
		Collection<Component> comps =  personalPanel.getPage().getDesktop().getComponents();
		for(Component window:comps){			
			if(IDs.PD_WINDOW.equals(window.getId())){
			
				
				
				PersonalData personalData = new PersonalData();
				Helper.setProperties(personalData, fields, window);
				
				
				Address addr;
				addr = new Address();
				addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_HOME_ADDRESS)).getValue());
				addr.setTelNum(((Textbox)window.getFellow(IDs.PD_HOME_TEL_NUM)).getValue());
				addr.setZipCode(((Intbox)window.getFellow(IDs.PD_HOME_ZIP_CODE)).getValue());
				addr.setHomeAddress(true);
				addr.setPermanentAddress(false);
				personalData.setHomeAddress(addr);
				addr = new Address();
				addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_PERMANENT_ADDRESS)).getValue());
				addr.setZipCode(((Intbox)window.getFellow(IDs.PD_PERM_ZIP_CODE)).getValue());
				addr.setHomeAddress(false);
				addr.setPermanentAddress(true);
				personalData.setPermanentAddress(addr);
				addr = new Address();
				addr.setAddressLine1(((Textbox)window.getFellow(IDs.PD_PERSONAL_REF_ADDRESS)).getValue());
				addr.setTelNum(((Textbox)window.getFellow(IDs.PD_PERSONAL_REF_TEL_NUM)).getValue());
				addr.setHomeAddress(false);
				addr.setPermanentAddress(false);
				personalData.setPersonalRefAddress(addr);
				
				app.setPersonalData(personalData);
			}
		}
	}
	
	
	
	public void composeJobDetail(Application app) throws WrongValueException, SecurityException, IllegalAccessException, InvocationTargetException{
			
			Collection<Component> comps =  jobDetailTabPanel.getPage().getDesktop().getComponents();
			String[] fields = {IDs.JD_CMPY_NAME,IDs.JD_OCCUPATION,IDs.JD_WORK_NATURE,IDs.JD_YRS_PRES_EMP,
					   IDs.JD_TWY,IDs.JD_GMI,IDs.JD_SPOUSE_LN, IDs.JD_SPOUSE_GN,IDs.JD_SPOUSE_MN,
					   IDs.JD_SPOUSE_DOB};
			for(Component window:comps){			
				if(IDs.JD_WINDOW.equals(window.getId())){	

					JobDetail jd = new JobDetail();					
					Helper.setProperties(jd,fields,window);
					
					Address addr = new Address();			
					addr.setAddressLine1(((Textbox)window.getFellow(IDs.JD_BUSS_ADDR)).getValue());
					addr.setTelNum(((Textbox)window.getFellow(IDs.JD_TEL)).getValue());
					addr.setZipCode(((Intbox)window.getFellow(IDs.JD_ZIPCODE)).getValue());
					addr.setHomeAddress(false);
					addr.setPermanentAddress(false);
					jd.setBusinessAddress(addr);
					
					List<Fund> funds = new ArrayList<Fund>();
					jd.setSourceOfFunds(funds);
					Checkbox emp = ((Checkbox)window.getFellow(IDs.JD_EMPLOYMENT));
					if(emp.isChecked())jd.addFundSource(new Fund(emp.getName(),emp.getLabel()));
					Checkbox inv = ((Checkbox)window.getFellow(IDs.JD_INVESTMENT));
					if(inv.isChecked())jd.addFundSource(new Fund(inv.getName(),inv.getLabel()));
					Checkbox sem = ((Checkbox)window.getFellow(IDs.JD_SELF_EMP));
					if(sem.isChecked())jd.addFundSource(new Fund(sem.getName(),sem.getLabel()));
					Checkbox uem = ((Checkbox)window.getFellow(IDs.JD_UNEMP));
					if(uem.isChecked())jd.addFundSource(new Fund(uem.getName(),uem.getLabel()));
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
	
	
	
	public void composeSupplementary(Application app) throws WrongValueException, 
				SecurityException, IllegalAccessException, InvocationTargetException{
		logger.debug("*** composing Supplementary...");		
		Collection<Component> comps =  supplementaryTabPanel.getPage().getDesktop().getComponents();			
		for(Component window:comps){			
			if(IDs.SUPP_WINDOW.equals(window.getId())){							
				Supplementary supp = new Supplementary();
				String[] fields = {IDs.SUPP_LNAME,IDs.SUPP_GNAME,IDs.SUPP_MNAME,IDs.SUPP_CNAME,IDs.SUPP_REL,
								   IDs.SUPP_NAT, IDs.SUPP_OTHER_NAT, IDs.SUPP_BIRTHDATE, IDs.SUPP_BIRTHPLACE,
								   IDs.SUPP_GENDER};		
				Helper.setProperties(supp,fields,window);
				Address addr = new Address();
				addr.setHomeAddress(true);
				addr.setAddressLine1(((Textbox)window.getFellow(IDs.SUPP_ADDR)).getValue());
				addr.setZipCode(((Intbox)window.getFellow(IDs.SUPP_ZIPCODE)).getValue());
				supp.setHomeAddress(addr);
				app.setSupplementary(supp);
				break;
			}			
		}
		
		
		
	}
	
	public void composeInstruction(Application app) throws WrongValueException, 
				SecurityException, IllegalAccessException, InvocationTargetException{
		
		logger.debug("*** composing Supplementary...");		
		Collection<Component> comps =  instructionTabPanel.getPage().getDesktop().getComponents();
		for(Component window:comps){			
			if(IDs.INS_WINDOW.equals(window.getId())){							
				Instruction ins = new Instruction();
				String[] fields = {IDs.INS_DELI_PLACE, IDs.INS_PAYMENT_MODE, IDs.INS_ADA_ACCNT_NUM,
								   IDs.INS_ADA_BANK_BRANCH, IDs.INS_MIN_AMOUNT, IDs.INS_TOTAL_AMOUNT};
				Helper.setProperties(ins,fields,window);
				app.setInstruction(ins);
				break;
			}			
		}
		
		
	}
	
	
	

	public void composeCardDetails(Application app){		
		logger.debug("*** fillupCreditCardDetails...");		
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
		app.setAppStatusCode(1);
		app.setAppStatusDesc("New");
		app.setCardTypeCode(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_CODE)).getValue());
		app.setCardTypeDesc(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_DESC)).getValue());
		app.setAcceptClassicCard(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_CLASSIC_CARD)).isChecked());
		app.setAcceptSaveAndSwipe(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_SAVE_SWIPE)).isChecked());
		
		app.setCreditCards(new ArrayList<CreditCard>());
		composedCreditCard(app,ccDetailsMap);		
		//if(app.getCreditCards().size()==0){app.setCreditCards(null);}
	
		if(app.isAcceptSaveAndSwipe()){
			composeSaveAndSwipe(app); 
			
		}
		logger.debug("*** fillupCreditCardDetails...finished!");	
		
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
	
	public void composedCreditCard(Application app, Map<String,Component> ccDetailsMap){
		CreditCard creditcard;		
		for(int k=1;k<4;k++){			
			String cardNum = ((Textbox)ccDetailsMap.get("existingCC"+k)).getValue();
			if(null!=cardNum && !"".equals(cardNum)){				
				String cardLimit = ((Textbox)ccDetailsMap.get("ecc"+k+"Limit")).getValue();
				Date membershipDate = ((Datebox)ccDetailsMap.get("ecc"+k+"DOM")).getValue();
				creditcard = new CreditCard();
				creditcard.setExistingCreditCard(true);
				creditcard.setOtherCreditCard(false);
				creditcard.setCreditCardNum(cardNum);
				creditcard.setCreditCardLimit(cardLimit==null?0:Long.parseLong(cardLimit));
				creditcard.setDateOfMembership(membershipDate);
				creditcard.setCardCompany(Labels.MCC);
				app.addCreditCard(creditcard);
			}else{break;}			
			
		}
		for(int k=1;k<4;k++){			
			String cardCompany = ((Textbox)ccDetailsMap.get("occ"+k)).getValue();
			if(null!=cardCompany && !"".equals(cardCompany)){
				String cardNum = ((Textbox)ccDetailsMap.get("occ"+k+"Num")).getValue();
				String cardLimit = ((Textbox)ccDetailsMap.get("occ"+k+"Limit")).getValue();
				Date membershipDate = ((Datebox)ccDetailsMap.get("occ"+k+"DOM")).getValue();
				creditcard = new CreditCard();
				creditcard.setExistingCreditCard(false);
				creditcard.setOtherCreditCard(true);
				creditcard.setCreditCardNum(cardNum);
				creditcard.setCreditCardLimit(cardLimit==null?0:Long.parseLong(cardLimit));
				creditcard.setDateOfMembership(membershipDate);
				creditcard.setCardCompany(cardCompany);
				app.addCreditCard(creditcard);
			}else{break;}			
			
		}
	}
	
	
	public void composeSaveAndSwipe(Application app){
		logger.debug("*** fillupSaveAndSwipe...");		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();
		//Map<String,Component> ssMap = new LinkedHashMap<String, Component>();	
		SaveAndSwipe ss = new SaveAndSwipe();
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
					DeedsOfAssignment doa = new DeedsOfAssignment();
					doa.setIssuance( ((Checkbox)window.getFellow(IDs.DOA_ISSUANCE_CHKBOX)).isChecked());
					doa.setChangeDepInst(((Checkbox)window.getFellow(IDs.DOA_CHANGE_DEP_CHKBOX)).isChecked());
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
					doa.setPledgedAmount(Long.parseLong(((Textbox)window.getFellow(IDs.DOA_PLEDGE_AMT)).getValue()));
					doa.setDateApplied(((Datebox)window.getFellow(IDs.DOA_DATE_APPLIED)).getValue());
					doa.setMetrobankBranchNameCode(((Textbox)window.getFellow(IDs.DOA_METROBANK_BRANCH)).getValue());
					doa.setAcceptDOA(((Checkbox)window.getFellow(IDs.DOA_ACCEPTANCE)).isChecked());
					
					ss.setDoa(doa);
					break;
				}
			}
			
		}		
		app.setSaveAndSwipe(ss);
		logger.debug("*** fillupSaveAndSwipe...finished!");		
	}
	
	
//	private boolean allPersonalDataDetailsValid() {
//		Collection<Component> personalPanelComponents = personalPanel.getFellows();
//		for(Component compo: personalPanelComponents){
//			if("personalDataInc".equals(compo.getId())){
//				for(Component c: compo.getFellow(IDs.PD_WINDOW).getFellows()){
//					logger.debug(c.getAttribute("constraint"));
//					if(c instanceof InputElement){
//						if(((InputElement)c).getText().equals("")){
//							return false;
//						}
//					}
//					
//				}
//			}
//		}
//		
//		return true;
//		
//	}

}
