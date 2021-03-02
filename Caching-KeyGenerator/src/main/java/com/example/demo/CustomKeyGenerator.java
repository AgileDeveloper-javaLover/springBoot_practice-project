package com.example.demo;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import com.sun.jdi.Method;

@Component("customKey")
@DependsOn("service")
public class CustomKeyGenerator implements KeyGenerator {

	@Override
    public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
        Object o=target.getClass().getSimpleName() + "_"
                + method.getName() + "_"
                +org.springframework.util.StringUtils.arrayToDelimitedString(params, "_");
		System.out.println((String)o);
        return o;
    }

}