package com.bean.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnot {
	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("ConfigAnnot.xml");
		com.Annotation.Product p=(com.Annotation.Product)ac.getBean("pobj");
		System.out.println(p);
		ac.close();
	}

}
