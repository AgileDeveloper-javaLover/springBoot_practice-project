package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean<MyFilter1> getFilter() {
		FilterRegistrationBean<MyFilter1> regist = new FilterRegistrationBean<MyFilter1>();
		regist.setFilter(new MyFilter1());
		regist.addUrlPatterns("/home");
		return regist;
	}
}
