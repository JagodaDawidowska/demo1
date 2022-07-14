package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private UserRepo userRepo;

    @Autowired
    public Start(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        User user1 = new User(1,"Jagoda","Daw","dev");
        userRepo.save(user1);
    }


}
