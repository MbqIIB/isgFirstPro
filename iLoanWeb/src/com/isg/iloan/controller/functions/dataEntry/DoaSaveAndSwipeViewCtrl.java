/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

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
	private Checkbox savings_chkbox;
	private Textbox incDecCreditLimit_txtbox;
	private Checkbox incDecCreditLimit_chkbox;
	private Checkbox changeDepInst_chkbox;
	private Checkbox issuance_chkbox;
	
	private Textbox pledgedAccountTypeCode;
	private Textbox pledgedAccountTypeDesc;
	

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		pledgedAccountNo_txtbox.setDisabled(true);

	}

	public void onCheck$savings_chkbox(){
		pledgedAccountTypeCode.setValue("1");
		pledgedAccountTypeDesc.setValue(savings_chkbox.getLabel());
		time_chkbox.setChecked(!savings_chkbox.isChecked());
		//pledgedAccountNo_txtbox.setDisabled(true);
	}
	public void onCheck$time_chkbox(){
		pledgedAccountTypeCode.setValue("2");
		pledgedAccountTypeDesc.setValue(time_chkbox.getLabel());
		savings_chkbox.setChecked(!time_chkbox.isChecked());		
		//pledgedAccountNo_txtbox.setDisabled(true);
	}
//	public void onCheck$specialAccount_chkbox(){		
//		pledgedAccountNo_txtbox.setDisabled(!specialAccount_chkbox.isChecked());
//	}
	
	
	
}
