package javaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotaionBean.Product;
import com.javaConfig.ProdConfig1;
import com.javaConfig.ProdConfig2;

public class ProdTest {
	public static void main(String[] args) {
		System.out.println("Single Object Without SAC :");
		ApplicationContext ac=new AnnotationConfigApplicationContext(ProdConfig1.class);
		Product p=(Product)ac.getBean("pobj");
		System.out.println(p);
		

		System.out.println("\nWith SAC :");
		ApplicationContext ac1=new AnnotationConfigApplicationContext(ProdConfig2.class);
		Product p1=(Product)ac1.getBean("pobj");
		System.out.println(p1);
		
	}

}
