package com.isg.iloan.commons;

import java.util.HashMap;
import java.util.Map;

public class LOVs {

	private int key;
	private int code;
	private String desc;
	

	public LOVs() {	}


	public static Map<String,String> getFundLov(){
		Map<String,String> funds = new HashMap<String, String>();
		
		return funds;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}

	
}
