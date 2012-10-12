package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.AccountInfoDTO;
import com.isg.ifrend.core.model.mli.dto.AddressDTO;
import com.isg.ifrend.core.model.mli.dto.ContactDetailDTO;
import com.isg.ifrend.core.model.mli.dto.CustomerDTO;
import com.isg.ifrend.core.model.mli.dto.RelationshipDTO;


public interface CustomerMLIService {


	/**
	 */
	public abstract Object requestSearchCustomer(CustomerDTO dto);


	/**
	 */
	public abstract Object requestRelationship(RelationshipDTO dto);



	/**
	 */
	public abstract Object requestAddressDetail(AddressDTO address);



	/**
	 */
	public abstract Object requestContactDetail(ContactDetailDTO  dto);



	/**
	 */
	public abstract Object requestAccountInfo(AccountInfoDTO accountInfoDTO);

	
}
