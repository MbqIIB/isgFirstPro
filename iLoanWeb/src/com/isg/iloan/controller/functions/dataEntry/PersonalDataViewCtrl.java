/**
 * 
 */
package com.isg.iloan.controller.functions.dataEntry;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author augusto.marte
 *
 */
public class PersonalDataViewCtrl extends GenericForwardComposer {

	private Window personalData;
	private Textbox personalRefTelNum_txtbox;
	private Textbox personalRefAddress_txtbox;
	private Textbox personalRefRelation_txtbox;
	private Textbox personalRefName_txtbox;
	private Textbox otherID_txtbox;
	private Checkbox otherID_chkbox;
	private Textbox prcID_txtbox;
	private Checkbox prcID_chkbox;
	private Textbox passportNum_txtbox;
	private Checkbox passportNum_chkbox;
	private Textbox driverLicenseNum_txtbox;
	private Checkbox driverLicenseNum_chkbox;
	private Textbox sss_txtbox;
	private Checkbox gsisNo_chkbox;
	private Checkbox sssNo_chkbox;
	private Textbox tin_txtbox;
	private Checkbox postGraduate_chkbox;
	private Checkbox college_chkbox;
	private Checkbox someCollege_chkbox;
	private Checkbox highschool_chkbox;
	private Textbox modelyear_txtbox;
	private Textbox numOfcars_txtbox;
	private Textbox lengthofStays_txtbox;
	private Checkbox livParRel_chkbox;
	private Checkbox mortgaged_chkbox;
	private Checkbox rented_chkbox;
	private Checkbox owned_chkbox;
	private Textbox permAddressZipcode_txtbox;
	private Textbox permAddress_txtbox;
	private Textbox zipCode_txtbox;
	private Textbox homeAddress_txtbox;
	private Textbox numOfChildren_txtbox;
	private Textbox motherFullname_txtbox;
	private Textbox homePhoneNumber_txtbox;
	private Textbox emailAddress_txtbox;
	private Textbox mobilePhoneNumber_txtbox;
	private Textbox others_txtbox;
	private Checkbox others_chkbox;
	private Checkbox filipino_chkbox;
	private Checkbox female_chkbox;
	private Checkbox male_chkbox;
	private Checkbox separated_chkbox;
	private Checkbox widowed_chkbox;
	private Checkbox married_chkbox;
	private Checkbox single_chkbox;
	private Textbox placeOfBirth;
	private Datebox birthdate;
	private Textbox nameOnCard;
	private Textbox middleName;
	private Textbox givenName;
	private Textbox familyName;

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
