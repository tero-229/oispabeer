package com.beer.beer.controllers;

import com.beer.beer.Entities.Beer;
import com.beer.beer.Entities.User;
import com.beer.beer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

   /* @GetMapping("/{username}")
    User getUser(@PathVariable String username) {
        return getUser(username);
    }*/

    @PostMapping("/register/{username}")
    User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;

    }


}
