package com.isg.iloan.commons;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 ** Class Application
 **/

@Entity
@Table(name = "LOV")
public class LOV implements Serializable {

	private static final long serialVersionUID = 7404651072498175937L;
	
	@Id
	@SequenceGenerator(name = "LOV_SEQ", sequenceName = "LOV_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "LOV_SEQ", strategy = GenerationType.SEQUENCE)
	
	@Column(name = "LOV_ID")
	private long id;

	@Column(name = "LOV_KEY")
	private int key;
	@Column(name = "LOV_CODE")
	private String code;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Column(name = "LOV_DESC")
	private String desc;

}
