/**
 * 
 */
package com.isg.iloan.controller.functions;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.SimpleListModel;

import com.isg.iloan.controller.view.renderer.SearchApplicationRenderer;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.PersonalData;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;
import com.isg.iloan.service.SearchCriteria;

/**
 * @author sheena.catacutan
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SearchApplicationViewCtrl extends GenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 774417547043332777L;

	private static Logger logger = Logger.getLogger(SearchApplicationViewCtrl.class);
	
	private Listbox resultList;
	private Combobox applicationStatusCode;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);

		// TODO Auto-generated method stub
	}
	
	public ApplicationService getService(){
		   return  (ApplicationService)SpringUtil.getBean("applicationService", ApplicationServiceImpl.class);
		}
	
	public void onClick$searchAppButton(){
		try {
			Application app = new Application();
			app.setAppStatusDesc(applicationStatusCode.getValue());
			SearchCriteria sc = new SearchCriteria(app, new PersonalData());
			ListModel<Application> listModel = new SimpleListModel<Application>(getService().findApplication(sc));
			resultList.setModel(listModel);
			resultList.setItemRenderer(new SearchApplicationRenderer());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onClick$clearBtn() throws Exception{
	//TODO
	}
	
}
