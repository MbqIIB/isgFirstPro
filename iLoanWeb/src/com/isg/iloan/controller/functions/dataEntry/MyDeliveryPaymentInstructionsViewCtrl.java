/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Row;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;

import com.isg.iloan.commons.Labels;
import com.isg.iloan.validation.CheckboxValidator;

/**
 * @author sheena.catacutan
 *
 */
public class MyDeliveryPaymentInstructionsViewCtrl extends
		GenericForwardComposer {

	private Div ada_div;
	private Checkbox ada_chkbox;
	private Checkbox office_chkbox;
	private Checkbox home_chkbox;
	private Textbox deliveryPlace;
	private Textbox paymentMode;
	private Checkbox payCash_chkbox;
	private Checkbox minAmount_chkbox;
	private Checkbox totalAmount_chkbox;
	private Row preferredPaymentRow;
	private Row deliveryLocRow;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		ada_div.setVisible(false);
		List<Component>toValidate = new ArrayList<Component>();
		toValidate.add(deliveryLocRow);
		toValidate.add(preferredPaymentRow);
		addCheckboxEvent(comp, comp, toValidate);
		bindValidationOnClick(deliveryLocRow);
	}
	@SuppressWarnings("unchecked")
	private void bindValidationOnClick(Component comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("deliveryInstruction".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									List<Component>comps = new ArrayList<Component>();
									comps.add(deliveryLocRow);
									comps.add(preferredPaymentRow);
									validateCheckboxFields(comps);
								}
							});
							break;
						}
					}
				}
			}
			return;
		}
		bindValidationOnClick(parent.getParent());
		
	}
	@SuppressWarnings("unchecked")
	public static void addCheckboxEvent(final Component comp,
			final Component parent, final List<Component> comps) {
		if (comp instanceof Checkbox) {
			comp.addEventListener(Events.ON_CLICK, new EventListener(){
				public void onEvent(Event event){
					validateCheckboxFields(comps);
				}
			});
		}
		List<Component> list = comp.getChildren();
		for (Component child : list) {
			addCheckboxEvent(child, parent, comps);
		}
		
	}
	
	public static void validateCheckboxFields(List<Component> comps) {
		boolean isValidated = true;

		for (Component comp : comps) {
			isValidated = CheckboxValidator.validateCheckboxes(CheckboxValidator.getCheckboxFields(comp,
					new ArrayList<Checkbox>()));
			if (!isValidated)break;
		}

		if (!isValidated) {
			Clients.evalJavaScript("validatedState('#dpi',false)");
		} else {
			Clients.evalJavaScript("validatedState('#dpi',true)");
		}
	}
	

	public void onClick$office_chkbox(){
		home_chkbox.setChecked(!office_chkbox.isChecked());		
		deliveryPlace.setValue(office_chkbox.isChecked()?"Office":"Home");
	}
	
	public void onClick$home_chkbox(){
		office_chkbox.setChecked(!home_chkbox.isChecked());
		deliveryPlace.setValue(home_chkbox.isChecked()?"Home":"Office");
	}
	
	public void onClick$ada_chkbox(){
		payCash_chkbox.setChecked(!ada_chkbox.isChecked());
		paymentMode.setValue(ada_chkbox.isChecked()?Labels.INS_ADA:Labels.INS_CASH_CHECK);
		ada_div.setVisible(true);
	}
	
	public void onClick$payCash_chkbox(){
		ada_chkbox.setChecked(!payCash_chkbox.isChecked());
		paymentMode.setValue(payCash_chkbox.isChecked()?Labels.INS_CASH_CHECK:Labels.INS_ADA);
		ada_div.setVisible(false);
	}
	
	public void onClick$minAmount_chkbox(){
		totalAmount_chkbox.setChecked(false);
	}
	
	public void onClick$totalAmount_chkbox(){
		minAmount_chkbox.setChecked(false);
	}

}
