package com.isg.ifrend.jms;

import java.io.StringReader;
import java.io.StringWriter;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.isg.ifrend.exception.IfrendMLIException;
import com.isg.ifrend.utils.MessageConstants;
import com.isg.ifrend.utils.Util;
import com.isg.ifrend.wrapper.mli.request.customer.SendLetter;
import com.isg.ifrend.wrapper.mli.response.customer.SendLetterResponse;
import com.isg.ifrend.wrapper.mli.response.transaction.ManualAdjustmentResponse;


public abstract class MLIService {

private static Logger logger = Logger.getLogger(MLIService.class);
	
	//private String queueConnFactory;
	
	@Value("${sendLetterQueue}")
	private String sendLetterQueue;
	@Value("${sendLetterDest}")
	private String sendLetterDest;
	
	@Autowired
	private JmsTemplate jmsQueueTemplate;
		
	
	protected void sendMessage(final String textMessage,String queue){
		jmsQueueTemplate.send(queue, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createTextMessage(textMessage);
			}
		});
		logger.debug("*** sending message" + queue + " done...");	
	}

	protected String receiveMessage(String destination) throws JMSException{
		 String xmlMesg = "";
		 Message mesg = jmsQueueTemplate.receive(destination);
		 if(mesg!=null && mesg instanceof TextMessage){
			 xmlMesg = ((TextMessage)mesg).getText();
		 }
		 return xmlMesg;
	}
				
				
	protected String requestSendLetter(SendLetter wrapper) throws IfrendMLIException {
		String mliResponse=null;		
		Object obj = processRequest(wrapper, SendLetterResponse.class, sendLetterQueue, sendLetterDest);
		if(obj!=null & obj instanceof ManualAdjustmentResponse){
			mliResponse = ((ManualAdjustmentResponse)obj).getMliResponseCode();
		}
		return mliResponse;
	}

		
	protected String convertToXML(Class<?> modelClass, Object model) throws IfrendMLIException{
		String xml="";
		try {
			logger.debug("*** converting "+modelClass.getName()+ " to XML...");
			JAXBContext context = JAXBContext.newInstance(modelClass);					
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			final StringWriter xmlWriter = new StringWriter();
			marshaller.marshal(model, xmlWriter);
			xml = xmlWriter.toString();
			
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new IfrendMLIException(MessageConstants.XML_REQ_CONV_MESG);
		}
		return xml;
	}
	
	protected Object convertToModel(Class<?> wrapper, String xmlString) throws IfrendMLIException, IllegalAccessException, InstantiationException{
		Object wrapperObject;
		try {
			logger.debug("*** unmarshalling "+wrapper.getName()+ ".from XML...");
			JAXBContext context = JAXBContext.newInstance(wrapper);					
			Unmarshaller um = context.createUnmarshaller();
			wrapperObject = wrapper.newInstance();
			wrapperObject = um.unmarshal(new StringReader(xmlString));			
			
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new IfrendMLIException(MessageConstants.XML_RES_CONV_MESG);
		}
		return wrapperObject;
	}

	protected Object processRequest(Object reqObject, Class<?> responseWrapperClass, String queue, String dest) throws IfrendMLIException {
		// TODO Auto-generated method stub
		Object resWrapperObject;		
		try {
			String xmlMesg  = convertToXML(reqObject.getClass(), reqObject);
			logger.debug("***request-->" +xmlMesg);
			sendMessage(xmlMesg, queue);
			String xmlResponse = receiveMessage(dest);		
			logger.debug("***request-->" +xmlResponse);
			resWrapperObject = convertToModel(responseWrapperClass, xmlResponse);
			
		} catch (IllegalAccessException e) {			
			e.printStackTrace();
			throw new IfrendMLIException(MessageConstants.XML_RES_CONV_MESG);
		} catch (InstantiationException e) {			
			e.printStackTrace();
			throw new IfrendMLIException(MessageConstants.XML_RES_CONV_MESG);
		} catch (JMSException e) {			
			e.printStackTrace();
			throw new IfrendMLIException(MessageConstants.GEN_MLI_RES_MESG);
		} 
		return resWrapperObject;	
	}
		

		public JmsTemplate getJmsQueueTemplate() {
			
			return jmsQueueTemplate;
		}

		public void setJmsQueueTemplate(JmsTemplate jmsQueueTemplate) {
			this.jmsQueueTemplate = jmsQueueTemplate;
		}

		public String getSendLetterQueue() {
			return sendLetterQueue;
		}

		public void setSendLetterQueue(String sendLetterQueue) {
			this.sendLetterQueue = sendLetterQueue;
		}

		public String getSendLetterDest() {
			return sendLetterDest;
		}

		public void setSendLetterDest(String sendLetterDest) {
			this.sendLetterDest = sendLetterDest;
		}

}
