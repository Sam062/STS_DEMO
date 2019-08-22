package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.OrderProp;

public class OrdProp {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("OrderProp.xml");
		OrderProp op=(OrderProp)ac.getBean("ordObj");
		System.out.println(op);
		
	}

}
