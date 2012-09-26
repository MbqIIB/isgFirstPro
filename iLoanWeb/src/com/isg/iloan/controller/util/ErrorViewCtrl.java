/**
 * 
 */
package com.isg.iloan.controller.util;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;

/**
 * @author sheena.catacutan
 * 
 */
public class ErrorViewCtrl extends GenericForwardComposer {

	/**
	 *
	 *
	 */
	private Div errorDiv;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		errorDiv.setVisible(false);
	}
	
	public void onClick$errCloseBtn(){
		Clients.evalJavaScript("hideErrorPage()");
	}
	
}
