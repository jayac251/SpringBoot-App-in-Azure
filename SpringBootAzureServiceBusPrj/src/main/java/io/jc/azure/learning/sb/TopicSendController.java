package io.jc.azure.learning.sb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicSendController {

	  private static final String QUEUE_NAME = "mytopic";

	    private static final Logger LOGGER = LoggerFactory.getLogger(TopicSendController.class);

	    @Autowired
	    private JmsTemplate jmsTemplate;

	    @PostMapping("/topic")
	    public String postMessage(@RequestParam String message) {

	        LOGGER.info("Sending message");

	        jmsTemplate.convertAndSend(QUEUE_NAME, new User(message), jmsMessage -> {
	            jmsMessage.setStringProperty("JMSXGroupID", "xxxeee");
	            return jmsMessage;
	        });
	        return message;
	    }
}