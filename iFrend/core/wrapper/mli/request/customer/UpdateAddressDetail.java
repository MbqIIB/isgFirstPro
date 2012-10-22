package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.customer.Address;

@XmlRootElement(name="UpdateAddressDetail")
public class UpdateAddressDetail {

	@XmlElement(name="address")
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
