package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyCofiguration {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
    public CacheManager concurrentMapCacheManager() {
        ConcurrentMapCacheManager cmcm = new ConcurrentMapCacheManager();
        return cmcm;
    }*/

    /*@Bean
    @Primary
    public CacheManager guavaCacheManager() {
        GuavaCacheManager gcm = new GuavaCacheManager();
        return gcm;
    }*/

}
