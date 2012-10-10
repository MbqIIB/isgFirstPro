package com.isg.ifrend.core.jms;

import com.isg.ifrend.core.model.mli.dto.AccountInfoDTO;
import com.isg.ifrend.core.model.mli.dto.AddressDetailDTO;
import com.isg.ifrend.core.model.mli.dto.ContactDetailDTO;
import com.isg.ifrend.core.model.mli.dto.RelationshipDTO;
import com.isg.ifrend.core.model.mli.dto.SearchCustomerDTO;


public interface CustomerMLIService {


	/**
	 */
	public abstract Object requestSearchCustomer(SearchCustomerDTO dto);


	/**
	 */
	public abstract Object requestRelationship(RelationshipDTO dto);



	/**
	 */
	public abstract Object requestAddressDetail(AddressDetailDTO dto);



	/**
	 */
	public abstract Object requestContactDetail(ContactDetailDTO  dto);



	/**
	 */
	public abstract Object requestAccountInfo(AccountInfoDTO accountInfoDTO);

	
}
