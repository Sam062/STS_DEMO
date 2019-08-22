package ConstructorAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ConstructorConfig.xml");
		System.out.println((Employee)ac.getBean("eobj"));
	}

}
