package com.isg.iloan.controller.functions.dataEntry;

/**
 * 
 */


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Textbox;

import com.isg.iloan.controller.util.CommonValidator;
import com.isg.iloan.validation.InputElementValidator;

/**
 * @author sheena.catacutan
 *
 */
@SuppressWarnings("rawtypes")
public class SupplementaryViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7923899381024830008L;
	private Textbox others_txtbox;
	private Checkbox othrs_chkbox;
	private Grid supplementaryGrid;

	/**
	 *
	 *
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		others_txtbox.setDisabled(true);
		InputElementValidator.addOnBlurEventToInput(comp, comp, "#sd");
		CommonValidator.bindValidationOnEvent(supplementaryGrid,
				"supplementaryDetail", "#sd", "txtbx");
	}
	
	public void onClick$othrs_chkbox(){
		if(othrs_chkbox.isChecked()){
			others_txtbox.setDisabled(false);
		}else{
			others_txtbox.setDisabled(true);
		}
	}

}
