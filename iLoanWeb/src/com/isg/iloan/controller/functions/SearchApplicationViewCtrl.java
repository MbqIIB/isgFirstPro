/**
 * 
 */
package com.isg.iloan.controller.functions;

import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Button;

import com.isg.iloan.controller.functions.dataEntry.NewApplicationViewCtrl;
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
			
			List<Application> apps = getService().findAll();
			
			alert("apps size: " + apps.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onClick$clearBtn(){
		
	}
}
