/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.Collection;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Textbox;

import com.isg.iloan.commons.IDs;

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
		pledgeNo_chkbox.setChecked(true);
	}
	
	public void onCheck$metrobankDepositorYes_chkbox(){
		
		depositor_grpbox.setVisible(metrobankDepositorYes_chkbox.isChecked());
		metrobankDepositorNo_chkbox.setChecked(!metrobankDepositorYes_chkbox.isChecked());
		
	}
	public void onCheck$metrobankDepositorNo_chkbox(){

		depositor_grpbox.setVisible(!metrobankDepositorNo_chkbox.isChecked());
		metrobankDepositorYes_chkbox.setChecked(!metrobankDepositorNo_chkbox.isChecked());
		
	}
	
	public void onCheck$pledgeYes_chkbox(){
		pledgeNo_chkbox.setChecked(!pledgeYes_chkbox.isChecked());
		Collection<Component> comps =  this.getPage().getDesktop().getComponents();
		for(Component comp:comps){			
			if(IDs.DOA_WINDOW.equals(comp.getId())){
				Collection<Component> fellows = comp.getFellows();
				for(Component fellow:fellows){
					if(IDs.DOA_PLEDGE_DIV.equals(fellow.getId())){
						fellow.setVisible(pledgeYes_chkbox.isChecked());
						break;
					}
				}
				break;
			}
		}
	}
	public void onCheck$pledgeNo_chkbox(){
		pledgeYes_chkbox.setChecked(!pledgeNo_chkbox.isChecked());
		Collection<Component> comps =  this.getPage().getDesktop().getComponents();
		for(Component comp:comps){			
			if(IDs.DOA_WINDOW.equals(comp.getId())){
				Collection<Component> fellows = comp.getFellows();
				for(Component fellow:fellows){
					if(IDs.DOA_PLEDGE_DIV.equals(fellow.getId())){
						fellow.setVisible(!pledgeNo_chkbox.isChecked());
						break;
					}
				}
				break;
			}
		}
	}

}
