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
public class New_caseViewCtrl extends GenericForwardComposer {

	
	private static final long serialVersionUID = 1L;
	/*private Window new_case;
	private Button btn_cancel;
	private Button btn_submit;
	private Textbox txtRemarks;
	private Doublebox dbDisputeAmount;
	private Textbox txtCardNumber;
	private Intbox intIntRef;
	private Intbox intRefNumber;
	private Intbox intPOS;
	private Intbox intSourceCode;
	private Intbox intTranCode;
	private Textbox txtDescription;
	private Textbox txtOperatorId;
	private Textbox txtPostDate;
	private Textbox txtTransactionDate;*/

	/**
	 *
	 *
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
	}

	public void onClick$btn_cancel() {
		//TODO: please check if you have use "self" or zscript functions here.
		self.detach();
	}

	public void onClick$btn_submit() {
		//TODO: please check if you have use "self" or zscript functions here.

	}

}
