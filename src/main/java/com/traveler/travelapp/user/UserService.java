package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.traveler.travelapp.loginRequest.LoginRequest;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Service
@AllArgsConstructor
@Log
public class UserService {
    
    UserRepository userRepository;
    BCryptPasswordEncoder encoder;

    ResponseEntity<User> findUserByUserName(LoginRequest loginRequest){
        User user = userRepository.findUserByUserName(loginRequest.getUserName());
        if(user == null){
            log.warning("Wrong password");
            return new ResponseEntity<User>(new User(), HttpStatus.UNAUTHORIZED);
        }
        boolean passwordMatches = encoder.matches(loginRequest.getPassword(), user.getPassword());
        if(passwordMatches){
            log.info("user " + user.getUserName() + " has logged in");
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        //I think this is an error?
        else return new ResponseEntity<User>(new User(), HttpStatus.UNAUTHORIZED);
    }

    ResponseEntity<List<User>> findAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    ResponseEntity<User> CreateNewUser(User user){
        String encryptedPassword = encoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
    }
}
