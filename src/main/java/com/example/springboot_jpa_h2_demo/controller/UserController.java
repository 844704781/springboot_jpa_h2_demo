package com.example.springboot_jpa_h2_demo.controller;

import com.example.springboot_jpa_h2_demo.entity.User;
import com.example.springboot_jpa_h2_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findOne")
    public User findOne() {
        User user = new User();
        user.setId(1);
        return userService.findOne(user);
    }
}
