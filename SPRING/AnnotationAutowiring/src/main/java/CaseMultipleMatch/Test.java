package CaseMultipleMatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("MultipleMatching.xml");
		System.out.println((Employee)ac.getBean("eobj"));
	}

}
