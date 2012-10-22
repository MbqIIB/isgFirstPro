package com.isg.ifrend.wrapper.mli.request.customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.isg.ifrend.model.mli.customer.Contact;

@XmlRootElement(name="UpdateContactDetail")
public class UpdateContactDetail {

	@XmlElement(name="contact")
	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
