package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Product;

public class ProdTest {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("ProdConfig.xml");
		Object ob=ac.getBean("pod");
		Product p=(Product)ob;
		System.out.println(p);
	}

}
