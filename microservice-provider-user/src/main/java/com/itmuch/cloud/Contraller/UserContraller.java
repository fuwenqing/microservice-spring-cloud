package com.itmuch.cloud.Contraller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.respostity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserContraller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {

//        User user1 = userRepository.getOne(id);
        User user=new User();
        System.out.print("432434");
        return user;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        System.out.println("43434bh");
        return  user;
    }

}
