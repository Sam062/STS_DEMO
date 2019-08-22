package usingCollections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println(new AnnotationConfigApplicationContext(Config.class).getBean("mainobj"));
	}

}
