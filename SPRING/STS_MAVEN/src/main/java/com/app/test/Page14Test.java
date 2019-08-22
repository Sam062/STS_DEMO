package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Page14;

public class Page14Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Page14Config.xml");
		Page14 p=(Page14)ac.getBean("prodObj");
		System.out.println(p);
		
	}

}
