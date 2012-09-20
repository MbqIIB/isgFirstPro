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
public class DummySearchViewCtrl extends GenericForwardComposer {

	/**
	 *
	 *
	 */
	
	private Button dummySearchBtn;
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}
	//onCheck$acceptSaveAndSwipe()
	public void onClick$dummySearchBtn(){
		alert("button is clicked.");
	}
	
	public void onClick$clearBtn(){
		
	}
}
