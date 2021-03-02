package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MapApplicationPropertiesWithClass1Application {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(MapApplicationPropertiesWithClass1Application.class, args);
		
		Mail m=con.getBean("mail",Mail.class);
		System.out.println(m.getSubject());
		System.out.println(m.getFrom());
		System.out.println(m.getTo());
		
	}

}
