package com.cg.helloworldmessagingreceiver.receiver;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ugawari
 *
 */
@Component
public class Receiver {

	@Bean
	public Queue queue() {
		return new Queue("word", false);
	}
	
	@RabbitListener(queues="word")
	public void processMessage(String message) {
		System.out.println("Message "+message);
	}
	
	
}
