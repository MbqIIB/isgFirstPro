/**
 * 
 */
package com.isg.iloan.controller.functions;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;

/**
 * @author sheena.catacutan
 *
 */
public class SearchApplicationViewCtrl extends GenericForwardComposer {

	/**
	 *
	 *
	 */
	
	private Button searchAppButton;
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}
	//onCheck$acceptSaveAndSwipe()
	public void onClick$searchAppButton(){
		alert("button is clicked.");
	}
	
	public void onClick$clearBtn(){
		
	}
}
