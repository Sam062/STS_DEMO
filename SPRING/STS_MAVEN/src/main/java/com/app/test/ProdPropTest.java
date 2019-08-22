package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.ProductProperty;

public class ProdPropTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ProdPropConfig.xml");
		
		ProductProperty p=(ProductProperty)ac.getBean("pob");
		System.out.println(p);
		}

}
