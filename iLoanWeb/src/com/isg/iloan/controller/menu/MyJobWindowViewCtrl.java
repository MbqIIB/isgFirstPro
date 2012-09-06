package com.isg.iloan.controller.menu;

/**
 * 
 */


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author sheena.catacutan
 *
 */
public class MyJobWindowViewCtrl extends GenericForwardComposer {

	private Window myJobWindow;
	private Textbox working_years_txtbox;
	private Textbox yrs_with_pemp_txtbox;
	private Textbox business_add_txtbox;
	private Textbox zip_txtbox;
	private Textbox telephone_txtbox;
	private Textbox work_nature_txtbox;
	private Textbox occupation_txtbox;
	private Textbox others_txtbox;
	private Checkbox emp_chkbox;
	private Checkbox others_chkbox;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		others_txtbox.setDisabled(true);
	}
	
	public void onClick$others_chkbox(){
		if(others_chkbox.isChecked()){
			others_txtbox.setDisabled(false);
		}else{
			others_txtbox.setDisabled(true);
		}
	}
}