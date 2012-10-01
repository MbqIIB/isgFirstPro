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

	private Checkbox acceptDOA;
	private Textbox branchNameAndCode;
	private Datebox dateApplied_datebox;
	private Textbox pledgedAmountFigure_txtbox;
	private Textbox pledgedAmountWord_txtbox;
	private Textbox branch_txtbox;
	private Textbox pledgedAccountNo_txtbox;
	private Checkbox specialAccount;
	private Checkbox time;
	private Checkbox savings;
	private Textbox incDecCreditLimit_txtbox;
	private Checkbox incDecCreditLimit;
	private Checkbox changeDepInst;
	private Checkbox issuance;
	
	private Textbox pledgedAccountTypeCode;
	private Textbox pledgedAccountTypeDesc;
	

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		issuance.setChecked(false);
		changeDepInst.setChecked(false);
		incDecCreditLimit.setChecked(false);
		savings.setChecked(false);
		time.setChecked(false);
		specialAccount.setChecked(false);
		acceptDOA.setChecked(false);
		
	}
	

	public void onCheck$savings(){
		pledgedAccountTypeCode.setValue(savings.getLabel());
		pledgedAccountTypeDesc.setValue(savings.getLabel());
		time.setChecked(!savings.isChecked());
		//pledgedAccountNo_txtbox.setDisabled(true);
	}
	public void onCheck$time(){
		pledgedAccountTypeCode.setValue(time.getLabel());
		pledgedAccountTypeDesc.setValue(time.getLabel());
		savings.setChecked(!time.isChecked());		
		//pledgedAccountNo_txtbox.setDisabled(true);
	}
//	public void onCheck$specialAccount_chkbox(){		
//		pledgedAccountNo_txtbox.setDisabled(!specialAccount_chkbox.isChecked());
//	}
	
	
	
}
