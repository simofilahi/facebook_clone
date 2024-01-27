package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service()
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id).or(null);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
