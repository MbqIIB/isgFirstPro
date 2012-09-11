/**
 * 
 */
package com.isg.iloan.controller.function;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;

/**
 * @author augusto.marte
 *
 */
public class DoaSaveAndSwipeViewCtrl extends GenericForwardComposer {

	private Checkbox acceptDOA_chkbox;
	private Textbox branchNameAndCode;
	private Datebox dateApplied_datebox;
	private Textbox pledgedAmountFigure_txtbox;
	private Textbox pledgedAmountWord_txtbox;
	private Textbox branch_txtbox;
	private Textbox pledgedAccountNo_txtbox;
	private Checkbox specialAccount_chkbox;
	private Checkbox time_chkbox;
	private Checkbox savigs_chkbox;
	private Textbox incDecCreditLimit_txtbox;
	private Checkbox incDecCreditLimit_chkbox;
	private Checkbox changeDepInst_chkbox;
	private Checkbox issuance_chkbox;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}

}
