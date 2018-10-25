package com.jsdiuf.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author weicc
 * @create 2018-09-05 22:56
 **/
@Service
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void recive(String message){
        System.out.println("recive message>>>>"+message);
    }

}