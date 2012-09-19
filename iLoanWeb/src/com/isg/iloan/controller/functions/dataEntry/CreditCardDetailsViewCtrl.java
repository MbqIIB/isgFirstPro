/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Window;

import com.isg.iloan.validation.CheckboxValidator;

/**
 * @author augusto.marte
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class CreditCardDetailsViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 501211151135191928L;

	private static Logger logger = Logger
			.getLogger(CreditCardDetailsViewCtrl.class);

	private Window creditCardDetails;
	private Checkbox notAcceptSaveAndSwipe;
	private Checkbox acceptSaveAndSwipe;
	private Checkbox notAcceptClassicCard;
	private Checkbox acceptClassicCard;
	private Hlayout cbLayout;
	private Hbox acceptClassicCardHbox;


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
		
	}
		
	private void bindValidationOnClick(Component comp){
		Component parent = comp.getParent();
		System.out.println(parent);
		
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
			Clients.evalJavaScript("hideOtherBlocks()");
		}
	}
}
