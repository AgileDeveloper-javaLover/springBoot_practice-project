package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "outlook.mail")
@PropertySource("classpath:application.properties")
public class ConfigurationClass {
	
	Mail m=new Mail();
	
	
	@Bean("mail")
	Mail getMail() {
		return m;
	}
	

}
