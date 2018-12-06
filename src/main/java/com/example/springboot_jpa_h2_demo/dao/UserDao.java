package com.example.springboot_jpa_h2_demo.dao;

import com.example.springboot_jpa_h2_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
