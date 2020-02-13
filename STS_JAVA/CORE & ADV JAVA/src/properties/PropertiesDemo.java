package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("F:\\STS_DEMO\\STS_JAVA\\CORE & ADV JAVA\\src\\properties\\demo.properties");
		
		Properties p=new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("driver"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("pwd"));
	}

}
