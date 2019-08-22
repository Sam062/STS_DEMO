package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Customer;

public class CusTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("CustConfig.xml");
		Customer c=(Customer)ac.getBean("cust");

		System.out.println(c);
	}

}
