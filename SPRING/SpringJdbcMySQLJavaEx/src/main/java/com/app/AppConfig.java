package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("app.properties")
public class AppConfig {
	@Autowired
	private Environment env;
	
	//1. DataSource
	@Bean
	public DriverManagerDataSource dsObj() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(env.getProperty("dc"));
		d.setUrl(env.getProperty("url"));
		d.setUsername(env.getProperty("un"));
		d.setPassword(env.getProperty("pwd"));
		return d;
	}
	
	//2. JdbcTemplate
	@Bean
	public JdbcTemplate jtObj() {
		JdbcTemplate j=new JdbcTemplate();
		j.setDataSource(dsObj()); //ref
		return j;
	}
	
}




