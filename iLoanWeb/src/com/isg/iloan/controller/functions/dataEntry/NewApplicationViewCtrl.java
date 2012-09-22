/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.isg.iloan.commons.IDs;
import com.isg.iloan.commons.Labels;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.CreditCard;
import com.isg.iloan.model.dataEntry.DeedsOfAssignment;
import com.isg.iloan.model.dataEntry.SaveAndSwipe;

/**
 * @author augusto.marte
 *
 */
public class NewApplicationViewCtrl extends GenericForwardComposer {

	
	private static Logger logger = Logger.getLogger(NewApplicationViewCtrl.class);
	
	private Window newApplicationWindow;
	private Tabpanel personalPanel;
	private Tabpanel ccDetailPanel;
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
	
	public void onClick$newappSubmitButton(){
		//extractPersonalDataDetails();
		
		Application app = new Application();
		
		//fillupCreditCardDetails(app);
		//fillupSaveAndSwipe(app);
		
	}

	public void fillupCreditCardDetails(Application app){		
		logger.debug("*** fillupCreditCardDetails...");		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();
		logger.debug("Desktop no. of components : " + comps.size());
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
		app.setCardTypeCode(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_CODE)).getValue());
		app.setCardTypeDesc(((Textbox)ccDetailsMap.get(IDs.CARD_TYPE_DESC)).getValue());
		app.setAcceptClassicCard(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_CLASSIC_CARD)).isChecked());
		app.setAcceptSaveAndSwipe(((Checkbox)ccDetailsMap.get(IDs.ACCEPT_SAVE_SWIPE)).isChecked());
		
		app.setCreditCards(new ArrayList<CreditCard>());
		composedCreditCard(app,ccDetailsMap);		
		//if(app.getCreditCards().size()==0){app.setCreditCards(null);}
	
		if(app.isAcceptSaveAndSwipe()){
			fillupSaveAndSwipe(app); 
			
		}
		
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
				app.getCreditCards().add(creditcard);
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
				app.getCreditCards().add(creditcard);
			}else{break;}			
			
		}
	}
	
	
	public void fillupSaveAndSwipe(Application app){
		logger.debug("*** fillupSaveAndSwipe...");		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();
		Map<String,Component> ssMap = new LinkedHashMap<String, Component>();		
		for(Component comp:comps){			
			if("saveAndSwipePage".equals(comp.getId())
					|| "doaPage".equals(comp.getId())
					){							
				Collection<Component> fellows = comp.getFellows();
				for(Component fellow:fellows){
					ssMap.put(fellow.getId(), fellow);					
				}
				break;
			}			
		}
		SaveAndSwipe ss = new SaveAndSwipe();
		ss.setMetrobankDepositor(((Checkbox)ssMap.get(IDs.SS_METROBANK_DEPOSITOR_CHKBOX)).isChecked());
		if(ss.isMetrobankDepositor()){
			ss.setAccountNum(((Textbox)ssMap.get(IDs.SS_DEPOSITOR_ACCT_NUM)).getValue());
			ss.setAccountNum(((Textbox)ssMap.get(IDs.SS_DEPOSITOR_ACCT_BRANCH)).getValue());			
		}
		ss.setAcceptPledge(((Checkbox)ssMap.get(IDs.SS_PLEDGE_CHKBOX)).isChecked());
		
		DeedsOfAssignment doa = new DeedsOfAssignment();
		doa.setIssuance(((Checkbox)ssMap.get(IDs.DOA_ISSUANCE_CHKBOX)).isChecked());
		doa.setChangeDepInst(((Checkbox)ssMap.get(IDs.DOA_CHANGE_DEP_CHKBOX)).isChecked());
		doa.setIncDecCreditLimit(((Checkbox)ssMap.get(IDs.DOA_INCDEC_LIMIT_CHKBOX)).isChecked());
		if(doa.isIncDecCreditLimit()){
			doa.setIncDecCreditLimitValue(((Textbox)ssMap.get(IDs.DOA_INCDEC_LIMIT)).getValue());
		}
		if(ss.isAcceptPledge()){
			doa.setPledgedAccountTypeCode(((Textbox)ssMap.get(IDs.DOA_PLEDGE_ACCNT_CODE)).getValue());
			doa.setPledgedAccountTypeDesc(((Textbox)ssMap.get(IDs.DOA_PLEDGE_ACCNT_DESC)).getValue());
			doa.setPledgedAccntSpecial(((Checkbox)ssMap.get(IDs.DOA_SPECIAL_ACCNT)).isChecked());
			doa.setPledgedAccountNum(((Textbox)ssMap.get(IDs.DOA_PLEDGE_ACCNT_NUM)).getValue());
			doa.setPledgedAccntDepoBranch(((Textbox)ssMap.get(IDs.DOA_PLEDGE_DEPO_BRANCH)).getValue());
			doa.setPledgedAmountWords(((Textbox)ssMap.get(IDs.DOA_PLEDGE_AMT_WORDS)).getValue());
			doa.setPledgedAmount(Long.parseLong(((Textbox)ssMap.get(IDs.DOA_PLEDGE_AMT)).getValue()));
			doa.setDateApplied(((Datebox)ssMap.get(IDs.DOA_DATE_APPLIED)).getValue());
			doa.setMetrobankBranchNameCode(((Textbox)ssMap.get(IDs.DOA_METROBANK_BRANCH)).getValue());
		}		
		doa.setAcceptDOA(((Checkbox)ssMap.get(IDs.DOA_ACCEPTANCE)).isChecked());
		
	}
	
	
	private void extractPersonalDataDetails() {
		//Component personalDataForm = getComponent("personalDataInc");
		//System.out.println(personalDataForm);
		Component p = newApplicationWindow.getFellow("personalPanel");
		System.out.println(p.getChildren().size());
		String[] personalDataFields = {"familyName","givenName","middleName","nameOnCard","birthdate","placeOfBirth"};
		
		
	}
	
	private Component getComponent(String id){
		List<Component> components = newApplicationWindow.getChildren();
		for(Component c: components){
			System.out.println(c);
			if(id.equals(c.getId())){
				System.out.println(c);
				return c;
			}
		}
		return null;
	}

}
