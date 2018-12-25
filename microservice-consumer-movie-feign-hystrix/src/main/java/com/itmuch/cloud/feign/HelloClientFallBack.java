package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallBack implements UserFeignClient {

    @Override
    public User findById(Long id) {
        System.out.println("34434");
        return new User();
    }

    @Override
    public User postUser(User user) {
        return null;
    }

    @Override
    public User testUser(User user) {
        return null;
    }
}