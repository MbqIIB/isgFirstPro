/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;


import com.isg.iloan.commons.IDs;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.JobDetail;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;
import com.isg.iloan.validation.CheckboxValidator;


/**
 * @author augusto.marte
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class CreditCardDetailsViewCtrl extends GenericForwardComposer {

	
	private static final long serialVersionUID = 501211151135191928L;

	private static Logger logger = Logger.getLogger(CreditCardDetailsViewCtrl.class);

	private Window creditCardDetails;
	private Checkbox notAcceptSaveAndSwipe;
	private Checkbox acceptSaveAndSwipe;
	private Checkbox notAcceptClassicCard;
	private Checkbox acceptClassicCard;
	private Hlayout cbLayout;
	private Hbox acceptClassicCardHbox;
	private Window ccDetailPanelWindow;

	private Checkbox classicMasterCard;
	private Checkbox classicVisaCard;
	private Checkbox goldMasterCard;
	private Checkbox goldVisaCard;
	private Checkbox mLiteMasterCard;
	private Checkbox femmeVisaCard;
	
	private Textbox creditCardTypeCode;
	private Textbox creditCardTypeDesc;
	
	
	public void setCreditCard(String code,String desc){
		creditCardTypeCode.setValue(code);
		creditCardTypeDesc.setValue(desc);
	}
	
	public void uncheckOtherCardType(Checkbox checkbox){		
		for(Checkbox cb:getCardTypes()){
			if(!cb.getId().equals(checkbox.getId())){
				cb.setChecked(false);
			}
		}
	}
	
	public void onCheck$classicMasterCard(){
		uncheckOtherCardType(this.classicMasterCard);
		setCreditCard(IDs.CLASSIC_MASTERCARD,this.classicMasterCard.getLabel());
	}
	public void onCheck$classicVisaCard(){
		uncheckOtherCardType(this.classicVisaCard);
		setCreditCard(IDs.CLASSIC_VISACARD,this.classicVisaCard.getLabel());
	}
	public void onCheck$goldMasterCard(){
		uncheckOtherCardType(this.goldMasterCard);
		setCreditCard(IDs.GOLD_MASTERCARD,this.goldMasterCard.getLabel());
	}
	public void onCheck$goldVisaCard(){
		uncheckOtherCardType(this.goldVisaCard);
		setCreditCard(IDs.GOLD_VISACARD,this.goldVisaCard.getLabel());
	}
	public void onCheck$mLiteMasterCard(){
		uncheckOtherCardType(this.mLiteMasterCard);
		setCreditCard(IDs.MLITE_MASTERCARD,this.mLiteMasterCard.getLabel());
	}
	public void onCheck$femmeVisaCard(){
		uncheckOtherCardType(this.femmeVisaCard);
		setCreditCard(IDs.FEMME_VISACARD,this.femmeVisaCard.getLabel());
	}

	public List<Checkbox> getCardTypes(){
		List<Checkbox> cardTypes = new ArrayList<Checkbox>();
		cardTypes.add(classicMasterCard);
		cardTypes.add(classicVisaCard);
		cardTypes.add(goldMasterCard);
		cardTypes.add(goldVisaCard);
		cardTypes.add(mLiteMasterCard);
		cardTypes.add(femmeVisaCard);		
		return cardTypes;
	}
	
	
	
//	@Autowired
//	@Qualifier("applicationService")
//	private ApplicationService applicationService;
	
	public ApplicationService getService(){
	   return  (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
	}
	
	//SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
	
	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		List<Component>comps = new ArrayList<Component>();
		comps.add(cbLayout);
		comps.add(acceptClassicCardHbox);
		addCheckboxEvent(comp, comp,comps);
		

		CheckboxValidator.validateCheckboxFields(comps);
		bindValidationOnClick(cbLayout);
//		componentList = new LinkedHashMap<String, Component>();
//		
//		for(Component component : comp.getPage().getDesktop().getComponents()){
//			componentList.put(component.getId(), component);
//		}
	}
		
	private void bindValidationOnClick(Component comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("creditCardDetail".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									List<Component>comps = new ArrayList<Component>();
									comps.add(cbLayout);
									comps.add(acceptClassicCardHbox);
									CheckboxValidator.validateCheckboxFields(comps);
								}
							});
							break;
						}
					}
				}
			}
			return;
		}
		if(null !=parent){
			bindValidationOnClick(parent);
		}
	}
	

	public static void addCheckboxEvent(final Component comp,
			final Component parent, final List<Component> comps) {
		if (comp instanceof Checkbox) {
			comp.addEventListener(Events.ON_CLICK, new EventListener(){
				public void onEvent(Event event){
					CheckboxValidator.validateCheckboxFields(comps);
				}
			});
		}
		List<Component> list = comp.getChildren();
		for (Component child : list) {
			addCheckboxEvent(child, parent, comps);
		}
		
	}
	
	public void onCheck$acceptClassicCard() throws InterruptedException {
		if (acceptClassicCard.isChecked()) {
			notAcceptClassicCard.setChecked(false);
		}
		
//		//this line is for testing only--
//		
//		Application app = new Application();
//		//test.setApplicationId(20121003);
//		app.setAcceptClassicCard(true);
//		app.setAcceptSaveAndSwipe(true);
//		app.setAppStatusCode(0);
//		app.setAppStatusDesc("NEW");
//		app.setCardTypeCode("VCC");
//		app.setCardTypeDesc("Visa Classic Card");
//		app.setDateOfApplication(new Date());
//		app.setEnrollSOS(false);
//		
//		
//		JobDetail jd = new JobDetail();
//		jd.setCompanyName("iSphereGlobal");
//		jd.setOccupation("Bank Teller");
//		jd.setNatureOfWork("Banker");
//		jd.setYearsWithCurrentEmployer(10);
//		jd.setTotalWorkingYears(20);
//		jd.setGrossMonthlyIncome(40000);
//		jd.setSpouseFamilyName("Goslings");
//		jd.setSpouseMiddleName("Berti");
//		jd.setSpouseDOB(new Date());
//		
//		
//		app.setJobDetail(jd);
		
		logger.debug("calling applicationService createApplication... ");
		
		//getService().createApplication(app);
		
		
		//---
		
		
		
		
	}

	public void onCheck$notAcceptClassicCard() throws InterruptedException {
		if (notAcceptClassicCard.isChecked()) {
			acceptClassicCard.setChecked(false);
		}
	}

	/**
	 * 
	 * @param id
	 * @param parent
	 * @param level
	 * this method show the component of the id provided.
	 * note:
	 * Collection<Component> comps =  component.getPage().getDesktop().getComponents();
	 * 
	 */
	
	public void showTab(String id, Component parent, int level) {
		Collection<Component> com =  parent.getPage().getDesktop().getComponents();
		int ctr = 0;
		boolean found = false;		
		Collection<Component> comps = parent.getFellows();
		for (Component comp : comps) {
			if (comp.getId().equalsIgnoreCase(id)) {
				found = true;
				comp.setVisible(true);
				logger.debug("component id found at level: " + level
						+ " at counter: " + ctr);
				break;
			}
			ctr++;
		}
		if (!found && (level < 20) && (parent.getParent() != null)) {
			level++;
			showTab(id, parent.getParent(), level);
		}

	}

	public void hideTab(String id, Component parent, int level) {
		int ctr = 0;
		boolean found = false;
		
		Collection<Component> comps = parent.getFellows();
		for (Component comp : comps) {
			if (comp.getId().equalsIgnoreCase(id)) {
				found = true;
				comp.setVisible(false);
				logger.debug("component id found at level: " + level
						+ " at counter: " + ctr);
				break;
			}
			ctr++;
		}
		if (!found && (level < 20) && (parent.getParent() != null)) {
			level++;
			hideTab(id, parent.getParent(), level);
		}

	}

	public void onCheck$acceptSaveAndSwipe() throws InterruptedException {
		logger.debug("Testing logger of Log4j");
		if (acceptSaveAndSwipe.isChecked()) {
			notAcceptSaveAndSwipe.setChecked(false);
			showTab("saveAndSwipe", creditCardDetails.getParent(), 0);
			showTab("ssDeeds", creditCardDetails.getParent(), 0);
//

		}
		if (!acceptSaveAndSwipe.isChecked()) {
			hideTab("saveAndSwipe", creditCardDetails.getParent(), 0);
			hideTab("ssDeeds", creditCardDetails.getParent(), 0);
		}
	}

	public void onCheck$notAcceptSaveAndSwipe() throws InterruptedException {
		if (notAcceptSaveAndSwipe.isChecked()) {
			acceptSaveAndSwipe.setChecked(false);
			hideTab("saveAndSwipe", creditCardDetails.getParent(), 0);
			hideTab("ssDeeds", creditCardDetails.getParent(), 0);
		}
	}

	
	
}
