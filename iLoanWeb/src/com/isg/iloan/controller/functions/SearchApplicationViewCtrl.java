/**
 * 
 */
package com.isg.iloan.controller.functions;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listfooter;
import org.zkoss.zul.SimpleListModel;

import com.isg.iloan.controller.view.renderer.SearchApplicationRenderer;
import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.service.ApplicationService;
import com.isg.iloan.service.ApplicationServiceImpl;

/**
 * @author sheena.catacutan
 *
 */
public class SearchApplicationViewCtrl extends GenericForwardComposer {

	private static Logger logger = Logger.getLogger(SearchApplicationViewCtrl.class);
	
	private Button searchAppButton;
	private Listbox resultList;
	private Listfooter results_footer;
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

			ListModel<Application> listModel = new SimpleListModel<Application>(getService().findAll());
		
			for(int i=0; i< listModel.getSize(); i++){
				System.out.println(listModel.getElementAt(i));
			}
			resultList.setModel(listModel);
			resultList.setItemRenderer(new SearchApplicationRenderer());
			results_footer.setLabel("Total results: "+listModel.getSize());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onClick$clearBtn() throws Exception{
	
//		resultList.setModel(listModel);
	}
	
}
