package com.traveler.travelapp.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.UnauthenticatedException;
import com.google.cloud.storage.Acl.Entity;
import com.traveler.travelapp.loginRequest.LoginRequest;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class UserService {
    
    UserRepository userRepository;
    BCryptPasswordEncoder encoder;

    public Mono<User> findUserByUserName(LoginRequest loginRequest){
        Mono<User> userMono = userRepository.findUserByUserName(loginRequest.getUserName());
        return userMono.flatMap(user -> {
        	 boolean passwordMatches = encoder.matches(loginRequest.getPassword(), user.getPassword());
        	 if (passwordMatches) {
        		 return Mono.just(user);
        	 } else {
        		 return Mono.error(new RuntimeException("Password does not match"));
        	 }
        	 
        });
    }
    
    public Mono<User> getUserById(Long id) {
    	return userRepository.findById(id);
    }
    

    public Flux<User> findAllUsers(){
        return userRepository.findAll();
    }
    
    public Mono<User> createUser(User user) {
    	String encryptedPassword = encoder.encode(user.getPassword());
    	user.setPassword(encryptedPassword);
    	return userRepository.save(user);
    }   
    
}
