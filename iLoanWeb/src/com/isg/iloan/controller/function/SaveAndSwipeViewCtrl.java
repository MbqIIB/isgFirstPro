/**
 * 
 */
package com.isg.iloan.controller.function;

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

	}
	
	public void onCheck$metrobankDepositorYes_chkbox(){
		if(metrobankDepositorYes_chkbox.isChecked()){
			depositor_grpbox.setVisible(true);
			metrobankDepositorNo_chkbox.setChecked(false);
		}else{
			depositor_grpbox.setVisible(false);
		}
		
	}
	public void onCheck$metrobankDepositorNo_chkbox(){
		if(metrobankDepositorNo_chkbox.isChecked()){
			depositor_grpbox.setVisible(false);
			metrobankDepositorYes_chkbox.setChecked(false);
		}
		
	}
	

}
