package byNameBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("byNameConfig.xml");
		System.out.println((Employee)ac.getBean("eobj"));
	}
}
