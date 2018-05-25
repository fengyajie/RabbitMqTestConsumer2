package com.fengyj;

import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;

public class MsgSendConfirmCallBack implements ConfirmCallback {

	public void confirm(CorrelationData correlationData, boolean ack, String cause) {

		if(ack) {
			System.out.println("消息确认成功");
		}else {
			System.out.println("消息确认失败,原因:"+cause);
		}
	}

}
