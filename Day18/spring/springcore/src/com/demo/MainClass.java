package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
		
		Message message = (Message) applicationContext.getBean("mymessage");
		
		System.out.println(message.getMessage());
		
	//	Mesage m = new Message() this object was created by spring container-ApplicationContext
		
		message.show();//called without created object  

	}

}
