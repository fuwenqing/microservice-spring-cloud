package com.itmuch.config;

import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration2 {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("chhliu","chhliu123456");
    }

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder()
    {
        return Feign.builder();

    }
}

