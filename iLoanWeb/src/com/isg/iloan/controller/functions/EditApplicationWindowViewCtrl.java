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
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.isg.iloan.commons.Helper;
import com.isg.iloan.commons.IDs;
import com.isg.iloan.dao.ApplicationDaoImpl;
import com.isg.iloan.model.dataEntry.Address;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.DeedsOfAssignment;
import com.isg.iloan.model.dataEntry.Fund;
import com.isg.iloan.model.dataEntry.Instruction;
import com.isg.iloan.model.dataEntry.JobDetail;
import com.isg.iloan.model.dataEntry.PersonalData;
import com.isg.iloan.model.dataEntry.SaveAndSwipe;
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
	
	private Application app;

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
		this.app = app;
		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
		for(Component window:comps){			
			if("creditCardDetails".equals(window.getId())){		
				
				((Checkbox)window.getFellow(app.getCardTypeCode().toLowerCase())).setChecked(true);				
				((Checkbox)window.getFellow(IDs.ACCEPT_CLASSIC_CARD)).setChecked(app.isAcceptClassicCard());
				((Checkbox)window.getFellow(IDs.ACCEPT_SAVE_SWIPE)).setChecked(app.isAcceptSaveAndSwipe());
				
				if(app.isAcceptSaveAndSwipe()){
					showSaveAndSwipeTab(app);
				}
				
				
				
				
				break;
			}			
		}
		
		//decomposePersonalData(app);
		//decomposeJobDetail(app);
		//decomposeSupplementary(app);
		//decomposeInstruction(app);

	}
	
	
	public void showSaveAndSwipeTab(Application app) throws Exception{
		
		Collection<Component> comps =  ccDetailPanel.getPage().getDesktop().getComponents();		
	
		SaveAndSwipe ss = app.getSaveAndSwipe();
		DeedsOfAssignment doa = ss.getDoa();
		
		int ctr=0;
		for(Component window:comps){	
			//logger.debug("comp id: " + window.getId());
			if("ccDetailPanelWindow".equals(window.getId())){				
				window.getFellow("saveAndSwipe").setVisible(true);
				window.getFellow("ssDeeds").setVisible(true);
				
				ctr++;
				
				//break;
			}
			
			if(IDs.SS_WINDOW.equals(window.getId())){
				
				Helper.setValues(window, ss);
				if(ss.isMetrobankDepositor()){
					((Checkbox)window.getFellow(IDs.SS_METROBANK_DEPOSITOR_YES)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SS_METROBANK_DEPOSITOR_NO)).setChecked(false);
				}
				if(ss.isAcceptPledge()){
					((Checkbox)window.getFellow(IDs.SS_PLEDGE_YES)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SS_PLEDGE_NO)).setChecked(false);
				}
				
				ctr++;
			}
			
			if(IDs.DOA_WINDOW.equals(window.getId())){
				Helper.setValues(window, doa);
				//logger.debug("issuance: " + doa.isIssuance());
				if(ss.isAcceptPledge()){
					
					((Div)window.getFellow(IDs.DOA_PLEDGE_DIV)).setVisible(true);
					((Checkbox)window.getFellow(doa.getPledgedAccountTypeCode().toLowerCase())).setChecked(true);
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	

	public void decomposePersonalData(Application app) throws Exception{
		
		//----Personal
		Collection<Component> personalComps =  personalPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.PD_WINDOW.equals(window.getId())){
				PersonalData pd = app.getPersonalData();
				Helper.setValues(window, pd);
				
				((Checkbox)window.getFellow(pd.getCivilStatus().toLowerCase())).setChecked(true);
				((Checkbox)window.getFellow(pd.getGender().toLowerCase())).setChecked(true);
				if(pd.isOtherNational()){
					((Checkbox)window.getFellow(IDs.PD_OTHER_NATIONAL)).setChecked(true);
					((Checkbox)window.getFellow(IDs.PD_FILIPINO_NAT)).setChecked(false);
				}
				logger.debug("address line:"+pd.getHomeAddress().getAddressLine1());
				logger.debug("zip :" + pd.getHomeAddress().getZipCode());
				logger.debug("tel no.:"+pd.getHomeAddress().getTelNum());
				Helper.setAddress(window, pd.getHomeAddress(),
						new String[]{IDs.PD_HOME_ADDRESS,IDs.PD_HOME_ZIP_CODE,IDs.PD_HOME_TEL_NUM});
				Helper.setAddress(window, pd.getPermanentAddress(),
						new String[]{IDs.PD_PERMANENT_ADDRESS,IDs.PD_PERM_ZIP_CODE});
				Helper.setAddress(window, pd.getPersonalRefAddress(),
						new String[]{IDs.PD_PERSONAL_REF_ADDRESS,"", IDs.PD_PERSONAL_REF_TEL_NUM});
				
				if((pd.getHomeOwnership().startsWith("Living"))){
					((Checkbox)window.getFellow("lwpr")).setChecked(true);
				}else{
					((Checkbox)window.getFellow(pd.getHomeOwnership().toLowerCase())).setChecked(true);
				}
				((Checkbox)window.getFellow(pd.getEducation().toLowerCase())).setChecked(true);
				
				((Checkbox)window.getFellow(IDs.PD_DRIVER_LICENSE_NUM + "_chkbox")).setChecked(null!=pd.getDriverLicenseNum() && !pd.getDriverLicenseNum().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_PASSPORT_NUM + "_chkbox")).setChecked(null!=pd.getPassportNum() && !pd.getPassportNum().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_PRC_ID + "_chkbox")).setChecked(null!=pd.getPrcID() && !pd.getPrcID().isEmpty());
				((Checkbox)window.getFellow(IDs.PD_OTHER_ID + "_chkbox")).setChecked(null!=pd.getOtherID() && !pd.getOtherID().isEmpty());
				
			}
		}
	}
	
    public void decomposeJobDetail(Application app) throws Exception{
		
		Collection<Component> personalComps =  jobDetailTabPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.JD_WINDOW.equals(window.getId())){
				JobDetail jd = app.getJobDetail();
				Helper.setValues(window, jd);
				Helper.setAddress(window, jd.getBusinessAddress(), 
						new String[]{IDs.JD_BUSS_ADDR, IDs.JD_ZIPCODE, IDs.JD_TEL});
				
				List<Fund> funds = jd.getSourceOfFunds();
				for(Fund fund:funds){
					((Checkbox)window.getFellow(fund.getFundCode().toLowerCase())).setChecked(true);
					if(IDs.JD_OTHERS_CHKBOX.equals(fund.getFundCode().toLowerCase())){
						((Textbox)window.getFellow(IDs.JD_OTHERS_TXTBOX)).setValue(fund.getFundDesc());
					}
				}
				
			}
		}
	}


	public void decomposeSupplementary(Application app) throws Exception{		
		
		Collection<Component> personalComps =  supplementaryTabPanel.getPage().getDesktop().getComponents();
		for(Component window:personalComps){			
			if(IDs.SUPP_WINDOW.equals(window.getId())){
				Supplementary supp = app.getSupplementary();
				Helper.setValues(window, supp);
				Helper.setAddress(window, supp.getHomeAddress(), 
						new String[]{IDs.SUPP_ADDR, IDs.SUPP_ZIPCODE,});
				((Checkbox)window.getFellow(supp.getGender().toLowerCase())).setChecked(true);
				if(supp.isOtherNational()){
					((Checkbox)window.getFellow(IDs.SUPP_OTHER_NAT)).setChecked(true);
					((Checkbox)window.getFellow(IDs.SUPP_FILIPINO_NAT)).setChecked(false);
				}
				
			}
		}
	}

	public void decomposeInstruction(Application app) throws Exception{
			
			
			Collection<Component> personalComps =  instructionTabPanel.getPage().getDesktop().getComponents();
			for(Component window:personalComps){			
				if(IDs.INS_WINDOW.equals(window.getId())){
					Instruction ins = app.getInstruction();
					Helper.setValues(window, ins);
					
					((Checkbox)window.getFellow(IDs.INS_MIN_AMOUNT)).setChecked(ins.isMinAmountDue());
					((Checkbox)window.getFellow(IDs.INS_TOTAL_AMOUNT)).setChecked(ins.isTotalAmountDue());
					
					Checkbox pm = (Checkbox)window.getFellow(ins.getPaymentMode().toLowerCase());
					if(IDs.INS_ADA_PAY.equals(pm.getId())){
						((Div)window.getFellow(IDs.INS_ADA_DIV)).setVisible(true);
						 pm.setChecked(true);
						((Checkbox)window.getFellow(IDs.INS_CASHCHECK_PAY)).setChecked(false);
					}else{
						((Div)window.getFellow(IDs.INS_ADA_DIV)).setVisible(false);
						pm.setChecked(true);
					}
					
					
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


	
	public void onClick$personalData() throws Exception{
		decomposePersonalData(app);		
	}
	public void onClick$jobDetail() throws Exception{
		decomposeJobDetail(app);
	}
	public void onClick$supplementaryDetail()throws Exception{
		decomposeSupplementary(app);
	}
	public void onClick$deliveryInstruction()throws Exception{
		decomposeInstruction(app);
	}
	
	
	
	
}
