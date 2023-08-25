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


//http://localhost:8080/users/users
@RestController
@AllArgsConstructor
@RequestMapping(value="/users")
public class UserController {
    
    private final UserService userService;
    //Will change the return types to response entites at some point 
    @PostMapping("/login")
    ResponseEntity<User> getUserByUserNamePassword(@RequestBody LoginRequest loginRequest){
        return userService.findUserByUserName(loginRequest);
    }
    
    @GetMapping("/users")
    ResponseEntity<List<User>> users(){
        return userService.findAllUsers();
    }

    @PostMapping("/users")
    ResponseEntity<User> newUser(@RequestBody User user){
        return userService.CreateNewUser(user);
    }

}
