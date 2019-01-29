/**
 * 
 */
package com.cg.helloworlmessaging.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ugawari
 *
 */
@Component
public class Sender {

	@Autowired
	private RabbitMessagingTemplate template;
	
	@Bean
	public Queue queue() {
		return new Queue("word", false);
	}
	
	public void send(String message) {
		template.convertAndSend("word", message);
	}
	
}
