/**
 * 
 */
package com.isg.ifrend.core.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Window;


/**
 * @author gerald.deguzman
 *
 */
@SuppressWarnings("rawtypes")
public class Unbilled_transactionsViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private Window unbilled_transactions;
	private Button btn_clear;
	private Button btn_newcase;
	private Listbox lst_unbilled_trans;*/

	
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}
	
	public void onClick$btn_newcase()throws InterruptedException{
		
		Window window = (Window)Executions.createComponents(
                "/pages/cases/new_case.zul", null, null);
        window.doModal();
	}
	

}
