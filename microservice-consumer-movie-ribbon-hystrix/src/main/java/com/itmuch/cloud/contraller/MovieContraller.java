package com.itmuch.cloud.contraller;

import com.itmuch.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieContraller {

    @Autowired
    private RestTemplate restTemplate;
    /*@Autowired
    private LoadBalancerClient  loadBalancerClient;*/

    @GetMapping("/simple/{id}")
    public User gerUser(@PathVariable Long id){
        System.out.print("erwte");
        User user = restTemplate.getForObject("http://microservice-provider-user/simple/"+id, User.class);
        return  user;
    }

   /* @GetMapping("/test")
    public String test(){
        ServiceInstance choose = loadBalancerClient.choose("microservice-provider-user");
        System.out.println("user"+choose.getHost()+choose.getPort());

        ServiceInstance choose2 = loadBalancerClient.choose("microservice-provider-user2");
        System.out.println("user2"+choose2.getHost()+choose2.getPort());
        return  "hello word";
    }*/

}
