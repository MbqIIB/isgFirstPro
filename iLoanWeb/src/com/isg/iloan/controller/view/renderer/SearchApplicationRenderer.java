package com.isg.iloan.controller.view.renderer;

import java.text.SimpleDateFormat;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.isg.iloan.model.dataEntry.Application;
import com.isg.iloan.model.dataEntry.PersonalData;

public class SearchApplicationRenderer implements ListitemRenderer<Object>{

	@Override
	public void render(Listitem item, Object data, int arg2)
			throws Exception {
		
		final Application appData = (Application)data;
		item.setValue(appData);
	     
	    new Listcell(appData.getAppStatusDesc()).setParent(item);
	    new Listcell(appData.getCreditCardTypeDesc()).setParent(item);
	    new Listcell(getFullName(appData.getPersonalData())).setParent(item);
	    String pattern = "EEE, dd MMM yyyy HH:mm:ss z";
	    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	    new Listcell(sdf.format(appData.getDateOfApplication())).setParent(item);
	}
	
	private String getFullName(PersonalData pd){
		return pd.getGivenName()+" "+pd.getMiddleName()+" "+pd.getFamilyName();
	}

}
