/**
 * 
 */
package com.isg.ifrend.core.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;

/**
 * @author gerald.deguzman
 *
 */
@SuppressWarnings("rawtypes")
public class AuthorizationsViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private Window authorizations;
	private Listbox lst_history;
	private Listbox lst_pending_auths;
	private Listbox lst_todays_activity;*/

	/**
	 *
	 *
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		/*Window window = (Window)Executions.createComponents(
                "/pages/authorization_reversal.zul", null, null);
        window.doModal();*/
	}
	
	/*public void onSelect$lst_todays_activity()throws InterruptedException{
		Window window = (Window)Executions.createComponents(
                "/pages/authorization_reversal.zul", null, null);
        window.doModal();
	}*/

}
