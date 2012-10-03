package com.isg.iloan.controller.util;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.impl.InputElement;

public class ClearFormElements {

	public static void clearInput(Component component) {
		if (null != component) {
			if (component instanceof InputElement) {
				((InputElement) component).setText("");
			}

			if (component instanceof Checkbox) {
				((Checkbox) component).setChecked(false);
			}

			for (Component c : component.getChildren()) {
				clearInput(c);
			}
		}
	}

}
