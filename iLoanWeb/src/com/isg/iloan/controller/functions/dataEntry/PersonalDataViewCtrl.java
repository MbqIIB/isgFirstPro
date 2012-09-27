/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.impl.InputElement;

import com.isg.iloan.validation.InputElementValidator;

/**
 * @author augusto.marte
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PersonalDataViewCtrl extends GenericForwardComposer {
	
	private static final long serialVersionUID = 8903716989014780575L;
	private Grid personalDataForm;
	
	private Checkbox single;
	private Checkbox married;
	private Checkbox widowed;
	private Checkbox separated;
	private Textbox civilStatus;
	private Checkbox male;
	private Checkbox female;
	private Textbox gender;
	private Checkbox filipino;
	private Checkbox otherNational;
	private Textbox nationality;
	
	private Checkbox owned;
	private Checkbox rented;
	private Checkbox mortgaged;
	private Checkbox lwpr;
	private Textbox homeOwnership;
	
	private Checkbox highschool;
	private Checkbox somecollege;
	private Checkbox college;
	private Checkbox postgraduate;
	private Textbox education;
	

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		filipino.setChecked(true);
		InputElementValidator.addOnBlurEventToInput(comp, comp, "#pd");
		bindValidationOnClick(personalDataForm);
	}
	
	private List getInputElements(Component comp, ArrayList<InputElement> arrayList) {
		if (comp instanceof InputElement) {
			arrayList.add((InputElement) comp);
		}
		if (null != comp) {
			List<Component> list = comp.getChildren();
			for (Component child : list) {
				getInputElements(child, arrayList);
			}
		}
		return arrayList;
	}
	
	private void validateForm(List<InputElement> elements){
		boolean hasInvalid = false;
		for(InputElement e: elements){
			if(!e.isValid()){
				hasInvalid = true;
				break;
			}
		}
		if(!hasInvalid){
			Clients.evalJavaScript("validatedState('#pd',true)");
		}
	}
	
	private void bindValidationOnClick(Component comp){
		if(null!=comp){
		Component parent = comp.getParent();
		if(parent instanceof Tabbox){
			for(Component c: parent.getChildren()){
				if(c instanceof Tabs){		
					for(Component t :c.getChildren()){
						if("personalData".equals(t.getId())){
							t.addEventListener(Events.ON_CLICK, new EventListener(){
								public void onEvent(Event event){
									validateForm(getInputElements(personalDataForm, new ArrayList<InputElement>()));
								}
							});
							break;
						}
					}
				}
			}
			return;
		}
		
			bindValidationOnClick(parent.getParent());
		}
	}

	
	public void onCheck$single(){
		civilStatus.setValue(single.getLabel());
		uncheckOthers(single);
	}
	public void onCheck$married(){
		civilStatus.setValue(married.getLabel());
		uncheckOthers(married);
	}
	public void onCheck$widowed(){
		civilStatus.setValue(widowed.getLabel());
		uncheckOthers(widowed);
	}
	public void onCheck$separated(){
		civilStatus.setValue(separated.getLabel());
		uncheckOthers(separated);
	}
	
	public void uncheckOthers(Checkbox cb){		
		single.setChecked(single.getId().equals(cb.getId())?single.isChecked():false);
		married.setChecked(married.getId().equals(cb.getId())?married.isChecked():false);
		widowed.setChecked(widowed.getId().equals(cb.getId())?widowed.isChecked():false);
		separated.setChecked(separated.getId().equals(cb.getId())?separated.isChecked():false);
		
	}
	
	public void onClick$male(){
		female.setChecked(!male.isChecked());
		gender.setValue(male.isChecked()?male.getLabel():female.getLabel());
	}
	public void onClick$female(){
		male.setChecked(!female.isChecked());
		gender.setValue(female.isChecked()?female.getLabel():male.getLabel());
	}
	
	public void onClick$otherNational(){
		filipino.setChecked(!otherNational.isChecked());
		nationality.setValue(otherNational.isChecked()?"":filipino.getLabel());
	}
	public void onClick$filipino(){
		otherNational.setChecked(!filipino.isChecked());
		nationality.setValue(filipino.isChecked()?filipino.getLabel():"");
	}
	
	public void onCheck$owned(){
		homeOwnership.setValue(owned.getLabel());
		uncheckOtherHO(owned);
	}
	public void onCheck$rented(){
		homeOwnership.setValue(rented.getLabel());
		uncheckOtherHO(rented);
	}
	public void onCheck$mortgaged(){
		homeOwnership.setValue(mortgaged.getLabel());
		uncheckOtherHO(mortgaged);
	}
	public void onCheck$lwpr(){
		homeOwnership.setValue(lwpr.getLabel());
		uncheckOtherHO(lwpr);
	}
	
	public void uncheckOtherHO(Checkbox cb){		
		owned.setChecked(owned.getId().equals(cb.getId())?owned.isChecked():false);
		rented.setChecked(rented.getId().equals(cb.getId())?rented.isChecked():false);
		mortgaged.setChecked(mortgaged.getId().equals(cb.getId())?mortgaged.isChecked():false);
		lwpr.setChecked(lwpr.getId().equals(cb.getId())?lwpr.isChecked():false);
		
	}
	
		
	public void onCheck$highschool(){
		education.setValue(highschool.getName());
		uncheckEducation(highschool);
	}
	public void onCheck$somecollege(){
		education.setValue(somecollege.getName());
		uncheckEducation(somecollege);
	}
	public void onCheck$college(){
		education.setValue(college.getName());
		uncheckEducation(college);
	}
	public void onCheck$postgraduate(){
		education.setValue(postgraduate.getName());
		uncheckEducation(postgraduate);
	}
	
	public void uncheckEducation(Checkbox cb){		
		highschool.setChecked(highschool.getId().equals(cb.getId())?highschool.isChecked():false);
		somecollege.setChecked(somecollege.getId().equals(cb.getId())?somecollege.isChecked():false);
		college.setChecked(college.getId().equals(cb.getId())?college.isChecked():false);
		postgraduate.setChecked(postgraduate.getId().equals(cb.getId())?postgraduate.isChecked():false);
		
	}
	
	
	
	
}
