package com.itmuch.cloud.Contraller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.respostity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserContraller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id,HttpServletRequest request) {
//        User user1 = userRepository.getOne(id);
        String localName = request.getLocalName();//获取服务器IP
        int serverPort = request.getServerPort();//获取服务器端口
        System.out.println(localName+serverPort);
        User user=new User();
        System.out.print("432434");
        return user;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        System.out.println("43434bh");
        return  user;
    }

    @PostMapping("/testuser")
    public User testUser(@RequestBody User user) {
        System.out.println("43434bh");
        return  user;
    }

}
