/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Textbox;

/**
 * @author augusto.marte
 *
 */
public class SaveAndSwipeViewCtrl extends GenericForwardComposer {

	private Checkbox pledgeNo_chkbox;
	private Checkbox pledgeYes_chkbox;
	private Textbox deposiorBranchOpened_txtbox;
	private Textbox deposiorAccntNum_txtbox;
	private Groupbox depositor_grpbox;
	private Checkbox metrobankDepositorNo_chkbox;
	private Checkbox metrobankDepositorYes_chkbox;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		metrobankDepositorNo_chkbox.setChecked(true);
	}
	
	public void onCheck$metrobankDepositorYes_chkbox(){
		
		depositor_grpbox.setVisible(metrobankDepositorYes_chkbox.isChecked());
		metrobankDepositorNo_chkbox.setChecked(!metrobankDepositorYes_chkbox.isChecked());
		
	}
	public void onCheck$metrobankDepositorNo_chkbox(){

		depositor_grpbox.setVisible(!metrobankDepositorNo_chkbox.isChecked());
		metrobankDepositorYes_chkbox.setChecked(!metrobankDepositorNo_chkbox.isChecked());
		
	}
	

}
