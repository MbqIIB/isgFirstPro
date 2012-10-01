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

	private Checkbox pledgeNo;
	private Checkbox pledgeYes;
	private Textbox deposiorBranchOpened_txtbox;
	private Textbox deposiorAccntNum_txtbox;
	private Groupbox depositor_grpbox;
	private Checkbox metrobankDepositorNo;
	private Checkbox metrobankDepositorYes;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		//---initial values ----------
		metrobankDepositorNo.setChecked(true);
		metrobankDepositorYes.setChecked(false);
		pledgeNo.setChecked(true);
		pledgeYes.setChecked(false);
		
	}
	
	
	
	public void onCheck$metrobankDepositorYes(){
		
		depositor_grpbox.setVisible(metrobankDepositorYes.isChecked());
		metrobankDepositorNo.setChecked(!metrobankDepositorYes.isChecked());
		
	}
	public void onCheck$metrobankDepositorNo(){

		depositor_grpbox.setVisible(!metrobankDepositorNo.isChecked());
		metrobankDepositorYes.setChecked(!metrobankDepositorNo.isChecked());
		
	}
	
	public void onCheck$pledgeYes(){
		pledgeNo.setChecked(!pledgeYes.isChecked());
		Collection<Component> comps =  this.getPage().getDesktop().getComponents();
		for(Component comp:comps){			
			if(IDs.DOA_WINDOW.equals(comp.getId())){
//				Collection<Component> fellows = comp.getFellows();
//				for(Component fellow:fellows){
//					if(IDs.DOA_PLEDGE_DIV.equals(fellow.getId())){
//						fellow.setVisible(pledgeYes.isChecked());
//						break;
//					}
//				}
				comp.getFellow(IDs.DOA_PLEDGE_DIV).setVisible(pledgeYes.isChecked());
				break;
			}
		}
	}
	public void onCheck$pledgeNo(){
		pledgeYes.setChecked(!pledgeNo.isChecked());
		Collection<Component> comps =  this.getPage().getDesktop().getComponents();
		for(Component comp:comps){			
			if(IDs.DOA_WINDOW.equals(comp.getId())){
//				Collection<Component> fellows = comp.getFellows();
//				for(Component fellow:fellows){
//					if(IDs.DOA_PLEDGE_DIV.equals(fellow.getId())){
//						fellow.setVisible(!pledgeNo.isChecked());
//						break;
//					}
//				}
				comp.getFellow(IDs.DOA_PLEDGE_DIV).setVisible(!pledgeNo.isChecked());
				break;
			}
		}
	}

}
