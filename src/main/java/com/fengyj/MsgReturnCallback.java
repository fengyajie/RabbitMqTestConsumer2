package com.fengyj;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;

public class MsgReturnCallback implements ReturnCallback {

	public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {

		System.out.println("return message:"+message.getBody());
	}

}
