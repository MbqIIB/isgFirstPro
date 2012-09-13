/**
 * 
 */
package com.isg.iloan.controller.function;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 * 
 */
public class CreditCardDetailsViewCtrl extends GenericForwardComposer {

	private static Logger logger = Logger
			.getLogger(CreditCardDetailsViewCtrl.class);

	private Window creditCardDetails;
	private Datebox occ3DOM;
	private Datebox occ2DOM;
	private Datebox occ1DOM;
	private Textbox occ3Limit;
	private Textbox occ2Limit;
	private Textbox occ1Limit;
	private Textbox occ3Num;
	private Textbox occ2Num;
	private Textbox occ1Num;
	private Textbox occ3;
	private Textbox occ2;
	private Textbox occ1;
	private Datebox ecc3DOM;
	private Datebox ecc2DOM;
	private Datebox ecc1DOM;
	private Textbox ecc3Limit;
	private Textbox ecc2Limit;
	private Textbox ecc1Limit;
	private Textbox existingCC3;
	private Textbox existingCC2;
	private Textbox existingCC1;
	private Checkbox notAcceptSaveAndSwipe;
	private Checkbox acceptSaveAndSwipe;
	private Checkbox notAcceptClassicCard;
	private Checkbox acceptClassicCard;
	private Checkbox femmeVisaCard;
	private Checkbox mLiteMasterCard;
	private Checkbox goldVisaCard;
	private Checkbox goldMasterCard;
	private Checkbox classicVisaCard;
	private Checkbox classicMasterCard;
	private Hlayout cb_layout;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		System.out.println(validateCheckboxes(cb_layout));
		if (!validateCheckboxes(cb_layout)) {
			Clients.evalJavaScript("unfinishedState('#ccd')");
		}
		// TODO Auto-generated method stub

	}

	private boolean validateCheckboxes(Component comp) {
	
		if (comp instanceof Checkbox) {
			if (((Checkbox) comp).isChecked()) {
				return true;
			}
		}

			List<Component> list = comp.getChildren();
			for (Component child : list) {
				if(validateCheckboxes(child)){
					return true;
				}
			}
		

		return false;
	}

	private void Alert(String string) {
		// TODO Auto-generated method stub

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

	public void showTab(String id, Component parent, int level) {
		int ctr = 0;
		boolean found = false;
		// Collection<Component> comps =
		// component.getPage().getDesktop().getComponents();
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
		// Collection<Component> comps =
		// component.getPage().getDesktop().getComponents();
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
			// Collection<Component> comps =
			// creditCardDetails.getParent().getParent().getSpaceOwner().getFellows();

			showTab("saveAndSwipe", creditCardDetails.getParent(), 0);
			showTab("ssDeeds", creditCardDetails.getParent(), 0);
			Clients.evalJavaScript("showOtherBlocks()");

		}
		if (!acceptSaveAndSwipe.isChecked()) {
			hideTab("saveAndSwipe", creditCardDetails.getParent(), 0);
			hideTab("ssDeeds", creditCardDetails.getParent(), 0);
			Clients.evalJavaScript("hideOtherBlocks()");
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
