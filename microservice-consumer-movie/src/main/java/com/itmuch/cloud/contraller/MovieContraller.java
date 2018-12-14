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
        User user = restTemplate.getForObject("http://localhost:7900/simple/"+id, User.class);
        return  user;
    }

    @GetMapping("/test/{id}")
    public User User(@PathVariable Long id){
        System.out.print("46456456");
        User user = restTemplate.getForObject("http://microservice-provider-user/simple/"+id, User.class);
        return  user;
    }


    @GetMapping("/hh")
    public String User(){
        System.out.print("6565");
        String user = restTemplate.getForObject("https://idasc.webank.com/api/oauth2/access_token?app_id=xxx&secret=xxx&grant_type=client_credential&version=1.0.0", String.class);
        return  user;
    }
}
