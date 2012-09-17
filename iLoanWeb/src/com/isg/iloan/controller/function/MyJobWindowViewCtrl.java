package com.isg.iloan.controller.function;

/**
 * 
 */


import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.isg.iloan.controller.util.CheckboxValidator;

/**
 * @author sheena.catacutan
 *
 */
public class MyJobWindowViewCtrl extends GenericForwardComposer {

	private Window myJobWindow;
	private Textbox working_years_txtbox;
	private Textbox yrs_with_pemp_txtbox;
	private Textbox business_add_txtbox;
	private Textbox zip_txtbox;
	private Textbox telephone_txtbox;
	private Textbox work_nature_txtbox;
	private Textbox occupation_txtbox;
	private Textbox others_txtbox;
	private Checkbox emp_chkbox;
	private Checkbox others_chkbox;
	private Groupbox sourceOfFundsGroupBox;
	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		others_txtbox.setDisabled(true);
		List<Component> toValidate = new ArrayList<Component>();
		toValidate.add(sourceOfFundsGroupBox);
		CheckboxValidator.validateCheckboxFields(toValidate, "#jd");
	//	bindValidationOnClick(sourceOfFundsGroupBox);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes"})
	private void bindValidationOnClick(Component comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("jobDetail".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									List<Component>comps = new ArrayList<Component>();
									comps.add(sourceOfFundsGroupBox);
									CheckboxValidator.validateCheckboxFields(comps, "#jd");
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
	
	public void onClick$others_chkbox(){
		if(others_chkbox.isChecked()){
			others_txtbox.setDisabled(false);
		}else{
			others_txtbox.setDisabled(true);
		}
	}
}