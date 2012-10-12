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
public class Authorization_reversalViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private Window authorization_reversal;
	private Button btn_cancel;
	private Button btn_reverse;
	private Combobox cmbReasonforReversal;
	private Intbox intAuthCode;
	private Doublebox dblBillAmt;
	private Doublebox dblOrigAmt;
	private Intbox intBillCurrCode;
	private Intbox intOrigCurrCode;
	private Textbox txtTransactionDate;*/

	/**
	 *
	 *
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		self.detach();
	}

}
