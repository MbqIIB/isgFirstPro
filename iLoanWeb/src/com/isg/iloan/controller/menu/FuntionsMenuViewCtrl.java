/**
 * 
 */
package com.isg.iloan.controller.menu;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Menu;
import org.zkoss.zul.Menubar;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 *
 */
public class FuntionsMenuViewCtrl extends GenericForwardComposer {

	private Window funtionsMenu;
	private Menuitem secondCreditRev;
	private Menuitem firstCreditRev;
	private Menuitem creditPrev;
	private Menuitem intAuth;
	private Menuitem extAuth;
	private Menuitem cardAuth;
	private Menuitem invDupMatch;
	private Menuitem invBadMatch;
	private Menuitem rorejection;
	private Menuitem verification;
	private Menuitem newAppSupp;
	private Menuitem newAppAddon;
	private Menuitem newAppBasic;
	private Menu newApplication;
	private Menubar menubar;

	Div centerDiv;
	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		
		

	}
	
	public void onClick$newAppBasic(){
		Executions.sendRedirect("/functions/newapplication/newapplication.zul");
		
	}
	
}
