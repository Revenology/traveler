package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traveler.travelapp.loginRequest.LoginRequest;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


//http://localhost:8080/users/users
@RestController
@AllArgsConstructor
@RequestMapping(value="/users")
public class UserController {
    
    private final UserService userService;
    //Will change the return types to response entities at some point 
    @PostMapping("/login")
    public Mono<User> getUserByUserNamePassword(@RequestBody LoginRequest loginRequest){
        return userService.findUserByUserName(loginRequest);
    }
    
    @GetMapping("/users")
    public Flux<User> users(){
        return userService.findAllUsers();
    }

    @PostMapping("/users")
    public Mono<User> newUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
