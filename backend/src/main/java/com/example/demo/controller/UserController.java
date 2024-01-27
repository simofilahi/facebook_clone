package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("users/register")
    public User register(@RequestBody User user){
       return  userService.register(user);
    }

    @GetMapping("users/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
