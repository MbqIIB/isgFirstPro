package com.isg.iloan.controller.menu;

/**
 * 
 */


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Textbox;

/**
 * @author sheena.catacutan
 *
 */
public class MySupplementaryViewCtrl extends GenericForwardComposer {

	private Textbox others_txtbox;
	private Textbox relation_txtbox;
	private Textbox zip_txtbox;
	private Textbox home_add_txtbox;
	private Textbox cardName_txtbox;
	private Textbox mName_txtbox;
	private Textbox gName_txtbox;
	private Textbox fName_txtbox;
	private Checkbox othrs_chkbox;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		others_txtbox.setDisabled(true);
	}
	
	public void onClick$othrs_chkbox(){
		if(othrs_chkbox.isChecked()){
			others_txtbox.setDisabled(false);
		}else{
			others_txtbox.setDisabled(true);
		}
	}

}
