package com.jsdiuf.jsdiuf.jms;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;


/**
 * @author weicc
 * @create 2018-09-05 22:50
 **/
@Service
public class Producer {
    @Resource
    JmsMessagingTemplate jmsMessagingTemplate;

    public void setMessage(String destinationName,String message) {
        System.out.println("sendMessage>>>>>>"+message);
        Destination destination=new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination,message);
    }
}
