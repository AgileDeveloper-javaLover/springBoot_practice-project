package com.example.demo;

import java.lang.annotation.Annotation;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurationSelector;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sf.ehcache.config.CacheConfiguration;

@Configuration
public class CacheConfigure extends CachingConfigurerSupport{

	@Bean
	public net.sf.ehcache.CacheManager configCache() {
		CacheConfiguration c=new CacheConfiguration();
		c.setName("student-cache");
		c.setMemoryStoreEvictionPolicy("LFU");
		c.setMaxEntriesLocalHeap(2);
		c.setTimeToLiveSeconds(20000);
		
		net.sf.ehcache.config.Configuration config=new net.sf.ehcache.config.Configuration();
		
		config.addCache(c);
		return net.sf.ehcache.CacheManager.newInstance(config);
	}
	
	@Bean
	@Override
	public CacheManager cacheManager() {
		// TODO Auto-generated method stub
		return new EhCacheCacheManager(configCache());
	}
	
	
}
