package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/findAll")
    public Iterable<User> findAll() {
        return userService.findAll();
    }
}
