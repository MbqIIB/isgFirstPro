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
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;

import com.isg.iloan.validation.CheckboxValidator;

/**
 * @author augusto.marte
 *
 */
public class InternetTransactionViewCtrl extends GenericForwardComposer {

	private Checkbox internetTransaction_chkbox;
	private Groupbox internetTransactionGrpbox;
	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		bindValidationOnClick(internetTransactionGrpbox);

	}
	
	private void bindValidationOnClick(Component comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("internetTransaction".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									List<Component>comps = new ArrayList<Component>();
									comps.add(internetTransactionGrpbox);
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
		bindValidationOnClick(parent);
		
	}
	
	public static void validateCheckboxFields(List<Component> comps) {
		boolean isValidated = true;

		for (Component comp : comps) {
			isValidated = CheckboxValidator.validateCheckboxes(CheckboxValidator.getCheckboxFields(comp,
					new ArrayList<Checkbox>()));
			if (!isValidated)break;
		}

		if (!isValidated) {
			Clients.evalJavaScript("validatedState('#it',false)");
		} else {
			Clients.evalJavaScript("validatedState('#it',true)");
		}
	}
	
	public void onClick$internetTransaction_chkbox(){
		if(internetTransaction_chkbox.isChecked()){
			Clients.evalJavaScript("validatedState('#it',true)");
		}else{
			Clients.evalJavaScript("validatedState('#it',false)");
		}
	}
	


}
