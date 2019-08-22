package com.bean.Test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInterface {
	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("ConfigInterface.xml");
		com.usingInterface.Product p=(com.usingInterface.Product)ac.getBean("pobj");
		System.out.println(p);
		ac.close();
	}

}
