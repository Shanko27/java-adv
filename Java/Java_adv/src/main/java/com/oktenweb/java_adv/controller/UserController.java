package com.oktenweb.java_adv.controller;


import com.oktenweb.java_adv.entity.User;
import com.oktenweb.java_adv.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController  {

    @Autowired
    private IUserService userService;

    @PostMapping
    public String registerUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
