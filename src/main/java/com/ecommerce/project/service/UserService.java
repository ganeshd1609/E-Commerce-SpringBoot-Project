package com.ecommerce.project.service;

import com.ecommerce.project.model.User;
import com.ecommerce.project.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
