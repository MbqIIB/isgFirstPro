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
import org.zkoss.zul.Grid;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.impl.InputElement;

import com.isg.iloan.validation.InputElementValidator;

/**
 * @author augusto.marte
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PersonalDataViewCtrl extends GenericForwardComposer {
	
	private static final long serialVersionUID = 8903716989014780575L;
	private Grid personalDataForm;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		InputElementValidator.addOnBlurEventToInput(comp, comp, "#pd");
		bindValidationOnClick(personalDataForm);
	}
	
	private List getInputElements(Component comp, ArrayList<InputElement> arrayList) {
		if (comp instanceof InputElement) {
			arrayList.add((InputElement) comp);
		}
		if (null != comp) {
			List<Component> list = comp.getChildren();
			for (Component child : list) {
				getInputElements(child, arrayList);
			}
		}
		return arrayList;
	}
	
	private void validateForm(List<InputElement> elements){
		boolean hasInvalid = false;
		for(InputElement e: elements){
			if(!e.isValid()){
				hasInvalid = true;
				break;
			}
		}
		if(!hasInvalid){
			Clients.evalJavaScript("validatedState('#pd',true)");
		}
	}
	
	private void bindValidationOnClick(Component comp){
		if(null!=comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("personalData".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									validateForm(getInputElements(personalDataForm, new ArrayList<InputElement>()));
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
	}

}
