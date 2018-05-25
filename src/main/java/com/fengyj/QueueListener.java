package com.fengyj;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

@Component
public class QueueListener implements ChannelAwareMessageListener {

	public void onMessage(Message message, Channel channel) throws Exception {
		
		//手动确认
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
		
	}
	
	
}
