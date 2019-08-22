package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.bean.Employee;
public class EmpTest {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("EmpConfig.xml");
		
		Object ob=ac.getBean("emp");
		Employee e=(Employee)ob;
		System.out.println(e);
	}

}
