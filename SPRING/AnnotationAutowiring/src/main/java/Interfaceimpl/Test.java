package Interfaceimpl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);
		ProductService ps=(ProductService)ac.getBean("ps");
		System.out.println(ps.getDetails());
		
	}
}
