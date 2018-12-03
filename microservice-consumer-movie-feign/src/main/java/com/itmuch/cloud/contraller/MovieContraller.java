package com.itmuch.cloud.contraller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieContraller {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        System.out.println("hello word");
        return  this.userFeignClient.findById(id);
    }

    @GetMapping("/user")
    public User test(User user){
        System.out.println("hello word");
        return  this.userFeignClient.postUser(user);
    }

    @GetMapping("/user_test")
    public User userTest(User user){
        System.out.println("hello word_test");
        return  this.userFeignClient.testUser(user);
    }
}
