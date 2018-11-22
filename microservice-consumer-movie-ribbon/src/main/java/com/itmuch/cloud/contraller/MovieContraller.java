package com.itmuch.cloud.contraller;

import com.itmuch.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieContraller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/simple/user")
    public User gerUser(){
        User user = restTemplate.getForObject("https://idasc.test.webank.com/api/oauth2/access_token?app_id=xxx&secret=xxx&grant_type=client_credential&version=1.0.0", User.class);
        return  user;
    }

}
