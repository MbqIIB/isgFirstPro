/**
 * 
 */
package com.isg.iloan.controller.function;

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
		addOnBlurEventToInput(comp, comp);
		bindValidationOnClick(personalDataForm);
	}
	

	private void addOnBlurEventToInput(final Component comp, final Component parent){
		if(comp instanceof InputElement){
			comp.addEventListener(Events.ON_BLUR, new EventListener() {
				@Override
				public void onEvent(Event arg0) throws Exception {
					validateForm(getInputElements(parent, new ArrayList<InputElement>()));
				}

				
			});
		}
		List<Component> components = comp.getChildren();
		for(Component each: components){
			addOnBlurEventToInput(each, parent);
		}
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
