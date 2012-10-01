package com.isg.iloan.controller.functions.dataEntry;

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

import com.isg.iloan.validation.CheckboxValidator;

/**
 * @author sheena.catacutan
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class JobDetailViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8172306753806136887L;
	private Window jobDetailWindow;
	private Textbox totalWorkingYears;
	private Textbox yearsWithCurrentEmployer;
	private Textbox businessAaddress;
	private Textbox zipCode;
	private Textbox office_telephone;
	private Textbox natureOfWork;
	private Textbox occupation;
	private Textbox others_txtbox;
	
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
		
		List<Component>fieldsToValidate = new ArrayList<Component>();
		fieldsToValidate.add(sourceOfFundsGroupBox);
		addCheckboxEvent(comp, comp,fieldsToValidate);
//		CheckboxValidator.addCheckboxEvent(comp, comp, fieldsToValidate, "#jd");
		CheckboxValidator.validateCheckboxFields(fieldsToValidate, "#jd");
		bindValidationOnClick(sourceOfFundsGroupBox);
	}
	
	public static void addCheckboxEvent(final Component comp,
			final Component parent, final List<Component> comps) {
		if (comp instanceof Checkbox) {
			comp.addEventListener(Events.ON_CLICK, new EventListener(){
				public void onEvent(Event event){
					CheckboxValidator.validateCheckboxFields(comps, "#jd");
				}
			});
		}
		List<Component> list = comp.getChildren();
		for (Component child : list) {
			addCheckboxEvent(child, parent, comps);
		}
		
	}
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