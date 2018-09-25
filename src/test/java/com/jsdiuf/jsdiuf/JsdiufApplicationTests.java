package com.jsdiuf.jsdiuf;

import com.jsdiuf.jsdiuf.jms.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsdiufApplicationTests {

	@Resource
	Producer produce;

	@Test
	public void contextLoads() {
		for(int i=0;i<10;i++){
			produce.setMessage("test.queue",i+"");
		}
	}

}
