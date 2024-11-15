package com.fullapp.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {
	@Autowired 
	JmsTemplate jms;
   public void send(String message) {
	  // JmsTemplate jms=AppContext.getContext().getBean(JmsTemplate.class);
	   jms.convertAndSend("pqueue",message);
   }
}
