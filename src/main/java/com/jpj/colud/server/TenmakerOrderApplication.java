package com.jpj.colud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
 
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.jpj.colud.server")
public class TenmakerOrderApplication {
 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TenmakerOrderApplication.class, args);
	}
 
}
