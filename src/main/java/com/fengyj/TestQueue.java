package com.fengyj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:application-mq.xml"})

public class TestQueue{

    @Autowired
    RabbitTemplate rabbit;
    
    /*@Autowired
    QueueListener  queueListener;*/

    @Test
    public void testSendString() throws Exception {
    	try {
    	rabbit.receiveAndConvert("xxxq");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

}