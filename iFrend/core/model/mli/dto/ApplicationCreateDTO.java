package com.isg.ifrend.core.model.mli.dto;


public class ApplicationCreateDTO {

	/**
	 * @uml.property  name="actionType"
	 */
	private int actionType;

	/**
	 * Getter of the property <tt>actionType</tt>
	 * @return  Returns the actionType.
	 * @uml.property  name="actionType"
	 */
	public int getActionType() {
		return actionType;
	}

	/**
	 * Setter of the property <tt>actionType</tt>
	 * @param actionType  The actionType to set.
	 * @uml.property  name="actionType"
	 */
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	/**
	 * @uml.property  name="applicationType" readOnly="true"
	 */
	private final int applicationType = 2; //value for Add-on type application

	/**
	 * Getter of the property <tt>applicationType</tt>
	 * @return  Returns the applicationType.
	 * @uml.property  name="applicationType"
	 */
	public int getApplicationType() {
		return applicationType;
	}

}
