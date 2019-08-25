package usingXMLConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("XmlConfig.xml");
		System.out.println((BeanClass)ac.getBean("bobj"));
		
		
		System.out.println((BeanClass)new ClassPathXmlApplicationContext("XmlConfig.xml").getBean("bobj"));
	}
	

}
