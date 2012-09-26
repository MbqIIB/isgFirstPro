/**
 * 
 */
package com.isg.iloan.controller.functions;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
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

import com.isg.iloan.commons.Helper;
import com.isg.iloan.commons.IDs;
import com.isg.iloan.dao.ApplicationDaoImpl;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.Fund;
import com.isg.iloan.model.dataEntry.JobDetail;
import com.isg.iloan.model.dataEntry.PersonalData;
import com.isg.iloan.model.dataEntry.Supplementary;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;

/**
 * @author augusto.marte
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class EditApplicationWindowViewCtrl extends GenericForwardComposer {
	
	private static Logger logger = Logger.getLogger(EditApplicationWindowViewCtrl.class);

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
		logger.debug("app card desc " + app.getCardTypeDesc());
		Supplementary supp = app.getSupplementary();
		logger.debug("supp birth place:" +supp.getBirthPlace());
		JobDetail jd = app.getJobDetail();
		
		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		for(Component window:comps){			
			if("creditCardDetails".equals(window.getId())){							
				((Checkbox)window.getFellow(IDs.ACCEPT_CLASSIC_CARD)).setChecked(app.isAcceptClassicCard());
				((Checkbox)window.getFellow(IDs.ACCEPT_SAVE_SWIPE)).setChecked(app.isAcceptSaveAndSwipe());
				break;
			}			
		}
		
		Collection<Component> personalComps =  personalPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.PD_WINDOW.equals(window.getId())){
				PersonalData pd = app.getPersonalData();
				Helper.setValues(window, pd);
			}
		}
		

	}


	public void onClick$appUpdateButton() throws WrongValueException, SecurityException, IllegalAccessException, InvocationTargetException{
		
		logger.debug("test--------");
		Collection<Component> comps =  personalPanel.getPage().getDesktop().getComponents();
		logger.debug("comps size: " + comps.size());
		for(Component window:comps){			
			if(IDs.PD_WINDOW.equals(window.getId())){
				PersonalData pd = new PersonalData();
				Helper.setProperties(pd, window);
				break;
			}
			
		}
		
	}
	
	
	
	
	

}
