package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.EmployeeRef;

public class RefTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("RefConfig.xml");
		EmployeeRef er=(EmployeeRef)ac.getBean("eob");
		System.out.println(er);
	}

}
