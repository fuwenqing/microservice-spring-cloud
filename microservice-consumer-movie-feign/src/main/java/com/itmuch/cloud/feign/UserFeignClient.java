package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import netscape.security.UserTarget;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
   @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User postUser(User user);
}
