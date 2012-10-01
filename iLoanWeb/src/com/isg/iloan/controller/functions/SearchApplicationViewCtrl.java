/**
 * 
 */
package com.isg.iloan.controller.functions;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;

import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;
import com.isg.iloan.service.ILOVService;
import com.isg.iloan.service.LOVServiceImpl;

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
	}
	
	public ILOVService getLOVService(){
	   return  (ILOVService)SpringUtil.getBean("lovService", LOVServiceImpl.class);
	}
	
	
	//onCheck$acceptSaveAndSwipe()
	public void onClick$searchAppButton(){
		alert("button is clicked.");
		System.out.println( getLOVService().retrieveById(1).getDesc());
	}
	
	public void onClick$clearBtn(){
		
	}
	
}
