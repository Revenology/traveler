package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    @GetMapping("/users")
    List<User> users(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
