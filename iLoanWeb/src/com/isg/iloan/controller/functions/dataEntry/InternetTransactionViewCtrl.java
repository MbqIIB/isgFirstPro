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


	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);

	}

	public void onClick$internetTransaction_chkbox() {
		Clients.evalJavaScript("validatedState('#it',true)");

	}

}
