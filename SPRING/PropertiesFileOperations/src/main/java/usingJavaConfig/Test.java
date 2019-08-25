package usingJavaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(PropertiesFileReader.class);
		System.out.println((BeanClass)ac.getBean("bobj"));
	}
	

}
