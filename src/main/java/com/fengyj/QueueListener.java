package com.fengyj;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

@Component
public class QueueListener implements ChannelAwareMessageListener {

	public void onMessage(Message message, Channel channel) throws Exception {
		
		
		/**
		 * channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); // 消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
             channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true); // ack返回false，并重新回到队列，api里面解释得很清楚
           channel.basicReject(message.getMessageProperties().getDeliveryTag(), true); // 拒绝消息
		 */
		//手动确认
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
		
	}
	
	
}
