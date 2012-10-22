package com.isg.ifrend.jms.test;

import javax.jms.JMSException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isg.ifrend.jms.CustomerMLIServiceImpl;
import com.isg.ifrend.wrapper.mli.request.customer.SearchCustomer;
import com.isg.ifrend.exception.IfrendMLIException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/isg/ifrend/jms/test/jmsContext.xml")
public class CustomerMLIServiceImplTest {

	@Autowired
	private CustomerMLIServiceImpl mliCustomerService;
	
	private SearchCustomer dto;
	
	@Before
	public void prepare(){
		dto = new SearchCustomer();
		dto.setCustomerNum("402490901277201");
		dto.setFirstName("James");
		dto.setMiddleInitial('T');
		dto.setLastName("Berti");
		
	}
	
	@Test
	public void testSend(){
		try {
			mliCustomerService.requestSearchCustomer(dto);
		} catch (IfrendMLIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	
}
