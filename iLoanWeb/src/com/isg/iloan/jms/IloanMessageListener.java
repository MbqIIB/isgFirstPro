package com.isg.iloan.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.listener.SessionAwareMessageListener;

import com.isg.iloan.controller.functions.EditApplicationWindowViewCtrl;

public class IloanMessageListener implements MessageListener{

	private static Logger logger = Logger.getLogger(IloanMessageListener.class);
	
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		if(message instanceof TextMessage){
			try {
				logger.debug(((TextMessage)message).getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
