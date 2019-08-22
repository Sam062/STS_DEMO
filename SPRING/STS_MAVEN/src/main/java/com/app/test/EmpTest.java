package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("EmpConfig.xml");
		Employee e=(Employee)ac.getBean("emp");
		System.out.println(e);
	}

}
