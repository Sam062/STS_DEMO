package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Student;

public class StuTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("StuConfig.xml");
		Student s=(Student)ac.getBean("stu");
		
		System.out.println(s);
	}

}
