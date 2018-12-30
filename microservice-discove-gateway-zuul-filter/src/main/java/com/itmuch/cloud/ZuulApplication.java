package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootConfiguration
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulApplication.class,args);

    }
}
