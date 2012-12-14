package com.isg.iseries.ifrend.webservice.client;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;

import com.isg.iseries.ivrwsclient.logger.IfrendCoreLoggerLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/isg/iseries/ifrend/webservice/client/wsClientContext.xml")
public class WebserviceClientGatewayTest {

	@Autowired
	WebserviceClientGateway wsClientGateway;
	
	@Autowired
	ApplicationContext applicationContext;                                         

	MockWebServiceClient mockClient;
	
	
	
	@Before
	public void initLogger(){
		IfrendCoreLoggerLoader logger = new IfrendCoreLoggerLoader();
		logger.init();
		mockClient = MockWebServiceClient.createClient(applicationContext);
	}
	
	
	@Test
	public void testSend(){
		try {
			wsClientGateway.callService();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
