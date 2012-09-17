package com.isg.ifrend.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Element")
public class Element {
	@Id
	@Column(name="element_id")
	private int element_id=0;
	
	private int function_id=0;
	private String format="";
	private int length=0;
	private String description="";
	private String allowed_operators="";
	
	
	public int getElement_id() {
		return element_id;
	}


	public void setElement_id(int element_id) {
		this.element_id = element_id;
	}


	public int getFunction_id() {
		return function_id;
	}


	public void setFunction_id(int function_id) {
		this.function_id = function_id;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAllowed_operators() {
		return allowed_operators;
	}


	public void setAllowed_operators(String allowedOperators) {
		this.allowed_operators = allowedOperators;
	}
	
	
	
}
