package com.isg.iloan.validation;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.impl.InputElement;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class InputElementValidator {
	public static void validateForm(List<InputElement> elements, String id){
		boolean hasInvalid = false;
		for(InputElement e: elements){
			if(!e.isValid()){
				hasInvalid = true;
				break;
			}
		}
		if(!hasInvalid){
			Clients.evalJavaScript("validatedState('"+id+"',true)");
		}else{
			Clients.evalJavaScript("validatedState('"+id+"',false)");
		}
	}
	
	public static void addOnBlurEventToInput(final Component comp, final Component parent, final String id){
		if(comp instanceof InputElement){
			comp.addEventListener(Events.ON_BLUR, new EventListener() {
				@Override
				public void onEvent(Event arg0) throws Exception {
					validateForm(getInputElements(parent, new ArrayList<InputElement>()),id);
				}

			});
		}
		List<Component> components = comp.getChildren();
		for(Component each: components){
			addOnBlurEventToInput(each, parent, id);
			
		}
	}	
	
	public static List<InputElement> getInputElements(Component comp, ArrayList<InputElement> arrayList) {
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
}
