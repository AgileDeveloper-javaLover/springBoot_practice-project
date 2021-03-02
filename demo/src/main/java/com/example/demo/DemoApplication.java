package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import test.person;


@SpringBootApplication
@ComponentScan("test,com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext con=(ApplicationContext) SpringApplication.run(DemoApplication.class, args);
		vehicle c=con.getBean("vehi",vehicle.class);
		
		person p=con.getBean("per",person.class);
	}

}
