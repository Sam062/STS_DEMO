package com.app.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SACTest {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("SACConfig.xml");
		
		List<String> l=(List<String>)ac.getBean("lsobj");
		System.out.println(l);
	
		Set<String> s=(Set<String>)ac.getBean("sobj");
		System.out.println(s);
		
		
		Map<String,String> m=(Map<String,String>)ac.getBean("mobj");
		System.out.println(m);
		
		Object ob=ac.getBean("pobj");
		System.out.println(ob);
	}
}
