package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//http://localhost:8080/users/users
@RestController
@RequestMapping(value="/users")
public class UserController {
    
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //create new login request entity
    // @PostMapping("/login")
    // User getUserByUserNamePassword(@RequestBody User user){
    // }
    
    @GetMapping("/users")
    List<User> users(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
