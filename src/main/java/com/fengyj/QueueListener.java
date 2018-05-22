package com.fengyj;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener implements MessageListener {

    public void onMessage(Message msg) {
        try{
            System.out.print("消费了："+msg.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
