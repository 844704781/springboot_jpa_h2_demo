package com.example.springboot_jpa_h2_demo.service;

import com.example.springboot_jpa_h2_demo.dao.UserDao;
import com.example.springboot_jpa_h2_demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findOne(User user) {
       Optional<User>optional =userDao.findById(user.getId());
       return optional.get();
    }
}
