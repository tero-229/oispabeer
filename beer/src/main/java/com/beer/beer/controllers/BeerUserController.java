package com.beer.beer.controllers;

import com.beer.beer.Entities.BeerUser;
import com.beer.beer.repositories.BeerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BeerUserController {
    @Autowired
    BeerUserRepository userRepository;

    @GetMapping("")
    List<BeerUser> getAllUsers() {
        return (List<BeerUser>) userRepository.findAll();
    }

   /* @GetMapping("/{username}")
    User getUser(@PathVariable String username) {
        return getUser(username);
    }*/

    @PostMapping("/register/{username}")
    BeerUser addUser(@RequestBody BeerUser user) {
        userRepository.save(user);
        return user;

    }


}
