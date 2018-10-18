package com.lxm;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxm.service.MeetingService;


public class MainApplication {
	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
				 (new String[] {"consumer.xml"});
	        context.start();
	        String[] arrs = context.getBeanDefinitionNames();
	        for(String s:arrs) {
	        	System.out.println(s);
	        }
	        System.out.println("--- 调用服务   ---"); 
	        MeetingService meetingService = context.getBean(MeetingService.class);
	        meetingService.meetingInIt("123");
	        System.in.read(); 
	}

}
