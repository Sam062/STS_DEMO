package usingAnnotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("usingAnnotationConfig")
@PropertySource("file.properties")
public class AppConfig {

}
