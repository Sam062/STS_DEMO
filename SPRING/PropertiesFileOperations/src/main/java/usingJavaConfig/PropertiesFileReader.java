package usingJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("file.properties")
public class PropertiesFileReader {
	@Autowired
	private Environment env;
	@Bean
	public BeanClass bobj() {
		BeanClass b=new BeanClass();
		b.setDriver(env.getProperty("driver"));
		b.setUrl(env.getProperty("url"));
		b.setUn(env.getProperty("un"));
		b.setPwd(env.getProperty("pwd"));
		
		return b;
	}

}
