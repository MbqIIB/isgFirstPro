package com.isg.iloan.validation;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Tabpanel;

public class CreditCardDetailPanelValidator {

	public static void addSaveSwipeValidation(Component window) {		
//		getSaveAndSwipeNode(window);
		//window.getPage().getDesktop().getComponents()
		for(Component c: window.getPage().getDesktop().getComponents()){
			System.out.println(c);
		}
		
		
		System.out.println(window.getPage().getDesktop().getComponentByUuid(""));
	}

	private static void getSaveAndSwipeNode(Component comp) {
		Component parent = comp.getParent();
		
		if(parent instanceof Tabpanel){
			parent.getSpaceOwner();
			for(Component e: parent.getFellows()){		
				if("saveSwipePanel".equals(e.getId())){
					System.out.println(e.getFellows().size());
//					Include include =  (Include) e.getFellow("saveSwipePanel");
//					System.out.println(e.getFellows());
					for(Component x:e.getFellows()){
						System.out.println(x);
//						if(x.getId("saveSwipePanelInclude")){
//							
//						}
					}
					break;
				}
			}
		}
		if(null !=parent){
			getSaveAndSwipeNode(parent);
		}
	}

}
