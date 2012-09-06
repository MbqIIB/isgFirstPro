/**
 * 
 */
package com.isg.iloan.controller.function;

import java.util.Collection;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 *
 */
public class CreditCardDetailsViewCtrl extends GenericForwardComposer {

	private Window creditCardDetails;
	private Datebox occ3DOM;
	private Datebox occ2DOM;
	private Datebox occ1DOM;
	private Textbox occ3Limit;
	private Textbox occ2Limit;
	private Textbox occ1Limit;
	private Textbox occ3Num;
	private Textbox occ2Num;
	private Textbox occ1Num;
	private Textbox occ3;
	private Textbox occ2;
	private Textbox occ1;
	private Datebox ecc3DOM;
	private Datebox ecc2DOM;
	private Datebox ecc1DOM;
	private Textbox ecc3Limit;
	private Textbox ecc2Limit;
	private Textbox ecc1Limit;
	private Textbox existingCC3;
	private Textbox existingCC2;
	private Textbox existingCC1;
	private Checkbox notAcceptSaveAndSwipe;
	private Checkbox acceptSaveAndSwipe;
	private Checkbox notAcceptClassicCard;
	private Checkbox acceptClassicCard;
	private Checkbox femmeVisaCard;
	private Checkbox mLiteMasterCard;
	private Checkbox goldVisaCard;
	private Checkbox goldMasterCard;
	private Checkbox classicVisaCard;
	private Checkbox classicMasterCard;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}

	public void onCheck$acceptSaveAndSwipe() throws InterruptedException{		
		
		System.out.println("accept, checked: " + acceptSaveAndSwipe.isChecked());
		
		if(acceptSaveAndSwipe.isChecked()){			
			notAcceptSaveAndSwipe.setChecked(false);
			Collection<Component> comps = creditCardDetails.getParent().getParent().getSpaceOwner().getFellows();
			int ctr=0;
			for(Component comp:comps){
				if(comp.getId().equalsIgnoreCase("saveAndSwipe")
					|| comp.getId().equalsIgnoreCase("ssDeeds")){
					comp.setVisible(true);
					ctr++;
					if(ctr>1){break;}
				}
			}
		}
		if(!acceptSaveAndSwipe.isChecked()){
			Collection<Component> comps = creditCardDetails.getParent().getParent().getSpaceOwner().getFellows();
			int ctr=0;
			for(Component comp:comps){
				if(comp.getId().equalsIgnoreCase("saveAndSwipe")
					|| comp.getId().equalsIgnoreCase("ssDeeds")){					
					comp.setVisible(false);
					ctr++;
					if(ctr>1){break;}
					
				}
			}
		}
		
		
			
		
		
	}
	public void onCheck$notAcceptSaveAndSwipe() throws InterruptedException{
		
		if(notAcceptSaveAndSwipe.isChecked()){			
			acceptSaveAndSwipe.setChecked(false);
			Collection<Component> comps = creditCardDetails.getParent().getParent().getSpaceOwner().getFellows();
			int ctr=0;
			for(Component comp:comps){
				if(comp.getId().equalsIgnoreCase("saveAndSwipe")
					|| comp.getId().equalsIgnoreCase("ssDeeds")){					
					comp.setVisible(false);
					ctr++;
					if(ctr>1){break;}
					
				}
			}
		}
	}
	
	
}
