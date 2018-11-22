package com.itmuch.cloud.contraller;

import com.itmuch.cloud.entity.User;
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
    public User gerUser(@PathVariable Long id){
        User user = restTemplate.getForObject("http://microservice-provider-user/simple/"+id, User.class);
        return  user;
    }

}
