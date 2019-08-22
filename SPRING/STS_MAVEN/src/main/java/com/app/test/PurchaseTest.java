package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Purchase;

public class PurchaseTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("PurchaseConfig.xml");
		Purchase p=(Purchase)ac.getBean("pobj");
		System.out.println(p);
	}
}
