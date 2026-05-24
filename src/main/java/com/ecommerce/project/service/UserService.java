package com.ecommerce.project.service;

import com.ecommerce.project.model.User;
import com.ecommerce.project.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        //check if user is there or not

        User user= userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password) ){
            return user;
        }
        return null;//invalid credentials

    }


    @GetMapping("/getAll")
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}
