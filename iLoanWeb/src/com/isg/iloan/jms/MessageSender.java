package com.isg.iloan.jms;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MessageSender {

	
	public static void send(){
		
		try {
			Context context = new InitialContext();
			
			Queue queue = null;
		    queue = (Queue)context.lookup("jms/mliQueue");

		   
		    QueueConnectionFactory queueconnectionfactory = null;
		    queueconnectionfactory = 
		       (QueueConnectionFactory)context.lookup("jms/iFrendQCF");

		    QueueConnection queueconnection = null;
		    queueconnection = queueconnectionfactory.createQueueConnection();

		    QueueSession queuesession = null;
		    queuesession = 
		       queueconnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

		    // Create the QueueSender.

		    QueueSender queuesender = null;
		    queuesender = queuesession.createSender(queue);

		    // Create a TextMessage from the XML.  If the XML is
		    // created from user input, it will be necessary to
		    // validate the XML.  Send it.
		    
		    String stringXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> " +
								"<config> <mode>1</mode> <unit>900</unit> <current>1</current>" +
								"<interactive>1</interactive> </config> ";
		    
		    //xmlvalidator.validate(stringXML);
		    TextMessage textmessage;

		    textmessage = queuesession.createTextMessage();
		    textmessage.setText(stringXML);
		    queuesender.send(textmessage);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
