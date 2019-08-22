package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("CustConfig.xml");
		
		Object ob=ac.getBean("cst");
		
		Customer c=(Customer)ob;
		
		System.out.println(c);
		
		
	}

}
