/**
 * 
 */
package com.isg.iloan.controller.function;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Radiogroup;

/**
 * @author sheena.catacutan
 *
 */
public class MyDeliveryPaymentInstructionsViewCtrl extends
		GenericForwardComposer {

	private Div ada_div;
	private Checkbox ada_chkbox;
	private Checkbox office_chkbox;
	private Checkbox home_chkbox;
	private Checkbox payCash_chkbox;
	private Checkbox minAmount_chkbox;
	private Checkbox totalAmount_chkbox;


	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		ada_div.setVisible(false);

	}

	
	public void onClick$office_chkbox(){
		home_chkbox.setChecked(false);
	}
	
	public void onClick$home_chkbox(){
		office_chkbox.setChecked(false);
	}
	
	public void onClick$ada_chkbox(){
		payCash_chkbox.setChecked(false);
		ada_div.setVisible(true);
	}
	
	public void onClick$payCash_chkbox(){
		ada_chkbox.setChecked(false);
		ada_div.setVisible(false);
	}
	
	public void onClick$minAmount_chkbox(){
		totalAmount_chkbox.setChecked(false);
	}
	
	public void onClick$totalAmount_chkbox(){
		minAmount_chkbox.setChecked(false);
	}

}
