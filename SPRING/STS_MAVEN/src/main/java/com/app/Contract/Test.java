package com.app.Contract;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ContractConfig.xml");
		Contract c=(Contract)ac.getBean("cobj");
		System.out.println(c);
	}

}
