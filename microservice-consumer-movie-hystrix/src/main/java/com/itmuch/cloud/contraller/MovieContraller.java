package com.itmuch.cloud.contraller;

import com.itmuch.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieContraller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/simple/{id}")
     @HystrixCommand(fallbackMethod = "fallback")
    public User gerUser(@PathVariable Long id) {
        User user = restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
        return user;
    }

    public User fallback(@PathVariable Long id) {
        System.out.println("4343");
        return null;
    }


}
