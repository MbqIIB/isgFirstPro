package com.isg.iloan.validation;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Checkbox;

public class CheckboxValidator {
	public static void validateCheckboxFields(List<Component> comps) {
		boolean isValidated = true;

		for (Component comp : comps) {
			isValidated = validateCheckboxes(getCheckboxFields(comp,
					new ArrayList<Checkbox>()));
			if (!isValidated)break;
		}

		if (!isValidated) {
			Clients.evalJavaScript("validatedState('#ccd',false)");
		} else {
			Clients.evalJavaScript("validatedState('#ccd',true)");
		}
	}
	
	public static void validateCheckboxFields(List<Component> comps, String id){
		boolean isValidated = true;

		for (Component comp : comps) {
			isValidated = validateCheckboxes(getCheckboxFields(comp,
					new ArrayList<Checkbox>()));
			if (!isValidated)break;
			
		}

		if (!isValidated) {
			Clients.evalJavaScript("validatedState('"+id+"',false)");
		} else {
			Clients.evalJavaScript("validatedState('"+id+"',true)");
		}
	}

	public static List<Checkbox> getCheckboxFields(Component comp,
			List<Checkbox> cbList) {
		if (comp instanceof Checkbox) {
			cbList.add((Checkbox) comp);
		}
		if (null != comp) {
			List<Component> list = comp.getChildren();
			for (Component child : list) {
				getCheckboxFields(child, cbList);
			}
		}
		

		return cbList;
	}

	public static boolean validateCheckboxes(List<Checkbox> cbList) {
		boolean hasChecked = false;
		for (Checkbox cb : cbList) {
			if (cb.isChecked()) {
				hasChecked = true;
				break;
			}
		}
		return hasChecked;
	}

}
