package com.fengyj;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.amqp.rabbit.retry.RepublishMessageRecoverer;

public class MsgReturnCallback implements ReturnCallback {

	public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
 
		/*//重新发布
        RepublishMessageRecoverer recoverer = new RepublishMessageRecoverer(errorTemplate,"errorExchange", "errorRoutingKey");
        Throwable cause = new Exception(new Exception("route_fail_and_republish"));
        recoverer.recover(message,cause);*/
		System.out.println("return message:"+message.getBody());
	}

}
