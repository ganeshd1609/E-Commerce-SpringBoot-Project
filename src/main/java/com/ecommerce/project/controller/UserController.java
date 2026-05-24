package com.ecommerce.project.controller;


import com.ecommerce.project.model.User;
import com.ecommerce.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user ){

        return userService.registerUser(user);

    }

    @PostMapping("/login")
    public User loginuser(@RequestBody User user){


        return userService.loginUser(user.getEmail(),user.getPassword());
    }


    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
