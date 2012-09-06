/**
 * 
 */
package com.isg.iloan.controller.menu;

import java.util.Collection;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Idspace;
import org.zkoss.zul.Menu;
import org.zkoss.zul.Menubar;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Tab;
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
		List<Component> tabs =  funtionsMenu.getParent().getParent().getParent()
		.getPreviousSibling().getChildren();			
			for(Component tab:tabs){			
				Executions.getCurrent().getSession().setAttribute("menuselected",tab.getId() );
				break;				
			}		
		Executions.sendRedirect("/functions/newapplication/newapplication.zul");
	}
	
	public void onClick$newAppAddon(){
		List<Component> tabs =  funtionsMenu.getParent().getParent().getParent()
		.getPreviousSibling().getChildren();			
			for(Component tab:tabs){			
				Executions.getCurrent().getSession().setAttribute("menuselected",tab.getId() );
				break;				
			}		
		//Executions.sendRedirect("/functions/newapplication/newapplication.zul");
	}
	
	public void onClick$newAppSupp(){
		List<Component> tabs =  funtionsMenu.getParent().getParent().getParent()
		.getPreviousSibling().getChildren();			
			for(Component tab:tabs){			
				Executions.getCurrent().getSession().setAttribute("menuselected",tab.getId() );
				break;				
			}		
		//Executions.sendRedirect("/functions/newapplication/newapplication.zul");
	}
	
}
