/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Hlayout;
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

	private Window newApplicationWindow;
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
	private Hlayout cbLayout;
	private Hbox acceptClassicCardHbox;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$personalData(){
		Clients.evalJavaScript("changeState('#pd')");
	}
	public void onClick$jobDetail(){
		Clients.evalJavaScript("changeState('#jd')");
	}
	public void onClick$supplementaryDetail(){
		Clients.evalJavaScript("changeState('#sd')");
	}
	public void onClick$deliveryInstruction(){
		Clients.evalJavaScript("changeState('#dpi')");
	}
	public void onClick$internetTransaction(){
		Clients.evalJavaScript("changeState('#it')");
	}
	public void onClick$saveAndSwipe(){
		Clients.evalJavaScript("changeState('#ss')");
	}
	public void onClick$ssDeeds(){
		Clients.evalJavaScript("changeState('#dass')");
	}
	
	public void onClick$ccApplicationSubmitBtn(){
		extractPersonalDataDetails();
	}

	private void extractPersonalDataDetails() {
		//Component personalDataForm = getComponent("personalDataInc");
		//System.out.println(personalDataForm);
		Component p = newApplicationWindow.getFellow("personalPanel");
		System.out.println(p.getChildren().size());
		String[] personalDataFields = {"familyName","givenName","middleName","nameOnCard","birthdate","placeOfBirth"};
		
		
	}
	
	private Component getComponent(String id){
		List<Component> components = newApplicationWindow.getChildren();
		for(Component c: components){
			System.out.println(c);
			if(id.equals(c.getId())){
				System.out.println(c);
				return c;
			}
		}
		return null;
	}

}
