package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traveler.travelapp.loginRequest.LoginRequest;


//http://localhost:8080/users/users
@RestController
@RequestMapping(value="/users")
public class UserController {
    
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Will change the return types to response entites at some point 
    @PostMapping("/login")
    User getUserByUserNamePassword(@RequestBody LoginRequest loginRequest){
        User user = userRepository.findUserByUserName(loginRequest.getUserName());
        //validate password matches
        return user;
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
