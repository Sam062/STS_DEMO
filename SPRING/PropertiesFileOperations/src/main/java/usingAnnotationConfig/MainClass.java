package usingAnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
	
	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${un}")
	private String un;
	@Value("${pwd}")
	private String pwd;
	
	@Override
	public String toString() {
		return "MainClass [driver=" + driver + ", url=" + url + ", un=" + un + ", pwd=" + pwd + "]";
	}

}
