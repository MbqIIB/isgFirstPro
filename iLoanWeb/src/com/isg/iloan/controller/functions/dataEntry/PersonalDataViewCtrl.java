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
	
	private Checkbox single_chkbox;
	private Checkbox married_chkbox;
	private Checkbox widowed_chkbox;
	private Checkbox separated_chkbox;
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
	private Checkbox livParRel;
	private Textbox homeOwnership;
	
	private Checkbox highschool;
	private Checkbox someCollege;
	private Checkbox college;
	private Checkbox postGraduate;
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

	
	public void onCheck$single_chkbox(){
		civilStatus.setValue(single_chkbox.getLabel());
		uncheckOthers(single_chkbox);
	}
	public void onCheck$married_chkbox(){
		civilStatus.setValue(married_chkbox.getLabel());
		uncheckOthers(married_chkbox);
	}
	public void onCheck$widowed_chkbox(){
		civilStatus.setValue(widowed_chkbox.getLabel());
		uncheckOthers(widowed_chkbox);
	}
	public void onCheck$separated_chkbox(){
		civilStatus.setValue(separated_chkbox.getLabel());
		uncheckOthers(separated_chkbox);
	}
	
	public void uncheckOthers(Checkbox cb){		
		single_chkbox.setChecked(single_chkbox.getId().equals(cb.getId())?single_chkbox.isChecked():false);
		married_chkbox.setChecked(married_chkbox.getId().equals(cb.getId())?married_chkbox.isChecked():false);
		widowed_chkbox.setChecked(widowed_chkbox.getId().equals(cb.getId())?widowed_chkbox.isChecked():false);
		separated_chkbox.setChecked(separated_chkbox.getId().equals(cb.getId())?separated_chkbox.isChecked():false);
		
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
	public void onCheck$livParRel(){
		homeOwnership.setValue(livParRel.getLabel());
		uncheckOtherHO(livParRel);
	}
	
	public void uncheckOtherHO(Checkbox cb){		
		owned.setChecked(owned.getId().equals(cb.getId())?owned.isChecked():false);
		rented.setChecked(rented.getId().equals(cb.getId())?rented.isChecked():false);
		mortgaged.setChecked(mortgaged.getId().equals(cb.getId())?mortgaged.isChecked():false);
		livParRel.setChecked(livParRel.getId().equals(cb.getId())?livParRel.isChecked():false);
		
	}
	
		
	public void onCheck$highschool(){
		education.setValue(highschool.getLabel());
		uncheckEducation(highschool);
	}
	public void onCheck$someCollege(){
		education.setValue(someCollege.getLabel());
		uncheckEducation(someCollege);
	}
	public void onCheck$college(){
		education.setValue(college.getLabel());
		uncheckEducation(college);
	}
	public void onCheck$postGraduate(){
		education.setValue(postGraduate.getLabel());
		uncheckEducation(postGraduate);
	}
	
	public void uncheckEducation(Checkbox cb){		
		highschool.setChecked(highschool.getId().equals(cb.getId())?highschool.isChecked():false);
		someCollege.setChecked(someCollege.getId().equals(cb.getId())?someCollege.isChecked():false);
		college.setChecked(college.getId().equals(cb.getId())?college.isChecked():false);
		postGraduate.setChecked(postGraduate.getId().equals(cb.getId())?postGraduate.isChecked():false);
		
	}
	
	
	
	
}
