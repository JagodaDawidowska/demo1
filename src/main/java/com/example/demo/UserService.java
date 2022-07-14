package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService( UserRepo userRepo) {

        this.userRepo = userRepo;
    }

    Iterable<User> findAll(){
        return userRepo.findAll();
    }


}
