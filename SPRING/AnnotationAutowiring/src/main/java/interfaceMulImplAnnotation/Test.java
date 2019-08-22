package interfaceMulImplAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);
		EmpDao ed=(EmpDao)ac.getBean("empObj");
		System.out.println(ed.findContext());
	}
}