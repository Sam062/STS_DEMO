package byTypeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class byTypeTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("byTypeConfig.xml");
		System.out.println((Employee)ac.getBean("eobj"));
	}

}
