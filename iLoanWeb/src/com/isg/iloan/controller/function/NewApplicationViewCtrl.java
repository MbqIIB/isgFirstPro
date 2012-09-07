/**
 * 
 */
package com.isg.iloan.controller.function;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 *
 */
public class NewApplicationViewCtrl extends GenericForwardComposer {

	private Window newApplication;
	private Tabpanel personalPanel;
	private Tabpanel ccDetailPanel;
	private Tab ssDeeds;
	private Tab saveAndSwipe;
	private Tab internetTransaction;
	private Tab deliveryInstruction;
	private Tab supplementaryDetail;
	private Tab jobDetail;
	private Tab personalData;
	private Tab creditCardDetail;
	private Tabs tabs;
	private Tabbox tb;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		
	}

	public void onClick$creditCardDetail()throws InterruptedException{
		
		
	}
	
	
}
