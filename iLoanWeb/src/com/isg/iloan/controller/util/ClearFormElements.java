package com.isg.iloan.controller.util;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.impl.InputElement;

public class ClearFormElements {

	public static void clearInput(Component comp) {
		if (null != comp) {
			if (comp instanceof InputElement) {
				((InputElement) comp).setText("");
			}

			if (comp instanceof Checkbox) {
				((Checkbox) comp).setChecked(false);
			}

			for (Component c : comp.getChildren()) {
				clearInput(c);
			}
		}
	}

}
