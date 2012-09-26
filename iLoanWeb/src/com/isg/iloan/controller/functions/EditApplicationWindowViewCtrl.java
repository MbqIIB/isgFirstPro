/**
 * 
 */
package com.isg.iloan.controller.functions;

import java.util.Collection;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Include;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabpanels;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Window;

import com.isg.iloan.commons.IDs;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;

/**
 * @author augusto.marte
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class EditApplicationWindowViewCtrl extends GenericForwardComposer {

	private Window editApplicationWindow;
	private Tabpanel instructionTabPanel;
	private Tabpanel internetTabPanel;
	private Tabpanel supplementaryTabPanel;
	private Tabpanel jobDetailTabPanel;
	private Include personalDataInc;
	private Tabpanel personalPanel;
	private Tabpanel ccDetailPanel;
	private Tabpanels tabPanels;
	private Tab deliveryInstruction;
	private Tab internetTransaction;
	private Tab supplementaryDetail;
	private Tab jobDetail;
	private Tab personalData;
	private Tab creditCardDetail;
	private Tabs tabs;
	private Tabbox tb;
	private Div breadcrumb;
	private Button appUpdateButton;

	/**
	 *
	 *
	 */
	
	public ApplicationService getService(){
		   return  (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
		}
	
	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub
		
		Application app = getService().retrieveById(23);
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		for(Component window:comps){			
			if("creditCardDetails".equals(window.getId())){							
				((Checkbox)window.getFellow(IDs.ACCEPT_CLASSIC_CARD)).setChecked(app.isAcceptClassicCard());
				((Checkbox)window.getFellow(IDs.ACCEPT_SAVE_SWIPE)).setChecked(app.isAcceptSaveAndSwipe());
				break;
			}			
		}
		

	}



	@Override
	public void doBeforeComposeChildren(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doBeforeComposeChildren(comp);
		
		
		ApplicationService appService = (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
		
		Application app = appService.retrieveById(23);
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		for(Component window:comps){			
			if("creditCardDetails".equals(window.getId())){							
				((Checkbox)window.getFellow(IDs.ACCEPT_CLASSIC_CARD)).setChecked(app.isAcceptClassicCard());
				((Checkbox)window.getFellow(IDs.ACCEPT_SAVE_SWIPE)).setChecked(app.isAcceptSaveAndSwipe());
				break;
			}			
		}
		
	}
	
	

}
