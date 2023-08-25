package com.traveler.travelapp.loginRequest;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor 
public class LoginRequest {
    private String userName;
    private String password;

}
