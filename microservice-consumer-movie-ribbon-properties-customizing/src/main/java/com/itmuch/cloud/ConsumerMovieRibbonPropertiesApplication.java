package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ConsumerMovieRibbonPropertiesApplication {

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){
		RestTemplate restTemplate=new RestTemplate();
		return  restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonPropertiesApplication.class, args);
	}
}
