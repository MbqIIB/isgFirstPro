/**
 * 
 */
package com.isg.iloan.controller.menu;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 *
 */
public class MainMenuViewCtrl extends GenericForwardComposer {

	private Window mainMenu;
	private Tab reportsTab;
	private Tab functionTab;
	private Tabbox tb;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		String menuselected = (String) Executions.getCurrent().getSession().getAttribute("menuselected");
		
		if( menuselected == null || menuselected.isEmpty() ){
			reportsTab.setSelected(false);
			functionTab.setSelected(false);
		}else if(menuselected.equalsIgnoreCase(reportsTab.getId())){
			reportsTab.setSelected(true);
			functionTab.setSelected(false);
		}else if(menuselected.equalsIgnoreCase(functionTab.getId())){
			reportsTab.setSelected(false);
			functionTab.setSelected(true);
		}
	}
	
	public void onClick$reportsTab()throws InterruptedException{
		reportsTab.setSelected(true);
		functionTab.setSelected(false);
		Executions.getCurrent().getSession().setAttribute("menuselected", reportsTab.getId());
	}
//	
//	public void onClick$functionTab()throws InterruptedException{
//		reportsTab.setSelected(false);
//		functionTab.setSelected(true);
//		Executions.getCurrent().getSession().setAttribute("menuselected", functionTab.getId());
//	}

}
