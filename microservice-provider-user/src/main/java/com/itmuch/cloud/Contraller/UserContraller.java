package com.itmuch.cloud.Contraller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.respostity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContraller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {

//        User user1 = userRepository.getOne(id);
        User user=new User();
        return user;



    }
}
