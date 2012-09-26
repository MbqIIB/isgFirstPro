/**
 * 
 */
package com.isg.iloan.controller.functions;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Div;
import org.zkoss.zul.Include;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabpanels;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Window;

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
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		// TODO Auto-generated method stub

	}

}
